package net.portswigger;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Za6<T> {
  private final Zrx7 ZJ;
  
  private final BiFunction<Zl5, Ztj, T> Zf;
  
  private final Class<T> Zt;
  
  private Consumer<Throwable> Zb = Zby.ZI;
  
  private Zs_ Za = new Zdn();
  
  private final List<Zcp> ZX = new ArrayList<>();
  
  private final List<Zd0> Zg;
  
  private final List<Class> Zs;
  
  public Za6(Zrx7 paramZrx7, Function<Ztj, T> paramFunction, Class<T> paramClass) {
    this(paramZrx7, paramFunction::lambda$new$1, paramClass);
  }
  
  public Za6(Zrx7 paramZrx7, BiFunction<Zl5, Ztj, T> paramBiFunction, Class<T> paramClass) {
    String str = Zby.Zf();
    this.Zg = new ArrayList<>();
    this.Zs = (List)new ArrayList<>();
    this.ZJ = paramZrx7;
    this.Zf = paramBiFunction;
    this.Zt = paramClass;
    if (Zbqc.Zwu() == null)
      Zby.Zi("mrwvr"); 
  }
  
  public Za6<T> Z_(Zs_ paramZs_) {
    this.Za = paramZs_;
    return this;
  }
  
  public Za6<T> Zs(Zcp paramZcp) {
    this.ZX.add(paramZcp);
    return this;
  }
  
  public Za6<T> Zw(Zd0 paramZd0) {
    this.Zg.add(paramZd0);
    return this;
  }
  
  public Za6<T> ZW(Class paramClass) {
    this.Zs.add(paramClass);
    return this;
  }
  
  public Zby<T> Zy() {
    return new Zby<>(this.Zb, this.ZJ, this.Zf, this.Za, this.ZX, this.Zg, this.Zt, this.Zs);
  }
  
  private static Object lambda$new$1(Function paramFunction, Zl5 paramZl5, Ztj paramZtj) {
    return paramFunction.apply(paramZtj);
  }
  
  private static Object lambda$new$0(Supplier paramSupplier, Zl5 paramZl5, Ztj paramZtj) {
    return paramSupplier.get();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Za6.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */