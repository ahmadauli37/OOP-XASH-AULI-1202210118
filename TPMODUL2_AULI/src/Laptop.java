public class Laptop extends Perangkat {
  protected boolean webcam;
  
  public Laptop(String drive, int ram, Double processor, boolean webcam) {
    super (drive, ram, processor);
    this.webcam = webcam;
  }

  
  public void informasi() {
    if (webcam == true) {
    System.out.println("Laptop mempunyai drive " + drive + " dengan ram sebanyak " + ram + " GB, juga processor secepat " + processor + " Ghz., laptop ini mempunyai webcam");
    } else {
      System.out.println("Laptop mempunyai drive " + drive + " dengan ram sebanyak " + ram + " GB, juga processor secepat " + processor + " Ghz., laptop ini tidak mempunyai webcam");  
    }
  }

  public void bukaGame(String nama_game) {
    System.out.println("Laptop  membuka game " + nama_game) ;         
  }

  public void kirimEmail(String email) {
    System.out.println("Laptop  mengirim email ke " + email);          
  }

  public void kirimEmail(String email1, String email2) {
    System.out.println("Laptop  mengirim email ke " + email1 + " dan ke " + email2);    
    System.out.println();        
  }
}
