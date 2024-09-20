package com.fasterxml.Zb;

public enum Zma {
  UTF8, UTF16_BE, UTF16_LE, UTF32_BE, UTF32_LE;
  
  private final String ZS;
  
  private final boolean Zc;
  
  private final int Zf;
  
  Zma(String paramString1, boolean paramBoolean, int paramInt1) {
    this.ZS = paramString1;
    this.Zc = paramBoolean;
    this.Zf = paramInt1;
  }
  
  public String Zz() {
    return this.ZS;
  }
  
  public boolean Zj() {
    return this.Zc;
  }
  
  public int ZC() {
    return this.Zf;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'M!<RDHu]M!<[\\bM!<NA%{]\\bM!<NA%u]M!<NJ\\bM!<RDH{]\\bM!<P@Hu]\\bM!<P@H{]'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #8
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #20
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 130
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc 'zytLj\\bzytBj'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #8
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #35
    //   84: iinc #1, 1
    //   87: aload_3
    //   88: iload_1
    //   89: dup
    //   90: iload_2
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 130
    //   99: aload_0
    //   100: swap
    //   101: iload #4
    //   103: iinc #4, 1
    //   106: swap
    //   107: aastore
    //   108: iload_1
    //   109: iload_2
    //   110: iadd
    //   111: dup
    //   112: istore_1
    //   113: iload #5
    //   115: if_icmpge -> 127
    //   118: aload_3
    //   119: iload_1
    //   120: invokevirtual charAt : (I)C
    //   123: istore_2
    //   124: goto -> 82
    //   127: goto -> 288
    //   130: dup_x2
    //   131: pop
    //   132: invokevirtual toCharArray : ()[C
    //   135: dup_x1
    //   136: arraylength
    //   137: dup_x2
    //   138: pop
    //   139: iconst_0
    //   140: istore #6
    //   142: dup2_x1
    //   143: pop2
    //   144: dup_x2
    //   145: iconst_1
    //   146: if_icmpgt -> 247
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 229, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #12
    //   202: goto -> 231
    //   205: bipush #97
    //   207: goto -> 231
    //   210: bipush #110
    //   212: goto -> 231
    //   215: bipush #119
    //   217: goto -> 231
    //   220: bipush #102
    //   222: goto -> 231
    //   225: iconst_3
    //   226: goto -> 231
    //   229: bipush #45
    //   231: ixor
    //   232: ixor
    //   233: i2c
    //   234: castore
    //   235: iinc #6, 1
    //   238: dup
    //   239: ifne -> 247
    //   242: dup2
    //   243: dup_x1
    //   244: goto -> 153
    //   247: dup2_x1
    //   248: pop2
    //   249: dup_x2
    //   250: iload #6
    //   252: if_icmpgt -> 149
    //   255: pop
    //   256: new java/lang/String
    //   259: dup_x1
    //   260: swap
    //   261: invokespecial <init> : ([C)V
    //   264: invokevirtual intern : ()Ljava/lang/String;
    //   267: swap
    //   268: pop
    //   269: swap
    //   270: tableswitch default -> 40, 0 -> 99
    //   288: new com/fasterxml/Zb/Zma
    //   291: dup
    //   292: aload_0
    //   293: iconst_1
    //   294: aaload
    //   295: iconst_0
    //   296: aload_0
    //   297: iconst_4
    //   298: aaload
    //   299: iconst_0
    //   300: bipush #8
    //   302: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;ZI)V
    //   305: putstatic com/fasterxml/Zb/Zma.UTF8 : Lcom/fasterxml/Zb/Zma;
    //   308: new com/fasterxml/Zb/Zma
    //   311: dup
    //   312: aload_0
    //   313: iconst_5
    //   314: aaload
    //   315: iconst_1
    //   316: aload_0
    //   317: bipush #8
    //   319: aaload
    //   320: iconst_1
    //   321: bipush #16
    //   323: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;ZI)V
    //   326: putstatic com/fasterxml/Zb/Zma.UTF16_BE : Lcom/fasterxml/Zb/Zma;
    //   329: new com/fasterxml/Zb/Zma
    //   332: dup
    //   333: aload_0
    //   334: iconst_0
    //   335: aaload
    //   336: iconst_2
    //   337: aload_0
    //   338: bipush #9
    //   340: aaload
    //   341: iconst_0
    //   342: bipush #16
    //   344: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;ZI)V
    //   347: putstatic com/fasterxml/Zb/Zma.UTF16_LE : Lcom/fasterxml/Zb/Zma;
    //   350: new com/fasterxml/Zb/Zma
    //   353: dup
    //   354: aload_0
    //   355: bipush #7
    //   357: aaload
    //   358: iconst_3
    //   359: aload_0
    //   360: iconst_2
    //   361: aaload
    //   362: iconst_1
    //   363: bipush #32
    //   365: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;ZI)V
    //   368: putstatic com/fasterxml/Zb/Zma.UTF32_BE : Lcom/fasterxml/Zb/Zma;
    //   371: new com/fasterxml/Zb/Zma
    //   374: dup
    //   375: aload_0
    //   376: bipush #6
    //   378: aaload
    //   379: iconst_4
    //   380: aload_0
    //   381: iconst_3
    //   382: aaload
    //   383: iconst_0
    //   384: bipush #32
    //   386: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;ZI)V
    //   389: putstatic com/fasterxml/Zb/Zma.UTF32_LE : Lcom/fasterxml/Zb/Zma;
    //   392: iconst_5
    //   393: anewarray com/fasterxml/Zb/Zma
    //   396: dup
    //   397: iconst_0
    //   398: getstatic com/fasterxml/Zb/Zma.UTF8 : Lcom/fasterxml/Zb/Zma;
    //   401: aastore
    //   402: dup
    //   403: iconst_1
    //   404: getstatic com/fasterxml/Zb/Zma.UTF16_BE : Lcom/fasterxml/Zb/Zma;
    //   407: aastore
    //   408: dup
    //   409: iconst_2
    //   410: getstatic com/fasterxml/Zb/Zma.UTF16_LE : Lcom/fasterxml/Zb/Zma;
    //   413: aastore
    //   414: dup
    //   415: iconst_3
    //   416: getstatic com/fasterxml/Zb/Zma.UTF32_BE : Lcom/fasterxml/Zb/Zma;
    //   419: aastore
    //   420: dup
    //   421: iconst_4
    //   422: getstatic com/fasterxml/Zb/Zma.UTF32_LE : Lcom/fasterxml/Zb/Zma;
    //   425: aastore
    //   426: putstatic com/fasterxml/Zb/Zma.ZX : [Lcom/fasterxml/Zb/Zma;
    //   429: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zma.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */