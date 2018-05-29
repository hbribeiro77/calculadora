package Calc;

public class Calc {
    
    public double Sum(double x, double y) {
        return x + y;
    }
    
    public double Sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Raiz quadrada de número negativo não tem solução real!");
        }
        return Math.sqrt(x);
    }
    
    public double Pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
}
