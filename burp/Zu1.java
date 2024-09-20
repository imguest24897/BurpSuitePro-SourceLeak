package burp;

class Zu1 extends Zu3 implements Zbob {
  private final Zr_4 ZK;
  
  @Zzvo(16)
  private final Zz1i ZB;
  
  @Zzvo(17)
  private Zb4g ZV;
  
  Zu1(Zr_4 paramZr_4, int paramInt, String paramString1, String paramString2, String paramString3, Zz1i paramZz1i, Zb4g paramZb4g, Zl5o paramZl5o) {
    super(paramInt, paramString1, paramString2, paramString3, paramZl5o);
    this.ZK = paramZr_4;
    this.ZB = paramZz1i;
    this.ZV = paramZb4g;
  }
  
  public Zkcl ZNs() {
    return Zkcl.API_AUDIT;
  }
  
  public Zz1i Zdm() {
    return this.ZB;
  }
  
  public Zb4g Zd5() {
    if (this.ZV == null) {
      this.ZV = Zbit.Zw(this.ZK, ZPo());
      Zrpc.ZF(this.ZV);
    } 
    return this.ZV;
  }
  
  public void ZV(Zx6t paramZx6t, Zrbm paramZrbm) {
    Zkr5.ZY(paramZx6t, this.ZB, (Zriy)paramZrbm);
  }
  
  public void ZHG() {}
  
  protected boolean ZP(Zm31 paramZm31, Zs7v paramZs7v) {
    return Zlua.Zd(paramZm31, paramZs7v, Zkp2.Zu, 871779051);
  }
  
  public Zeu4<? extends Zgna> ZF() {
    return (Zeu4)Zbob.Zv;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zu1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */