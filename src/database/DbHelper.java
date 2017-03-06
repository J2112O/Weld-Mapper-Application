package database;
import java.sql.*;
/**
 * This class takes care of all database functionality.
 */
public class DbHelper {

    // Table creation here with these variables.
    private static final String CREATE_BASIC_ATS_TABLE = "CREATE TABLE IF NOT EXISTS " +DBCons.BASIC_ATS_TABLE+
            " ("+DBCons.UID_BASIC_ATS+ "SERIAL INTEGER PRIMARY KEY NOT NULL, " +DBCons.GPS_SHOT+ "INTEGER NOT NULL, "
            +DBCons.EXISTING_GRADE_GPS+ "INTEGER NOT NULL, " +DBCons.COVER+ "REAL NOT NULL, " +DBCons.NOTES+
            "VARCHAR(25) DEFAULT 'N/A');";

    private static final String CREATE_BEND_TABLE = "CREATE TABLE IF NOT EXISTS " +DBCons.BEND_TABLE+ " ("+DBCons.UID_BEND+
            "SERIAL INTEGER PRIMARY KEY NOT NULL REFERENCES "+DBCons.BASIC_ATS_TABLE+"("+DBCons.UID_BASIC_ATS+"), " +
            DBCons.BEND_TYPE+ "VARCHAR(25) NOT NULL, "+DBCons.BEND_KIND+ "VARCHAR(25) NOT NULL, "+DBCons.BEND_DIR+
            "VARCHAR(25) NOT NULL, "+DBCons.DEGREE+ "REAL NOT NULL);";

    private static final String CREATE_CMBO_BEND_TABLE = "CREATE TABLE IF NOT EXISTS " +DBCons.CMBO_BEND_TABLE+ " ("+
            DBCons.UID_CMBO_BEND+ "SERIAL PRIMARY KEY NOT NULL REFERENCES " +DBCons.BEND_TABLE+"("+DBCons.UID_BEND+"), "+
            DBCons.DIR_TWO+ "REAL NOT NULL, " + DBCons.DEGREE_TWO+ "REAL NOT NULL);";

    private static final String CREATE_WELD_TABLE = "CREATE TABLE IF NOT EXISTS " +DBCons.WELD_TABLE+ " ("+DBCons.UID_WELD+
            "SERIAL PRIMARY KEY NOT NULL REFERENCES "+DBCons.BASIC_ATS_TABLE+"("+DBCons.UID_BASIC_ATS+"), " +DBCons.WELD_TYPE+
            "VARCHAR(25) NOT NULL, " +DBCons.WELD_ID+ "VARCHAR(25) NOT NULL, " +DBCons.UP_JT+ "VARCHAR(25) NOT NULL, "+
            DBCons.DOWNSTREAM_JT+ "VARCHAR(25) NOT NULL, " +DBCons.HEAT+ "VARCHAR(25) NOT NULL, " +DBCons.LENGTH_AH+
            "REAL NOT NULL, " + DBCons.WALL_CH+ "VARCHAR(10), " +DBCons.PIPE_LOC+ "VARCHAR(25), " +DBCons.WALL_THICK+
            "REAL DEFAULT 0.000, " +DBCons.WELDER_INITS+ "VARCHAR(25) DEFAULT N/A);";

    // Insert operations here for the various attributes

    private static final String INSERT_BASIC_ATTS = "INSERT INTO " +DBCons.BASIC_ATS_TABLE+ " ("+ DBCons.GPS_SHOT+","
            +DBCons.EXISTING_GRADE_GPS+","+DBCons.COVER+","; //todo Incomplete for now. needs to be changed and completed.

    /**
     * @return a usable connection to the current database for use with other operations. ie: insert, update etc.
     * This method creates a connection to a database and returns usable connection for reuse should it connect
     * successfully.
     */
    private Connection createConnection(){
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb",
                    "postgres", "123" );
        } catch (ClassNotFoundException |SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Connected Successfully.");
        return connection;
    }

    /**
     * @param connection Requires a live and connected connection variable to be passed in for use with create table
     *                   operations.
     * @return true if all tables are created successfully. Otherwise false if not.
     */
    private boolean createTables(Connection connection){
        //Connection connectionToUse = connection;
        Statement basicAttributesStatement = null;
        Statement bendTableStatement = null;
        Statement cmboBendTableStatement = null;
        Statement weldTableStatement = null;
        try {
            basicAttributesStatement = connection.createStatement();
            bendTableStatement = connection.createStatement();
            cmboBendTableStatement = connection.createStatement();
            weldTableStatement = connection.createStatement();

            basicAttributesStatement.executeUpdate(CREATE_BASIC_ATS_TABLE);
            bendTableStatement.executeUpdate(CREATE_BEND_TABLE);
            cmboBendTableStatement.executeUpdate(CREATE_CMBO_BEND_TABLE);
            weldTableStatement.executeUpdate(CREATE_WELD_TABLE);

            basicAttributesStatement.closeOnCompletion();// trying this for now. There is a .close() method as well.
            bendTableStatement.closeOnCompletion();
            cmboBendTableStatement.closeOnCompletion();
            weldTableStatement.closeOnCompletion();
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
            return false;
        }
        System.out.println("All Tables Created Successfully.");
        return true;
    }
}
