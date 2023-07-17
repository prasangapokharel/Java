public class stringMethods2 {
    public static void main(String[] args) {
        String s = "Eat Sleep Code";
        int output = s.indexOf("Sleep");
        System.out.println(output);

        String s1 = "Learn Share Learn";
        int output1 = s.indexOf("ea", 3);
        System.out.println(output1);

        String s2 = "Learn Share Learn";
        int output2 = s.lastIndexOf("a");
        System.out.println(output2);

        String s3 = "Hello";
        boolean out3 = "Hello".equals("Hello");
        System.out.println(out3);
        boolean out4 = "Hello".equals("hello");
        System.out.println(out4);

        String word1 = "HELLO";
        String word3 = word1.toLowerCase();
        System.out.println(word3);

        String word2 = word1.toUpperCase();
        System.out.println(word2);
    }
}
