import java.util.Scanner;
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        int[] maxMinAve;
		int a;
		int ave = 0;
		int max;
		int min;
		Scanner in = new Scanner(System.in);
    System.out.println("количество элементов массива?");
    a = in.nextInt();
    maxMinAve = new int [a];
            for (int i=0;i<maxMinAve.length;i++){
                    maxMinAve[i] = (int) ( Math.random() * a);
                    ave = ave + maxMinAve[i];
            }
    ave = ave / maxMinAve.length;
    max = Arrays.stream(maxMinAve).max().getAsInt();
    min = Arrays.stream(maxMinAve).min().getAsInt();
    System.out.println("Max - " + max);
    System.out.println("Min - " + min);
    System.out.println("Average - " + ave);
    }
}