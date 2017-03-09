package collectionActivites;

/**
 * This class takes care of the client side collection and insertion for a Bend. (Sag, Overbend, PI (left or right))
 */
import database.DbHelper;
import sun.rmi.runtime.Log;
import surveyCodes.Bend;
import utilites.QuestionConstants;
import utilites.StationNumberHelper;

import java.sql.*;
import java.util.Scanner;

public class BendCollection {

    private static final String TAG = "BendCollection.class";
    public void bendCollectionClassLogMethod() {
        System.out.println(TAG);
    }


    public static void collectBend() throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.print(QuestionConstants.STATION_ASKER);
        // Using this to collect the string Station number prior to converting and inserting
        String dummyStationNumber = sc.nextLine().toUpperCase();
        // Converting to a String Array for use with other StationNumberHelper class methods.
        String [] stationToConver = StationNumberHelper.convertStation(dummyStationNumber);
        // Extracting the integer value from the passed in String Array. This value will be inserted into the DB
        int mWholeStationNum = StationNumberHelper.stationWholeNum(stationToConver);
        // Extracting the double value from the passed in String Array. This value will be inserted into the DB
        double mOffsetStationNum = StationNumberHelper.decStationNum(stationToConver);
        System.out.print(QuestionConstants.GPS_SHOT_ASKER);
        int mGpsShot = sc.nextInt();
        System.out.print(QuestionConstants.EXIST_GPS_SHOT_ASKER);
        int mExistingGradeGps = sc.nextInt();
        System.out.print(QuestionConstants.COVER_ASKER);
        double mCover = sc.nextDouble();
        System.out.print(QuestionConstants.NOTES_ASKER);
        String mNotes = sc.nextLine().toUpperCase();
        System.out.print(QuestionConstants.BEND_DIR_ASKER);
        String mBendDir = sc.nextLine().toUpperCase();
        //String mBendKind;
        System.out.print(QuestionConstants.BEND_TYPE_ASKER);
        String mBendType = sc.nextLine().toUpperCase();
        System.out.print(QuestionConstants.DEGREE_ASKER);
        double mDegree = sc.nextDouble();

        DbHelper dbHelper = new DbHelper();
        Bend mBend = new Bend();

        mBend.setWholeStationNum(mWholeStationNum);
        mBend.setOffsetStationNum(mOffsetStationNum);
        mBend.setGpsShot(mGpsShot);
        mBend.setExistGradeShot(mExistingGradeGps);
        mBend.setCover(mCover);
        mBend.setNotes(mNotes);
        mBend.setBendDirection(mBendDir);
        mBend.setBendType(mBendType);
        mBend.setDegree(mDegree);
        Connection mConnection = dbHelper.createConnection();
        dbHelper.createTables(mConnection);
        dbHelper.insertBend(mConnection, mBend);
    }
}
