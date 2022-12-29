package com.epam.mjc.stage0;



/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] season = {"Winter", "Spring", "Summer", "Autumn"};

        return season;
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] consecutiveNumbers = new int[length];
        for (int num = 0; num < consecutiveNumbers.length; num++) {
            consecutiveNumbers[num] = num + 1;
        }

        return consecutiveNumbers;

    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int number = 0; number < arr.length; number++) {
            sum = sum + arr[number];
        }
        System.out.println(sum);
        return sum;

    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int indexOf = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == number) {
                indexOf = index;
                break;
            } else {
                indexOf = -1;
            }
        }
        return indexOf;

    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] newStringArr = new String[arr.length];
        for (int newIndex = 0, lastIndex = arr.length - 1; newIndex < arr.length; newIndex++, lastIndex--) {
            newStringArr[newIndex] = arr[lastIndex];

        }

        return newStringArr;

    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int positiveNumber = 0;
        int[] newArr = new int[0];
        for (int sourceNumIndex = 0; sourceNumIndex < arr.length; sourceNumIndex++) {

            if (arr[sourceNumIndex] > 0) {
                positiveNumber++;
            }
        }
        int[] newArrPos = new int[positiveNumber];
        int newArrIndex = 0;

        for (int onlyPositiveNumberArray = 0; onlyPositiveNumberArray < arr.length; onlyPositiveNumberArray++) {

            if (arr[onlyPositiveNumberArray] <= 0) {
                continue;
            }
            newArrPos[newArrIndex] = arr[onlyPositiveNumberArray];
            newArrIndex++;
        }
        newArr = newArrPos;

        return newArr;

    }
    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int[][] newArrTOSort = arr;
        int[][] newArr = new int[0][0];
        int temp2 = 0;
        int temp[] = new int[0];

        for (int index = 0; index < newArrTOSort.length; index++) {
            for (int secondIndex = index + 1; secondIndex < newArrTOSort.length; secondIndex++) {
                if (newArrTOSort[index].length > newArrTOSort[secondIndex].length) {
                    temp = newArrTOSort[index];
                    newArrTOSort[index] = newArrTOSort[secondIndex];
                    newArrTOSort[secondIndex] = temp;
                }
            }
        }
        for (int firstArr = 0; firstArr < newArrTOSort.length; firstArr++) {

            for (int index = 0; index < newArrTOSort[firstArr].length; index++) {

                for (int secondIndex = index + 1; secondIndex < newArrTOSort[firstArr].length; secondIndex++) {

                    if (newArrTOSort[firstArr][index] > newArrTOSort[firstArr][secondIndex]) {
                        temp2 = newArrTOSort[firstArr][index];
                        newArrTOSort[firstArr][index] = newArrTOSort[firstArr][secondIndex];
                        newArrTOSort[firstArr][secondIndex] = temp2;
                    }
                }
            }
        }
        newArr = newArrTOSort;
        return newArr;
    }
}
