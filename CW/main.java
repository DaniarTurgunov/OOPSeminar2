package Seminar2.CW;

public class main {
    public static void main(String[] args) {
        Human hm = new Human();
        hm.name = "Petr";
        Market mk = new Market();
        mk.acceptToMarket(hm);
        mk.takeInQueue(hm);
        mk.giveOrders();
        mk.takeOrders();
        mk.releaseFromQueue();
        mk.releaseFromMarket(hm);
        mk.update();
    }
}
