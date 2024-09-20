package burp;

import java.util.Collection;
import java.util.Objects;

public class Ze2a {
  final Zrui ZT = Zzrx.Zb(3);
  
  final Zrui ZU = Zzrx.Zb(3);
  
  final Zrui ZW = Zg70.ZB(30);
  
  final Zrui Zx = Zg31.ZG(1);
  
  final Zrui Zh = Zg31.ZG(1);
  
  final Zrui Zf = Zg31.ZG(3);
  
  final Zsyl Zy = Zbok.ZjQ();
  
  final Zsyl Zd = Ze85.ZU7();
  
  final Zrui ZE = Zzrx.Zb(3);
  
  final Zrui Zz = Zzrx.Zb(3);
  
  final Zrui ZH = Zzrx.Zb(3);
  
  final Zsyl ZJ = Zqj.Zrd();
  
  private static int[] ZQ;
  
  public Ze2a Zv(String paramString) {
    this.Zx.ZG(paramString);
    return this;
  }
  
  public Ze2a Zz(byte paramByte) {
    this.Zh.ZG(Byte.valueOf(paramByte));
    return this;
  }
  
  public Ze2a Zb(String paramString) {
    this.Zf.ZG(paramString);
    return this;
  }
  
  public Ze2a Zl(String paramString) {
    this.ZT.ZG(paramString);
    return this;
  }
  
  public Ze2a Ze(String paramString) {
    this.ZU.ZG(paramString);
    return this;
  }
  
  public Ze2a Zo(Zefg<Zzjv> paramZefg) {
    this.ZW.ZG(paramZefg);
    return this;
  }
  
  public Ze2a ZH(Zefg<Zbz1> paramZefg) {
    this.Zy.ZG(paramZefg);
    return this;
  }
  
  public Ze2a ZP(Zr2a paramZr2a) {
    this.Zd.ZG(paramZr2a);
    return this;
  }
  
  public Ze2a ZV(String paramString) {
    this.ZE.ZG(paramString);
    return this;
  }
  
  public Ze2a Z_(String paramString) {
    this.Zz.ZG(paramString);
    return this;
  }
  
  public Ze2a Zm(String paramString) {
    this.ZH.ZG(paramString);
    return this;
  }
  
  public Ze2a Zd(Collection<Zsdr> paramCollection) {
    this.ZJ.ZG(paramCollection);
    return this;
  }
  
  Zti9 ZZ(Zr_4 paramZr_4) {
    return paramZr_4.<Zti9>ZH(new Zb3b(this));
  }
  
  public static Zti9 Zh(Iterable<Zm6i> paramIterable) {
    Ze2a ze2a = new Ze2a();
    Objects.requireNonNull(ze2a);
    paramIterable.forEach(ze2a::Zi);
    return ze2a.ZZ(new Zruo());
  }
  
  private void Zi(Zm6i paramZm6i) {
    paramZm6i.Zo(this);
  }
  
  public static void ZN(int[] paramArrayOfint) {
    ZQ = paramArrayOfint;
  }
  
  public static int[] Zj() {
    return ZQ;
  }
  
  static {
    if (Zj() == null)
      ZN(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze2a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */