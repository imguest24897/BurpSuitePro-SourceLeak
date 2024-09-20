package burp;

import java.awt.event.MouseAdapter;
import javax.swing.Icon;

public class Zm9g extends Zm99 {
  private Zlkk ZA = Zlkk.RADIO_BAR_INACTIVE_FOREGROUND;
  
  private Zlkk Zf = Zlkk.RADIO_BAR_INACTIVE_BACKGROUND;
  
  private Icon Zw;
  
  private Icon Zq;
  
  private Icon Zy;
  
  private MouseAdapter Z_;
  
  private boolean ZX;
  
  public void ZO(String paramString1, Icon paramIcon, String paramString2, Runnable paramRunnable) {
    Zs(paramString1, paramIcon, paramIcon, paramIcon, paramString2, paramRunnable, paramRunnable);
  }
  
  public void Zs(String paramString1, Icon paramIcon1, Icon paramIcon2, Icon paramIcon3, String paramString2, Runnable paramRunnable1, Runnable paramRunnable2) {
    this.Zw = paramIcon1;
    this.Zq = paramIcon2;
    this.Zy = paramIcon3;
    setText(paramString1);
    setIcon(paramIcon1);
    setBorder(Zbs6.Ze());
    setFocusable(false);
    setOpaque(true);
    setToolTipText(paramString2);
    Ze(this.ZA);
    ZO(this.Zf);
    if (this.Z_ == null) {
      this.Z_ = new Zk8_(this, paramRunnable2, paramRunnable1);
      addMouseListener(this.Z_);
    } 
  }
  
  public void Ze(Zlkk paramZlkk) {
    super.Ze(paramZlkk);
    this.ZA = paramZlkk;
  }
  
  public void ZO(Zlkk paramZlkk) {
    super.ZO(paramZlkk);
    this.Zf = paramZlkk;
  }
  
  public void setEnabled(boolean paramBoolean) {
    boolean bool = Zm99.ZQ();
    super.setEnabled(paramBoolean);
    super.Ze(paramBoolean ? this.ZA : Zlkk.RADIO_BAR_DISABLED_FOREGROUND);
    super.ZO((paramBoolean && this.ZX) ? Zlkk.RADIO_BAR_INACTIVE_HOVER_BACKGROUND : this.Zf);
    if (paramBoolean) {
      setIcon(this.ZX ? this.Zq : this.Zw);
      if (bool) {
        setIcon(this.Zy);
        return;
      } 
      return;
    } 
    setIcon(this.Zy);
  }
  
  private void Zi() {
    if (isEnabled()) {
      super.Ze(this.ZX ? Zlkk.RADIO_BAR_INACTIVE_HOVER_FOREGROUND : this.ZA);
      super.ZO(this.ZX ? Zlkk.RADIO_BAR_INACTIVE_HOVER_BACKGROUND : this.Zf);
    } 
  }
  
  private void Zy() {
    if (isEnabled())
      setIcon(this.ZX ? this.Zq : this.Zw); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */