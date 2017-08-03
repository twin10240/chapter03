package com.bigdata2017.paint.main;

import java.util.ArrayList;

import com.bigdata2017.paint.main.i.Drawable;
import com.bigdata2017.paint.main.i.Resizable;
import com.bigdata2017.paint.point.ColorPoint;
import com.bigdata2017.paint.point.Point;
import com.bigdata2017.paint.shape.Circle;
import com.bigdata2017.paint.shape.Rectangle;
import com.bigdata2017.paint.shape.Shape;
import com.bigdata2017.paint.shape.Triangle;

public class PaintApp {
	public static void main(String[] args) {
		Point point1 = new Point(100, 50);
		point1.show();
		point1.show(false);
		
		draw(new Point(200, 200));
		draw(new ColorPoint(300, 100, "red"));
		draw(new ColorPoint(200, 200, "yellow"));
		
		//Shape
		draw(new Triangle());
		draw(new Rectangle());
		draw(new Circle(10, 20, 5));
		
		resize(new Triangle());
		resize(new Rectangle());
		resize(new Circle(10, 20, 5));
		
		// instanceof 는 클래스 경우에 상속 관계에 있을 때 연산이 가능
		Shape s1 = new Rectangle();
		System.out.println(">> " + (s1 instanceof Object));
		System.out.println(">> " + (s1 instanceof Shape));
		System.out.println(">> " + (s1 instanceof Triangle));
		System.out.println(">> " + (s1 instanceof Rectangle));
		
		Triangle s2 = new Triangle();
		System.out.println(">> " + (s2 instanceof Object));
//		System.out.println(">> " + (s2 instanceof Rectangle));
		
		Object s3 = new Rectangle();
		System.out.println(">> " + (s3 instanceof String));
		System.out.println(">> " + (s3 instanceof ArrayList));
	}
	
	/*private static void drawPoint(Point point) {
		point.show();
	}
	
	private static void drawShape(Shape shape) {
		shape.draw();
	}*/
	
	private static void draw(Drawable drawable) {
		drawable.draw();
	}
	
	private static void resize(Shape shape) {
		if (shape instanceof Resizable == false) {
			return;
		}
		
		System.out.println(shape instanceof Drawable);
		
		Resizable resizable = (Resizable) shape;
		resizable.resize(0.5);
	}
}
