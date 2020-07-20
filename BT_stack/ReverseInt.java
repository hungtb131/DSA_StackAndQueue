package StackAndQueue.Baitap.Thuchanh.BT_stack;

public class ReverseInt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Integer[] integers = new Integer[5];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        integers[3] = 4;
        integers[4] = 5;
        System.out.println("Integer array is: ");
        for (int i = 0; i < integers.length; i++){
            System.out.print(integers[i] + "\t");
        }
        System.out.println();

        for (Integer integer : integers){
            stack.push(integer);
        }

        {
            int i = 0;
            while (i < integers.length) {
                integers[i] = stack.pop();
                i++;
            }
        }

        System.out.println("Integer array after reverse is: ");
        for (int i = 0; i < integers.length; i++){
            System.out.print(integers[i] + "\t");
        }
    }
}