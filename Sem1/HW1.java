import java.util.ArrayList;

/**
 * HW1
 */
public class HW1 {

    public static void main(String[] args) throws Exception {
    //System.out.println(dividibg(2, 0)); 
    Integer [] ar1= {1,3,3,4}; 
    int [] ar2 = {1,2,3,5};
    //out_of_bound(ar2); 
    //task3(ar1, ar2);  
    //task4(ar1, ar2);
    //System.out.println(pow(0, -3));
    }

/*Задание 1 */

    public static int dividibg(int a, int b) {
        if (b ==0) throw new ArithmeticException("Dividing by zero");
        else return a/b; 
    }

    public static void out_of_bound(int [] ar) {
        for (int i = 0; i < ar.length +1; i++) {
            if (i == ar.length) throw new RuntimeException("OUT OF BOUND");
            System.out.println(ar[i]);
        }
    }

    public static int pow(int num, int pow) throws Exception {
        int result = 1;
        if (num == 0 && pow < 0) throw new Exception("IT WILL BE DIVIDING BY ZERO");
        for (int i = 0; i < pow; i++) {
            result *= num;
        }
        return result;
    }

/*Задание 3 */
    public static void task3(Integer []ar1, int [] ar2) {
        int[] result = new int [ar1.length];
        if (ar1.length != ar2.length) throw new RuntimeException("Arrays are not equal");
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] == null) throw new RuntimeException("One of elements is NULL");
            result[i] = (ar1[i] - ar2[i]);
            System.out.println(result[i]);

        }
    }
/*Задание 4 */
        public static void task4(Integer []ar1, int [] ar2) {
            double [] result = new double [ar1.length];
            if (ar1.length != ar2.length) throw new RuntimeException("Arrays are not equal");
            for (int i = 0; i < ar1.length; i++) {
                if (ar1[i] == null) throw new RuntimeException("One of elements is NULL");
                if (ar2[i] == 0) throw new RuntimeException("Dividing by ZERO!!!");
                result[i] = ((double) ar1[i] / (double) ar2[i]);
                System.out.println(result[i]);
    
            }
    }
}
