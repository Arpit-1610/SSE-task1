public class Main{
    public static void main(String[] args){
        int[] array = {9,5,8,6,7,3,4,1,2,0};
        for (int a : array){
            System.out.print(a + " ");
        }
        System.out.println();
        bubbleSort(array);

        for (int a : array){
            System.out.print(a + " ");
        }
    }
    public static void bubbleSort(int[] array){
        for(int i = 0; i < array.length - 1;i++){
            int temp = 0;
            for(int j = 0;j < array.length - i - 1;j++){
                if(array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
