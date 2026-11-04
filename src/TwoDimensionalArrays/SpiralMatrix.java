package TwoDimensionalArrays;

import Array.InputAndOutput;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputAndOutput io = new InputAndOutput();

        int[][] arr = io.input2dArray();

        int r = arr.length, c = arr[0].length;
        int fr=0, fc=0, lr=r-1, lc=c-1;
        int count = 0;

        while(count != r*c){
            for(int i=fc;i<=lc && count < r*c;i++){
                System.out.print(arr[fr][i]+" ");
                count++;
            }
            fr++;

            for(int i=fr;i<=lr && count < r*c;i++){
                System.out.print(arr[i][lc]+" ");
                count++;
            }
            lc--;

            for(int i=lc;i>=fc && count < r*c;i--){
                System.out.print(arr[lr][i]+" ");
                count++;
            }
            lr--;

            for(int i=lr;i>=fr && count < r*c;i--){
                System.out.print(arr[i][fc]+" ");
                count++;
            }
            fc++;
        }
    }
}
