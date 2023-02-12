
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character,Integer> charactersCount = new HashMap<Character, Integer>();
        for(int i = 0; i < str.length(); i++){
            Character currentChar = str.charAt(i);
            if(charactersCount.containsKey(currentChar)){
                charactersCount.put(currentChar, charactersCount.get(currentChar)+1);
            } else {
                charactersCount.put(currentChar, 1);
            }
        }


        //return ;
    }
}
