/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        //int[] numbers = {23, 5, 3, 88, 123, 94, 3, 2, 7};
        int SIZE = 50;
        int[] numbers1 = new int[SIZE];
        int[] numbers2 = new int[SIZE];
        int[] numbers3 = new int[SIZE];
        int[] numbers4 = new int[SIZE];

        PopulateArrays(numbers1, numbers2, numbers3, numbers4);

        //Display(numbers);

        long start = System.currentTimeMillis(); //get current time
        BubbleSort(numbers1);
        long end = System.currentTimeMillis(); //get current time
        System.out.println("BubbleSort took " + (end-start) + "ms");

        start = System.currentTimeMillis(); //get current time
        SelectionSort(numbers2);
        end = System.currentTimeMillis(); //get current time

        start = System.currentTimeMillis(); //get current time
        MergeSort(numbers3);
        end = System.currentTimeMillis(); //get current time


        Quicksort(numbers4);

        //Display(numbers);
    }

    public static void Quicksort(int[] arr)
    {
        QuicksortHelper(arr, 0, arr.length-1);
    }

    public static void QuicksortHelper(int[] arr, int startIdx, int endIdx)
    {
        if(startIdx<endIdx)//we only need to do something if we have at least 2 elements in the current "slice"
        {
            int q = Partition(arr, startIdx, endIdx); //partition the current slice

            //recursively sort each "half"
            QuicksortHelper(arr, startIdx, q-1);
            QuicksortHelper(arr, q+1, endIdx);
        }
    }

    public static int Partition(int[] arr, int startIdx, int endIdx)
    {
        int pivot = arr[endIdx]; //the last element in the current slice
        int j = startIdx-1;

        for(int i = startIdx; i <endIdx; i++)
        {
            if(arr[i]<=pivot)
            {
                j++;
                //swap elements at position i and j
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        j++;
        //swap the elements at position j and last(for pivot)
        // int tmp2 = arr[j];
        // arr[j] = arr[endIdx];
        // arr[endIdx] = tmp2;
        arr[endIdx] = arr[j];
        arr[j] = pivot;

        return j;
    }

    public static void MergeSort(int[] arr)//running time O(n log n)
    {
        int[] tmp = new int[arr.length];
        MergeSortHelper(arr, 0, arr.length-1, tmp);
    }

    
    public static void MergeSortHelper(int[] arr, int startIdx, int endIdx, int[] tmp)
    {
        //divide and conquer approach
        if(startIdx<endIdx)//if the slice has at least 2 elements
        {
            int midIdx = (startIdx+endIdx)/2; //divide
            MergeSortHelper(arr, startIdx, midIdx, tmp); //conquer - sort the first half of the slice
            MergeSortHelper(arr, midIdx+1, endIdx, tmp); //conquer - sort the second half of the slice
            Merge(arr, startIdx, midIdx, endIdx, tmp);//combine - once these two slices are sorted, we merge tem
        }
    }

    public static void Merge(int[] arr, int startIdx, int midIdx, int endIdx, int[] tmp)
    {
      

        int i = startIdx;
        int j = midIdx+1;
        int k = startIdx;

        while(i<=midIdx && j <=endIdx)
        {
            if(arr[i]<=arr[j])
            {
                tmp[k] = arr[i];
                i++;
                k++;
            }
            else
            {
                tmp[k] = arr[j];
                j++;
                k++;
            }
        }

        //copy left overs
        while(i<=midIdx)
        {
            tmp[k] = arr[i];
            i++;
            k++;
        }


        while(j<=endIdx)
        {
            tmp[k] = arr[j];
            j++;
            k++;
        }

        //copy the values from the tmp array into the arr <-- only for slice we worked on
        for(k = startIdx; k<=endIdx;k++ )
        {
            arr[k] = tmp[k];
        }
    }





    // public static void MergeSort(int[] arr) //running time O(n log n)
    // {
    //     MergeSortHelper(arr, 0,arr.length-1);
    // }


    
    // public static void MergeSortHelper(int[] arr, int startIdx, int endIdx) //running time O(n log n)
    // {
    //     if(startIdx<endIdx)//if the slice has at least two elements
    //     {
    //         int midIdx = (startIdx + endIdx)/2; //find the middle of the slice
    //         MergeSortHelper(arr, startIdx, midIdx);//sort the first half of this slice
    //         MergeSortHelper(arr, midIdx+1, endIdx);//sort the second half of this slice
    //         Merge(arr, startIdx, midIdx, endIdx);//merge the two halves back into one slice
    //     }
    // }

    // public static void Merge(int[] arr, int startIdx, int midIdx, int endIdx)
    // {
    //     int[] tmp = new int[arr.length];
    //     int i = startIdx;
    //     int j = midIdx+1;
    //     int k = startIdx;

    //     while(i<=midIdx && j<=endIdx)
    //     {
    //         if(arr[i]< arr[j])
    //         {
    //             tmp[k] = arr[i];
    //             i++;
    //             k++;
    //         }
    //         else
    //         {
    //             tmp[k] = arr[j];
    //             j++;
    //             k++;
    //         }
    //     }

    //     //copy the left over from the first half
    //     while(i<=midIdx)
    //     {
    //         tmp[k] = arr[i];
    //         i++;
    //         k++;
    //     }
    //     while(j<=endIdx)
    //     {
    //         tmp[k] = arr[j];
    //         j++;
    //         k++;
    //     }

    //     //push back values from tmp into arr
    //     for(k= startIdx; k<=endIdx; k++)
    //     {
    //         arr[k] = tmp[k];
    //     }

    // }

    public static void SelectionSort(int[] arr)//running time O(n^2)
    {
       for(int j = 0; j< arr.length-1; j++)
       {
            int min_pos = j;

            //search for the smallest value from position 0 till the end of the array
            for(int i = j+1; i< arr.length; i++)
            {
                if(arr[i]<arr[min_pos])//did we find something smaller?
                {
                    min_pos = i;//save it's position
                }
            }
            //swap the elements at positions 0 and min_pos
            int tmp = arr[j];
            arr[j] = arr[min_pos];
            arr[min_pos] = tmp;
       }
    }

    public static void BubbleSort(int[] arr)//arr the array to be sorted - O(n^2)
    {
       for(int j=0; j<arr.length-1; j++) //"n" = "arr.length"
       {
            for(int i=0; i<arr.length-1; i++)
            {
                if(arr[i] > arr[i+1]) //check if two adjacent values need to be swappwed
                {
                    int tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                }
            }
       }
    }

    public static void BubbleSort2(int[] arr)//arr the array to be sorted - O(n^2)
    {
       for(int j=0; j<arr.length-1; j++) //"n" = "arr.length"
       {
            for(int i=0; i<arr.length-1-j; i++)
            {
                if(arr[i] > arr[i+1]) //check if two adjacent values need to be swappwed
                {
                    int tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                }
            }
       }
    }

    //the best is O(n), big Omega (n)
    public static void BubbleSort3(int[] arr)//arr the array to be sorted - O(n^2)
    {
       for(int j=0; j<arr.length-1; j++) //"n" = "arr.length"
       {
            boolean didSwap =false;
            for(int i=0; i<arr.length-1-j; i++)
            {
                if(arr[i] > arr[i+1]) //check if two adjacent values need to be swappwed
                {
                    int tmp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tmp;
                    didSwap = true; //we swapped values!!!
                }
            }
            //check if there were any swaps in this "round"/traversal
            if(!didSwap)//if no swaps then the array must be sorted - we're done
                break;
       }
    }
    public static void Display(int[] arr)
    {
        for(int num : arr) //traverses the array
        {
            System.out.print(num +", "); //display each value
        }
        System.out.println(); //move the cursor to the next line
    }
}