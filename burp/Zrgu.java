package burp;

import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zsy;
import net.portswigger.Ztu;

abstract class Zrgu implements Zlxc {
  final Ze3n Zg;
  
  final Zxs7 Zi;
  
  final Zxzq Zz;
  
  final Zbxv ZE;
  
  private final Zmhe Z_;
  
  private final Zsy Zf;
  
  Zrgu(Zbxv paramZbxv, Zsy paramZsy, Ze3n paramZe3n, Zxs7 paramZxs7, Zmhe paramZmhe, Zxzq paramZxzq) {
    this.ZE = paramZbxv;
    this.Zf = paramZsy;
    Zbqc[] arrayOfZbqc = Zrg2.ZS();
    this.Zg = paramZe3n;
    this.Zi = paramZxs7;
    this.Z_ = paramZmhe;
    this.Zz = paramZxzq;
    if (Zbqc.Zwu() == null)
      Zrg2.ZD(new Zbqc[4]); 
  }
  
  Zgit ZM(String paramString, Zrn2 paramZrn2) {
    Zbqc[] arrayOfZbqc = Zrg2.ZS();
    for (Zgit zgit : Zxdf.ZP(this.Zi, this.Zz.Zc, ZC(paramString))) {
      if (paramZrn2.Zk(paramString, zgit))
        return zgit; 
      if (arrayOfZbqc == null)
        break; 
    } 
    return null;
  }
  
  Zku6 ZC(String paramString) {
    return (new Ztsh(this.Z_, (byte)0, Zkb.Zy(paramString), (byte)2, (byte)3)).ZQ(Zxar.ZK(Zkb.Zy(paramString)));
  }
  
  void ZD(Zz4_ paramZz4_, String paramString, Zrn2 paramZrn2) {
    if (this.ZE.Zp(this.Zz.ZP)) {
      Zgit zgit = ZM(paramString, paramZrn2);
      if (zgit != null) {
        this.ZE.Zn(this.Zz.ZP);
        this.Zz.Zc.ZM(this.Zi, zgit, paramZz4_, this.Zg.ZN(), this.Zg.Zod());
      } 
    } 
  }
  
  static Zrn2 ZS(String paramString) {
    return paramString::lambda$stringReflectionMatcher$0;
  }
  
  boolean ZQ(Zgit paramZgit) {
    Zbqc[] arrayOfZbqc = Zrg2.ZS();
    if (paramZgit.ZU.Zn() && paramZgit.ZH == 2) {
      if (Zo(paramZgit.ZU.ZV().ZM().ZL(), paramZgit))
        return true; 
      for (Zefx zefx : paramZgit.ZU.ZV().ZM().ZO()) {
        if (Zo(zefx, paramZgit))
          return true; 
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    return false;
  }
  
  private boolean Zo(Zefx paramZefx, Zgit paramZgit) {
    if (paramZefx == null)
      return false; 
    byte[] arrayOfByte = paramZefx.ZF().Zd4();
    return (Zli.ZR(Ztu.ZS(arrayOfByte), Zkb.Zy(paramZgit.Zv)) != -1);
  }
  
  String ZR(int paramInt) {
    return this.Zf.Zi().Zq().ZK(paramInt);
  }
  
  private static boolean lambda$stringReflectionMatcher$0(String paramString1, String paramString2, Zgit paramZgit) {
    return Zsw8.Zh(paramZgit.Zj, paramString1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrgu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */