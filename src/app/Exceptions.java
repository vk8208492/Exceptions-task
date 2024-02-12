package app;

import app.ExceptionHadler.ExceptionHadler;
import app.ExceptionsProvider.ExceptionsProvider;

public class Exceptions {

    public static void main(String[] args) {

        ExceptionsProvider provider = new ExceptionsProvider();
        String height = provider.getHeight();
        ExceptionHadler hadler = new ExceptionHadler();
        getOUtPut(hadler.HandleException(height));
        getOUtPut("Some code.");
    }

    private static void getOUtPut(String output) {
        System.out.println(output);
    }
}

