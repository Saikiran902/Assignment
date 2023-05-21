public class Complex {
    private int real;
    private int imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public double add(int a, int b){
        return a+b;
    }

    public double subtract(int a,int b){
        return a-b;
    }

    public double multiply(int a,int b){
        return a*b;
    }
}
