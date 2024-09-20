package burp;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;

public class Zgoh extends Zbqc {
  private static final Ze9n ZT = Ze3m.ZC(Zeuf.CHEVRON_RIGHT, Zlkk.FOREGROUND).ZU(Zmcx.LINE_SIZE).Z_();
  
  public Zgoh() {
    setLayout(new BoxLayout(this, 0));
  }
  
  public void ZK(String... paramVarArgs) {
    removeAll();
    Zm99 zm99 = null;
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zl4w.ZS();
    while (b < paramVarArgs.length) {
      if (b > 0)
        add(ZP()); 
      zm99 = new Zm99(paramVarArgs[b]);
      add(zm99);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    if (zm99 != null)
      zm99.Ze(Zlkk.LINK_FOREGROUND_1); 
  }
  
  private Zm99 ZP() {
    Zm99 zm99 = new Zm99(ZT);
    zm99.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
    return zm99;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgoh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */