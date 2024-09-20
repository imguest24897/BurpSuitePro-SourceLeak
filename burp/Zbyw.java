package burp;

import java.awt.GridBagLayout;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import javax.swing.ButtonGroup;

public class Zbyw extends Zbqc implements Zmov, Zgdq {
  private final Zby1 Zr;
  
  private final Zmp0[] ZN;
  
  private final Zby3 Zj;
  
  private final Zbmk ZO;
  
  private final Zx09 ZW;
  
  private final Supplier<byte[]> ZU;
  
  private final int Zg;
  
  private Zmp0 Zh;
  
  private Zzvm ZJ;
  
  private Zm41 Zt;
  
  protected int ZC;
  
  protected boolean ZR;
  
  private ButtonGroup Zf;
  
  private static int ZQ;
  
  public Zbyw(Zbmk paramZbmk, Zkr6 paramZkr6, Zz0n paramZz0n, Zt4u paramZt4u, boolean paramBoolean, Zr_4 paramZr_4, Zx09 paramZx09, Supplier<byte[]> paramSupplier, int paramInt, Zxaw paramZxaw) {
    this.ZO = paramZbmk;
    this.ZW = paramZx09;
    int i = Zx();
    this.ZU = paramSupplier;
    this.Zg = paramInt;
    ZS();
    this.Zt = paramZx09.Zm();
    this.Zr = new Zby1(this.Zt, new Zz79(paramZkr6), paramZr_4, paramZxaw);
    this.Zj = new Zby3(this.Zt);
    paramZbmk.ZO(this.Zr, this.Zj);
    List<Zzvm> list = Zzvm.Zy();
    this.ZN = new Zmp0[list.size()];
    byte b = 0;
    while (b < list.size()) {
      this.ZN[b] = Zbb7.ZR(list.get(b), this, paramBoolean, paramZz0n, paramZt4u, paramZkr6.ZYa(), paramZr_4);
      paramZbmk.ZL(this.ZN[b]);
      b++;
      if (i != 0)
        break; 
    } 
  }
  
  void ZU(Zzvm paramZzvm) {
    this.ZJ = paramZzvm;
    this.Zh = this.ZN[paramZzvm.id];
    this.Zh.ZB(this.ZU, this.Zg);
    this.ZO.Zz(this.Zh.Zz(), this.Zr, this.Zj);
  }
  
  public Zm41 ZP() {
    return this.Zt;
  }
  
  public Ze9k Zj() {
    return (this.Zh == null) ? null : this.Zh.ZP();
  }
  
  public void ZE(Zmjc paramZmjc, int paramInt) {
    this.Zh.Zd(paramZmjc, paramInt);
  }
  
  public void ZA(Ze9k paramZe9k, Zsh8 paramZsh8, int paramInt) {
    this.ZJ = paramZe9k.Zyi();
    this.Zh = this.ZN[this.ZJ.id];
    this.Zh.ZE(paramZe9k, paramZsh8, paramInt);
    this.Zt = paramZe9k.Zyn();
    this.Zr.Za(this.ZW.ZW(this.Zt));
    this.Zj.ZE(this.Zt);
    Arrays.<Zmp0>stream(this.ZN).forEach(this::lambda$setPayloadSource$0);
  }
  
  public void Z_(int paramInt, boolean paramBoolean) {
    this.ZC = paramInt;
    this.ZR = paramBoolean;
    this.ZO.ZO(paramInt, paramBoolean);
  }
  
  public Zbws ZR() {
    return this.ZO.ZX();
  }
  
  private void ZS() {
    this.Zf = new ButtonGroup();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
  }
  
  public void ZP(Zb_j paramZb_j) {
    this.Zr.ZP(paramZb_j);
    this.Zj.ZP(paramZb_j);
  }
  
  public void Zs(Zb_j paramZb_j) {
    this.Zr.Zs(paramZb_j);
    this.Zj.Zs(paramZb_j);
  }
  
  public void ZNH() {
    this.Zr.ZNH();
    this.Zj.ZNH();
  }
  
  private void lambda$setPayloadSource$0(Zmp0 paramZmp0) {
    paramZmp0.ZP().Zh(this.Zt.ZM());
  }
  
  public static void ZN(int paramInt) {
    ZQ = paramInt;
  }
  
  public static int Zp() {
    return ZQ;
  }
  
  public static int Zx() {
    int i = Zp();
    return (i == 0) ? 94 : 0;
  }
  
  static {
    if (Zp() == 0)
      ZN(79); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbyw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */