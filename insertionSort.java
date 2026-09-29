public class Main{
    public static void main(String[] args){
        int[] array = {9,5,8,6,7,3,4,1,2,0};
        for (int a : array){
            System.out.print(a + " ");
        }
        System.out.println();
        insertionSort(array);

        for (int a : array){
            System.out.print(a + " ");
        }
    }
    public static void insertionSort(int[] array){
        for(int i = 1; i < array.length;i++){
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
