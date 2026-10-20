public class Conditionals {

    //main tab
   public static void main(String[] args) {
       // test out with even number
       // and odd number, test with negative
       evenOdd(8); //expect EVEN
       evenOdd(5); // expect ODD
       evenOdd(-8); // expect EVEN
       evenOdd(-5); // expect ODD

       String answer = multipleOf3(9);
       System.out.println(answer); // IS

       answer = multipleOf3(5);
       System.out.println(answer); // NOT

       multipleOfThree(9);
       multipleOfThree(5);

   }

    public static String multipleOf3(int num){
        if (num % 3 == 0) {
            return "MULTIPLE OF 3";
        } else {
            return "NOT A MULTIPLE OF 3";
        }
    }

    public static void multipleOfThree(int num){
        if (num % 3 == 0) {
            System.out.println("MULTIPLE OF 3");
        } else {
            System.out.println("NOT A MULTIPLE OF 3");
        }
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