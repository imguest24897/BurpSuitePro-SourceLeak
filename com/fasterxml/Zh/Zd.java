package com.fasterxml.Zh;

public enum Zd {
  Array, Collection, Map, POJO, Untyped, Integer, Float, Boolean, Enum, Textual, Binary, DateTime, OtherScalar;
  
  private static int[] ZL;
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore #4
    //   10: ldc '~*.>X@\\nu2'<^F_0wb,* yd6.+nQW|?9s~+&c~*2)XVt1'<\\bu&?,\^ty0*+Df_{q.'
    //   12: dup
    //   13: astore_3
    //   14: invokevirtual length : ()I
    //   17: istore #5
    //   19: bipush #7
    //   21: istore_2
    //   22: invokestatic Zb : ([I)V
    //   25: iconst_m1
    //   26: istore_1
    //   27: bipush #124
    //   29: iinc #1, 1
    //   32: aload_3
    //   33: iload_1
    //   34: dup
    //   35: iload_2
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 133
    //   44: aload_0
    //   45: swap
    //   46: iload #4
    //   48: iinc #4, 1
    //   51: swap
    //   52: aastore
    //   53: iload_1
    //   54: iload_2
    //   55: iadd
    //   56: dup
    //   57: istore_1
    //   58: iload #5
    //   60: if_icmpge -> 72
    //   63: aload_3
    //   64: iload_1
    //   65: invokevirtual charAt : (I)C
    //   68: istore_2
    //   69: goto -> 27
    //   72: ldc 'JQV\\b\\t\\nQUv/$('
    //   74: dup
    //   75: astore_3
    //   76: invokevirtual length : ()I
    //   79: istore #5
    //   81: iconst_5
    //   82: istore_2
    //   83: iconst_m1
    //   84: istore_1
    //   85: bipush #7
    //   87: iinc #1, 1
    //   90: aload_3
    //   91: iload_1
    //   92: dup
    //   93: iload_2
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 133
    //   102: aload_0
    //   103: swap
    //   104: iload #4
    //   106: iinc #4, 1
    //   109: swap
    //   110: aastore
    //   111: iload_1
    //   112: iload_2
    //   113: iadd
    //   114: dup
    //   115: istore_1
    //   116: iload #5
    //   118: if_icmpge -> 130
    //   121: aload_3
    //   122: iload_1
    //   123: invokevirtual charAt : (I)C
    //   126: istore_2
    //   127: goto -> 85
    //   130: goto -> 292
    //   133: dup_x2
    //   134: pop
    //   135: invokevirtual toCharArray : ()[C
    //   138: dup_x1
    //   139: arraylength
    //   140: dup_x2
    //   141: pop
    //   142: iconst_0
    //   143: istore #6
    //   145: dup2_x1
    //   146: pop2
    //   147: dup_x2
    //   148: iconst_1
    //   149: if_icmpgt -> 252
    //   152: dup2
    //   153: swap
    //   154: iload #6
    //   156: dup2_x1
    //   157: caload
    //   158: swap
    //   159: iload #6
    //   161: bipush #7
    //   163: irem
    //   164: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #74
    //   206: goto -> 236
    //   209: bipush #108
    //   211: goto -> 236
    //   214: bipush #34
    //   216: goto -> 236
    //   219: bipush #55
    //   221: goto -> 236
    //   224: bipush #37
    //   226: goto -> 236
    //   229: bipush #65
    //   231: goto -> 236
    //   234: bipush #78
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 156
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 152
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 44, 0 -> 102
    //   292: new com/fasterxml/Zh/Zd
    //   295: dup
    //   296: aload_0
    //   297: iconst_2
    //   298: aaload
    //   299: iconst_0
    //   300: invokespecial <init> : (Ljava/lang/String;I)V
    //   303: putstatic com/fasterxml/Zh/Zd.Array : Lcom/fasterxml/Zh/Zd;
    //   306: new com/fasterxml/Zh/Zd
    //   309: dup
    //   310: aload_0
    //   311: iconst_1
    //   312: aaload
    //   313: iconst_1
    //   314: invokespecial <init> : (Ljava/lang/String;I)V
    //   317: putstatic com/fasterxml/Zh/Zd.Collection : Lcom/fasterxml/Zh/Zd;
    //   320: new com/fasterxml/Zh/Zd
    //   323: dup
    //   324: aload_0
    //   325: bipush #10
    //   327: aaload
    //   328: iconst_2
    //   329: invokespecial <init> : (Ljava/lang/String;I)V
    //   332: putstatic com/fasterxml/Zh/Zd.Map : Lcom/fasterxml/Zh/Zd;
    //   335: new com/fasterxml/Zh/Zd
    //   338: dup
    //   339: aload_0
    //   340: bipush #9
    //   342: aaload
    //   343: iconst_3
    //   344: invokespecial <init> : (Ljava/lang/String;I)V
    //   347: putstatic com/fasterxml/Zh/Zd.POJO : Lcom/fasterxml/Zh/Zd;
    //   350: new com/fasterxml/Zh/Zd
    //   353: dup
    //   354: aload_0
    //   355: iconst_5
    //   356: aaload
    //   357: iconst_4
    //   358: invokespecial <init> : (Ljava/lang/String;I)V
    //   361: putstatic com/fasterxml/Zh/Zd.Untyped : Lcom/fasterxml/Zh/Zd;
    //   364: new com/fasterxml/Zh/Zd
    //   367: dup
    //   368: aload_0
    //   369: iconst_0
    //   370: aaload
    //   371: iconst_5
    //   372: invokespecial <init> : (Ljava/lang/String;I)V
    //   375: putstatic com/fasterxml/Zh/Zd.Integer : Lcom/fasterxml/Zh/Zd;
    //   378: new com/fasterxml/Zh/Zd
    //   381: dup
    //   382: aload_0
    //   383: bipush #11
    //   385: aaload
    //   386: bipush #6
    //   388: invokespecial <init> : (Ljava/lang/String;I)V
    //   391: putstatic com/fasterxml/Zh/Zd.Float : Lcom/fasterxml/Zh/Zd;
    //   394: new com/fasterxml/Zh/Zd
    //   397: dup
    //   398: aload_0
    //   399: bipush #6
    //   401: aaload
    //   402: bipush #7
    //   404: invokespecial <init> : (Ljava/lang/String;I)V
    //   407: putstatic com/fasterxml/Zh/Zd.Boolean : Lcom/fasterxml/Zh/Zd;
    //   410: new com/fasterxml/Zh/Zd
    //   413: dup
    //   414: aload_0
    //   415: iconst_4
    //   416: aaload
    //   417: bipush #8
    //   419: invokespecial <init> : (Ljava/lang/String;I)V
    //   422: putstatic com/fasterxml/Zh/Zd.Enum : Lcom/fasterxml/Zh/Zd;
    //   425: new com/fasterxml/Zh/Zd
    //   428: dup
    //   429: aload_0
    //   430: bipush #7
    //   432: aaload
    //   433: bipush #9
    //   435: invokespecial <init> : (Ljava/lang/String;I)V
    //   438: putstatic com/fasterxml/Zh/Zd.Textual : Lcom/fasterxml/Zh/Zd;
    //   441: new com/fasterxml/Zh/Zd
    //   444: dup
    //   445: aload_0
    //   446: bipush #8
    //   448: aaload
    //   449: bipush #10
    //   451: invokespecial <init> : (Ljava/lang/String;I)V
    //   454: putstatic com/fasterxml/Zh/Zd.Binary : Lcom/fasterxml/Zh/Zd;
    //   457: new com/fasterxml/Zh/Zd
    //   460: dup
    //   461: aload_0
    //   462: bipush #12
    //   464: aaload
    //   465: bipush #11
    //   467: invokespecial <init> : (Ljava/lang/String;I)V
    //   470: putstatic com/fasterxml/Zh/Zd.DateTime : Lcom/fasterxml/Zh/Zd;
    //   473: new com/fasterxml/Zh/Zd
    //   476: dup
    //   477: aload_0
    //   478: iconst_3
    //   479: aaload
    //   480: bipush #12
    //   482: invokespecial <init> : (Ljava/lang/String;I)V
    //   485: putstatic com/fasterxml/Zh/Zd.OtherScalar : Lcom/fasterxml/Zh/Zd;
    //   488: bipush #13
    //   490: anewarray com/fasterxml/Zh/Zd
    //   493: dup
    //   494: iconst_0
    //   495: getstatic com/fasterxml/Zh/Zd.Array : Lcom/fasterxml/Zh/Zd;
    //   498: aastore
    //   499: dup
    //   500: iconst_1
    //   501: getstatic com/fasterxml/Zh/Zd.Collection : Lcom/fasterxml/Zh/Zd;
    //   504: aastore
    //   505: dup
    //   506: iconst_2
    //   507: getstatic com/fasterxml/Zh/Zd.Map : Lcom/fasterxml/Zh/Zd;
    //   510: aastore
    //   511: dup
    //   512: iconst_3
    //   513: getstatic com/fasterxml/Zh/Zd.POJO : Lcom/fasterxml/Zh/Zd;
    //   516: aastore
    //   517: dup
    //   518: iconst_4
    //   519: getstatic com/fasterxml/Zh/Zd.Untyped : Lcom/fasterxml/Zh/Zd;
    //   522: aastore
    //   523: dup
    //   524: iconst_5
    //   525: getstatic com/fasterxml/Zh/Zd.Integer : Lcom/fasterxml/Zh/Zd;
    //   528: aastore
    //   529: dup
    //   530: bipush #6
    //   532: getstatic com/fasterxml/Zh/Zd.Float : Lcom/fasterxml/Zh/Zd;
    //   535: aastore
    //   536: dup
    //   537: bipush #7
    //   539: getstatic com/fasterxml/Zh/Zd.Boolean : Lcom/fasterxml/Zh/Zd;
    //   542: aastore
    //   543: dup
    //   544: bipush #8
    //   546: getstatic com/fasterxml/Zh/Zd.Enum : Lcom/fasterxml/Zh/Zd;
    //   549: aastore
    //   550: dup
    //   551: bipush #9
    //   553: getstatic com/fasterxml/Zh/Zd.Textual : Lcom/fasterxml/Zh/Zd;
    //   556: aastore
    //   557: dup
    //   558: bipush #10
    //   560: getstatic com/fasterxml/Zh/Zd.Binary : Lcom/fasterxml/Zh/Zd;
    //   563: aastore
    //   564: dup
    //   565: bipush #11
    //   567: getstatic com/fasterxml/Zh/Zd.DateTime : Lcom/fasterxml/Zh/Zd;
    //   570: aastore
    //   571: dup
    //   572: bipush #12
    //   574: getstatic com/fasterxml/Zh/Zd.OtherScalar : Lcom/fasterxml/Zh/Zd;
    //   577: aastore
    //   578: putstatic com/fasterxml/Zh/Zd.ZC : [Lcom/fasterxml/Zh/Zd;
    //   581: return
  }
  
  public static void Zb(int[] paramArrayOfint) {
    ZL = paramArrayOfint;
  }
  
  public static int[] Zs() {
    return ZL;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zh\Zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */