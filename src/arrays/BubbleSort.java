package arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 17, -15, 4, 23, -1};

        int partitionedIndex = array.length;

        for(int x = partitionedIndex; x>0; x-- ) {
            for (int i = 0; i < partitionedIndex - 1; i++) {
                int temp;
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            partitionedIndex--;
        }

        for(int i=0; i< array.length; i++)
            System.out.println(array[i]);
    }
}
