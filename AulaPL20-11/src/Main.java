public class Main {
    public static void main(String[] args) {
        MyThread mythread1 = new MyThread("1");
        MyThread mythread2 = new MyThread("2");
        MyThread mythread3 = new MyThread("3");
        mythread1.start();
        mythread2.start();
        mythread3.start();

        System.out.println("Eu sou o thread principal.");
    }
}