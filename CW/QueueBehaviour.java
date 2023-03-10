package Seminar2.CW;

public interface QueueBehaviour {
    void takeInQueue(Buyer actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
