import java.util.*;

class Chalks{
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  int n,s1,s2;
  n = in.nextInt();
  s1 = (n/(int)Math.sqrt(n));
  s2 = (s1/(int)Math.sqrt(n));
  int days = s1+s2+n;
  System.out.println(days);
 }
}