package burp;

import java.util.Optional;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

public class Ztnl {
  public static final Zmk7<Zb2e> Zl;
  
  public static final Zmk7<Zb2e> ZR;
  
  public static final Zmk7<Zb2e> Zo;
  
  public static final Zmk7<Zb2e> ZM;
  
  public static final Zmk7<Zb2e> Zn;
  
  public static final Zmk7<Zb2e> Zt;
  
  public static final Zmk7<Zb2e> ZJ;
  
  public static final Zmk7<Zb2e> Zm;
  
  public static final Zmk7<Zb2e> ZI;
  
  public static final Zmk7<Zb2e> ZK;
  
  public static final Zmk7<Zb2e> Ze;
  
  public static final Zmk7<Zb2e> Zd;
  
  public static final Zmk7<Zb2e> Zi;
  
  public static final Zmk7<Zb2e> Zz;
  
  public static final Zmk7<Zb2e> ZF;
  
  public static final Zmk7<Zb2e> Zv;
  
  public static final Zmk7<Zb2e> ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private static Zz_2<Zb2e> Zn() {
    return Zmk7.<Zb2e>Zh(Zb2e::ZBQ).ZL(a(-10218, 32667)).Zg(Ztu5.LONG.clazz).ZZ(20).ZM(new Zmqw());
  }
  
  private static Zz_2<Zb2e> ZJ() {
    return Zmk7.<Zb2e>Zh(Ztnl::lambda$issueTypeColumn$6).ZL(a(-10217, 546)).Zg(Ztu5.OBJECT.clazz).ZZ(40).Zh(new Zstn()).ZM(new Zm2u());
  }
  
  private static Zz_2<Zb2e> Zz() {
    return Zmk7.<Zb2e>Zh(Ztnl::lambda$hostColumn$7).ZL(a(-10212, -30973)).Zg(Ztu5.OBJECT.clazz).ZZ(20).Zh(new Ztwu()).ZM(new Zmq1());
  }
  
  private static Zz_2<Zb2e> ZA() {
    return Zmk7.<Zb2e>Zh(Ztnl::lambda$severityColumn$8).ZL(a(-10221, -8417)).Zg(Ztu5.INTEGER.clazz).ZZ(15).ZM(new Zmqr());
  }
  
  private static Zz_2<Zb2e> ZI() {
    return Zmk7.<Zb2e>Zh(Ztnl::lambda$confidenceColumn$9).ZL(a(-10210, 7539)).Zg(Ztu5.INTEGER.clazz).ZZ(15).ZM(new Zmqg());
  }
  
  private static Object lambda$confidenceColumn$9(Zb2e paramZb2e) {
    return Integer.valueOf(paramZb2e.ZBf().Zac());
  }
  
  private static Object lambda$severityColumn$8(Zb2e paramZb2e) {
    return Integer.valueOf(paramZb2e.ZBf().ZaJ());
  }
  
  private static Object lambda$hostColumn$7(Zb2e paramZb2e) {
    return paramZb2e.ZBf().ZaB();
  }
  
  private static Object lambda$issueTypeColumn$6(Zb2e paramZb2e) {
    return new Zlk8(Ztvx.ZO(paramZb2e.ZBf().ZaJ(), paramZb2e.ZBf().Zac(), false), Zrf1.Za.ZK(paramZb2e.ZBf()).ZZV());
  }
  
  private static void lambda$static$5(Zb2e paramZb2e, Object paramObject) {
    paramZb2e.Zxg((String)paramObject);
    Zm2.ZC(Zrrh.SCANNER_ISSUE_ACTIVITY_ADD_COMMENT);
  }
  
  private static Object lambda$static$4(Zb2e paramZb2e) {
    return Optional.<Zrdb>of(paramZb2e.ZBf()).map(Zrdb::Zaq).map(Zg2x::ZG).orElse("");
  }
  
  private static Object lambda$static$3(Zb2e paramZb2e) {
    return Zkb.ZG(paramZb2e.ZBf().Zax());
  }
  
  private static Object lambda$static$2(Zb2e paramZb2e) {
    return (paramZb2e.ZBb()).title;
  }
  
  private static Object lambda$static$1(Zb2e paramZb2e) {
    int i = paramZb2e.ZBG();
    return (i == -2) ? a(-10209, -6056) : ((i == -1) ? null : (a(-10220, -2539) + a(-10220, -2539)));
  }
  
  private static void lambda$static$0(Zb2e paramZb2e, Object paramObject) {
    byte b = ((Byte)paramObject).byteValue();
    paramZb2e.ZB(b);
    Zlxk.ZS = paramZb2e.ZaP();
    Zm2.Zi(Zv8r.SCANNER_ISSUE_ACTIVITY_HIGHLIGHT, b);
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'óÛ\\nã¿ðÛF¸rk\\bnkê!Óèi)ÓI\\b~P\\nB¤l<ÖÓ×¹ù@°3\\bMÃËgÍ~\\n³ãïâÃ§Q§³ëm9'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #104
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'õ!t³(Ñ±«ò§'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #97
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Ztnl.a : [Ljava/lang/String;
    //   130: bipush #12
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Ztnl.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #53
    //   214: goto -> 244
    //   217: bipush #66
    //   219: goto -> 244
    //   222: bipush #19
    //   224: goto -> 244
    //   227: bipush #100
    //   229: goto -> 244
    //   232: bipush #83
    //   234: goto -> 244
    //   237: bipush #74
    //   239: goto -> 244
    //   242: bipush #113
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   305: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   308: ldc '#'
    //   310: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   313: getstatic burp/Ztu5.INTEGER : Lburp/Ztu5;
    //   316: getfield clazz : Ljava/lang/Class;
    //   319: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   322: bipush #7
    //   324: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   327: <illegal opcode> ZG : ()Lburp/Zzbi;
    //   332: invokevirtual ZR : (Lburp/Zzbi;)Lburp/Zz_2;
    //   335: new burp/Zlxk
    //   338: dup
    //   339: invokespecial <init> : ()V
    //   342: invokevirtual Zb : ()Ljavax/swing/table/TableCellEditor;
    //   345: invokevirtual ZE : (Ljavax/swing/table/TableCellEditor;)Lburp/Zz_2;
    //   348: invokevirtual ZH : ()Lburp/Zmk7;
    //   351: putstatic burp/Ztnl.Zl : Lburp/Zmk7;
    //   354: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   359: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   362: sipush #-10211
    //   365: sipush #-20671
    //   368: invokestatic a : (II)Ljava/lang/String;
    //   371: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   374: getstatic burp/Ztu5.STRING : Lburp/Ztu5;
    //   377: getfield clazz : Ljava/lang/Class;
    //   380: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   383: bipush #10
    //   385: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   388: invokevirtual ZH : ()Lburp/Zmk7;
    //   391: putstatic burp/Ztnl.ZR : Lburp/Zmk7;
    //   394: invokestatic Zn : ()Lburp/Zz_2;
    //   397: invokevirtual ZH : ()Lburp/Zmk7;
    //   400: putstatic burp/Ztnl.Zo : Lburp/Zmk7;
    //   403: invokestatic Zn : ()Lburp/Zz_2;
    //   406: getstatic javax/swing/SortOrder.DESCENDING : Ljavax/swing/SortOrder;
    //   409: invokevirtual ZV : (Ljavax/swing/SortOrder;)Lburp/Zz_2;
    //   412: invokevirtual ZH : ()Lburp/Zmk7;
    //   415: putstatic burp/Ztnl.ZM : Lburp/Zmk7;
    //   418: invokestatic Zn : ()Lburp/Zz_2;
    //   421: iconst_0
    //   422: invokevirtual Zx : (Z)Lburp/Zz_2;
    //   425: iconst_0
    //   426: invokevirtual ZK : (Z)Lburp/Zz_2;
    //   429: invokevirtual ZH : ()Lburp/Zmk7;
    //   432: putstatic burp/Ztnl.Zn : Lburp/Zmk7;
    //   435: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   440: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   443: sipush #-10219
    //   446: sipush #17361
    //   449: invokestatic a : (II)Ljava/lang/String;
    //   452: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   455: getstatic burp/Ztu5.STRING : Lburp/Ztu5;
    //   458: getfield clazz : Ljava/lang/Class;
    //   461: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   464: bipush #15
    //   466: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   469: invokevirtual ZH : ()Lburp/Zmk7;
    //   472: putstatic burp/Ztnl.Zt : Lburp/Zmk7;
    //   475: invokestatic ZJ : ()Lburp/Zz_2;
    //   478: invokevirtual ZH : ()Lburp/Zmk7;
    //   481: putstatic burp/Ztnl.ZJ : Lburp/Zmk7;
    //   484: invokestatic ZJ : ()Lburp/Zz_2;
    //   487: iconst_0
    //   488: invokevirtual Zx : (Z)Lburp/Zz_2;
    //   491: iconst_0
    //   492: invokevirtual ZK : (Z)Lburp/Zz_2;
    //   495: invokevirtual ZH : ()Lburp/Zmk7;
    //   498: putstatic burp/Ztnl.Zm : Lburp/Zmk7;
    //   501: invokestatic Zz : ()Lburp/Zz_2;
    //   504: invokevirtual ZH : ()Lburp/Zmk7;
    //   507: putstatic burp/Ztnl.ZI : Lburp/Zmk7;
    //   510: invokestatic Zz : ()Lburp/Zz_2;
    //   513: iconst_0
    //   514: invokevirtual Zx : (Z)Lburp/Zz_2;
    //   517: iconst_0
    //   518: invokevirtual ZK : (Z)Lburp/Zz_2;
    //   521: invokevirtual ZH : ()Lburp/Zmk7;
    //   524: putstatic burp/Ztnl.ZK : Lburp/Zmk7;
    //   527: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   532: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   535: sipush #-10222
    //   538: sipush #-10279
    //   541: invokestatic a : (II)Ljava/lang/String;
    //   544: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   547: getstatic burp/Ztu5.STRING : Lburp/Ztu5;
    //   550: getfield clazz : Ljava/lang/Class;
    //   553: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   556: bipush #40
    //   558: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   561: invokevirtual ZH : ()Lburp/Zmk7;
    //   564: putstatic burp/Ztnl.Ze : Lburp/Zmk7;
    //   567: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   572: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   575: sipush #-10223
    //   578: sipush #-7892
    //   581: invokestatic a : (II)Ljava/lang/String;
    //   584: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   587: getstatic burp/Ztu5.STRING : Lburp/Ztu5;
    //   590: getfield clazz : Ljava/lang/Class;
    //   593: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   596: bipush #20
    //   598: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   601: invokevirtual ZH : ()Lburp/Zmk7;
    //   604: putstatic burp/Ztnl.Zd : Lburp/Zmk7;
    //   607: invokestatic ZA : ()Lburp/Zz_2;
    //   610: invokevirtual ZH : ()Lburp/Zmk7;
    //   613: putstatic burp/Ztnl.Zi : Lburp/Zmk7;
    //   616: invokestatic ZA : ()Lburp/Zz_2;
    //   619: getstatic javax/swing/SortOrder.DESCENDING : Ljavax/swing/SortOrder;
    //   622: invokevirtual ZV : (Ljavax/swing/SortOrder;)Lburp/Zz_2;
    //   625: getstatic burp/Zlcu.PRIMARY : Lburp/Zlcu;
    //   628: invokevirtual ZA : (Lburp/Zlcu;)Lburp/Zz_2;
    //   631: invokevirtual ZH : ()Lburp/Zmk7;
    //   634: putstatic burp/Ztnl.Zz : Lburp/Zmk7;
    //   637: invokestatic ZI : ()Lburp/Zz_2;
    //   640: invokevirtual ZH : ()Lburp/Zmk7;
    //   643: putstatic burp/Ztnl.ZF : Lburp/Zmk7;
    //   646: invokestatic ZI : ()Lburp/Zz_2;
    //   649: getstatic javax/swing/SortOrder.DESCENDING : Ljavax/swing/SortOrder;
    //   652: invokevirtual ZV : (Ljavax/swing/SortOrder;)Lburp/Zz_2;
    //   655: getstatic burp/Zlcu.SECONDARY : Lburp/Zlcu;
    //   658: invokevirtual ZA : (Lburp/Zlcu;)Lburp/Zz_2;
    //   661: invokevirtual ZH : ()Lburp/Zmk7;
    //   664: putstatic burp/Ztnl.Zv : Lburp/Zmk7;
    //   667: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   672: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   675: sipush #-10224
    //   678: sipush #8316
    //   681: invokestatic a : (II)Ljava/lang/String;
    //   684: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   687: getstatic burp/Ztu5.STRING : Lburp/Ztu5;
    //   690: getfield clazz : Ljava/lang/Class;
    //   693: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   696: bipush #20
    //   698: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   701: <illegal opcode> ZG : ()Lburp/Zzbi;
    //   706: invokevirtual ZR : (Lburp/Zzbi;)Lburp/Zz_2;
    //   709: invokevirtual ZH : ()Lburp/Zmk7;
    //   712: putstatic burp/Ztnl.ZS : Lburp/Zmk7;
    //   715: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD816) & 0xFFFF;
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
      byte b1 = 58;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztnl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */