import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        Path inputPath = Paths.get(args[0]);
        String[] words = Files.readString(inputPath)
                .trim()
                .split("\\s+");

        StringBuilder result = new StringBuilder();
        for (String name : words) {
            if (!name.isEmpty()) {
                result.append(Character.toUpperCase(name.charAt(0)))
                        .append(name.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        // Write to output file
        Files.write(Paths.get(args[1]), result.toString().trim().getBytes());
    }
}