package oop;

public class Reduce {
    private int[] max;

    public void to(int[] array) {
        this.max = array;
    }

    public void print() {
        for (int index = 0; index < max.length; index++) {
            System.out.println(max[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
