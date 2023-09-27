import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exceptSpecialchar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        String input = br.readLine();
        br.close();

        StringBuilder filteredChars = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) || Character.isWhitespace(c)) {
                filteredChars.append(c);
            }
        }

        char[] resultArray = filteredChars.toString().toCharArray();

        System.out.println(resultArray);
    }
}
