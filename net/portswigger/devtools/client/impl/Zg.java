package net.portswigger.devtools.client.impl;

import java.lang.reflect.Type;
import net.portswigger.devtools.protocol.Zl;

public final class Zg extends Record implements Zmm {
  private final Zof name;
  
  private final String Zh;
  
  private final Class<? extends Zl> zsb;
  
  private static final String b;
  
  public Zg(Zof paramZof, String paramString, Class<? extends Zl> paramClass) {
    this.name = paramZof;
    this.Zh = paramString;
    this.zsb = paramClass;
  }
  
  public String toString() {
    return b + b;
  }
  
  public Class<? extends Zl> Zsb() {
    return this.zsb;
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/devtools/client/impl/Zg;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/devtools/client/impl/Zg;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zof name() {
    return this.name;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: ldc '/%;J'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic net/portswigger/devtools/client/impl/Zg.b : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #105
    //   82: goto -> 112
    //   85: bipush #80
    //   87: goto -> 112
    //   90: bipush #120
    //   92: goto -> 112
    //   95: bipush #86
    //   97: goto -> 112
    //   100: bipush #61
    //   102: goto -> 112
    //   105: bipush #63
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
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
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
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */