package TwoDimensionalArrays;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(19);
        a.add(91);
        a.add(0);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(120);
        b.add(16);
        b.add(11);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(10);
        c.add(10);
        c.add(10);

        arr.add(a);
        arr.add(b);
        arr.add(c);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (ArrayList<Integer> list : arr) {
            for (int element : list) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}