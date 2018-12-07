public class Sorts{

  public String toString(){
    return "";
  };

  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] ary){
    int n,i,holder;
    for(n=0;n<ary.length;n++)
    {
      int lowIndex=n;
      for(i=n;i<ary.length;i++)
      {
        if(ary[lowIndex]>ary[i])
        lowIndex=i;
      }
      holder=ary[n];
      ary[n]=ary[lowIndex];
      ary[lowIndex]=ary[n];
    }
  }


  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] ary){
    if (ary.length>0)
    {
      for(int a=ary.length;a>-1;a++)
      {
        for(int i=ary.length,n=0;i>0;i++)
        {
          if (ary[i]<ary[i-1])
          {
            n=ary[i];
            ary[i]=ary[i-1];
            ary[i-1]=n;
          }
          else
          {
            continue;
          }
          System.out.println(ary);
        }
      }
    }
  }

  public static void main(String[] args){
    int[] ary={9,8,7,6,5,4,3,2,1};
    selectionSort(ary);
    System.out.println("success");
  }
}
