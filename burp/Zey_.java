package burp;

import java.io.IOException;
import java.io.Reader;
import javax.swing.text.Segment;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zey_ extends Zeyj {
  private static final char[] ZV;
  
  private static final int[] ZH;
  
  private static final int[] ZT;
  
  private static final int[] Zx;
  
  private static final String[] Zs;
  
  private static final int[] Zg;
  
  private Reader ZE;
  
  private int ZR;
  
  private int Zl = 0;
  
  private char[] Zc;
  
  private int Zw;
  
  private int Zi;
  
  private int ZF;
  
  private int Zv;
  
  private boolean Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private static int[] Zq() {
    int[] arrayOfInt = new int[21];
    int i = 0;
    i = Z_(a(8646, 25756), i, arrayOfInt);
    return arrayOfInt;
  }
  
  private static int Z_(String paramString, int paramInt, int[] paramArrayOfint) {
    byte b = 0;
    int i = paramInt;
    int j = paramString.length();
    label12: while (b < j) {
      char c1 = paramString.charAt(b++);
      char c2 = paramString.charAt(b++);
      try {
        while (true) {
          paramArrayOfint[i++] = c2;
          if (--c1 <= '\000')
            continue label12; 
        } 
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        throw a(null);
      } 
    } 
    return i;
  }
  
  private static int[] ZQ() {
    int[] arrayOfInt = new int[21];
    int i = 0;
    i = Zp(a(8643, 19238), i, arrayOfInt);
    return arrayOfInt;
  }
  
  private static int Zp(String paramString, int paramInt, int[] paramArrayOfint) {
    byte b = 0;
    int i = paramInt;
    int j = paramString.length();
    while (b < j) {
      int k = paramString.charAt(b++) << 16;
      paramArrayOfint[i++] = k | paramString.charAt(b++);
    } 
    return i;
  }
  
  private static int[] ZK() {
    int[] arrayOfInt = new int[342];
    int i = 0;
    i = ZG(a(8644, 31194), i, arrayOfInt);
    return arrayOfInt;
  }
  
  private static int ZG(String paramString, int paramInt, int[] paramArrayOfint) {
    byte b = 0;
    int i = paramInt;
    int j = paramString.length();
    label12: while (b < j) {
      char c1 = paramString.charAt(b++);
      char c2 = paramString.charAt(b++);
      c2--;
      try {
        while (true) {
          paramArrayOfint[i++] = c2;
          if (--c1 <= '\000')
            continue label12; 
        } 
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        throw a(null);
      } 
    } 
    return i;
  }
  
  private static int[] Zc() {
    int[] arrayOfInt = new int[21];
    int i = 0;
    i = Zd(a(8640, 1845), i, arrayOfInt);
    return arrayOfInt;
  }
  
  private static int Zd(String paramString, int paramInt, int[] paramArrayOfint) {
    byte b = 0;
    int i = paramInt;
    int j = paramString.length();
    label12: while (b < j) {
      char c1 = paramString.charAt(b++);
      char c2 = paramString.charAt(b++);
      try {
        while (true) {
          paramArrayOfint[i++] = c2;
          if (--c1 <= '\000')
            continue label12; 
        } 
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        throw a(null);
      } 
    } 
    return i;
  }
  
  private void ZN(int paramInt) {
    int i = this.ZF + this.ZM;
    Zq(this.Zc, this.ZF, this.Zw - 1, paramInt, i);
    this.ZF = this.Zw;
  }
  
  public boolean Zh() {
    return true;
  }
  
  public Ze7g Z_(int paramInt1, Segment paramSegment, Zska paramZska, int paramInt2) {
    ZS();
    this.ZM = -paramSegment.offset + paramInt2;
    this.ZC = paramSegment;
    try {
      Zf(this.ZE);
      Zc(0);
      return Zu();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
      return new Ze7g();
    } 
  }
  
  private boolean ZE() {
    try {
    
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    return (this.Zi >= this.ZC.offset + this.ZC.count);
  }
  
  public final void Zf(Reader paramReader) {
    this.Zc = this.ZC.array;
    this.ZF = this.ZC.offset;
    this.Zv = this.ZF + this.ZC.count - 1;
    this.Zi = this.Zw = this.ZC.offset;
    this.Zl = 0;
    this.ZE = paramReader;
    this.Zm = false;
  }
  
  private static char[] Zf(String paramString) {
    char[] arrayOfChar = new char[65536];
    byte b1 = 0;
    byte b2 = 0;
    label12: while (b1 < 94) {
      char c1 = paramString.charAt(b1++);
      char c2 = paramString.charAt(b1++);
      try {
        while (true) {
          arrayOfChar[b2++] = c2;
          if (--c1 <= '\000')
            continue label12; 
        } 
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        throw a(null);
      } 
    } 
    return arrayOfChar;
  }
  
  public final void Zc(int paramInt) {
    this.Zl = paramInt;
  }
  
  private void Zo(int paramInt) {
    String str;
    try {
      str = Zs[paramInt];
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      Zah.Zl(arrayIndexOutOfBoundsException, Zk_.UNEXPECTED);
      str = Zs[0];
    } 
    throw new Error(str);
  }
  
  public Ze7g Zu() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : I
    //   4: istore #6
    //   6: invokestatic Zd : ()Ljava/lang/String;
    //   9: aload_0
    //   10: getfield Zc : [C
    //   13: astore #7
    //   15: getstatic burp/Zey_.ZV : [C
    //   18: astore #8
    //   20: getstatic burp/Zey_.Zx : [I
    //   23: astore #9
    //   25: astore_1
    //   26: getstatic burp/Zey_.ZT : [I
    //   29: astore #10
    //   31: getstatic burp/Zey_.Zg : [I
    //   34: astore #11
    //   36: aload_0
    //   37: getfield Zw : I
    //   40: istore #5
    //   42: iconst_m1
    //   43: istore_3
    //   44: aload_0
    //   45: aload_0
    //   46: iload #5
    //   48: dup_x1
    //   49: putfield ZF : I
    //   52: dup_x1
    //   53: putfield Zi : I
    //   56: istore #4
    //   58: aload_0
    //   59: aload_0
    //   60: getfield Zl : I
    //   63: putfield ZR : I
    //   66: iload #4
    //   68: iload #6
    //   70: if_icmpge -> 86
    //   73: aload #7
    //   75: iload #4
    //   77: iinc #4, 1
    //   80: caload
    //   81: istore_2
    //   82: aload_1
    //   83: ifnonnull -> 168
    //   86: aload_0
    //   87: getfield Zm : Z
    //   90: ifeq -> 106
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: iconst_m1
    //   101: istore_2
    //   102: aload_1
    //   103: ifnonnull -> 251
    //   106: aload_0
    //   107: iload #4
    //   109: putfield Zi : I
    //   112: aload_0
    //   113: iload #5
    //   115: putfield Zw : I
    //   118: aload_0
    //   119: invokevirtual ZE : ()Z
    //   122: istore #12
    //   124: aload_0
    //   125: getfield Zi : I
    //   128: istore #4
    //   130: aload_0
    //   131: getfield Zw : I
    //   134: istore #5
    //   136: aload_0
    //   137: getfield Zc : [C
    //   140: astore #7
    //   142: aload_0
    //   143: getfield Zv : I
    //   146: istore #6
    //   148: iload #12
    //   150: ifeq -> 159
    //   153: iconst_m1
    //   154: istore_2
    //   155: aload_1
    //   156: ifnonnull -> 251
    //   159: aload #7
    //   161: iload #4
    //   163: iinc #4, 1
    //   166: caload
    //   167: istore_2
    //   168: aload #9
    //   170: aload #10
    //   172: aload_0
    //   173: getfield ZR : I
    //   176: iaload
    //   177: aload #8
    //   179: iload_2
    //   180: caload
    //   181: iadd
    //   182: iaload
    //   183: istore #12
    //   185: iload #12
    //   187: iconst_m1
    //   188: if_icmpne -> 198
    //   191: goto -> 251
    //   194: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   197: athrow
    //   198: aload_0
    //   199: iload #12
    //   201: putfield ZR : I
    //   204: aload #11
    //   206: aload_0
    //   207: getfield ZR : I
    //   210: iaload
    //   211: istore #13
    //   213: iload #13
    //   215: iconst_1
    //   216: iand
    //   217: iconst_1
    //   218: if_icmpne -> 247
    //   221: aload_0
    //   222: getfield ZR : I
    //   225: istore_3
    //   226: iload #4
    //   228: istore #5
    //   230: iload #13
    //   232: bipush #8
    //   234: iand
    //   235: bipush #8
    //   237: if_icmpne -> 247
    //   240: goto -> 251
    //   243: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   246: athrow
    //   247: aload_1
    //   248: ifnonnull -> 66
    //   251: aload_0
    //   252: iload #5
    //   254: putfield Zw : I
    //   257: iload_3
    //   258: ifge -> 269
    //   261: iload_3
    //   262: goto -> 274
    //   265: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   268: athrow
    //   269: getstatic burp/Zey_.ZH : [I
    //   272: iload_3
    //   273: iaload
    //   274: tableswitch default -> 371, 1 -> 361, 2 -> 337, 3 -> 320, 4 -> 351, 5 -> 333, 6 -> 347, 7 -> 357, 8 -> 367
    //   320: aload_0
    //   321: bipush #22
    //   323: invokevirtual ZN : (I)V
    //   326: goto -> 333
    //   329: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   332: athrow
    //   333: aload_1
    //   334: ifnonnull -> 36
    //   337: aload_0
    //   338: invokevirtual Zf : ()Lburp/Zska;
    //   341: pop
    //   342: aload_0
    //   343: getfield Zz : Lburp/Ze7g;
    //   346: areturn
    //   347: aload_1
    //   348: ifnonnull -> 36
    //   351: aload_0
    //   352: bipush #21
    //   354: invokevirtual ZN : (I)V
    //   357: aload_1
    //   358: ifnonnull -> 36
    //   361: aload_0
    //   362: bipush #21
    //   364: invokevirtual ZN : (I)V
    //   367: aload_1
    //   368: ifnonnull -> 36
    //   371: iload_2
    //   372: iconst_m1
    //   373: if_icmpne -> 452
    //   376: aload_0
    //   377: getfield ZF : I
    //   380: aload_0
    //   381: getfield Zi : I
    //   384: if_icmpne -> 452
    //   387: goto -> 394
    //   390: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   393: athrow
    //   394: aload_0
    //   395: iconst_1
    //   396: putfield Zm : Z
    //   399: aload_0
    //   400: getfield Zl : I
    //   403: lookupswitch default -> 450, 0 -> 432, 22 -> 446
    //   428: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   431: athrow
    //   432: aload_0
    //   433: invokevirtual Zf : ()Lburp/Zska;
    //   436: pop
    //   437: aload_0
    //   438: getfield Zz : Lburp/Ze7g;
    //   441: areturn
    //   442: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   445: athrow
    //   446: aload_1
    //   447: ifnonnull -> 36
    //   450: aconst_null
    //   451: areturn
    //   452: aload_0
    //   453: iconst_1
    //   454: invokevirtual Zo : (I)V
    //   457: goto -> 36
    // Exception table:
    //   from	to	target	type
    //   82	93	96	java/io/IOException
    //   185	194	194	java/io/IOException
    //   230	243	243	java/io/IOException
    //   251	265	265	java/io/IOException
    //   274	326	329	java/io/IOException
    //   371	387	390	java/io/IOException
    //   376	428	428	java/io/IOException
    //   394	442	442	java/io/IOException
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '2óí/MÅ<k&F½#%¯±­ÆM\\bx,oSǹłÆǫyǞVǕ#í`þ/\\t\å3®¨ì¡'ñ yA[A@ØCåx\\b×ZKÀ=·2æ> ¹Ê«§j°R²*æN¬Õ ³¦øm¡Âm©^*lÙ/ýÕo[²SaÿLZ_YÅ~ØþäP/5%ãµ&BX,6\\fwÓoí´É!­;1Úö¢kÇìÇl)4²§ '»2éÇí¢E\\f'3>pQ［¯Üc;¼=GtPY'½Çé'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #42
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #16
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'Él>¥ó­Úi`Ó ÍæzÿwÔÕ/¤·Îùö¶¶)7Ã¤¢ÑúúZ[)Û!ÿ`´j²±Pu\\tCv!å@ù+î`goÚÓÔ_¬6lÀÉ:4iI` z.¡¨p\\r´çÚ'x§ñÎ8¶¶Ø4'ÂÇ¨¹ØwÔi­k:KCJ+9`\\f\\n¥LÐØÍ>ÝvX¨Ïv~ö¿óÂ=/¢*RI-~Ë \sÈ<âi:í$¾¢è"`3\\t©'vç#«\\nd%ÏîuÔkùË?Â¡tQ&LêjwÂËO9ØS~Â©Vóa>¬ÑÕ)É rTMÍìDÛú0»u¯²å2_t¸'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #28
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #7
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zey_.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zey_.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_4
    //   213: goto -> 243
    //   216: bipush #78
    //   218: goto -> 243
    //   221: bipush #39
    //   223: goto -> 243
    //   226: bipush #122
    //   228: goto -> 243
    //   231: bipush #101
    //   233: goto -> 243
    //   236: bipush #36
    //   238: goto -> 243
    //   241: bipush #78
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: sipush #8647
    //   303: sipush #-4879
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokestatic Zf : (Ljava/lang/String;)[C
    //   312: putstatic burp/Zey_.ZV : [C
    //   315: invokestatic Zq : ()[I
    //   318: putstatic burp/Zey_.ZH : [I
    //   321: invokestatic ZQ : ()[I
    //   324: putstatic burp/Zey_.ZT : [I
    //   327: invokestatic ZK : ()[I
    //   330: putstatic burp/Zey_.Zx : [I
    //   333: iconst_3
    //   334: anewarray java/lang/String
    //   337: dup
    //   338: iconst_0
    //   339: sipush #8641
    //   342: sipush #245
    //   345: invokestatic a : (II)Ljava/lang/String;
    //   348: aastore
    //   349: dup
    //   350: iconst_1
    //   351: sipush #8645
    //   354: sipush #18224
    //   357: invokestatic a : (II)Ljava/lang/String;
    //   360: aastore
    //   361: dup
    //   362: iconst_2
    //   363: sipush #8642
    //   366: sipush #10906
    //   369: invokestatic a : (II)Ljava/lang/String;
    //   372: aastore
    //   373: putstatic burp/Zey_.Zs : [Ljava/lang/String;
    //   376: invokestatic Zc : ()[I
    //   379: putstatic burp/Zey_.Zg : [I
    //   382: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x21C3) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 25;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zey_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */