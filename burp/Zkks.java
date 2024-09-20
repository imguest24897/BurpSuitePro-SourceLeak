package burp;

import java.util.List;
import java.util.Optional;

public class Zkks implements Zb1n {
  private final Zl8r ZD;
  
  private final Zrjb ZR;
  
  private static boolean Z_;
  
  private Zkks(Zl8r paramZl8r, Zrjb paramZrjb) {
    this.ZD = paramZl8r;
    this.ZR = paramZrjb;
  }
  
  public static Zkks Zs(Zzg0 paramZzg0, Zefx paramZefx) {
    return ZM(paramZefx, paramZzg0.ZlQ(), paramZzg0.Zll(), paramZzg0.Zlk());
  }
  
  public static Zkks ZM(Zefx paramZefx, int paramInt1, boolean paramBoolean, int paramInt2) {
    boolean bool = Zv();
    if (Zbqc.Zwu() == null)
      ZT(!bool); 
    return new Zkks(Zl8r.ZP(paramZefx, paramBoolean), new Zrjb(paramInt1, paramInt2, paramBoolean));
  }
  
  public static Zkks Zt() {
    return new Zkks(Zkks::lambda$doNotLocate$0, Zrjb.ZT2());
  }
  
  public boolean Zd(Zefx paramZefx, int paramInt, boolean paramBoolean) {
    return !this.ZR.ZQ(paramInt, paramBoolean) ? false : this.ZD.Zr(paramZefx);
  }
  
  public int Zl() {
    return this.ZR.ZTe();
  }
  
  public boolean Zx() {
    return this.ZR.ZTV();
  }
  
  public boolean ZL() {
    boolean bool = Zu();
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
    return (this.ZR.ZTe() == this.ZR.ZTt() - 1);
  }
  
  public static Optional<Zsxd> ZO(int paramInt, Zsxd paramZsxd) {
    List<Zg3d> list1 = paramZsxd.ZX();
    if (paramInt >= list1.size())
      return Optional.empty(); 
    List<Zg3d> list2 = list1.subList(paramInt, list1.size());
    return Optional.of(new Zrbo(list2));
  }
  
  public Optional<Zsxd> ZV(Zkan paramZkan) {
    return ZO(this.ZR.ZTe(), paramZkan.ZK());
  }
  
  public Zkks ZH() {
    return new Zkks(this.ZD, this.ZR.ZTB());
  }
  
  private static boolean lambda$doNotLocate$0(Zefx paramZefx) {
    return false;
  }
  
  public static void ZT(boolean paramBoolean) {
    Z_ = paramBoolean;
  }
  
  public static boolean Zu() {
    return Z_;
  }
  
  public static boolean Zv() {
    boolean bool = Zu();
    return !bool;
  }
  
  static {
    if (!Zv())
      ZT(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkks.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */