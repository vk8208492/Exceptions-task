package app.ExceptionsProvider;

import java.util.Scanner;

public class ExceptionsProvider {
    public String getHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input height: ");
        return scanner.nextLine().trim();
    }
}
