public class ToStringExample {
    public static void main(String[] args) {
        Integer in = 12;

        // Return the maximum of two numbers
        System.out.println(in.toString());
        System.out.println(in.getClass());
        System.out.println(Integer.toString(12));  // Removed the incorrect syntax "i:"
        System.out.println(Integer.toBinaryString(152));  // Removed the incorrect syntax "i:"
        System.out.println(Integer.toHexString(152));  // Removed the incorrect syntax "i:"
        System.out.println(Integer.toOctalString(152));  // Removed the incorrect syntax "i:"
    }
}
