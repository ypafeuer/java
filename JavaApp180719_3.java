package javaapp180719_3;

import java.util.Scanner;

abstract class cc01{
    abstract void show();
}
abstract class cc0101 extends cc01 {
    //
}


class cc010101 extends cc0101 implements cc02,cc03 {
    public void show(){}
    public void show01(){}
    
    int max(int a1,int a2,int a3){ 
        int max=a1;
        if(a2>max){max=a2;}
        if(a3>max){max=a3;}
        return max;
    }
    double max(double a1,double a2,double a3){
        double max=a1;
        if(a2>max){max=a2;}
        if(a3>max){max=a3;}
        return max;
    }
    int min(int a1,int a2,int a3){ 
        int min=a1;
        if(a2<min){min=a2;}
        if(a3<min){min=a3;}
        return min;
    }
    double  min(double a1,double a2,double a3){ 
        double min=a1;
        if(a2<min){min=a2;}
        if(a3<min){min=a3;}
        return min;
    }
    
}

interface cc02{
    void show01();
}
interface cc03{
}
public class JavaApp180719_3 {

    public static void main(String[] args) {
        double ad[]={ 1.1, 2.2, 3.3, 4.5, 6.3};
        int ai[]={1,2,3,4,5};
        Scanner sc= new Scanner(System.in);
        System.out.print("請輸入三個整數:");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        System.out.print("請輸入三個福點數:");
        double d1=sc.nextDouble();
        double d2=sc.nextDouble();
        double d3=sc.nextDouble();


        cc010101 cci010101=new cc010101();
        System.out.println("整數最大"+cci010101.max(a1,a2,a3));
        System.out.println("整數最小"+cci010101.min(a1,a2,a3));
        System.out.println("福點數最大"+cci010101.max(d1,d2,d3));
        System.out.println("福點數最小"+cci010101.min(d1,d2,d3));
        
        
    }
    
}
