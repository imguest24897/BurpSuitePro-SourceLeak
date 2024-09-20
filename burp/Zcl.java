package burp;

import java.util.List;

public class Zcl extends Zni implements Zl34 {
  @Zzvo(0)
  private final boolean ZS;
  
  @Zzvo(2)
  private final Zefg<Zg55> ZK;
  
  @Zzvo(1)
  private final Zefg<Zmy8> Zv;
  
  @Zzvo(3)
  private boolean ZX;
  
  public Zcl(boolean paramBoolean) {
    this(paramBoolean, new Zyu<>(Zg55.Zi), new Zyu<>(Zmy8.Zc), true);
  }
  
  Zcl(boolean paramBoolean1, Zefg<Zg55> paramZefg, Zefg<Zmy8> paramZefg1, boolean paramBoolean2) {
    this.ZS = paramBoolean1;
    this.ZK = paramZefg;
    this.Zv = paramZefg1;
    this.ZX = paramBoolean2;
  }
  
  public boolean ZjZ() {
    return this.ZX;
  }
  
  public void ZOt(boolean paramBoolean) {
    this.ZX = paramBoolean;
  }
  
  public boolean Zji() {
    return ZjZ() ? this.ZK.isEmpty() : this.Zv.isEmpty();
  }
  
  public Zefg<Zg55> Zjg() {
    return this.ZK;
  }
  
  public Zg55 ZW7(int paramInt) {
    return this.ZK.get(paramInt);
  }
  
  public void Ze(Zg55 paramZg55, Ztn0 paramZtn0) {
    Zg0o.Zu(this, paramZg55, paramZtn0);
  }
  
  public void Zx(Zg55 paramZg55, int paramInt, Ztn0 paramZtn0) {
    Zg0o.Zi(this, paramZg55, paramInt, paramZtn0);
  }
  
  public void Zq(Zg55 paramZg55, Ztn0 paramZtn0) {
    Zg0o.Zz(this, paramZg55, paramZtn0);
  }
  
  public void Zf(int paramInt, Ztn0 paramZtn0) {
    Zg0o.Zt(this, paramInt, paramZtn0);
  }
  
  public Zefg<Zmy8> ZjM() {
    return this.Zv;
  }
  
  public Zmy8 ZW8(int paramInt) {
    return this.Zv.get(paramInt);
  }
  
  public void ZV(Zmy8 paramZmy8, Ztn0 paramZtn0) {
    Zg0o.Zu(this, paramZmy8, paramZtn0);
  }
  
  public void Zy(Zmy8 paramZmy8, int paramInt, Ztn0 paramZtn0) {
    Zg0o.Zx(this, paramZmy8, paramInt, paramZtn0);
  }
  
  public void ZE(Zmy8 paramZmy8, Ztn0 paramZtn0) {
    Zg0o.ZA(this, paramZmy8, paramZtn0);
  }
  
  public void ZW(int paramInt, Ztn0 paramZtn0) {
    Zg0o.ZT(this, paramInt, paramZtn0);
  }
  
  public boolean Zj(boolean paramBoolean, List<Zlwx> paramList, Zr_4 paramZr_4, Ztn0 paramZtn0) {
    return Zg0o.Zm(this, paramBoolean, paramList, paramZr_4, paramZtn0);
  }
  
  public Zeu4<Zl34> ZF() {
    return Zl34.ZJ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zcl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */