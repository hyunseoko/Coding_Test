import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= n; i++){
            append(sb, ' ', n - i);
            append(sb, '*', 2 * i - 1);
            sb.append('\n');
        }
        for (int i = n - 1; i > 0; i--) {
            append(sb, ' ', n - i);
            append(sb, '*', 2 * i - 1);
            sb.append('\n');
        }
        
        System.out.println(sb);
    }
    
    private static void append(StringBuilder sb, char ch, int cnt){
        for (int i = 0; i < cnt; i++) sb.append(ch);
    }
}