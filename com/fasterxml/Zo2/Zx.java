package com.fasterxml.Zo2;

import burp.Zbqc;

public enum Zx {
  WRAPPER_ARRAY, WRAPPER_OBJECT, METADATA_PROPERTY, PAYLOAD_PROPERTY, PARENT_PROPERTY;
  
  private static final Zx[] ZG;
  
  public boolean Zf() {
    String str = Ze.ZI();
    if (Zbqc.Zwu() == null)
      Ze.ZT("rbQPoc"); 
    return (this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc '.if[pB(!xmXoF>*q)z~GoF>!g}]z@8.imRqW3.zpGzQ8''
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #16
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #113
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
    //   67: ldc 'b15\\f$\\ruj"&5x& 0\\tst<$;bg7-'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #13
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #58
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
    //   200: bipush #15
    //   202: goto -> 232
    //   205: bipush #89
    //   207: goto -> 232
    //   210: bipush #78
    //   212: goto -> 232
    //   215: bipush #102
    //   217: goto -> 232
    //   220: bipush #78
    //   222: goto -> 232
    //   225: bipush #114
    //   227: goto -> 232
    //   230: bipush #29
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
    //   288: new com/fasterxml/Zo2/Zx
    //   291: dup
    //   292: aload_0
    //   293: iconst_3
    //   294: aaload
    //   295: iconst_0
    //   296: invokespecial <init> : (Ljava/lang/String;I)V
    //   299: putstatic com/fasterxml/Zo2/Zx.WRAPPER_ARRAY : Lcom/fasterxml/Zo2/Zx;
    //   302: new com/fasterxml/Zo2/Zx
    //   305: dup
    //   306: aload_0
    //   307: iconst_1
    //   308: aaload
    //   309: iconst_1
    //   310: invokespecial <init> : (Ljava/lang/String;I)V
    //   313: putstatic com/fasterxml/Zo2/Zx.WRAPPER_OBJECT : Lcom/fasterxml/Zo2/Zx;
    //   316: new com/fasterxml/Zo2/Zx
    //   319: dup
    //   320: aload_0
    //   321: iconst_4
    //   322: aaload
    //   323: iconst_2
    //   324: invokespecial <init> : (Ljava/lang/String;I)V
    //   327: putstatic com/fasterxml/Zo2/Zx.METADATA_PROPERTY : Lcom/fasterxml/Zo2/Zx;
    //   330: new com/fasterxml/Zo2/Zx
    //   333: dup
    //   334: aload_0
    //   335: iconst_0
    //   336: aaload
    //   337: iconst_3
    //   338: invokespecial <init> : (Ljava/lang/String;I)V
    //   341: putstatic com/fasterxml/Zo2/Zx.PAYLOAD_PROPERTY : Lcom/fasterxml/Zo2/Zx;
    //   344: new com/fasterxml/Zo2/Zx
    //   347: dup
    //   348: aload_0
    //   349: iconst_2
    //   350: aaload
    //   351: iconst_4
    //   352: invokespecial <init> : (Ljava/lang/String;I)V
    //   355: putstatic com/fasterxml/Zo2/Zx.PARENT_PROPERTY : Lcom/fasterxml/Zo2/Zx;
    //   358: iconst_5
    //   359: anewarray com/fasterxml/Zo2/Zx
    //   362: dup
    //   363: iconst_0
    //   364: getstatic com/fasterxml/Zo2/Zx.WRAPPER_ARRAY : Lcom/fasterxml/Zo2/Zx;
    //   367: aastore
    //   368: dup
    //   369: iconst_1
    //   370: getstatic com/fasterxml/Zo2/Zx.WRAPPER_OBJECT : Lcom/fasterxml/Zo2/Zx;
    //   373: aastore
    //   374: dup
    //   375: iconst_2
    //   376: getstatic com/fasterxml/Zo2/Zx.METADATA_PROPERTY : Lcom/fasterxml/Zo2/Zx;
    //   379: aastore
    //   380: dup
    //   381: iconst_3
    //   382: getstatic com/fasterxml/Zo2/Zx.PAYLOAD_PROPERTY : Lcom/fasterxml/Zo2/Zx;
    //   385: aastore
    //   386: dup
    //   387: iconst_4
    //   388: getstatic com/fasterxml/Zo2/Zx.PARENT_PROPERTY : Lcom/fasterxml/Zo2/Zx;
    //   391: aastore
    //   392: putstatic com/fasterxml/Zo2/Zx.ZG : [Lcom/fasterxml/Zo2/Zx;
    //   395: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo2\Zx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */