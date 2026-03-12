import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;

public class JSONReader {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("C:/xampp/htdocs/FrontEndProject/java/Practicejava/Strings/credentials.json")) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);

            // Extract username and password
            String username = (String) jsonObject.get("username");
            String password = (String) jsonObject.get("password");

            // Print values (for testing purposes)
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
