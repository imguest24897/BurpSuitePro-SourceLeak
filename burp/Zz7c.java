package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

class Zz7c {
  static void ZV(Zeu9 paramZeu9, Zt7v<Zrfx<Zeu9>> paramZt7v, Zr_4 paramZr_4) {
    Zbqc[] arrayOfZbqc = Zrno.Zo();
    synchronized (paramZt7v.Zz6()) {
      if (paramZeu9.ZHN().ZfU().ZX())
        return; 
      Collection<Zeu9> collection = paramZt7v.Ze(paramZeu9.ZHN().ZfU().ZT(), paramZr_4::lambda$addRoom$0);
      collection.add(paramZeu9);
    } 
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  static void Zw(Zeu9 paramZeu9, Zbj5 paramZbj5, Zt7v<Zrfx<Zeu9>> paramZt7v, Zr_4 paramZr_4) {
    if (paramZeu9.ZHN().ZfU() == paramZbj5.ZfU())
      return; 
    synchronized (paramZt7v.Zz6()) {
      Collection collection = paramZt7v.ZJ(paramZbj5.ZfU().ZT());
      if (collection != null)
        collection.remove(paramZeu9); 
      Collection<Zeu9> collection1 = paramZt7v.Ze(paramZeu9.ZHN().ZfU().ZT(), paramZr_4::lambda$addRoom$0);
      collection1.add(paramZeu9);
    } 
  }
  
  static Collection<Zeu9> ZU(Zbj5 paramZbj5, Zt7v<Zrfx<Zeu9>> paramZt7v) {
    if (paramZbj5.ZfU().ZX())
      return Collections.emptyList(); 
    synchronized (paramZt7v.Zz6()) {
      return Objects.<Collection<Zeu9>>requireNonNullElse(paramZt7v.ZJ(paramZbj5.ZfU().ZT()), Collections.emptyList());
    } 
  }
  
  private static Zrfx lambda$addRoom$0(Zr_4 paramZr_4, Long paramLong) {
    return paramZr_4.<Zrfx>ZH((Zsqx)new Zl0w<>(Zeu9.ZW));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz7c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */