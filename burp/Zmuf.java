package burp;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public class Zmuf {
  private final Zbnt ZB;
  
  private final Zey9 Zq;
  
  private final Zr_4 Zi;
  
  private final Supplier<Integer> Zr;
  
  private static Zbqc[] ZU;
  
  public Zmuf(Zbnt paramZbnt, Zey9 paramZey9, Zr_4 paramZr_4, Supplier<Integer> paramSupplier) {
    this.ZB = paramZbnt;
    this.Zq = paramZey9;
    this.Zi = paramZr_4;
    this.Zr = paramSupplier;
  }
  
  public Zzme ZS(Zzme paramZzme) {
    return this.Zi.<Zzme>ZH(new Zs5(((Integer)this.Zr.get()).intValue(), paramZzme));
  }
  
  public Zzme Zb(Zeew paramZeew, Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, long paramLong, String paramString) {
    Zefx zefx = this.Zq.Zu(paramZmzk, paramZstu1);
    Zkyt zkyt = Zrfn.Zk(zefx).or(paramZstu2::lambda$from$0).orElse(Zkyt.AUTO);
    Zbr zbr = Zbr.Zy(paramZstu1, zkyt);
    Zbqc[] arrayOfZbqc = Zp();
    if (Zbqc.Zwu() == null)
      Zo(new Zbqc[1]); 
    return Zl(paramZeew, paramZmzk, zbr, paramZstu2, paramLong, paramString);
  }
  
  public Zzme Zl(Zeew paramZeew, Zmzk paramZmzk, Zbr paramZbr, Zstu paramZstu, long paramLong, String paramString) {
    Zefx zefx = paramZbr.ZP(paramZmzk, this.Zq);
    Zlit zlit = zefx.ZF();
    List<Zlou> list = zefx.Zc();
    short s = 0;
    Zbqc[] arrayOfZbqc = Zp();
    Zs68 zs68 = null;
    Zstu zstu1 = null;
    if (paramZstu != null) {
      zs68 = Zbwc.Zt(zlit, paramZstu, Zt0k.HTML_HEAD_ANALYSIS, this.ZB);
      s = zs68.Zb;
      zstu1 = paramZstu.Zp(this.Zi);
    } 
    short s1 = Zb(zs68, zefx.ZF());
    Zefg<Zk94> zefg1 = paramZbr.ZO();
    Zefg<Zk94> zefg2 = null;
    if (zefg1 != null)
      if (this.Zi.Zi() && !zefg1.ZE(this.Zi.Zl())) {
        zefg2 = Zkk.ZV(this.Zi, Zk94.ZR);
        Objects.requireNonNull(zefg2);
        zefg1.stream().map(this::lambda$from$1).forEach(zefg2::add);
      } else {
        zefg2 = zefg1;
      }  
    Zstu zstu2 = paramZbr.Zr().Zp(this.Zi);
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[4]); 
    return this.Zi.<Zzme>ZH(new Zs5(Zbr.ZK(zefg2, zstu2, paramZbr.Zx()), zstu1, ((Integer)this.Zr.get()).intValue(), paramZeew, zefx.Zr(), zlit, (list == null) ? 0 : list.size(), s, paramLong, Zzsm.NEW, paramString, s1));
  }
  
  public static short Zb(Zs68 paramZs68, Zlit paramZlit) {
    short s = 0;
    if (paramZlit != null)
      s = Zt1t.ZC(paramZlit.Zd_()); 
    if (paramZs68 != null) {
      short s1 = Zt1t.Zl(paramZs68);
      if (s1 != 0)
        s = s1; 
    } 
    return s;
  }
  
  private Zk94 lambda$from$1(Zk94 paramZk94) {
    return paramZk94.ZO(this.Zi);
  }
  
  private static Optional lambda$from$0(Zstu paramZstu) {
    return Ztud.ZJ(paramZstu);
  }
  
  public static void Zo(Zbqc[] paramArrayOfZbqc) {
    ZU = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zp() {
    return ZU;
  }
  
  static {
    if (Zp() != null)
      Zo(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmuf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */