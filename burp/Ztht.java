package burp;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.EnumSet;
import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ztht extends Zthr implements Zzmn {
  private final Zkid Zs;
  
  private final Ztu1 ZG;
  
  private final Zbkv Zp;
  
  Ztht(Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv, Zbdf paramZbdf, Zgty paramZgty, Zgtp paramZgtp, boolean paramBoolean, Zey9 paramZey9, Zt22 paramZt22, Zghz paramZghz) {
    // Byte code:
    //   0: aload_0
    //   1: aload #8
    //   3: invokespecial <init> : (Lburp/Zey9;)V
    //   6: aload_0
    //   7: new burp/Ztu1
    //   10: dup
    //   11: aload #5
    //   13: invokespecial <init> : (Ljava/lang/Iterable;)V
    //   16: putfield ZG : Lburp/Ztu1;
    //   19: aload_0
    //   20: getstatic burp/Zrri.GRAPHQL : Lburp/Zrri;
    //   23: putfield ZE : Lburp/Zrri;
    //   26: aload_0
    //   27: iload #7
    //   29: putfield Zn : Z
    //   32: aload_0
    //   33: new burp/Zkid
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: putfield Zs : Lburp/Zkid;
    //   43: aload_0
    //   44: new burp/Zbkv
    //   47: dup
    //   48: iload #7
    //   50: aload_1
    //   51: aload_2
    //   52: aload_3
    //   53: new burp/Zgkd
    //   56: dup
    //   57: aload_1
    //   58: aload_0
    //   59: <illegal opcode> Zx : (Lburp/Ztht;)Lburp/Zx8j;
    //   64: aload_2
    //   65: aload_3
    //   66: invokespecial <init> : (Lburp/Zgb6;Lburp/Zx8j;Lburp/Zb0h;Lburp/Ztwv;)V
    //   69: aload #9
    //   71: aload #10
    //   73: getstatic burp/Zbkv.ZR : Ljava/lang/Runnable;
    //   76: invokespecial <init> : (ZLburp/Zgb6;Lburp/Zb0h;Lburp/Ztwv;Lburp/Zli0;Lburp/Zt22;Lburp/Zghz;Ljava/lang/Runnable;)V
    //   79: putfield Zp : Lburp/Zbkv;
    //   82: aload_0
    //   83: getfield Zp : Lburp/Zbkv;
    //   86: aload #4
    //   88: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   91: aload_0
    //   92: getfield Zp : Lburp/Zbkv;
    //   95: new burp/Zbj0
    //   98: dup
    //   99: aload_0
    //   100: getfield ZG : Lburp/Ztu1;
    //   103: invokespecial <init> : (Lburp/Zt7b;)V
    //   106: invokevirtual Zv : (Ljavax/swing/event/DocumentListener;)V
    //   109: aload_0
    //   110: getfield Zp : Lburp/Zbkv;
    //   113: aload_0
    //   114: aload #6
    //   116: <illegal opcode> Zf : (Lburp/Ztht;Lburp/Zgtp;)Lburp/Zg90;
    //   121: invokevirtual Z_ : (Lburp/Zg90;)V
    //   124: aload_0
    //   125: aload_0
    //   126: getfield Zp : Lburp/Zbkv;
    //   129: putfield ZM : Ljavax/swing/JComponent;
    //   132: return
  }
  
  public boolean ZR() {
    return this.Zp.Ze();
  }
  
  public boolean ZT(Zsmh paramZsmh, Zgu3 paramZgu3, Zs68 paramZs68, boolean paramBoolean) {
    return false;
  }
  
  public boolean ZD(Zefx paramZefx) {
    this.Z_ = this.Zs.Zz(paramZefx);
    if (this.Z_)
      Zm2.ZC(Zrrh.SUITE_MESSAGE_EDITOR_GRAPHQL_MESSAGE_DETECTED); 
    return this.Z_;
  }
  
  public boolean Zr() {
    return false;
  }
  
  public Zsmh Zb() {
    return this.Zg;
  }
  
  public void Zs(Zefx paramZefx, boolean paramBoolean) {
    Zm2.ZC(Zrrh.SUITE_MESSAGE_EDITOR_VIEW_GRAPHQL_TAB);
    ZO(paramZefx);
  }
  
  public void ZC(Zefx paramZefx, boolean paramBoolean1, boolean paramBoolean2) {
    ZO(paramZefx);
  }
  
  public void Zy(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Za(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Za(Zsmh paramZsmh, boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zx() {
    this.Zg = Zsmh.Zy;
    this.ZG.ZU();
  }
  
  public void ZN(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {}
  
  public void ZV(int paramInt1, int paramInt2, String paramString) {
    this.Zp.ZA(paramString, paramInt1, paramInt2);
  }
  
  public List<Component> ZR(MouseEvent paramMouseEvent) {
    return this.Zp.ZR(paramMouseEvent);
  }
  
  public String Zk() {
    return "";
  }
  
  public byte[] Zw() {
    return new byte[0];
  }
  
  public int[] Zg() {
    return this.Zp.ZB();
  }
  
  public Zkcm Zx(boolean paramBoolean) {
    return Zkcm.Zc();
  }
  
  public void Zf(byte[] paramArrayOfbyte) {
    this.Zp.ZY(Zkb.ZG(paramArrayOfbyte));
  }
  
  public void ZI(boolean paramBoolean) {
    this.Zp.ZF(paramBoolean);
  }
  
  public void Zy(boolean paramBoolean) {
    this.Zp.ZY(paramBoolean);
  }
  
  public Ztcw ZI() {
    return Zr_1.Zb(new Ztcw[] { super.ZI(), this.Zp.ZI() });
  }
  
  public void ZU() {
    super.ZI();
    this.Zp.ZU();
  }
  
  public void Zm(boolean paramBoolean) {}
  
  public static boolean Zq(EnumSet<Zgu3> paramEnumSet) {
    return paramEnumSet.contains(Zgu3.HTTP_REQUEST);
  }
  
  private void ZO(Zefx paramZefx) {
    this.Zg = paramZefx;
    this.ZG.Zs();
    this.Zp.Zk(paramZefx);
    this.ZG.ZY();
  }
  
  private void lambda$new$1(Zgtp paramZgtp, int[] paramArrayOfint) {
    paramZgtp.Zj(paramArrayOfint[0], paramArrayOfint[1], this.Zp.Zy());
  }
  
  private void lambda$new$0(Zefx paramZefx) {
    this.Zg = paramZefx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztht.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */