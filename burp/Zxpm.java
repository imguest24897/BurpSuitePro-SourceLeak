package burp;

import java.awt.Window;
import java.util.List;

public class Zxpm implements Zmw_, Zta8 {
  private final Zgof Ze;
  
  private final Zb55 ZN;
  
  private final Zb55 Zm;
  
  private final Zbc9 ZT;
  
  private final Zb_8 Zn;
  
  private final Zrsm Zs;
  
  private final Zen1 ZK;
  
  private final Window ZA;
  
  private final boolean Zh;
  
  private final boolean ZU;
  
  private Zs3h ZF;
  
  private static final String a;
  
  public Zxpm(Zgof paramZgof, Zb55 paramZb551, Zb55 paramZb552, Zbc9 paramZbc9, Zb_8 paramZb_8, Zrsm paramZrsm, Zen1 paramZen1, Window paramWindow, boolean paramBoolean1, boolean paramBoolean2) {
    this.Ze = paramZgof;
    this.Zm = paramZb551;
    this.ZN = paramZb552;
    this.ZT = paramZbc9;
    this.Zn = paramZb_8;
    this.Zs = paramZrsm;
    this.ZK = paramZen1;
    this.ZA = paramWindow;
    this.Zh = paramBoolean1;
    this.ZU = paramBoolean2;
    paramZbc9.add(paramZgof);
    paramZbc9.add(paramZb552);
    ZA();
  }
  
  private void ZA() {
    String[] arrayOfString = Zb8b.ZH();
    try {
      if (this.Zh) {
        try {
          ZJ();
          if (arrayOfString != null) {
            ZT();
            return;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    ZT();
  }
  
  public void Zq(List<Zkbn> paramList) {
    this.Zm.Zi(paramList);
    this.ZN.Zi(paramList);
  }
  
  public void ZR(Zmln... paramVarArgs) {
    Zb55 zb55 = Zf();
    zb55.Zo(paramVarArgs);
  }
  
  public void Zl(Zmln paramZmln, Zkjl paramZkjl) {
    Window window = Zt2m.ZF(this.ZT);
    Zkkc zkkc = new Zkkc(paramZmln, this.Zs, this.ZU);
    this.Zn.ZA(window, paramZmln, zkkc, paramZkjl, this.ZU);
  }
  
  public void Zb(int paramInt, Zkbn paramZkbn) {
    this.Zm.ZA(paramInt, paramZkbn);
    this.ZN.ZA(paramInt, paramZkbn);
  }
  
  public void ZX(int paramInt) {
    Zb55 zb55 = Zf();
    Zkbn zkbn = zb55.Zm(paramInt);
    String[] arrayOfString = Zb8b.ZH();
    Window window = Zt2m.ZF(this.ZT);
    Zv88 zv88 = new Zv88(paramInt, this.Zs);
    try {
      if (zkbn.Ze()) {
        try {
          this.Zn.ZU(window, zkbn, zv88, this.ZU, this.Zh);
          if (arrayOfString != null) {
            this.Zn.ZV(window, zkbn, zv88, this.Zh);
            return;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zn.ZV(window, zkbn, zv88, this.Zh);
  }
  
  public void Zu(int paramInt, Zkbn paramZkbn) {
    this.Zm.ZJ(paramInt, paramZkbn);
    this.ZN.ZJ(paramInt, paramZkbn);
  }
  
  public void ZX(Zmln... paramVarArgs) {
    List<Zkbn> list = this.ZK.ZK(this.ZA, paramVarArgs);
    try {
      if (!list.isEmpty())
        this.Zs.ZK(list); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public void ZK(Zmln... paramVarArgs) {
    Zb55 zb55 = Zf();
    zb55.Zi(paramVarArgs);
  }
  
  public void Zu() {
    this.Ze.Zm();
  }
  
  public void ZJ() {
    try {
      if (!this.Zh)
        throw new IllegalStateException(a); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZT.ZP(this.Ze);
    this.ZF = Zs3h.SWITCHABLE;
  }
  
  public void ZT() {
    this.ZT.ZP(this.ZN);
    this.ZF = Zs3h.CUSTOM_ONLY;
  }
  
  public Zs3h Zd() {
    return this.ZF;
  }
  
  private Zb55 Zf() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZF == Zs3h.SWITCHABLE) ? this.Zm : this.ZN;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #89
    //   2: ldc 'l-to'lM,@ek-;0w!$X!\\fs#1/X-@ul,*P$db6%V-@`j';4\\bo'l\'\\tbj,+&p6%W$@bb1''
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxpm.a : Ljava/lang/String;
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
    //   80: bipush #96
    //   82: goto -> 112
    //   85: bipush #26
    //   87: goto -> 112
    //   90: bipush #57
    //   92: goto -> 112
    //   95: bipush #79
    //   97: goto -> 112
    //   100: bipush #90
    //   102: goto -> 112
    //   105: bipush #27
    //   107: goto -> 112
    //   110: bipush #21
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxpm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */