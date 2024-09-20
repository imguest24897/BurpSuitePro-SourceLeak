package burp;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Collectors;

class Zrs9 {
  static void Zw(Zeu9 paramZeu9, Zt7v<Zrfx<Zeu9>> paramZt7v, Zr_4 paramZr_4) {
    Zbqc[] arrayOfZbqc = Zei4.ZW();
    Iterator<Long> iterator = paramZeu9.ZHN().Zf3().iterator();
    while (iterator.hasNext()) {
      long l = ((Long)iterator.next()).longValue();
      synchronized (paramZt7v.Zz6()) {
        Collection<Zeu9> collection = paramZt7v.Ze(l, paramZr_4::lambda$addRoom$0);
        collection.add(paramZeu9);
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zei4.ZY(new Zbqc[4]); 
  }
  
  static Collection<Zeu9> ZY(Zbj5 paramZbj5, Zt7v<Zrfx<Zeu9>> paramZt7v) {
    Zbqc[] arrayOfZbqc = Zei4.ZW();
    synchronized (paramZt7v.Zz6()) {
      if (arrayOfZbqc == null)
        Zbqc.Zr(new Zbqc[4]); 
      return Za(paramZbj5, paramZt7v);
    } 
  }
  
  static void Zy(Zeu9 paramZeu9, Zbj5 paramZbj5, Zt7v<Zrfx<Zeu9>> paramZt7v, Zr_4 paramZr_4) {
    Zbqc[] arrayOfZbqc = Zei4.ZW();
    if (paramZeu9.ZHN().Zf3().equals(paramZbj5.Zf3()))
      return; 
    synchronized (paramZt7v.Zz6()) {
      Zn(paramZbj5, paramZt7v).forEach(paramZeu9::lambda$matchingCriteriaChanged$1);
      Iterator<Long> iterator = paramZeu9.ZHN().Zf3().iterator();
      while (iterator.hasNext()) {
        long l = ((Long)iterator.next()).longValue();
        Collection<Zeu9> collection = paramZt7v.Ze(l, paramZr_4::lambda$addRoom$0);
        collection.add(paramZeu9);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
  }
  
  private static Collection<Zeu9> Za(Zbj5 paramZbj5, Zt7v<Zrfx<Zeu9>> paramZt7v) {
    synchronized (paramZt7v.Zz6()) {
      Objects.requireNonNull(paramZt7v);
      return (Collection<Zeu9>)paramZbj5.Zf3().Zv().map(paramZt7v::ZJ).filter(Objects::nonNull).flatMap(Collection::stream).collect(Collectors.toUnmodifiableSet());
    } 
  }
  
  private static Collection<Zrfx<Zeu9>> Zn(Zbj5 paramZbj5, Zt7v<Zrfx<Zeu9>> paramZt7v) {
    synchronized (paramZt7v.Zz6()) {
      Objects.requireNonNull(paramZt7v);
      return (Collection<Zrfx<Zeu9>>)paramZbj5.Zf3().Zv().map(paramZt7v::ZJ).filter(Objects::nonNull).collect(Collectors.toSet());
    } 
  }
  
  private static void lambda$matchingCriteriaChanged$1(Zeu9 paramZeu9, Zrfx paramZrfx) {
    paramZrfx.remove(paramZeu9);
  }
  
  private static Zrfx lambda$addRoom$0(Zr_4 paramZr_4, Long paramLong) {
    return paramZr_4.<Zrfx>ZH((Zsqx)new Zl0w<>(Zeu9.ZW));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrs9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */