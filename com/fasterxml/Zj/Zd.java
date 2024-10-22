package com.fasterxml.Zj;

public enum Zd implements Zz {
  READ_NULL_PROPERTIES, WRITE_NULL_PROPERTIES, WRITE_PROPERTIES_SORTED, STRIP_TRAILING_BIGDECIMAL_ZEROES, FAIL_ON_NAN_TO_BIG_DECIMAL_COERCION;
  
  private final boolean Zh;
  
  private final int Zg;
  
  Zd(boolean paramBoolean) {
    this.Zh = paramBoolean;
    this.Zg = 1 << ordinal();
  }
  
  public boolean ZP() {
    return this.Zh;
  }
  
  public boolean ZR(int paramInt) {
    return ((paramInt & this.Zg) != 0);
  }
  
  public int ZV() {
    return this.Zg;
  }
  
  public int Zt() {
    return 1;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc '<nM#\\nd9sT2o.o[$ i.x<nM#\\nd>pH(i;yV#~#-}M;t4rE9o4~M0(uI6d\\b$yV4t'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #23
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #69
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 129
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
    //   64: goto -> 22
    //   67: ldc '_a\\t(S(Jz\\f1B;Iz<I?Fr\\f'V9DvNr'B)Gl*C,Yg\\t=_'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #32
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #114
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #46
    //   202: goto -> 232
    //   205: bipush #121
    //   207: goto -> 232
    //   210: bipush #65
    //   212: goto -> 232
    //   215: bipush #50
    //   217: goto -> 232
    //   220: bipush #10
    //   222: goto -> 232
    //   225: bipush #126
    //   227: goto -> 232
    //   230: bipush #14
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 39, 0 -> 98
    //   288: new com/fasterxml/Zj/Zd
    //   291: dup
    //   292: aload_0
    //   293: iconst_4
    //   294: aaload
    //   295: iconst_0
    //   296: iconst_1
    //   297: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   300: putstatic com/fasterxml/Zj/Zd.READ_NULL_PROPERTIES : Lcom/fasterxml/Zj/Zd;
    //   303: new com/fasterxml/Zj/Zd
    //   306: dup
    //   307: aload_0
    //   308: iconst_1
    //   309: aaload
    //   310: iconst_1
    //   311: iconst_1
    //   312: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   315: putstatic com/fasterxml/Zj/Zd.WRITE_NULL_PROPERTIES : Lcom/fasterxml/Zj/Zd;
    //   318: new com/fasterxml/Zj/Zd
    //   321: dup
    //   322: aload_0
    //   323: iconst_0
    //   324: aaload
    //   325: iconst_2
    //   326: iconst_0
    //   327: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   330: putstatic com/fasterxml/Zj/Zd.WRITE_PROPERTIES_SORTED : Lcom/fasterxml/Zj/Zd;
    //   333: new com/fasterxml/Zj/Zd
    //   336: dup
    //   337: aload_0
    //   338: iconst_3
    //   339: aaload
    //   340: iconst_3
    //   341: iconst_1
    //   342: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   345: putstatic com/fasterxml/Zj/Zd.STRIP_TRAILING_BIGDECIMAL_ZEROES : Lcom/fasterxml/Zj/Zd;
    //   348: new com/fasterxml/Zj/Zd
    //   351: dup
    //   352: aload_0
    //   353: iconst_2
    //   354: aaload
    //   355: iconst_4
    //   356: iconst_0
    //   357: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   360: putstatic com/fasterxml/Zj/Zd.FAIL_ON_NAN_TO_BIG_DECIMAL_COERCION : Lcom/fasterxml/Zj/Zd;
    //   363: iconst_5
    //   364: anewarray com/fasterxml/Zj/Zd
    //   367: dup
    //   368: iconst_0
    //   369: getstatic com/fasterxml/Zj/Zd.READ_NULL_PROPERTIES : Lcom/fasterxml/Zj/Zd;
    //   372: aastore
    //   373: dup
    //   374: iconst_1
    //   375: getstatic com/fasterxml/Zj/Zd.WRITE_NULL_PROPERTIES : Lcom/fasterxml/Zj/Zd;
    //   378: aastore
    //   379: dup
    //   380: iconst_2
    //   381: getstatic com/fasterxml/Zj/Zd.WRITE_PROPERTIES_SORTED : Lcom/fasterxml/Zj/Zd;
    //   384: aastore
    //   385: dup
    //   386: iconst_3
    //   387: getstatic com/fasterxml/Zj/Zd.STRIP_TRAILING_BIGDECIMAL_ZEROES : Lcom/fasterxml/Zj/Zd;
    //   390: aastore
    //   391: dup
    //   392: iconst_4
    //   393: getstatic com/fasterxml/Zj/Zd.FAIL_ON_NAN_TO_BIG_DECIMAL_COERCION : Lcom/fasterxml/Zj/Zd;
    //   396: aastore
    //   397: putstatic com/fasterxml/Zj/Zd.Zm : [Lcom/fasterxml/Zj/Zd;
    //   400: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */