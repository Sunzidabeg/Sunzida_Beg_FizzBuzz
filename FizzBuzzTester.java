
package fizzbuzz;


public class FizzBuzzTester {

    public static void main(String[] args) {
       FizzBuzz test1= new FizzBuzz();
       FizzBuzz test2= new FizzBuzz();
       FizzBuzz test3= new FizzBuzz();
       FizzBuzz test4= new FizzBuzz();
       //here make 3 string (Calc1,2,3) to be calculated for the three var of Test1,2,3
       String Calc1 = test1.FizzBuzz(9);
       String Calc2 = test2.FizzBuzz(10);
       String Calc3 = test3.FizzBuzz(15);
       String Calc4 = test4.FizzBuzz(16);
       //display the result of calculation according to FizzBuzz Class
       System.out.println(Calc1);
       System.out.println(Calc2);
       System.out.println(Calc3);
       System.out.println(Calc4);


    }
    
}
