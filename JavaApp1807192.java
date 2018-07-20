package javaapp180719.pkg2;
abstract class cls0{
    abstract double area();
}

class cls01 extends cls0{
    int x;
    public cls01(){}
    public cls01(int x){this.x=x;}
    double area(){return 3.14*this.x*this.x;}
}
class cls02 extends cls0{
    int x;
    public cls02(){}
    public cls02(int x){this.x=x;}
    double area(){return this.x*this.x;}
}
class cls03{
    double  x;
    public cls03(){}
    public cls03(double x){this.x=x;}
    //int res01(cls01 x){return x.sum()*this.x;}
    //int res02(cls02 x){return x.sum()*this.x;}
    double res0(cls0 x){return x.area()*this.x;}
    double res0(cls0... x){
        double total=0.0;
        for(cls0 aa:x){
            //System.out.println(aa);
            total+=res0(aa);
        }
        return total;
    }

}
public class JavaApp1807192 {

    public static void main(String[] args) {
       cls01 cc01 = new cls01(2);
       cls02 cc02 = new cls02(2);
       cls03 cc03 = new cls03(6);
        System.out.println("圓形"+cc03.res0(cc01));
        System.out.println("正方形"+cc03.res0(cc02));
        
        //System.out.println(""+cc03.res0( new cls0[] {cc01,cc02} ));
        System.out.println("加總"+cc03.res0( cc01,cc02 ));
       //cc02.show(1);

       
    }
    
}
