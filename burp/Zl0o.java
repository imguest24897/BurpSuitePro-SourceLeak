package burp;

public class Zl0o implements Zg5o {
  private final Zgsq Zf;
  
  private Zefx ZJ;
  
  public Zl0o(Zgsq paramZgsq) {
    this.Zf = paramZgsq;
  }
  
  public Zefx ZJ() {
    return this.ZJ;
  }
  
  public void Zs(Zr6q paramZr6q) {
    this.ZJ = (this.Zf == Zgsq.HTTP2) ? paramZr6q.Zo() : paramZr6q;
  }
  
  public void ZS(Zr6h paramZr6h) {
    String[] arrayOfString = Zxff.ZA();
    if (this.Zf == Zgsq.HTTP1) {
      this.ZJ = paramZr6h.Zp();
      if (arrayOfString != null) {
        this.ZJ = paramZr6h;
        return;
      } 
      return;
    } 
    this.ZJ = paramZr6h;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl0o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */