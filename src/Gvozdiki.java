import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//test:
//6
//3 13 14 12 4 6
//answer:
//5


public class Gvozdiki {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        String[] parts = reader.readLine().split(" ");

        reader.close();
        int[] array = Arrays.asList(parts).stream().mapToInt(Integer::parseInt).toArray();


        Arrays.sort(array);

        int start = 0;
        int finish = n - 1;
        int sum = 0;
        int a, b;

        if (n < 4) {
            sum = array[finish] - array[start];
        }

        a = array[1] - array[0];
        b = array[2] - array[0];

        int x;

        start = 3;
        finish = n;
        while (start < finish) {

            sum=array[start]-array[start-1];
            if (a < b) {
                sum =sum+ a;
            } else {
                sum =sum+b;
            }
            a = b;
            b = sum;
            start++;

        }

        System.out.println(sum);

    }
}