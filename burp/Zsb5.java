package burp;

class Zsb5 {
  static Zmgv Zj(Zmgv paramZmgv, Zsmh paramZsmh, Zgu3 paramZgu3, Zgsq paramZgsq) {
    return (paramZsmh == null) ? paramZmgv : ((paramZgu3 == Zgu3.HTTP_REQUEST) ? ZX(paramZmgv, paramZsmh, paramZgsq) : ((paramZgu3 == Zgu3.HTTP_RESPONSE) ? ZK(paramZmgv, paramZsmh) : paramZmgv));
  }
  
  private static Zmgv ZX(Zmgv paramZmgv, Zsmh paramZsmh, Zgsq paramZgsq) {
    Zgjd zgjd = new Zgjd(paramZgsq);
    paramZsmh.Zh(zgjd);
    Zbr zbr = zgjd.Zw();
    return (zbr == null) ? paramZmgv : new Zst0(paramZmgv, zbr);
  }
  
  private static Zmgv ZK(Zmgv paramZmgv, Zsmh paramZsmh) {
    Zrp8 zrp8 = new Zrp8();
    paramZsmh.Zh(zrp8);
    Zyf zyf = Zyf.Zy(zrp8.Zb());
    return new Zst4(paramZmgv, zyf);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsb5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */