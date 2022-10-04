package challenges.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputValue = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        methodOne(inputValue);

    }

    private static void methodOne(int value){
        for(int i = 1 ; i < 11 ; i++){
            System.out.println(value + " x " + i + " = " + i * value );
        }
    }

}
