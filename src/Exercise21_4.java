import java.util.*;

public class Exercise21_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Character> set = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
        int vowels = 0;
        int consonants = 0;

        System.out.print("Enter a text file name: ");
        String fileName = input.next();

        for (int i = 0; i < fileName.length(); i++) {
            if (set.contains(Character.toUpperCase(fileName.charAt(i)))) {
                vowels++;
            } else if (Character.isLetter(fileName.charAt(i))) {
                consonants++;
            }
        }
        System.out.println("The file " + fileName + " has " + vowels +
                " vowels and " + consonants + " consonants.");
    }
}