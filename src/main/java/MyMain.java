import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        //checking to see if list is empty or has 1, base if loops
        return isSortedRec(list, 0);
        // YOUR CODE HERE
        //return false;
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        // YOUR CODE HERE
        if (list.size() == 1) {
            return true;
        }
        if (i == list.size() - 1) {
            return true;
        }
        if (list.get(i) > list.get(i + 1)) {
            return false;
        }

        return isSortedRec(list, i + 1);
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        // YOUR CODE HERE
        //unable to make this work with the other method
        return hasCountCopiesRec(arr, x, count, 0);
        //return true;
    }

    // This recursive method checks if the array contains exactly
    // count copies of theinteger x
    public static int[] hasCountCopiesRec(int[] arr, int x, int count, int i) {
        //able to sort of count them, but storing counted value is harder to do recursively
        // YOUR CODE HERE
        if (i == arr.length) { 
            int[] ans = new int[0]; 
            return ans; 
        } 
  
       
        int[] numbersmall = hasCountCopiesRec(arr, x, count, i + 1); 
  
        
        if (arr[i] == x) { 
            int[] newnew = new int[numbersmall.length + 1]; 
  
             
            newnew[0] = i; 
            for (int p = 0; p < numbersmall.length; p++) { 
                newnew[p + 1] = numbersmall[p]; 
            } 
            return newnew; 
        } 

        else { 
            return numbersmall; 
        } 
        //return true;
    }




    // Wrapper method
    public static boolean binarySearchRec(int[] arr, int num) {
        // YOUR CODE HERE
        return binarySearchRec(arr, num, 0, 0);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        // YOUR CODE HERE
        if (upperBound >= lowerBound && lowerBound<arr.length-1) { 
           
            int center = lowerBound + (upperBound - lowerBound) / 2;
            //if the number is the center return true
            if (arr[center] == num) {
                return true;
            }
 
            //returning recursively
            if (arr[center] > num) {
                return binarySearchRec(arr, lowerBound, center - 1, num);
            }

            return binarySearchRec(arr, center + 1, upperBound, num);
        }
        return false;
    }

    public static void main(String[] args) {      
        ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            list.add(5);
            list.add(1);  

        System.out.println(isSorted(list));
        // You can test your code here
    }
}
