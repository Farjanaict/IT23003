
// 1. SumClass: Summing up 1 + 0.9 + 0.8 + ... + 0.1
public class Sum {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 1.0; i >= 0.1; i -= 0.1) {
            sum += i;
        }
       System.out.println("SUM="+sum);
    }
}