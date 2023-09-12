import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("main", "main", "main", "common",
                "not main", "common", "bird", "true", "false", "not main", "else", "bird", "human"));
        System.out.println(countOccurrence(words, "main"));
        System.out.println();

        int[] arrNumbers = {1,2,3,5,10,20,60};
        List<Integer> numbers = toList(arrNumbers);

        for (Integer i:numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        numbers = new ArrayList<>(Arrays.asList(1,2,3,5,5,5,5,25,25,60,7,1));

        System.out.println();
        System.out.println(findUnique(numbers));
        System.out.println();

        calcOccurrence(words);
        System.out.println();

        for (String w : findOccurrence(words)) {
            System.out.println(w);
        }
    }


    public static int countOccurrence(List<String> words, String target) {
        int count = 0;
        for (String word:words) {
            if(word.equals(target))
                count++;
        }
        return count;
    }

    public static List<Integer> toList(int[] numbers) {

        List<Integer> result = new ArrayList<>();
        for (int i:numbers) {
            result.add(i);
        }
        return result;
    }

    public static List<Integer> findUnique(List<Integer> numbers) {

        List<Integer> result = new ArrayList<>();
        for (Integer i:numbers) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static void calcOccurrence(List<String> words) {

        List<String> temp = new ArrayList<>();
        for (String word : words) {

            int count = 0;
            if(temp.contains(word))
                continue;
            for (String s:words) {
                if(word.equals(s))
                    count ++;
            }
            temp.add(word);
            System.out.println(word + ": " + count);
        }
    }

    public static List<String> findOccurrence(List<String> words) {

        List<String> temp = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for (String word : words) {

            int count = 0;
            if (temp.contains(word))
                continue;

            for (String w : words)
                if (word.equals(w))
                    count++;

            temp.add(word);
            result.add("{name: \"" + word + "\", occurrence: " + count + "}");
        }
        return result;
    }

}