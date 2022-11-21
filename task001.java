/**
 * Реализовать алгоритм быстрой сортировки
 */
import java.util.Random;

public class task001 {
    public static void quikeSort(int[] a, int low, int hight){
        if(hight == 0) return;
        if(hight <= low) return;
        int middle = low + (hight-low)/2;
        int prop = a[middle];
        int i = low;
        int j = hight;
        while(i <= j){
            while(a[i] < prop) i++;
            while(a[j] > prop) j--;
            if(i <= j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if(hight > i) quikeSort(a, i, hight);
        if(low < j) quikeSort(a, low, j);
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] createArray(int count, int start, int finish){
        
        int[] a = new int[count];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(start, finish);
        }
        return a;
    }
    public static void main(String[] args) {
        int[] x = createArray(50, 0, 100);
        int l = 0;
        int h = x.length-1;
        printArray(x);
        quikeSort(x, l, h);
        printArray(x);
        
        
        
        

    }
}