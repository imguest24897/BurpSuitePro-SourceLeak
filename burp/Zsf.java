package burp;

import java.awt.event.MouseEvent;

public class Zsf implements Zm3g, Zky2 {
  protected final Zdx ZG;
  
  protected final Zt_m ZO;
  
  private final Zbws Zc;
  
  private final Ztgr Z_ = new Ztgr();
  
  private static Zbqc[] Zf;
  
  public Zsf(Zdx paramZdx) {
    this.ZG = paramZdx;
    this.ZO = new Zt_m(paramZdx);
    Zbqc[] arrayOfZbqc = ZI();
    this.Zc = new Zbws(this.ZO);
    this.Zc.Zk(this);
    if (Zbqc.Zwu() == null)
      ZM(new Zbqc[5]); 
  }
  
  public Zbws Zo() {
    return this.Zc;
  }
  
  public void Zu(Ze87 paramZe87) {
    this.ZG.Zf(paramZe87, this.ZO);
  }
  
  public void Ze(Ze87 paramZe87, int paramInt) {
    this.ZG.ZS(paramInt, paramZe87, this.ZO);
  }
  
  public Ze87 ZX(int paramInt) {
    return this.ZG.ZAM(paramInt);
  }
  
  public void Zl(int paramInt) {
    this.ZG.ZB(paramInt, this.ZO);
  }
  
  public void Zd(Zmf_ paramZmf_) {
    this.ZG.ZP(paramZmf_, this.ZO);
  }
  
  public void Zl(Zg4j paramZg4j) {
    this.ZG.ZF(paramZg4j);
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 != 0)
      return; 
    paramInt1 = this.Zc.convertRowIndexToModel(paramInt1);
    Ze87 ze87 = this.ZG.ZAM(paramInt1);
    ze87.ZkR(!ze87.Zut());
    this.ZO.fireTableCellUpdated(paramInt1, 0);
  }
  
  public static void ZM(Zbqc[] paramArrayOfZbqc) {
    Zf = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZI() {
    return Zf;
  }
  
  static {
    if (ZI() == null)
      ZM(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */