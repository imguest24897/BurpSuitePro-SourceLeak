package burp;

class Zem1 implements Zg5o {
  Zefx Zj;
  
  final Zml7 Zr;
  
  private Zem1(Zml7 paramZml7) {}
  
  public void Zs(Zr6q paramZr6q) {
    if (this.Zr.ZL.getRequest() != null)
      this.Zj = this.Zr.ZC.ZY(paramZr6q.ZT(), this.Zr.ZL.getRequest().toByteArray().getBytes()); 
  }
  
  public void ZS(Zr6h paramZr6h) {
    if (this.Zr.ZL.getRequest() != null) {
      this.Zj = this.Zr.ZC.ZY(paramZr6h.ZT(), this.Zr.ZL.getRequest().toByteArray().getBytes());
      Zl0o zl0o = new Zl0o(Zgsq.HTTP2);
      Zgyj.Zi(this.Zj, this.Zr.ZC).Zi(zl0o);
      this.Zj = zl0o.ZJ();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zem1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */