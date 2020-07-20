package StackAndQueue.Baitap.Thuchanh.Optional_StackArray;

public class StackArray {
    private int arr[];
    private int size;
    private int index = 0;

    public StackArray(){
    }

    public StackArray(int size) {
        this.size = size;
        arr = new int[size];
    }


    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }
//check
    public void push(int element){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public int size() {
        return index;
    }
}
