package ad222uk_assign3.count_words;

import ad222uk_assign3.count_words.HashWordSet.Iterator;

public interface WordSet extends Iterable {
    void add(Word word); // Add word if not already added
    boolean contains(Word word); // Return true if word contained
    int size(); // Return current set size
    String toString(); // Print contained words
	Iterator iterator();

}