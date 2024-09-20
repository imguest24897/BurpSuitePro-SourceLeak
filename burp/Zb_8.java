package burp;

import java.awt.Window;

public class Zb_8 {
  private final Zs4c ZC;
  
  private final Zbqp ZH;
  
  private final Zr49 Zo;
  
  private final Zxts ZB;
  
  private final Zezx ZJ;
  
  private final Zt8u ZL;
  
  private final Zbnt Zx;
  
  private final Zr_4 ZU;
  
  private final Zvo_ Zh;
  
  private final Zm9o ZF;
  
  private static Zbqc[] ZP;
  
  public Zb_8(Zs4c paramZs4c, Zbqp paramZbqp, Zr49 paramZr49, Zxts paramZxts, Zezx paramZezx, Zt8u paramZt8u, Zbnt paramZbnt, Zr_4 paramZr_4, Zvo_ paramZvo_, Zm9o paramZm9o) {
    this.ZC = paramZs4c;
    this.ZH = paramZbqp;
    this.Zo = paramZr49;
    this.ZB = paramZxts;
    this.ZJ = paramZezx;
    this.ZL = paramZt8u;
    this.Zx = paramZbnt;
    this.ZU = paramZr_4;
    Zbqc[] arrayOfZbqc = Zj();
    this.Zh = paramZvo_;
    this.ZF = paramZm9o;
    if (Zbqc.Zwu() == null)
      ZJ(new Zbqc[4]); 
  }
  
  public void ZA(Window paramWindow, Zmln paramZmln, Zrub paramZrub, Zkjl paramZkjl, boolean paramBoolean) {
    new Zlsv(paramWindow, paramZmln, this.ZC, paramZkjl, paramZrub, this.ZH, this.Zo, this.ZB, this.ZJ, this.ZL, this.Zx, this.ZU, this.Zh, this.ZF, paramBoolean);
  }
  
  public void ZV(Window paramWindow, Zkbn paramZkbn, Zrub paramZrub, boolean paramBoolean) {
    Zljn.Zf(paramWindow, this.ZC, paramZkbn, paramZrub, this.ZH, this.Zo, this.ZB, this.ZJ, this.ZL, this.Zx, this.ZU, this.Zh, this.ZF, paramBoolean);
  }
  
  public void ZU(Window paramWindow, Zkbn paramZkbn, Zrub paramZrub, boolean paramBoolean1, boolean paramBoolean2) {
    Zljn.Zd(paramWindow, this.ZC, paramZkbn, paramZrub, this.ZH, this.Zo, this.ZB, this.ZJ, this.ZL, this.Zx, this.ZU, this.Zh, this.ZF, paramBoolean1, paramBoolean2);
  }
  
  public static void ZJ(Zbqc[] paramArrayOfZbqc) {
    ZP = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zj() {
    return ZP;
  }
  
  static {
    if (Zj() == null)
      ZJ(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb_8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */