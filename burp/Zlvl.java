package burp;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.portswigger.Zm2;
import net.portswigger.Zsy;

public class Zlvl implements Zeu7 {
  private final Zrgd ZG;
  
  private final Supplier<Boolean> ZB;
  
  private final Zzmb ZU;
  
  private final Zz28 ZX;
  
  private final Zkq4 Zt;
  
  private final Zkl6 Zr;
  
  private final Zrs4 ZV;
  
  private final Zkg9 ZC;
  
  private final Supplier<Zg0y> ZE;
  
  private final Supplier<Collection<Zrp0>> Zz;
  
  private final Consumer<Zrp0> Zv;
  
  private final Ztdi Zc;
  
  private final Zgb6 Zm;
  
  private final Zkus ZL;
  
  private final Zsy Zi;
  
  private final Zlax Zq;
  
  public Zlvl(Zrgd paramZrgd, Supplier<Boolean> paramSupplier, Zzmb paramZzmb, Zz28 paramZz28, Zkq4 paramZkq4, Zkl6 paramZkl6, Zrs4 paramZrs4, Zgb6 paramZgb6, Zkg9 paramZkg9, Supplier<Zg0y> paramSupplier1, Supplier<Collection<Zrp0>> paramSupplier2, Consumer<Zrp0> paramConsumer, Ztdi paramZtdi, Ztks paramZtks, Zzs1 paramZzs1, Zkus paramZkus, Zsy paramZsy) {
    this.ZG = paramZrgd;
    this.ZB = paramSupplier;
    this.ZU = paramZzmb;
    int[] arrayOfInt = Zm4b.ZB();
    try {
      this.ZX = paramZz28;
      this.Zt = paramZkq4;
      this.Zr = paramZkl6;
      this.ZV = paramZrs4;
      this.ZC = paramZkg9;
      this.ZE = paramSupplier1;
      this.Zz = paramSupplier2;
      this.Zv = paramConsumer;
      this.Zc = paramZtdi;
      this.Zm = paramZgb6;
      this.ZL = paramZkus;
      this.Zi = paramZsy;
      this.Zq = new Zlax(paramZtks, paramZzs1, this.ZX, paramZzmb, paramZgb6);
      if (Zbqc.Zwu() == null)
        Zm4b.Zh(new int[2]); 
    } catch (Zscv zscv) {
      throw a(null);
    } 
  }
  
  public Ztv0 ZA(Zbza paramZbza, Ztpx paramZtpx) {
    Zthl zthl = Zf(paramZbza, paramZtpx);
    Zli8 zli8 = (new Zm4d(this.Zr.ZB(), Zlvl::lambda$getPathExecutorFrom$0, this.ZX, this.Zm.ZU0())).ZL(this.ZU.ZT()).ZI(true, this.Zc).ZU(true, this.Zi).Zy();
    Zzg0 zzg0 = paramZbza.Zg3();
    Collection<Zrp0> collection = this.Zz.get();
    int[] arrayOfInt = Zm4b.ZB();
    Optional<Ztc6> optional = ((Zg0y)this.ZE.get()).ZE(Ztiq.Zk().ZV(collection).ZD(zzg0.Zlc(), zzg0.Zl1(), zzg0.ZlF()));
    try {
      if (optional.isEmpty()) {
        try {
        
        } catch (Zscv zscv) {
          throw a(null);
        } 
        Zm2.Zo(collection.isEmpty() ? Zze0.SCANNER_PATH_TO_SCAN_NOT_FOUND : Zze0.SCANNER_PATH_TO_SCAN_BLOCKED);
        throw new Zscv(zzg0.Zlc());
      } 
    } catch (Zscv zscv) {
      throw a(null);
    } 
    try {
      if (!collection.isEmpty())
        Zm2.Zo(Zze0.SCANNER_ALTERNATE_PATH_FOUND); 
    } catch (Zscv zscv) {
      throw a(null);
    } 
    Zey9 zey9 = this.Zr.ZH();
    Zmzk zmzk = zzg0.Zl_();
    Zstu zstu = zzg0.Zlf();
    Zefx zefx = zey9.Zu(zmzk, zstu);
    Zkks zkks = Zkks.Zs(zzg0, zefx);
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Ztv0(this.Zt, zthl, zli8, optional.get(), this.ZV, zefx, zzg0.ZlA(), zkks, this.Zr, this.ZU.ZD());
  }
  
  private Zthl Zf(Zbza paramZbza, Ztpx paramZtpx) {
    Zrm7 zrm7 = new Zrm7(this.ZG);
    Zkvp zkvp = this.ZL.ZK(zrm7, paramZbza, this.ZC, paramZtpx);
    Zs5d zs5d = new Zs5d(zkvp, this.ZX, zrm7, this.Zr, this.ZU, this.Zv, this.Zm);
    try {
      if (((Boolean)this.ZB.get()).booleanValue())
        return new Zzza(this.Zv, zs5d, zkvp, this.Zq); 
    } catch (Zscv zscv) {
      throw a(null);
    } 
    return zs5d;
  }
  
  private static void lambda$getPathExecutorFrom$0(Zlvj paramZlvj) {}
  
  private static Zscv a(Zscv paramZscv) {
    return paramZscv;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlvl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */