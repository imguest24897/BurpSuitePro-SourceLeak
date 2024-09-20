package burp;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ze9w extends Ze9x {
  private final Zmcx ZC;
  
  private final float Zt;
  
  private FlatSVGIcon Z_;
  
  private FlatSVGIcon Zl;
  
  private int ZM;
  
  private Ze9w(String paramString1, String paramString2, Zmcx paramZmcx) {
    this.ZC = paramZmcx;
    this.Z_ = new FlatSVGIcon(paramString1);
    this.Zl = new FlatSVGIcon(paramString2);
    this.Zt = Zmcx.Ze((ImageIcon)this.Z_);
    Zuh.ZT((Math.abs(this.Zt - Zmcx.Ze((ImageIcon)this.Zl)) < 0.001D), Zqf.Zr, paramString1);
    this.ZM = -1;
  }
  
  FlatSVGIcon ZH() {
    if (this.ZM != Zrt.ZC()) {
      this.ZM = Zrt.ZC();
      this.Z_ = ZB(this.Z_);
      this.Zl = ZB(this.Zl);
    } 
    return Zmco.Zi() ? this.Zl : this.Z_;
  }
  
  private FlatSVGIcon ZB(FlatSVGIcon paramFlatSVGIcon) {
    Dimension dimension = this.ZC.ZV(this.Zt);
    return paramFlatSVGIcon.derive(dimension.width, dimension.height);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze9w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */