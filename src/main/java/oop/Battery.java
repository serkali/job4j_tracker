package oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(100);
        Battery battery2 = new Battery(0);
        System.out.println("Charge battery1:" + " " + battery1.load + " "
                + "Charge battery2:" + " " + battery2.load);
        battery1.exchange(battery2);
        System.out.println("Charge battery1:" + " " + battery1.load + " "
                + "Charge battery2:" + " " + battery2.load);

    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }
}
