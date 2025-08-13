import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Cat {
    public static void cat(String[] args) throws IOException {
        for (String path : args) {
            Path p = Paths.get(path);
            try (BufferedReader reader = Files.newBufferedReader(p)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
                System.exit(1);
            }
        }

    }
}