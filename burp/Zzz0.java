package burp;

public class Zzz0 implements Zmxz {
  private final Zmxz ZS;
  
  public Zzz0(Zmxz paramZmxz) {
    this.ZS = paramZmxz;
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    Zze zze1 = new Zze(paramZrdb1);
    Zze zze2 = new Zze(paramZrdb2);
    if (zze1.Zd(zze2) || zze1.ZZ(zze2) || zze1.Zm(zze2))
      return Zl4m.ZX; 
    if (zze1.Zs && zze2.Zi && ZM(zze2.ZF, zze1.ZQ))
      zze2.ZF.ZmQ().ZT(zze1.ZQ.ZmQ()); 
    if (zze1.Zy && zze2.ZC && ZM(zze1.ZF, zze2.ZQ)) {
      Zgkc zgkc = paramZz1h.<Zgkc>Zz(zze2.ZQ.ZmQ());
      zze1.ZF.ZmQ().ZT((Zrde)zgkc);
    } 
    return this.ZS.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  private static boolean ZM(Zeqn paramZeqn, Zreg paramZreg) {
    return (paramZreg.ZmQ() != null && paramZeqn.ZmQ() != null && Ztx6.ZX(paramZeqn.ZmQ().Zuz(), paramZreg.ZmQ().Zuz()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzz0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */