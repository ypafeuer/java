
package javaapplication12;

public class JavaApp180724 {
    //public static void main(String[] args) {}    
    public static void main(String[] args){
        System.out.println("main");
    }
    static void one(){     
        two();
        JavaApp180724.two();
        //three(); // non-static
        //JavaApplication12.four(); // non-static
    }
    static void two(){/**/}
    void three(){
        one();
        JavaApp180724.two();
        four();
        //JavaApplication12.four(); //non-static
    }
    void four(){/**/}
    
    
        

    
}
