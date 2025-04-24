import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, What's is your name?");
        String customerName = input.next();
        System.out.println("Nice to meet you " + customerName);

        String patch = "./welcome.txt";
        FileReader reader = new FileReader(patch);
        while (reader.ready()){
            System.out.print((char) reader.read());
        }
        reader.close();

        FileWriter output = new FileWriter( "./customerReview.txt");
        System.out.println("\nPlease, provide a review: ");
        String review = input.next();
        String customerReview = customerName + ": " + review;
        output.write(customerReview);
        output.close();
    }
}
