package burp;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.swing.SwingUtilities;
import net.portswigger.Zdo;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkki implements Ztrk, Zkgx {
  private final Zko Zq;
  
  private final Zexf Z_;
  
  private final boolean ZN;
  
  private final Zefj ZS;
  
  private final Supplier<Boolean> Zs;
  
  private final Zgu3 Zg;
  
  private final Zb86 Zr;
  
  private final AtomicReference<List<Zt37>> Zn;
  
  private final AtomicReference<List<Zge7>> ZJ;
  
  private final Zs9h Zp;
  
  private Zbfr Za;
  
  private Zmgv ZR;
  
  private boolean ZX;
  
  private boolean Zt;
  
  private Comparator<? super Zge7> ZH;
  
  Zkki(Zko paramZko, Zexf paramZexf, Zmgv paramZmgv, Zs9h paramZs9h, boolean paramBoolean, Supplier<Boolean> paramSupplier, Zgu3 paramZgu3, Zb86 paramZb86) {
    this.Zq = paramZko;
    this.Z_ = paramZexf;
    this.ZR = paramZmgv;
    this.Zp = paramZs9h;
    this.ZN = paramBoolean;
    this.Zs = paramSupplier;
    this.ZS = new Zefj(this.Zq.Ze(Zrri.PRETTY), this.Zq.Ze(Zrri.RAW), paramSupplier);
    this.Zg = paramZgu3;
    this.Zr = paramZb86;
    this.Zn = new AtomicReference<>(Collections.emptyList());
    this.ZJ = new AtomicReference<>(paramZko.ZS().collect((Collector)Collectors.toList()));
    Zs(paramZgu3, null);
    this.ZX = false;
  }
  
  Zmgv Zjf() {
    return this.ZR;
  }
  
  public void Zk(Zmgv paramZmgv) {
    this.ZR = paramZmgv;
  }
  
  boolean Zd(int paramInt) {
    return this.ZS.ZP(paramInt);
  }
  
  boolean Zjd() {
    return (Zj2().Zp() == Zrri.RAW);
  }
  
  boolean ZjD() {
    return (Zj2().Zp() == Zrri.HEX);
  }
  
  void ZjR() {
    this.ZS.ZB(this.Zq.Ze(Zrri.RAW));
  }
  
  void ZU(int paramInt) {
    this.ZS.ZR(paramInt);
  }
  
  public boolean ZB0() {
    return this.ZN;
  }
  
  public boolean ZJ() {
    return (this.ZN && Zj2().Zr());
  }
  
  public void Z_(int paramInt, byte[] paramArrayOfbyte) {
    ZjB().ZN(paramInt, paramInt, paramArrayOfbyte);
  }
  
  public void ZI(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    ZjB().ZN(paramInt1, paramInt2, paramArrayOfbyte);
  }
  
  public void Ze(int paramInt1, int paramInt2) {
    ZjB().ZN(paramInt1, paramInt2, Zdo.ZQ);
  }
  
  public void Zx(int paramInt1, int paramInt2, String paramString) {
    ZjB().ZV(paramInt1, paramInt2, paramString);
  }
  
  public void Z_(Zsmh paramZsmh) {
    boolean bool = (Zt6s.ZX(paramZsmh) != Zt6s.ZX(ZjZ())) ? true : false;
    Z_(paramZsmh, false, bool);
  }
  
  public void ZF(Zsmh paramZsmh) {
    Z_(paramZsmh, true, false);
  }
  
  public Zge7 Zj2() {
    return this.ZS.Zv();
  }
  
  Zge7 ZjC() {
    return this.ZS.ZS();
  }
  
  public void Zjh() {
    this.ZS.ZV(this.ZS.ZK());
  }
  
  List<Zge7> ZjP() {
    return this.ZS.Zr();
  }
  
  void Ze(List<? extends Zge7> paramList, Zsmh paramZsmh) {
    Zu(paramList, paramZsmh);
    this.ZS.Zn();
  }
  
  void Zu(List<? extends Zge7> paramList, Zsmh paramZsmh) {
    ArrayList<Zge7> arrayList = new ArrayList();
    Objects.requireNonNull(arrayList);
    this.Zq.forEach(arrayList::add);
    arrayList.addAll(this.Zn.get());
    if (this.ZH != null)
      arrayList.sort(this.ZH); 
    arrayList.addAll(paramList);
    this.ZJ.set(arrayList);
    ZT(paramZsmh);
  }
  
  boolean ZQ(int paramInt) {
    Zge7 zge7 = this.ZS.Zp(paramInt);
    ZG(zge7);
    return (this.ZS.ZN(zge7) == paramInt);
  }
  
  private void ZG(Zge7 paramZge7) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokeinterface Zp : ()Lburp/Zrri;
    //   10: getstatic burp/Zrri.PRETTY : Lburp/Zrri;
    //   13: if_acmpne -> 25
    //   16: aload_0
    //   17: iconst_1
    //   18: invokevirtual Zf : (Z)V
    //   21: aload_2
    //   22: ifnull -> 42
    //   25: aload_1
    //   26: invokeinterface Zp : ()Lburp/Zrri;
    //   31: getstatic burp/Zrri.RAW : Lburp/Zrri;
    //   34: if_acmpne -> 42
    //   37: aload_0
    //   38: iconst_0
    //   39: invokevirtual Zf : (Z)V
    //   42: aload_0
    //   43: getfield ZS : Lburp/Zefj;
    //   46: aload_1
    //   47: invokevirtual ZB : (Lburp/Zge7;)V
    //   50: return
  }
  
  void Zh(Zge7 paramZge7) {
    Zsmh zsmh = ZjZ();
    this.ZS.Zu(paramZge7);
    ((List)this.ZJ.get()).remove(paramZge7);
    ZO(zsmh);
  }
  
  void Zji() {
    ZG(ZjC());
  }
  
  public Zsmh ZjZ() {
    return ZjB().Zb();
  }
  
  void ZjX() {
    ZjB().Zx();
    this.Zt = false;
  }
  
  public Zgsq Zjz() {
    return this.Zp.ZB();
  }
  
  public void ZM(Zgsq paramZgsq) {
    this.Zp.ZG(paramZgsq);
  }
  
  public void Z_(Zsmh paramZsmh, boolean paramBoolean1, boolean paramBoolean2) {
    this.Za.ZH(ZjB(), paramZsmh, paramBoolean1, paramBoolean2);
    ZT(paramZsmh);
    ZO(paramZsmh);
  }
  
  public void Zi(Zrri paramZrri) {
    ZG(this.Zq.Ze(paramZrri));
    ZO(ZjZ());
  }
  
  void Zs(Zgu3 paramZgu3, Zsmh paramZsmh) {
    Zgu3 zgu3 = ZjE();
    this.Za = this.Z_.Zn(paramZgu3);
    if (zgu3 != paramZgu3)
      ZN(paramZgu3); 
    if (this.ZH != null) {
      ArrayList<Zge7> arrayList = new ArrayList(this.ZJ.get());
      arrayList.sort(this.ZH);
      this.ZJ.set(arrayList);
    } 
    ZT(paramZsmh);
    this.ZX = true;
  }
  
  void Zi(Zsmh paramZsmh, boolean paramBoolean) {
    Zge7 zge7 = ZjB();
    if (zge7.Zb() == paramZsmh && !paramBoolean)
      return; 
    this.Za.ZS(zge7, paramZsmh, paramBoolean);
  }
  
  private Zge7 ZjB() {
    Zge7 zge7 = Zj2();
    return zge7.Zc() ? this.Zq.Ze(Zrri.RAW) : zge7;
  }
  
  Zgu3 ZjE() {
    return (this.Za == null) ? this.Zg : this.Za.ZQ();
  }
  
  boolean Zj1() {
    return this.ZX;
  }
  
  void Zb(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.Za.ZL(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  void Zf(boolean paramBoolean) {
    this.Za.ZO(paramBoolean);
  }
  
  void Zq(boolean paramBoolean) {
    this.Za.Zh(paramBoolean);
  }
  
  void ZD(boolean paramBoolean) {
    this.Za.ZB(paramBoolean);
  }
  
  void Ze(boolean paramBoolean) {
    this.Za.ZI(paramBoolean);
  }
  
  void ZO(Zsmh paramZsmh) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zs : Ljava/util/function/Supplier;
    //   4: invokestatic Zt : (Ljava/util/function/Supplier;)Lburp/Zgu5;
    //   7: astore_2
    //   8: aload_0
    //   9: invokevirtual ZjP : ()Ljava/util/List;
    //   12: aload_0
    //   13: aload_1
    //   14: aload_2
    //   15: <illegal opcode> accept : (Lburp/Zkki;Lburp/Zsmh;Lburp/Zgu5;)Ljava/util/function/Consumer;
    //   20: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   25: aload_0
    //   26: getfield Za : Lburp/Zbfr;
    //   29: aload_2
    //   30: invokevirtual ZV : ()Lburp/Zren;
    //   33: invokevirtual ZY : (Lburp/Zren;)V
    //   36: return
  }
  
  void Zn(List<Zkv5> paramList) {
    this.Za.Za(paramList);
  }
  
  void Zc(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    this.Za.ZO(paramString, paramBoolean1, paramBoolean2);
  }
  
  boolean Zjm() {
    boolean bool = this.Za.ZA(ZjZ());
    if (bool == this.Zt)
      return false; 
    this.Zt = bool;
    return true;
  }
  
  boolean Zjj() {
    return ZT(ZjZ());
  }
  
  private boolean ZT(Zsmh paramZsmh) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> test : (Lburp/Zkki;Lburp/Zsmh;)Ljava/util/function/Predicate;
    //   7: astore_2
    //   8: aload_0
    //   9: getfield ZS : Lburp/Zefj;
    //   12: aload_0
    //   13: getfield ZJ : Ljava/util/concurrent/atomic/AtomicReference;
    //   16: invokevirtual get : ()Ljava/lang/Object;
    //   19: checkcast java/util/List
    //   22: aload_2
    //   23: invokevirtual Zp : (Ljava/util/List;Ljava/util/function/Predicate;)Z
    //   26: ireturn
  }
  
  void Zk(List<Zt37> paramList) {
    this.Zn.set(paramList);
  }
  
  void Zj_() {
    this.Zn.set(Collections.emptyList());
  }
  
  void Zjy() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    List list = this.Zn.get();
    if (list != null)
      list.stream().map(Zt37::ZZ).filter(Zkki::lambda$updateOrphanedInspectorWidgetTabsUI$2).forEach(SwingUtilities::updateComponentTreeUI); 
    if (this.Zq != null)
      this.Zq.ZS().map(Zge7::Zz).filter(Zkki::lambda$updateOrphanedInspectorWidgetTabsUI$2).forEach(SwingUtilities::updateComponentTreeUI); 
  }
  
  void Zjn() {
    ZN(ZjE());
  }
  
  private void ZN(Zgu3 paramZgu3) {
    int[] arrayOfInt = Zbdf.ZM();
    if (this.Zr == null)
      return; 
    if (paramZgu3 == Zgu3.HTTP_RESPONSE) {
      Zs(this.Zr.Zq());
      if (arrayOfInt != null) {
        ZN(this.Zr.Zc());
        return;
      } 
      return;
    } 
    ZN(this.Zr.Zc());
  }
  
  private void Zs(Zkcx paramZkcx) {
    this.ZH = paramZkcx.ZK();
    this.Zq.Ze(Zrri.PRETTY).Zb(paramZkcx.Zz(Zzbe.PRETTY));
    this.Zq.Ze(Zrri.RAW).Zb(paramZkcx.Zz(Zzbe.RAW));
    this.Zq.Ze(Zrri.HEX).Zb(paramZkcx.Zz(Zzbe.HEX));
    this.Zq.Ze(Zrri.RENDER).Zb(paramZkcx.Zz(Zzbe.RENDER));
    ((List)this.Zn.get()).forEach(paramZkcx::lambda$updateResponseViewConfigs$4);
  }
  
  private void ZN(Zt28 paramZt28) {
    this.ZH = paramZt28.Zp();
    this.Zq.Ze(Zrri.PRETTY).Zb(paramZt28.ZO(Zmwh.PRETTY));
    this.Zq.Ze(Zrri.RAW).Zb(paramZt28.ZO(Zmwh.RAW));
    this.Zq.Ze(Zrri.HEX).Zb(paramZt28.ZO(Zmwh.HEX));
    ((List)this.Zn.get()).forEach(paramZt28::lambda$updateRequestViewConfigs$5);
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Za : Lburp/Zbfr;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield ZR : Lburp/Zmgv;
    //   9: astore_2
    //   10: aload_0
    //   11: getfield ZX : Z
    //   14: istore_3
    //   15: aload_0
    //   16: getfield Zt : Z
    //   19: istore #4
    //   21: aload_0
    //   22: getfield ZS : Lburp/Zefj;
    //   25: invokevirtual ZI : ()Lburp/Ztcw;
    //   28: astore #5
    //   30: aload_0
    //   31: aload_1
    //   32: aload_2
    //   33: iload_3
    //   34: iload #4
    //   36: aload #5
    //   38: <illegal opcode> Zg : (Lburp/Zkki;Lburp/Zbfr;Lburp/Zmgv;ZZLburp/Ztcw;)Lburp/Ztcw;
    //   43: areturn
  }
  
  public void ZU() {
    this.ZR = null;
    this.Zt = false;
    Zs(this.Zg, null);
    this.ZS.ZU();
    Zi(Zrri.RAW);
  }
  
  private void lambda$checkpoint$6(Zbfr paramZbfr, Zmgv paramZmgv, boolean paramBoolean1, boolean paramBoolean2, Ztcw paramZtcw) {
    this.Za = paramZbfr;
    this.ZR = paramZmgv;
    this.ZX = paramBoolean1;
    this.Zt = paramBoolean2;
    paramZtcw.Zg();
  }
  
  private static void lambda$updateRequestViewConfigs$5(Zt28 paramZt28, Zt37 paramZt37) {
    Zmwh zmwh = Zmwh.ZO(paramZt37.Zp());
    if (zmwh != null)
      paramZt37.Zb(paramZt28.ZO(zmwh)); 
  }
  
  private static void lambda$updateResponseViewConfigs$4(Zkcx paramZkcx, Zt37 paramZt37) {
    Zzbe zzbe = Zzbe.Zt(paramZt37.Zp());
    if (zzbe != null)
      paramZt37.Zb(paramZkcx.Zz(zzbe)); 
  }
  
  private static boolean lambda$updateOrphanedInspectorWidgetTabsUI$2(Component paramComponent) {
    return (paramComponent.getParent() == null);
  }
  
  private boolean lambda$updateVisiblePanes$1(Zsmh paramZsmh, Zge7 paramZge7) {
    boolean bool = (this.ZR != null && this.ZR.ZoZ()) ? true : false;
    boolean bool1 = this.Za.ZB(paramZge7, paramZsmh, bool);
    Zrri zrri = paramZge7.Zp();
    return Zrri.ZQ(zrri) ? ((paramZge7.ZF() && (paramZge7.Zp() != Zrri.RENDER || ZjE() == Zgu3.HTTP_RESPONSE))) : ((paramZge7.ZF() && bool1));
  }
  
  private void lambda$configureViewControls$0(Zsmh paramZsmh, Zgu5 paramZgu5, Zge7 paramZge7) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore #4
    //   5: aload_3
    //   6: invokeinterface Zp : ()Lburp/Zrri;
    //   11: getstatic burp/Zrri.PRETTY : Lburp/Zrri;
    //   14: if_acmpne -> 21
    //   17: iconst_1
    //   18: goto -> 22
    //   21: iconst_0
    //   22: istore #5
    //   24: iload #5
    //   26: ifeq -> 57
    //   29: aload_3
    //   30: aload_0
    //   31: getfield Za : Lburp/Zbfr;
    //   34: aload_1
    //   35: invokevirtual ZA : (Lburp/Zsmh;)Z
    //   38: invokeinterface Zx : (Z)Lburp/Zkcm;
    //   43: astore #6
    //   45: aload_2
    //   46: aload #6
    //   48: invokevirtual Z_ : (Lburp/Zkcm;)Lburp/Zgu5;
    //   51: pop
    //   52: aload #4
    //   54: ifnull -> 116
    //   57: aload_3
    //   58: invokeinterface Zp : ()Lburp/Zrri;
    //   63: getstatic burp/Zrri.RAW : Lburp/Zrri;
    //   66: if_acmpne -> 95
    //   69: aload_3
    //   70: aload_3
    //   71: invokeinterface Zv : ()Z
    //   76: invokeinterface Zx : (Z)Lburp/Zkcm;
    //   81: astore #6
    //   83: aload_2
    //   84: aload #6
    //   86: invokevirtual Zl : (Lburp/Zkcm;)Lburp/Zgu5;
    //   89: pop
    //   90: aload #4
    //   92: ifnull -> 116
    //   95: aload_3
    //   96: aload_3
    //   97: invokeinterface Zv : ()Z
    //   102: invokeinterface Zx : (Z)Lburp/Zkcm;
    //   107: astore #6
    //   109: aload_2
    //   110: aload #6
    //   112: invokevirtual ZI : (Lburp/Zkcm;)Lburp/Zgu5;
    //   115: pop
    //   116: aload_0
    //   117: getfield ZS : Lburp/Zefj;
    //   120: aload_3
    //   121: invokevirtual Zf : (Lburp/Zge7;)Z
    //   124: ifeq -> 134
    //   127: aload_2
    //   128: aload #6
    //   130: invokevirtual ZH : (Lburp/Zkcm;)Lburp/Zgu5;
    //   133: pop
    //   134: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkki.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */