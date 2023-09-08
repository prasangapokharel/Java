public class MathOperations {
    public static void main(String[] args) {
        int x = 28;
        int y = 4;

        // Return the maximum of two numbers
        System.out.println("Maximum number of x and y is: " + Math.max(x, y));

        // Return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));

        // Calculate and print the power of x and y
        
        System.out.println("Power of x and y is: " + Math.pow(x,y));

        // Return the natural logarithm of x and y
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));

        // Return the base 10 logarithm of x and y
        System.out.println("Log10 of x is: " + Math.log10(x));
        System.out.println("Log10 of y is: " + Math.log10(y));

        // Return the natural logarithm of x + 1
        System.out.println("Log1p of x is: " + Math.log1p(x));

        // Calculate and print e raised to the power of 2
        System.out.println("exp of 2 is: " + Math.exp(2));

        // Calculate and print 2 raised to the power of x
        System.out.println("2^x is: " + Math.pow(2, x) );

        // Calculate and print e raised to the power of x
        System.out.println("e^x is: " + Math.exp(x));
    }
}
