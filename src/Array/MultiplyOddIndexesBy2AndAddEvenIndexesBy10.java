package Array;

public class MultiplyOddIndexesBy2AndAddEvenIndexesBy10 {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();

        for(int i=0;i< arr.length;i++){
            if(i %2 == 0) arr[i] += 10;
            else arr[i] *= 2;
        }

        io.output(arr);
    }
}
