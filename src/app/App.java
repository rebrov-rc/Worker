package app;


public class App {

    public void run(){

        OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener, x -> listener.onDone(x));
        worker.start(100);

    }
}
