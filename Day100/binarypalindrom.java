
// 0. In this program
// 1. We have to Check Given Number is Palindrom or not but a bit of twist we have check according to Binary form
class binarypalindrom 
 {
   public static void main(String argc[]) {
      long num = 341, n1;
      long reverse = 0;
      n1 = num;
      while (n1 > 0) {
         reverse =reverse << 1;
         if ((n1 & 1) == 1)
         reverse =reverse ^ 1;
         n1 >>= 1;
      }

      if(num == reverse) {
         System.out.println("Binary representation of " + num + " is palindrome");
      }
      else {
        System.out.println("Binary representation of " + num + " is not palindrome");
     }

   }
}
