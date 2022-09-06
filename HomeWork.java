import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        // сортировка выбором
        int[] list= new int[]{1, 3, 5, 5, 6, 1, 5, 1, 3};
        for (int i = 0; i < list.length; i++) {
            int Nmin = i;
            int min = list[i];
            for (int j = i+1; j < list.length; j++) {
                if(min > list[j]){
                    min = list[j];
                    Nmin = j;
                }
            }
            list[Nmin] = list[i];
            list[i] = min;
        }
        System.out.println(Arrays.toString(list));
    }
}