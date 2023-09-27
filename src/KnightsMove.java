import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class KnightsMove {

    public static long factorial(int x, int y) {
        long answer = 1;
        if (x == 0) {
            answer = 1;
        } else {
            while (x != y) {
                answer = answer * x;
                x = x - 1;
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] first = reader.readLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);
       /* пусть ходим вниз-вниз-вправо(ddr=2d+r) х раз,
        вниз-вправо-вправо(drr=d+2r) у раз.
        тогда
        (n-1)d=2xd+yd
        (m-1)r=2yr+xr

        отсюда
        n-1=2x+y
        m-1=2y+x
        */


        int x = (2 * n - m - 1) / 3; //количество ходов вниз-вниз-вправо
        int y = (2 * m - 1 - n) / 3; //количество ходов вниз-вправо-вправо
        // System.out.println("x " + x + " y " + y);
        long answer;

        if (((2 * x + y) != (n - 1)) || ((2 * y + x) != (m - 1))) {
            answer = 0;//если такой комбинации ходов нет!

        } else {

            //теперь выясним порядок ходов. у нас неупорядоченная выборка без повторений
            //(x+y)!/(x!*y!)
            answer = factorial(x + y, Math.max(x, y)) / factorial(Math.min(x, y), 1);
        }
        System.out.println(answer);

        reader.close();
        writer.close();
    }

}