/**
 * Classe onde testamos o Pool de Thread
 */

import java.util.concurrent.*;

public class ThreadPoolTest {
	
    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newFixedThreadPool(4);
    
		executorService.execute(new WorkerThread(1));
		executorService.execute(new WorkerThread(2));
		executorService.execute(new WorkerThread(3));
		executorService.execute(new WorkerThread(4));
		
        executorService.shutdown();
    }
}