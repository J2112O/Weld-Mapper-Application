package utilites;

/**
  *
 * This class is a helper class for dealing and using the linear referencing station number.
 */

public class StationNumberHelper {

    /**
     * @param valueToConvert is the passed in String that needs to be parsed. This String will contain
     *                       a '+' character that is a value separator of a Linear Reference/Engineering
     *                       Station number. ie: 23489+76.3
     * @return a String array with 2 values, the whole number before the '+' character and decimal
     * number after the '+' character
     * This method splits a String that was captured for a Linear Reference/Engineering Station
     * number that contains a '+' character. The intended goal is to separate the whole number
     * located prior to the '+' character and the decimal value after the '+' character and place
     * both values into a String Array for further processing.
     */
    public static String[] convertStation(String valueToConvert) {
        return valueToConvert.split("\\+");
    }

    /**
     * @param wholeStation takes a String Array and parses the integer value that is contained in
     *                     the array located in the 0th position.
     * @return returns a whole integer number that is found at the 0th position of the passed in
     * String Array
     * This method parses a passed in String Array and assigns the integer value located just prior
     * to the '+' character to an int that can be used to store this value in the database.
     */
    public static int stationWholeNum(String[] wholeStation){
        int stationValueNum;
        return stationValueNum = Integer.parseInt(wholeStation[0]);
    }

    /**
     * @param wholeStation takes a String Array and parses the decimal value that is contained in
     *                     the array located in the 1th position.
     * @return returns a decimal number that is found at the 1th position of the passed in
     * String Array
     * This method parses a passed in String Array and assigns the decimal value located just after
     * the '+' character to an double that can be used to store this value in the database.
     */
    public static double decStationNum(String[] wholeStation){
        double stationDecValue;
        return stationDecValue = Double.parseDouble(wholeStation[1]);
    }
}
