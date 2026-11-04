package Array;

public class CheckIsArrayIsSorted {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        int[] arr = io.input();

        boolean sorted = isSorted(arr);
        System.out.println(sorted);

        int[] ints = smallestAndLargestElement(arr);
        io.output(ints);
    }

    public static int[] smallestAndLargestElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest) largest = arr[i];
            if(arr[i] < smallest) smallest = arr[i];
        }

        return new int[]{smallest,largest};

    }

    public static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                check = false;
                break;
            }
        }

        return check;
    }
}
