package collectDataActivites;

import database.DbHelper;
import surveyCodes.BasicAttributes;
import utilites.QuestionConstants;
import utilites.StationNumberHelper;

import java.sql.Connection;
import java.util.Scanner;

/**
 * This class handles all collecting and inserting for the Basic Common Attributes. For now will try and keep this class
 * and its method a more static helper to be called with every survey code collection and insert since they all share
 * these 'Common-Basic Attributes'
 */
public class BasicAttributeDataCollect {

    /**
     * @param scanner Receives an active scanner for capturing keyboard input.
     *
     * This method, performs all collection and inserts into the database for the BasicAtttibutes Class.
     */
    public static void collectBasicAtts(Scanner scanner){

        //Scanner sc = new Scanner(System.in);

        System.out.print(QuestionConstants.STATION_ASKER);
        // Using this to collect the string Station number prior to converting and inserting
        String dummyStationNumber = scanner.nextLine().toUpperCase();
        // Converting to a String Array for use with other StationNumberHelper class methods.
        String [] stationToConver = StationNumberHelper.convertStation(dummyStationNumber);
        // Extracting the integer value from the passed in String Array. This value will be inserted into the DB
        int mWholeStationNum = StationNumberHelper.stationWholeNum(stationToConver);
        // Extracting the double value from the passed in String Array. This value will be inserted into the DB
        double mOffsetStationNum = StationNumberHelper.decStationNum(stationToConver);
        System.out.print(QuestionConstants.GPS_SHOT_ASKER);
        int mGpsShot = scanner.nextInt();
        System.out.print(QuestionConstants.EXIST_GPS_SHOT_ASKER);
        int mExistingGradeGps = scanner.nextInt();
        System.out.print(QuestionConstants.COVER_ASKER);
        double mCover = scanner.nextDouble();
        System.out.print(QuestionConstants.NOTES_ASKER);
        String mNotes = scanner.nextLine().toUpperCase();

        DbHelper dbHelper = new DbHelper();
        BasicAttributes mBasicAttributes = new BasicAttributes();
        mBasicAttributes.setWholeStationNum(mWholeStationNum);
        mBasicAttributes.setOffsetStationNum(mOffsetStationNum);
        mBasicAttributes.setGpsShot(mGpsShot);
        mBasicAttributes.setExistGradeShot(mExistingGradeGps);
        mBasicAttributes.setCover(mCover);
        mBasicAttributes.setNotes(mNotes);
        Connection connection = dbHelper.createConnection();
        dbHelper.insertBasicAttributes(connection, mBasicAttributes);
    }
}
