import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,6,5,4,1};

        int maximum = arr[0];

        int index = 0;

        for (int i = 1; i < arr.length; i++){

            if (arr[ i ] > maximum) {

                maximum = arr[ i ];

                index = i;

            }

        }
        System.out.println("The index is: " + index);
        System.out.println("The sum of the array is " + sum());
        toPower(4, 2);
    }
    static int arr[] = { 1,5,6,5,4,1 };

    // method for sum of elements in an array
    static int sum()
    {
        int sum = 0; // initialize sum
        int i;

        // Iterate through elements and add to sum
        for (i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }

    public static Integer[] toPower(int size, int power) {
        ArrayList<Integer> outputArray = new ArrayList<>(size);

        double calcHold = 0.0;

        for (int loop = 0; loop < size; loop++) {
            calcHold = Math.pow(loop, power);
            outputArray.add((int) Math.round(calcHold));
        }
        System.out.println("toPower returns size raised by power " + outputArray);
        return outputArray.toArray(new Integer[0]);
    }
}

