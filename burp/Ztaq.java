package burp;

import burp.api.montoya.core.ToolType;
import burp.api.montoya.http.message.MimeType;
import burp.api.montoya.http.message.StatusCodeClass;
import burp.api.montoya.http.message.params.HttpParameterType;
import java.util.List;
import java.util.stream.Collectors;

public class Ztaq implements Zz2t {
  private static final List<Zeew> ZM;
  
  private final Zgzp ZQ;
  
  private final boolean Zc;
  
  private final Zg7q ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztaq(Zgzp paramZgzp, boolean paramBoolean, Zg7q paramZg7q) {
    this.ZQ = paramZgzp;
    this.Zc = paramBoolean;
    this.ZH = paramZg7q;
  }
  
  public String ZT() {
    Zlmu zlmu = new Zlmu();
    Zzup zzup = Zb(zlmu);
    String[] arrayOfString = Zkmh.Zt();
    zzup = Zk(zzup);
    zzup = ZW(zzup);
    if (this.Zc)
      zzup = ZV(zzup); 
    zzup = ZZ(zzup);
    zzup = ZE(zzup);
    zzup = Zx(zzup);
    zzup = new Zlmi(zzup);
    if (Zbqc.Zwu() == null)
      Zkmh.ZU(new String[1]); 
    return this.ZH.Zz(zzup.Zg());
  }
  
  private Zzup Zk(Zzup paramZzup) {
    if (!this.ZQ.Z_e()) {
      Zzup zzup = Zr(MimeType.HTML, new MimeType[0]);
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZQ.Z_q()) {
      Zzup zzup = Zr(MimeType.SCRIPT, new MimeType[] { MimeType.JSON });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZQ.Z_r()) {
      Zzup zzup = Zr(MimeType.XML, new MimeType[] { MimeType.IMAGE_SVG_XML });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZQ.Z_Y()) {
      Zzup zzup = Zr(MimeType.CSS, new MimeType[0]);
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZQ.Z_w()) {
      Zzup zzup = Zr(MimeType.PLAIN_TEXT, new MimeType[] { MimeType.RTF });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZQ.Z_S()) {
      Zzup zzup = Zr(MimeType.IMAGE_UNKNOWN, new MimeType[] { MimeType.IMAGE_JPEG, MimeType.IMAGE_GIF, MimeType.IMAGE_PNG, MimeType.IMAGE_BMP, MimeType.IMAGE_TIFF });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZQ.Z_J()) {
      Zzup zzup = Zr(MimeType.APPLICATION_FLASH, new MimeType[] { MimeType.LEGACY_SER_AMF });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (!this.ZQ.Z_t()) {
      Zzup zzup = Zr(MimeType.UNRECOGNIZED, new MimeType[] { MimeType.SOUND, MimeType.VIDEO, MimeType.FONT_WOFF, MimeType.FONT_WOFF2, MimeType.APPLICATION_UNKNOWN });
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    return paramZzup;
  }
  
  private Zzup ZV(Zzup paramZzup) {
    List<ToolType> list = ZM.stream().filter(this::lambda$convertFilterByToolOptions$0).map(Zt6v::Ze).toList();
    if (!list.isEmpty())
      paramZzup = Zn(paramZzup, list); 
    return paramZzup;
  }
  
  private Zzup ZW(Zzup paramZzup) {
    if (!this.ZQ.Z_b())
      paramZzup = ZD(paramZzup, StatusCodeClass.CLASS_2XX_SUCCESS); 
    if (!this.ZQ.Z_P())
      paramZzup = ZD(paramZzup, StatusCodeClass.CLASS_3XX_REDIRECTION); 
    if (!this.ZQ.Z_u())
      paramZzup = ZD(paramZzup, StatusCodeClass.CLASS_4XX_CLIENT_ERRORS); 
    if (!this.ZQ.Z_4())
      paramZzup = ZD(paramZzup, StatusCodeClass.CLASS_5XX_SERVER_ERRORS); 
    return paramZzup;
  }
  
  private Zzup ZZ(Zzup paramZzup) {
    // Byte code:
    //   0: invokestatic Zt : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: aload_0
    //   6: getfield ZQ : Lburp/Zgzp;
    //   9: invokeinterface Zbo : ()Ljava/lang/String;
    //   14: invokevirtual ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   17: astore_3
    //   18: aload_3
    //   19: ifnull -> 29
    //   22: aload_3
    //   23: invokevirtual isEmpty : ()Z
    //   26: ifeq -> 31
    //   29: aload_1
    //   30: areturn
    //   31: aload_0
    //   32: getfield ZQ : Lburp/Zgzp;
    //   35: invokeinterface ZbK : ()Z
    //   40: ifeq -> 153
    //   43: aload_0
    //   44: getfield ZQ : Lburp/Zgzp;
    //   47: invokeinterface Zbz : ()Z
    //   52: ifeq -> 67
    //   55: sipush #-15303
    //   58: sipush #-15415
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: goto -> 76
    //   67: sipush #-15297
    //   70: sipush #12225
    //   73: invokestatic a : (II)Ljava/lang/String;
    //   76: astore #4
    //   78: aload_0
    //   79: aload #4
    //   81: <illegal opcode> get : (Lburp/Ztaq;Ljava/lang/String;)Ljava/util/function/Supplier;
    //   86: astore #5
    //   88: new burp/Zlmx
    //   91: dup
    //   92: sipush #-15304
    //   95: sipush #6039
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: getstatic burp/Zg3u.SEARCH_TERM : Lburp/Zg3u;
    //   104: getfield Zo : Ljava/lang/String;
    //   107: aload #5
    //   109: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier;)V
    //   112: astore #6
    //   114: aload_0
    //   115: getfield ZQ : Lburp/Zgzp;
    //   118: invokeinterface Zb1 : ()Z
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
    //   157: sipush #-15304
    //   160: sipush #6039
    //   163: invokestatic a : (II)Ljava/lang/String;
    //   166: getstatic burp/Zg3u.SEARCH_TERM : Lburp/Zg3u;
    //   169: getfield Zo : Ljava/lang/String;
    //   172: new burp/Zrx1
    //   175: dup
    //   176: aload_0
    //   177: <illegal opcode> get : (Lburp/Ztaq;)Ljava/util/function/Supplier;
    //   182: invokespecial <init> : (Ljava/util/function/Supplier;)V
    //   185: aload_0
    //   186: <illegal opcode> get : (Lburp/Ztaq;)Ljava/util/function/Supplier;
    //   191: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V
    //   194: astore #4
    //   196: aload_0
    //   197: getfield ZQ : Lburp/Zgzp;
    //   200: invokeinterface Zb1 : ()Z
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
  
  private Zzup ZE(Zzup paramZzup) {
    if (this.ZQ.Z_T()) {
      Zzup zzup = (new Zlm4(a(-15304, 6039), Zg3u.IS_SESSION_HANDLING_EVENT.Zo)).Zs();
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    return paramZzup;
  }
  
  private Zzup Zx(Zzup paramZzup) {
    if (this.ZQ.Z_Q() != Integer.MAX_VALUE) {
      Zzup zzup = (new Zlm4(a(-15304, 6039), Zg3u.REQUEST_SIZE.Zo)).Zs(new Zlm9(this.ZQ.Z_Q()));
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    if (this.ZQ.Z_E() != Integer.MAX_VALUE) {
      Zzup zzup = (new Zlm4(a(-15304, 6039), Zg3u.HAS_RESPONSE.Zo)).ZT((new Zlm4(a(-15304, 6039), Zg3u.RESPONSE_SIZE.Zo)).Zs(new Zlm9(this.ZQ.Z_E())));
      paramZzup = paramZzup.ZI().ZT(zzup);
    } 
    return paramZzup;
  }
  
  private Zzup Zb(Zzup paramZzup) {
    if (this.ZQ.Z_L()) {
      Zlm4 zlm4 = new Zlm4(a(-15304, 6039), Zg3u.SHOW_ONLY_IN_SCOPE.Zo);
      paramZzup = paramZzup.ZI().ZT(zlm4);
    } 
    if (this.ZQ.Z_j()) {
      Zlm4 zlm4 = new Zlm4(a(-15304, 6039), Zg3u.HAS_RESPONSE.Zo);
      paramZzup = paramZzup.ZI().ZT(zlm4);
    } 
    if (this.ZQ.Z_K()) {
      Zlmx zlmx1 = new Zlmx(a(-15304, 6039), Zg3u.SHOW_ONLY_PARAMETERIZED_REQUESTS.Zo, Ztaq::lambda$convertRequestTypeOptions$4);
      Zlmx zlmx2 = new Zlmx(a(-15304, 6039), Zg3u.SHOW_ONLY_PARAMETERIZED_REQUESTS.Zo, Ztaq::lambda$convertRequestTypeOptions$5);
      paramZzup = paramZzup.ZI().ZT(zlmx1.ZN(zlmx2));
    } 
    return paramZzup;
  }
  
  private static Zzup Zr(MimeType paramMimeType, MimeType... paramVarArgs) {
    Zzup zzup = Zr(paramMimeType);
    MimeType[] arrayOfMimeType = paramVarArgs;
    String[] arrayOfString = Zkmh.Zt();
    int i = arrayOfMimeType.length;
    byte b = 0;
    while (b < i) {
      MimeType mimeType = arrayOfMimeType[b];
      zzup = zzup.ZI().ZT(Zr(mimeType));
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return zzup;
  }
  
  private static Zzup Zr(MimeType paramMimeType) {
    return (new Zlm4(a(-15304, 6039), Zg3u.MIME_TYPE.Zo)).Zd(new Zlmw<>(paramMimeType));
  }
  
  private static Zzup Zn(Zzup paramZzup, List<ToolType> paramList) {
    String str = paramList.stream().map(Ztaq::lambda$convertTools$6).collect(Collectors.joining(a(-15301, -5899)));
    Zlmx zlmx = new Zlmx(a(-15298, -25480), Zg3u.TOOL_SOURCE.Zo, str::lambda$convertTools$7);
    return paramZzup.ZI().ZT(zlmx.Zs());
  }
  
  private static Zzup ZD(Zzup paramZzup, StatusCodeClass paramStatusCodeClass) {
    Zlmx zlmx = new Zlmx(a(-15304, 6039), Zg3u.IS_STATUS_CODE_CLASS.Zo, paramStatusCodeClass::lambda$convertStatusCodeClass$8);
    Zlm4 zlm4 = new Zlm4(a(-15304, 6039), Zg3u.HAS_RESPONSE.Zo);
    Zzup zzup = zlm4.ZT(zlmx).Zm().Zs();
    return paramZzup.ZI().ZT(zzup);
  }
  
  private String ZW(String paramString) {
    return (paramString == null || paramString.isEmpty()) ? paramString : paramString.replace("\\", a(-15302, 20503)).replace("\"", a(-15300, -1857));
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
    return String.valueOf(this.ZQ.Zbz());
  }
  
  private String lambda$convertSearchTermOptions$2() {
    return ZW(this.ZQ.Zbo());
  }
  
  private String lambda$convertSearchTermOptions$1(String paramString) {
    return a(-15299, -5483).formatted(new Object[] { ZW(this.ZQ.Zbo()), paramString });
  }
  
  private boolean lambda$convertFilterByToolOptions$0(Zeew paramZeew) {
    return !this.ZQ.Zv(paramZeew);
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÃüÀLÙ0îgór¨Çaj)¹JìùzðsH?þû\2@NùaBßX@\\n´Ê³Fæ·D°û"Z¦H_rr?Þîc§crö lMåUÇê@'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #67
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
    //   68: ldc 'P³BUyã\\níÓÕK\\tqhÓ&ÜPò5 óï'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #15
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #117
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
    //   129: putstatic burp/Ztaq.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztaq.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 258
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #78
    //   214: goto -> 242
    //   217: bipush #58
    //   219: goto -> 242
    //   222: bipush #23
    //   224: goto -> 242
    //   227: iconst_3
    //   228: goto -> 242
    //   231: bipush #50
    //   233: goto -> 242
    //   236: bipush #90
    //   238: goto -> 242
    //   241: iconst_5
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 166
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 162
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 40, 0 -> 99
    //   300: getstatic burp/Zeew.TARGET : Lburp/Zeew;
    //   303: getstatic burp/Zeew.SCANNER : Lburp/Zeew;
    //   306: getstatic burp/Zeew.REPEATER : Lburp/Zeew;
    //   309: getstatic burp/Zeew.EXTENDER : Lburp/Zeew;
    //   312: getstatic burp/Zeew.PROXY : Lburp/Zeew;
    //   315: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   318: getstatic burp/Zeew.SEQUENCER : Lburp/Zeew;
    //   321: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   324: putstatic burp/Ztaq.ZM : Ljava/util/List;
    //   327: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC43E) & 0xFFFF;
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
      char c = 'Ã';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztaq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */