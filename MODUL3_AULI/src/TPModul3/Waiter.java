package TPModul3;

public class Waiter implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int foodprice = 25000;


    @Override
    public void run() {

        while (true) {
            getFood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public Waiter(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }
    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("ID Customer: " + this.customerID);
        System.out.println("Jumlah makanan: " + this.orderQty);
        System.out.println("Total harga: " + this.orderQty * foodprice);
        System.out.println("==========================================================");
    }


    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: Makanan siap di antar");
            Restaurant coffeeMachine = new Restaurant();
            coffeeMachine.setWaitingForPickup(false);


            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: beritahu restaurant untuk membuat makanan lagi\n");

        }
    }
}
