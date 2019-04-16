package rocks.zipcode.io.fundamentals;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        // get length of string
        // get range of length
        // get power-set of range

        // for every set in power-set
        // uppercase indices of string using set
        return null;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        StringBuilder sb = new StringBuilder(string);

        for(Integer integer : indices) {
            sb.setCharAt(integer, Character.toUpperCase(sb.charAt(integer)));
        }

        return sb.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {

        String[] strArr = stringToBeManipulated.split("");
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < strArr.length + 1; i++) {
            if (i < index) {
                stringList.add(strArr[i]);
            } else if (i == index) {
                stringList.add(valueToBeInserted);
            } else if (i > index) {
                stringList.add(strArr[i - 1]);
            }

        }
        StringBuilder sb = new StringBuilder();
        for (String s : stringList) {
            sb.append(s);
        }
        String output = sb.toString();

        return output;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuilder sb = new StringBuilder(stringToBeManipulated);
        sb.setCharAt(index, replacementValue);

        return sb.toString();
    }
}