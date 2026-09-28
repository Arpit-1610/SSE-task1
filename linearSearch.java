public class Main {
    public static void main(String[] args) {
        int[] arr = {91, 24, 13, 45, 41, 38, 27, 23, 96, 79, 21, 85, 64, 14, 13, 21, 37, 39, 74, 87};
        int x = 91;
        int result = search(arr,arr.length,x);
        if(result == -1){
            System.out.println("Element is present in list");
        }
        else{
            System.out.println("Element was found in the list at index " + result);
        }
    }
    public static int search(int[] arr,int N,int x){
        for (int i = 0; i < N; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
