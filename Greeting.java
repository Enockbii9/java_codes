import java.util.Scanner;
public class Greeting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextline();
        System.out.println("hello, "+ name + "!");
    }
    
}
