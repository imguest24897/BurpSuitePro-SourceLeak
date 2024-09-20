package burp;

class Zuh extends Zuq implements Ztr3 {
  private final Zr_4 ZG;
  
  @Zzvo(64)
  private final Zz1i Zn;
  
  private final Zkcl ZB;
  
  @Zzvo(66)
  private Zb4g Zw;
  
  Zuh(Zr_4 paramZr_4, int paramInt, String paramString1, String paramString2, String paramString3, Zz1i paramZz1i, Zb4g paramZb4g, Zrpj paramZrpj, Zkcl paramZkcl, Zmet paramZmet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, Zl34 paramZl341, Zl34 paramZl342) {
    super(paramInt, paramString1, paramString2, paramString3, paramZrpj, paramZmet, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramZl341, paramZl342);
    this.ZG = paramZr_4;
    this.ZB = paramZkcl;
    this.Zn = paramZz1i;
    this.Zw = paramZb4g;
  }
  
  public Zkcl ZNs() {
    return this.ZB;
  }
  
  public Zz1i Zdm() {
    return this.Zn;
  }
  
  public Zb4g Zd5() {
    if (this.Zw == null) {
      this.Zw = Zbit.Zw(this.ZG, ZPo());
      Zrpc.ZF(this.Zw);
    } 
    return this.Zw;
  }
  
  public void ZHG() {}
  
  @Zzvo(65)
  private int Zuy() {
    return this.ZB.ZU();
  }
  
  protected boolean ZP(Zm31 paramZm31, Zs7v paramZs7v) {
    return Zlua.Zd(paramZm31, paramZs7v, Zkpm.ZB, 1824540420);
  }
  
  public Zeu4<? extends Zgna> ZF() {
    return (Zeu4)Ztr3.ZP;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zuh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */