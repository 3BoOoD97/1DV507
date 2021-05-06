package ad222uk_assign3.count_words;

import java.util.ArrayList;
import java.util.Iterator;

public class TreeWordSet implements WordSet {
    private BST root = null;
    private int sz= 0;

    
    @Override
    public 	Iterator iterator() { // dont know why it is wrong
    }
    
    @Override
    public int size() {
        return sz;
    }

    @Override
    public boolean contains(Word word) {
        return root.contains(word);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator iterator = iterator();
        BST node;
        while(iterator.hasNext()) {
            node = iterator.next();
            sb.append(node.toString() + "\r\n");
        }
        return sb.toString();
    }

 

    @SuppressWarnings("rawtypes")
	private class Iterator implements java.util.Iterator {
        BST node = null;

        @Override
        public boolean hasNext() {
            if(node == null) {
                return root != null;
            }
            return root.getSmaller(node.word) != null;
        }

        @Override
        public BST next() {
            if(node == null) {
                node = root;
                while(node.right != null) {
                    node = node.right;
                }
                return node;
            }
            node = root.getSmaller(node.word);
            return node;
        }
    }
    
    @Override
    public void add(Word word) {
        if(root == null) {
            root = new BST(word);
            sz++;
        }
        else {
            root.add(word);
        }
    }


    private class BST {
        Word word;
        BST left = null;
        BST right = null;

        BST(Word w) {
            word = w;
        }

        private void add(Word w) {
            if(word.compareTo(w) > 0) {
                if(right == null) {
                    right = new BST(w);
                    sz++;
                }
                else {
                    right.add(w);
                }
            }

            if(word.compareTo(w) < 0) {
                if(left == null) {
                    left = new BST(w);
                    sz++;
                }
                else {
                    left.add(w);
                }
            }
        }
        private boolean contains(Word w) {
            if(word.compareTo(w) > 0) {
                if(right == null) {
                    return false;
                }
                else {
                    return right.contains(w);
                }
            }
            if(word.compareTo(w) < 0) {
                if(left == null) {
                    return false;
                }
                else {
                    return left.contains(w);
                }
            }
            return true;
        }
        public String toString() {
            return word.toString();
        }
        private BST getSmaller(Word w) {
            BST node = null;
            // Dive recursively right
            if(right != null) {
                node = right.getSmaller(w);
            }
            if(node != null) {
                return node;
            }
            // If the current node should come after w, return it
            if(w.compareTo(word) < 0) {
                return this;
            }
            // Dive recursively left
            if(left != null) {
                node = left.getSmaller(w);
            }
            if(node != null) {
                return node;
            }
            // If nothing matches, then either the list is empty or we're done. return null
            return null;
        }
    
}}