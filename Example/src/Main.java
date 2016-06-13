import java.io.BufferedInputStream;
import java.io.DataInputStream;  
import java.io.IOException;  
import java.util.Iterator;  
import java.util.Map;  
import java.util.Scanner;  
import java.util.Set;  
import java.util.TreeMap;  
public class Main {  
   
    public static char getNum(char c) {  
        if (Character.isDigit(c)) {  
            return c;  
        }  
        if (c == 'A' || c == 'B' || c == 'C') {  
            return '2';  
        }  
        if (c == 'D' || c == 'E' || c == 'F') {  
            return '3';  
        }  
        if (c == 'G' || c == 'H' || c == 'I') {  
            return '4';  
        }  
        if (c == 'J' || c == 'K' || c == 'L') {  
            return '5';  
        }  
        if (c == 'M' || c == 'N' || c == 'O') {  
            return '6';  
        }  
        if (c == 'P' || c == 'R' || c == 'S') {  
            return '7';  
        }  
        if (c == 'T' || c == 'U' || c == 'V') {  
            return '8';  
        }  
        if (c == 'W' || c == 'X' || c == 'Y') {  
            return '9';  
        }  
        return '#';  
    }  
   
    public static void main(String[] args) throws IOException {  
        DataInputStream scan = new DataInputStream(new BufferedInputStream(System.in));  
        Map< String, Integer> tm = new TreeMap();  
        int n = Integer.parseInt(scan.readLine().trim());
        for (int i = 0; i < n; i++) {  
            String s = scan.readLine().replace("-", "");  
            StringBuilder sb = new StringBuilder();  
            for (int k = 0; k < s.length(); k++) {  
                char c = getNum(s.charAt(k));  
                if (Character.isDigit(c)) {  
                    sb.append(c);  
                }  
            }  
            String result = sb.toString().substring(0, 3) + '-' + sb.toString().substring(3);  
            if (tm.containsKey(result)) {  
                int count = tm.get(result) + 1;  
                tm.put(result, count);  
            } else {  
                tm.put(result, 1);  
            }  
        }  
        Set se = tm.keySet();  
        Iterator it = se.iterator();  
        boolean flag = false;  
        while (it.hasNext()) {  
            String s = it.next().toString();  
            int count = tm.get(s);  
            if (count > 1) {  
                flag = true;  
                System.out.println(s + " " + count);  
            }  
        }  
        if (!flag) {  
            System.out.println("No duplicates. ");  
        }  
    }  
}
