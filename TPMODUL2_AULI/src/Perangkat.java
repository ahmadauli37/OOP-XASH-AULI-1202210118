public class Perangkat {
  protected String drive;
  protected int ram;
  protected double processor;
  
  public Perangkat(String drive, int ram, Double processor) {
    this.drive = drive;
    this.ram = ram;
    this.processor = processor;
  }

  public void informasi() {
    System.out.println("Perangkat tidak dikenali mempunyai drive tipe " + drive + " dengan ram sejumlah " + ram + " dan kecepatan prosesor " + processor + " Ghz.");
    System.out.println();
  }
}
