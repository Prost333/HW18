import java.util.concurrent.Semaphore;

public class Car implements Runnable{
    public String name;
    Semaphore semaphore;

    public Car(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public void setSemaphore(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(name+ " хочет заехать на остановку");
        try {
            semaphore.acquire();
            for (int i=0; i<50;i++){
                System.out.println(name+" стоит на остановке");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }semaphore.release();
    }
}
