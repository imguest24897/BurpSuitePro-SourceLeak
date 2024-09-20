package net.portswigger.devtools.client.impl;

import java.util.Objects;

public final class Zxa extends Record {
  private final String zyh;
  
  private static String[] Ze;
  
  private static final String a;
  
  public Zxa(String paramString) {
    this.zyh = Objects.<String>requireNonNullElse(paramString, a);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/devtools/client/impl/Zxa;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/devtools/client/impl/Zxa;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/devtools/client/impl/Zxa;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String Zyh() {
    return this.zyh;
  }
  
  public static void Zb(String[] paramArrayOfString) {
    Ze = paramArrayOfString;
  }
  
  public static String[] Zy() {
    return Ze;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zy : ()[Ljava/lang/String;
    //   3: ifnull -> 13
    //   6: iconst_2
    //   7: anewarray java/lang/String
    //   10: invokestatic Zb : ([Ljava/lang/String;)V
    //   13: bipush #15
    //   15: ldc 'JD@uqu'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic net/portswigger/devtools/client/impl/Zxa.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #16
    //   94: goto -> 124
    //   97: bipush #37
    //   99: goto -> 124
    //   102: bipush #36
    //   104: goto -> 124
    //   107: bipush #20
    //   109: goto -> 124
    //   112: bipush #98
    //   114: goto -> 124
    //   117: bipush #9
    //   119: goto -> 124
    //   122: bipush #20
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */