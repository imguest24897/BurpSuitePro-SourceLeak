package burp;

import java.awt.Dimension;
import javax.swing.Box;

class Zsl9 extends Box.Filler {
  private static final int ZE = Math.max(0, -1);
  
  private static final int Zp = ZE + 60;
  
  public Zsl9() {
    super(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
  }
  
  public void ZV() {
    ZU(ZE);
  }
  
  public void Zy() {
    ZU(Zp);
  }
  
  private void ZU(int paramInt) {
    changeShape(new Dimension(0, paramInt), new Dimension(0, paramInt), new Dimension(32767, paramInt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsl9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */