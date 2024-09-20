package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.swing.SwingUtilities;
import net.portswigger.Zm2;

class Zbd0 extends Zbqc implements Zkgx {
  private final Ztz9 Zw;
  
  private final Ztp8 Zo;
  
  private final Zb0h Zd;
  
  private final Supplier<Boolean> ZV;
  
  private final Zbd2 ZX;
  
  private final Zbc9 ZF;
  
  private final Ztmb ZP;
  
  private Zbd9 Zs;
  
  private static final String a;
  
  Zbd0(Ztz9 paramZtz9, Ztp8 paramZtp8, Zb0h paramZb0h, Supplier<Boolean> paramSupplier, Ztmb paramZtmb, Zbps paramZbps, Zliz paramZliz, List<Zt37> paramList, Zb3j paramZb3j) {
    super(new BorderLayout());
    this.Zw = paramZtz9;
    this.Zo = paramZtp8;
    this.Zd = paramZb0h;
    this.ZV = paramSupplier;
    this.ZP = paramZtmb;
    this.ZX = new Zbd2(paramZtz9, paramZtp8, paramZb0h, paramZbps, paramZliz, paramList, paramZb3j);
    this.ZF = new Zbc9(new Component[] { this.ZX });
    add(this.ZF, a);
    Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    Zq();
  }
  
  void Zi() {
    Zbsv.Zb(this::lambda$rebuildFromModel$0);
  }
  
  void Zq() {
    this.ZF.ZP(this.ZX);
  }
  
  void Zt(int paramInt1, int paramInt2, String paramString) {
    this.ZX.ZS(paramInt1, paramInt2, paramString);
  }
  
  void ZR(int paramInt1, int paramInt2, String paramString, List<Ztkm> paramList) {
    this.ZX.Zs(paramInt1, paramInt2, paramString, paramList);
  }
  
  void Zf(int paramInt1, int paramInt2, String paramString) {
    this.ZX.ZU(paramInt1, paramInt2, paramString);
  }
  
  void ZK(int paramInt1, int paramInt2, String paramString, List<Ztkm> paramList) {
    this.ZX.Zh(paramInt1, paramInt2, paramString, paramList);
  }
  
  void ZR(int paramInt1, int paramInt2, String paramString) {
    this.ZX.ZF(paramInt1, paramInt2, paramString);
  }
  
  void ZG(int paramInt1, int paramInt2, String paramString, List<Ztkm> paramList) {
    this.ZX.ZC(paramInt1, paramInt2, paramString, paramList);
  }
  
  void ZX() {
    this.ZX.ZG();
  }
  
  void Zk(int paramInt, boolean paramBoolean) {
    Supplier<List<Zb6u>> supplier = this::lambda$showRequestAttributeDetails$1;
    Zgtm zgtm = this.ZP.Zr(Zbd0::lambda$showRequestAttributeDetails$3, paramBoolean);
    ZE(supplier, paramInt, zgtm);
  }
  
  void Za(int paramInt, boolean paramBoolean) {
    Supplier<List<Zb6u>> supplier = this::lambda$showQueryParameterDetails$4;
    Zgtm zgtm = this.ZP.Zr(Zbd0::lambda$showQueryParameterDetails$5, paramBoolean);
    ZE(supplier, paramInt, zgtm);
  }
  
  void Zc(int paramInt, boolean paramBoolean) {
    Supplier<List<Zb6u>> supplier = this::lambda$showCookieDetails$6;
    Zgtm zgtm = this.ZP.Zr(Zbd0::lambda$showCookieDetails$7, paramBoolean);
    ZE(supplier, paramInt, zgtm);
  }
  
  void ZI(int paramInt, boolean paramBoolean) {
    Supplier<List<Zb6u>> supplier = this::lambda$showBodyParameterDetails$8;
    Zgtm zgtm = this.ZP.Zr(Zbd0::lambda$showBodyParameterDetails$9, paramBoolean);
    ZE(supplier, paramInt, zgtm);
  }
  
  void ZX(int paramInt, boolean paramBoolean) {
    Supplier<List<Zb6u>> supplier = this::lambda$showRequestHeaderDetails$10;
    Zgtm zgtm = this.ZP.Zr(Zbd0::lambda$showRequestHeaderDetails$11, paramBoolean);
    ZE(supplier, paramInt, zgtm);
  }
  
  void Z_(int paramInt, boolean paramBoolean) {
    Supplier<List<Zb6u>> supplier = this::lambda$showResponseHeaderDetails$12;
    Zgtm zgtm = this.ZP.Zr(Zbd0::lambda$showResponseHeaderDetails$13, paramBoolean);
    ZE(supplier, paramInt, zgtm);
  }
  
  private void ZE(Supplier<List<Zb6u>> paramSupplier, int paramInt, Zgtm paramZgtm) {
    if (this.Zs != null)
      this.ZF.remove(this.Zs); 
    this.Zs = new Zbd9(this.Zd, this.Zw, paramSupplier, paramInt, paramZgtm);
    this.ZF.add(this.Zs);
    this.ZF.ZP(this.Zs);
  }
  
  void ZG() {
    SwingUtilities.invokeLater(this::lambda$triggerSwingRefresh$14);
  }
  
  void ZP(Zliz paramZliz) {
    this.ZX.ZJ(paramZliz);
  }
  
  public void Zt() {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_COLLAPSE_ALL);
    this.ZX.ZK();
  }
  
  public void ZW() {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_EXPAND_ALL);
    this.ZX.ZB();
  }
  
  public Ztcw ZI() {
    return Zr_1.Zb(new Ztcw[] { this.ZX.ZI(), this::Zq });
  }
  
  public void ZU() {
    this.ZX.ZU();
    Zq();
  }
  
  private void lambda$triggerSwingRefresh$14() {
    Zmse.ZF(getParent());
  }
  
  private static Zgz7 lambda$showResponseHeaderDetails$13(Zg3q paramZg3q) {
    Objects.requireNonNull(paramZg3q);
    return paramZg3q::Ze;
  }
  
  private List lambda$showResponseHeaderDetails$12() {
    return (List)this.Zo.get().ZK().stream().map(Ztnj::Zp).collect(Collectors.toList());
  }
  
  private static Zgz7 lambda$showRequestHeaderDetails$11(Zg3q paramZg3q) {
    Objects.requireNonNull(paramZg3q);
    return paramZg3q::Zi;
  }
  
  private List lambda$showRequestHeaderDetails$10() {
    return (List)this.Zo.get().Zn().stream().map(Ztnj::Zw).collect(Collectors.toList());
  }
  
  private static Zgz7 lambda$showBodyParameterDetails$9(Zg3q paramZg3q) {
    Objects.requireNonNull(paramZg3q);
    return paramZg3q::Zl;
  }
  
  private List lambda$showBodyParameterDetails$8() {
    return (List)this.Zo.get().ZM().stream().map(Zmv3::Zc).collect(Collectors.toList());
  }
  
  private static Zgz7 lambda$showCookieDetails$7(Zg3q paramZg3q) {
    Objects.requireNonNull(paramZg3q);
    return paramZg3q::Zn;
  }
  
  private List lambda$showCookieDetails$6() {
    return (List)this.Zo.get().Zy().stream().map(Zevy::Zc).collect(Collectors.toList());
  }
  
  private static Zgz7 lambda$showQueryParameterDetails$5(Zg3q paramZg3q) {
    Objects.requireNonNull(paramZg3q);
    return paramZg3q::Z_;
  }
  
  private List lambda$showQueryParameterDetails$4() {
    return (List)this.Zo.get().Zh().stream().map(Zb6w::Zc).collect(Collectors.toList());
  }
  
  private static Zgz7 lambda$showRequestAttributeDetails$3(Zg3q paramZg3q) {
    return paramZg3q::lambda$showRequestAttributeDetails$2;
  }
  
  private static void lambda$showRequestAttributeDetails$2(Zg3q paramZg3q, int paramInt, String paramString1, String paramString2) {
    paramZg3q.ZJ(paramInt, paramString2);
  }
  
  private List lambda$showRequestAttributeDetails$1() {
    return (List)this.Zo.get().Zl().stream().map(Zbin::Zx).collect(Collectors.toList());
  }
  
  private void lambda$rebuildFromModel$0() {
    if (!((Boolean)this.ZV.get()).booleanValue())
      this.ZX.Zy(this.ZV); 
    if (!((Boolean)this.ZV.get()).booleanValue() && this.Zs != null)
      this.Zs.ZD(); 
  }
  
  static {
    // Byte code:
    //   0: bipush #66
    //   2: ldc 'w98'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbd0.a : Ljava/lang/String;
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
    //   80: bipush #118
    //   82: goto -> 112
    //   85: bipush #51
    //   87: goto -> 112
    //   90: bipush #43
    //   92: goto -> 112
    //   95: bipush #73
    //   97: goto -> 112
    //   100: bipush #30
    //   102: goto -> 112
    //   105: bipush #8
    //   107: goto -> 112
    //   110: bipush #91
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbd0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */