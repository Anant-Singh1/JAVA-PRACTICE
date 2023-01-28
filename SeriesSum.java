// 5.Sum of Series 1 + 1/2 + 1/3 + 1/4 + 1/5
public class SeriesSum {
    public static void main(String[] args) {
        double sum=0;
for (int i = 1; i <= 5; i++) {
    sum+=(1/i);
}
System.out.println("Sum is-:"+sum);
    }
}
