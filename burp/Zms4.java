package burp;

import net.portswigger.Zkb;
import net.portswigger.Zsy;

public class Zms4 {
  private final Zsy Zi;
  
  private final Zstu Zc;
  
  public Zms4(Zsy paramZsy, Zstu paramZstu) {
    this.Zi = paramZsy;
    this.Zc = paramZstu;
  }
  
  String ZA() {
    byte b = 0;
    while (true) {
      if (b++ > 10)
        return null; 
      String str = this.Zi.Z_(5);
      if (!ZK(Zkb.Zy(str)))
        return str; 
    } 
  }
  
  int[] ZH() {
    byte b = 0;
    while (true) {
      if (b++ > 10)
        return null; 
      int i = ZP();
      int j = ZP();
      if (!ZK(Zkb.Zy(String.valueOf(i * j))))
        return new int[] { i, j }; 
    } 
  }
  
  int ZP() {
    return this.Zi.ZP().ZO(101).Zr(1000).Zc();
  }
  
  String Z_() {
    return this.Zi.Zi().Zq().ZK(1);
  }
  
  int Zw() {
    return this.Zi.ZP().ZO(2).Zr(10).Zc();
  }
  
  private boolean ZK(byte[] paramArrayOfbyte) {
    return (Zlt_.Zr(this.Zc, paramArrayOfbyte) != -1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zms4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */