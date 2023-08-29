import java.util.Scanner;
class ClockDegreeCalc {
    public static void main(String[] args) {
        double h;
        double m;
        Scanner in = new Scanner(System.in);

        do {
        System.out.println("Hours = ...");
        h = in.nextDouble();
        if (11 < h && h < 24) {
            h=h-12;
        }
        else if (h > 23 | h < 0) {
            System.out.println("Error. Try again");
        }
    } while(h > 23 | h < 0);
        do {
            System.out.println("Mins = ...");
            m = in.nextDouble();
            if (m < 0 | m > 59) {
            System.out.println("Error. Try again");
        }
        } while (m < 0 | m > 59);
        
        cornDegree(h, m);
    }
    static void cornDegree(double h, double m){
        h = (h + m/60) * 30;
        m = m*6;
        double degree;
        degree = h-m;
        if (Math.abs(degree) <= 180){
        System.out.println("Degree = " + Math.abs(degree));}
        else {
            degree = 360-Math.abs(degree);
            System.out.println("Degree = " + Math.abs(degree));
        }
        
    }
}
