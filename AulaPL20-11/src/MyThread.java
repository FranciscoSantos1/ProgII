public class MyThread extends Thread{
    private String name;
    private Contador conta;

    public MyThread(String name, Contador conta){
        this.name = name;
    }

    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("I am " + getName() + "contador " + conta.incrementa());
        }
    }


    /*public void run() {
        System.out.println("I'm gonna sleep " + this.name);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Im awake." + this.name);
    }*/

}
