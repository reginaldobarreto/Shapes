package program;

import enun.Color;
import model.Circle;
import model.Elipse;
import model.Rectangle;
import model.Shape;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int amount = scanner.nextInt();
        for (int i = 1; i <= amount ; i++) {
            System.out.print("Shape #" + i + " data: ");
            System.out.print("Rectangle, Circle or Elipse (R/C/E): ");
            String choice = String.valueOf(scanner.next().charAt(0));
            if(choice.equalsIgnoreCase("R")){
                System.out.print("Color (Black/Blue/Red): ");
                Color color = Color.valueOf(scanner.next().toUpperCase());
                System.out.print("Width: ");
                Double width = scanner.nextDouble();
                System.out.print("Height: ");
                Double height = scanner.nextDouble();
                list.add(new Rectangle(color,width,height));
            }else if(choice.equalsIgnoreCase("C")){
                System.out.print("Color (Black/Blue/Red): ");
                Color color = Color.valueOf(scanner.next().toUpperCase());
                System.out.print("Radius: ");
                Double radius = scanner.nextDouble();
                list.add(new Circle(color,radius));
            }else{
                System.out.print("Color (Black/Blue/Red): ");
                Color color = Color.valueOf(scanner.next().toUpperCase());
                System.out.print("Width: ");
                Double width = scanner.nextDouble();
                System.out.print("Height: ");
                Double height = scanner.nextDouble();
                list.add(new Elipse(color,width,height));
            }

        }
        scanner.close();

        System.out.println();
        System.out.println("Shape Areas");
        for (Shape obj:list) {
            System.out.print("Color: " + obj.getColor() + String.format(" - Area: %.2f%n",obj.area()));
        }
    }
}
