package burp;

public class Zxgf {
  private final Zgxf Zh;
  
  private final Zg_j ZU;
  
  public Zxgf(Zgxf paramZgxf, Zg_j paramZg_j) {
    this.Zh = paramZgxf;
    this.ZU = paramZg_j;
  }
  
  public boolean ZN(Ze3h paramZe3h) {
    int[] arrayOfInt = Zgxf.ZV();
    if (paramZe3h.ZF())
      return true; 
    if (((Zxya)paramZe3h.ZJ().Z_()).Zm() != null) {
      this.ZU.ZM(((Zxya)paramZe3h.ZJ().Z_()).Zm());
      if (arrayOfInt != null) {
        this.ZU.ZM(this.Zh.ZU(paramZe3h.ZJ()));
        return true;
      } 
      return true;
    } 
    this.ZU.ZM(this.Zh.ZU(paramZe3h.ZJ()));
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxgf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */