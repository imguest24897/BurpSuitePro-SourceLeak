package burp;

import javax.swing.text.Segment;

public class Zeyf extends Zety implements Zmf8 {
  private final String ZM;
  
  private static boolean ZD;
  
  public Zeyf(String paramString) {
    this.ZM = paramString;
  }
  
  private Zeyf(Zmpr paramZmpr, String paramString) {
    super(paramZmpr);
    this.ZM = paramString;
  }
  
  public static Zeyf Zj(String paramString) {
    boolean bool = Zw();
    if (Zbqc.Zwu() == null)
      ZY(!bool); 
    return new Zeyf(new Zr6o(new Zke(new Zepp(), new Zxy0())), paramString);
  }
  
  public void ZC(int paramInt) {
    super.ZC(paramInt);
  }
  
  public Zska Zq(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return super.Zq(paramArrayOfchar, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public Zska Zf() {
    return super.Zf();
  }
  
  public Ze7g Z_(int paramInt1, Segment paramSegment, Zska paramZska, int paramInt2) {
    ZS();
    Zldn zldn = new Zldn(paramSegment, paramZska, paramInt2, this, this.ZM);
    boolean bool = Zw();
    zldn.ZT();
    if (!bool)
      Zbqc.Zr(new Zbqc[4]); 
    return this.Zz;
  }
  
  public int Zy() {
    return this.Zz.ZA().ZX();
  }
  
  public void ZQ(int paramInt) {
    this.Zz.ZA().ZY(paramInt);
  }
  
  public void ZO(int paramInt) {
    this.Zz.ZA().Zi(paramInt);
  }
  
  public void Zl(Zska paramZska) {
    this.Zz.ZH(paramZska);
  }
  
  public static void ZY(boolean paramBoolean) {
    ZD = paramBoolean;
  }
  
  public static boolean ZC() {
    return ZD;
  }
  
  public static boolean Zw() {
    boolean bool = ZC();
    return !bool;
  }
  
  static {
    if (!Zw())
      ZY(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeyf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */