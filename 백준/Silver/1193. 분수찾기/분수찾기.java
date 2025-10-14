import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long X = Long.parseLong(br.readLine().trim());
        long d = 1; long sum = 1;
        
        while (sum < X){
            d++;
            sum += d;
        }
            
        long pos = X - (sum - d);
        long x; long y;
        
        if (d % 2 != 0) {
            y = d - pos + 1;
            x = pos;
        } else {
            y = pos;
            x = d - pos + 1;
        }
        
        System.out.print(y + "/" + x);
    }
}