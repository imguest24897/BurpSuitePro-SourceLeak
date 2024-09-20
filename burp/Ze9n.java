package burp;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class Ze9n extends Ze9x {
  private final Zmcx Za;
  
  private final Zlkk ZA;
  
  private final Zlkk Zc;
  
  private final Zlkk Zn;
  
  private final Zlkk Zb;
  
  private final Zlkk ZO;
  
  private final float ZM;
  
  private FlatSVGIcon Zz;
  
  private Zlkk Ze;
  
  private int ZR;
  
  protected Ze9n(Zeuf paramZeuf, Zmcx paramZmcx, Zlkk paramZlkk1, Zlkk paramZlkk2, Zlkk paramZlkk3, Zlkk paramZlkk4, Zlkk paramZlkk5) {
    this.Za = paramZmcx;
    this.ZA = paramZlkk1;
    this.Zc = paramZlkk2;
    this.Zn = paramZlkk3;
    this.Zb = paramZlkk4;
    this.ZO = paramZlkk5;
    this.Zz = new FlatSVGIcon(paramZeuf.ZX());
    this.ZM = Zmcx.Ze((ImageIcon)this.Zz);
    this.Ze = paramZlkk1;
    this.ZR = Zrt.ZC();
    this.Zz = ZR();
    ZQ();
  }
  
  FlatSVGIcon Zl() {
    if (this.ZR != Zrt.ZC()) {
      this.ZR = Zrt.ZC();
      this.Zz = ZR();
    } 
    ZQ();
    return this.Zz;
  }
  
  private FlatSVGIcon ZR() {
    Dimension dimension = this.Za.ZV(this.ZM);
    return this.Zz.derive(dimension.width, dimension.height);
  }
  
  public void Zm() {
    if (this.Ze == this.ZA)
      return; 
    this.Ze = this.ZA;
    ZQ();
  }
  
  public void Zx() {
    if (this.Ze == this.Zc)
      return; 
    this.Ze = this.Zc;
    ZQ();
  }
  
  public void Zk() {
    if (this.Ze == this.Zn)
      return; 
    this.Ze = this.Zn;
    ZQ();
  }
  
  public void Zj() {
    if (this.Ze == this.Zb)
      return; 
    this.Ze = this.Zb;
    ZQ();
  }
  
  public void ZH() {
    if (this.Ze == this.ZO)
      return; 
    this.Ze = this.ZO;
    ZQ();
  }
  
  private void ZQ() {
    this.Zz.setColorFilter(Zm4u.Zn(this.Ze));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze9n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */