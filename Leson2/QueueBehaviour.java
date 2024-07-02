/*group6380.Mozyakov; */

public interface QueueBehaviour {
    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();
}