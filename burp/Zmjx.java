package burp;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public interface Zmjx<E> {
  List<Zmk7<E>> Zf();
  
  void Zn(Zmk7<E> paramZmk7);
  
  void ZD(Collection<Zmk7<E>> paramCollection);
  
  void Zj(int paramInt);
  
  void Z_(Zmk7<E> paramZmk7);
  
  void ZC(Collection<Zmk7<E>> paramCollection);
  
  void Zd(int paramInt, Zmk7<E> paramZmk7);
  
  void ZP(Zqq paramZqq);
  
  void Zw(Zqq paramZqq);
  
  void ZE(Zgni<E> paramZgni);
  
  void ZL(Zgni<E> paramZgni);
  
  int Za();
  
  void ZW(int paramInt, E paramE);
  
  void ZT(int paramInt, E paramE);
  
  void Zo(int paramInt, E paramE);
  
  default boolean Z_(E paramE, String paramString) {
    return Zf().stream().filter(Zmk7::ZD).map(paramE::lambda$searchColumns$0).filter(Objects::nonNull).anyMatch(paramString::lambda$searchColumns$1);
  }
  
  private static boolean lambda$searchColumns$1(String paramString, Object paramObject) {
    return paramObject.toString().toLowerCase().contains(paramString.toLowerCase());
  }
  
  private static Object lambda$searchColumns$0(Object paramObject, Zmk7<Object> paramZmk7) {
    return paramZmk7.Zx().Zl(paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmjx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */