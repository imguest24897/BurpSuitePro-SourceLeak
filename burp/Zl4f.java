package burp;

import java.util.List;
import java.util.function.Function;
import javax.swing.SwingUtilities;

public class Zl4f extends Zl4o implements Zev2 {
  private final Zetl ZW;
  
  private final Function<Zetl, Boolean> Zy;
  
  private final Zgoj Zx;
  
  private final Zgo8 Zc;
  
  private final Zgol ZK;
  
  private final Zk2j ZY;
  
  private static final String c;
  
  public Zl4f(String paramString, Zetl paramZetl, Zgo8 paramZgo8, Zr49 paramZr49, Zbqp paramZbqp, Function<Zetl, Boolean> paramFunction) {
    super(paramString, Zk97.DESKTOP_SCANNING_LIVE_SCANS, paramZetl, false);
    setName(c);
    this.ZW = paramZetl;
    this.Zy = paramFunction;
    this.Zc = paramZgo8;
    this.Zx = new Zgoj(paramZetl, paramZr49, paramZbqp);
    boolean bool = Zl4o.Zhv();
    this.ZK = new Zgol(paramZetl, Zz6x.SCAN_LAUNCHER);
    this.ZY = new Zk2j();
    Zd(new Zx8l[] { this.Zx, paramZgo8, this.ZK });
    if (Zbqc.Zwu() == null)
      Zl4o.Zi(!bool); 
  }
  
  public void Z_() {
    this.Zx.ZR();
  }
  
  public void ZR() {
    this.Zx.Zo();
  }
  
  public void ZD(boolean paramBoolean) {
    this.Zx.Zd(paramBoolean);
  }
  
  public void ZO(boolean paramBoolean) {
    this.Zx.ZO(paramBoolean);
  }
  
  public void Zg(boolean paramBoolean) {
    this.Zx.Zt(paramBoolean);
  }
  
  public void ZE() {
    this.Zx.ZO();
  }
  
  public void ZA() {
    this.Zx.ZY();
  }
  
  public void ZF() {
    this.Zx.ZK();
  }
  
  public void ZC() {
    this.Zx.ZI();
  }
  
  public void Ze() {
    this.Zx.ZS();
  }
  
  public void Zn(List<String> paramList1, List<String> paramList2) {
    this.Zx.Zk(paramList1, paramList2);
  }
  
  public void ZZ(List<Zmy8> paramList1, List<Zmy8> paramList2) {
    this.Zx.ZJ(paramList1, paramList2);
  }
  
  public void Za() {
    this.Zx.Zf();
    ZI();
  }
  
  public void Zp() {
    this.Zx.ZD();
    ZI();
  }
  
  public void ZX() {
    this.Zx.Zy();
  }
  
  public void ZR(boolean paramBoolean) {
    this.Zx.ZG(paramBoolean);
  }
  
  public void ZS(Zkcl paramZkcl, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Zmet paramZmet, boolean paramBoolean4) {
    this.Zx.ZN(paramZkcl, paramBoolean1, paramBoolean2, paramBoolean3, paramZmet, paramBoolean4);
  }
  
  public void ZN() {
    this.Zx.Zd();
  }
  
  public void ZJ(List<Zkbn> paramList) {
    this.Zc.Zq(paramList);
  }
  
  public void Zq(Zmln... paramVarArgs) {
    this.Zc.ZR(paramVarArgs);
  }
  
  public void ZV(Zmln paramZmln) {
    this.Zc.Zl(paramZmln, this.ZY);
  }
  
  public void ZB(Zkbn paramZkbn, int paramInt) {
    this.Zc.Zb(paramInt, paramZkbn);
  }
  
  public void Zv(int paramInt) {
    this.Zc.ZX(paramInt);
  }
  
  public void Zz(int paramInt, Zkbn paramZkbn) {
    this.Zc.Zu(paramInt, paramZkbn);
  }
  
  public void Zw(Zmln... paramVarArgs) {
    this.Zc.ZX(paramVarArgs);
  }
  
  public void Zt(Zmln... paramVarArgs) {
    this.Zc.ZK(paramVarArgs);
  }
  
  public void ZM(List<Zbf8> paramList) {
    this.ZK.Zu(paramList);
  }
  
  public void Zt() {
    this.ZK.ZV();
  }
  
  public void ZO() {
    this.ZK.Zd();
  }
  
  public void ZY() {
    this.ZK.ZE();
  }
  
  public void Zv() {
    this.ZK.Zf();
  }
  
  public void ZM() {
    this.ZK.ZD();
  }
  
  public void Zs(Ztwh paramZtwh) {
    this.ZK.Zq(paramZtwh);
  }
  
  protected void Zhi() {
    this.Zx.Zb();
    if (((Boolean)this.Zy.apply(this.ZW)).booleanValue())
      Zq(); 
  }
  
  protected void ZhY() {
    Zq();
  }
  
  private void ZI() {
    SwingUtilities.invokeLater(this::lambda$refreshSwingLayout$0);
  }
  
  public void Zu() {
    this.Zc.Zu();
  }
  
  public void ZJ() {
    this.Zc.ZJ();
  }
  
  public void ZT() {
    this.Zc.ZT();
  }
  
  public Zs3h Zd() {
    return this.Zc.Zd();
  }
  
  private void lambda$refreshSwingLayout$0() {
    Zmse.ZF(this);
  }
  
  static {
    // Byte code:
    //   0: bipush #126
    //   2: ldc 'K=d9[v\\bn*tYmP\\rs\\fW`'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl4f.c : Ljava/lang/String;
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
    //   80: bipush #29
    //   82: goto -> 112
    //   85: bipush #92
    //   87: goto -> 112
    //   90: bipush #53
    //   92: goto -> 112
    //   95: bipush #127
    //   97: goto -> 112
    //   100: bipush #19
    //   102: goto -> 112
    //   105: bipush #68
    //   107: goto -> 112
    //   110: bipush #123
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */