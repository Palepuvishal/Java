/*Develop a Java program to create an abstract class named Shape that contains two integers and an empty methodnamed printArea( ). Provide three classes named  Rectangle, Triangle and Circle such that each one of the
classes extends the class Shape. Each one of the classes contain only the method printArea( ) that prints the area

of the given shape.*/

import java.util.Scanner;

abstract class shape{
	double d1;
	double d2;
	abstract void printArea();
}

class Rectangle extends shape{
	Rectangle(double length,double breath){
		this.d1 = length;
		this.d2 = breath;
	}
	void printArea(){
		System.out.println("Area is "+ (d1*d2));
	}
}

class Triangle extends shape{
	Triangle(double height,double base){
		this.d1 = height;
		this.d2 = base;
	}
	void printArea(){
		System.out.println("Area is "+ (0.5*d1*d2));
	}
}

class Circle extends shape{
	Circle(double radius){
		this.d1 = radius;
	}
	void printArea(){
		System.out.println("Area is "+ (2*3.14*d1));
	}
}

class Abstractdemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle(5.0,10.0);
		Triangle tri = new Triangle(5.0,25.0);
		Circle cir = new Circle(5.0);
		rec.printArea();
		tri.printArea();
		cir.printArea();
	}
}