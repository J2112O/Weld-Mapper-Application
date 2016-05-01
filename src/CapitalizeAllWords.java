/*
 * This class capitalizes all words to upper-case for clarity and
 * uniformity. 
 */

public class CapitalizeAllWords {
    public static String upperCaseAllFirstLetters(String value) {
        char[] array = value.toCharArray();
        // Upper case the first letter
        array[0] = Character.toUpperCase(array[0]);

        // upper-case all letters that follow a whitespace character
        for (int i = 1; i < array.length; i++) {
            if (Character.isWhitespace(array[i - 1])) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        return new String(array);
    }

}
