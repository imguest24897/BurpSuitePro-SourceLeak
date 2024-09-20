package burp;

import java.awt.Component;
import java.awt.Window;
import java.util.List;
import java.util.function.Predicate;
import javax.swing.SwingUtilities;

public class Zzo4 {
  private final List<Zxnc> Zv;
  
  private final Zxer ZY;
  
  private final Zbhw Zh;
  
  private final Zbc9 Zi;
  
  private Zewb Zd;
  
  public Zzo4(List<Zxnc> paramList, Zxer paramZxer, Zewb paramZewb, Zbhw paramZbhw, Zbc9 paramZbc9) {
    this.Zv = paramList;
    this.ZY = paramZxer;
    this.Zd = paramZewb;
    this.Zh = paramZbhw;
    this.Zi = paramZbc9;
  }
  
  public void Zm(Predicate<Zrm5> paramPredicate) {
    if (Zj(paramPredicate))
      return; 
    ZS(paramPredicate);
  }
  
  private boolean Zj(Predicate<Zrm5> paramPredicate) {
    Zxnc zxnc = ZB(paramPredicate);
    if (zxnc == null)
      return false; 
    if (zxnc.Zu()) {
      Component component = zxnc.Zl();
      component.requestFocus();
      Window window = SwingUtilities.getWindowAncestor(component);
      if (window != null)
        window.toFront(); 
      return true;
    } 
    return false;
  }
  
  private Zxnc ZB(Predicate<Zrm5> paramPredicate) {
    int i = Zbhx.Z_();
    for (Zxnc zxnc : this.Zv) {
      if (paramPredicate.test(zxnc.ZY()))
        return zxnc; 
      if (i != 0)
        break; 
    } 
    return null;
  }
  
  private void ZS(Predicate<Zrm5> paramPredicate) {
    int i = Zbhx.Z_();
    byte b = 0;
    while (b < this.ZY.getTabCount()) {
      Component component1 = this.ZY.getTabComponentAt(b);
      Component component2 = this.ZY.getComponentAt(b);
      Zxnc zxnc = Zbhx.ZJ((Zewb)component1, this.Zv);
      if (!paramPredicate.test(zxnc.ZY())) {
        b++;
        if (i != 0)
          break; 
        continue;
      } 
      ZG(component2, component1, zxnc);
      return;
    } 
  }
  
  private void ZG(Component paramComponent1, Component paramComponent2, Zxnc paramZxnc) {
    int i = Zbhx.Zr();
    if (this.Zd != null && this.Zd.equals(paramComponent2)) {
      this.Zd = null;
      this.ZY.setSelectedIndex(-1);
      paramZxnc.Zk();
      this.Zh.ZC();
      if (i == 0) {
        this.Zd = (Zewb)paramComponent2;
        this.ZY.setSelectedComponent(paramComponent1);
        paramZxnc.ZK();
        this.Zi.ZP(paramZxnc.Zl());
        this.Zh.ZV();
        return;
      } 
      return;
    } 
    this.Zd = (Zewb)paramComponent2;
    this.ZY.setSelectedComponent(paramComponent1);
    paramZxnc.ZK();
    this.Zi.ZP(paramZxnc.Zl());
    this.Zh.ZV();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzo4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */