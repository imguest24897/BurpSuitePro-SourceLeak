package burp;

public class Zkkg implements Zm3g {
  private final Zrmh ZR;
  
  private final Zlzm Zp;
  
  private final Zlxo Z_;
  
  private final Zrl9 ZQ;
  
  private final Zmu3 Zd;
  
  private final Zrfu Zj;
  
  private static String[] ZV;
  
  public static Zkkg Zv(Zl7h paramZl7h) {
    return new Zkkg(paramZl7h.ZV6(), paramZl7h.ZVW(), paramZl7h.ZVF(), paramZl7h.ZV2(), paramZl7h.ZVh(), paramZl7h.ZVZ());
  }
  
  public static Zkkg Z_(Zr_4 paramZr_4) {
    Zrmh zrmh = paramZr_4.<Zrmh>ZH(new Zli6());
    Zlzm zlzm = paramZr_4.<Zlzm>ZH(new Zt9v());
    String[] arrayOfString = Ze();
    Zlxo zlxo = paramZr_4.<Zlxo>ZH(new Zgyf());
    Zrl9 zrl9 = paramZr_4.<Zrl9>ZH(new Ztu4());
    Zmu3 zmu3 = paramZr_4.<Zmu3>ZH(new Zbux());
    Zrfu zrfu = paramZr_4.<Zrfu>ZH(new Zmd1());
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zkkg(zrmh, zlzm, zlxo, zrl9, zmu3, zrfu);
  }
  
  public Zkkg(Zrmh paramZrmh, Zlzm paramZlzm, Zlxo paramZlxo, Zrl9 paramZrl9, Zmu3 paramZmu3, Zrfu paramZrfu) {
    this.ZR = paramZrmh;
    this.Zp = paramZlzm;
    this.Z_ = paramZlxo;
    this.ZQ = paramZrl9;
    this.Zd = paramZmu3;
    this.Zj = paramZrfu;
  }
  
  public Zrmh ZM() {
    return this.ZR;
  }
  
  public Zlzm ZD() {
    return this.Zp;
  }
  
  public Zlxo Zp() {
    return this.Z_;
  }
  
  public Zrl9 ZP() {
    return this.ZQ;
  }
  
  public Zmu3 Zq() {
    return this.Zd;
  }
  
  public Zrfu Zb() {
    return this.Zj;
  }
  
  public void Zd(Zmf_ paramZmf_) {
    this.ZR.Zd(paramZmf_);
    this.Zp.Zd(paramZmf_);
    this.Z_.Zd(paramZmf_);
    this.ZQ.Zd(paramZmf_);
    this.Zd.Zd(paramZmf_);
    this.Zj.Zd(paramZmf_);
  }
  
  public void Zl(Zg4j paramZg4j) {
    this.ZR.Zl(paramZg4j);
    this.Zp.Zl(paramZg4j);
    this.Z_.Zl(paramZg4j);
    String[] arrayOfString = Ze();
    this.ZQ.Zl(paramZg4j);
    this.Zd.Zl(paramZg4j);
    this.Zj.Zl(paramZg4j);
    if (Zbqc.Zwu() == null)
      ZX(new String[3]); 
  }
  
  public static void ZX(String[] paramArrayOfString) {
    ZV = paramArrayOfString;
  }
  
  public static String[] Ze() {
    return ZV;
  }
  
  static {
    if (Ze() != null)
      ZX(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkkg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */