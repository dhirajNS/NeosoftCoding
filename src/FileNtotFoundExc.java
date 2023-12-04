
import java.io.File;
        import java.io.FileReader;
        import java.io.IOException;
import java.util.Scanner;

public class FileNtotFoundExc {
    public static void giveFileNotFound(){
        try (Scanner sc=new Scanner(System.in);){
            // Incorrect file path causing a "File not found" exception
            System.out.println("mmn");

            // ... rest of the code
        }
    }
    public static void main(String[] args) {
       System.out.println("Hi in file not found");
        giveFileNotFound();
    }
}
