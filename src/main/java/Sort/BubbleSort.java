package Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {2, 353, 7, 1, 5, 89, 20, 3};
        for (int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i]>intArray[i+1]) swap(intArray, i, i+1);
            }
        }
        for (int i:intArray
             ) {
            System.out.println(i);
        }


    }

    public static void swap(int[] array,int i ,int j){
        //if i equals to j,it means we have nothing to swap
      if(i == j){
          return;
      }
      int temp =array[i];
      array[i]=array[j];
      array[j]=temp;
    }
}
