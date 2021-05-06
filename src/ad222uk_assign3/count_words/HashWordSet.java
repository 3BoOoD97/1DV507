package ad222uk_assign3.count_words;

public class HashWordSet implements WordSet {
    private Node[] buckets = new Node[8];
    int sz = 0;

    
    @Override
    public void add(Word word) {
        if(!contains(word)) {
            int position = getBucketNumber(word);
            Node node = new Node(word);
            node.next = buckets[position];
            buckets[position] = node;
            sz++;
            if(sz == buckets.length) {
                rehash();
            }
        }
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public boolean contains(Word word) {
        int position = getBucketNumber(word);
        Node node = buckets[position];
        while(node != null) {
            if(node.word.equals(word)){
                return true;
            }
            else {
                node = node.next;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator iterator = iterator();
        Node node;
        while(iterator.hasNext()) {
            node = iterator.next();
            sb.append(node.toString());
            if(iterator.hasNext()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private int getBucketNumber(Word word) {
        int hc = word.hashCode();
        if(hc < 0) {
            hc = -hc;
        }
        return hc % buckets.length;
    }

    private void rehash() {
        Node[] temp = buckets;
        buckets = new Node[2*temp.length];
        sz = 0;
        for (Node node : temp) {
            if (node == null) continue;
            while (node != null) {
                add(node.word);
                node = node.next;
            }
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator();
    }

    private class Node {
        Word word;
        Node next = null;

        public Node(Word w) {
            word = w;
        }

        public String toString() {
            return word.toString();
        }
    }

    public class Iterator implements java.util.Iterator<Node> {
        int i = 0;
        Node node = buckets[i];

        public boolean hasNext() {
            return i < buckets.length || node.next != null;
        }

        public Node next() {
            if(node.next != null) {
                node = node.next;
            }
            else if(i < buckets.length) {
                i++;
                while(buckets[i] == null && i < buckets.length) {
                    i++;
                }
                node = buckets[i];
            }
            else {
                node = null;
            }
            return node;
        }
    }
}