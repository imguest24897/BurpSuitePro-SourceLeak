package burp;

import burp.api.montoya.core.ToolType;
import burp.api.montoya.http.message.MimeType;
import burp.api.montoya.http.message.StatusCodeClass;
import burp.api.montoya.http.message.params.HttpParameterType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ze2c implements Zz2t {
  private static final List<Zeew> ZL;
  
  private final Zbz6 ZA;
  
  private final boolean ZQ;
  
  private final Zg7q ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ze2c(Zbz6 paramZbz6, boolean paramBoolean, Zg7q paramZg7q) {
    this.ZA = paramZbz6;
    this.ZQ = paramBoolean;
    this.ZD = paramZg7q;
  }
  
  public String ZT() {
    Zlmu zlmu = new Zlmu();
    Zzup zzup = Zq(zlmu);
    zzup = ZY(zzup);
    zzup = ZG(zzup);
    if (this.ZQ)
      zzup = ZW(zzup); 
    zzup = Zu(zzup);
    zzup = ZI(zzup);
    zzup = ZT(zzup);
    zzup = new Zlmi(zzup);
    return this.ZD.Zz(zzup.Zg());
  }
  
  private Zzup ZT(Zzup paramZzup) {
    if (this.ZA.ZeQ()) {
      Zlm4 zlm4 = new Zlm4(a(14539, -14081), Zg3u.NOTES.Zo);
      paramZzup = paramZzup.ZI().ZT(zlm4);
    } 
    if (this.ZA.Zem()) {
      Zlm4 zlm4 = new Zlm4(a(14539, -14081), Zg3u.HIGHLIGHT_COLOUR.Zo);
      paramZzup = paramZzup.ZI().ZT(zlm4);
    } 
    return paramZzup;
  }
  
  private Zzup ZY(Zzup paramZzup) {
    if (!this.ZA.Zeb()) {
      Zzup zzup = ZH(MimeType.HTML, new MimeType[0]);
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZA.ZeR()) {
      Zzup zzup = ZH(MimeType.SCRIPT, new MimeType[] { MimeType.JSON });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZA.ZeH()) {
      Zzup zzup = ZH(MimeType.XML, new MimeType[] { MimeType.IMAGE_SVG_XML });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZA.ZeA()) {
      Zzup zzup = ZH(MimeType.CSS, new MimeType[0]);
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZA.ZeL()) {
      Zzup zzup = ZH(MimeType.PLAIN_TEXT, new MimeType[] { MimeType.RTF });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZA.Zel()) {
      Zzup zzup = ZH(MimeType.IMAGE_UNKNOWN, new MimeType[] { MimeType.IMAGE_JPEG, MimeType.IMAGE_GIF, MimeType.IMAGE_PNG, MimeType.IMAGE_BMP, MimeType.IMAGE_TIFF });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZA.ZeN()) {
      Zzup zzup = ZH(MimeType.APPLICATION_FLASH, new MimeType[] { MimeType.LEGACY_SER_AMF });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZA.Zea()) {
      Zzup zzup = ZH(MimeType.UNRECOGNIZED, new MimeType[] { MimeType.SOUND, MimeType.VIDEO, MimeType.FONT_WOFF, MimeType.FONT_WOFF2, MimeType.APPLICATION_UNKNOWN });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    return paramZzup;
  }
  
  private Zzup ZW(Zzup paramZzup) {
    List<ToolType> list = ZL.stream().filter(this::lambda$convertFilterByToolOptions$0).map(Zt6v::Ze).toList();
    if (!list.isEmpty())
      paramZzup = ZW(paramZzup, list); 
    return paramZzup;
  }
  
  private Zzup ZG(Zzup paramZzup) {
    if (!this.ZA.Zev())
      paramZzup = Zp(paramZzup, StatusCodeClass.CLASS_2XX_SUCCESS); 
    if (!this.ZA.Zeh())
      paramZzup = Zp(paramZzup, StatusCodeClass.CLASS_3XX_REDIRECTION); 
    if (!this.ZA.Zet())
      paramZzup = Zp(paramZzup, StatusCodeClass.CLASS_4XX_CLIENT_ERRORS); 
    if (!this.ZA.Zee())
      paramZzup = Zp(paramZzup, StatusCodeClass.CLASS_5XX_SERVER_ERRORS); 
    return paramZzup;
  }
  
  private Zzup Zu(Zzup paramZzup) {
    // Byte code:
    //   0: invokestatic Zt : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: aload_0
    //   6: getfield ZA : Lburp/Zbz6;
    //   9: invokeinterface Ze6 : ()Ljava/lang/String;
    //   14: invokevirtual ZJ : (Ljava/lang/String;)Ljava/lang/String;
    //   17: astore_3
    //   18: aload_3
    //   19: ifnull -> 29
    //   22: aload_3
    //   23: invokevirtual isEmpty : ()Z
    //   26: ifeq -> 31
    //   29: aload_1
    //   30: areturn
    //   31: aload_0
    //   32: getfield ZA : Lburp/Zbz6;
    //   35: invokeinterface ZeC : ()Z
    //   40: ifeq -> 153
    //   43: aload_0
    //   44: getfield ZA : Lburp/Zbz6;
    //   47: invokeinterface ZeI : ()Z
    //   52: ifeq -> 67
    //   55: sipush #14543
    //   58: sipush #6579
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: goto -> 76
    //   67: sipush #14532
    //   70: sipush #-31366
    //   73: invokestatic a : (II)Ljava/lang/String;
    //   76: astore #4
    //   78: aload_0
    //   79: aload #4
    //   81: <illegal opcode> get : (Lburp/Ze2c;Ljava/lang/String;)Ljava/util/function/Supplier;
    //   86: astore #5
    //   88: new burp/Zlmx
    //   91: dup
    //   92: sipush #14540
    //   95: sipush #-5143
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: getstatic burp/Zg3u.SEARCH_TERM : Lburp/Zg3u;
    //   104: getfield Zo : Ljava/lang/String;
    //   107: aload #5
    //   109: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier;)V
    //   112: astore #6
    //   114: aload_0
    //   115: getfield ZA : Lburp/Zbz6;
    //   118: invokeinterface Zes : ()Z
    //   123: ifeq -> 135
    //   126: aload #6
    //   128: invokeinterface Zs : ()Lburp/Zzup;
    //   133: astore #6
    //   135: aload_1
    //   136: invokeinterface ZI : ()Lburp/Zzup;
    //   141: aload #6
    //   143: invokeinterface ZT : (Lburp/Zzup;)Lburp/Zzup;
    //   148: astore_1
    //   149: aload_2
    //   150: ifnull -> 231
    //   153: new burp/Zlmz
    //   156: dup
    //   157: sipush #14539
    //   160: sipush #-14081
    //   163: invokestatic a : (II)Ljava/lang/String;
    //   166: getstatic burp/Zg3u.SEARCH_TERM : Lburp/Zg3u;
    //   169: getfield Zo : Ljava/lang/String;
    //   172: new burp/Zrx1
    //   175: dup
    //   176: aload_0
    //   177: <illegal opcode> get : (Lburp/Ze2c;)Ljava/util/function/Supplier;
    //   182: invokespecial <init> : (Ljava/util/function/Supplier;)V
    //   185: aload_0
    //   186: <illegal opcode> get : (Lburp/Ze2c;)Ljava/util/function/Supplier;
    //   191: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V
    //   194: astore #4
    //   196: aload_0
    //   197: getfield ZA : Lburp/Zbz6;
    //   200: invokeinterface Zes : ()Z
    //   205: ifeq -> 217
    //   208: aload #4
    //   210: invokeinterface Zs : ()Lburp/Zzup;
    //   215: astore #4
    //   217: aload_1
    //   218: invokeinterface ZI : ()Lburp/Zzup;
    //   223: aload #4
    //   225: invokeinterface ZT : (Lburp/Zzup;)Lburp/Zzup;
    //   230: astore_1
    //   231: aload_1
    //   232: areturn
  }
  
  private Zzup ZI(Zzup paramZzup) {
    if (this.ZA.ZeT()) {
      String str = ZJ(this.ZA.Zez());
      if (str != null)
        paramZzup = Zd(paramZzup, false, str.split(a(14541, -19441))); 
    } 
    if (this.ZA.ZeW()) {
      String str = ZJ(this.ZA.ZeS());
      if (str != null)
        paramZzup = Zd(paramZzup, true, str.split(a(14535, -18356))); 
    } 
    return paramZzup;
  }
  
  private Zzup Zq(Zzup paramZzup) {
    if (this.ZA.ZeU()) {
      Zlm4 zlm4 = new Zlm4(a(14539, -14081), Zg3u.SHOW_ONLY_IN_SCOPE.Zo);
      paramZzup = paramZzup.ZI().ZT(zlm4);
    } 
    if (this.ZA.Ze5()) {
      Zlm4 zlm4 = new Zlm4(a(14539, -14081), Zg3u.HAS_RESPONSE.Zo);
      paramZzup = paramZzup.ZI().ZT(zlm4);
    } 
    if (this.ZA.ZeM()) {
      Zlmx zlmx1 = new Zlmx(a(14539, -14081), Zg3u.SHOW_ONLY_PARAMETERIZED_REQUESTS.Zo, Ze2c::lambda$convertRequestTypeOptions$4);
      Zlmx zlmx2 = new Zlmx(a(14539, -14081), Zg3u.SHOW_ONLY_PARAMETERIZED_REQUESTS.Zo, Ze2c::lambda$convertRequestTypeOptions$5);
      paramZzup = paramZzup.ZI().ZT(zlmx1.ZN(zlmx2));
    } 
    return paramZzup;
  }
  
  private static Zzup ZH(MimeType paramMimeType, MimeType... paramVarArgs) {
    Zzup zzup = Zz(paramMimeType);
    MimeType[] arrayOfMimeType = paramVarArgs;
    int i = arrayOfMimeType.length;
    String[] arrayOfString = Zkmh.Zt();
    byte b = 0;
    while (b < i) {
      MimeType mimeType = arrayOfMimeType[b];
      zzup = zzup.ZI().ZT(Zz(mimeType));
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return zzup;
  }
  
  private static Zzup Zz(MimeType paramMimeType) {
    return (new Zlm4(a(14539, -14081), Zg3u.MIME_TYPE.Zo)).Zd(new Zlmw<>(paramMimeType));
  }
  
  private static Zzup ZW(Zzup paramZzup, List<ToolType> paramList) {
    String str = paramList.stream().map(Ze2c::lambda$convertTools$6).collect(Collectors.joining(a(14533, 5082)));
    Zlmx zlmx = new Zlmx(a(14539, -14081), Zg3u.TOOL_SOURCE.Zo, str::lambda$convertTools$7);
    return paramZzup.ZI().ZT(zlmx.Zs());
  }
  
  private static Zzup Zp(Zzup paramZzup, StatusCodeClass paramStatusCodeClass) {
    Zlmx zlmx = new Zlmx(a(14539, -14081), Zg3u.IS_STATUS_CODE_CLASS.Zo, paramStatusCodeClass::lambda$convertStatusCodeClass$8);
    Zlm4 zlm4 = new Zlm4(a(14539, -14081), Zg3u.HAS_RESPONSE.Zo);
    Zzup zzup = zlm4.ZT(zlmx).Zm().Zs();
    return paramZzup.ZI().ZT(zzup);
  }
  
  private static Zzup Zd(Zzup paramZzup, boolean paramBoolean, String... paramVarArgs) {
    String str = Arrays.<String>stream(paramVarArgs).findFirst().orElse(null);
    return (str == null || str.isEmpty()) ? paramZzup : ZJ(paramZzup, str, paramBoolean, (String[])Arrays.<String>stream(paramVarArgs).skip(1L).toArray(Ze2c::lambda$convertFileExtensions$9));
  }
  
  private static Zzup ZJ(Zzup paramZzup, String paramString, boolean paramBoolean, String... paramVarArgs) {
    Zzup zzup = ZP(paramString, paramBoolean);
    String[] arrayOfString2 = paramVarArgs;
    int i = arrayOfString2.length;
    String[] arrayOfString1 = Zkmh.Zt();
    byte b = 0;
    while (b < i) {
      String str = arrayOfString2[b];
      Zzup zzup1 = ZP(str, paramBoolean);
      zzup = paramBoolean ? zzup.ZI().ZT(zzup1) : zzup.ZN(zzup1);
      b++;
      if (arrayOfString1 != null)
        break; 
    } 
    return paramZzup.ZI().ZT(zzup);
  }
  
  private static Zzup ZP(String paramString, boolean paramBoolean) {
    Zzup zzup = new Zlmx((new Zlm4((new Zlm4(a(14539, -14081), Zg3u.PATH.Zo)).Zg(), a(14538, -12226))).Zg(), a(14536, -658), new Zrx1(paramString::lambda$createFileExtensionGenerator$10));
    if (paramBoolean)
      zzup = zzup.Zs(); 
    return zzup;
  }
  
  private String ZJ(String paramString) {
    return (paramString == null || paramString.isEmpty()) ? paramString : paramString.replace("\\", a(14531, -12310)).replace("\"", a(14537, -30455));
  }
  
  private static String lambda$createFileExtensionGenerator$10(String paramString) {
    return a(14534, 14245).formatted(new Object[] { paramString });
  }
  
  private static String[] lambda$convertFileExtensions$9(int paramInt) {
    return new String[paramInt];
  }
  
  private static String lambda$convertStatusCodeClass$8(StatusCodeClass paramStatusCodeClass) {
    return (new Zlmw(paramStatusCodeClass)).Zg();
  }
  
  private static String lambda$convertTools$7(String paramString) {
    return paramString;
  }
  
  private static String lambda$convertTools$6(ToolType paramToolType) {
    return (new Zlmw(paramToolType)).Zg();
  }
  
  private static String lambda$convertRequestTypeOptions$5() {
    return (new Zlmw(HttpParameterType.BODY)).Zg();
  }
  
  private static String lambda$convertRequestTypeOptions$4() {
    return (new Zlmw(HttpParameterType.URL)).Zg();
  }
  
  private String lambda$convertSearchTermOptions$3() {
    return String.valueOf(this.ZA.ZeI());
  }
  
  private String lambda$convertSearchTermOptions$2() {
    return ZJ(this.ZA.Ze6());
  }
  
  private String lambda$convertSearchTermOptions$1(String paramString) {
    return a(14542, -27724).formatted(new Object[] { ZJ(this.ZA.Ze6()), paramString });
  }
  
  private boolean lambda$convertFilterByToolOptions$0(Zeew paramZeew) {
    return !this.ZA.ZE(paramZeew);
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '4ð;Èî`©.²±B\\tOÎTïÝ¶¾ÁZÜdô~æ(ß ÐS§-jý#aApÏÙ-h#r¶G²~½PøKÁ:i%;þ§kýâ÷=tyEè¹\\b)~f±Cþ¬°|ñ:ðLßy'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #14
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #45
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
    //   68: ldc 'A6ýÊ¤³å®\\to[|!Ú~ kðGzêBNkÍêyÅK?'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #41
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #70
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
    //   129: putstatic burp/Ze2c.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ze2c.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #56
    //   214: goto -> 244
    //   217: bipush #107
    //   219: goto -> 244
    //   222: bipush #28
    //   224: goto -> 244
    //   227: bipush #10
    //   229: goto -> 244
    //   232: bipush #29
    //   234: goto -> 244
    //   237: bipush #79
    //   239: goto -> 244
    //   242: bipush #49
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: getstatic burp/Zeew.TARGET : Lburp/Zeew;
    //   303: getstatic burp/Zeew.SCANNER : Lburp/Zeew;
    //   306: getstatic burp/Zeew.REPEATER : Lburp/Zeew;
    //   309: getstatic burp/Zeew.EXTENDER : Lburp/Zeew;
    //   312: getstatic burp/Zeew.PROXY : Lburp/Zeew;
    //   315: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   318: getstatic burp/Zeew.SEQUENCER : Lburp/Zeew;
    //   321: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   324: putstatic burp/Ze2c.ZL : Ljava/util/List;
    //   327: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x38CF) & 0xFFFF;
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
      byte b1 = 39;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze2c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */