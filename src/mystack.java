public class mystack {

    private int capacity = 3;
    private int size = 0;
    private int[] array = new int[capacity];
    private int top = -1;
    private void addCapacity(){
        if (size == capacity) {
            capacity = capacity * 2;
            int[] temp = new int[capacity];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
    }

    public boolean empty(){
        return top == -1;
    }

    public int size(){
        return size;
    }

    public void push(int value){
        addCapacity();
        array[++top] = value;
        size++;
    }

    public int peek(){
        return array[top];
    }

    public int pop(){
        if (empty()) {
            throw new RuntimeException("stack is empty");
        }
        peek();
        size--;
        return array[top--];
    }

    public String toString() {
        if (empty()) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(array[i]).append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        return String.format("[%s]", sb);
    }

}
