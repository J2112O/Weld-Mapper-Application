package database;

/**
 * This class takes care of all database functionality
 */
public class DbHelper {

    private static final String CREATE_BASIC_ATS_TABLE = "CREATE TABLE IF NOT EXISTS " +DBCons.BASIC_ATS_TABLE+
            " ("+DBCons.UID_BASIC_ATS+ "SERIAL INTEGER PRIMARY KEY NOT NULL, " +DBCons.GPS_SHOT+ "INTEGER NOT NULL, "
            +DBCons.EXISTING_GRADE_GPS+ "INTEGER NOT NULL, " +DBCons.COVER+ "REAL NOT NULL, " +DBCons.NOTES+
            "VARCHAR(25) DEFAULT 'N/A');";

    private static final String CREATE_BEND_TABLE = "CREATE TABLE IF NOT EXISTS " +DBCons.BEND_TABLE+ " ("+DBCons.UID_BEND+
            "SERIAL INTEGER PRIMARY KEY NOT NULL REFERENCES "+DBCons.BASIC_ATS_TABLE+"("+DBCons.UID_BASIC_ATS+"), " +
            DBCons.BEND_TYPE+ "VARCHAR(25) NOT NULL, "+DBCons.BEND_KIND+ "VARCHAR(25) NOT NULL, "+DBCons.BEND_DIR+
            "VARCHAR(25) NOT NULL, "+DBCons.DEGREE+ "REAL NOT NULL);";
}
