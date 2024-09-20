package burp;

public class Zm4r implements Ztd1 {
  private static final char[] Zq = new char[0];
  
  private final Zs1t Z_;
  
  private String ZQ;
  
  private Zsy5 Zc;
  
  private static int[] ZY;
  
  public Zm4r(Zs1t paramZs1t, String paramString1, String paramString2, String paramString3) {
    this.Z_ = paramZs1t;
    this.Zc = Zsy5.Zw;
    int[] arrayOfInt = Zv();
    this.ZQ = this.Zc.ZL(paramZs1t.ZzI(), paramString1, paramString2, paramString3);
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public char[] ZS() {
    return (this.ZQ == null) ? Zq : this.ZQ.toCharArray();
  }
  
  public void ZP(String paramString) {
    this.ZQ = paramString;
    this.Z_.ZEI(this.Zc.ZT(paramString, false));
  }
  
  public String Zg() {
    String str = this.Z_.ZzI();
    return (str == null) ? "" : str;
  }
  
  public static void ZM(int[] paramArrayOfint) {
    ZY = paramArrayOfint;
  }
  
  public static int[] Zv() {
    return ZY;
  }
  
  static {
    if (Zv() == null)
      ZM(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm4r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */