package rocks.zipcode.io.fundamentals;


public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            sb.append(c);
        }

        String outStr = sb.toString();
        return outStr;
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        StringBuilder sb = new StringBuilder();

        for (Character c : chars) {
            sb.append(c);
        }

        String outStr = sb.toString();
        return outStr;
    }


    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        return string.replaceAll("[AEIOUaeiou]", "");
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
    return string.replaceAll(charactersToRemove, "");

    }
}
