package Array;

public class ArrayManipulatiion {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();

        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[i] = Integer.MIN_VALUE;
                    arr[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        for (int x : arr) {
            if (x != Integer.MIN_VALUE) System.out.println(x);
        }
    }
}
