package burp;

import java.util.concurrent.atomic.AtomicInteger;

public class Zpy extends Zni implements Zs98 {
  @Zzvo(1)
  private final Zefg<Zeo2> ZR;
  
  @Zzvo(2)
  private final Zefg<Zvo1> Zr;
  
  @Zzvo(3)
  private final Zqu Zu;
  
  @Zzvo(6)
  private final Zefg<Zez3> Zh;
  
  private final AtomicInteger ZG = new AtomicInteger(0);
  
  private final AtomicInteger Zv;
  
  Zpy(Zefg<Zeo2> paramZefg, Zefg<Zvo1> paramZefg1, Zqu paramZqu, Zefg<Zez3> paramZefg2) {
    boolean bool = Ze2i.Zp();
    this.Zv = new AtomicInteger(0);
    this.ZR = paramZefg;
    this.Zr = paramZefg1;
    this.Zu = paramZqu;
    this.Zh = paramZefg2;
    if (!bool)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public Zzcq<Zeo2> ZC6() {
    return new Zzcq<>(this.ZR);
  }
  
  public Zzcq<Zvo1> ZCB() {
    return new Zzcq<>(this.Zr);
  }
  
  public Zqu ZCE() {
    return this.Zu;
  }
  
  @Zzvo(4)
  public int ZC3() {
    return this.ZG.get();
  }
  
  public void Zzy(int paramInt) {
    this.ZG.set(paramInt);
  }
  
  @Zzvo(5)
  public int ZCD() {
    return this.Zv.get();
  }
  
  public void Zz4(int paramInt) {
    this.Zv.set(paramInt);
  }
  
  public Zefg<Zez3> ZCe() {
    return this.Zh;
  }
  
  public Zeu4<Zs98> ZF() {
    return Zs;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */