package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Zxx6 implements ActionListener {
  private final Zt4u ZH;
  
  private final Zr_4 Zc;
  
  private final Zgb6 ZR;
  
  private final Zxzc Zz;
  
  private final Zl04 ZI;
  
  private final Zskh ZX;
  
  private final Zbnt ZQ;
  
  private final Ztwv Za;
  
  private final Ztg4 ZG;
  
  private final Zzzt Zl;
  
  private final Zey9 Zf;
  
  private final Object ZZ;
  
  private Zz28 Zg;
  
  private Zic Zp;
  
  private Timer Zj;
  
  private Zemh Zs;
  
  Zxx6(Zt4u paramZt4u, Zr_4 paramZr_4, Zgb6 paramZgb6, Zxzc paramZxzc, Zl04 paramZl04, Zskh paramZskh, Zbnt paramZbnt, Ztwv paramZtwv, Ztg4 paramZtg4, Zzzt paramZzzt, Zey9 paramZey9) {
    this.ZH = paramZt4u;
    this.Zc = paramZr_4;
    this.ZR = paramZgb6;
    this.Zz = paramZxzc;
    this.ZI = paramZl04;
    this.ZX = paramZskh;
    this.ZQ = paramZbnt;
    this.Za = paramZtwv;
    this.ZG = paramZtg4;
    this.Zl = paramZzzt;
    this.Zf = paramZey9;
    this.ZZ = new Object();
  }
  
  public void Zz(Zz28 paramZz28, Zic paramZic) {
    this.Zg = paramZz28;
    this.Zp = paramZic;
  }
  
  public void Zz() {
    int i = Zeew.ZL();
    if (Za()) {
      if (this.ZR.ZfY()) {
        ZL(this.ZR.Zfs() * 60 * 1000);
        if (i != 0) {
          ZC();
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    ZC();
  }
  
  private boolean Za() {
    return (!Zb12.ZG() && this.Zc.Zi());
  }
  
  private void ZL(int paramInt) {
    int i = Zeew.ZL();
    if (this.Zj == null) {
      this.Zj = new Timer(paramInt, this);
      this.Zj.start();
      if (i != 0) {
        if (this.Zj.getDelay() != paramInt) {
          this.Zj.setDelay(paramInt);
          this.Zj.setInitialDelay(paramInt);
          this.Zj.restart();
        } 
        return;
      } 
      return;
    } 
    if (this.Zj.getDelay() != paramInt) {
      this.Zj.setDelay(paramInt);
      this.Zj.setInitialDelay(paramInt);
      this.Zj.restart();
    } 
  }
  
  private void ZC() {
    if (this.Zj != null) {
      this.Zj.stop();
      this.Zj = null;
    } 
  }
  
  public boolean ZG() {
    Zemh zemh;
    ZC();
    synchronized (this.ZZ) {
      zemh = this.Zs;
    } 
    if (zemh != null)
      zemh.ZH(); 
    return false;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (Za())
      synchronized (this.ZZ) {
        if (this.Zs == null) {
          this.Zs = new Zemh(this);
          this.Za.Zx(this.Zs);
        } 
      }  
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxx6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */