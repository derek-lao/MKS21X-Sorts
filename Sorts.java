public class Sorts{

  public String toString(){
    return "";
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
      data[lowIndex]=data[n];
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
        for(int i=data.length-1,n=0;i>0;i++)
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
    int[] data={9,8,7,6,5,4,3,2,1};
    selectionSort(data);
    System.out.println("success");
  }
}
