import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CheapestWay {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        String[] first = reader.readLine().split(" ");
        int m= first.length;

        int[][] a = new int[n][m];

        for (int i =0;i<m;i++){
            a[0][i]=Integer.parseInt(first[i]);
        }
        for (int i=1;i<n;i++){
            first = reader.readLine().split(" ");
            for (int j =0;j<m;j++){
                a[i][j]=Integer.parseInt(first[j]);
            }
        }


        int x=n-1;
        int y=m-1;

        while (x!=0 && y!=0){
            if(x!=0){
                x--;
            }
            if(x==0){
                y--;
            }
            while(x!=0 || y!=m){
                try{
                    a[x][y]=a[x][y]+a[x][y+1];
                }catch(Exception e){

                }
                try{
                    a[x][y]=a[x][y]+a[x+1][y];
                }catch(Exception e){

                }
                x--;
                y++;
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");

        }

        System.out.println(a[0][0]);








        reader.close();
        writer.close();
    }

}
