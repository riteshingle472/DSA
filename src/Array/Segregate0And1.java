package Array;

public class Segregate0And1 {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();
        int i = 0, j = arr.length-1;

        while(i < j){
            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        io.output(arr);
    }
}
