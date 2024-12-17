package step1_45q;

import java.util.ArrayList;
import java.util.List;


public class Q1Triplet {


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoint = 0;
        int bobPoint = 0;
        List<Integer> res = new ArrayList<>();
        for (Integer i = 0; i < a.size(); i++) {

            if (a.get(i) > b.get(i)) {
                ++alicePoint;
            } else if (a.get(i) < b.get(i)) {
                ++bobPoint;
            }
        }

        res.add(alicePoint);
        res.add(bobPoint);
        return res;

    }


    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>() {{
            add(17);
            add(30);
            add(28);
        }};
        List<Integer> b = new ArrayList<Integer>();
        b.add(99);
        b.add(16);
        b.add(8);


        List<Integer> res = compareTriplets(a, b);
        for (Integer i : res) {
            System.out.println(i);
        }
    }
}

