package database;

/*
This class holds all the static table, and column names for the database.
 */

public class DBCons {

    // Table names here
    public static final String BASIC_ATS_TABLE = "basic_attributes";
    public static final String WELD_TABLE = "weld_table";
    public static final String BEND_TABLE = "bend_table";
    public static final String CMBO_BEND_TABLE = "cmbo_bend_table";

    // Basic Attributes Table column names
    public static final String UID_BASIC_ATS = "id";
    public static final String WHOLE_STATION = "whole_station";
    public static final String OFFSET_STATION = "off_station";
    public static final String GPS_SHOT = "gps_shot";
    public static final String EXISTING_GRADE_GPS = "existing_grade";
    public static final String COVER = "cover";
    public static final String NOTES = "notes";

    // Weld Table column names
    public static final String UID_WELD = "id";
    public static final String WELD_TYPE = "weld_type";
    public static final String WELD_ID = "weld_id";
    public static final String UP_JT = "upstream_jt";
    public static final String DOWNSTREAM_JT = "downstream_jt";
    public static final String HEAT = "heat_ah";
    public static final String LENGTH_AH = "length_ah";
    public static final String WALL_CH = "wall_change";
    public static final String PIPE_LOC = "pipe_loc";
    public static final String WALL_THICK = "wall_thick";
    public static final String WELDER_INITS = "welder_inits";

    // Bend Table column names
    public static final String UID_BEND = "id";
    public static final String BEND_TYPE = "bend_type";
    public static final String BEND_KIND = "bend_kind";
    public static final String BEND_DIR = "bend_direction";
    public static final String DEGREE = "degree";

    //Combo Bend column names
    public static final String UID_CMBO_BEND = "id";
    public static final String DIR_TWO = "direction_2";
    public static final String DEGREE_TWO = "degree_2";
}
