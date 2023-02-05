
public class IsThereSum {
    /**
     * Check if there exist two numbers in an array add up to some other number.
     * You will likely need a for loop nested inside of another for loop for this problem - each for loop checking
     * sums of two different indexes of arr.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean check(int[] arr, int target){
        int match = 0;
        boolean checkMatch = false;
        for(int num1 = 0; num1 < arr.length; num1++){
            for(int num2 = 0; num2 < arr.length-1; num2++){
                match = arr[num1] + arr[num2];
                if(match == target ){
                    checkMatch = true;
                }
                }
            }
            return checkMatch;
        }


    }