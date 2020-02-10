package b_javaBasics.collections.pan_tadeusz;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static java.lang.System.currentTimeMillis;

public class PanTadeuszMain {
    public static void main(String[] args) {
        long startMillis = currentTimeMillis();
        Map<String, Integer> numberOfWords = new HashMap<>();

        List<String> allLines = getAllPanTadeuszLines();
        for (String line : allLines) {
            for (String s : getAllWordsFromLinePanTadeusz(line)) {
                if (!numberOfWords.containsKey(s)) {
                    numberOfWords.put(s, 1);
                } else numberOfWords.put(s, numberOfWords.get(s) + 1);
            }
        }
        System.out.println(sortByValue(numberOfWords));
        long endMillis = currentTimeMillis();
        System.out.println(endMillis - startMillis + " ms");
    /*    for (Map.Entry<String, Integer> entry : numberOfWords.entrySet()) {
            System.out.println(entry);
        }*/

    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>((map.entrySet()));
        list.sort(new WordCountComparator().reversed());

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            if (entry.getKey().length() > 3) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    /*    public static Map<String, Integer> sortByValueWithStream(Map<String, Integer> map) {
            Stream<Map.Entry<String, Integer>> sorted = null;
            for (String s : map.keySet()) {
                sorted = map.entrySet().stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

            }
            return (Map<String, Integer>) sorted;
        }*/
    private static List<String> getAllWordsFromLinePanTadeusz(String line) {
        return Arrays.asList(line.split(" "));
    }

    private static List<String> getAllPanTadeuszLines() {
        try {
            String fileName = "D:\\OneDrive - AT\\_dev\\extras\\pan-tadeusz.txt";
            return Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
