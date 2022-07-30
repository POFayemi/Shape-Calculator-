package examinationclassic;
import java.util.Scanner;
public class Examinationclassic{
    public static void main(String [] args ){
    System.out.println("Circle\'s Calculator") ;
    System.out.println("The calculator is designed to calculate the area and the perimeter of  circle ") ;
    // the area is represented to be Area
    // while the perimeter is to be Perimeter
    //  the variable to represent the radius is r
    // the variable to represent the pie is p
    double Area,Perimeter,r,p;
    // double is used since there are tendencies for all values to be in decimal points 
    // the scanner class is used to give user the flexible choices of the value of the radius 
    Scanner circle=new Scanner(System.in);
    System.out.println("What is the radius of the circle ") ;
    r=circle.nextDouble();
    p=3.145;
    Area=p*(r*r);
    System.out.println("The area of the circle is : " + Area + "cm") ;
    Perimeter=2*p*r;
    System.out.println("The perimeter of a circle with radius " + r + " is " + Perimeter + "cm");
    // note to convert from cm to metre the value in cm is divided by 100
    double pp,aa;
    
    aa=Area/100;
    System.out.println("Area of the circle converted to m is : " + aa + "m") ;
     pp=Perimeter/100;
    System.out.println("Perimeter of the circle converted to m is : " + pp + "m") ;
    }
}
