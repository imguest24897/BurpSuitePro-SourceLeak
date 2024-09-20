package burp;

import java.util.function.Supplier;

class Zkap implements Zt7b {
  private final Supplier<Integer> Zh;
  
  private final Ztn0 Zx;
  
  private final Zzjc Z_;
  
  private final Zedy ZH;
  
  private final Zbdf ZD;
  
  private final Zbdf ZN;
  
  final Zbvk ZQ;
  
  Zkap(Zbvk paramZbvk, Supplier<Integer> paramSupplier, Ztn0 paramZtn0, Zzjc paramZzjc, Zedy paramZedy, Zbdf paramZbdf1, Zbdf paramZbdf2) {
    this.Zh = paramSupplier;
    this.Zx = paramZtn0;
    this.Z_ = paramZzjc;
    this.ZH = paramZedy;
    this.ZD = paramZbdf1;
    this.ZN = paramZbdf2;
  }
  
  public void Zj(Zgu3 paramZgu3) {}
  
  public void ZU() {}
  
  public void Zn() {
    this.ZQ.ZM.ZI();
    try {
      int i = ((Integer)this.Zh.get()).intValue();
      if (i < 0)
        return; 
      Zsgq zsgq1 = this.Z_.ZK(i);
      Zsmh zsmh1 = this.ZD.Zi();
      Zsmh zsmh2 = this.ZN.Zi();
      Zlso zlso = new Zlso();
      zsmh1.Zh(zlso);
      zsmh2.Zh(zlso);
      Zsgq zsgq2 = this.ZH.Zv(zsgq1, zlso.Zi, zlso.Zw);
      this.Z_.Zr(i, zsgq2);
      this.Zx.fireTableRowsUpdated(i, i);
    } finally {
      this.ZQ.ZM.ZK();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkap.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */