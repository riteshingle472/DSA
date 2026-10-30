package Array;

public class PrefixSum {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();
        io.output(prefix(arr));
    }

    public static int[] prefix(int[] arr){
        for(int i=1;i<=arr.length-1;i++){
            arr[i] = arr[i] + arr[i-1];
        }

        return arr;
    }
}
