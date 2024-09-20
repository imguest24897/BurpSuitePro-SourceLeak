package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zkb;

class Zgvz {
  private final Zmhe ZK;
  
  private final Zxs7 ZT;
  
  private final Zrbu Zv;
  
  private final Zz4_ ZA;
  
  private final Zrfj ZG;
  
  private final Zr3z Za;
  
  private final Zbjl Zm;
  
  private final Ztai Z_;
  
  private final Ze3n Ze;
  
  private final Zesv Zu;
  
  Zgvz(Zbjl paramZbjl, Zmhe paramZmhe, Zxs7 paramZxs7, Ztai paramZtai, Zrbu paramZrbu, Ze3n paramZe3n, Zz4_ paramZz4_, Zrfj paramZrfj, Zr3z paramZr3z, Zesv paramZesv) {
    this.Zm = paramZbjl;
    this.Z_ = paramZtai;
    this.Ze = paramZe3n;
    this.ZK = paramZmhe;
    this.Zu = paramZesv;
    this.ZT = paramZxs7;
    this.Zv = paramZrbu;
    this.ZA = paramZz4_;
    this.ZG = paramZrfj;
    this.Za = paramZr3z;
  }
  
  public void ZU() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : Lburp/Zrbu;
    //   4: aload_0
    //   5: getfield ZT : Lburp/Zxs7;
    //   8: invokeinterface Zc : (Lburp/Zxs7;)Lburp/Zzwz;
    //   13: astore_2
    //   14: invokestatic Zp : ()[I
    //   17: aload_2
    //   18: invokeinterface ZK : ()Ljava/util/List;
    //   23: invokeinterface iterator : ()Ljava/util/Iterator;
    //   28: astore_3
    //   29: astore_1
    //   30: aload_3
    //   31: invokeinterface hasNext : ()Z
    //   36: ifeq -> 131
    //   39: aload_3
    //   40: invokeinterface next : ()Ljava/lang/Object;
    //   45: checkcast burp/Zewx
    //   48: astore #4
    //   50: aload #4
    //   52: aload_0
    //   53: getfield Zm : Lburp/Zbjl;
    //   56: invokevirtual ZA : (Lburp/Zbjl;)Z
    //   59: ifeq -> 127
    //   62: aload_0
    //   63: invokevirtual Zd : ()Ljava/lang/Boolean;
    //   66: invokevirtual booleanValue : ()Z
    //   69: ifeq -> 113
    //   72: aload_0
    //   73: getfield ZK : Lburp/Zmhe;
    //   76: new burp/Zrrb
    //   79: dup
    //   80: aload #4
    //   82: invokevirtual Zh : ()[B
    //   85: aload #4
    //   87: invokevirtual ZY : ()B
    //   90: invokespecial <init> : ([BB)V
    //   93: invokestatic ZJ : (Lburp/Zlb8;)Lburp/Zri7;
    //   96: invokestatic Zc : ()Lburp/Zlp5;
    //   99: iconst_1
    //   100: invokevirtual Zd : (Z)Lburp/Zlp5;
    //   103: invokeinterface ZK : (Lburp/Zri7;Lburp/Zlp5;)Lburp/Zlvf;
    //   108: pop
    //   109: aload_1
    //   110: ifnonnull -> 127
    //   113: aload_0
    //   114: aload_0
    //   115: getfield ZK : Lburp/Zmhe;
    //   118: checkcast burp/Zs_6
    //   121: aload_2
    //   122: aload #4
    //   124: invokevirtual Zd : (Lburp/Zs_6;Lburp/Zzwz;Lburp/Zewx;)V
    //   127: aload_1
    //   128: ifnonnull -> 30
    //   131: return
  }
  
  private void Zd(Zs_6 paramZs_6, Zzwz paramZzwz, Zewx paramZewx) {
    Ze3n ze3n = paramZs_6.ZH();
    Zszi zszi = this.Zu.Za(ze3n, this.ZT);
    Zlvf zlvf = zszi.ZK(Zri7.ZJ(new Zrrb(paramZewx.Zh(), paramZewx.ZY())), Zlp5.Zc().Zd(true));
    int[] arrayOfInt = Zz6s.Zp();
    List<Zer0> list = ZY(paramZewx);
    if (!list.isEmpty()) {
      ZS(ze3n, paramZzwz, paramZewx, zlvf, list);
      if (arrayOfInt == null) {
        Zf(paramZewx, zlvf);
        return;
      } 
      return;
    } 
    Zf(paramZewx, zlvf);
  }
  
  private void Zf(Zewx paramZewx, Zlvf paramZlvf) {
    Zszi zszi = this.Zu.Za(this.Ze, this.ZT);
    Zlvf zlvf = zszi.Zb();
    List<Zer0> list = ZY(paramZewx);
    if (!list.isEmpty() && this.Z_.Zr(Zzu2.SQL_INJECTION_2ND_ORDER) && this.Z_.ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.COLLABORATOR_BASED) && this.Z_.ZS(Zzu2.SQL_INJECTION_2ND_ORDER, this.Za)) {
      int i = Zgky.ZQ(paramZewx.ZG());
      this.ZG.Zi(new Zzwa(paramZlvf.ZB(), paramZlvf.ZD(), this.ZT, Zbll.Zu(paramZewx, paramZlvf.ZM().ZT().Za().ZiD()), Zr(paramZewx, paramZlvf, zlvf, i), i));
    } 
  }
  
  private void ZS(Ze3n paramZe3n, Zzwz paramZzwz, Zewx paramZewx, Zlvf paramZlvf, List<Zer0> paramList) {
    if (this.Z_.Zr(Zzu2.SQL_INJECTION) && this.Z_.ZS(Zzu2.SQL_INJECTION, Zr3z.COLLABORATOR_BASED) && this.Z_.ZS(Zzu2.SQL_INJECTION, this.Za))
      this.ZA.Zz(paramZzwz.ZZ(paramZewx).Zt(paramZe3n, this.ZT, null, Zbll.Zu(paramZewx, paramZlvf.ZM().ZT().Za().ZiD()), paramList)); 
  }
  
  private List<Zer0> ZY(Zewx paramZewx) {
    return this.Zm.Zn(paramZewx.ZF());
  }
  
  private Boolean Zd() {
    return this.ZK.<Boolean>Zq(Boolean.valueOf(true), Boolean.valueOf(false));
  }
  
  private Zm1m Zr(Zewx paramZewx, Zlvf paramZlvf1, Zlvf paramZlvf2, int paramInt) {
    return new Zm1m(new Zz25(paramZewx.ZV(), paramInt), ZA(paramZlvf1), ZA(paramZlvf2), Zkb.Zy(this.ZK.ZO()), Zkb.Zy(this.Ze.ZN()));
  }
  
  private Zvow ZA(Zlvf paramZlvf) {
    return this.Ze.ZI().ZC(paramZlvf.ZM().Z_()).Zu(paramZlvf.ZM().Zl()).Z_(Collections.emptyList()).ZF(paramZlvf.ZM().Zx());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */