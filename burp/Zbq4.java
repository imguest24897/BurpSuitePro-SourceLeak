package burp;

import net.portswigger.Zl0;

public class Zbq4 implements Zkvu {
  private final Zxaw Zp;
  
  private final Zr_4 Zy;
  
  private final Zt4u ZV;
  
  private final Zb0h Zv;
  
  private final Zl0 ZJ;
  
  private final Runnable Zw;
  
  private final Zeg4 Zu;
  
  private final boolean ZB;
  
  private static int[] ZQ;
  
  public Zbq4(Zxaw paramZxaw, Zr_4 paramZr_4, Zt4u paramZt4u, Zb0h paramZb0h, Zl0 paramZl0, Runnable paramRunnable, Zeg4 paramZeg4, boolean paramBoolean) {
    this.Zp = paramZxaw;
    this.Zy = paramZr_4;
    this.ZV = paramZt4u;
    this.Zv = paramZb0h;
    this.ZJ = paramZl0;
    this.Zw = paramRunnable;
    this.Zu = paramZeg4;
    int[] arrayOfInt = ZU();
    this.ZB = paramBoolean;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Zx_2 ZV(Zrnm paramZrnm) {
    return new Zbmg(paramZrnm);
  }
  
  public Zesr Zn() {
    return new Zbmy(this.Zp, this.Zy);
  }
  
  public Zedf ZB() {
    return new Zbb8(this.ZV, this.Zp, this.Zy, this.ZJ, this.Zv);
  }
  
  public Zmvs ZT() {
    return new Zbbx(this.Zp);
  }
  
  public Zr6x Zv() {
    return new Zbb4(this.Zp);
  }
  
  public Ztec Zx() {
    return new Zbb3(this.Zp, this.Zw);
  }
  
  public Zs3_ ZN() {
    return new Zbbi(this.Zu, this.ZB);
  }
  
  public Zrk3 Zb() {
    return new Zbbl(this.Zp, this.Zy);
  }
  
  public Zghj Zl() {
    return new Zbbw(this.Zy);
  }
  
  public Ztow Zp() {
    return new Zbbn(this.Zy);
  }
  
  public static void ZE(int[] paramArrayOfint) {
    ZQ = paramArrayOfint;
  }
  
  public static int[] ZU() {
    return ZQ;
  }
  
  static {
    if (ZU() == null)
      ZE(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbq4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */