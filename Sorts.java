public class Sorts{

  public static String toString(int[] data){
    String answer="{";
    for(int i=0;i<data.length-1;i++)
    {
      answer=answer+data[i]+",";
    }
    answer=answer+data[data.length-1]+"}";
    return answer;
  };

  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){
    int n,i,holder;
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
  }


  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    if (data.length>0)
    {
      for(int a=data.length;a>0;a++)
      {
        for(int i=data.length-1-a,n=0;i>0;i++)
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
          System.out.println(data);
        }
      }
    }
  }

  public static void main(String[] args){
    int[] data1={9,8,7,6,5,4,3,2,1};
    selectionSort(data1);
    System.out.println("Original data: {9,8,7,6,5,4,3,2,1}");
    System.out.println("After selectionSort: "+toString(data1));
    int[] data2={9,8,7,6,5,4,3,2,1};
    bubbleSort(data2);
    System.out.println("Original data: {9,8,7,6,5,4,3,2,1}");
    System.out.println("After bubbleSort: "+toString(data2));
  }
}
