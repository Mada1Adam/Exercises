import java.util.*;

public class Exercise21_13 {
    public static void main(String[] args){
        int max = 250;
        int min = 15;
        int range = max - min + 1;
        int year;
        int num = (int) (Math.random() * range);
        String gender;
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year: ");
        year = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter gender: ");
        gender = scanner.nextLine();
        if(gender != gender.toLowerCase(Locale.forLanguageTag("m")))
            System.out.println("Wrong gender");
        if(gender != gender.toLowerCase(Locale.forLanguageTag("w")))
            System.out.println("Wrong gender");

        System.out.println("Enter the name: ");
        name = scanner.nextLine();

        if(name.length() > 7) {
            num = num - 14;
            System.out.println("Name " + name + " is ranked #"
                    + num + " in year " + year);
        } else {
            System.out.println("Name " + name + " is ranked #"
                    + num + " in year " + year);
        }
    }
}