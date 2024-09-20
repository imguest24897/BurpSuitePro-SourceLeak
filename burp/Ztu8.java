package burp;

public interface Ztu8 extends Zgpi<Ztu8> {
  public static final Zeu4<Ztu8> Zz = new Zk1z();
  
  byte ZlD();
  
  Zs_n ZlP();
  
  String Zlv();
  
  int ZlK();
  
  int Zli();
  
  String Zlr();
  
  default boolean Zlz() {
    return (ZlD() == 1);
  }
  
  default boolean Zlx() {
    return (ZlD() == 0);
  }
  
  default boolean ZJQ(String paramString) {
    return (ZlD() == 0 && ZJG(paramString));
  }
  
  default boolean ZJG(String paramString) {
    return (ZlP() != null && ZlP().ZJ3().equals(paramString));
  }
  
  default boolean ZJd(String paramString) {
    return (ZlP() != null && ZlP().ZJ3().equals(paramString) && Zlz());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztu8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */