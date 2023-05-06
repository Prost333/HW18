import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(1);
        Car car1 =new Car("AUDI",semaphore);
        Car car2 =new Car("WV",semaphore);
        Car car3 =new Car("BMW",semaphore);
        Car car4 =new Car("Mercedes",semaphore);
        Thread car1THR=new Thread(car1,car1.getName());
        Thread car2THR=new Thread(car2,car2.getName());
        Thread car3THR=new Thread(car3,car3.getName());
        Thread car4THR=new Thread(car4,car4.getName());
        car1THR.start();
        car2THR.start();
        car3THR.start();
        car4THR.start();


    }
}