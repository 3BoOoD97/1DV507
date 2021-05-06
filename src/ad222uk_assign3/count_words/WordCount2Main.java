package ad222uk_assign3.count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WordCount2Main {
public static void main(String[] args) {
    HashWordSet wordHashSet = new HashWordSet();
    TreeWordSet wordTreeSet = new TreeWordSet();
    String filepath = "C:\\Users\\abodn\\Desktop\\New folder\\1.TXT";
    if(args.length != 0) {
        filepath = args[0];
    }
    else {
        System.out.println("CountChars expects a filepath as a parameter!");
        System.exit(1);
    }

    try {
        File file = new File(filepath);
        Scanner fileScan = new Scanner(file);
        StringBuilder sb = new StringBuilder();

        while(fileScan.hasNext()) {
            String row = fileScan.nextLine();
            // Loop through the row, checking each character
            for(int i = 0; i < row.length(); i++) {
                char character = row.charAt(i);

                if(Character.isLetter(character)) {
                    sb.append(character);
                }
                else {
                    if(sb.length() > 0) {
                        wordHashSet.add(new Word(sb.toString()));
                        wordTreeSet.add(new Word(sb.toString()));
                    }

                    sb = new StringBuilder();
                }
            }
            if(sb.length() > 0) {
                wordHashSet.add(new Word(sb.toString()));
                wordTreeSet.add(new Word(sb.toString()));
            }

            sb = new StringBuilder();
        }

        System.out.println(wordTreeSet.toString());

        System.out.println();
        System.out.println();
        System.out.println("HashSet size: " + wordHashSet.size());
        System.out.println("TreeSet size: " + wordTreeSet.size());

    }
    catch(FileNotFoundException e) {
        System.out.println(" File is not found.");
        System.exit(1);
    }
    catch(Exception e) {
        e.printStackTrace();
    }
}
}