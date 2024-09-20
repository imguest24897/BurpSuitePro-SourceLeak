package burp;

import net.portswigger.browser.Zc4;

public class Zen_ implements Zesu {
  private final Zeun ZR = new Zeun();
  
  private boolean Zh = true;
  
  public void Zz(Zg8y paramZg8y) {
    String[] arrayOfString = Zeun.ZG();
    if (paramZg8y instanceof Zm3y && paramZg8y.ZM() == Zz3o.ANCHOR)
      for (Zzjv zzjv : ((Zm3y)paramZg8y).ZC()) {
        Zc4 zc4 = zzjv.Zxl();
        if (zc4 == Zc4.INNER_TEXT || zc4 == Zc4.IMG_SRC || zc4 == Zc4.ALT_TEXT) {
          if (!this.Zh)
            this.ZR.Zk(" "); 
          this.ZR.Zk(zzjv.ZxZ());
          this.Zh = false;
        } 
        if (arrayOfString != null)
          break; 
      }  
  }
  
  public void ZG(Zt82 paramZt82) {
    this.ZR.Zv(paramZt82, Zr());
  }
  
  public Zlug Zr() {
    return Zlug.ANCHOR_LABELS;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zen_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */