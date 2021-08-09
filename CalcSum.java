package Ques02;

public class CalcSum implements Runnable {

    private long sum = 0;
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        
        synchronized (CalcSum.class)
        {
            for (int i = 0; i < 100000; i++) {
                sum += i;

                System.out.println("Current Thread : "+ Thread.currentThread().getName()+ "sum : "+sum);
                
            }
        }
        
    }

    
     
    
}
