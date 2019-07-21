
//print the second largest element in the array
public class PrintSecondLargest {

  private static void printSecondLargestEle(Integer[] array){
    Integer first =Integer.MIN_VALUE;
    Integer second  = Integer.MIN_VALUE;

    for(int i=0;i<array.length;i++){
      if(array[i]>first){
        second = first;
        first= array[i];
      }
      else if(array[i]>second&&array[i]!=first){
        second = array[i];
      }
    }

    System.out.print("Second largest element is :"+second);
  }

  public static void main(String[] args) {

    Integer[] inputArray = {1,0,8,9};
    printSecondLargestEle(inputArray);
  }

}
