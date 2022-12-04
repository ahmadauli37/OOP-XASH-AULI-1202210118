public class Main {
   public static void main (String[] args) throws Exception {
      Perangkat perangkat = new Perangkat("SUSA", 16, 3.6);
      perangkat.informasi();

      Laptop laptop = new Laptop("UdanG", 16, 3.8, true); 
      laptop.informasi();
      laptop.bukaGame("Dota2");
      laptop.kirimEmail("ahmadaulia@gmail.com");
      laptop.kirimEmail("ripanjulsergio@gmail.com", "udinpetot@gmail.com");

      Handphone handphone = new Handphone("OVOVEVEVWE", 8, 2.8, true);
      handphone.informasi();
      handphone.telfon(6269698);
      handphone.kirimSMS(6269698);
      handphone.kirimSMS(62692831, 62136578);
   }          
}
