//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//class MyRunnable implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("Thread is running "+ Thread.currentThread().getName());
//    }
//}

//class MyTask implements Runnable{
//    private String taskName;
//    private String symbol;
//
//    public MyTask(String taskName, String symbol){
//        this.taskName = taskName;
//        this.symbol = symbol;
//    }
//
//    @Override
//    public void run(){
//        for(int i=0;i<=100;i++){
//            System.out.println(symbol +" "+ taskName + " "+i +"Executing in thread "+ Thread.currentThread().getName());
//        }
//    }
//}

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Execution " + (i+1) + " on thread: " + Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Resource{
    private final String name;

    public Resource (String name){
        this.name = name;
    }

    public synchronized void method1(Resource other){
        System.out.println(Thread.currentThread().getName() + " acquired lock on " + this.name);
        System.out.println(Thread.currentThread().getName() + " trying to acquire lock on " + other.name);
        other.method2();
    }

    public synchronized void method2(){
        System.out.println(Thread.currentThread().getName() + " acquired lock");

    }

    @Override
    public String toString(){
        return this.name;
    }
}

class Counter{
    private int count = 0;

    public void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("This thread is " + Thread.currentThread().getName());

//        Thread thread1 = new Thread(new MyTask("task1", "#"));
//        Thread thread2 = new Thread(new MyTask("task2", "$"));
//
//        thread1.start();
//        thread2.start();

//        Thread thread3 = new Thread(new MyThread("Thread-3"));
//        thread3.start();

        Resource r1 = new Resource("R1");
        Resource r2 = new Resource("R2");

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=0;i<1000;i++){
                System.out.println("#");
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("$");
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());

    }
}