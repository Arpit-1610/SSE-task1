public class Main{
    public static void main(String[] args){
        int[] array = {9,5,8,6,7,3,4,1,2,0};
        for (int a : array){
            System.out.print(a + " ");
        }
        System.out.println();
        selectionSort(array);

        for (int a : array){
            System.out.print(a + " ");
        }
    }
    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length - 1;i++){
            int min = i;
            for(int j = i + 1; j < array.length;j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
