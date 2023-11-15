import java.lang.reflect.Array;

public class MyArrayList<T> {
    //data
    private T[] arr;
    private int Count;

    //actions ...
    public int getCount() //O(1)
    {
        return Count;
    }

    public int getCapacity() //O(1)
    {
        return arr.length;
    }

    public void add(T newValue) //O(n) worst case, most times/avg O(1)
    {
        if(isFull())
        {
            resize();
        }
        arr[Count] = newValue;
        Count++;
    }

    public void display()
    {
        for(int i = 0; i< Count; i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.println();//moves to the next line "adds a new line"
    }

    public void addBack(T newValue) //O(n)
    {
        add(newValue);
    }

    public void addFront(T newValue) //O(n)
    {
        if(isFull())
        {
            resize();
        }

        //shift elements to the right
        for(int i = Count-1; i>=0; i--)
        {
            arr[i+1] = arr[i];
        }

        arr[0]= newValue;
        Count++;
    }

    public void insert(int index, T newValue) //O(n)
    {
        if(index<0 || index > Count)//some validation
        {
            //return; //ignore the request
            throw new IndexOutOfBoundsException();
        }

        if(isFull())
        {
            resize();
        }

        //shift elements from index index and above to the right
        for(int i = Count-1; i>=index; i--)
        {
            arr[i+1] = arr[i];
        }

        arr[index]= newValue;
        Count++;
    }
    public boolean isFull() //O(1)
    {
        // if(Count == getCapacity())
        // {
        //     return true;
        // }
        // else
        // {
        //     return false;
        // }
        return Count == getCapacity();
    }

    public void resize() //O(m)
    {
        //step 1 - create a larger array (say with twice capacity)
        T[] newArr = (T[])new Object[2*getCapacity()];

        //step 2 - copy the values from old arr into new array
        for(int i = 0; i<Count; i++ )
        {
            newArr[i] = arr[i];
        }

        //step 3 - call the new array as arr
        arr = newArr;
    }


    public T get(int index) //O(1)
    {
        return arr[index];
    }


    public void set(int index, T value) //O(1)
    {
        if(index >=0 && index <Count) //some index validation
            arr[index] = value;
        else
            throw new IndexOutOfBoundsException();
    }


    public void DeleteBack() //O(1)
    {
        if(Count>=0)
            Count--;   
        else
            throw new IndexOutOfBoundsException("The list is empty - you can't deleteback");
    }

    
    public void deleteFront() //O(n)
    { 
        if(Count>=0)
        {
            //shift all elements to the left one position
            for(int i = 0; i< Count-1; i++)
            {
                arr[i] = arr[i+1];
            }

            // for(int i = 1; i< Count; i++)
            // {
            //     arr[i-1] = arr[i];
            // }
            Count--;   
        }    
        else
            throw new IndexOutOfBoundsException("The list is empty - you can't deletefront");
    }


    public void deleteAt(int index) //O(n)
    { 
        if(Count>0 && index >=0 && index < Count)//at least one element in the list, and valid index
        {
            //shift all elements to the left one position
            for(int i = index; i< Count-1; i++)
            {
                arr[i] = arr[i+1];
            }


            Count--;   
        }    
        else
            throw new IndexOutOfBoundsException("The list is empty - you can't deletefront");
    }
    //ctor(s)
    public  MyArrayList() {
        //https://xperti.io/blogs/creating-generic-array-in-java/
        //https://www.baeldung.com/java-generic-array
        arr = (T[]) new Object[4];//new T[4]; 
        //Count =0;
    }
}
