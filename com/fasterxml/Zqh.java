package com.fasterxml;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

public enum Zqh {
  ANY, NON_PRIVATE, PROTECTED_AND_PUBLIC, PUBLIC_ONLY, NONE, DEFAULT;
  
  private static final Zqh[] Ze;
  
  public boolean Zp(Member paramMember) {
    switch (Zqt.Za[ordinal()]) {
      case 1:
        return true;
      case 2:
        return false;
      case 3:
        return !Modifier.isPrivate(paramMember.getModifiers());
      case 4:
        if (Modifier.isProtected(paramMember.getModifiers()))
          return true; 
      case 5:
        return Modifier.isPublic(paramMember.getModifiers());
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '>wNH&&4J.sCT)-5}V5h'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #7
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: iconst_2
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 128
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 23
    //   67: ldc ')~[X)&?nNS.-.sCT)4PM8;:eJ'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #20
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: iconst_2
    //   82: iinc #1, 1
    //   85: aload_3
    //   86: iload_1
    //   87: dup
    //   88: iload_2
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 128
    //   97: aload_0
    //   98: swap
    //   99: iload #4
    //   101: iinc #4, 1
    //   104: swap
    //   105: aastore
    //   106: iload_1
    //   107: iload_2
    //   108: iadd
    //   109: dup
    //   110: istore_1
    //   111: iload #5
    //   113: if_icmpge -> 125
    //   116: aload_3
    //   117: iload_1
    //   118: invokevirtual charAt : (I)C
    //   121: istore_2
    //   122: goto -> 81
    //   125: goto -> 284
    //   128: dup_x2
    //   129: pop
    //   130: invokevirtual toCharArray : ()[C
    //   133: dup_x1
    //   134: arraylength
    //   135: dup_x2
    //   136: pop
    //   137: iconst_0
    //   138: istore #6
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iconst_1
    //   144: if_icmpgt -> 244
    //   147: dup2
    //   148: swap
    //   149: iload #6
    //   151: dup2_x1
    //   152: caload
    //   153: swap
    //   154: iload #6
    //   156: bipush #7
    //   158: irem
    //   159: tableswitch default -> 226, 0 -> 196, 1 -> 201, 2 -> 206, 3 -> 211, 4 -> 216, 5 -> 221
    //   196: bipush #87
    //   198: goto -> 228
    //   201: bipush #121
    //   203: goto -> 228
    //   206: bipush #51
    //   208: goto -> 228
    //   211: bipush #13
    //   213: goto -> 228
    //   216: bipush #31
    //   218: goto -> 228
    //   221: bipush #104
    //   223: goto -> 228
    //   226: bipush #112
    //   228: ixor
    //   229: ixor
    //   230: i2c
    //   231: castore
    //   232: iinc #6, 1
    //   235: dup
    //   236: ifne -> 244
    //   239: dup2
    //   240: dup_x1
    //   241: goto -> 151
    //   244: dup2_x1
    //   245: pop2
    //   246: dup_x2
    //   247: iload #6
    //   249: if_icmpgt -> 147
    //   252: pop
    //   253: new java/lang/String
    //   256: dup_x1
    //   257: swap
    //   258: invokespecial <init> : ([C)V
    //   261: invokevirtual intern : ()Ljava/lang/String;
    //   264: swap
    //   265: pop
    //   266: swap
    //   267: tableswitch default -> 39, 0 -> 97
    //   284: new com/fasterxml/Zqh
    //   287: dup
    //   288: aload_0
    //   289: iconst_3
    //   290: aaload
    //   291: iconst_0
    //   292: invokespecial <init> : (Ljava/lang/String;I)V
    //   295: putstatic com/fasterxml/Zqh.ANY : Lcom/fasterxml/Zqh;
    //   298: new com/fasterxml/Zqh
    //   301: dup
    //   302: aload_0
    //   303: iconst_5
    //   304: aaload
    //   305: iconst_1
    //   306: invokespecial <init> : (Ljava/lang/String;I)V
    //   309: putstatic com/fasterxml/Zqh.NON_PRIVATE : Lcom/fasterxml/Zqh;
    //   312: new com/fasterxml/Zqh
    //   315: dup
    //   316: aload_0
    //   317: iconst_4
    //   318: aaload
    //   319: iconst_2
    //   320: invokespecial <init> : (Ljava/lang/String;I)V
    //   323: putstatic com/fasterxml/Zqh.PROTECTED_AND_PUBLIC : Lcom/fasterxml/Zqh;
    //   326: new com/fasterxml/Zqh
    //   329: dup
    //   330: aload_0
    //   331: iconst_2
    //   332: aaload
    //   333: iconst_3
    //   334: invokespecial <init> : (Ljava/lang/String;I)V
    //   337: putstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   340: new com/fasterxml/Zqh
    //   343: dup
    //   344: aload_0
    //   345: iconst_1
    //   346: aaload
    //   347: iconst_4
    //   348: invokespecial <init> : (Ljava/lang/String;I)V
    //   351: putstatic com/fasterxml/Zqh.NONE : Lcom/fasterxml/Zqh;
    //   354: new com/fasterxml/Zqh
    //   357: dup
    //   358: aload_0
    //   359: iconst_0
    //   360: aaload
    //   361: iconst_5
    //   362: invokespecial <init> : (Ljava/lang/String;I)V
    //   365: putstatic com/fasterxml/Zqh.DEFAULT : Lcom/fasterxml/Zqh;
    //   368: bipush #6
    //   370: anewarray com/fasterxml/Zqh
    //   373: dup
    //   374: iconst_0
    //   375: getstatic com/fasterxml/Zqh.ANY : Lcom/fasterxml/Zqh;
    //   378: aastore
    //   379: dup
    //   380: iconst_1
    //   381: getstatic com/fasterxml/Zqh.NON_PRIVATE : Lcom/fasterxml/Zqh;
    //   384: aastore
    //   385: dup
    //   386: iconst_2
    //   387: getstatic com/fasterxml/Zqh.PROTECTED_AND_PUBLIC : Lcom/fasterxml/Zqh;
    //   390: aastore
    //   391: dup
    //   392: iconst_3
    //   393: getstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   396: aastore
    //   397: dup
    //   398: iconst_4
    //   399: getstatic com/fasterxml/Zqh.NONE : Lcom/fasterxml/Zqh;
    //   402: aastore
    //   403: dup
    //   404: iconst_5
    //   405: getstatic com/fasterxml/Zqh.DEFAULT : Lcom/fasterxml/Zqh;
    //   408: aastore
    //   409: putstatic com/fasterxml/Zqh.Ze : [Lcom/fasterxml/Zqh;
    //   412: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */