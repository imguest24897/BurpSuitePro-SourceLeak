package burp;

import java.util.Iterator;

public class Zrso {
  private final Zxs7 Zd;
  
  private final Zmhe ZK;
  
  private final Ze3n ZV;
  
  private final Zms4 Zp;
  
  private static int[] ZQ;
  
  public Zrso(Zmhe paramZmhe, Ze3n paramZe3n, Zxs7 paramZxs7, Zms4 paramZms4) {
    this.Zd = paramZxs7;
    this.ZK = paramZmhe;
    this.ZV = paramZe3n;
    this.Zp = paramZms4;
  }
  
  Zsqx<Zrdb> Zq(Zk2s paramZk2s) {
    Zlvf zlvf = this.ZK.ZK(Zri7.ZJ(new Zrrb(paramZk2s.ZP, (byte)0)), Zlp5.Zc().Zd(true));
    Zzud zzud = zlvf.ZM();
    Iterator<byte> iterator = paramZk2s.ZA.iterator();
    int[] arrayOfInt = Za();
    while (iterator.hasNext()) {
      byte[] arrayOfByte = (byte[])iterator.next();
      Ztmp ztmp = Zxfa.ZS(zzud, arrayOfByte);
      if (ztmp != null)
        return Zxfa.ZT(this.ZV, ztmp, this.Zd, paramZk2s, zlvf.ZY(), arrayOfByte); 
      if (arrayOfInt == null)
        break; 
    } 
    return null;
  }
  
  Zsqx<Zrdb> ZM(Zk2s paramZk2s) {
    Zlvf zlvf = this.ZK.ZK(Zri7.ZJ(new Zrrb(paramZk2s.ZP, (byte)0)), Zlp5.Zc().Zd(true));
    Zzud zzud = zlvf.ZM();
    Zr1i zr1i = new Zr1i(new byte[] { 44, 46, 36 });
    int[] arrayOfInt = Za();
    for (byte[] arrayOfByte : paramZk2s.ZA) {
      if (zr1i.Zk(zzud.ZT().Za().ZiD(), arrayOfByte)) {
        Zvow zvow = this.ZV.ZI().Zp(zlvf.ZY().ZE()).Zo(zzud.ZT()).ZK(zlvf.ZY().ZO()).Zf(new Zl1r(zr1i.ZB(), zr1i.Zk()));
        return Zzw6.Zt(this.ZV.Za(), this.ZV.ZN(), zvow, this.Zd, paramZk2s.Zc, paramZk2s.ZD, paramZk2s.ZP, arrayOfByte);
      } 
      if (arrayOfInt == null) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
    return null;
  }
  
  public Zms4 Zi() {
    return this.Zp;
  }
  
  public static void Zq(int[] paramArrayOfint) {
    ZQ = paramArrayOfint;
  }
  
  public static int[] Za() {
    return ZQ;
  }
  
  static {
    if (Za() == null)
      Zq(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrso.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */