package net.portswigger;

import burp.Zbqc;
import java.net.URL;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;
import org.openapi4j.Zaw;
import org.yaml.Zt5;
import org.yaml.Ztp;
import org.yaml.Ztw;
import org.yaml.Zx;

public class Zdb {
  private static final Pattern ZW;
  
  private static final Pattern ZZ;
  
  private final List<Ztb> ZP = new LinkedList<>();
  
  private final Zaw ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zdb() {
    this(new Zaw());
  }
  
  Zdb(Zaw paramZaw) {
    this.ZH = paramZaw;
  }
  
  public Collection<Zrmf> ZJ(URL paramURL, String paramString) throws Zhg {
    // Byte code:
    //   0: invokestatic Zo : ()Ljava/lang/String;
    //   3: getstatic net/portswigger/Zdb.ZW : Ljava/util/regex/Pattern;
    //   6: aload_2
    //   7: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   10: invokevirtual find : ()Z
    //   13: istore #4
    //   15: astore_3
    //   16: iload #4
    //   18: ifeq -> 74
    //   21: aload_2
    //   22: invokestatic ZX : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   25: astore #7
    //   27: aload #7
    //   29: invokestatic Zq : (Lnet/portswigger/Zrmq;)Ljava/util/Optional;
    //   32: aconst_null
    //   33: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast java/lang/String
    //   39: astore #5
    //   41: aload #7
    //   43: aload_1
    //   44: invokestatic Zs : (Lnet/portswigger/Zrmq;Ljava/net/URL;)Ljava/util/Optional;
    //   47: aconst_null
    //   48: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   51: checkcast java/net/URL
    //   54: astore #6
    //   56: aload_3
    //   57: ifnonnull -> 101
    //   60: iconst_1
    //   61: anewarray burp/Zbqc
    //   64: invokestatic Zr : ([Lburp/Zbqc;)V
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: aload_2
    //   75: invokestatic Z_ : (Ljava/lang/String;)Ljava/util/Optional;
    //   78: aconst_null
    //   79: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   82: checkcast java/lang/String
    //   85: astore #5
    //   87: aload_2
    //   88: aload_1
    //   89: invokestatic Zi : (Ljava/lang/String;Ljava/net/URL;)Ljava/util/Optional;
    //   92: aconst_null
    //   93: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   96: checkcast java/net/URL
    //   99: astore #6
    //   101: aload #5
    //   103: invokestatic isEmpty : (Ljava/lang/String;)Z
    //   106: ifeq -> 117
    //   109: invokestatic ZX : ()Lnet/portswigger/Zhg;
    //   112: athrow
    //   113: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   116: athrow
    //   117: aload #5
    //   119: sipush #-12269
    //   122: sipush #-30832
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   131: ifne -> 175
    //   134: aload #5
    //   136: sipush #-12272
    //   139: sipush #13830
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   148: ifne -> 175
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: sipush #-12261
    //   161: sipush #12748
    //   164: invokestatic a : (II)Ljava/lang/String;
    //   167: invokestatic ZL : (Ljava/lang/String;)Lnet/portswigger/Zhg;
    //   170: athrow
    //   171: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   174: athrow
    //   175: aload #5
    //   177: sipush #-12268
    //   180: sipush #-1393
    //   183: invokestatic a : (II)Ljava/lang/String;
    //   186: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   189: ifeq -> 279
    //   192: new net/portswigger/swagger/v2/SwaggerConverter
    //   195: dup
    //   196: invokespecial <init> : ()V
    //   199: aload_2
    //   200: invokevirtual convertToV3 : (Ljava/lang/String;)Lnet/portswigger/swagger/v2/ConversionResult;
    //   203: astore #7
    //   205: aload #7
    //   207: invokevirtual convertedDefinition : ()Ljava/lang/String;
    //   210: astore_2
    //   211: aload_2
    //   212: ifnonnull -> 262
    //   215: sipush #-12259
    //   218: sipush #-11024
    //   221: invokestatic a : (II)Ljava/lang/String;
    //   224: aload #7
    //   226: invokevirtual messages : ()Ljava/util/List;
    //   229: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   232: iconst_0
    //   233: anewarray java/lang/Object
    //   236: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   239: astore #8
    //   241: aload #8
    //   243: sipush #-12263
    //   246: sipush #1216
    //   249: invokestatic a : (II)Ljava/lang/String;
    //   252: swap
    //   253: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   258: invokestatic ZL : (Ljava/lang/String;)Lnet/portswigger/Zhg;
    //   261: athrow
    //   262: aload_2
    //   263: invokestatic ZX : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   266: aload_1
    //   267: invokestatic Zs : (Lnet/portswigger/Zrmq;Ljava/net/URL;)Ljava/util/Optional;
    //   270: aconst_null
    //   271: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   274: checkcast java/net/URL
    //   277: astore #6
    //   279: aload #6
    //   281: ifnonnull -> 310
    //   284: aload_1
    //   285: ifnull -> 302
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   294: athrow
    //   295: aload_1
    //   296: astore #6
    //   298: aload_3
    //   299: ifnonnull -> 310
    //   302: invokestatic ZL : ()Lnet/portswigger/Zhg;
    //   305: athrow
    //   306: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   309: athrow
    //   310: aload_0
    //   311: getfield ZH : Lorg/openapi4j/Zaw;
    //   314: aload #6
    //   316: aload_2
    //   317: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   320: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
    //   323: iconst_0
    //   324: invokevirtual Zp : (Ljava/net/URL;[BZ)Lorg/openapi4j/Zpf;
    //   327: astore #7
    //   329: aload_0
    //   330: getfield ZP : Ljava/util/List;
    //   333: new net/portswigger/Zov
    //   336: dup
    //   337: aload #7
    //   339: aload #6
    //   341: invokespecial <init> : (Lorg/openapi4j/Zpf;Ljava/net/URL;)V
    //   344: invokevirtual ZT : ()Ljava/util/List;
    //   347: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   352: pop
    //   353: goto -> 376
    //   356: astore #7
    //   358: aload #7
    //   360: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   363: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   366: new net/portswigger/Zhg
    //   369: dup
    //   370: aload #7
    //   372: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   375: athrow
    //   376: aload_0
    //   377: getfield ZP : Ljava/util/List;
    //   380: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   385: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   390: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   395: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   400: invokeinterface flatMap : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   405: invokeinterface toList : ()Ljava/util/List;
    //   410: areturn
    // Exception table:
    //   from	to	target	type
    //   56	67	70	java/lang/Exception
    //   101	113	113	java/lang/Exception
    //   117	151	154	java/lang/Exception
    //   134	171	171	java/lang/Exception
    //   279	288	291	java/lang/Exception
    //   298	306	306	java/lang/Exception
    //   310	353	356	java/lang/Exception
  }
  
  public static Zrmq ZX(String paramString) throws Zhg {
    try {
      String str = ZZ.matcher(paramString).replaceAll("");
      return Zv3.Zp(str);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.RETHROWN);
      throw Zhg.ZL(a(-12260, 1840) + a(-12260, 1840));
    } 
  }
  
  public static Optional<String> ZC(String paramString) throws Zhg {
    return Zq(ZX(paramString));
  }
  
  public static Optional<String> Zq(Zrmq paramZrmq) {
    if (paramZrmq.Za()) {
      Zi7 zi7 = paramZrmq.Zu();
      Zrmq zrmq = zi7.Zo(a(-12258, 1081));
      if (zrmq.ZK())
        zrmq = zi7.Zo(a(-12270, 14801)); 
      return zrmq.Zr() ? Optional.<String>of(zrmq.ZW()) : Optional.<String>empty();
    } 
    return Optional.empty();
  }
  
  public static Optional<String> Z_(String paramString) throws Zhg {
    String str = Zaj.Zo();
    try {
      Map map = (Map)(new Zx((Ztp)new Zt5(new Ztw()))).Zs(paramString);
      Object object = map.get(a(-12257, 29784));
      if (object == null)
        object = map.get(a(-12271, 15426)); 
      if (Zbqc.Zwu() == null)
        Zaj.ZS("ElpNFb"); 
      return Optional.<Object>ofNullable(object).map(Object::toString);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.RETHROWN);
      throw Zhg.ZL(a(-12267, 23300));
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '1ÒÎnù«ÛçqêC"®·C)§m.çlÑ¹ÎJ"qíJ7gðC6Àkøh%µLÊ¼)qó´¶$@ÞÄþ\\tsAZ\\bD@¡8\\r¦ÜÍ\\nP­{´v'ÜM;\\tè}xTë8S"ð¾öãHKíû·iRµ¹ èË=à)1xÑp:E¾Q,ñµcI\\rè­v-¦ëSP_\\bÊ\\b&:ìÊ)I\\bTTs'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #34
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #119
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
    //   68: ldc 'ÿ£Ü"3±8U[R1%,çÖ@ßJ"³õÞ¾Õ°3ýïQäÑ¯³@;lÜ¶¼´ÉÎ¼ [@éorB¼¬+C.ý­º°\\tëZR>¢IP7¹R'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #86
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #33
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
    //   129: putstatic net/portswigger/Zdb.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/Zdb.b : [Ljava/lang/String;
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
    //   212: bipush #31
    //   214: goto -> 244
    //   217: bipush #16
    //   219: goto -> 244
    //   222: bipush #22
    //   224: goto -> 244
    //   227: bipush #72
    //   229: goto -> 244
    //   232: bipush #12
    //   234: goto -> 244
    //   237: bipush #43
    //   239: goto -> 244
    //   242: bipush #24
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
    //   300: sipush #-12264
    //   303: sipush #1648
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: bipush #8
    //   311: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   314: putstatic net/portswigger/Zdb.ZW : Ljava/util/regex/Pattern;
    //   317: sipush #-12262
    //   320: bipush #-125
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: bipush #8
    //   327: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   330: putstatic net/portswigger/Zdb.ZZ : Ljava/util/regex/Pattern;
    //   333: getstatic org/openapi4j/Zpl.Zo : Lcom/fasterxml/Zor/Zy6;
    //   336: getstatic com/fasterxml/Zor/Zyp.ACCEPT_SINGLE_VALUE_AS_ARRAY : Lcom/fasterxml/Zor/Zyp;
    //   339: invokevirtual Zi : (Lcom/fasterxml/Zor/Zyp;)Lcom/fasterxml/Zor/Zy6;
    //   342: pop
    //   343: getstatic org/openapi4j/Zpl.Ze : Lorg/openapi4j/Zz;
    //   346: invokestatic ZU : (Lorg/openapi4j/Zz;)V
    //   349: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD019) & 0xFFFF;
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
      byte b1 = 107;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zdb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */