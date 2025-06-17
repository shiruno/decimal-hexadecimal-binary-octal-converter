import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("┌----------------------┐");
        System.out.println("|    Base Converter    |");
        System.out.println("├----------------------┤");
        System.out.println("| 1.) Decimal          |");
        System.out.println("├----------------------┤");
        System.out.println("| 2.) Binary           |");
        System.out.println("├----------------------┤");
        System.out.println("| 3.) Octal            |");
        System.out.println("├----------------------┤");
        System.out.println("| 4.) Hexadecimal      |");
        System.out.println("└----------------------┘");

        System.out.print(" Choose Base: ");
        Scanner num = new Scanner(System.in);
        int base = num.nextInt();
        
        Main.ans(base);
        
        System.out.print("\n");
        System.out.println("┌----------------------┐");
        System.out.println("|         End.         |");
        System.out.println("└----------------------┘");

        num.close();
    }

    public static String ans(int base) {
        String answer = "";

        Scanner get = new Scanner(System.in);

        switch (base) {
            case 1:
                second.baseOne();
            break;
            case 2:
                second.baseTwo();
            break;
            case 3:
                second.baseThree();
            break;
            case 4:
                second.baseFour();
            break;
            default:
                System.out.println("┌----------------------┐");
                System.out.println("|     can't read?!     |");
                System.out.println("└----------------------┘");
                System.out.println("┌----------------------┐");
                System.out.println("|      dumb fuck.      |");
                System.out.println("└----------------------┘");
            break;
        }
        get.close();
        return answer;
    }
}
class second extends Main {
    public static void baseOne() {
        Scanner one = new Scanner(System.in);

        System.out.println("┌----------------------┐");
        System.out.println("|       Decimal        |");
        System.out.println("└----------------------┘");

        System.out.print(" Enter DECIMAL number: ");
        int Binary = one.nextInt();

        int dec = Binary;

        System.out.print("┌----------------------┐");
        System.out.println("\n Decimal: " + Binary);
        System.out.print(" Binary: ");
        System.out.println(Integer.toBinaryString(dec));
        System.out.print(" Octal: ");
        System.out.print(Integer.toOctalString(Binary) + "\n");
        System.out.print(" Hexadecimal: ");
        System.out.print(Integer.toHexString(Binary) + "\n");
        System.out.print("└----------------------┘");

        one.close();
    }
    public static void baseTwo() {
        Scanner two = new Scanner(System.in);

        System.out.println("┌----------------------┐");
        System.out.println("|       Binary         |");
        System.out.println("└----------------------┘");

        System.out.print(" Enter BINARY number: ");
        String Bin = two.next();

        System.out.print("┌----------------------┐");
        System.out.println("\n Binary: " + Bin);
        int decimal = Integer.parseInt(Bin, 2);
        System.out.println(" Decimal: " + decimal);
        String octOne = Integer.toOctalString(decimal);
        System.out.println(" Octal: " + octOne);
        String hexOne = Integer.toHexString(decimal);
        System.out.println(" Hexadecimal: " + hexOne);
        System.out.print("└----------------------┘");

        two.close();
    }
    public static void baseThree() {
        Scanner three = new Scanner(System.in);

        System.out.println("┌----------------------┐");
        System.out.println("|        Octal         |");
        System.out.println("└----------------------┘");

        System.out.print(" Enter OCTAL number: ");
        String Octal = three.next();

        System.out.print("┌----------------------┐");
        System.out.println("\n Octal: " + Octal);
        int decOne = Integer.parseInt(Octal, 8);
        System.out.println(" Decimal: " + decOne);
        String binTwo = Integer.toBinaryString(decOne);
        System.out.println(" Binary: " + binTwo);
        String hexTwo = Integer.toHexString(decOne);
        System.out.println(" Hexadecimal: " + hexTwo);
        System.out.print("└----------------------┘");   
        
        three.close();
    }
    public static void baseFour() {
        Scanner four = new Scanner(System.in);

        System.out.println("┌----------------------┐");
        System.out.println("|      Hexadecimal     |");
        System.out.println("└----------------------┘");

        System.out.print(" Enter HEXADECIMAL number: ");
        String Hexa = four.next();

        System.out.print("┌----------------------┐");
        System.out.println("\n Hexadecimal: " + Hexa);
        int decTwo = Integer.parseInt(Hexa, 16);
        System.out.println(" Decimal: " + decTwo);
        String binThree = Integer.toBinaryString(decTwo);
        System.out.println(" Binary: " + binThree);
        String octTwo = Integer.toOctalString(decTwo);
        System.out.println(" Octal: " + octTwo);
        System.out.print("└----------------------┘");

        four.close();
    }
}