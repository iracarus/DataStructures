package arrays;

import org.testng.annotations.Test;

public class InsertionSort {
    // Insertion Sort theory
    // -- This is in-place algorithm
    // -- It has O(n2) Time Complexity i.e. it is Quadratic
    // -- Takes 100 steps to sort 10 items, and 10000 to sort 100 items
    // -- It is a stable algorithm

    @Test
    public void insertionSort()
    {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        for(int i =0; i<array.length-1; i++)
        {
            int unsortedTempIndex = i+1;
            //int newElement = array[firstUnsortedIndex];
            for(int j = i; j>=0; j--)
            {
                if(array[unsortedTempIndex] < array[j])
                {
                    int t = array[unsortedTempIndex] ;
                    array[unsortedTempIndex] = array[j];
                    array[j] = t;
                    unsortedTempIndex--;
                }
            }
        }

        for(int i: array)
        {
            System.out.println(i);
        }
    }


}
