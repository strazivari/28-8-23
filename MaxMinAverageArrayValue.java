import java.util.Scanner;
import java.util.Arrays;
class MaxMinAverageArrayValue {
    public static void main(String[] args) {
        double[] maxMinAve;
		int a;
		double ave = 0;
		double max;
		double min;

		Scanner in = new Scanner(System.in);
    	System.out.println("?");
    	a = in.nextInt();
    	maxMinAve = new double [a];

            for (int i=0;i<maxMinAve.length;i++){
                maxMinAve[i] = ( Math.random());
                ave = ave + maxMinAve[i];
            }
    	ave = ave / maxMinAve.length;
    	
    	max = Arrays.stream(maxMinAve).max().getAsDouble();
    	min = Arrays.stream(maxMinAve).min().getAsDouble();
    	
    	System.out.println("Max - " + max);
    	System.out.println("Min - " + min);
    	System.out.println("Average - " + ave);
    }
}
