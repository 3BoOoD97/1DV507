package ad222uk_assign1;


public class ArrayIntStack extends AbstractIntCollection implements IntStack {

	public void push(int n) {
        if(this.values.length == this.size) {
            this.resize();
        }
        this.values[size++] = n;
    }

    public int pop() {
        if(size > 0) {
            return this.values[--size];
        }
        throw new IndexOutOfBoundsException();
    }

    public int peek() {
        if(size > 0) {
            return this.values[size - 1];
        }
        throw new IndexOutOfBoundsException();
    }
}