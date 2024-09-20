package burp;

public class Zttz {
  private final Ze97 ZY;
  
  private final int ZZ;
  
  private static String Z_;
  
  public Zttz(Ze97 paramZe97, Zr_h paramZr_h) {
    this.ZY = paramZe97;
    String str = Zh();
    this.ZZ = paramZr_h.Zb();
    if (Zbqc.Zwu() == null)
      ZU("xBnazb"); 
  }
  
  public Ztbt Zo() {
    String str = Zh();
    int i = this.ZY.Zw();
    if (i < this.ZZ)
      return Ztbt.INCREASE; 
    if (i > this.ZZ * 10)
      return Ztbt.DECREASE; 
    if (str == null)
      Zbqc.Zr(new Zbqc[1]); 
    return Ztbt.STAY_SAME;
  }
  
  public static void ZU(String paramString) {
    Z_ = paramString;
  }
  
  public static String Zh() {
    return Z_;
  }
  
  static {
    if (Zh() == null)
      ZU("OOvskb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zttz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */