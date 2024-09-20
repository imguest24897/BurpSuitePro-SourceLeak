package burp;

import burp.api.montoya.logger.LoggerCaptureHttpRequestResponse;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public class Zt57 {
  private final Ztef Z_;
  
  private final Zbnt Ze;
  
  private final Zvo0 Zf;
  
  private final Zskh ZU;
  
  private final Zz28 Zi;
  
  private final Ztwv ZC;
  
  private final Zskl Zx;
  
  public Zt57(Ztef paramZtef, Zbnt paramZbnt, Zvo0 paramZvo0, Zskh paramZskh, Zz28 paramZz28, Ztwv paramZtwv, Zskl paramZskl) {
    this.Z_ = paramZtef;
    this.Ze = paramZbnt;
    this.Zf = paramZvo0;
    this.ZU = paramZskh;
    this.Zi = paramZz28;
    this.ZC = paramZtwv;
    this.Zx = paramZskl;
  }
  
  public Zkyq ZQ(Zlfb paramZlfb, Ztj1 paramZtj1, Zskh paramZskh, Zgna paramZgna, Zrbm paramZrbm, Supplier<Zbs1> paramSupplier, Zl2h paramZl2h, Zlli<Zt10> paramZlli) {
    AtomicReference atomicReference = new AtomicReference();
    try {
      Zlog zlog;
      Zr5h zr5h;
      Ze9i ze9i;
      Zmjp zmjp;
      Zbur zbur;
      Zezo zezo;
      Ztos<Zt1o> ztos1;
      Zxn8 zxn8;
      Zriy zriy;
      Zes4 zes4;
      Zmot zmot;
      Zmor zmor;
      Ztos<Zt1o> ztos2;
      Zkye zkye;
      Zky7 zky7;
      Zkyh zkyh;
      Zmoy zmoy;
      Zxsz zxsz;
      Zkyv zkyv;
      Zkyb zkyb;
      switch (Zg0w.Zv[paramZtj1.Zl().ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
          zlog = (Zlog)paramZgna;
          Objects.requireNonNull(atomicReference);
          zmjp = Zl(zlog.Zd5().Za1(), paramZtj1, atomicReference::get);
          zezo = (Zezo)paramZrbm;
          Objects.requireNonNull(atomicReference);
          zmot = paramZl2h.ZX(paramZtj1, zlog, paramZlfb, paramZskh, paramSupplier, zmjp.ZF, zmjp.ZW, atomicReference::set);
          zky7 = new Zky7(paramZtj1, zlog, zmot, this.Z_);
          zky7.ZC(paramZtj1.Zr(), zezo.ZV(), paramZlli);
        case 2:
        case 3:
          zr5h = (Zr5h)paramZgna;
          Objects.requireNonNull(atomicReference);
          zmjp = Zl(zr5h.Zd5().Za1(), paramZtj1, atomicReference::get);
          ztos1 = ((Zriy)paramZrbm).ZO();
          Objects.requireNonNull(atomicReference);
          zmor = paramZl2h.ZE(paramZtj1, zr5h, paramZlfb, paramZskh, paramSupplier, zmjp.ZF, zmjp.ZW, ztos1, atomicReference::set);
          zkyh = new Zkyh(paramZtj1, zr5h, zmor, this.Z_);
          zkyh.ZI(paramZtj1.Zr(), ztos1);
        case 4:
        case 5:
          zr5h = (Zzep)paramZgna;
          Objects.requireNonNull(atomicReference);
          zmjp = Zl(zr5h.Zd5().Za1(), paramZtj1, atomicReference::get);
          zxn8 = (Zxn8)paramZrbm;
          ztos2 = zxn8.ZH().ZO();
          Objects.requireNonNull(atomicReference);
          zmoy = paramZl2h.ZA(paramZtj1, (Zzep)zr5h, paramZlfb, paramZskh, paramSupplier, zmjp.ZF, zmjp.ZW, ztos2, atomicReference::set);
          zkyv = new Zkyv(paramZtj1, (Zzep)zr5h, zmoy, this.Z_);
          zkyv.ZS(paramZtj1.Zr(), zxn8.Z_().ZV(), ztos2);
        case 6:
        case 7:
        case 8:
          zr5h = (Ztr3)paramZgna;
          Objects.requireNonNull(atomicReference);
          zmjp = Zl(zr5h.Zd5().Za1(), paramZtj1, atomicReference::get);
          zriy = (Zriy)paramZrbm;
          ztos2 = zriy.ZO();
          Objects.requireNonNull(atomicReference);
          zxsz = paramZl2h.Zh(paramZtj1, (Ztr3)zr5h, paramZlfb, paramZskh, paramSupplier, zmjp.ZF, zmjp.ZW, ztos2, atomicReference::set);
          zkyb = new Zkyb(paramZtj1, (Ztr3)zr5h, zriy.ZO(), zxsz, this.Z_);
          zxsz.Zu(zkyb);
          zkyb.ZF(paramZtj1.Zr());
        case 9:
          ze9i = (Ze9i)paramZgna;
          zbur = (Zbur)paramZrbm;
          zes4 = paramZl2h.Zn(paramZtj1, ze9i, paramZlfb);
          zkye = new Zkye(paramZtj1, ze9i, zes4, this.Z_);
          zes4.Zg(zkye);
          zkye.ZU(paramZtj1.Zr(), paramZlli);
          zbur.ZD(zkye);
        case 10:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zzys zzys = (Zzys)paramZgna;
    Zmau zmau = paramZl2h.Zu(paramZtj1, zzys, paramZlfb, paramSupplier);
    Zkym zkym = new Zkym(paramZtj1, zzys, zmau, this.Z_);
    zkym.ZF(paramZtj1.Zr());
  }
  
  private Zmjp Zl(Zgzp paramZgzp, Ztj1 paramZtj1, Supplier<Zs4l<LoggerCaptureHttpRequestResponse, Boolean>> paramSupplier) {
    Zmjp zmjp = Zmjp.ZT(paramZgzp, this.ZC, this.Ze, this.ZU.ZD(paramZtj1.Zh()).ZQ(Zeew.DASHBOARD), this.Zf, this.Zi, new Ztz2(paramZgzp, paramSupplier, this.Zx, this.Ze));
    paramZtj1.Zr().ZE(Zt13.Zd, zmjp::lambda$buildLoggerDependencies$0);
    zmjp.ZW.ZGJ();
    return zmjp;
  }
  
  private static void lambda$buildLoggerDependencies$0(Zmjp paramZmjp, Zxr8 paramZxr8) {
    paramZmjp.ZF.ZH();
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt57.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */