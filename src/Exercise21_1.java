import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise21_1 {
    public static void main(String[] args) {

        Set<String> set1 = new LinkedHashSet<> //creating 2 sets
                (Arrays.asList("Chemistry", "Mathematics", "Biology", "English"));
        Set<String> set2 = new LinkedHashSet<>
                (Arrays.asList("Biology", "English", "Geography", "Physics"));

        Set<String> onlyInFirst = new LinkedHashSet<>(set1); //in the 1 stack
        onlyInFirst.removeAll(set2);
        System.out.println("In first set: " + onlyInFirst);

        Set<String> onlyInSecond = new LinkedHashSet<>(set2); // in the 2 stack
        onlyInSecond.removeAll(set1);
        System.out.println("In second set: " + onlyInSecond);

        Set<String> inBoth = new LinkedHashSet<>(set1); //in both
        inBoth.addAll(set2);
        System.out.println("In both: " + inBoth);

    }
}