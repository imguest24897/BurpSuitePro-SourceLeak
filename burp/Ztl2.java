package burp;

public class Ztl2 extends Ztlu {
  private final Ztai ZJ;
  
  private final boolean Zc;
  
  private static int[] Zs;
  
  public Ztl2(Zey3 paramZey3, Ztdc paramZtdc, Ztai paramZtai, Zeye paramZeye, boolean paramBoolean) {
    super(paramZey3, paramZtdc, paramZeye);
    this.ZJ = paramZtai;
    this.Zc = paramBoolean;
  }
  
  public void ZG() {
    if (this.ZK.Zx == Zs31.Zl || this.ZK.Zx == Zs31.Zn)
      return; 
    if (this.ZJ.ZN(new Zvs[] { Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ARBITRARY_ORIGIN, Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_UNTRUSTED_ORIGIN_TRUSTED }))
      (new Ztlh(this.ZX, this.ZP, this.ZK)).ZG(); 
    if (this.ZJ.ZN(new Zvs[] { Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ARBITRARY_ORIGIN, Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ALL_SUBDOMAINS_TRUSTED }))
      (new Ztl7(this.ZX, this.ZP, this.ZK, this.ZJ)).ZG(); 
    if (!this.ZP.Zy() && !this.ZK.Zx.Zl() && this.Zc && this.ZJ.Zr(Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_UNTRUSTED_ORIGIN_TRUSTED))
      this.ZX.Zb(this.ZK.Zx.ZO()); 
  }
  
  public static void ZO(int[] paramArrayOfint) {
    Zs = paramArrayOfint;
  }
  
  public static int[] Zn() {
    return Zs;
  }
  
  static {
    if (Zn() == null)
      ZO(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztl2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */