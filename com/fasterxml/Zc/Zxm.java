package com.fasterxml.Zc;

public enum Zxm {
  NONE, BEFORE, AFTER, BOTH;
  
  private final String ZF;
  
  private final String ZL;
  
  private static final Zxm[] Ze;
  
  Zxm(String paramString1, String paramString2) {
    this.ZF = paramString1;
    this.ZL = paramString2;
  }
  
  public String ZP(char paramChar) {
    return this.ZF + paramChar + this.ZL;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'e&?xi&%u'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: iconst_4
    //   18: istore_2
    //   19: iconst_m1
    //   20: istore_1
    //   21: bipush #49
    //   23: iinc #1, 1
    //   26: aload_3
    //   27: iload_1
    //   28: dup
    //   29: iload_2
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 128
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
    //   66: ldc '<ut&\2?vf,\'
    //   68: dup
    //   69: astore_3
    //   70: invokevirtual length : ()I
    //   73: istore #5
    //   75: bipush #6
    //   77: istore_2
    //   78: iconst_m1
    //   79: istore_1
    //   80: bipush #104
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
    //   122: goto -> 80
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
    //   144: if_icmpgt -> 243
    //   147: dup2
    //   148: swap
    //   149: iload #6
    //   151: dup2_x1
    //   152: caload
    //   153: swap
    //   154: iload #6
    //   156: bipush #7
    //   158: irem
    //   159: tableswitch default -> 225, 0 -> 196, 1 -> 201, 2 -> 206, 3 -> 211, 4 -> 215, 5 -> 220
    //   196: bipush #22
    //   198: goto -> 227
    //   201: bipush #88
    //   203: goto -> 227
    //   206: bipush #90
    //   208: goto -> 227
    //   211: iconst_1
    //   212: goto -> 227
    //   215: bipush #102
    //   217: goto -> 227
    //   220: bipush #31
    //   222: goto -> 227
    //   225: bipush #60
    //   227: ixor
    //   228: ixor
    //   229: i2c
    //   230: castore
    //   231: iinc #6, 1
    //   234: dup
    //   235: ifne -> 243
    //   238: dup2
    //   239: dup_x1
    //   240: goto -> 151
    //   243: dup2_x1
    //   244: pop2
    //   245: dup_x2
    //   246: iload #6
    //   248: if_icmpgt -> 147
    //   251: pop
    //   252: new java/lang/String
    //   255: dup_x1
    //   256: swap
    //   257: invokespecial <init> : ([C)V
    //   260: invokevirtual intern : ()Ljava/lang/String;
    //   263: swap
    //   264: pop
    //   265: swap
    //   266: tableswitch default -> 38, 0 -> 97
    //   284: new com/fasterxml/Zc/Zxm
    //   287: dup
    //   288: aload_0
    //   289: iconst_1
    //   290: aaload
    //   291: iconst_0
    //   292: ldc ''
    //   294: ldc ''
    //   296: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    //   299: putstatic com/fasterxml/Zc/Zxm.NONE : Lcom/fasterxml/Zc/Zxm;
    //   302: new com/fasterxml/Zc/Zxm
    //   305: dup
    //   306: aload_0
    //   307: iconst_2
    //   308: aaload
    //   309: iconst_1
    //   310: ldc ' '
    //   312: ldc ''
    //   314: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    //   317: putstatic com/fasterxml/Zc/Zxm.BEFORE : Lcom/fasterxml/Zc/Zxm;
    //   320: new com/fasterxml/Zc/Zxm
    //   323: dup
    //   324: aload_0
    //   325: iconst_3
    //   326: aaload
    //   327: iconst_2
    //   328: ldc ''
    //   330: ldc ' '
    //   332: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    //   335: putstatic com/fasterxml/Zc/Zxm.AFTER : Lcom/fasterxml/Zc/Zxm;
    //   338: new com/fasterxml/Zc/Zxm
    //   341: dup
    //   342: aload_0
    //   343: iconst_0
    //   344: aaload
    //   345: iconst_3
    //   346: ldc ' '
    //   348: ldc ' '
    //   350: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    //   353: putstatic com/fasterxml/Zc/Zxm.BOTH : Lcom/fasterxml/Zc/Zxm;
    //   356: iconst_4
    //   357: anewarray com/fasterxml/Zc/Zxm
    //   360: dup
    //   361: iconst_0
    //   362: getstatic com/fasterxml/Zc/Zxm.NONE : Lcom/fasterxml/Zc/Zxm;
    //   365: aastore
    //   366: dup
    //   367: iconst_1
    //   368: getstatic com/fasterxml/Zc/Zxm.BEFORE : Lcom/fasterxml/Zc/Zxm;
    //   371: aastore
    //   372: dup
    //   373: iconst_2
    //   374: getstatic com/fasterxml/Zc/Zxm.AFTER : Lcom/fasterxml/Zc/Zxm;
    //   377: aastore
    //   378: dup
    //   379: iconst_3
    //   380: getstatic com/fasterxml/Zc/Zxm.BOTH : Lcom/fasterxml/Zc/Zxm;
    //   383: aastore
    //   384: putstatic com/fasterxml/Zc/Zxm.Ze : [Lcom/fasterxml/Zc/Zxm;
    //   387: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zc\Zxm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */