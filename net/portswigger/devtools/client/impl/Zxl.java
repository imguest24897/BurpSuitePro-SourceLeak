package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;

public class Zxl<E extends Zl> implements Zs {
  private final Map<Zof, Set<Zxl<?>>> ZZ;
  
  private final Zof Zr;
  
  private final Zp<E> Zx;
  
  private final Class<E> Zl;
  
  private static int Zs;
  
  public static <E extends Zl> Zxl<E> ZO(Map<Zof, Set<Zxl<?>>> paramMap, Zg paramZg, Object[] paramArrayOfObject) {
    Zof zof = paramZg.name();
    Zp<E> zp = (Zp)paramArrayOfObject[0];
    int i = Z_();
    Class<? extends Zl> clazz = paramZg.Zsb();
    if (i == 0)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zxl<>(paramMap, zof, zp, (Class)clazz);
  }
  
  private Zxl(Map<Zof, Set<Zxl<?>>> paramMap, Zof paramZof, Zp<E> paramZp, Class<E> paramClass) {
    this.ZZ = Objects.<Map<Zof, Set<Zxl<?>>>>requireNonNull(paramMap);
    this.Zr = Objects.<Zof>requireNonNull(paramZof);
    this.Zx = Objects.<Zp<E>>requireNonNull(paramZp);
    this.Zl = Objects.<Class<E>>requireNonNull(paramClass);
  }
  
  public void Zf() {
    Set set = this.ZZ.get(this.Zr);
    int i = ZY();
    if (set != null)
      set.remove(this); 
    if (Zbqc.Zwu() == null)
      ZV(++i); 
  }
  
  public void Zp(Zl paramZl) throws InterruptedException {
    this.Zx.Zy((Zl)this.Zl.cast(paramZl));
  }
  
  public static void ZV(int paramInt) {
    Zs = paramInt;
  }
  
  public static int ZY() {
    return Zs;
  }
  
  public static int Z_() {
    int i = ZY();
    return (i == 0) ? 82 : 0;
  }
  
  static {
    if (Z_() == 0)
      ZV(61); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */