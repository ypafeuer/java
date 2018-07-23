package javaapplication7;
public class Java01 {
    public static void main(String[] args){
        Point p = new Point();
        p.setX(10);  // int -> Integer -> Object
        p.setY(20);
        int x = (Integer)p.getX();
        int y = (Integer)p.getY();
        System.out.println("This point is¡G" + x + ", " + y);
       
        p.setX(25.4);  // double -> Integer -> Object
        p.setY("444");
        double m = (Double)p.getX();
        double n = (Double)p.getY();
        System.out.println("This point is¡G" + m + ", " + n);
    }
}
class Point{
    Object x = 0;
    Object y = 0;
    public Object getX() {
        return x;
    }
    public void setX(Object x) {
        this.x = x;
    }
    public Object getY() {
        return y;
    }
    public void setY(Object y) {
        this.y = y;
    }
}
