final class FinalClass {
  public void display() {
    System.out.println("This is a final method.");
  }
}

// try to extend the final class
class FinalClassDemo {

  public static void main(String[] args) {
    FinalClassDemo obj = new FinalClassDemo();
    obj.display();
  }

}