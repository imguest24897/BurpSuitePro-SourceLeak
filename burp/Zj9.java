package burp;

public class Zj9 extends Zni implements Ztk0 {
  @Zzvo(1)
  private final Zsiv Zj;
  
  @Zzvo(2)
  private final Zzwo<Zex6, Zg8m> ZX;
  
  Zj9(Zsiv paramZsiv, Zzwo<Zex6, Zg8m> paramZzwo) {
    this.Zj = paramZsiv;
    this.ZX = paramZzwo;
  }
  
  public void Zm(Zex6 paramZex6, Zszy paramZszy, Zrp0 paramZrp0, Zszw paramZszw, Zlru paramZlru, Zeu9 paramZeu9, Zz1m<Zt35> paramZz1m, Zmv7 paramZmv7) {
    Zbqc[] arrayOfZbqc = Zszu.Zo();
    Zm6t.Zz(paramZex6, paramZszy, paramZrp0, paramZszw, paramZlru, paramZeu9, this.ZX, this.Zj, new Zruo(), paramZz1m, paramZmv7);
    if (Zbqc.Zwu() == null)
      Zszu.Zu(new Zbqc[2]); 
  }
  
  public Zg8m Z_(Zrp0 paramZrp0) {
    return Zm6t.ZN(paramZrp0, this.ZX);
  }
  
  public void ZN7() {
    this.ZX.Zly();
  }
  
  public Zszy Zq(Zex6 paramZex6) {
    return Zm6t.Zp(paramZex6, this.ZX);
  }
  
  public Zeu4<? extends Ztk0> ZF() {
    return Ztk0.ZQ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zj9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */