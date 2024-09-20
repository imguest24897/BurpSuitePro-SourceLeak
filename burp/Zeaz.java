package burp;

import java.util.List;
import java.util.function.Predicate;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zeaz<T> implements Zln7<T> {
  private final Zln7<T> ZW;
  
  private final Zmct<T> ZH;
  
  public Zeaz(Predicate<T> paramPredicate, List<T> paramList1, List<T> paramList2) {
    this.ZW = new Zmt4<>(paramPredicate);
    this.ZH = new Zmct<>(paramList1.size(), paramList2);
  }
  
  public Predicate<T> Zx() {
    return this::lambda$predicate$0;
  }
  
  public boolean Zv() {
    return this.ZW.Zv();
  }
  
  public boolean ZI() {
    return false;
  }
  
  public void ZH() {}
  
  public void Zb(Zgc<T> paramZgc) {
    this.ZW.Zb(paramZgc);
  }
  
  public void ZA(Zgc<T> paramZgc) {
    this.ZW.ZA(paramZgc);
  }
  
  public void Zf() {
    this.ZW.Zf();
  }
  
  public void ZX(int paramInt, T paramT) {
    this.ZW.ZX(paramInt, paramT);
  }
  
  public void ZA(int paramInt) {
    this.ZW.ZA(paramInt);
  }
  
  public void ZN() {
    this.ZW.ZN();
  }
  
  private boolean lambda$predicate$0(Object paramObject) {
    try {
      try {
      
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return this.ZH.Zz() ? this.ZW.Zx().test(paramObject) : this.ZH.Zt((T)paramObject);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.USER_ERROR);
      return false;
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeaz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */