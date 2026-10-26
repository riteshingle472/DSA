package Array;

public class SecondLargestElementOfArray {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();
        int secondMax = Integer.MIN_VALUE;
        int largest = arr[0];

        for(int i=1;i< arr.length;i++){
            if(arr[i] > largest){
                secondMax = largest;
                largest = arr[i];
            }
        }

        System.out.println("Largest : "+largest);
        System.out.println("Second Largest : "+secondMax);
    }
}
