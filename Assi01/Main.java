package Assi01;
import java.util.*;
import java.io.*;
public class Main{
    static ArrayList<Shape> readFile(String fname) throws FileNotFoundException, InvalidInputException,NoSuchElementException{
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(fname)));
        int num = scanner.nextInt();
        ArrayList<Shape> shapes = new ArrayList<Shape>(num);
        while(scanner.hasNext()){
            Shape s;
            switch (scanner.next()) {
                case "c":
                    s = new Circle(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
                    break;
                case "s":
                    s = new Square(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
                    break;
                case "h":
                    s = new Hexagone(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
                    break;
                case "t":
                    s = new Rtriangle(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
                    break;
                default:
                    throw new InvalidInputException("Input is invalid or There has to be more than 4 fields");
            }
            shapes.add(s);
        }
        return shapes;
    }  
    
    public static void main(String[] args) throws FileNotFoundException, NoSuchElementException, InvalidInputException{
        try {
            System.out.println("Enter File Name: ");
            Scanner scanner = new Scanner(System.in);
            String filename = scanner.nextLine();
            scanner.close();
            ShapeCollection coll = new ShapeCollection(readFile(filename));
            String MaxShape = coll.getMaxShape();
            System.out.println(MaxShape); 
         } catch (FileNotFoundException ex) {
             System.out.println("File not found!");
            System.exit(-1);
         } catch (InvalidInputException ex) {
             System.out.println("Invalid input!");
             System.out.println(ex.getMessage());
            System.exit(-1);
        } catch (NoSuchElementException ex) {
             System.out.println("File is empty or It's not in the correct format");
             System.exit(-1);
        }
     
        
    }
}