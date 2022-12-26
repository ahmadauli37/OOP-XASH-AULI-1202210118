
class Calculation implements Runnable {
  private double phi = 3.14;
  
  private double radius, side, area;
 
  public void setSquare(double side) throws IllegalArgumentException {
    if (side > 0) {
        this.area = side * side;
    }
    
     else {
        // YOUR CODE HERE
        // Clue: throw an exception if the value is less than 1
        throw new IllegalArgumentException("value less than 1");
    }

  }
  public double getSquare() {
    return this.area;
  }

  
  public void setCircle(double radius) throws IllegalArgumentException {
    if (radius < 1) {
      throw new IllegalArgumentException(" value less than 1");
    }

    this.area = phi * radius * radius;
  }
  public double getCircle() {
    return this.area;
  }

  
  public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
    if (a < 1 || b < 1 || t < 1) {
      throw new IllegalArgumentException("Nilai sisi atau tinggi tidak boleh kurang dari 1");
    }
    this.area = ((a + b) * t) / 2;
  }
  public double getTrapezoid() {
    return this.area;
  }

  // Method run() yang merupakan @Override dari interface Runnable
  @Override
  public void run() {

    System.out.print("Program will start in ");
    try {
      
      for (int value = 3; value > 0; value--) {
    
        System.out.print(value + " ");
        Thread.sleep(1000);
      }
}
