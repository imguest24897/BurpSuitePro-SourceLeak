package burp;

public class Ztxf {
  private final Zgxf ZT;
  
  private final Zbui Zn;
  
  public Ztxf(Zgxf paramZgxf, Zbui paramZbui) {
    this.ZT = paramZgxf;
    this.Zn = paramZbui;
  }
  
  public boolean ZU(Ze3h paramZe3h) {
    int[] arrayOfInt = Zgxf.ZV();
    if (paramZe3h.ZF())
      return true; 
    Zxya zxya = (Zxya)paramZe3h.ZJ().Z_();
    if (zxya.Zm() != null) {
      this.Zn.ZP(zxya.Zq().Zdz(), this.ZT.ZU(paramZe3h.ZJ()), zxya.Zm());
      if (arrayOfInt != null) {
        this.Zn.ZU(zxya.Zq().Zdz(), this.ZT.ZU(paramZe3h.ZJ()));
        return true;
      } 
      return true;
    } 
    this.Zn.ZU(zxya.Zq().Zdz(), this.ZT.ZU(paramZe3h.ZJ()));
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */