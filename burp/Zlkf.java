package burp;

public class Zlkf implements Zt3k {
  private final Zeqq ZZ;
  
  private final String ZY;
  
  private static String[] ZK;
  
  public Zlkf(Zg9c paramZg9c) {
    this.ZY = paramZg9c.Zbo();
    this.ZZ = new Zeqq(paramZg9c);
  }
  
  public boolean Zo(Zto7 paramZto7) {
    return (this.ZY != null && !this.ZY.isEmpty()) ? (!this.ZZ.Zn(paramZto7, this.ZY)) : false;
  }
  
  public static void ZN(String[] paramArrayOfString) {
    ZK = paramArrayOfString;
  }
  
  public static String[] ZW() {
    return ZK;
  }
  
  static {
    if (ZW() != null)
      ZN(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlkf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */