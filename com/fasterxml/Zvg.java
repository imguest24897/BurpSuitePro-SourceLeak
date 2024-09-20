package com.fasterxml;

public enum Zvg {
  SET, SKIP, FAIL, AS_EMPTY, DEFAULT;
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'lyhy}u.{yz#K'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: iconst_3
    //   18: istore_2
    //   19: iconst_m1
    //   20: istore_1
    //   21: bipush #10
    //   23: iinc #1, 1
    //   26: aload_3
    //   27: iload_1
    //   28: dup
    //   29: iload_2
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 127
    //   38: aload_0
    //   39: swap
    //   40: iload #4
    //   42: iinc #4, 1
    //   45: swap
    //   46: aastore
    //   47: iload_1
    //   48: iload_2
    //   49: iadd
    //   50: dup
    //   51: istore_1
    //   52: iload #5
    //   54: if_icmpge -> 66
    //   57: aload_3
    //   58: iload_1
    //   59: invokevirtual charAt : (I)C
    //   62: istore_2
    //   63: goto -> 21
    //   66: ldc 'B\\bW#oe'
    //   68: dup
    //   69: astore_3
    //   70: invokevirtual length : ()I
    //   73: istore #5
    //   75: iconst_4
    //   76: istore_2
    //   77: iconst_m1
    //   78: istore_1
    //   79: bipush #122
    //   81: iinc #1, 1
    //   84: aload_3
    //   85: iload_1
    //   86: dup
    //   87: iload_2
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 127
    //   96: aload_0
    //   97: swap
    //   98: iload #4
    //   100: iinc #4, 1
    //   103: swap
    //   104: aastore
    //   105: iload_1
    //   106: iload_2
    //   107: iadd
    //   108: dup
    //   109: istore_1
    //   110: iload #5
    //   112: if_icmpge -> 124
    //   115: aload_3
    //   116: iload_1
    //   117: invokevirtual charAt : (I)C
    //   120: istore_2
    //   121: goto -> 79
    //   124: goto -> 284
    //   127: dup_x2
    //   128: pop
    //   129: invokevirtual toCharArray : ()[C
    //   132: dup_x1
    //   133: arraylength
    //   134: dup_x2
    //   135: pop
    //   136: iconst_0
    //   137: istore #6
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iconst_1
    //   143: if_icmpgt -> 244
    //   146: dup2
    //   147: swap
    //   148: iload #6
    //   150: dup2_x1
    //   151: caload
    //   152: swap
    //   153: iload #6
    //   155: bipush #7
    //   157: irem
    //   158: tableswitch default -> 226, 0 -> 196, 1 -> 201, 2 -> 206, 3 -> 211, 4 -> 216, 5 -> 221
    //   196: bipush #53
    //   198: goto -> 228
    //   201: bipush #54
    //   203: goto -> 228
    //   206: bipush #54
    //   208: goto -> 228
    //   211: bipush #104
    //   213: goto -> 228
    //   216: bipush #20
    //   218: goto -> 228
    //   221: bipush #69
    //   223: goto -> 228
    //   226: bipush #75
    //   228: ixor
    //   229: ixor
    //   230: i2c
    //   231: castore
    //   232: iinc #6, 1
    //   235: dup
    //   236: ifne -> 244
    //   239: dup2
    //   240: dup_x1
    //   241: goto -> 150
    //   244: dup2_x1
    //   245: pop2
    //   246: dup_x2
    //   247: iload #6
    //   249: if_icmpgt -> 146
    //   252: pop
    //   253: new java/lang/String
    //   256: dup_x1
    //   257: swap
    //   258: invokespecial <init> : ([C)V
    //   261: invokevirtual intern : ()Ljava/lang/String;
    //   264: swap
    //   265: pop
    //   266: swap
    //   267: tableswitch default -> 38, 0 -> 96
    //   284: new com/fasterxml/Zvg
    //   287: dup
    //   288: aload_0
    //   289: iconst_0
    //   290: aaload
    //   291: iconst_0
    //   292: invokespecial <init> : (Ljava/lang/String;I)V
    //   295: putstatic com/fasterxml/Zvg.SET : Lcom/fasterxml/Zvg;
    //   298: new com/fasterxml/Zvg
    //   301: dup
    //   302: aload_0
    //   303: iconst_3
    //   304: aaload
    //   305: iconst_1
    //   306: invokespecial <init> : (Ljava/lang/String;I)V
    //   309: putstatic com/fasterxml/Zvg.SKIP : Lcom/fasterxml/Zvg;
    //   312: new com/fasterxml/Zvg
    //   315: dup
    //   316: aload_0
    //   317: iconst_1
    //   318: aaload
    //   319: iconst_2
    //   320: invokespecial <init> : (Ljava/lang/String;I)V
    //   323: putstatic com/fasterxml/Zvg.FAIL : Lcom/fasterxml/Zvg;
    //   326: new com/fasterxml/Zvg
    //   329: dup
    //   330: aload_0
    //   331: iconst_4
    //   332: aaload
    //   333: iconst_3
    //   334: invokespecial <init> : (Ljava/lang/String;I)V
    //   337: putstatic com/fasterxml/Zvg.AS_EMPTY : Lcom/fasterxml/Zvg;
    //   340: new com/fasterxml/Zvg
    //   343: dup
    //   344: aload_0
    //   345: iconst_2
    //   346: aaload
    //   347: iconst_4
    //   348: invokespecial <init> : (Ljava/lang/String;I)V
    //   351: putstatic com/fasterxml/Zvg.DEFAULT : Lcom/fasterxml/Zvg;
    //   354: iconst_5
    //   355: anewarray com/fasterxml/Zvg
    //   358: dup
    //   359: iconst_0
    //   360: getstatic com/fasterxml/Zvg.SET : Lcom/fasterxml/Zvg;
    //   363: aastore
    //   364: dup
    //   365: iconst_1
    //   366: getstatic com/fasterxml/Zvg.SKIP : Lcom/fasterxml/Zvg;
    //   369: aastore
    //   370: dup
    //   371: iconst_2
    //   372: getstatic com/fasterxml/Zvg.FAIL : Lcom/fasterxml/Zvg;
    //   375: aastore
    //   376: dup
    //   377: iconst_3
    //   378: getstatic com/fasterxml/Zvg.AS_EMPTY : Lcom/fasterxml/Zvg;
    //   381: aastore
    //   382: dup
    //   383: iconst_4
    //   384: getstatic com/fasterxml/Zvg.DEFAULT : Lcom/fasterxml/Zvg;
    //   387: aastore
    //   388: putstatic com/fasterxml/Zvg.Zh : [Lcom/fasterxml/Zvg;
    //   391: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zvg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */