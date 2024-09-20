package burp;

import java.awt.Color;
import java.util.Arrays;

public class Zzcn {
  private static final Color Zg = Color.BLACK;
  
  private final Color[] Zf = new Color[50];
  
  Zzcn() {
    Arrays.<Zmvp>stream(Zmvp.values()).forEach(this::lambda$new$0);
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    while (b < this.Zf.length) {
      if (this.Zf[b] == null)
        this.Zf[b] = Zg; 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  Color ZO(int paramInt) {
    return this.Zf[paramInt];
  }
  
  private void lambda$new$0(Zmvp paramZmvp) {
    this.Zf[paramZmvp.ZU] = paramZmvp.Zb();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzcn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */