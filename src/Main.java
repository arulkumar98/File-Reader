import java.io.IOException;

public  class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader();
        fileReader.counting();
        FileCopy fileCopy = new FileCopy();
        fileCopy.copy();
        Greetings greetings = new Greetings();
        greetings.massage();
    }
}