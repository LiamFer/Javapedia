package fundamentals;

import java.io.FileWriter;

public class fileWriter {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("test.txt");
        ) {
            writer.write("Hello World!");
            writer.write("Hello World!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
