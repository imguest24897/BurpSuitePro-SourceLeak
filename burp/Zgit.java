package burp;

import net.portswigger.Zkb;

public class Zgit {
  public final Zrr2 ZC;
  
  public final Zrr2 ZI;
  
  public final String Zj;
  
  public final String Zv;
  
  public final Zku6 ZU;
  
  public final Zkv8 Zm;
  
  public final byte ZH;
  
  final Ze8e Zo;
  
  public final String Zg;
  
  public final String Ze;
  
  private static String Zw;
  
  public Zgit(Zrr2 paramZrr21, Zrr2 paramZrr22, String paramString1, String paramString2, Zku6 paramZku6, Zkv8 paramZkv8, byte paramByte) {
    this.ZC = paramZrr21;
    this.ZI = paramZrr22;
    this.Zj = paramString1;
    this.Zv = paramString2;
    String str = ZA();
    this.ZU = paramZku6;
    this.Zm = paramZkv8;
    this.ZH = paramByte;
    this.Zo = ZF();
    if (paramZkv8 instanceof Zg5y) {
      Zg5y zg5y = (Zg5y)paramZkv8;
      this.Zg = zg5y.Zl;
      this.Ze = zg5y.ZZ;
      if (str == null) {
        Zbqc.Zr(new Zbqc[3]);
      } else {
        return;
      } 
    } 
    this.Zg = null;
    this.Ze = null;
  }
  
  public boolean ZI() {
    return (this.Zm.ZD(this.ZU) != null);
  }
  
  private Ze8e ZF() {
    return this.ZC.Zr(this.Zv) ? Ze8e.HOST : (this.ZC.ZR(Zkb.ZG(this.ZU.ZY())) ? Ze8e.PATH : (this.ZC.Zv(Zkb.ZG(this.ZU.ZY())) ? Ze8e.QUERY : Ze8e.NONE));
  }
  
  public static void Zv(String paramString) {
    Zw = paramString;
  }
  
  public static String ZA() {
    return Zw;
  }
  
  static {
    if (ZA() == null)
      Zv("nNNgLb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgit.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */