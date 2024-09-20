package burp;

import java.util.Set;

public class Zb1t {
  private final Zz28 ZO;
  
  private final Zey9 ZE;
  
  public Zb1t(Zz28 paramZz28, Zey9 paramZey9) {
    this.ZO = paramZz28;
    this.ZE = paramZey9;
  }
  
  public Zs0y<Zzme> Zg(Zs8g paramZs8g) {
    Zsa3<Zzme> zsa3 = new Zsa3();
    Zs0y<Zzme> zs0y = zsa3.ZW(ZP(paramZs8g));
    zs0y = zs0y.ZW(Zd(paramZs8g));
    boolean bool = Zkep.Zm();
    zs0y = zs0y.ZW(ZC(paramZs8g));
    zs0y = zs0y.ZW(ZL(paramZs8g));
    zs0y = zs0y.ZW(Zt(paramZs8g));
    zs0y = zs0y.ZW(ZF(paramZs8g));
    zs0y = zs0y.ZW(Zf(paramZs8g));
    zs0y = zs0y.ZW(Zs(paramZs8g));
    if (!bool)
      Zbqc.Zr(new Zbqc[5]); 
    return zs0y;
  }
  
  private Zs0y<Zzme> Zs(Zs8g paramZs8g) {
    Zs0y<Zzme> zs0y = new Zsa4();
    if (paramZs8g.ZSO())
      zs0y = zs0y.ZB(new Zsaz(Zzsm.NEW)); 
    if (paramZs8g.ZSX())
      zs0y = zs0y.ZB(new Zsaz(Zzsm.POSTPONED)); 
    if (paramZs8g.ZSz())
      zs0y = zs0y.ZB(new Zsaz(Zzsm.IN_PROGRESS)); 
    if (paramZs8g.ZSK())
      zs0y = zs0y.ZB(new Zsaz(Zzsm.DONE)); 
    if (paramZs8g.ZSS())
      zs0y = zs0y.ZB(new Zsaz(Zzsm.IGNORED)); 
    return zs0y;
  }
  
  private Zs0y<Zzme> Zf(Zs8g paramZs8g) {
    Zs0y<Zzme> zs0y = new Zsa3();
    if (paramZs8g.ZSY())
      zs0y = zs0y.ZW(new Zsed()); 
    if (paramZs8g.ZS_())
      zs0y = zs0y.ZW(new Zser()); 
    return zs0y;
  }
  
  private Zs0y<Zzme> ZF(Zs8g paramZs8g) {
    Zs0y<Zzme> zs0y = new Zsa3();
    if (paramZs8g.ZSe())
      zs0y = zs0y.ZW(new Zsec(paramZs8g.ZSa())); 
    if (paramZs8g.ZSP())
      zs0y = zs0y.Zh(new Zsec(paramZs8g.ZS2())); 
    return zs0y;
  }
  
  private Zs0y<Zzme> Zt(Zs8g paramZs8g) {
    Zs0y<T> zs0y;
    Zsa3<Zzme> zsa3 = new Zsa3();
    String str = paramZs8g.ZSV();
    if (str == null || str.isEmpty())
      return zsa3; 
    boolean bool = paramZs8g.ZS6();
    if (paramZs8g.ZS0()) {
      zs0y = bool ? (Zs0y)zsa3.Zh(new Zse5(str, paramZs8g.ZSl())) : (Zs0y)zsa3.ZW(new Zse5(str, paramZs8g.ZSl()));
    } else {
      zs0y = bool ? zs0y.Zh(new Zsax(str, paramZs8g.ZSl())) : zs0y.ZW(new Zsax(str, paramZs8g.ZSl()));
    } 
    return (Zs0y)zs0y;
  }
  
  private Zs0y<Zzme> ZL(Zs8g paramZs8g) {
    Zs0y<Zzme> zs0y = new Zsa4();
    if (paramZs8g.ZSo())
      zs0y = zs0y.ZB(new Zsaw(Zeew.TARGET)); 
    if (paramZs8g.ZSN())
      zs0y = zs0y.ZB(new Zsaw(Zeew.SCANNER)); 
    if (paramZs8g.ZSi())
      zs0y = zs0y.ZB(new Zsaw(Zeew.REPEATER)); 
    if (paramZs8g.ZSW())
      zs0y = zs0y.ZB(new Zsaw(Zeew.EXTENDER)); 
    if (paramZs8g.ZSy())
      zs0y = zs0y.ZB(new Zsaw(Zeew.PROXY)); 
    if (paramZs8g.ZSZ())
      zs0y = zs0y.ZB(new Zsaw(Zeew.INTRUDER)); 
    if (paramZs8g.ZSr())
      zs0y = zs0y.ZB(new Zsaw(Zeew.SEQUENCER)); 
    return zs0y;
  }
  
  private Zs0y<Zzme> ZC(Zs8g paramZs8g) {
    Zs0y<Zzme> zs0y = new Zsey();
    if (paramZs8g.ZSw())
      zs0y = zs0y.ZB(new Zsaf()); 
    if (paramZs8g.ZSR())
      zs0y = zs0y.ZB(new Zsaj()); 
    if (paramZs8g.ZSv())
      zs0y = zs0y.ZB(new Zsal()); 
    if (paramZs8g.ZSh())
      zs0y = zs0y.ZB(new Zsa6()); 
    return zs0y;
  }
  
  private Zs0y<Zzme> Zd(Zs8g paramZs8g) {
    null = new Zsa4();
    if (paramZs8g.ZSk())
      null = null.ZB(new Zset(Set.of(Short.valueOf((short)256)))); 
    if (paramZs8g.ZSL())
      null = null.ZB(new Zset(Set.of(Short.valueOf((short)259), Short.valueOf((short)260)))); 
    if (paramZs8g.ZSq())
      null = null.ZB(new Zset(Set.of(Short.valueOf((short)262)))); 
    if (paramZs8g.ZS9())
      null = null.ZB(new Zset(Set.of(Short.valueOf((short)258)))); 
    if (paramZs8g.ZSb())
      null = null.ZB(new Zset(Set.of(Short.valueOf((short)257), Short.valueOf((short)261)))); 
    if (paramZs8g.ZSI())
      null = null.ZB(new Zset(Set.of(Short.valueOf((short)512), Short.valueOf((short)513), Short.valueOf((short)514), Short.valueOf((short)515), Short.valueOf((short)516), Short.valueOf((short)517), Short.valueOf((short)518)))); 
    if (paramZs8g.ZSj())
      null = null.ZB(new Zset(Set.of(Short.valueOf((short)1026), Short.valueOf((short)1280)))); 
    if (paramZs8g.ZSH())
      null = null.ZB(new Zset(Set.of(Short.valueOf((short)1), Short.valueOf((short)768), Short.valueOf((short)769), Short.valueOf((short)1536), Short.valueOf((short)1537), Short.valueOf((short)1025)))); 
    return null.ZB(new Zsan());
  }
  
  private Zs0y<Zzme> ZP(Zs8g paramZs8g) {
    Zs0y<Zzme> zs0y = new Zsa3();
    if (paramZs8g.ZSm())
      zs0y = zs0y.ZW(new Zsao(this.ZO)); 
    if (paramZs8g.ZS3())
      zs0y = zs0y.Zh(new Zseg()); 
    if (paramZs8g.ZS1())
      zs0y = zs0y.ZW(new Zsa8(this.ZE)); 
    return zs0y;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb1t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */