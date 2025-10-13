import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        int i = 0; int cnt = 0;
        
        while (i < len){
            if (i + 2 < len && s.charAt(i) == 'd' && 
                s.charAt(i+1) == 'z' && s.charAt(i+2) == '='){
                i += 3;
            } else if (i + 1 < len) {
                String two = s.substring(i, i+2);
                if (two.equals("c=") || two.equals("c-") || two.equals("d-") || 
                    two.equals("lj") || two.equals("nj") || two.equals("s=") || two.equals("z=")) {
                    i += 2;
                } else {
                    i++;
                }
            } else {
                i++;
            }
            cnt++;
        }
        
        System.out.print(cnt);
    }
}