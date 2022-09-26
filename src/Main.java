import java.io.IOException;

public  class Main {
    public static void main(String[] args) throws IOException {
        FileReader start = new FileReader();
        start.counting();
        FileCopy photo = new FileCopy();
        photo.copy();
        Greetings sms = new Greetings();
        sms.massage();
    }
}