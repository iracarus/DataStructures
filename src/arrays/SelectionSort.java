package arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for(int outer=array.length-1; outer>0; outer--)
        {
            int largestElementIndex = 0;
            for(int i=1; i<=outer; i++)
            {
                if(array[largestElementIndex] < array[i] )
                    largestElementIndex = i;
            }

            int temp = array[largestElementIndex];
            array[largestElementIndex] = array[outer];
            array[outer] = temp;
        }
        for(int x=0; x < array.length; x++)
            System.out.println(array[x]);

    }
}
