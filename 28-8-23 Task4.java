import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        double h;
        double m;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Hours = ...");
        h = in.nextDouble();
        if (h > 11){
            h=h-12;
        }
        System.out.println("Mins = ...");
        m = in.nextDouble();
        
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