package git01;
import java.util.Scanner;
public class TestGit {
public static void main(String[] args) {
<<<<<<< HEAD
String name = "Bugs Bunny";
System.out.println("Hello Mr. " + name.toUpperCase() + "!");
=======
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
System.out.println("Hello " + name + "!");
scanner.close();
>>>>>>> refs/heads/brach-2
}
}