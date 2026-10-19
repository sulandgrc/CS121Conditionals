public class Conditionals {

    //main tab
   public static void main(String[] args) {
       // test out with even number
       // and odd number, test with negative
       evenOdd(8); //expect EVEN
       evenOdd(5); // expect ODD
       evenOdd(-8); // expect EVEN
       evenOdd(-5); // expect ODD
   }

   public static void evenOdd(int num){
       // if even
       if (num % 2 == 0) {
        // sout tab
          System.out.println("EVEN");
       } else {
          System.out.println("ODD");
       }

   }


}