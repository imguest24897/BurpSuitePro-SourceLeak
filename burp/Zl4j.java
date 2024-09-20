package burp;

import java.util.List;
import java.util.function.Function;
import javax.swing.SwingUtilities;

public class Zl4j extends Zl4o implements Zl_v {
  private final Zzr6 Zh;
  
  private final Function<Zzr6, Boolean> Zx;
  
  private final Zgoz ZA;
  
  private final Zgo8 ZM;
  
  private final Zb5b ZC;
  
  private final Zgol ZG;
  
  private final Ze2h Zd;
  
  private final Zgow ZL;
  
  private static final String c;
  
  public Zl4j(String paramString, Zzr6 paramZzr6, Zgo8 paramZgo8, Zr49 paramZr49, Zbqp paramZbqp, Function<Zzr6, Boolean> paramFunction, Zvo_ paramZvo_) {
    super(paramString, Zk97.DESKTOP_SCANNING_SCAN_LAUNCHER, paramZzr6, false);
    this.Zh = paramZzr6;
    this.Zx = paramFunction;
    this.ZM = paramZgo8;
    this.ZL = null;
    this.ZA = new Zgoz(paramZzr6, paramZr49, paramZbqp, this.ZL);
    this.ZC = paramZvo_.ZY(paramZzr6);
    this.ZG = new Zgol(paramZzr6, Zz6x.SCAN_LAUNCHER);
    this.Zd = new Ze2h();
    setName(c);
    boolean bool = Zl4o.Zhv();
    Zd(new Zx8l[] { this.ZA, paramZgo8, this.ZC, this.ZG });
    if (bool)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void ZI() {
    this.ZA.Z_();
  }
  
  public void ZU() {
    this.ZA.ZK();
  }
  
  public void Zc() {
    this.ZA.ZB();
  }
  
  public void Zl() {
    this.ZA.Zu();
  }
  
  public void ZQ() {
    this.ZA.Zo();
  }
  
  public void ZW() {
    this.ZA.Zg();
  }
  
  public void Zr() {
    this.ZA.ZS();
  }
  
  public void Zj() {
    this.ZA.Zf();
  }
  
  public void ZB() {
    this.ZA.ZC();
  }
  
  public void ZH() {
    this.ZA.Zy();
  }
  
  public void ZL(List<String> paramList) {
    this.ZA.ZJ(paramList);
  }
  
  public void ZB(int paramInt) {
    this.ZA.Zs(paramInt);
  }
  
  public void ZT(boolean paramBoolean) {
    this.ZA.ZV(paramBoolean);
  }
  
  public void Zl(List<String> paramList) {
    this.ZA.Zg(paramList);
  }
  
  public void Zp(List<String> paramList1, List<String> paramList2) {
    this.ZA.Zc(paramList1, paramList2);
  }
  
  public void Zb(List<Zmy8> paramList1, List<Zmy8> paramList2) {
    this.ZA.Zi(paramList1, paramList2);
  }
  
  public void Zg() {
    this.ZA.ZD();
    Zf();
  }
  
  public void Zc(boolean paramBoolean) {
    this.ZA.ZX(paramBoolean);
  }
  
  public void Zj(List<String> paramList) {
    this.ZA.Zy(paramList);
  }
  
  public void Zn() {
    this.ZA.Zp();
    Zf();
  }
  
  public void ZS() {
    this.ZA.ZE();
    Zf();
  }
  
  public void Zi() {
    this.ZA.Za();
    Zf();
  }
  
  public void Zz() {
    this.ZA.ZN();
    Zf();
  }
  
  public void Z_(List<? extends Zll9> paramList) {
    this.ZA.Zw(paramList);
  }
  
  public void Zb() {
    this.ZA.Zh();
    Zf();
  }
  
  public void Zk() {
    this.ZA.Zv();
    Zf();
  }
  
  public void ZK() {
    this.ZA.ZH();
  }
  
  public void Zm() {
    this.ZA.ZU();
  }
  
  public void ZY(boolean paramBoolean) {
    this.ZA.ZP(paramBoolean);
  }
  
  public void ZJ(List<Zkbn> paramList) {
    this.ZM.Zq(paramList);
  }
  
  public void Zq(Zmln... paramVarArgs) {
    this.ZM.ZR(paramVarArgs);
  }
  
  public void ZV(Zmln paramZmln) {
    this.ZM.Zl(paramZmln, this.Zd);
  }
  
  public void ZB(Zkbn paramZkbn, int paramInt) {
    this.ZM.Zb(paramInt, paramZkbn);
  }
  
  public void Zv(int paramInt) {
    this.ZM.ZX(paramInt);
  }
  
  public void Zz(int paramInt, Zkbn paramZkbn) {
    this.ZM.Zu(paramInt, paramZkbn);
  }
  
  public void Zw(Zmln... paramVarArgs) {
    this.ZM.ZX(paramVarArgs);
  }
  
  public void Zt(Zmln... paramVarArgs) {
    this.ZM.ZK(paramVarArgs);
  }
  
  public void Zu() {
    this.ZM.Zu();
  }
  
  public void ZJ() {
    this.ZM.ZJ();
  }
  
  public void ZT() {
    this.ZM.ZT();
  }
  
  public Zs3h Zd() {
    return this.ZM.Zd();
  }
  
  public void ZF(Zz62 paramZz62) {
    this.ZC.Zx(paramZz62);
  }
  
  public void Zp(int paramInt, Zs3n paramZs3n) {
    this.ZC.ZD(paramInt, paramZs3n);
  }
  
  public void ZZ(int paramInt, Zs3n paramZs3n) {
    this.ZC.Zj(paramInt, paramZs3n);
  }
  
  public void ZX(int paramInt, Zs3n paramZs3n) {
    this.ZC.ZS(paramInt, paramZs3n);
  }
  
  public void ZH(List<Zs3n> paramList) {
    this.ZC.ZG(paramList);
  }
  
  public void ZD() {
    this.ZC.Zw();
  }
  
  public void ZV() {
    this.ZC.Zj();
  }
  
  public void Zh() {
    this.ZC.Zn();
  }
  
  public void ZM(List<Zbf8> paramList) {
    this.ZG.Zu(paramList);
  }
  
  public void Zt() {
    this.ZG.ZV();
  }
  
  public void ZO() {
    this.ZG.Zd();
  }
  
  public void ZY() {
    this.ZG.ZE();
  }
  
  public void Zv() {
    this.ZG.Zf();
  }
  
  public void ZM() {
    this.ZG.ZD();
  }
  
  public void Zs(Ztwh paramZtwh) {
    this.ZG.Zq(paramZtwh);
  }
  
  protected void Zhi() {
    this.ZA.Zk();
    if (((Boolean)this.Zx.apply(this.Zh)).booleanValue())
      Zq(); 
  }
  
  protected void ZhY() {
    Zq();
  }
  
  private void Zf() {
    SwingUtilities.invokeLater(this::lambda$refreshSwingLayout$0);
  }
  
  private void lambda$refreshSwingLayout$0() {
    Zmse.ZF(this);
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: ldc 'Dk3`z\D3ZxRz\\tUv'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl4j.c : Ljava/lang/String;
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
    //   80: bipush #35
    //   82: goto -> 112
    //   85: bipush #28
    //   87: goto -> 112
    //   90: bipush #70
    //   92: goto -> 112
    //   95: bipush #111
    //   97: goto -> 112
    //   100: bipush #32
    //   102: goto -> 112
    //   105: bipush #15
    //   107: goto -> 112
    //   110: bipush #98
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */