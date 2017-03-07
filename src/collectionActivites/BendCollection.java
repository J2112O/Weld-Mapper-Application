package collectionActivites;

/**
 * This class takes care of the client side collection and insertion for a Bend. (Sag, Overbend, PI (left or right))
 */
import database.DbHelper;
import surveyCodes.Bend;

import java.sql.*;
import java.util.Scanner;

public class BendCollection {

    public static void collectBend(){
        String dummyStationNumber; // Using this to collect the string Station number prior to converting
        int mWholeStationNum;
        double mOffsetStationNum;
        int mGpsShot;
        int mExistingGradeGps;
        double mCover;
        String mNotes;
        String mBendType;
        String mBendKind;
        String mBendDir;
        double mDegree;
        DbHelper dbHelper = new DbHelper();
        Bend mBend = new Bend();
        Scanner sc = new Scanner(System.in);

    }
}
