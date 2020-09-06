package OOPandInheritance.ClassesAndObjects;

import java.util.Scanner;

/* Create a class Box that uses a parametrized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities. */
class Box{
    int height, weight, depth;
    public Box(int height, int weight, int depth){
        this.height=height;
        this.weight=weight;
        this.depth=depth;
    }
    public int volume(){
        return height*weight*depth;
    }
}
public class Program1 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int h=scan.nextInt();
		int w=scan.nextInt();
		int d=scan.nextInt();
		Box b1=new Box(h,w,d);
		System.out.println("Vol of Box: " + b1.volume());
    }
}
