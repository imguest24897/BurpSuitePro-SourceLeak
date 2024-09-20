package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.portswigger.Zlz;

public class Zepd extends Zepe implements ActionListener {
  private final Ztm0 Za;
  
  private final boolean Zj;
  
  private final int ZO;
  
  Zepd(Ztm0 paramZtm0, String paramString, boolean paramBoolean, int paramInt) {
    super(Zlz.ZB(paramString, 60));
    this.Za = paramZtm0;
    this.Zj = paramBoolean;
    this.ZO = paramInt;
    addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    int[] arrayOfInt = Zzg5.Zr();
    if (this.Zj) {
      this.Za.ZK(this.ZO);
      if (arrayOfInt != null) {
        this.Za.Zp(this.ZO);
        return;
      } 
      return;
    } 
    this.Za.Zp(this.ZO);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zepd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */