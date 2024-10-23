import java.util.*;

public class lab2_1 {
    static int[] arr;
    int k;

    public lab2_1(int[] input, int k) {
        arr = input;
        this.k = k;
    }

    public static void findNNumber(int[] arr, int K) {
        Map<Integer,Integer> mp = new HashMap<Integer, Integer>();
        for (int i: arr) {
            mp.merge(i, 1, Integer::sum);
        }
        System.out.println(mp);
        List<Map.Entry<Integer, Integer> > list
                = new ArrayList<Map.Entry<Integer, Integer> >(
                mp.entrySet());

        Collections.sort(
                list,
                new Comparator<Map.Entry<Integer, Integer> >() {
                    public int compare(
                            Map.Entry<Integer, Integer> o1,
                            Map.Entry<Integer, Integer> o2)
                    {
                        if (o1.getValue() == o2.getValue())
                            return o2.getKey() - o1.getKey();
                        else
                            return o2.getValue()
                                    - o1.getValue();
                    }
                });

        for (int i = 0; i < K; i++)
            System.out.print(list.get(i).getKey() + " ");
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        lab2_1 obj = new lab2_1(arr,4);
        findNNumber(lab2_1.arr, obj.k);
    }
}