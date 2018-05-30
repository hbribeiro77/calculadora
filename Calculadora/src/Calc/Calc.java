package Calc;

public class Calc {
    
    public double Sum(double x, double y) {
        return x + y;
    }
    
    public double Sqrt(double x) {
        AssertPositiveValues(x);
        return Math.sqrt(x);
    }
    
    public double Pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    public double Hipotenusa(double catetoA, double catetoB) {
        AssertPositiveValues(catetoA, catetoB);
        return Sqrt( Pow(catetoA, 2) + Pow(catetoB, 2) );
    }
    
    private void AssertPositiveValues(double... values) {
        for (double value : values) {
            if (value < 0) {
                throw new IllegalArgumentException("Argumento deve ser POSITIVO!");
            }
        }
    }
}
