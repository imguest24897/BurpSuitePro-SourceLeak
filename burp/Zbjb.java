package burp;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import net.portswigger.Zto;

public abstract class Zbjb<T> implements Zbzl<T> {
  private final BiConsumer<Zb09, Throwable> Z_;
  
  private final Supplier<Integer> Zt;
  
  private final Set<T> Zb = new HashSet<>();
  
  private final Set<Zto<Zb09, Throwable>> ZX = Collections.synchronizedSet(new HashSet<>());
  
  private static String Za;
  
  protected Zbjb(BiConsumer<Zb09, Throwable> paramBiConsumer, Supplier<Integer> paramSupplier) {
    this.Z_ = paramBiConsumer;
    this.Zt = paramSupplier;
  }
  
  public void Zq(T paramT, Throwable paramThrowable) {
    String str = ZP();
    if (paramThrowable instanceof Zktz) {
      Zktz zktz = (Zktz)paramThrowable;
      throw zktz;
    } 
    if (paramThrowable instanceof Zsd8) {
      Zsd8 zsd8 = (Zsd8)paramThrowable;
      ZJ(zsd8);
    } 
    if (paramThrowable instanceof Zsck) {
      Zsck zsck = (Zsck)paramThrowable;
      ZJ(zsck);
    } 
    synchronized (this.Zb) {
      this.Zb.add(paramT);
      if (this.Zb.size() >= ((Integer)this.Zt.get()).intValue()) {
        this.ZX.clear();
        Zsdf zsdf = new Zsdf(paramThrowable);
        ZP(zsdf);
      } 
    } 
    try {
      this.ZX.add(Zto.ZM(ZZ(paramT, paramThrowable), paramThrowable));
      if (str == null)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (Zktz zktz) {
      throw a(null);
    } 
  }
  
  protected abstract Zb09 ZZ(T paramT, Throwable paramThrowable);
  
  protected void ZJ(RuntimeException paramRuntimeException) {
    throw paramRuntimeException;
  }
  
  protected void ZP(Zsdf paramZsdf) {
    throw paramZsdf;
  }
  
  public void Zv() {
    synchronized (this.Zb) {
      this.Zb.clear();
    } 
  }
  
  protected void Zp(Zb09 paramZb09, Throwable paramThrowable) {
    this.Z_.accept(paramZb09, paramThrowable);
  }
  
  public void Zc() {
    this.ZX.forEach(this::lambda$reportFailures$0);
    this.ZX.clear();
  }
  
  private void lambda$reportFailures$0(Zto paramZto) {
    Zp((Zb09)paramZto.Zq, (Throwable)paramZto.Zo);
  }
  
  public static void ZN(String paramString) {
    Za = paramString;
  }
  
  public static String ZP() {
    return Za;
  }
  
  private static Zktz a(Zktz paramZktz) {
    return paramZktz;
  }
  
  static {
    if (ZP() == null)
      ZN("YJ4DU"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbjb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */