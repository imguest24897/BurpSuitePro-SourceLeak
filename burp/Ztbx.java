package burp;

public class Ztbx {
  public final Ze3n ZW;
  
  public final Ze3n ZX;
  
  public final Zxs7 Zz;
  
  public final Zsjk Zn;
  
  public final Zefx Zf;
  
  public final Zb6q ZP;
  
  public final Zs68 Zt;
  
  public final Zxs7 Zl;
  
  private final Zku6 Za;
  
  private static boolean Zw;
  
  public Ztbx(Zxs7 paramZxs71, Zsjk paramZsjk, Zefx paramZefx, Ze3n paramZe3n1, Ze3n paramZe3n2, Zb6q paramZb6q, Zs68 paramZs68, Zku6 paramZku6, Zxs7 paramZxs72) {
    this.Zz = paramZxs71;
    this.Zn = paramZsjk;
    this.Zf = paramZefx;
    this.ZW = paramZe3n1;
    this.ZX = paramZe3n2;
    this.ZP = paramZb6q;
    this.Zt = paramZs68;
    this.Za = paramZku6;
    this.Zl = paramZxs72;
  }
  
  public Zku6 ZL() {
    return this.Za;
  }
  
  public static Ztbx ZF(Zbnt paramZbnt, Ze3n paramZe3n1, Ze3n paramZe3n2, Zku6 paramZku6, Zsjk paramZsjk, Zefx paramZefx, Zxs7 paramZxs71, Zxs7 paramZxs72) {
    Zb6q zb6q = paramZku6.ZI((byte)2);
    Zs68 zs68 = Zbwc.Zt(paramZefx.ZF(), zb6q.Za(), Zt0k.HTML_ANALYSIS, paramZbnt);
    return new Ztbx(paramZxs72, paramZsjk, paramZefx, paramZe3n1, paramZe3n2, zb6q, zs68, paramZku6, paramZxs71);
  }
  
  public static Ztbx ZL(Zbnt paramZbnt, Ze3n paramZe3n, Zku6 paramZku6, Zsjk paramZsjk, Zxs7 paramZxs71, Zxs7 paramZxs72) {
    Zefx zefx = paramZku6.ZV().Zd().ZL();
    Zb6q zb6q = paramZku6.ZI((byte)2);
    boolean bool = ZV();
    Zs68 zs68 = Zbwc.Zt(zefx.ZF(), zb6q.Za(), Zt0k.HTML_ANALYSIS, paramZbnt);
    if (Zbqc.Zwu() == null)
      ZU(!bool); 
    return new Ztbx(paramZxs72, paramZsjk, zefx, paramZe3n, paramZe3n, zb6q, zs68, paramZku6, paramZxs71);
  }
  
  public static void ZU(boolean paramBoolean) {
    Zw = paramBoolean;
  }
  
  public static boolean ZV() {
    return Zw;
  }
  
  public static boolean ZA() {
    boolean bool = ZV();
    return !bool;
  }
  
  static {
    if (ZA())
      ZU(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztbx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */