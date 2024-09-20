package burp;

import java.util.function.BiPredicate;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zli;

@FunctionalInterface
public interface Zmrn {
  public static final Zmrn ZV;
  
  public static final Zmrn Zb;
  
  public static final Zx69 ZL;
  
  public static final Zro0 Zp;
  
  boolean Zk(Zzvx paramZzvx);
  
  static Zee_ Zs(Zeqj paramZeqj) {
    return new Zee_(paramZeqj);
  }
  
  default Zmrn Zl(Zmrn paramZmrn) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zk : (Lburp/Zmrn;Lburp/Zmrn;)Lburp/Zmrn;
    //   7: areturn
  }
  
  default Zmrn ZZ(Zmrn paramZmrn) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zk : (Lburp/Zmrn;Lburp/Zmrn;)Lburp/Zmrn;
    //   7: areturn
  }
  
  static Zm4n ZM() {
    return new Zm4n();
  }
  
  static Zmrn Zf(Zmrn paramZmrn) {
    return paramZmrn::lambda$not$5;
  }
  
  private static boolean ZK(Zefx paramZefx, Zen paramZen) {
    return (Zli.ZR(paramZefx.ZD(), Zkb.Zy(paramZen.toString())) >= 0);
  }
  
  static boolean Zq(Zzvx paramZzvx, Zmrn paramZmrn1, Zmrn paramZmrn2, BiPredicate<Boolean, Boolean> paramBiPredicate) {
    Zzvx zzvx1 = paramZzvx.Zr();
    Zzvx zzvx2 = paramZzvx.Zr();
    boolean bool1 = paramZmrn1.Zk(zzvx1);
    boolean bool2 = paramZmrn2.Zk(zzvx2);
    return paramBiPredicate.test(Boolean.valueOf(bool1), Boolean.valueOf(bool2));
  }
  
  private boolean lambda$negated$6(Zzvx paramZzvx) {
    return !Zk(paramZzvx);
  }
  
  private static boolean lambda$not$5(Zmrn paramZmrn, Zzvx paramZzvx) {
    return !paramZmrn.Zk(paramZzvx);
  }
  
  private boolean lambda$or$4(Zmrn paramZmrn, Zzvx paramZzvx) {
    return Zq(paramZzvx, this, paramZmrn, Zmrn::lambda$or$3);
  }
  
  private static boolean lambda$or$3(Boolean paramBoolean1, Boolean paramBoolean2) {
    return (paramBoolean1.booleanValue() || paramBoolean2.booleanValue());
  }
  
  private boolean lambda$and$2(Zmrn paramZmrn, Zzvx paramZzvx) {
    return Zq(paramZzvx, this, paramZmrn, Zmrn::lambda$and$1);
  }
  
  private static boolean lambda$and$1(Boolean paramBoolean1, Boolean paramBoolean2) {
    return (paramBoolean1.booleanValue() && paramBoolean2.booleanValue());
  }
  
  private static boolean lambda$static$0(Zzvx paramZzvx) {
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #39
    //   2: ldc '}3('
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #106
    //   82: goto -> 112
    //   85: bipush #108
    //   87: goto -> 112
    //   90: bipush #63
    //   92: goto -> 112
    //   95: bipush #95
    //   97: goto -> 112
    //   100: bipush #121
    //   102: goto -> 112
    //   105: bipush #9
    //   107: goto -> 112
    //   110: bipush #12
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
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
    //   154: <illegal opcode> Zk : ()Lburp/Zmrn;
    //   159: putstatic burp/Zmrn.ZV : Lburp/Zmrn;
    //   162: getstatic burp/Zmrn.ZV : Lburp/Zmrn;
    //   165: invokestatic Zf : (Lburp/Zmrn;)Lburp/Zmrn;
    //   168: putstatic burp/Zmrn.Zb : Lburp/Zmrn;
    //   171: invokestatic ZQm : ()Lburp/Zyf;
    //   174: invokestatic Zp : (Lburp/Zstu;)Lburp/Zx69;
    //   177: putstatic burp/Zmrn.ZL : Lburp/Zx69;
    //   180: aload_0
    //   181: invokestatic Zgd : (Ljava/lang/String;)Lburp/Zro0;
    //   184: putstatic burp/Zmrn.Zp : Lburp/Zro0;
    //   187: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmrn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */