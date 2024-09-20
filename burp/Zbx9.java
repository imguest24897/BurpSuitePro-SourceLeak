package burp;

public class Zbx9 implements Ze4m {
  private final Zl11 ZH;
  
  private final Zts5 Zd;
  
  private final Zskh ZV;
  
  Zbx9(Zl11 paramZl11, Zskh paramZskh, Zgb6 paramZgb6) {
    this.ZH = paramZl11;
    this.Zd = Zs38.ZG(paramZgb6).Zy();
    this.ZV = paramZskh;
  }
  
  public Zg3d ZV(Zefx paramZefx) {
    return ZF(paramZefx, Zbx9::lambda$issueRequest$0);
  }
  
  public Zg3d ZF(Zefx paramZefx, Zmdh paramZmdh) {
    return this.ZH.ZE(paramZefx, this.Zd, Zxfj.ZI, new Zlbx(this.ZV, paramZmdh)).ZG();
  }
  
  public Zg3d ZD(Zefx paramZefx, Zmdh paramZmdh) {
    return ZF(paramZefx, paramZmdh);
  }
  
  private static void lambda$issueRequest$0() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbx9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */