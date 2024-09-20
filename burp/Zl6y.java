package burp;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import net.portswigger.Zoq;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zl6y implements Zlg4 {
  private final Zbnt ZA;
  
  private final Instant ZD;
  
  private final Zefx Zq;
  
  private final List<Duration> Zt;
  
  private final List<Zb6q> Zj;
  
  private final Zoq<Zs68> Zp;
  
  private final Zvow Zo;
  
  private static final String a;
  
  public Zl6y(Zbnt paramZbnt, Instant paramInstant, Zefx paramZefx, List<Duration> paramList, List<Zb6q> paramList1) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZA : Lburp/Zbnt;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield ZD : Ljava/time/Instant;
    //   14: aload_0
    //   15: aload_3
    //   16: putfield Zq : Lburp/Zefx;
    //   19: aload_0
    //   20: aload #4
    //   22: putfield Zt : Ljava/util/List;
    //   25: aload_0
    //   26: aload #5
    //   28: putfield Zj : Ljava/util/List;
    //   31: aload_0
    //   32: aload_0
    //   33: aload #5
    //   35: aload_1
    //   36: <illegal opcode> get : (Lburp/Zl6y;Ljava/util/List;Lburp/Zbnt;)Ljava/util/function/Supplier;
    //   41: invokestatic ZZ : (Ljava/util/function/Supplier;)Lnet/portswigger/Zoq;
    //   44: putfield Zp : Lnet/portswigger/Zoq;
    //   47: aload_0
    //   48: new burp/Zvow
    //   51: dup
    //   52: aload_3
    //   53: invokeinterface ZT : ()Lburp/Zmzk;
    //   58: aload_1
    //   59: invokespecial <init> : (Lburp/Zmzk;Lburp/Zbnt;)V
    //   62: aload_3
    //   63: invokevirtual ZC : (Lburp/Zefx;)Lburp/Zvow;
    //   66: aload_2
    //   67: invokevirtual toEpochMilli : ()J
    //   70: invokevirtual ZF : (J)Lburp/Zvow;
    //   73: aload #5
    //   75: invokeinterface getFirst : ()Ljava/lang/Object;
    //   80: checkcast burp/Zb6q
    //   83: invokevirtual Zo : (Lburp/Zb6q;)Lburp/Zvow;
    //   86: putfield Zo : Lburp/Zvow;
    //   89: return
  }
  
  public Instant Zr() {
    return this.ZD;
  }
  
  public Zefx ZH() {
    return this.Zq;
  }
  
  public List<Duration> Zx() {
    return this.Zt;
  }
  
  public Zb6q ZD() throws Zsc2 {
    try {
    
    } catch (Zsc2 zsc2) {
      throw a(null);
    } 
    Zuh.Zb(!this.Zj.isEmpty(), Zqf.Zx);
    return this.Zj.getFirst();
  }
  
  public List<Zb6q> Zp() throws Zsc2 {
    return this.Zj;
  }
  
  public Zs68 ZJ() throws Zsc2 {
    return (Zs68)this.Zp.Zz();
  }
  
  public Zvow ZB(Zmzk paramZmzk) {
    return (new Zvow(paramZmzk, this.ZA)).ZR();
  }
  
  public Zvow ZS() {
    return (new Zvow(this.Zo)).ZR();
  }
  
  public Zlyj ZF(Zbza paramZbza, Zlv5 paramZlv5) {
    throw new UnsupportedOperationException(a);
  }
  
  public boolean ZI() {
    return true;
  }
  
  public boolean ZK() {
    return true;
  }
  
  public void ZN() {}
  
  public void Zs() {}
  
  private Zs68 lambda$new$1(List<Zb6q> paramList, Zbnt paramZbnt) {
    return Zbwc.Zr(ZH().ZF(), ((Zb6q)paramList.getFirst()).Za(), Zt0k.HTML_AND_VIEWSTATE_ANALYSIS, true, false, paramZbnt, Zl6y::lambda$new$0);
  }
  
  private static Boolean lambda$new$0() {
    return Boolean.valueOf(false);
  }
  
  private static Zsc2 a(Zsc2 paramZsc2) {
    return paramZsc2;
  }
  
  static {
    // Byte code:
    //   0: bipush #105
    //   2: ldc ':UWoCkJGG}\\fgQIoBFfAHxB[aWy\\fQ.U]p\\rTj'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl6y.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_3
    //   81: goto -> 111
    //   84: bipush #93
    //   86: goto -> 111
    //   89: bipush #77
    //   91: goto -> 111
    //   94: bipush #117
    //   96: goto -> 111
    //   99: bipush #11
    //   101: goto -> 111
    //   104: bipush #92
    //   106: goto -> 111
    //   109: bipush #103
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl6y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */