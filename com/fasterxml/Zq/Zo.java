package com.fasterxml.Zq;

import com.fasterxml.Zb.Zh;
import com.fasterxml.Zb.Zi;

public enum Zo implements Zh {
  QUOTE_FIELD_NAMES, WRITE_NAN_AS_STRINGS, WRITE_NUMBERS_AS_STRINGS, ESCAPE_NON_ASCII, WRITE_HEX_UPPER_CASE, ESCAPE_FORWARD_SLASHES;
  
  private final boolean Zo;
  
  private final int ZC;
  
  private final Zi Zh;
  
  private static final Zo[] Zq;
  
  Zo(boolean paramBoolean, Zi paramZi) {
    this.Zo = paramBoolean;
    this.ZC = 1 << ordinal();
    this.Zh = paramZi;
  }
  
  public boolean ZP() {
    return this.Zo;
  }
  
  public int ZV() {
    return this.ZC;
  }
  
  public boolean ZR(int paramInt) {
    return ((paramInt & this.ZC) != 0);
  }
  
  public Zi Z_() {
    return this.Zh;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'hOx4KE,~Sn!]E1kOx.IIzNr!^_=yRc7OH&`N}!]R'lhOx4KE,jPs%\I=~Nn3ZH+qZbzNr!^_=qR?OI!vT'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #20
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #67
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
    //   68: ldc 'F`Vcm\\f^pU\\fy|ZpJ@gPcmRmFvbEjZ\\tuw'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #17
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #107
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
    //   146: if_icmpgt -> 248
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #124
    //   202: goto -> 232
    //   205: bipush #94
    //   207: goto -> 232
    //   210: bipush #114
    //   212: goto -> 232
    //   215: bipush #35
    //   217: goto -> 232
    //   220: bipush #77
    //   222: goto -> 232
    //   225: bipush #89
    //   227: goto -> 232
    //   230: bipush #33
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 153
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 149
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 99
    //   288: new com/fasterxml/Zq/Zo
    //   291: dup
    //   292: aload_0
    //   293: iconst_4
    //   294: aaload
    //   295: iconst_0
    //   296: iconst_1
    //   297: getstatic com/fasterxml/Zb/Zi.QUOTE_FIELD_NAMES : Lcom/fasterxml/Zb/Zi;
    //   300: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zi;)V
    //   303: putstatic com/fasterxml/Zq/Zo.QUOTE_FIELD_NAMES : Lcom/fasterxml/Zq/Zo;
    //   306: new com/fasterxml/Zq/Zo
    //   309: dup
    //   310: aload_0
    //   311: iconst_0
    //   312: aaload
    //   313: iconst_1
    //   314: iconst_1
    //   315: getstatic com/fasterxml/Zb/Zi.QUOTE_NON_NUMERIC_NUMBERS : Lcom/fasterxml/Zb/Zi;
    //   318: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zi;)V
    //   321: putstatic com/fasterxml/Zq/Zo.WRITE_NAN_AS_STRINGS : Lcom/fasterxml/Zq/Zo;
    //   324: new com/fasterxml/Zq/Zo
    //   327: dup
    //   328: aload_0
    //   329: iconst_2
    //   330: aaload
    //   331: iconst_2
    //   332: iconst_0
    //   333: getstatic com/fasterxml/Zb/Zi.WRITE_NUMBERS_AS_STRINGS : Lcom/fasterxml/Zb/Zi;
    //   336: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zi;)V
    //   339: putstatic com/fasterxml/Zq/Zo.WRITE_NUMBERS_AS_STRINGS : Lcom/fasterxml/Zq/Zo;
    //   342: new com/fasterxml/Zq/Zo
    //   345: dup
    //   346: aload_0
    //   347: iconst_3
    //   348: aaload
    //   349: iconst_3
    //   350: iconst_0
    //   351: getstatic com/fasterxml/Zb/Zi.ESCAPE_NON_ASCII : Lcom/fasterxml/Zb/Zi;
    //   354: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zi;)V
    //   357: putstatic com/fasterxml/Zq/Zo.ESCAPE_NON_ASCII : Lcom/fasterxml/Zq/Zo;
    //   360: new com/fasterxml/Zq/Zo
    //   363: dup
    //   364: aload_0
    //   365: iconst_5
    //   366: aaload
    //   367: iconst_4
    //   368: iconst_1
    //   369: getstatic com/fasterxml/Zb/Zi.WRITE_HEX_UPPER_CASE : Lcom/fasterxml/Zb/Zi;
    //   372: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zi;)V
    //   375: putstatic com/fasterxml/Zq/Zo.WRITE_HEX_UPPER_CASE : Lcom/fasterxml/Zq/Zo;
    //   378: new com/fasterxml/Zq/Zo
    //   381: dup
    //   382: aload_0
    //   383: iconst_1
    //   384: aaload
    //   385: iconst_5
    //   386: iconst_0
    //   387: getstatic com/fasterxml/Zb/Zi.ESCAPE_FORWARD_SLASHES : Lcom/fasterxml/Zb/Zi;
    //   390: invokespecial <init> : (Ljava/lang/String;IZLcom/fasterxml/Zb/Zi;)V
    //   393: putstatic com/fasterxml/Zq/Zo.ESCAPE_FORWARD_SLASHES : Lcom/fasterxml/Zq/Zo;
    //   396: bipush #6
    //   398: anewarray com/fasterxml/Zq/Zo
    //   401: dup
    //   402: iconst_0
    //   403: getstatic com/fasterxml/Zq/Zo.QUOTE_FIELD_NAMES : Lcom/fasterxml/Zq/Zo;
    //   406: aastore
    //   407: dup
    //   408: iconst_1
    //   409: getstatic com/fasterxml/Zq/Zo.WRITE_NAN_AS_STRINGS : Lcom/fasterxml/Zq/Zo;
    //   412: aastore
    //   413: dup
    //   414: iconst_2
    //   415: getstatic com/fasterxml/Zq/Zo.WRITE_NUMBERS_AS_STRINGS : Lcom/fasterxml/Zq/Zo;
    //   418: aastore
    //   419: dup
    //   420: iconst_3
    //   421: getstatic com/fasterxml/Zq/Zo.ESCAPE_NON_ASCII : Lcom/fasterxml/Zq/Zo;
    //   424: aastore
    //   425: dup
    //   426: iconst_4
    //   427: getstatic com/fasterxml/Zq/Zo.WRITE_HEX_UPPER_CASE : Lcom/fasterxml/Zq/Zo;
    //   430: aastore
    //   431: dup
    //   432: iconst_5
    //   433: getstatic com/fasterxml/Zq/Zo.ESCAPE_FORWARD_SLASHES : Lcom/fasterxml/Zq/Zo;
    //   436: aastore
    //   437: putstatic com/fasterxml/Zq/Zo.Zq : [Lcom/fasterxml/Zq/Zo;
    //   440: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq\Zo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */