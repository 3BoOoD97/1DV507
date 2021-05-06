package ad222uk_assign3.count_words;

public class Word implements Comparable<Word> {
    private String word;

    public Word(String str) {
        word = str;
    }

    public String toString() {
        return word;
    }

    @Override
    public int hashCode() {
        return word.toLowerCase().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }

    
    public int compareTo(Word w) {
        for(int num = 0; num < word.length(); num++) {
            Character c = word.charAt(num);
            if(Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }


            if(num < w.toString().length()) {
                Character other = w.toString().charAt(num);
                if (Character.isUpperCase(other)) {
                    other = Character.toLowerCase(other);
                }

                if(c.compareTo(other) != 0) {
                    return c.compareTo(other);
                }
            }
            else {
                return 1; 
            }
        }
        
        if(w.toString().length() > word.length()) {
            return -1;
        }
        return 0;
    }
}