package burp;

public class Zllt extends Zllr {
  public final Zxrs ZX;
  
  public final Zlk4 Zf;
  
  public Zllt(Zzu2 paramZzu2, String paramString, Zxrs paramZxrs, Zxsx paramZxsx, Zlk4 paramZlk4) {
    this(Ze46.ZT(paramZzu2), paramString, paramZxrs, paramZxsx, paramZlk4);
  }
  
  public Zllt(Ze46 paramZe46, String paramString, Zxrs paramZxrs, Zxsx paramZxsx, Zlk4 paramZlk4) {
    super(paramZe46, paramString, paramZxsx);
    this.ZX = paramZxrs;
    this.Zf = paramZlk4;
  }
  
  public byte ZK() {
    return (this.ZX == Zxrs.UNQUOTED) ? 0 : 1;
  }
  
  public boolean ZT(Zxs7 paramZxs7) {
    return (!paramZxs7.Zg() || this.ZX == Zxrs.UNQUOTED);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zllt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */