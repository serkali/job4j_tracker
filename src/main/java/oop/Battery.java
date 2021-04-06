package oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(100);
        Battery battery2 = new Battery(0);
        System.out.println("Charge battery1:" + " " + battery1.load + " " + "Charge battery2:" + " " + battery2.load);
        battery2.exchange(battery1);
        System.out.println("Charge battery1:" + " " + battery1.load + " " + "Charge battery2:" + " " + battery2.load);

    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }
}
