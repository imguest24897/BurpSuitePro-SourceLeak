package burp;

public class Zxt3 extends Exception {
  private static Zbqc[] ZM;
  
  public static void ZP(Zbqc[] paramArrayOfZbqc) {
    ZM = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zr() {
    return ZM;
  }
  
  static {
    if (Zr() == null)
      ZP(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxt3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */