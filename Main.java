import java.util.ArrayList;

public class Main {
    public static void main (String args[]) {
        System.out.println("Escalonamento de Intervalo Guloso:");
        int[] s = {2, 7, 10, 3, 12, 5, 8, 9, 11, 4, 13};
        int[] f = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        int toElements  = s.length;

        System.out.println(SDMGuloso(s, f, toElements));
    }
    public static ArrayList<Integer> SDMGuloso(int[] s, int[] f, int toE){

        f[0] = -1;
        ArrayList<Integer> x = new ArrayList<Integer>();
        int i = 0;
        
        for(int k = 1; k<toE; k++) {
            if (s[k]>f[i]) {
                x.add(k);
                i = k;
            }
        }
        return x;
    }
}
