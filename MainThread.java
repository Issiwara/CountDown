package Ques02;

public class MainThread {    
    public static void main(String[] args) throws InterruptedException {

        CountDown countdown1 = new CountDown();
        Thread countdown = new Thread(new CountDown());
        
        //implement Runable
        Thread calcsum1 = new Thread(new CalcSum());
        Thread calcsum2 = new Thread(new CalcSum());

        calcsum1.setName("Black");
        calcsum2.setName("White");

        countdown.start();
        countdown.join();

        calcsum1.start();
       calcsum1.join();

        calcsum2.start();e
      calcsum2.join();


    }
}
