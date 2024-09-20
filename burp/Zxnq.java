package burp;

class Zxnq implements Zg5o {
  private final int Zb;
  
  private final Zlhj Ze;
  
  private final Zey9 ZU;
  
  Ze1w ZV;
  
  private Zxnq(int paramInt, Zlhj paramZlhj, Zey9 paramZey9) {
    this.Zb = paramInt;
    this.Ze = paramZlhj;
    this.ZU = paramZey9;
  }
  
  public void Zs(Zr6q paramZr6q) {
    this.ZV = new Ze1w(this.Zb, paramZr6q, this.Ze, false, this.ZU);
  }
  
  public void ZS(Zr6h paramZr6h) {
    this.ZV = paramZr6h.ZH() ? new Ze1n(this.Zb, paramZr6h, this.Ze, this.ZU) : new Ze1w(this.Zb, paramZr6h, this.Ze, true, this.ZU);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxnq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */