package burp;

import java.awt.Color;

public class Zs61 implements Zepx {
  private static final Zr4_[] Zv = new Zr4_[] { Zr4_.ZZ, new Zr4_(Color.BLACK, new Color(5611756)), new Zr4_(Color.BLACK, new Color(15788375)), new Zr4_(Color.BLACK, new Color(15896928)) };
  
  private final byte[] ZX;
  
  Zs61(byte[] paramArrayOfbyte) {
    this.ZX = paramArrayOfbyte;
  }
  
  public Zr4_ ZT(int paramInt) {
    return Zv[this.ZX[paramInt]];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs61.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */