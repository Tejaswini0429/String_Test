
import java.util.Scanner;

public class CharShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = shiftLetters(input);
        System.out.println("Output: " + result);
    }

    public static String shiftLetters(String input) {
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char shiftedChar = (char) ((c - 'A' - 2 + 26) % 26 + 'A');
                output.append(shiftedChar);
            } else if (Character.isLowerCase(c)) {
                char shiftedChar = (char) ((c - 'a' - 3 + 26) % 26 + 'a');
                output.append(shiftedChar);
            } else {
                output.append(c);
            }
        }
        return output.toString();
    }
}