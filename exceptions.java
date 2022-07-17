import java.util.*;

class MyException extends Exception {
  public String toString() {
    return "Denominator is 0! divide by zero Exception";
  }
}

class Compute {
  private int a, b;

  public Compute(int a, int b) {

    this.a = a;
    this.b = b;
  }

  public void compute_a_by_b() {
    try {
      if (this.b != 0)

      {

        System.out.println("result of " + a + "/" + b + "=" + (float) 1.0 * a / b);
      } else
        throw new MyException();
    }

    catch (MyException e) {
      System.out.println("Exception :" + e);

    }

  }
}

class ExceptionDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of a:-");
    int a = in.nextInt();
    System.out.println("Enter the value of b:-");
    int b = in.nextInt();
    in.close();
    Compute c = new Compute(a, b);

    c.compute_a_by_b();
  }
}