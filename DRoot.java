public class DRoot {

  //recursive

  public static int digital_root(int n) {
    int total = 0, i = 0;

      while(n > 0){
      total += n%10;
      System.out.println("n: " + n + "\ntotal: " + total);
      n /= 10;
    }
    if(total >= 10){
        total = digital_root(total);
    }
    return total;
  }

  // or using congruence formula:
  //return (n != 0 && n%9 == 0) ? 9 : n % 9;


  public static void main(String args[]){
    System.out.println(digital_root(59));
    System.out.println(59%9);

  }
}
/* recursive method to add all digits of integer n, until
only single digits

example:

digital_root(579847);

process:
5 + 7 + 9 + 8 + 4 + 7 = 40

4 + 0 = 4

output:

4

*/
