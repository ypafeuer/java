
package javaapplication6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class JavaApplication6 {
    static CopyOnWriteArraySet<String> arr= new CopyOnWriteArraySet<>();
    static void verify(){
        String var="";
        Iterator<String> e = arr.iterator();
        while(e.hasNext()){
            var =e.next();
            if(var.equals("A")){//等於A就移除
                arr.remove(var);
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list1=new ArrayList<>();
        list1.add("A");
        list1.add("B");
        ArrayList<String> list2=new ArrayList<>();
        list2.add("A");
        list2.add("D");
            System.out.println(list1);
            System.out.println(list2);
            System.out.println(arr);
        arr.addAll(list1);
            System.out.println(arr);
        arr.addAll(list2);
            System.out.println(arr);//重複的梅加入
        verify();//等於A就移除
            System.out.println(arr);
        for(String var :arr){
            System.out.println(var+" ");
        }
        
    }
    
}
