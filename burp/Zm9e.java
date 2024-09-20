package burp;

import javax.swing.Icon;

public class Zm9e extends Zm99 {
  private Icon ZQ;
  
  private Icon ZT;
  
  private Icon Zh;
  
  private Icon Zw;
  
  private Runnable ZG;
  
  private volatile boolean Za;
  
  public Zm9e() {
    setText("");
    Zk();
  }
  
  private void Zk() {
    addMouseListener(new Zxww(this));
  }
  
  public void Zr(String paramString, Icon paramIcon1, Icon paramIcon2, Icon paramIcon3, Runnable paramRunnable) {
    ZP(paramString, paramIcon1, paramIcon2, paramIcon3, (Icon)null, paramRunnable);
  }
  
  public void ZP(String paramString, Icon paramIcon1, Icon paramIcon2, Icon paramIcon3, Icon paramIcon4, Runnable paramRunnable) {
    this.ZQ = paramIcon1;
    this.ZT = paramIcon2;
    this.Zh = paramIcon3;
    this.Zw = paramIcon4;
    this.ZG = paramRunnable;
    setToolTipText(paramString);
    setIcon(this.Za ? paramIcon4 : paramIcon1);
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.Za = !paramBoolean;
    setIcon(paramBoolean ? this.ZQ : this.Zw);
  }
  
  public void removeNotify() {
    super.removeNotify();
    setIcon(this.ZQ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */