package burp;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zgo_ extends Zbqc implements Zky2 {
  private Zs81 ZF;
  
  private Zbws Zl;
  
  public void Zt(Zs81 paramZs81, Ztn0 paramZtn0) {
    this.ZF = paramZs81;
    try {
      this.Zl = new Zbws(paramZtn0);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
      this.Zl = Zn();
    } 
    this.Zl.Zk(this);
    setLayout(new GridLayout(1, 1));
    Zbup zbup = new Zbup();
    zbup.setViewportView(this.Zl);
    add(zbup);
  }
  
  private Zbws Zn() {
    return new Zbws(new Zt_7(this));
  }
  
  void ZN() {
    this.ZF.Zr();
  }
  
  void ZH() {
    int i = this.Zl.getSelectedRow();
    if (i == -1)
      return; 
    i = this.Zl.convertRowIndexToModel(i);
    this.ZF.ZN(i);
  }
  
  void ZJ() {
    int[] arrayOfInt1 = Zgo0.ZF();
    int[] arrayOfInt2 = this.Zl.getSelectedRows();
    if (arrayOfInt2 == null || arrayOfInt2.length == 0)
      return; 
    int[] arrayOfInt3 = new int[arrayOfInt2.length];
    byte b = 0;
    while (b < arrayOfInt2.length) {
      arrayOfInt3[b] = this.Zl.convertRowIndexToModel(arrayOfInt2[b] - b);
      b++;
      if (arrayOfInt1 == null)
        break; 
    } 
    this.ZF.Zz(arrayOfInt3);
  }
  
  void Z_() {
    this.ZF.ZD();
  }
  
  void Zy() {
    this.ZF.ZV();
  }
  
  void ZW() {
    this.Zl.setEnabled(false);
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 != 0)
      return; 
    paramInt1 = this.Zl.convertRowIndexToModel(paramInt1);
    this.ZF.ZJ(paramInt1);
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.Zl.setEnabled(paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgo_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */