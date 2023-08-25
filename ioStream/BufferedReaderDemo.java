import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        
        try (
            FileReader fr = new FileReader("C:\\Users\\prasanga\\IdeaProjects\\java_programs\\src\\Output.txt");
            BufferedReader br = new BufferedReader(fr)
        ) {
            char c[] = new char[20];

            if (br.markSupported()) {
                System.out.println("mark() method is supported");
                br.mark(100); 
            }

            br.skip(8); 

            if (br.ready()) {
                System.out.println(br.readLine());

                int bytesRead = br.read(c);
                for (int i = 0; i < bytesRead; i++) { 
                    System.out.print(c[i]);
                }
                System.out.println();

                br.reset(); 
                for (int i = 0; i < 8; i++) { 
                    System.out.println((char) br.read());
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
