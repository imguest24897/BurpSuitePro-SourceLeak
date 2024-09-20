package burp;

import java.math.BigInteger;

public class Zmkd implements Zmgf {
  private final Zxpd Zg;
  
  public Zmkd(Zxpd paramZxpd) {
    this.Zg = paramZxpd;
  }
  
  public boolean Ze(Zkr1<Zmv4> paramZkr1, int paramInt, Zrn9 paramZrn9) {
    Zb3t zb3t = paramZrn9.Zp().get(paramInt - 1);
    Zgbi zgbi1 = paramZrn9.Zx().get(zb3t);
    this.Zg.ZZ();
    Zkal zkal = paramZrn9.Zz();
    Zgbi zgbi2 = Za(zgbi1, zkal);
    Zbqc[] arrayOfZbqc = Zedi.ZV();
    if (zgbi2 == null)
      return false; 
    Zgbi zgbi3 = Za(zgbi2, zkal);
    if (zgbi3 == null || !ZB(zgbi2, zgbi3) || !Zr(zgbi1))
      return false; 
    if (Zbqc.Zwu() == null)
      Zedi.ZO(new Zbqc[5]); 
    return ZO(zgbi1, zgbi3);
  }
  
  private Zgbi Za(Zgbi paramZgbi, Zkal paramZkal) {
    Zgbi zgbi = null;
    for (byte b = 0; b < paramZkal.Zq().size() - 1; b++) {
      Zgbi zgbi1 = paramZkal.Zq().get(b);
      if (zgbi1 == paramZgbi) {
        zgbi = paramZkal.Zq().get(b + 1);
        break;
      } 
    } 
    return zgbi;
  }
  
  private boolean ZB(Zgbi paramZgbi1, Zgbi paramZgbi2) {
    return (Zl19.ZR(paramZgbi1.ZX()) && Zl19.Zc(paramZgbi2.ZX()));
  }
  
  private boolean Zr(Zgbi paramZgbi) {
    return (Zl19.ZR(paramZgbi.Zm()) && Zl19.Zf(((Zgc0)paramZgbi.Zm()).ZI()));
  }
  
  private boolean ZO(Zgbi paramZgbi1, Zgbi paramZgbi2) {
    Zgcw zgcw1 = (Zgcw)paramZgbi2.ZX();
    Zgcn zgcn = (Zgcn)((Zgc0)paramZgbi1.Zm()).ZI();
    Zgcw zgcw2 = Zx(zgcn);
    if (zgcw2 != null) {
      Zb3t zb3t1 = Zo(zgcw2);
      Zb3t zb3t2 = Zo(zgcw1);
      if (Zl19.ZC(zb3t1) && Zl19.ZC(zb3t2)) {
        Object object1 = (((Zgcc)zb3t1).ZK()).Zr;
        Object object2 = (((Zgcc)zb3t2).ZK()).Zr;
        if (object1 instanceof BigInteger && object2 instanceof BigInteger)
          return (((BigInteger)object1).intValue() != ((BigInteger)object2).intValue()); 
      } 
    } 
    return false;
  }
  
  private Zgcw Zx(Zgcn paramZgcn) {
    Zb3t zb3t = paramZgcn.ZU().ZC().get(0);
    return Zl19.Zc(zb3t) ? (Zgcw)zb3t : null;
  }
  
  private Zb3t Zo(Zgcw paramZgcw) {
    return ((Zb3t)paramZgcw.ZC().get(2)).ZC().get(0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmkd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */