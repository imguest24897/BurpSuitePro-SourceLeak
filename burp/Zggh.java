package burp;

class Zggh implements Zk5d {
  private final int ZF;
  
  private final byte Zt;
  
  private final int Zi;
  
  private final Zmsx Zj;
  
  private Zl6l ZY;
  
  private Zl6l Zu;
  
  final Zz6s Zr;
  
  Zggh(Zz6s paramZz6s, int paramInt1, int paramInt2, byte paramByte, Zmsx paramZmsx) {
    this.Zj = paramZmsx;
    this.ZF = paramInt1;
    this.Zi = paramInt2;
    this.Zt = paramByte;
  }
  
  public Zstu Zi() {
    if (this.ZY == null) {
      this.ZY = this.Zr.ZS(this.Zj.ZO(), this.ZF, this.Zt, this.Zi);
      return this.ZY.Zm.ZM().Zl();
    } 
    return Zr(this.Zj.ZO());
  }
  
  public Zstu ZQ() {
    if (this.Zu == null) {
      this.Zu = this.Zr.ZS(this.Zj.ZS(), this.ZF, this.Zt, 1);
      return this.Zu.Zm.ZM().Zl();
    } 
    return Zr(this.Zj.ZS());
  }
  
  private Zstu Zr(String paramString) {
    return (this.Zr.ZS(paramString, this.ZF, this.Zt, 1)).Zm.ZM().Zl();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zggh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */