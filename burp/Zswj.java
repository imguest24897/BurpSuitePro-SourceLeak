package burp;

public class Zswj {
  private final Zrj ZV;
  
  private final Zbfl Zs;
  
  private final Zk9e ZM;
  
  private final Zmc9 Zf;
  
  private final Zk9e Zp;
  
  private static String Zw;
  
  Zswj(Zrj paramZrj, Zbfl paramZbfl, Zk9e paramZk9e1, Zmc9 paramZmc9, Zk9e paramZk9e2) {
    this.ZV = paramZrj;
    this.Zs = paramZbfl;
    this.ZM = paramZk9e1;
    this.Zf = paramZmc9;
    this.Zp = paramZk9e2;
  }
  
  public Zlku ZH(Zmgr paramZmgr, Zrhj paramZrhj, Zlsy paramZlsy) {
    return new Zlku(paramZmgr, this.ZV, paramZlsy, ZJ(this.ZM, paramZrhj));
  }
  
  public Zlku Zh(Zmgr paramZmgr, Zrhj paramZrhj, Zlsy paramZlsy) {
    return new Zlku(paramZmgr, this.ZV, paramZlsy, ZJ(this.Zf, paramZrhj));
  }
  
  public Zk9r Zz(Zz09 paramZz09, Zrhj paramZrhj, Zlsy paramZlsy) {
    return new Zk9r(paramZz09, this.ZV, paramZlsy, this.Zs, ZJ(this.Zp, paramZrhj));
  }
  
  public void ZV() {
    this.Zs.ZR();
  }
  
  private static Zk9e ZJ(Zk9e paramZk9e, Zrhj paramZrhj) {
    return new Zemw(paramZk9e, paramZrhj);
  }
  
  public static void ZM(String paramString) {
    Zw = paramString;
  }
  
  public static String ZD() {
    return Zw;
  }
  
  static {
    if (ZD() != null)
      ZM("e5Mdfb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zswj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */