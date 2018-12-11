public class Sorts{

  public static String toString(int[] data){
    if(data.length==0)
    return "{}";
    String answer="{";
    for(int i=0;i<data.length-1;i++)
    {
      answer=answer+data[i]+",";
    }
    answer=answer+data[data.length-1]+"}";
    return answer;
  }

  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){
    int n,i,holder;
    // if(data.length>0)
    // {
      for(n=0;n<data.length;n++)
      {
        int lowIndex=n;
        for(i=n;i<data.length;i++)
        {
          if(data[lowIndex]>data[i])
          lowIndex=i;
        }
        holder=data[n];
        data[n]=data[lowIndex];
        data[lowIndex]=holder;
        //System.out.println("My data is now: "+toString(data));
      }
    // }
    // although this part is unnecessary,
    // it is done to acknowledge that I know that
    // the exception is being thrown
    // else
    // throw new ArrayIndexOutOfBoundsException("Your array must have length > 1");
  }


  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    // if (data.length>0)
    // {
      for(int a=data.length;a>0;a--)
      {
        for(int i=data.length-1,n=0;i>0;i--)
        {
          if (data[i]<data[i-1])
          {
            n=data[i];
            data[i]=data[i-1];
            data[i-1]=n;
          }
          else
          {
            continue;
          }
          //System.out.println(data);
        }
        // System.out.println("My data is now: "+toString(data));
      }
    // }
    // although this part is unnecessary,
    // it is done to acknowledge that I know that
    // the exception is being thrown
    // else
    // throw new ArrayIndexOutOfBoundsException();
  }

  public static void insertionSort(int[] data){
    int holder;
    for(int i=0;i<data.length;i++)
    {
      for(int n=i-1;n>-1;n--)
      {
        if(data[i]<data[n])
        {
          holder=data[n];
          data[n]=data[i];
          data[i]=holder;
        }
        else
        {
          n=-1;
          // To break out of the loop, since we aren't allowed to use break
          continue;
        }
      }
    }
  }

  public static void main(String[] args){
    int[] data1={9,8,7,6,5,4,3,2,1};
    System.out.println("Original data: "+toString(data1));
    selectionSort(data1);
    System.out.println("After selectionSort: "+toString(data1));
    int[] data2={9,8,7,6,5,4,3,2,1};
    // int[] data2={2,1};
    System.out.println("Original data: "+toString(data2));
    bubbleSort(data2);
    System.out.println("After bubbleSort: "+toString(data2));
    try
    {
      int[] data3={};
      System.out.println("Original data: "+toString(data3));
      selectionSort(data3);
      System.out.println("After selectionSort: "+toString(data3));
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Error: can't do that!");
      e.printStackTrace();
    }
    try
    {
      int[] data4={};
      System.out.println("Original data: "+toString(data4));
      bubbleSort(data4);
      System.out.println("After selectionSort: "+toString(data4));
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Error: can't do that!");
      e.printStackTrace();
    }
    int[] data5={1,2,3,4,5,6,7,8,9};
    System.out.println("Original data: "+toString(data5));
    bubbleSort(data5);
    System.out.println("After bubbleSort: "+toString(data5));


    // testing for runtime of bubbleSort with an already sorted list
    // vs reverse sorted list
    int[] data6=new int[80000];
    for(int i=0;i<data6.length;i++)
    {
      data6[i]=data6.length-i;
    }
    // System.out.println("Original data: "+toString(data6));
    bubbleSort(data6);
    // System.out.println("After bubbleSort: "+toString(data6));

    int[] data7=new int[80000];
    for(int i=0;i<data7.length;i++)
    {
      data7[i]=i;
    }
    // System.out.println("Original data: "+toString(data7));
    bubbleSort(data7);
    // System.out.println("After bubbleSort: "+toString(data7));
  }
}
