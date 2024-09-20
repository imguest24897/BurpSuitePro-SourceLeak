package burp;

import java.util.Collection;
import net.portswigger.Zrmf;

public final class Zejt extends Record {
  private final boolean ZAP;
  
  private final String ZAy;
  
  private final Collection<Zrmf> ZAU;
  
  static String ZR;
  
  public Zejt(boolean paramBoolean, String paramString, Collection<Zrmf> paramCollection) {
    this.ZAP = paramBoolean;
    this.ZAy = paramString;
    this.ZAU = paramCollection;
  }
  
  public static Zejt Zk(String paramString) {
    return new Zejt(false, paramString, null);
  }
  
  public static Zejt ZAS() {
    return Zk(ZR);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zejt;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zejt;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zejt;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean ZAP() {
    return this.ZAP;
  }
  
  public String ZAy() {
    return this.ZAy;
  }
  
  public Collection<Zrmf> ZAU() {
    return this.ZAU;
  }
  
  static {
    // Byte code:
    //   0: bipush #105
    //   2: ldc '_=&wyM8hr!~|G?h:6;\sV<66}tMvh;<u3My$:~jkt7sxEvr;'rrM?}<7;~Lmn70o=Bqer bsW~dr6ioLmo|'
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
    //   80: bipush #117
    //   82: goto -> 112
    //   85: bipush #59
    //   87: goto -> 112
    //   90: bipush #58
    //   92: goto -> 112
    //   95: bipush #114
    //   97: goto -> 112
    //   100: bipush #116
    //   102: goto -> 112
    //   105: bipush #74
    //   107: goto -> 112
    //   110: bipush #118
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
    //   154: aload_0
    //   155: putstatic burp/Zejt.ZR : Ljava/lang/String;
    //   158: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zejt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */