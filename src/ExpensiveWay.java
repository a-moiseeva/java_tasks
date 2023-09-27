import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ExpensiveWay {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] first = reader.readLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);
        int[][] a = new int[n][m];
        int[][] b= new int[n][m];

        for (int i = 0; i < n; i++) {
            first = reader.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(first[j]);
            }
        }
        b[n-1][m-1]=0;

        //     System.out.println("finish");

        int r, d, x, y;

        int xx = n - 1;
        int yy = m - 1;


        while ((xx != 0) || (yy != 0)) {
            //       System.out.println("big cycle "+xx+" "+yy);
            if (xx != 0) {
                xx--;
            } else if (xx == 0) {
                yy--;
            }
            x = xx;
            y = yy;
            while ((x != n) && (y != -1)) {
                //              System.out.println("lil cycle "+x+" "+y);
                if (x == n - 1) {
                    a[x][y] = a[x][y] + a[x][y + 1];
                    b[x][y]=-1;
                } else if (y == m - 1) {
                    a[x][y] = a[x][y] + a[x + 1][y];
                    b[x][y]=1;
                } else {
                    d = a[x][y + 1];
                    r = a[x + 1][y];
                    if (d >= r) {
                        a[x][y] = a[x][y] + d;
                        b[x][y]=-1;
                    } else {
                        a[x][y] = a[x][y] + r;
                        b[x][y]=1;
                    }
                }
                x++;
                y--;
            }
        }
/*        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(" ");

        }*/

        //  System.out.println("answer: "+ a[0][0]);
        System.out.println(a[0][0]);
        int i=0;
        int j=0;
        int z=b[i][j];
        while (z!=0){
            if(z==1){
                System.out.print("D ");
                i++;
            } else if (z==-1){
                System.out.print("R ");
                j++;
            }
            z=b[i][j];
        }


        reader.close();
        writer.close();
    }

}
