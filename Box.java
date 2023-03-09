import java.util.*;
class Box
{
double width;
double height;
double depth;
}//box
class BoxDemo {
public static void main(String[] args) {
Box mybox=new Box();
mybox.width=100;
mybox.height=200;
mybox.depth=150;
double vol=mybox.width*mybox.height*mybox.depth;
System.out.println("volume is"+vol);
}//main
}//class
