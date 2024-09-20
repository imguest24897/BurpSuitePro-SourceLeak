package burp;

public class Zkfv {
  private final Zx4c ZM;
  
  private final Zekl Z_;
  
  private final Zzw0 Zk;
  
  public Zkfv(Zx4c paramZx4c, Zekl paramZekl, Zzw0 paramZzw0) {
    this.ZM = paramZx4c;
    this.Z_ = paramZekl;
    this.Zk = paramZzw0;
  }
  
  public Zrfm Zc(Zmzk paramZmzk, Zz1p paramZz1p, Zgsq paramZgsq) {
    boolean bool = Zs7j.Zc(paramZz1p);
    Ze45 ze45 = bool ? Ze45.SUPPRESS_HTTP2 : paramZgsq.ZT(true, false);
    boolean bool1 = (ze45 != Ze45.ONLY_HTTP2 && !bool && (this.Z_.ZlC() || this.ZM.Zcq())) ? true : false;
    Zrj8 zrj8 = bool1 ? this.Zk.ZQ(paramZmzk) : Zrj8.ZV;
    return new Zrfm(ze45, this.Z_.ZlR(), bool1, zrj8);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkfv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */