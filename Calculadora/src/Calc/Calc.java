package Calc;

public class Calc {
    
    public static double Sum(double x, double y) {
        return x + y;
    }
    
    public static double Sqrt(double x) {
        AssertPositiveValues(x);
        return Math.sqrt(x);
    }
    
    public static double Pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    public static double Hipotenusa(double catetoA, double catetoB) {
        AssertPositiveValues(catetoA, catetoB);
        return Sqrt( Pow(catetoA, 2) + Pow(catetoB, 2) );
    }
    
    private static void AssertPositiveValues(double... values) {
        for (double value : values) {
            if (value < 0) {
                throw new IllegalArgumentException("Argumento deve ser POSITIVO!");
            }
        }
    }
}
