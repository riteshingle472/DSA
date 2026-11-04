package Array;

import java.util.Collections;
import java.util.Vector;

public class Add1 {
    public static void main(String[] args) {
        InputAndOutput io = new InputAndOutput();
        Vector<Integer> res = new Vector<>();
        int[] arr = io.input();

        int carry = 1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] + carry <= 9){
                res.add(arr[i] + carry);
                carry = 0;
            }else{
                res.add(0);
                carry = 1;
            }
        }

        if(carry == 1) res.add(carry);

        Collections.reverse(res);

    }
}
