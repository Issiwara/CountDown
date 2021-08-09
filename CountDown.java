package Ques02;

public class CountDown extends Thread {

    public void run()
    {
        synchronized (CountDown.class)
        {
            for(int i =0; i<10;i++)
            {
                System.out.println(i+1);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
        }
    }
    
}
