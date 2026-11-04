package Array;

public class WaveArray {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();

        for(int i=1;i< arr.length;i+=2){
            if(arr[i-1] < arr[i]){
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
        }

        io.output(arr);
    }
}
