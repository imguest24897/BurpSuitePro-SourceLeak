package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zt37 implements Zle3, Zge7 {
  private final Zmjk ZH;
  
  private final Zrri Zr;
  
  private final Zl2p Zm;
  
  private final Supplier<Boolean> Zn;
  
  private final Zbqc Zj;
  
  private boolean Zk = true;
  
  private static final String a;
  
  Zt37(Zo4 paramZo4, Zrri paramZrri, Zl2p paramZl2p, Supplier<Boolean> paramSupplier) {
    this.ZH = paramZo4.Z_();
    this.Zr = paramZrri;
    this.Zm = paramZl2p;
    this.Zn = paramSupplier;
    this.Zj = new Zbqc(new BorderLayout());
    paramZl2p.Zc(paramZo4);
    this.Zj.setName(paramZrri.componentName);
    this.Zj.add(paramZl2p.ZB(), a);
  }
  
  public Zmjk ZK() {
    return this.ZH;
  }
  
  public void ZU(Zliz paramZliz) {
    Zd(paramZliz.Zx(this.ZH));
  }
  
  private void Zd(Zo4 paramZo4) {
    this.Zk = paramZo4.ZO();
    this.Zm.Zc(paramZo4);
  }
  
  public Zkcm Zx(boolean paramBoolean) {
    return Zkcm.ZO(this.Zr);
  }
  
  public Component ZZ() {
    return this.Zj;
  }
  
  public void Zl() {
    if (((Boolean)this.Zn.get()).booleanValue())
      this.Zm.ZN(); 
  }
  
  public Zrri Zp() {
    return this.ZH.messageEditorViewType;
  }
  
  public boolean ZT(Zsmh paramZsmh, Zgu3 paramZgu3, Zs68 paramZs68, boolean paramBoolean) {
    return (paramZgu3 == Zgu3.HTTP_REQUEST) ? ((this.ZH.requestWidget && Zv())) : ((paramZgu3 == Zgu3.HTTP_RESPONSE) ? ((this.ZH.responseWidget && Zv())) : Zv());
  }
  
  public boolean ZD(Zefx paramZefx) {
    return (this.ZH.requestWidget && Zv());
  }
  
  public boolean Zv() {
    return ((Boolean)this.Zn.get()).booleanValue();
  }
  
  public boolean Zr() {
    return true;
  }
  
  public boolean Zc() {
    return true;
  }
  
  public boolean ZR() {
    return false;
  }
  
  public boolean ZF() {
    return this.Zk;
  }
  
  public Zsmh Zb() {
    Zuh.Zb(false, Zqf.ZC);
    return null;
  }
  
  public void Zs(Zefx paramZefx, boolean paramBoolean) {}
  
  public void ZC(Zefx paramZefx, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public void Zy(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {}
  
  public void Za(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {}
  
  public void Za(Zsmh paramZsmh, boolean paramBoolean) {}
  
  public void ZN(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {}
  
  public void ZV(int paramInt1, int paramInt2, String paramString) {}
  
  public void Zx() {}
  
  public boolean ZQ() {
    return false;
  }
  
  public String Zk() {
    return null;
  }
  
  public byte[] Zw() {
    return new byte[0];
  }
  
  public int[] Zg() {
    return null;
  }
  
  public void Zm(int paramInt1, int paramInt2) {}
  
  public Component Zz() {
    return ZZ();
  }
  
  public List<Component> ZR(MouseEvent paramMouseEvent) {
    return null;
  }
  
  public void Za() {}
  
  public void Zb(Ztoy paramZtoy) {
    Zd(new Zo4(this.ZH, paramZtoy.ZZ(), true, paramZtoy.Zc()));
  }
  
  public Ztcw ZI() {
    return this.Zm.ZI();
  }
  
  public void ZU() {}
  
  static {
    // Byte code:
    //   0: bipush #69
    //   2: ldc '2/Fi(/'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zt37.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #52
    //   82: goto -> 112
    //   85: bipush #15
    //   87: goto -> 112
    //   90: bipush #109
    //   92: goto -> 112
    //   95: bipush #88
    //   97: goto -> 112
    //   100: bipush #8
    //   102: goto -> 112
    //   105: bipush #24
    //   107: goto -> 112
    //   110: bipush #68
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt37.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */