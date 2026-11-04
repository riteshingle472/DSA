package TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n'th row number : ");
        int n = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                if(i == j || j == 0){
                    list.get(i).add(1);
                }else{
                    list.get(i).add(list.get(i-1).get(j) + list.get(i-1).get(j-1));
                }
            }
        }

        for(List<Integer> arr : list){
            for(int ele : arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
}
