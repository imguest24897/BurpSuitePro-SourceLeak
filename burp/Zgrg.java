package burp;

import java.util.Iterator;
import java.util.Set;
import net.portswigger.Zm2;

public class Zgrg {
  private final Zerg ZG;
  
  private final Set<Zeew> ZW;
  
  private final boolean Zo;
  
  private final Zkit ZE;
  
  private final Zbnt ZR;
  
  private final Ztg4 Zt;
  
  private final Zey9 ZV;
  
  public Zgrg(Zerg paramZerg, Set<Zeew> paramSet, boolean paramBoolean, Zkit paramZkit, Zbnt paramZbnt, Ztg4 paramZtg4, Zey9 paramZey9) {
    this.ZG = paramZerg;
    this.ZW = paramSet;
    this.Zo = paramBoolean;
    this.ZE = paramZkit;
    this.ZR = paramZbnt;
    this.Zt = paramZtg4;
    this.ZV = paramZey9;
  }
  
  public void Zi(Zr_4 paramZr_4, Zlc8 paramZlc8) throws Zev3 {
    Zm2.ZC(Zrrh.SUITE_PROJECTS_IMPORT_PROJECT);
    Zzir zzir = paramZr_4.<Zzir>Zj(Zzir.Zg);
    Zskz zskz = zzir.Zvm();
    Zlod zlod = zzir.Zvu();
    Zz4b zz4b = zzir.Zv9();
    Zeh6 zeh6 = zzir.Zvj();
    Zg94 zg94 = zzir.Zvl();
    boolean bool = Zs14.ZY();
    Zsph zsph = zzir.ZvA();
    Zb_9 zb_9 = zzir.Zvo();
    try {
    
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    byte b1 = this.ZW.contains(Zeew.TARGET) ? Zd(zskz) : 0;
    try {
    
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    byte b2 = this.ZW.contains(Zeew.PROXY) ? (zlod.ZGl().size() + zlod.ZGW().size()) : 0;
    try {
    
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    byte b3 = this.ZW.contains(Zeew.SCANNER) ? (zz4b.ZV_().size() + zz4b.ZVQ().size()) : 0;
    try {
    
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    byte b4 = this.ZW.contains(Zeew.REPEATER) ? zeh6.Ziv().size() : 0;
    try {
    
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    byte b5 = this.ZW.contains(Zeew.COLLABORATOR) ? (int)zg94.ZI().stream().filter(Zgrg::lambda$importProject$0).count() : 0;
    try {
    
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    byte b6 = this.ZW.contains(Zeew.ORGANISER) ? zsph.ZsI().size() : 0;
    try {
    
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    byte b7 = this.ZW.contains(Zeew.EXTENDER) ? zb_9.ZoK() : 0;
    float f1 = 0.0F;
    float f2 = 100.0F / (b1 + b2 + b3 + b4 + b5 + b6 + b7);
    Zlu6 zlu6 = (new Zm6w(paramZr_4, this.Zt, this.ZR, this.ZV)).ZU(new Zm31[] { Zk3e.ZD, Zk3e.ZX }).ZH(true).Zo();
    Ztg8 ztg8 = Zgjv.Zi(paramZr_4, this.ZE, zlu6, Zl2m.ZO, Zsa2.Zo);
    Zeom zeom = new Zeom();
    if (b1 > 0) {
      this.ZG.Zj().ZK(zskz, ztg8, paramZlc8, f1, f2);
      f1 += f2 * b1;
    } 
    try {
      if (b2 > 0 && !paramZlc8.ZS()) {
        this.ZG.Zl().ZI(paramZr_4, zzir, ztg8, zeom, paramZlc8, f1, f2);
        f1 += f2 * b2;
      } 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    try {
      if (b3 > 0)
        try {
          if (!paramZlc8.ZS()) {
            try {
              if (this.Zo)
                this.ZG.Zk().ZFE(); 
            } catch (Zev3 zev3) {
              throw a(null);
            } 
            this.ZG.Zk().ZH(zz4b, ztg8, paramZlc8, f1, f2);
            f1 += f2 * b3;
          } 
        } catch (Zev3 zev3) {
          throw a(null);
        }  
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    try {
      if (b4 > 0 && !paramZlc8.ZS()) {
        this.ZG.ZS().Zv(paramZr_4, zzir, ztg8, zeom, paramZlc8, f1, f2);
        f1 += f2 * b4;
      } 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    try {
      if (b5 > 0 && !paramZlc8.ZS()) {
        this.ZG.ZQ().Zi(zg94, ztg8, paramZlc8, f1, f2);
        f1 += f2 * b5;
      } 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    try {
      if (b6 > 0 && !paramZlc8.ZS()) {
        this.ZG.Zo().ZE(zsph, ztg8, paramZlc8, f1, f2);
        f1 += f2 * b6;
      } 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    try {
      if (b7 > 0)
        try {
          if (!paramZlc8.ZS())
            this.ZG.ZW().ZI(zb_9, ztg8, paramZlc8, f1, f2); 
        } catch (Zev3 zev3) {
          throw a(null);
        }  
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    try {
      if (!paramZlc8.ZS())
        paramZlc8.Zq(100.0F, null); 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    try {
      if (!bool)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
  }
  
  private int Zd(Zskz paramZskz) {
    int i = 0;
    Iterator<Zzhb> iterator = paramZskz.Zwx().ZlZ().iterator();
    boolean bool = Zs14.Zo();
    while (iterator.hasNext()) {
      Zzhb zzhb = iterator.next();
      i += Zg(zzhb);
      if (bool)
        break; 
    } 
    return i;
  }
  
  private int Zg(Zez3 paramZez3) {
    Zl9n zl9n = new Zl9n(this);
    paramZez3.ZK(zl9n);
    return zl9n.Z_ + 1;
  }
  
  private static boolean lambda$importProject$0(Zmx paramZmx) {
    return !paramZmx.Zp().isEmpty();
  }
  
  private static Zev3 a(Zev3 paramZev3) {
    return paramZev3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgrg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */