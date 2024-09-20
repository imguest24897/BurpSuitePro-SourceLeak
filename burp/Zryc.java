package burp;

import java.util.List;

public class Zryc {
  private final Zg4h Zw;
  
  private final Zru1 ZM;
  
  private static int[] Ze;
  
  public Zryc(Zg9c paramZg9c, Zz28 paramZz28, Zg4h paramZg4h) {
    this.Zw = paramZg4h;
    int[] arrayOfInt = Zo();
    this.ZM = new Zru1(paramZg9c, paramZz28);
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public List<Zs0s> Zc() {
    return this.Zw.ZD();
  }
  
  public List<Zt3k> Zq() {
    return this.ZM.ZP();
  }
  
  public static void Zr(int[] paramArrayOfint) {
    Ze = paramArrayOfint;
  }
  
  public static int[] Zo() {
    return Ze;
  }
  
  static {
    if (Zo() != null)
      Zr(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zryc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */