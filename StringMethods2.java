public class StringMethods2 {
    public static void main(String[] args) {
        String s = "Eat Sleep Code";
        int output = s.indexOf("Sleep");
        System.out.println(output);

        String s1 = "Learn Share Learn";
        int output1 = s1.indexOf("ea", 3);
        System.out.println(output1);

        String s2 = "Learn Share Learn";
        int output2 = s2.lastIndexOf("a");
        System.out.println(output2);

        String s3 = "Hello";
        boolean out3 = s3.equals("Hello");
        System.out.println(out3);
        boolean out4 = s3.equalsIgnoreCase("hello");
        System.out.println(out4);

        String word1 = "HELLO";
        String word3 = word1.toLowerCase();
        System.out.println(word3);
        
        String word4 = "HeLLo";
        String word5 = word4.toUpperCase();
        System.out.println(word5);
       
        String word6 = " Learn Share Learn ";
        String word7 = word6.trim();
        System.out.println(word7);

        String s4 = "HelloBorld";
        String s5 = s4.replace('B', 'W');
        System.out.println(s5);
    }
}
