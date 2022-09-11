import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        int[] list = new int[10000];

        for(int i = 0; i < list.length; ++i) {
            list[i] = (int)(Math.random() * 10.0);
        }

        long start1 = System.currentTimeMillis();

        int j;
        for(int i = 0; i < list.length; ++i) {
            int Nmin = i;
            int min = list[i];

            for(j = i + 1; j < list.length; ++j) {
                if (min > list[j]) {
                    min = list[j];
                    Nmin = j;
                }
            }

            list[Nmin] = list[i];
            list[i] = min;
        }

        long finish1 = System.currentTimeMillis();
        System.out.println(Arrays.toString(list));
        System.out.println(finish1 - start1);
        List<Integer> list2 = new ArrayList<>();

        for(j = 0; j < 10000; ++j) {
            list2.add((int)(Math.random() * 10.0));
        }

        long start2 = System.currentTimeMillis();
        list2.sort(Comparator.comparingInt(o -> o));
        long finish2 = System.currentTimeMillis();
        System.out.println(list2);
        System.out.println(finish2 - start2);
    }
}