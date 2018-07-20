package javaapp180720;

import java.io.IOException;
import java.net.ServerSocket;
class Java01 {
        Java01() throws Exception{
        ServerSocket SS;
        SS=new ServerSocket(8888);
        System.out.println("ServerOK");
  }        
}
class myException extends Exception{
    myException(){
        super("aaa");
    }
    myException(String s){
        super(s);
    }
    public String getMessage(){
        return super.getMessage()+"123";
    }
}
class mymyException extends myException{
    
}

//class JOB implements Runnable  {

class JOB extends Thread  {





    private String jobName;
    private int loopLmt;
    public JOB(int loopLmt, String jobName) {
        this.loopLmt = loopLmt;
        this.jobName = jobName;
    }
    private long PAUSE(double sec) {
        long x=0;
       try {
           Thread.sleep(x);}
       catch(InterruptedException ie) {}; 
       return x;
    }


    public void run() {
        long x=0;
      for(int i=1; i<=loopLmt; i++) {
         System.out.print(this.jobName );
         x= Math.round(1000.0*Math.random());
          System.out.print(" work"+i);
          System.out.print(" priority="+this.getPriority());
          System.out.print(" ms="+x);
          System.out.println("");
         PAUSE(x);
      }
    }




    
}


public class JavaApp180720 {
    public static void main(String[] args) throws Exception {
        poi05();
        int x = Integer.parseInt("123");//字串轉數字
        String y =String.valueOf(123);//數字轉字串
    }
    public static void poi05(){
      JOB job1 = new JOB(4,"job1");
      JOB job2 = new JOB(4,"job2");
      JOB job3 = new JOB(4,"job3");
    //job1.setPriority(1);
    //job2.setPriority(3);
    //job3.setPriority(2);
     job1.setPriority(Thread.MAX_PRIORITY);
     job2.setPriority(Thread.NORM_PRIORITY);
     job3.setPriority(Thread.MIN_PRIORITY);
      job1.start();
      job2.start();
      job3.start();
    }
    public static void poi04(){
        //JOB job1 = new JOB(4,"job1");
        //JOB job2 = new JOB(8,"job2");
        Thread job1 = new Thread(new JOB(4,"job1"));
        Thread job2 = new Thread(new JOB(8,"job2"));
        job1.start();
        job2.start();
       System.out.println("job1 is alive : " +job1.isAlive());
         try{job1.join();}
         catch(InterruptedException ie){}
         finally{System.out.println("finlly");}
      System.out.println("job1 is alive : " +job1.isAlive());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static void poi03(){
        int x, y;
        myException f = new myException("11");
        try {
           x = 10;
           y = 0;
           //if(y==0) throw new Exception("my Message");
           //if(y==0) throw new myException();
           //if(y==0) throw new myException();
           x = 10 / 0; 
           System.out.println("x= "+ x);
         }
        catch (Exception e){
           System.out.println(e.getMessage());
           System.out.println(f.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static void poi02() throws Exception {
       Java01 aa= new Java01();
    }        
    public static void poi01(){
        int x=0;
        try{
            x=10/0;
        }catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.hashCode());
        }finally{
            System.out.println("finally");
        }
        System.out.println("ok");
    }
}
