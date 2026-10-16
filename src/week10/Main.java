import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Main {
    private static final Path FILE = Paths.get("transactions.txt");

    public static void main(String[] args) {
        String id = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        String record = id + "|" + LocalDateTime.now() + "|Deposit|250.00";

        try {
            Files.write(FILE, List.of(record), StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Saved transaction: " + id);

            List<String> records = Files.readAllLines(FILE, StandardCharsets.UTF_8);
            records.sort(String::compareTo);
            System.out.println("\nSaved transactions:");
            for (String line : records) {
                System.out.println(line);
            }

            System.out.print("\nSearch ID: ");
            // For a simple demo, search using the generated ID.
            String searchId = id;
            records.stream().filter(line -> line.startsWith(searchId + "|"))
                    .forEach(line -> System.out.println("Match: " + line));
        } catch (IOException ex) {
            System.out.println("File operation failed: " + ex.getMessage());
        }
    }
}
