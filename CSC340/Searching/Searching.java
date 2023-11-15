public class Searching
{
   public static void main(String[] args) {
       //System.out.println("Welcome to JBLM");
       int[] numbers = {23, 5, 88, 14, 94, 7, 22};
       
       //System.out.println(numbers);
       Print(numbers);
   }
   public static void Print(int[] array)//running time: O(n)
   {
       for(int position=0; position<array.length;position+=1)
       {
        System.out.print(array[position]+", ");
       }  
   }
 
   public static int LinearSearch(int[] arr, int value)//running time: O(n)
   {

    //traverse the array
    for(int position = 0; position < arr.length; position++)
    {
        //check if the value in the array at index position matches the given value
        if(arr[position] == value)
        {
            //we found the value!! 
            return position;
        }
    }

    //you only get in here if the array traversal did not find the value
    //this means value is not in the arr
    return -1;
   }

   //return type = int, the position in the arr of the searched target value
   public static int BinarySearch(int[] arr, int target) //running time: O(log n)
   {
        int start = 0; //initially, the "slice" is the entire array
        int end = arr.length-1;

    while(start<=end)//as long as there is at least one element in the slice
    {    
        
        int middle = (start+end)/2; //find the mid point of the slice
        //check if the value in the array in the middle of the slice matches the given target
        if(arr[middle] == target)
        {
            //found it!! return the posiiton
            return middle;
        }
        else if(arr[middle]<target) //value in the middle is too small (smaller than target)
        {
            start = middle+1;
        }
        else //too large
        {
            end = middle-1;
        }
    }
    //we get in here when the slice is empty
    return -1;
   }

//return type = int, the position in the arr of the searched target value
   public static int BinarySearch2(int[] arr, int target)//running time: O(log n)
   {
        int ret = -1;
        int start = 0; //initially, the "slice" is the entire array
        int end = arr.length-1;

    while(start<=end)//as long as there is at least one element in the slice
    {    
        
        int middle = (start+end)/2; //find the mid point of the slice
        //check if the value in the array in the middle of the slice matches the given target
        if(arr[middle] == target)
        {
            //found it!! return the posiiton
            ret = middle;
            break;
        }
        else if(arr[middle]<target) //value in the middle is too small (smaller than target)
        {
            start = middle+1;
        }
        else //too large
        {
            end = middle-1;
        }
    }
    //we get in here when the slice is empty
    return ret;
   }

    public static int LinearSearch2(int[] arr, int value)//running time: O(n)
   {
    int ret = -1;
    //traverse the array
    for(int position = 0; position < arr.length; position++)
    {
        //check if the value in the array at index position matches the given value
        if(arr[position] == value)
        {
            //we found the value!! 
            ret = position;
        }
    }

    //you only get in here if the array traversal did not find the value
    //this means value is not in the arr
    return ret;
   }
}