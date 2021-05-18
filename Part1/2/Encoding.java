package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Encoding {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        String line = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            line = bufferedReader.readLine();
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ioException) {
                System.out.println(ioException.getMessage());
            }
        }

        if (line == null) {
            return;
        }

        System.out.println("Байты UTF-8:");
        byte[] bytes = line.getBytes(StandardCharsets.UTF_8);
        System.out.write(bytes, 0, bytes.length);
    }
}
