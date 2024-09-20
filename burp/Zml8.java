package burp;

import java.io.IOException;

public abstract class Zml8 extends Zmj5 {
  public Zml8(Zgb6 paramZgb6, Zrgd paramZrgd, Zkl6 paramZkl6) {
    super(new Zs2f(Zskh.Zo), paramZgb6, paramZrgd, paramZkl6);
  }
  
  public void Zc(Zb2f paramZb2f, Zml3 paramZml3, Zi8 paramZi8) throws Zz8h, IOException, Zxgy, Zxg5 {
    String[] arrayOfString = Zz2j.ZJ();
    try {
      ZK(paramZml3);
      if (Zf(this.ZS)) {
        try {
          ZY(paramZml3);
          ZI(paramZml3);
          ZL(paramZml3);
          ZT(paramZb2f);
          if (arrayOfString == null) {
            ZW(paramZml3);
            return;
          } 
        } catch (Zz8h zz8h) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zz8h zz8h) {
      throw a(null);
    } 
    ZW(paramZml3);
  }
  
  protected abstract boolean Zf(String paramString);
  
  private static Zz8h a(Zz8h paramZz8h) {
    return paramZz8h;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zml8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */