package burp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public abstract class Zxue extends Zxsr implements Ze6r {
  private static boolean Zi;
  
  protected Zxue(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Optional<Zski> ZHk() {
    return Optional.ofNullable(this.Za.<Zski>ZJ(this, Zkxx.ZS));
  }
  
  public Zbj5 ZHN() {
    return this.Za.<Zbj5>ZJ(this, Zkxx.Z_);
  }
  
  public void ZP(Zbj5 paramZbj5) {
    this.Za.Zq(this, Zkxx.Z_, paramZbj5);
  }
  
  public List<Zl_> ZHp() {
    return Collections.unmodifiableList(((Zttl)this.Za.<Zttl>ZJ(this, Zkxx.Zi)).ZBB());
  }
  
  public List<Zgyy> ZHR() {
    return Collections.unmodifiableList(((Zttl)this.Za.<Zttl>ZJ(this, Zkxx.Zi)).ZBK());
  }
  
  public List<Zrp0> ZHV() {
    LinkedList<Zl_> linkedList = new LinkedList<>(((Zttl)this.Za.<Zttl>ZJ(this, Zkxx.Zi)).ZBB());
    linkedList.addAll(((Zttl)this.Za.<Zttl>ZJ(this, Zkxx.Zi)).ZBK());
    boolean bool = Zml();
    if (!bool)
      Zbqc.Zr(new Zbqc[1]); 
    return (List)linkedList;
  }
  
  public void Za(List<Zgyy> paramList) {
    ((Zttl)this.Za.<Zttl>ZJ(this, Zkxx.Zi)).Zx(paramList);
  }
  
  public void ZN(Zttl paramZttl) {
    this.Za.Zq(this, Zkxx.Zi, paramZttl);
  }
  
  public void ZR(Zsiv paramZsiv, Ztk0 paramZtk0, Zr69 paramZr69, Zz1m<Zt35> paramZz1m) {
    Zxw3.ZR(paramZsiv, ZHV(), paramZr69, paramZz1m);
  }
  
  public void Zp(Zsl5<?> paramZsl5) {
    Zxw3.Z_(paramZsl5, ZHV());
  }
  
  public String toString() {
    return Zxw3.ZI(ZHk().orElse(null));
  }
  
  public static void ZU(boolean paramBoolean) {
    Zi = paramBoolean;
  }
  
  public static boolean Zml() {
    return Zi;
  }
  
  public static boolean ZmN() {
    boolean bool = Zml();
    return !bool;
  }
  
  static {
    if (!Zml())
      ZU(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxue.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */