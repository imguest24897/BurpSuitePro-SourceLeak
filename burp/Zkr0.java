package burp;

import java.awt.Color;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkr0 extends Zkro {
  private final Zlor Zk;
  
  private final Zr_4 Zy;
  
  private final Zlnu ZX;
  
  private final Ze8b Zi;
  
  private final Zr1m Zr;
  
  private final Zr34 ZK;
  
  private final Zkf3 ZP;
  
  private final Zskz Zx;
  
  private Zx6i ZT;
  
  private Zgd Zj;
  
  private Zgx0 ZD;
  
  private Zmrj ZU;
  
  private Zse Zd;
  
  private static String[] Zg;
  
  public Zkr0(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgbj paramZgbj, Zgb6 paramZgb6, Zxgc paramZxgc, Zskh paramZskh, Zgzy paramZgzy, Zlor paramZlor, Zkl6 paramZkl6, Ztwv paramZtwv, Zr_4 paramZr_4, Zlnu paramZlnu, Ze8b paramZe8b, Zgx0 paramZgx0, Zr1m paramZr1m, Zlcb paramZlcb, Zr34 paramZr34, Zkf3 paramZkf3, Zm6x paramZm6x) {
    super(paramZz0n, paramZt4u, paramZerg, paramZgbj, paramZgb6, paramZxgc, paramZskh, paramZgzy, paramZkl6, Zeew.TARGET, paramZtwv, paramZr_4, paramZlcb, paramZm6x);
    this.Zk = paramZlor;
    this.Zy = paramZr_4;
    this.ZX = paramZlnu;
    this.Zi = paramZe8b;
    this.ZD = paramZgx0;
    this.Zr = paramZr1m;
    this.ZK = paramZr34;
    this.ZP = paramZkf3;
    this.Zx = paramZt4u.ZN().Zvm();
  }
  
  public void ZYE() {}
  
  public Ztql ZYS() {
    return new Zb8w(this.ZX, this.ZQ, this.Zy, this::lambda$getInterToolInterface$0);
  }
  
  public void ZYq() {
    Zzwj zzwj = new Zzwj(this);
    this.Zj = new Zgd(this.ZX, this.Zx, zzwj);
    Zt3h zt3h = this.ZJ.ZN().ZvB().ZmZ();
    this.Zd = new Zse(zt3h);
    this.ZU = this.ZD.ZI(this.ZX, this.Zj, this.ZP, this.Zd, this.Zk, false, this.Zn, this.Zu, this.ZO);
    this.ZT = new Zx6i(this.Zo, this.ZJ, this, this.Zk, this.ZO, this.Zy, this.ZU, new Zbku(), this.Zd, this.Zi, this.Zr, this.ZK);
    zzwj.ZL(this.ZU);
    String[] arrayOfString = ZA();
    this.Z_ = this.ZT.Zc();
    if (!Zb12.ZG())
      (new Zg34(this.ZU, this.Zn, 0)).Zu(this.ZX.Zk()); 
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public void ZYO() {
    if (this.ZT == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    this.ZT.Zt2();
  }
  
  public void ZYA() {
    this.ZU.Zy();
    ZS();
  }
  
  public void Zm(int paramInt, Color paramColor, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.Zn.Zd(Zeew.TARGET, paramInt, paramColor, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public Zslu Zj() {
    return this.Zk;
  }
  
  public Zmrj ZM() {
    return this.ZU;
  }
  
  public void ZK(Zskz paramZskz, Ztg8 paramZtg8, Zlc8 paramZlc8, float paramFloat1, float paramFloat2) {
    this.ZX.Zi(paramZskz, paramZtg8, paramZlc8, paramFloat1, paramFloat2);
  }
  
  public void Zd(Zmf_ paramZmf_) {
    if (this.ZT == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    this.ZT.Zd(paramZmf_);
  }
  
  public void Zl(Zg4j paramZg4j) {
    this.ZT.Zl(paramZg4j);
  }
  
  private void ZS() {
    this.ZX.ZZ(new Zl9p(this));
  }
  
  private void lambda$getInterToolInterface$0() {
    ZD(-1, false, true, true);
  }
  
  public static void Zi(String[] paramArrayOfString) {
    Zg = paramArrayOfString;
  }
  
  public static String[] ZA() {
    return Zg;
  }
  
  static {
    if (ZA() != null)
      Zi(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkr0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */