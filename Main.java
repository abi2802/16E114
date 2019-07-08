
import java.util.Arrays;
import java.util.Scanner; 
public class Main { 
  
    static final int MAX_CHARS = 256;
    public static void main(String args[]) 
    { 
    	Scanner s=new Scanner(System.in);
        String str = s.next();
        int start = 0, start_index = -1; 
        int n = str.length();
        int c1= 0,c2=0;
        int min= Integer.MAX_VALUE; 
        boolean[]  r= new boolean[MAX_CHARS]; 
        int[] c3=  new int[MAX_CHARS]; 
        Arrays.fill(r, false); 
        for (int i=0; i<n; i++) 
        { 
            if (r[str.charAt(i)] == false) 
            { 
                r[str.charAt(i)] = true; 
                c1++; 
            } 
        }
        for (int j=0; j<n; j++) 
        { 
            c3[str.charAt(j)]++; 
            if (c3[str.charAt(j)] == 1 ) 
            {
                c2++; 
            }
            if (c2 == c1) 
            { 
                while (c3[str.charAt(start)] > 1) 
                { 
                    if (c3[str.charAt(start)] > 1) 
                    {
                        c3[str.charAt(start)]--; 
                    }
                    start++;
                } 
                int len= j - start + 1;
                if (min> len) 
                { 
                    min= len; 
                    start_index = start; 
                } 
            } 
        }
        System.out.println(str.substring(start_index, start_index+min).length()); 
    } 
} 
