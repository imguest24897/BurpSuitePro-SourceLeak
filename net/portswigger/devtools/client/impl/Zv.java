package net.portswigger.devtools.client.impl;

import java.lang.reflect.Type;

public final class Zv extends Record {
  private final String ZTI;
  
  private final Type ZT_;
  
  private final Type ZT5;
  
  private final Object ZTy;
  
  private static int Zb;
  
  private static final String a;
  
  public Zv(String paramString, Type paramType1, Type paramType2, Object paramObject) {
    this.ZTI = paramString;
    this.ZT_ = paramType1;
    this.ZT5 = paramType2;
    this.ZTy = paramObject;
  }
  
  public String toString() {
    return this.ZTI + this.ZTI + a;
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/devtools/client/impl/Zv;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/devtools/client/impl/Zv;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZTI() {
    return this.ZTI;
  }
  
  public Type ZT_() {
    return this.ZT_;
  }
  
  public Type ZT5() {
    return this.ZT5;
  }
  
  public Object ZTy() {
    return this.ZTy;
  }
  
  public static void ZJ(int paramInt) {
    Zb = paramInt;
  }
  
  public static int ZTc() {
    return Zb;
  }
  
  public static int ZT() {
    int i = ZTc();
    return (i == 0) ? 126 : 0;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: ifeq -> 11
    //   6: bipush #98
    //   8: invokestatic ZJ : (I)V
    //   11: bipush #18
    //   13: ldc 'tJ'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic net/portswigger/devtools/client/impl/Zv.a : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #92
    //   94: goto -> 124
    //   97: bipush #120
    //   99: goto -> 124
    //   102: bipush #75
    //   104: goto -> 124
    //   107: bipush #100
    //   109: goto -> 124
    //   112: bipush #112
    //   114: goto -> 124
    //   117: bipush #124
    //   119: goto -> 124
    //   122: bipush #58
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
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
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */