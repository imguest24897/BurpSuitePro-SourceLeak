package burp;

import java.awt.Window;

public class Zsgn {
  private final Window ZV;
  
  private final Zgbj Zs;
  
  public Zsgn(Window paramWindow, Zgbj paramZgbj) {
    this.ZV = paramWindow;
    this.Zs = paramZgbj;
  }
  
  public boolean Zw(Ze3h paramZe3h) {
    Zxya zxya = (Zxya)paramZe3h.ZJ().Z_();
    Zlit zlit = zxya.Zq();
    if (zxya.Zv()) {
      byte[] arrayOfByte1 = zlit.Zd4();
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 1];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
      arrayOfByte2[arrayOfByte1.length] = 47;
      zlit = new Zax(zlit.Zdz(), arrayOfByte2);
    } 
    this.Zs.Zl(this.ZV, zlit);
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsgn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */