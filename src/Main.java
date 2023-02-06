import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0, num, i = 1, count = 0;

        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
        }
        while (num % 2 == 0);
        {
            for(i = 1; i <= num; i++){
                if(i % 4 == 0 && i % 2 == 0){
                    total += i;
                    count++;
                    System.out.println(count+"-) " + i);
                }
                }
            }
        }

    }