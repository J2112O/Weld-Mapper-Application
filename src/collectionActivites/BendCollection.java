package collectionActivites;

/**
 * This class takes care of the client side collection and insertion for a Bend. (Sag, Overbend, PI (left or right))
 */
import database.DbHelper;
import surveyCodes.Bend;
import utilites.QuestionConstants;
import java.sql.*;
import java.util.Scanner;

public class BendCollection {

    private static final String TAG = "BendCollection.class";
    public void bendCollectionClassLogMethod() {
        System.out.println(TAG);
    }


    /**
     * @throws ClassNotFoundException
     * This method collects and writes to the database all attributes for collecting a Survey Bend.
     * Note: Calls and makes use of the Static class and method collectBasicAtts(), which receives the usable scanner.
     */
    public static void collectBend() throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.print(QuestionConstants.BEND_DIR_ASKER);
        String mBendDir = sc.nextLine().toUpperCase();
        System.out.print(QuestionConstants.BEND_TYPE_ASKER);
        String mBendType = sc.nextLine().toUpperCase();
        System.out.print(QuestionConstants.DEGREE_ASKER);
        double mDegree = sc.nextDouble();

        DbHelper dbHelper = new DbHelper();
        Bend mBend = new Bend();

        mBend.setBendDirection(mBendDir);
        mBend.setBendType(mBendType);
        mBend.setDegree(mDegree);
        Connection mConnection = dbHelper.createConnection();
        dbHelper.createTables(mConnection);
        BasicAttributeCollection.collectBasicAtts(sc);
        dbHelper.insertBend(mConnection, mBend);
    }
}
