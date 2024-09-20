package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import net.portswigger.Zlz;

public class Zs0p {
  private static final Set<String> Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zlit ZD(Zz3o paramZz3o, String paramString, Zlit paramZlit, List<? extends Ze7n> paramList) {
    // Byte code:
    //   0: invokestatic ZO : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getstatic burp/Zz3o.FORM : Lburp/Zz3o;
    //   9: if_acmpeq -> 19
    //   12: aload_0
    //   13: getstatic burp/Zz3o.SUBMIT : Lburp/Zz3o;
    //   16: if_acmpne -> 39
    //   19: sipush #1492
    //   22: sipush #-14858
    //   25: invokestatic a : (II)Ljava/lang/String;
    //   28: aload_1
    //   29: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   32: ifeq -> 39
    //   35: iconst_1
    //   36: goto -> 40
    //   39: iconst_0
    //   40: istore #5
    //   42: iload #5
    //   44: ifeq -> 63
    //   47: ldc ''
    //   49: astore #6
    //   51: iload #4
    //   53: ifeq -> 69
    //   56: iconst_1
    //   57: anewarray burp/Zbqc
    //   60: invokestatic Zr : ([Lburp/Zbqc;)V
    //   63: aload_2
    //   64: invokestatic Z_ : (Lburp/Zlit;)Ljava/lang/String;
    //   67: astore #6
    //   69: new java/util/LinkedHashMap
    //   72: dup
    //   73: invokespecial <init> : ()V
    //   76: astore #7
    //   78: aload_3
    //   79: invokeinterface iterator : ()Ljava/util/Iterator;
    //   84: astore #8
    //   86: aload #8
    //   88: invokeinterface hasNext : ()Z
    //   93: ifeq -> 268
    //   96: aload #8
    //   98: invokeinterface next : ()Ljava/lang/Object;
    //   103: checkcast burp/Ze7n
    //   106: astore #9
    //   108: aload #9
    //   110: invokeinterface ZW : ()Ljava/lang/String;
    //   115: invokestatic Zu : (Ljava/lang/String;)Z
    //   118: ifeq -> 263
    //   121: aload #9
    //   123: invokeinterface ZI : ()Lburp/Zz_4;
    //   128: getstatic burp/Zz_4.URL : Lburp/Zz_4;
    //   131: if_acmpne -> 263
    //   134: aload #9
    //   136: getstatic burp/Zrdu.URL_PARAM : Lburp/Zrdu;
    //   139: invokestatic ZM : (Lburp/Ze7n;Lburp/Zrdu;)Ljava/util/List;
    //   142: invokeinterface iterator : ()Ljava/util/Iterator;
    //   147: astore #10
    //   149: aload #10
    //   151: invokeinterface hasNext : ()Z
    //   156: ifeq -> 263
    //   159: aload #10
    //   161: invokeinterface next : ()Ljava/lang/Object;
    //   166: checkcast burp/Zt8g
    //   169: astore #11
    //   171: aload #9
    //   173: instanceof burp/Zs3b
    //   176: ifeq -> 194
    //   179: aload #9
    //   181: checkcast burp/Zs3b
    //   184: astore #13
    //   186: aload #13
    //   188: invokevirtual Zx : ()Lburp/Zb2c;
    //   191: goto -> 197
    //   194: getstatic burp/Zb2c.NONE : Lburp/Zb2c;
    //   197: astore #12
    //   199: aload #7
    //   201: aload #11
    //   203: invokeinterface Zns : ()Ljava/lang/String;
    //   208: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   213: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   218: checkcast java/util/List
    //   221: new burp/Zlsq
    //   224: dup
    //   225: aload #11
    //   227: invokeinterface Zbn : ()Ljava/lang/String;
    //   232: ifnonnull -> 240
    //   235: ldc ''
    //   237: goto -> 247
    //   240: aload #11
    //   242: invokeinterface Zbn : ()Ljava/lang/String;
    //   247: aload #12
    //   249: invokespecial <init> : (Ljava/lang/String;Lburp/Zb2c;)V
    //   252: invokeinterface add : (Ljava/lang/Object;)Z
    //   257: pop
    //   258: iload #4
    //   260: ifeq -> 149
    //   263: iload #4
    //   265: ifeq -> 86
    //   268: new java/util/StringJoiner
    //   271: dup
    //   272: ldc '&'
    //   274: invokespecial <init> : (Ljava/lang/CharSequence;)V
    //   277: astore #8
    //   279: aload #7
    //   281: invokeinterface entrySet : ()Ljava/util/Set;
    //   286: invokeinterface iterator : ()Ljava/util/Iterator;
    //   291: astore #9
    //   293: aload #9
    //   295: invokeinterface hasNext : ()Z
    //   300: ifeq -> 562
    //   303: aload #9
    //   305: invokeinterface next : ()Ljava/lang/Object;
    //   310: checkcast java/util/Map$Entry
    //   313: astore #10
    //   315: aload #10
    //   317: invokeinterface getValue : ()Ljava/lang/Object;
    //   322: checkcast java/util/List
    //   325: astore #11
    //   327: new java/lang/StringBuilder
    //   330: dup
    //   331: aload #10
    //   333: invokeinterface getKey : ()Ljava/lang/Object;
    //   338: checkcast java/lang/String
    //   341: aload #11
    //   343: iconst_0
    //   344: invokeinterface get : (I)Ljava/lang/Object;
    //   349: checkcast burp/Zlsq
    //   352: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   355: checkcast burp/Zlsq
    //   358: invokevirtual Zlj : ()Ljava/lang/String;
    //   361: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   366: invokespecial <init> : (Ljava/lang/String;)V
    //   369: astore #12
    //   371: iconst_1
    //   372: istore #13
    //   374: iload #13
    //   376: aload #11
    //   378: invokeinterface size : ()I
    //   383: if_icmpge -> 549
    //   386: aload #11
    //   388: iload #13
    //   390: invokeinterface get : (I)Ljava/lang/Object;
    //   395: checkcast burp/Zlsq
    //   398: astore #14
    //   400: getstatic burp/Zt7g.ZG : [I
    //   403: aload #14
    //   405: getfield Zp : Lburp/Zb2c;
    //   408: invokevirtual ordinal : ()I
    //   411: iaload
    //   412: tableswitch default -> 541, 1 -> 444, 2 -> 483, 3 -> 504, 4 -> 525
    //   444: aload #12
    //   446: ldc '&'
    //   448: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   451: aload #10
    //   453: invokeinterface getKey : ()Ljava/lang/Object;
    //   458: checkcast java/lang/String
    //   461: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: ldc '='
    //   466: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   469: aload #14
    //   471: invokevirtual Zlj : ()Ljava/lang/String;
    //   474: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   477: pop
    //   478: iload #4
    //   480: ifeq -> 541
    //   483: aload #12
    //   485: ldc ','
    //   487: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   490: aload #14
    //   492: invokevirtual Zlj : ()Ljava/lang/String;
    //   495: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: pop
    //   499: iload #4
    //   501: ifeq -> 541
    //   504: aload #12
    //   506: ldc ' '
    //   508: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: aload #14
    //   513: invokevirtual Zlj : ()Ljava/lang/String;
    //   516: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   519: pop
    //   520: iload #4
    //   522: ifeq -> 541
    //   525: aload #12
    //   527: ldc '|'
    //   529: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   532: aload #14
    //   534: invokevirtual Zlj : ()Ljava/lang/String;
    //   537: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   540: pop
    //   541: iinc #13, 1
    //   544: iload #4
    //   546: ifeq -> 374
    //   549: aload #8
    //   551: aload #12
    //   553: invokevirtual add : (Ljava/lang/CharSequence;)Ljava/util/StringJoiner;
    //   556: pop
    //   557: iload #4
    //   559: ifeq -> 293
    //   562: aload #8
    //   564: invokevirtual toString : ()Ljava/lang/String;
    //   567: astore #9
    //   569: aload #6
    //   571: invokestatic Zu : (Ljava/lang/String;)Z
    //   574: ifeq -> 601
    //   577: aload #9
    //   579: invokestatic Zu : (Ljava/lang/String;)Z
    //   582: ifeq -> 601
    //   585: aload #6
    //   587: aload #9
    //   589: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   594: astore #10
    //   596: iload #4
    //   598: ifeq -> 639
    //   601: aload #6
    //   603: invokestatic Zu : (Ljava/lang/String;)Z
    //   606: ifeq -> 618
    //   609: aload #6
    //   611: astore #10
    //   613: iload #4
    //   615: ifeq -> 639
    //   618: aload #9
    //   620: invokestatic Zu : (Ljava/lang/String;)Z
    //   623: ifeq -> 635
    //   626: aload #9
    //   628: astore #10
    //   630: iload #4
    //   632: ifeq -> 639
    //   635: ldc ''
    //   637: astore #10
    //   639: iload #5
    //   641: ifne -> 652
    //   644: aload #10
    //   646: invokestatic Zu : (Ljava/lang/String;)Z
    //   649: ifeq -> 661
    //   652: aload #10
    //   654: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   659: astore #10
    //   661: new burp/Zax
    //   664: dup
    //   665: aload_2
    //   666: invokeinterface Zdz : ()Lburp/Zmzk;
    //   671: iconst_2
    //   672: anewarray [B
    //   675: dup
    //   676: iconst_0
    //   677: aload_2
    //   678: invokeinterface Zd4 : ()[B
    //   683: aastore
    //   684: dup
    //   685: iconst_1
    //   686: aload #10
    //   688: invokestatic Zy : (Ljava/lang/String;)[B
    //   691: aastore
    //   692: invokestatic Zq : ([[B)[B
    //   695: invokespecial <init> : (Lburp/Zmzk;[B)V
    //   698: areturn
  }
  
  private static String Z_(Zlit paramZlit) {
    // Byte code:
    //   0: invokestatic ZB : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: invokeinterface Zds : ()Z
    //   10: ifne -> 16
    //   13: ldc ''
    //   15: areturn
    //   16: new java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: astore_2
    //   24: aload_0
    //   25: invokeinterface ZdC : ()[B
    //   30: invokestatic ZG : ([B)Ljava/lang/String;
    //   33: invokevirtual toCharArray : ()[C
    //   36: astore_3
    //   37: aload_3
    //   38: arraylength
    //   39: istore #4
    //   41: iconst_0
    //   42: istore #5
    //   44: iload #5
    //   46: iload #4
    //   48: if_icmpge -> 123
    //   51: aload_3
    //   52: iload #5
    //   54: caload
    //   55: istore #6
    //   57: iload #6
    //   59: bipush #63
    //   61: if_icmpeq -> 92
    //   64: iload #6
    //   66: bipush #38
    //   68: if_icmpeq -> 92
    //   71: iload #6
    //   73: bipush #61
    //   75: if_icmpeq -> 92
    //   78: iload #6
    //   80: bipush #37
    //   82: if_icmpeq -> 92
    //   85: iload #6
    //   87: bipush #43
    //   89: if_icmpne -> 103
    //   92: aload_2
    //   93: iload #6
    //   95: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: iload_1
    //   100: ifne -> 116
    //   103: aload_2
    //   104: iload #6
    //   106: invokestatic valueOf : (C)Ljava/lang/String;
    //   109: invokestatic Zk : (Ljava/lang/String;)Ljava/lang/String;
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: iinc #5, 1
    //   119: iload_1
    //   120: ifne -> 44
    //   123: aload_2
    //   124: invokevirtual toString : ()Ljava/lang/String;
    //   127: areturn
  }
  
  public static Zstu ZU(String paramString, Zt5v paramZt5v, List<? extends Ze7n> paramList, Zlai paramZlai) {
    List<Ze7n> list = (List)paramList.stream().filter(Zs0p::lambda$buildRequestBodyAndAddContentTypeHeader$1).filter(Zs0p::lambda$buildRequestBodyAndAddContentTypeHeader$2).collect(Collectors.toList());
    if (list.isEmpty() && !Zs.contains(paramString))
      return null; 
    paramZlai.ZA(paramZt5v.Zf());
    return paramZt5v.Zt(list);
  }
  
  private static boolean lambda$buildRequestBodyAndAddContentTypeHeader$2(Ze7n paramZe7n) {
    return (paramZe7n.ZI() == Zz_4.BODY);
  }
  
  private static boolean lambda$buildRequestBodyAndAddContentTypeHeader$1(Ze7n paramZe7n) {
    return Zlz.Zu(paramZe7n.ZW());
  }
  
  private static List lambda$addInputValuesToUrl$0(String paramString) {
    return new ArrayList();
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Ux\\r±ÓÓÚ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_4
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #82
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 139
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: ldc 'þbkùã '
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: iconst_3
    //   76: istore_1
    //   77: iconst_m1
    //   78: istore_0
    //   79: bipush #54
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 139
    //   96: aload #5
    //   98: swap
    //   99: iload_3
    //   100: iinc #3, 1
    //   103: swap
    //   104: aastore
    //   105: iload_0
    //   106: iload_1
    //   107: iadd
    //   108: dup
    //   109: istore_0
    //   110: iload #4
    //   112: if_icmpge -> 124
    //   115: aload_2
    //   116: iload_0
    //   117: invokevirtual charAt : (I)C
    //   120: istore_1
    //   121: goto -> 79
    //   124: aload #5
    //   126: putstatic burp/Zs0p.a : [Ljava/lang/String;
    //   129: iconst_4
    //   130: anewarray java/lang/String
    //   133: putstatic burp/Zs0p.b : [Ljava/lang/String;
    //   136: goto -> 296
    //   139: dup_x2
    //   140: pop
    //   141: invokevirtual toCharArray : ()[C
    //   144: dup_x1
    //   145: arraylength
    //   146: dup_x2
    //   147: pop
    //   148: iconst_0
    //   149: istore #6
    //   151: dup2_x1
    //   152: pop2
    //   153: dup_x2
    //   154: iconst_1
    //   155: if_icmpgt -> 256
    //   158: dup2
    //   159: swap
    //   160: iload #6
    //   162: dup2_x1
    //   163: caload
    //   164: swap
    //   165: iload #6
    //   167: bipush #7
    //   169: irem
    //   170: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #110
    //   210: goto -> 240
    //   213: bipush #64
    //   215: goto -> 240
    //   218: bipush #123
    //   220: goto -> 240
    //   223: bipush #92
    //   225: goto -> 240
    //   228: bipush #54
    //   230: goto -> 240
    //   233: bipush #77
    //   235: goto -> 240
    //   238: bipush #90
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 162
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 158
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 96
    //   296: sipush #1494
    //   299: sipush #6959
    //   302: invokestatic a : (II)Ljava/lang/String;
    //   305: sipush #1495
    //   308: sipush #-7153
    //   311: invokestatic a : (II)Ljava/lang/String;
    //   314: sipush #1493
    //   317: sipush #22914
    //   320: invokestatic a : (II)Ljava/lang/String;
    //   323: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   326: putstatic burp/Zs0p.Zs : Ljava/util/Set;
    //   329: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5D6) & 0xFFFF;
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
      byte b1 = 77;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs0p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */