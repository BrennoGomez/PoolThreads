/**
 * 
 * @author BRENO
 * WorkerThread classe onde existe uma tarefa que ser� executada por um thread
 * A tarefa faz algo e periodicamente informa o percentual de trabalho realizado
 */

public class WorkerThread implements Runnable {
	
    private int workerNumber;

    WorkerThread(int number) {
        workerNumber = number;
    }

    public void run() {
        for (int i=0; i<=100; i+=20) {
            
            System.out.println("Worker number: "
                + workerNumber
                + ", percent complete: " + i + "%");
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
    }
}