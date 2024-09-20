package burp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public abstract class Zj3 extends Zni implements Ze6r {
  @Zzvo(7)
  protected final Zski Zd;
  
  @Zzvo(3)
  protected Zbj5 ZO;
  
  @Zzvo(6)
  protected Zttl ZA;
  
  protected Zj3(Zski paramZski, Zbj5 paramZbj5, Function<Zeu9, Zttl> paramFunction) {
    this.Zd = paramZski;
    this.ZO = paramZbj5;
    this.ZA = paramFunction.apply(this);
  }
  
  public Optional<Zski> ZHk() {
    return Optional.ofNullable(this.Zd);
  }
  
  public Zbj5 ZHN() {
    return this.ZO;
  }
  
  public void ZP(Zbj5 paramZbj5) {
    this.ZO = paramZbj5;
  }
  
  public List<Zl_> ZHp() {
    return Collections.unmodifiableList(this.ZA.ZBB());
  }
  
  public List<Zgyy> ZHR() {
    return Collections.unmodifiableList(this.ZA.ZBK());
  }
  
  public List<Zrp0> ZHV() {
    LinkedList<Zl_> linkedList = new LinkedList<>(this.ZA.ZBB());
    linkedList.addAll(this.ZA.ZBK());
    boolean bool = Zxue.Zml();
    if (Zbqc.Zwu() == null)
      Zxue.ZU(!bool); 
    return Collections.unmodifiableList((List)linkedList);
  }
  
  public void Za(List<Zgyy> paramList) {
    this.ZA.Zx(paramList);
  }
  
  public void ZN(Zttl paramZttl) {
    this.ZA = paramZttl;
  }
  
  public void ZR(Zsiv paramZsiv, Ztk0 paramZtk0, Zr69 paramZr69, Zz1m<Zt35> paramZz1m) {
    Zxw3.ZR(paramZsiv, ZHV(), paramZr69, paramZz1m);
  }
  
  public void Zp(Zsl5<?> paramZsl5) {
    Zxw3.Z_(paramZsl5, ZHV());
  }
  
  public String toString() {
    return Zxw3.ZI(this.Zd);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zj3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */