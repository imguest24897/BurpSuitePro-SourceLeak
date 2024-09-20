package burp;

class Zg1a implements Zg5o {
  final Zlg6 Zi;
  
  Zg1a(Zlg6 paramZlg6) {}
  
  public void Zs(Zr6q paramZr6q) {
    this.Zi.Zz = this.Zi.Zu.ZY(paramZr6q.ZT(), this.Zi.ZX);
  }
  
  public void ZS(Zr6h paramZr6h) {
    int[] arrayOfInt = Zbdf.ZM();
    if (paramZr6h.ZH()) {
      this.Zi.Zz = this.Zi.Zu.ZR(paramZr6h.ZT(), paramZr6h.ZK(), this.Zi.ZX);
      if (arrayOfInt != null) {
        Zl0o zl0o1 = new Zl0o(Zgsq.HTTP2);
        Zgyj.Zi(this.Zi.Zu.ZY(paramZr6h.ZT(), this.Zi.ZX), this.Zi.Zu).Zi(zl0o1);
        this.Zi.Zz = zl0o1.ZJ();
        return;
      } 
      return;
    } 
    Zl0o zl0o = new Zl0o(Zgsq.HTTP2);
    Zgyj.Zi(this.Zi.Zu.ZY(paramZr6h.ZT(), this.Zi.ZX), this.Zi.Zu).Zi(zl0o);
    this.Zi.Zz = zl0o.ZJ();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg1a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */