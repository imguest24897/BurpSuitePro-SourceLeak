package burp;

import java.awt.Component;
import javax.swing.SwingUtilities;

public class Zl3o implements Zmd5 {
  private final Zxco Zx;
  
  private Zxe5 ZL;
  
  private Zxao ZG;
  
  private Zxey ZZ;
  
  private Zr86 ZK;
  
  public Zl3o(Zxco paramZxco) {
    this.Zx = paramZxco;
  }
  
  public Zxer ZW(Zsnv paramZsnv) {
    if (this.ZL == null)
      this.ZL = this.Zx.ZS(); 
    this.ZL.ZN(paramZsnv);
    return this.ZL;
  }
  
  public Zxer Zj(Zzj5 paramZzj5) {
    if (this.ZG == null)
      this.ZG = this.Zx.ZJ(); 
    this.ZG.Zc(paramZzj5);
    return this.ZG;
  }
  
  public Zxer Z_(Zb0p paramZb0p) {
    if (this.ZZ == null)
      this.ZZ = this.Zx.Zc(); 
    this.ZZ.Zu(paramZb0p);
    return this.ZZ;
  }
  
  public Zxer ZX(Zglw paramZglw) {
    if (this.ZK == null)
      this.ZK = new Zr86(this.Zx); 
    return this.ZK.Zm(paramZglw);
  }
  
  public void Zh() {
    if (this.ZL != null && this.ZL.getParent() == null)
      SwingUtilities.updateComponentTreeUI((Component)this.ZL); 
    if (this.ZG != null && this.ZG.getParent() == null)
      SwingUtilities.updateComponentTreeUI((Component)this.ZG); 
    if (this.ZZ != null && this.ZZ.getParent() == null)
      SwingUtilities.updateComponentTreeUI((Component)this.ZZ); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl3o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */