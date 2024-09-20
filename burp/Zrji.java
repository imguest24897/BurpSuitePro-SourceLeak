package burp;

import java.util.Optional;
import net.portswigger.Zd4;
import net.portswigger.Zrmq;
import net.portswigger.Zv3;

public final class Zrji extends Record implements Zgpb {
  private final Ztzk Zr;
  
  private final String zwJ;
  
  private final Zrji zwz;
  
  public static final Zrji Zu;
  
  public static final Zrji Zd;
  
  public static final Zrji Zj;
  
  public static final Zrji Zt;
  
  public static final Zrji ZI;
  
  private static Zbqc[] ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrji(Ztzk paramZtzk, String paramString, Zrji paramZrji) {
    this.Zr = paramZtzk;
    this.zwJ = paramString;
    this.zwz = paramZrji;
  }
  
  public boolean ZwK() {
    try {
      if (this.Zr != Ztzk.SCALAR) {
        try {
          if (this.Zr == Ztzk.ENUM);
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  public boolean ZJ() {
    try {
      if (this.Zr != Ztzk.ENUM) {
        try {
          if (this.zwz != null)
            try {
              if (this.zwz.ZJ());
            } catch (MatchException matchException) {
              throw a(null);
            }  
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  public boolean ZwF() {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (this.Zr != Ztzk.NON_NULL);
  }
  
  public boolean Zwt() {
    try {
      if (this.Zr == Ztzk.SCALAR)
        try {
          if (!Zsvv.ZB.contains(this.zwJ));
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  public Optional<Zrji> Zwe() {
    try {
      if (this.Zr == Ztzk.LIST)
        return Optional.of(this.zwz); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (this.zwz != null)
        try {
          if (this.zwz.Zr == Ztzk.LIST)
            return Optional.of(this.zwz.Zwz()); 
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Optional.empty();
  }
  
  public Zrmq ZT() {
    return ZR(0);
  }
  
  public Zrmq ZR(int paramInt) {
    Zrmq zrmq = Zv3.ZU().Zg(a(29987, -27959), this.Zr.name()).Zg(a(29989, 8483), this.zwJ);
    try {
      if (paramInt < 3) {
        try {
        
        } catch (MatchException matchException) {
          throw a(null);
        } 
        zrmq.ZN(a(29992, 1432), (this.zwz == null) ? (Zd4)Zv3.ZE() : (Zd4)this.zwz.ZR(paramInt + 1));
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return zrmq;
  }
  
  public String toString() {
    try {
      switch (Zrpt.Zg[this.Zr.ordinal()]) {
        case 1:
        
        case 2:
        
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return this.zwJ;
  }
  
  public Zrji Zw() {
    try {
      if (this.zwz != null)
        return this.zwz.Zw(); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return this;
  }
  
  public Zsk1 ZM(Zsvv paramZsvv) {
    Zrji zrji = Zw();
    try {
      if (zrji.Zr != Ztzk.SCALAR)
        try {
          return (zrji.zwJ != null) ? paramZsvv.Ze(zrji.zwJ).orElseThrow() : null;
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return null;
  }
  
  public static Zrji Zs(Zrmq paramZrmq) {
    // Byte code:
    //   0: aload_0
    //   1: sipush #29990
    //   4: sipush #3466
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   15: invokeinterface ZW : ()Ljava/lang/String;
    //   20: invokestatic ZP : (Ljava/lang/String;)Lburp/Ztzk;
    //   23: astore_2
    //   24: invokestatic ZZ : ()[Lburp/Zbqc;
    //   27: aload_0
    //   28: sipush #29998
    //   31: sipush #-10294
    //   34: invokestatic a : (II)Ljava/lang/String;
    //   37: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   42: aconst_null
    //   43: invokeinterface ZV : (Ljava/lang/String;)Ljava/lang/String;
    //   48: astore_3
    //   49: astore_1
    //   50: aload_0
    //   51: sipush #29994
    //   54: sipush #17411
    //   57: invokestatic a : (II)Ljava/lang/String;
    //   60: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   65: astore #4
    //   67: getstatic burp/Zrpt.Zg : [I
    //   70: aload_2
    //   71: invokevirtual ordinal : ()I
    //   74: iaload
    //   75: tableswitch default -> 120, 1 -> 433, 2 -> 433, 3 -> 134, 4 -> 450, 5 -> 450, 6 -> 450, 7 -> 450, 8 -> 450
    //   120: new java/lang/MatchException
    //   123: dup
    //   124: aconst_null
    //   125: aconst_null
    //   126: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   129: athrow
    //   130: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   133: athrow
    //   134: aload_3
    //   135: astore #5
    //   137: iconst_m1
    //   138: istore #6
    //   140: aload #5
    //   142: invokevirtual hashCode : ()I
    //   145: lookupswitch default -> 347, -1808118735 -> 196, 2331 -> 227, 73679 -> 258, 67973692 -> 289, 1729365000 -> 320
    //   196: aload #5
    //   198: sipush #29999
    //   201: sipush #221
    //   204: invokestatic a : (II)Ljava/lang/String;
    //   207: invokevirtual equals : (Ljava/lang/Object;)Z
    //   210: ifeq -> 347
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   219: athrow
    //   220: iconst_0
    //   221: istore #6
    //   223: aload_1
    //   224: ifnonnull -> 347
    //   227: aload #5
    //   229: sipush #29993
    //   232: sipush #-25009
    //   235: invokestatic a : (II)Ljava/lang/String;
    //   238: invokevirtual equals : (Ljava/lang/Object;)Z
    //   241: ifeq -> 347
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   250: athrow
    //   251: iconst_1
    //   252: istore #6
    //   254: aload_1
    //   255: ifnonnull -> 347
    //   258: aload #5
    //   260: sipush #29991
    //   263: sipush #27829
    //   266: invokestatic a : (II)Ljava/lang/String;
    //   269: invokevirtual equals : (Ljava/lang/Object;)Z
    //   272: ifeq -> 347
    //   275: goto -> 282
    //   278: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   281: athrow
    //   282: iconst_2
    //   283: istore #6
    //   285: aload_1
    //   286: ifnonnull -> 347
    //   289: aload #5
    //   291: sipush #29996
    //   294: sipush #-10529
    //   297: invokestatic a : (II)Ljava/lang/String;
    //   300: invokevirtual equals : (Ljava/lang/Object;)Z
    //   303: ifeq -> 347
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   312: athrow
    //   313: iconst_3
    //   314: istore #6
    //   316: aload_1
    //   317: ifnonnull -> 347
    //   320: aload #5
    //   322: sipush #29985
    //   325: sipush #-23839
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: invokevirtual equals : (Ljava/lang/Object;)Z
    //   334: ifeq -> 347
    //   337: goto -> 344
    //   340: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   343: athrow
    //   344: iconst_4
    //   345: istore #6
    //   347: iload #6
    //   349: tableswitch default -> 418, 0 -> 384, 1 -> 394, 2 -> 400, 3 -> 406, 4 -> 412
    //   384: getstatic burp/Zrji.Zu : Lburp/Zrji;
    //   387: goto -> 430
    //   390: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   393: athrow
    //   394: getstatic burp/Zrji.Zd : Lburp/Zrji;
    //   397: goto -> 430
    //   400: getstatic burp/Zrji.Zt : Lburp/Zrji;
    //   403: goto -> 430
    //   406: getstatic burp/Zrji.Zj : Lburp/Zrji;
    //   409: goto -> 430
    //   412: getstatic burp/Zrji.ZI : Lburp/Zrji;
    //   415: goto -> 430
    //   418: new burp/Zrji
    //   421: dup
    //   422: getstatic burp/Ztzk.SCALAR : Lburp/Ztzk;
    //   425: aload_3
    //   426: aconst_null
    //   427: invokespecial <init> : (Lburp/Ztzk;Ljava/lang/String;Lburp/Zrji;)V
    //   430: goto -> 460
    //   433: new burp/Zrji
    //   436: dup
    //   437: aload_2
    //   438: aconst_null
    //   439: aload #4
    //   441: invokestatic Zs : (Lnet/portswigger/Zrmq;)Lburp/Zrji;
    //   444: invokespecial <init> : (Lburp/Ztzk;Ljava/lang/String;Lburp/Zrji;)V
    //   447: goto -> 460
    //   450: new burp/Zrji
    //   453: dup
    //   454: aload_2
    //   455: aload_3
    //   456: aconst_null
    //   457: invokespecial <init> : (Lburp/Ztzk;Ljava/lang/String;Lburp/Zrji;)V
    //   460: areturn
    // Exception table:
    //   from	to	target	type
    //   67	130	130	java/lang/MatchException
    //   140	213	216	java/lang/MatchException
    //   223	244	247	java/lang/MatchException
    //   254	275	278	java/lang/MatchException
    //   285	306	309	java/lang/MatchException
    //   316	337	340	java/lang/MatchException
    //   347	390	390	java/lang/MatchException
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zrji;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zrji;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZwJ() {
    return this.zwJ;
  }
  
  public Zrji Zwz() {
    return this.zwz;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_2
    //   8: anewarray burp/Zbqc
    //   11: iconst_0
    //   12: istore_3
    //   13: invokestatic Zq : ([Lburp/Zbqc;)V
    //   16: ldc '¥(b"P£Ý\\näC&'Ær#c£ÌÁ§HÒgEæ!«[wçå(¸s:gj+í¥!l¤bØ)}ÍVmÎÛ'
    //   18: dup
    //   19: astore_2
    //   20: invokevirtual length : ()I
    //   23: istore #4
    //   25: iconst_4
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #104
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc 'ØJßÝØÂ'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #6
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #60
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zrji.a : [Ljava/lang/String;
    //   138: bipush #16
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zrji.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #86
    //   222: goto -> 252
    //   225: bipush #90
    //   227: goto -> 252
    //   230: bipush #99
    //   232: goto -> 252
    //   235: bipush #105
    //   237: goto -> 252
    //   240: bipush #95
    //   242: goto -> 252
    //   245: bipush #29
    //   247: goto -> 252
    //   250: bipush #43
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 46, 0 -> 105
    //   308: new burp/Zrji
    //   311: dup
    //   312: getstatic burp/Ztzk.SCALAR : Lburp/Ztzk;
    //   315: sipush #29995
    //   318: sipush #5999
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: aconst_null
    //   325: invokespecial <init> : (Lburp/Ztzk;Ljava/lang/String;Lburp/Zrji;)V
    //   328: putstatic burp/Zrji.Zu : Lburp/Zrji;
    //   331: new burp/Zrji
    //   334: dup
    //   335: getstatic burp/Ztzk.SCALAR : Lburp/Ztzk;
    //   338: sipush #29984
    //   341: sipush #-9354
    //   344: invokestatic a : (II)Ljava/lang/String;
    //   347: aconst_null
    //   348: invokespecial <init> : (Lburp/Ztzk;Ljava/lang/String;Lburp/Zrji;)V
    //   351: putstatic burp/Zrji.Zd : Lburp/Zrji;
    //   354: new burp/Zrji
    //   357: dup
    //   358: getstatic burp/Ztzk.SCALAR : Lburp/Ztzk;
    //   361: sipush #29986
    //   364: sipush #-10139
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: aconst_null
    //   371: invokespecial <init> : (Lburp/Ztzk;Ljava/lang/String;Lburp/Zrji;)V
    //   374: putstatic burp/Zrji.Zj : Lburp/Zrji;
    //   377: new burp/Zrji
    //   380: dup
    //   381: getstatic burp/Ztzk.SCALAR : Lburp/Ztzk;
    //   384: sipush #29997
    //   387: sipush #5996
    //   390: invokestatic a : (II)Ljava/lang/String;
    //   393: aconst_null
    //   394: invokespecial <init> : (Lburp/Ztzk;Ljava/lang/String;Lburp/Zrji;)V
    //   397: putstatic burp/Zrji.Zt : Lburp/Zrji;
    //   400: new burp/Zrji
    //   403: dup
    //   404: getstatic burp/Ztzk.SCALAR : Lburp/Ztzk;
    //   407: sipush #29988
    //   410: sipush #-15289
    //   413: invokestatic a : (II)Ljava/lang/String;
    //   416: aconst_null
    //   417: invokespecial <init> : (Lburp/Ztzk;Ljava/lang/String;Lburp/Zrji;)V
    //   420: putstatic burp/Zrji.ZI : Lburp/Zrji;
    //   423: return
  }
  
  public static void Zq(Zbqc[] paramArrayOfZbqc) {
    ZF = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZZ() {
    return ZF;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7526) & 0xFFFF;
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
      byte b1 = 53;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrji.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */