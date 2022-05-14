// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();

    String[] inputSplit = input.split(" ");

    double media = Double.parseDouble(inputSplit[0])/Double.parseDouble(inputSplit[1]);

    System.out.printf("%.2f", media);
  }
}