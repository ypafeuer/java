
package javaapplication7;

import java.io.IOException;

public class JavaApplication7{
    public static void main(String[] args) {
            try{
                dosometing();
            }
            catch(Exception e){
                System.out.println(""+e);
            }
            
        }

    static void dosometing() throws IOException {
        if(2>1) {
            throw new IOException();
        }else{
            throw new RuntimeException();
        }
    }
    
}
