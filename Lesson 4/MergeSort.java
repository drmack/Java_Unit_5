import java.util.Arrays;

public class MergeSort extends ConsoleProgram
{
    public void run()
    {
        int[] array1 = {5, 3, 4, 1, 6, 2};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};
        
        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        // System.out.print("Second array: ");
        // System.out.println(Arrays.toString(array2));
        System.out.println();

        // sort first array
        mergeSort(array1);
        // sort second array
        // mergeSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        // System.out.print("Second array sorted: ");
        // System.out.println(Arrays.toString(array2));
    }
    
    /*
     * Merge sort takes in an array and returns the same array, sorted.
     */
    public void mergeSort(int[] arr) 
    {
        int[] temp = new int[arr.length];
        mergeSortHelper(arr, 0, arr.length - 1, temp);
    }
    
    private void mergeSortHelper(int[] arr, int from, int to, int[] temp)
    {
        // If the array length is greater than 1
        if(to - from >= 1)
        {
            int mid = (from + to) / 2;
            mergeSortHelper(arr, from, mid, temp);
            mergeSortHelper(arr, mid + 1, to, temp);
            merge(arr, from, mid, to, temp);
            System.out.println(Arrays.toString(arr));
        }
    }
    
    private void merge(int[] arr, int from, int mid, int to, int[] temp) 
    {
        int i = from;       // track left array position
        int j = mid + 1;    // track right array position
        int k = from;       // track temp position
        
        while(i <= mid && j <= to)
        {
            // If the element in the left subarray is less
            // than the element in the right subarray it 
            // is next in the merged list
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        
        // We may have missed elements from either list
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        
        while(j <= to)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        
        // Copy over from temp to elements
        for(k = from; k <= to; k++)
        {
            arr[k] = temp[k];
        }

    }
}
