import java.io.File;
import java.util.Scanner;

public class FileReader extends Greetings {
    public void counting(){
        int count = 0;
        try {
            File file = new File("sample.java");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                scanner.nextLine();
                count++;
            }
            System.out.println(counting + count);
            System.out.println();
            scanner.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
