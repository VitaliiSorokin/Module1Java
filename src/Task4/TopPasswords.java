package Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopPasswords {
    public static void main(String[] args) {
        File file = new File("D:\\2code\\alevel\\Modul1\\src\\credentials.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Map<String, Integer> passwordCount = new HashMap<>();

        while (sc.hasNextLine()) {
            String password = sc.nextLine().split(" ")[1];
            if (passwordCount.containsKey(password)) {
                Integer currentCount = passwordCount.get(password);
                passwordCount.replace(password,currentCount++);
                System.out.println("");
            } else {
                passwordCount.put(password, 0);
            }
        }

        Object[] values2sort = passwordCount.values().toArray();
        Arrays.sort(values2sort);
        List<Object> top10 = new ArrayList<>();

        for (Object e : values2sort) {
            for (Object val : passwordCount.keySet()) {
                if (passwordCount.get(val).equals(e)) {
                    top10.add(val);
                }
            }
        }
    }

}
