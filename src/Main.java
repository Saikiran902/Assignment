public class Main {
    public static void main(String[] args) {
        Complex c2 = new Complex(2,-3);
        System.out.println(c2.add(c2.getReal(),c2.getImaginary()));
        System.out.println(c2.subtract(c2.getReal(),c2.getImaginary()));
        System.out.println(c2.multiply(c2.getReal(),c2.getImaginary()));
    }
}
