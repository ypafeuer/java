package javaapp180719;

import java.util.Scanner;
class TEST{
    public String toString(){
        return "AAAA";
    }
}
class circle{
    public circle(int x, int y ,int r){
        System.out.println("circle建構子");
    }
    private int x=0,y=0;
    private int r=10;
    void setx(int x){this.x=x;}
    void sety(int y){this.y=y;}
    void setxy(int x,int y){setx(x);sety(y);}
    void setr(int r){this.r=r;}
     public String toString(){
        System.out.println(""+x+y+r);
        return "圓心="+x+","+y+" 半徑="+r+"";
    }
}
class cylinder extends circle{
    public cylinder(int x, int y,int r) {
        super(x, y,r );
        System.out.println("cylinder建構子");
    }
    private int x=0,y=0;
    private int r,z=10;

    void setz(int z){this.z=z;}
    public String toString(int x,int y){
        System.out.println(""+x+y+r+z);
        return "圓心="+x+","+y+" 半徑="+r+" 高度="+z;
    }

}
public class JavaApp180719 {
    JavaApp180719(){
        System.out.println("JavaApp180719");
    }
    int id;
    void h(){}
    public static void main(String[] args) {
        ppp07();
        System.out.println("#main");
    }
    public static void ppp07(){
        cylinder cc=new cylinder(1,2,3);
        cc.setxy(3,4);
        cc.setr(5);
        cc.setz(6);
        
        System.out.println(""+cc);
        
    }
    public static void ppp06(){
        String aa01="這是一個測試字串";
        String aa02=new String(aa01);
        String aa03=new String("這是一個測試字串");
        char b[] = new char[4];
        aa01.getChars(0, 1,b, 0);
        System.out.println(b);
        aa01.getChars(0, 2,b, 0);
        System.out.println(b);
        aa01.getChars(0, 3,b, 0);
        System.out.println(b);
        aa01.getChars(0, 4,b, 0);
        System.out.println(b);
        
    }
    public static void ppp05(){
        String aa01="a";
        System.out.println(""+aa01.compareTo("a"));
        System.out.println(""+aa01.compareTo("b"));
        System.out.println(""+aa01.compareTo("c"));
        System.out.println(""+aa01.compareTo("bcg"));
        String aa02="中文";
        System.out.println(""+aa02.compareTo("中文"));
        System.out.println(""+aa02.compareTo("日文"));
        System.out.println(""+aa02.compareTo("英文"));
        
    }
    public static void ppp04(){
        String aa01="這是一個oo測試字串";
        System.out.println(""+aa01.charAt(0));
        for(int i =0;i<aa01.length();i++){
            System.out.println(""+aa01.charAt(i));  
        }
        kk newkk=new kk();
    }
    public static void ppp03(){
        TEST t= new TEST();
        String aa01="這是一個測試字串";
        String aa02=new String("uuu");
        String aa011=aa01+t;
        String aa021=aa02+t;
        System.out.println(aa01);
        System.out.println(aa02);
        System.out.println(aa011);
        System.out.println(aa021);
    }
    public static void ppp02(){
        String aa01="這是一個測試字串";
        String aa02=new String(aa01);
        System.out.println(aa01==aa02);
        System.out.println(aa01.equals(aa02));
        String aa03="TTTTT";
        String aa04="ttTTT";
        System.out.println(aa03==aa04);
        System.out.println(aa03.equalsIgnoreCase(aa04));
        
        
    }
    public static void ppp01(){
        int[] aa={10,20,30,40,50};
        int max=aa[0];
        int min=aa[0];
        for(int i =0;i<aa.length;i++){
                if(aa[i]>max){max=aa[i];}
                if(aa[i]<min){min=aa[i];}
        }
        double[] bb={10.1,20.1,30.1,40.1,50.1};
        double maxbb=bb[0];
        double minbb=bb[0];
        
        System.out.println("max="+max);        
        System.out.println("min="+min );        
        for(int i =0;i<bb.length;i++){
                if(bb[i]>maxbb){maxbb=bb[i];}
                if(bb[i]<minbb){minbb=bb[i];}
        }
        
        System.out.println("max="+maxbb);        
        System.out.println("min="+minbb );        
        
    }
    public void ppp(){
        for(int i =0;i<5;i++){}
        
        Scanner sc= new Scanner(System.in);
        System.out.print("請輸入:");
        int a=sc.nextInt();

    }
}
