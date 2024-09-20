package burp;

import burp.api.montoya.internal.MontoyaObjectFactory;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public class Zlx8 implements Zm0l {
  private final Zz1m<Zt1n> ZB;
  
  private final Zz0n Zq;
  
  private final Zerg ZA;
  
  private final Zkl6 ZP;
  
  private final Zbnt ZR;
  
  private final Ztwv Zg;
  
  private final Zbqx Zy;
  
  private final Ztyg Zi;
  
  private final Zgq7 ZD;
  
  private final Zslu Za;
  
  private final Zl77 Zb;
  
  private final Zm6v Zn;
  
  private final Supplier<Zbiv> ZW;
  
  private final Zzqg ZI;
  
  private final Zg0s ZO;
  
  private final Zs2g ZY;
  
  private final Zz_s ZU;
  
  private final Zrid Zj;
  
  private final Zs0n Zv;
  
  private final MontoyaObjectFactory ZL;
  
  private final Zxj8 Zz;
  
  private final int ZN;
  
  private final Zr_4 ZV;
  
  private final Zm6x ZF;
  
  public Zlx8(Zz1m<Zt1n> paramZz1m, Zz0n paramZz0n, Zerg paramZerg, Zkl6 paramZkl6, Zbnt paramZbnt, Ztwv paramZtwv, Zbqx paramZbqx, Ztyg paramZtyg, Zgq7 paramZgq7, Zslu paramZslu, Zl77 paramZl77, Zm6v paramZm6v, Supplier<Zbiv> paramSupplier, Zzqg paramZzqg, Zg0s paramZg0s, Zs2g paramZs2g, Zz_s paramZz_s, Zrid paramZrid, Zs0n paramZs0n, MontoyaObjectFactory paramMontoyaObjectFactory, Zxj8 paramZxj8, int paramInt, Zr_4 paramZr_4, Zm6x paramZm6x) {
    this.ZB = paramZz1m;
    this.Zq = paramZz0n;
    this.ZA = paramZerg;
    this.ZP = paramZkl6;
    this.ZR = paramZbnt;
    this.Zg = paramZtwv;
    this.Zy = paramZbqx;
    this.Zi = paramZtyg;
    this.ZD = paramZgq7;
    this.Za = paramZslu;
    this.Zb = paramZl77;
    this.Zn = paramZm6v;
    this.ZW = paramSupplier;
    this.ZI = paramZzqg;
    this.ZO = paramZg0s;
    this.ZY = paramZs2g;
    this.ZU = paramZz_s;
    this.Zj = paramZrid;
    this.Zv = paramZs0n;
    this.ZL = paramMontoyaObjectFactory;
    this.Zz = paramZxj8;
    this.ZN = paramInt;
    this.ZV = paramZr_4;
    this.ZF = paramZm6x;
  }
  
  public void ZI(Ztj1 paramZtj1, Zgna paramZgna, Zskh paramZskh, Zrbm paramZrbm, Zg09 paramZg09, Zkg9 paramZkg9, Supplier<Zbs1> paramSupplier, Zlli<Zt1x> paramZlli, Zl2h paramZl2h, Zlli<Zt10> paramZlli1, boolean paramBoolean) {
    Zriy zriy = (Zriy)paramZrbm;
    Zz9o zz9o = (Zz9o)paramZl2h;
    Ztos<Zt1o> ztos = zriy.ZO();
    new Zb62(this.ZB, paramZlli, ztos, this.ZN);
    Zbht zbht = ZT(zz9o.Zuq(), paramZg09, paramZkg9, ztos);
    this.ZU.ZG(new Zk51(this));
    Zb7l zb7l = Zl(paramZtj1.Zh(), this.ZI, this.ZO, this.ZY);
    Zgo4 zgo4 = new Zgo4(paramZtj1.Zh(), this.ZU);
    Zb7x zb7x = Zw(paramZskh, ((Zr5h)paramZgna).Zd5());
    zbht.ZH();
    zb7l.ZH();
    zgo4.ZH();
    zb7x.ZH();
    this.Zz.Zw(zbht);
    this.Zz.Zz(zb7l);
    this.Zz.Zt(zgo4);
    this.Zz.Zg(zb7x);
  }
  
  Zbht ZT(Zlba paramZlba, Zg09 paramZg09, Zkg9 paramZkg9, Zlli<Zt1o> paramZlli) {
    return new Zbht(this.ZA, paramZlba, this.Zi, this.ZD, this.ZP, paramZg09, paramZkg9, paramZlli, this.Zq.ZD(), this.Zg);
  }
  
  Zb7l Zl(int paramInt, Zzqg paramZzqg, Zg0s paramZg0s, Zs2g paramZs2g) {
    return new Zb7l(paramInt, this.Zq, this.Zg, this.Zy, this.Zi, this.ZD, paramZzqg, null, paramZg0s, paramZs2g, new Zgso(this.ZR, this.ZP, this.ZA, Zeew.EXTENDER, new Zsai(), this.ZF), this.ZP.ZH(), this.ZA);
  }
  
  Zb7x Zw(Zskh paramZskh, Zb4g paramZb4g) {
    Zey9 zey9 = new Zey9(this.ZR);
    Zegl zegl = new Zegl(this.Zq, this.ZA, this.Za, this.ZW, paramZskh, this.Zi, this.ZD, Zmjm.ZW, this.ZR, this.ZP, this.Zg, zey9, this.Zj, this.Zv, this.ZL, this.Zy, this.ZV, new Zs6i(this.ZF, Zlx8::lambda$buildLoggerTab$0), this.ZF);
    Zgzp zgzp = paramZb4g.Za1();
    Zg6e zg6e = new Zg6e(zgzp.Z_G());
    Zbpt zbpt = new Zbpt(this.Zg, this.ZR, paramZskh, this.Zb, zg6e);
    AtomicReference atomicReference = new AtomicReference();
    Objects.requireNonNull(atomicReference);
    Zryc zryc = new Zryc(zgzp, this.Za, new Ztz2(zgzp, atomicReference::get, this.Zv, this.ZR));
    Zsju zsju = new Zsju(zgzp, zg6e, zryc);
    zsju.ZGJ();
    Objects.requireNonNull(atomicReference);
    Zg9t zg9t = new Zg9t(zegl, paramZskh, zbpt, zsju, paramZb4g.ZaI(), this.Zn, atomicReference::set);
    return zg9t.ZL();
  }
  
  private static List lambda$buildLoggerTab$0(String paramString, List paramList) {
    return paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlx8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */