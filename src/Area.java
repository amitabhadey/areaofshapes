import java.util.*;
public class Area {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Please kindly enter your name.");
        String name = k.nextLine();

        System.out.println("Greetings " + name + "! Welcome to Area Calcualtor Program!");
        System.out.println("-----------------------------------------------------------");
        System.out.println();
        System.out.println("Press 1 to calculate Area of a Square");
        System.out.println("Press 2 to calculate Area of a Rectangle");
        System.out.println("Press 3 to calculate Area of a Rhombus");
        System.out.println("Press 4 to calculate Area of a Parallelogram");
        System.out.println("Press 5 to calculate Area of a Triangle");
        System.out.println("Press 6 to calculate Area of a Regular Pentagon");
        System.out.println("Press 7 to calculate Area of a Regular Hexagon");
        System.out.println("Press 8 to calculate Area of a Regular Heptagon");
        System.out.println("Press 9 to calculate Area of a Regular Octagon");
        System.out.println("Press 10 to calculate Area of a Circle");

        int num = k.nextInt();

        while (num < 1 || num > 10) {
            System.out.println("Oops! Please enter a valid number.");
            num = k.nextInt();
        }

        if (num == 1) {
            System.out.println("What is the length of a side of the Square?");
            double squareside = k.nextDouble();
            double squarearea = squareside * squareside;
            System.out.println("The Area of the Square is : " + squarearea);
        }

        if (num == 2) {
            System.out.println("What is the length of Rectangle?");
            double rectlength = k.nextDouble();
            System.out.println("What is the breadth of Rectangle?");
            double rectbreadth = k.nextDouble();
            double rectarea = rectlength * rectbreadth;
            System.out.println("The Area of the Rectangle is : " + rectarea);
        }

        if (num == 3) {
            System.out.println("Press 1 if you want to use the \"base times height method\"");
            System.out.println("Press 2 if you want to use the \"diagonals method\"");

            int rhomnum = k.nextInt();

            while (rhomnum < 1 || rhomnum > 2) {
                System.out.println("Oops! Please enter a valid number.");
                rhomnum = k.nextInt();
            }

            if (rhomnum == 1) {
                System.out.println("What is the length of the base?");
                double rhombase = k.nextDouble();
                System.out.println("What is the altitude(height)?");
                double rhomheight = k.nextDouble();
                double rhomarea = rhombase * rhomheight;
                System.out.println("The Area of the Rhombus is : " + rhomarea);
            }

            if (rhomnum == 2) {
                System.out.println("What is the length of diagonal 1");
                double rhomdiagonal1 = k.nextDouble();
                System.out.println("What is the length of diagonal 2");
                double rhomdiagonal2 = k.nextDouble();
                double rhomarea = (rhomdiagonal1 * rhomdiagonal2) / 2;
                System.out.println("The Area of the Rhombus is : " + rhomarea);
            }

        }

        if (num == 4) {
            System.out.println("What is the base of the Parallelogram?");
            double paralbase = k.nextDouble();
            System.out.println("What is the height of the Parallelogram?");
            double paralheight = k.nextDouble();
            double paralarea = paralbase * paralheight;
            System.out.println("The Area of the Parallelogram is : " + paralarea);
        }

        if (num == 5) {
            System.out.println("What is the base of the Triangle?");
            double tribase = k.nextDouble();
            System.out.println("What is the height of the Triangle?");
            double triheight = k.nextDouble();
            double triarea = (tribase * triheight) / 2;
            System.out.println("The Area of the Triangle is : " + triarea);

        }

        if (num == 6) {
            System.out.println("What is the side of the Pentagon?");
            double pentside = k.nextDouble();
            System.out.println("What is the apothem length?");
            double pentapothem = k.nextDouble();
            double pentarea = (5 / 2) * pentside * pentapothem;
            System.out.println("The Area of the regular Pentagon is : " + pentarea);

        }

        if (num == 7) {
            System.out.println("What is the side of the Hexagon?");
            double hexside = k.nextDouble();
            double hexarea = ((3 * Math.sqrt(3)) / 2) * Math.pow(hexside, 2);
            System.out.println("The Area of the regular Hexagon is : " + hexarea);

        }

        if (num == 8) {
            System.out.println("What is the perimeter of the regular Heptagon?");
            double heptperimeter = k.nextDouble();
            System.out.println("What is the apothem?");
            double heptapothem = k.nextDouble();
            double heptarea = (heptperimeter * heptapothem) / 2;
            System.out.println("The Area of the regular Heptagon is : " + heptarea);
        }

        if (num == 9) {
            System.out.println("What is the side of the regular Octagon?");
            double octside = k.nextDouble();
            double octarea = 2 * (1 + Math.sqrt(2)) * Math.pow(octside, 2);
            System.out.println("The Area of the regular Octagon is : " + octarea);
        }
        if (num == 10) {
            System.out.println("What is the radius of the Circle?");
            double circradius = k.nextDouble();
            double circarea = Math.PI * Math.pow(circradius, 2);
            System.out.println("The Area of the Circle is : " + circarea);
        }
    }
}