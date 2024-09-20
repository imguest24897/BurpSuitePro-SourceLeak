package burp;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Zbqf implements Zr46 {
  private final Consumer<Zb6l> Zk;
  
  private final Zz1i ZE;
  
  private final Zkyp ZG;
  
  private final AtomicInteger ZZ = new AtomicInteger();
  
  private final AtomicInteger Zo = new AtomicInteger();
  
  private final Map<Zl5x, Zro7> ZT;
  
  public Zbqf(Consumer<Zb6l> paramConsumer, Zz1i paramZz1i, Zkyp paramZkyp) {
    Zbqc[] arrayOfZbqc = Zsc2.Zc();
    this.ZT = new ConcurrentHashMap<>();
    this.Zk = paramConsumer;
    this.ZE = paramZz1i;
    this.ZG = paramZkyp;
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (Zbza zbza : paramZz1i.ZHU()) {
      for (Zb09 zb09 : zbza.ZgA()) {
        try {
          if (ZY(zb09))
            ZG(zb09.ZJz()).ZA(zbza.Zgv()); 
        } catch (Zsc2 zsc2) {
          throw a(null);
        } 
        if (arrayOfZbqc != null) {
          Zbqc.Zr(new Zbqc[4]);
          break;
        } 
      } 
      for (Zl5x zl5x : Zl5x.ZI) {
        try {
          if (zbza.ZW(zl5x) == Zlby.FINISHED)
            ((AtomicInteger)hashMap.computeIfAbsent(zl5x, Zbqf::lambda$new$0)).incrementAndGet(); 
        } catch (Zsc2 zsc2) {
          throw a(null);
        } 
        if (arrayOfZbqc != null)
          break; 
      } 
      for (Zl5x zl5x : Zl5x.ZX) {
        try {
          if (zbza.ZW(zl5x) == Zlby.FINISHED)
            ((AtomicInteger)hashMap.computeIfAbsent(zl5x, Zbqf::lambda$new$0)).incrementAndGet(); 
        } catch (Zsc2 zsc2) {
          throw a(null);
        } 
        if (arrayOfZbqc != null)
          break; 
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
    for (Zl5x zl5x : hashMap.keySet()) {
      ZG(zl5x).ZD(((AtomicInteger)hashMap.get(zl5x)).get());
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  void Zt(Zbza paramZbza, Zb09 paramZb09) {
    if (ZY(paramZb09)) {
      Zb6l zb6l = ZY(paramZbza, paramZb09);
      try {
        if (zb6l != null)
          this.Zk.accept(zb6l); 
      } catch (Zsc2 zsc2) {
        throw a(null);
      } 
    } 
  }
  
  private boolean ZY(Zb09 paramZb09) {
    try {
      if (!paramZb09.ZJg())
        try {
          if (paramZb09.ZJ2() == null)
            try {
              if (paramZb09.ZJ4() == null);
            } catch (Zsc2 zsc2) {
              throw a(null);
            }  
        } catch (Zsc2 zsc2) {
          throw a(null);
        }  
    } catch (Zsc2 zsc2) {
      throw a(null);
    } 
    return false;
  }
  
  private Zb6l ZY(Zbza paramZbza, Zb09 paramZb09) {
    try {
    
    } catch (Zsc2 zsc2) {
      throw a(null);
    } 
    AtomicInteger atomicInteger = paramZb09.ZJz().Zv() ? this.ZZ : this.Zo;
    try {
      if (this.ZG.ZYX() > 0)
        try {
          if (atomicInteger.incrementAndGet() >= this.ZG.ZYX())
            return new Zb6l(Zec4.CONSECUTIVE_AUDIT_ITEM_FAILURES, Integer.valueOf(atomicInteger.get())); 
        } catch (Zsc2 zsc2) {
          throw a(null);
        }  
    } catch (Zsc2 zsc2) {
      throw a(null);
    } 
    Zro7 zro7 = ZG(paramZb09.ZJz());
    boolean bool = zro7.ZF(paramZbza);
    try {
      if (bool)
        return new Zb6l(Zec4.PERCENTAGE_OF_AUDIT_ITEM_FAILURES, Integer.valueOf(this.ZG.ZYe())); 
    } catch (Zsc2 zsc2) {
      throw a(null);
    } 
    return null;
  }
  
  private Zro7 ZG(Zl5x paramZl5x) {
    return this.ZT.computeIfAbsent(paramZl5x, this::lambda$failurePercentageFor$2);
  }
  
  public void ZD(Zbza paramZbza, Zl5x paramZl5x) {
    Zbqc[] arrayOfZbqc = Zsc2.Zc();
    try {
      ZG(paramZl5x).Zi(paramZbza);
      if (paramZl5x.Zv()) {
        try {
          this.ZZ.set(0);
          if (arrayOfZbqc != null) {
            this.Zo.set(0);
            return;
          } 
        } catch (Zsc2 zsc2) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zsc2 zsc2) {
      throw a(null);
    } 
    this.Zo.set(0);
  }
  
  private Zro7 lambda$failurePercentageFor$2(Zl5x paramZl5x) {
    return new Zro7(this.ZG, paramZl5x, this.ZE);
  }
  
  private static AtomicInteger lambda$new$0(Zl5x paramZl5x) {
    return new AtomicInteger();
  }
  
  private static Zsc2 a(Zsc2 paramZsc2) {
    return paramZsc2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbqf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */