package burp;

import java.util.List;
import java.util.function.Function;

public class Zl48 extends Zl4o implements Zehh {
  private final Zkd2 Zu;
  
  private final Function<Zkd2, Boolean> Zi;
  
  private final Zgo8 ZZ;
  
  private final Zgol ZU;
  
  private static final String c;
  
  public Zl48(String paramString, Zkd2 paramZkd2, Function<Zkd2, Boolean> paramFunction, Zgo8 paramZgo8) {
    super(paramString, Zk97.DESKTOP_TOOLS_EXTENDER, paramZkd2, false);
    setName(c);
    this.Zu = paramZkd2;
    this.Zi = paramFunction;
    this.ZZ = paramZgo8;
    this.ZU = new Zgol(paramZkd2, Zz6x.SCAN_LAUNCHER);
    Zd(new Zx8l[] { paramZgo8, this.ZU });
  }
  
  public void ZJ(List<Zkbn> paramList) {
    this.ZZ.Zq(paramList);
  }
  
  public void Zq(Zmln... paramVarArgs) {
    this.ZZ.ZR(paramVarArgs);
  }
  
  public void ZV(Zmln paramZmln) {
    this.ZZ.Zl(paramZmln, Zkjl.ZI);
  }
  
  public void ZB(Zkbn paramZkbn, int paramInt) {
    this.ZZ.Zb(paramInt, paramZkbn);
  }
  
  public void Zv(int paramInt) {
    this.ZZ.ZX(paramInt);
  }
  
  public void Zz(int paramInt, Zkbn paramZkbn) {
    this.ZZ.Zu(paramInt, paramZkbn);
  }
  
  public void Zw(Zmln... paramVarArgs) {
    this.ZZ.ZX(paramVarArgs);
  }
  
  public void Zt(Zmln... paramVarArgs) {
    this.ZZ.ZK(paramVarArgs);
  }
  
  public void ZM(List<Zbf8> paramList) {
    this.ZU.Zu(paramList);
  }
  
  public void Zt() {
    this.ZU.ZV();
  }
  
  public void ZO() {
    this.ZU.Zd();
  }
  
  public void ZY() {
    this.ZU.ZE();
  }
  
  public void Zv() {
    this.ZU.Zf();
  }
  
  public void ZM() {
    this.ZU.ZD();
  }
  
  public void Zs(Ztwh paramZtwh) {
    this.ZU.Zq(paramZtwh);
  }
  
  protected void Zhi() {
    if (((Boolean)this.Zi.apply(this.Zu)).booleanValue())
      Zq(); 
  }
  
  protected void ZhY() {
    Zq();
  }
  
  public void Zu() {
    this.ZZ.Zu();
  }
  
  public void ZJ() {
    this.ZZ.ZJ();
  }
  
  public void ZT() {
    this.ZZ.ZT();
  }
  
  public Zs3h Zd() {
    return this.ZZ.Zd();
  }
  
  static {
    // Byte code:
    //   0: bipush #115
    //   2: ldc 'Vt.+;Ou >&\\tQ](?_c8\\r'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl48.c : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #73
    //   82: goto -> 111
    //   85: bipush #98
    //   87: goto -> 111
    //   90: bipush #58
    //   92: goto -> 111
    //   95: bipush #57
    //   97: goto -> 111
    //   100: iconst_1
    //   101: goto -> 111
    //   104: bipush #19
    //   106: goto -> 111
    //   109: bipush #9
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl48.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */