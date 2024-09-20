package burp;

import burp.api.montoya.http.message.MimeType;
import burp.api.montoya.http.message.StatusCodeClass;
import burp.api.montoya.http.message.params.HttpParameterType;
import java.util.Arrays;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zej implements Zz2t {
  private final Zzt9 ZB;
  
  private final Zg7q ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zej(Zzt9 paramZzt9, Zg7q paramZg7q) {
    this.ZB = paramZzt9;
    this.ZE = paramZg7q;
  }
  
  public String ZT() {
    Zlmu zlmu = new Zlmu();
    Zzup zzup = Zi(zlmu);
    zzup = ZU(zzup);
    String[] arrayOfString = Zkmh.Zt();
    zzup = ZJ(zzup);
    zzup = ZC(zzup);
    zzup = ZF(zzup);
    zzup = ZO(zzup);
    zzup = Zp(zzup);
    zzup = new Zlmi(zzup);
    try {
      if (arrayOfString != null)
        Zbqc.Zr(new Zbqc[2]); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return this.ZE.Zz(zzup.Zg());
  }
  
  private Zzup Zp(Zzup paramZzup) {
    String str = this.ZB.ZcL();
    try {
      if (str != null && !str.isEmpty()) {
        int i = Zr(str);
        Zzup zzup = (new Zlm4(a(-26840, -12413), Zg3u.LISTENER_PORT.Zo)).Zt(new Zlm9(i));
        paramZzup = paramZzup.ZI().ZT(zzup);
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return paramZzup;
  }
  
  private Zzup ZO(Zzup paramZzup) {
    if (this.ZB.ZcI()) {
      Zlm4 zlm4 = new Zlm4(a(-26845, -2138), Zg3u.NOTES.Zo);
      paramZzup = paramZzup.ZI().ZT(zlm4);
    } 
    if (this.ZB.ZcC()) {
      Zlm4 zlm4 = new Zlm4(a(-26845, -2138), Zg3u.HIGHLIGHT_COLOUR.Zo);
      paramZzup = paramZzup.ZI().ZT(zlm4);
    } 
    return paramZzup;
  }
  
  private Zzup ZU(Zzup paramZzup) {
    if (!this.ZB.ZcR()) {
      Zzup zzup = ZW(MimeType.HTML, new MimeType[0]);
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZB.ZcS()) {
      Zzup zzup = ZW(MimeType.SCRIPT, new MimeType[] { MimeType.JSON });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZB.ZcZ()) {
      Zzup zzup = ZW(MimeType.XML, new MimeType[] { MimeType.IMAGE_SVG_XML });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZB.ZcH()) {
      Zzup zzup = ZW(MimeType.CSS, new MimeType[0]);
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZB.Zc8()) {
      Zzup zzup = ZW(MimeType.PLAIN_TEXT, new MimeType[] { MimeType.RTF });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZB.Zcz()) {
      Zzup zzup = ZW(MimeType.IMAGE_UNKNOWN, new MimeType[] { MimeType.IMAGE_JPEG, MimeType.IMAGE_GIF, MimeType.IMAGE_PNG, MimeType.IMAGE_BMP, MimeType.IMAGE_TIFF });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZB.Zc4()) {
      Zzup zzup = ZW(MimeType.APPLICATION_FLASH, new MimeType[] { MimeType.LEGACY_SER_AMF });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZB.Zcc()) {
      Zzup zzup = ZW(MimeType.UNRECOGNIZED, new MimeType[] { MimeType.SOUND, MimeType.VIDEO, MimeType.FONT_WOFF, MimeType.FONT_WOFF2, MimeType.APPLICATION_UNKNOWN });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    return paramZzup;
  }
  
  private Zzup ZJ(Zzup paramZzup) {
    if (!this.ZB.Zc1())
      paramZzup = Ze(paramZzup, StatusCodeClass.CLASS_2XX_SUCCESS); 
    if (!this.ZB.Zcm())
      paramZzup = Ze(paramZzup, StatusCodeClass.CLASS_3XX_REDIRECTION); 
    if (!this.ZB.ZcP())
      paramZzup = Ze(paramZzup, StatusCodeClass.CLASS_4XX_CLIENT_ERRORS); 
    if (!this.ZB.ZcQ())
      paramZzup = Ze(paramZzup, StatusCodeClass.CLASS_5XX_SERVER_ERRORS); 
    return paramZzup;
  }
  
  private Zzup ZC(Zzup paramZzup) {
    // Byte code:
    //   0: invokestatic Zt : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: aload_0
    //   6: getfield ZB : Lburp/Zzt9;
    //   9: invokeinterface Zcs : ()Ljava/lang/String;
    //   14: invokevirtual Zh : (Ljava/lang/String;)Ljava/lang/String;
    //   17: astore_3
    //   18: aload_3
    //   19: ifnull -> 36
    //   22: aload_3
    //   23: invokevirtual isEmpty : ()Z
    //   26: ifeq -> 42
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   35: athrow
    //   36: aload_1
    //   37: areturn
    //   38: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   41: athrow
    //   42: aload_0
    //   43: getfield ZB : Lburp/Zzt9;
    //   46: invokeinterface Zc_ : ()Z
    //   51: ifeq -> 175
    //   54: aload_0
    //   55: getfield ZB : Lburp/Zzt9;
    //   58: invokeinterface ZcO : ()Z
    //   63: ifeq -> 89
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   72: athrow
    //   73: sipush #-26847
    //   76: sipush #-4757
    //   79: invokestatic a : (II)Ljava/lang/String;
    //   82: goto -> 98
    //   85: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   88: athrow
    //   89: sipush #-26833
    //   92: sipush #9427
    //   95: invokestatic a : (II)Ljava/lang/String;
    //   98: astore #4
    //   100: aload_0
    //   101: aload #4
    //   103: <illegal opcode> get : (Lburp/Zej;Ljava/lang/String;)Ljava/util/function/Supplier;
    //   108: astore #5
    //   110: new burp/Zlmx
    //   113: dup
    //   114: sipush #-26845
    //   117: sipush #-2138
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: getstatic burp/Zg3u.SEARCH_TERM : Lburp/Zg3u;
    //   126: getfield Zo : Ljava/lang/String;
    //   129: aload #5
    //   131: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier;)V
    //   134: astore #6
    //   136: aload_0
    //   137: getfield ZB : Lburp/Zzt9;
    //   140: invokeinterface Zcq : ()Z
    //   145: ifeq -> 157
    //   148: aload #6
    //   150: invokeinterface Zs : ()Lburp/Zzup;
    //   155: astore #6
    //   157: aload_1
    //   158: invokeinterface ZI : ()Lburp/Zzup;
    //   163: aload #6
    //   165: invokeinterface ZT : (Lburp/Zzup;)Lburp/Zzup;
    //   170: astore_1
    //   171: aload_2
    //   172: ifnull -> 253
    //   175: new burp/Zlmz
    //   178: dup
    //   179: sipush #-26845
    //   182: sipush #-2138
    //   185: invokestatic a : (II)Ljava/lang/String;
    //   188: getstatic burp/Zg3u.SEARCH_TERM : Lburp/Zg3u;
    //   191: getfield Zo : Ljava/lang/String;
    //   194: new burp/Zrx1
    //   197: dup
    //   198: aload_0
    //   199: <illegal opcode> get : (Lburp/Zej;)Ljava/util/function/Supplier;
    //   204: invokespecial <init> : (Ljava/util/function/Supplier;)V
    //   207: aload_0
    //   208: <illegal opcode> get : (Lburp/Zej;)Ljava/util/function/Supplier;
    //   213: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V
    //   216: astore #4
    //   218: aload_0
    //   219: getfield ZB : Lburp/Zzt9;
    //   222: invokeinterface Zcq : ()Z
    //   227: ifeq -> 239
    //   230: aload #4
    //   232: invokeinterface Zs : ()Lburp/Zzup;
    //   237: astore #4
    //   239: aload_1
    //   240: invokeinterface ZI : ()Lburp/Zzup;
    //   245: aload #4
    //   247: invokeinterface ZT : (Lburp/Zzup;)Lburp/Zzup;
    //   252: astore_1
    //   253: aload_1
    //   254: areturn
    // Exception table:
    //   from	to	target	type
    //   18	29	32	java/lang/NumberFormatException
    //   22	38	38	java/lang/NumberFormatException
    //   42	66	69	java/lang/NumberFormatException
    //   54	85	85	java/lang/NumberFormatException
  }
  
  private Zzup ZF(Zzup paramZzup) {
    if (this.ZB.Zcf()) {
      String str = Zh(this.ZB.Zcr());
      if (str != null)
        paramZzup = Zh(paramZzup, false, str.split(a(-26838, -6955))); 
    } 
    if (this.ZB.ZcN()) {
      String str = Zh(this.ZB.Zcv());
      if (str != null)
        paramZzup = Zh(paramZzup, true, str.split(a(-26835, 4656))); 
    } 
    return paramZzup;
  }
  
  private Zzup Zi(Zzup paramZzup) {
    if (this.ZB.Zcu()) {
      Zlm4 zlm4 = new Zlm4(a(-26845, -2138), Zg3u.SHOW_ONLY_IN_SCOPE.Zo);
      paramZzup = paramZzup.ZI().ZT(zlm4);
    } 
    if (this.ZB.ZcE()) {
      Zlm4 zlm4 = new Zlm4(a(-26845, -2138), Zg3u.HAS_RESPONSE.Zo);
      paramZzup = paramZzup.ZI().ZT(zlm4);
    } 
    if (this.ZB.ZcW()) {
      Zlmx zlmx1 = new Zlmx(a(-26845, -2138), Zg3u.SHOW_ONLY_PARAMETERIZED_REQUESTS.Zo, Zej::lambda$convertRequestTypeOptions$3);
      Zlmx zlmx2 = new Zlmx(a(-26845, -2138), Zg3u.SHOW_ONLY_PARAMETERIZED_REQUESTS.Zo, Zej::lambda$convertRequestTypeOptions$4);
      paramZzup = paramZzup.ZI().ZT(zlmx1.ZN(zlmx2));
    } 
    return paramZzup;
  }
  
  private static Zzup ZW(MimeType paramMimeType, MimeType... paramVarArgs) {
    Zzup zzup = Zl(paramMimeType);
    MimeType[] arrayOfMimeType = paramVarArgs;
    String[] arrayOfString = Zkmh.Zt();
    int i = arrayOfMimeType.length;
    byte b = 0;
    while (b < i) {
      MimeType mimeType = arrayOfMimeType[b];
      zzup = zzup.ZI().ZT(Zl(mimeType));
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return zzup;
  }
  
  private static Zzup Zl(MimeType paramMimeType) {
    return (new Zlm4(a(-26845, -2138), Zg3u.MIME_TYPE.Zo)).Zd(new Zlmw<>(paramMimeType));
  }
  
  private static Zzup Ze(Zzup paramZzup, StatusCodeClass paramStatusCodeClass) {
    Zlmx zlmx = new Zlmx(a(-26845, -2138), Zg3u.IS_STATUS_CODE_CLASS.Zo, paramStatusCodeClass::lambda$convertStatusCodeClass$5);
    Zlm4 zlm4 = new Zlm4(a(-26845, -2138), Zg3u.HAS_RESPONSE.Zo);
    Zzup zzup = zlm4.ZT(zlmx).Zm().Zs();
    return paramZzup.ZI().ZT(zzup);
  }
  
  private static Zzup Zh(Zzup paramZzup, boolean paramBoolean, String... paramVarArgs) {
    String str = Arrays.<String>stream(paramVarArgs).findFirst().orElse(null);
    try {
      if (str != null)
        try {
          return !str.isEmpty() ? ZD(paramZzup, str, paramBoolean, (String[])Arrays.<String>stream(paramVarArgs).skip(1L).toArray(Zej::lambda$convertFileExtensions$6)) : paramZzup;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return paramZzup;
  }
  
  private static Zzup ZD(Zzup paramZzup, String paramString, boolean paramBoolean, String... paramVarArgs) {
    Zzup zzup = ZY(paramString, paramBoolean);
    String[] arrayOfString2 = paramVarArgs;
    String[] arrayOfString1 = Zkmh.Zt();
    int i = arrayOfString2.length;
    byte b = 0;
    while (b < i) {
      String str = arrayOfString2[b];
      Zzup zzup1 = ZY(str, paramBoolean);
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      zzup = paramBoolean ? zzup.ZI().ZT(zzup1) : zzup.ZN(zzup1);
      b++;
      if (arrayOfString1 != null)
        break; 
    } 
    return paramZzup.ZI().ZT(zzup);
  }
  
  private static Zzup ZY(String paramString, boolean paramBoolean) {
    Zzup zzup = new Zlmx((new Zlm4((new Zlm4(a(-26845, -2138), Zg3u.PATH.Zo)).Zg(), a(-26839, 29514))).Zg(), a(-26834, 24781), new Zrx1(paramString::lambda$createFileExtensionGenerator$7));
    if (paramBoolean)
      zzup = zzup.Zs(); 
    return zzup;
  }
  
  private static int Zr(String paramString) {
    try {
      return Integer.parseInt(paramString);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      return -1;
    } 
  }
  
  private String Zh(String paramString) {
    try {
      if (paramString != null) {
        try {
          if (paramString.isEmpty());
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return paramString.replace("\\", a(-26836, 29191)).replace("\"", a(-26848, -13575));
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private static String lambda$createFileExtensionGenerator$7(String paramString) {
    return a(-26846, -4505).formatted(new Object[] { paramString });
  }
  
  private static String[] lambda$convertFileExtensions$6(int paramInt) {
    return new String[paramInt];
  }
  
  private static String lambda$convertStatusCodeClass$5(StatusCodeClass paramStatusCodeClass) {
    return (new Zlmw(paramStatusCodeClass)).Zg();
  }
  
  private static String lambda$convertRequestTypeOptions$4() {
    return (new Zlmw(HttpParameterType.BODY)).Zg();
  }
  
  private static String lambda$convertRequestTypeOptions$3() {
    return (new Zlmw(HttpParameterType.URL)).Zg();
  }
  
  private String lambda$convertSearchTermOptions$2() {
    return String.valueOf(this.ZB.ZcO());
  }
  
  private String lambda$convertSearchTermOptions$1() {
    return Zh(this.ZB.Zcs());
  }
  
  private String lambda$convertSearchTermOptions$0(String paramString) {
    return a(-26837, 12057).formatted(new Object[] { Zh(this.ZB.Zcs()), paramString });
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'XNI4¨9âðÚ ¹^>½gEs/ÍÓyøj¤¯ä]¤~NkÖuüði£Ì×!÷½÷þõåP\\t `'6Ò)ÉÿãÖÐ¯zÅÓ0®i732õ¤mjÉ¨jµla|:xAJÐH¡Ñ\\bN¼WcÝ»ä:µëÃ)b­Úñ¤ß'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_1
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   64: goto -> 23
    //   67: ldc 'csub¹:#[«8ÇÄàT'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #15
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #37
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zej.a : [Ljava/lang/String;
    //   131: bipush #12
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zej.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #53
    //   214: goto -> 244
    //   217: bipush #97
    //   219: goto -> 244
    //   222: bipush #115
    //   224: goto -> 244
    //   227: bipush #29
    //   229: goto -> 244
    //   232: bipush #124
    //   234: goto -> 244
    //   237: bipush #127
    //   239: goto -> 244
    //   242: bipush #105
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9729) & 0xFFFF;
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
      char c = '±';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zej.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */