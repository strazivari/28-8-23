import java.util.Scanner;
class BaseConverter {
    public static void main(String[] args) {
        int unit;
        double Celsius;
        double Fahrenheit;
        double Kelvin;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Celsius = ...");
        Celsius = in.nextInt();
        System.out.println("Unit? Kelvin - 1, Fahrenheit - 2");
        unit = in.nextInt();
        
        
        convert(unit, Celsius);
    }
    static void convert(int unit, double Celsius){
        double Fahrenheit;
        double Kelvin;
         if (unit == 1){
            Kelvin = (Celsius + 273.15);
             System.out.println("Kelvin - " + Kelvin);
         }
         else if (unit == 2){
             Fahrenheit = (Celsius * 1.8 + 32);
             System.out.println("Fahrenheit - " + Fahrenheit);
         }
         else {
             System.out.println("ERROR");
         }
    }
}
