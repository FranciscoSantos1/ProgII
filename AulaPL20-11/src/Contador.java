import java.util.concurrent.ExecutionException;

public class Contador extends Thread{

    private int contador = 0;

    private void incrementa(){
        try {
            Thread.sleep(1000);
            contador++;
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
