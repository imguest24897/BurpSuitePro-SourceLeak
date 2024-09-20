package burp;

public abstract class Zkro implements Zx8n {
  protected final Zz0n Zo;
  
  protected final Zt4u ZJ;
  
  protected final Zgbj ZI;
  
  protected final Zerg Zb;
  
  protected final Zkl6 ZO;
  
  protected final Zgzy Zu;
  
  protected final Ztwv Zl;
  
  protected final Zgb6 ZF;
  
  protected final Zxgc Zn;
  
  protected final Zskh ZW;
  
  protected final Zbnt ZQ;
  
  protected final Zr_4 Zz;
  
  protected final Zlcb Zw;
  
  protected final Zey9 Zf;
  
  protected final Zm6x Zq;
  
  protected boolean ZY;
  
  protected Zm0o[] Z_;
  
  protected Zztv ZV;
  
  private final Zeew Zt;
  
  private static int[] Zh;
  
  protected Zkro(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgbj paramZgbj, Zgb6 paramZgb6, Zxgc paramZxgc, Zskh paramZskh, Zgzy paramZgzy, Zkl6 paramZkl6, Zeew paramZeew, Ztwv paramZtwv, Zr_4 paramZr_4, Zlcb paramZlcb, Zm6x paramZm6x) {
    this.Zo = paramZz0n;
    this.ZJ = paramZt4u;
    this.Zb = paramZerg;
    this.ZI = paramZgbj;
    this.ZF = paramZgb6;
    this.Zn = paramZxgc;
    this.Zu = paramZgzy;
    this.ZO = paramZkl6;
    this.Zt = paramZeew;
    this.Zl = paramZtwv;
    this.Zz = paramZr_4;
    this.Zw = paramZlcb;
    this.Zq = paramZm6x;
    this.ZW = paramZskh.Zz().ZQ(paramZeew);
    this.ZQ = paramZkl6.ZB();
    this.Zf = paramZkl6.ZH();
  }
  
  public Zerg ZYa() {
    return this.Zb;
  }
  
  public Zeew ZYi() {
    return this.Zt;
  }
  
  public Zl04 ZYW() {
    return this.Zn.Zg(this);
  }
  
  public Zskh ZY4() {
    return this.ZW;
  }
  
  public Ztql ZYS() {
    return null;
  }
  
  public void ZYI() {}
  
  public Zm0o[] ZYu() {
    return this.Z_;
  }
  
  public Zztv ZYR() {
    return this.ZV;
  }
  
  public void ZFB(boolean paramBoolean) {
    this.ZY = paramBoolean;
  }
  
  public void ZYA() {}
  
  public void ZYT() {}
  
  public void ZD(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.Zn.Zd(this.Zt, paramInt, Zlkk.TAB_FLASH_COLOUR.ZS(), paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public void Zh(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    this.Zn.Zj(this.Zt, paramInt, Zlkk.TAB_FLASH_COLOUR.ZS(), paramBoolean1, paramBoolean2);
  }
  
  public Zgp1 ZYL() {
    return new Zljf(this.Zt.toolName);
  }
  
  public static void Zs(int[] paramArrayOfint) {
    Zh = paramArrayOfint;
  }
  
  public static int[] ZcN() {
    return Zh;
  }
  
  static {
    if (ZcN() == null)
      Zs(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkro.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */