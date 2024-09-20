package burp;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.portswigger.Zzd;

public class Zgvb {
  private static final String[] a;
  
  private static final String[] b;
  
  public static List<String> ZX(List<String> paramList, boolean paramBoolean) {
    return paramBoolean ? Zw(paramList, Zzd.HTTP_AND_HTTPS) : Zw(paramList, Zzd.SPECIFIED);
  }
  
  public static List<String> Zw(List<String> paramList, Zzd paramZzd) {
    Zzd zzd = (paramZzd == null) ? Zzd.SPECIFIED : paramZzd;
    return (List<String>)paramList.stream().flatMap(zzd::lambda$deriveSeedUrls$0).distinct().collect(Collectors.toList());
  }
  
  private static List<String> ZJ(String paramString, Zzd paramZzd) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: aload_0
    //   9: invokevirtual trim : ()Ljava/lang/String;
    //   12: astore_0
    //   13: invokestatic Zk : ()[I
    //   16: aload_0
    //   17: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   20: astore #4
    //   22: astore_2
    //   23: aload #4
    //   25: sipush #27939
    //   28: sipush #7539
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   37: ifne -> 106
    //   40: aload #4
    //   42: sipush #27941
    //   45: sipush #16690
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   54: ifne -> 106
    //   57: aload_3
    //   58: aload_0
    //   59: sipush #27937
    //   62: sipush #20101
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: swap
    //   69: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   74: invokeinterface add : (Ljava/lang/Object;)Z
    //   79: pop
    //   80: aload_3
    //   81: aload_0
    //   82: sipush #27938
    //   85: bipush #-127
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: swap
    //   91: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   96: invokeinterface add : (Ljava/lang/Object;)Z
    //   101: pop
    //   102: aload_2
    //   103: ifnonnull -> 243
    //   106: aload_1
    //   107: getstatic net/portswigger/Zzd.HTTP_AND_HTTPS : Lnet/portswigger/Zzd;
    //   110: if_acmpne -> 228
    //   113: aload #4
    //   115: sipush #27937
    //   118: sipush #20101
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   127: ifeq -> 179
    //   130: aload_3
    //   131: aload_0
    //   132: invokeinterface add : (Ljava/lang/Object;)Z
    //   137: pop
    //   138: aload_3
    //   139: aload_0
    //   140: sipush #27937
    //   143: sipush #20101
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: invokevirtual length : ()I
    //   152: invokevirtual substring : (I)Ljava/lang/String;
    //   155: sipush #27938
    //   158: bipush #-127
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: swap
    //   164: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   169: invokeinterface add : (Ljava/lang/Object;)Z
    //   174: pop
    //   175: aload_2
    //   176: ifnonnull -> 243
    //   179: aload_3
    //   180: aload_0
    //   181: sipush #27938
    //   184: bipush #-127
    //   186: invokestatic a : (II)Ljava/lang/String;
    //   189: invokevirtual length : ()I
    //   192: invokevirtual substring : (I)Ljava/lang/String;
    //   195: sipush #27937
    //   198: sipush #20101
    //   201: invokestatic a : (II)Ljava/lang/String;
    //   204: swap
    //   205: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   210: invokeinterface add : (Ljava/lang/Object;)Z
    //   215: pop
    //   216: aload_3
    //   217: aload_0
    //   218: invokeinterface add : (Ljava/lang/Object;)Z
    //   223: pop
    //   224: aload_2
    //   225: ifnonnull -> 243
    //   228: aload_1
    //   229: getstatic net/portswigger/Zzd.SPECIFIED : Lnet/portswigger/Zzd;
    //   232: if_acmpne -> 243
    //   235: aload_3
    //   236: aload_0
    //   237: invokeinterface add : (Ljava/lang/Object;)Z
    //   242: pop
    //   243: aload_3
    //   244: areturn
  }
  
  public static List<String> Zv(List<String> paramList) {
    List list = (List)paramList.stream().map(Zgvb::ZL).filter(Objects::nonNull).distinct().collect(Collectors.toList());
    ArrayList<String> arrayList = new ArrayList();
    list.forEach(arrayList::lambda$deriveScopePrefixesFromSeedUrls$1);
    return arrayList;
  }
  
  private static String ZL(String paramString) {
    // Byte code:
    //   0: invokestatic Zk : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   8: astore_3
    //   9: aload_3
    //   10: sipush #27937
    //   13: sipush #20101
    //   16: invokestatic a : (II)Ljava/lang/String;
    //   19: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   22: ifne -> 47
    //   25: aload_3
    //   26: sipush #27938
    //   29: bipush #-127
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   37: ifeq -> 55
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/net/URISyntaxException;)Ljava/net/URISyntaxException;
    //   46: athrow
    //   47: iconst_1
    //   48: goto -> 56
    //   51: invokestatic a : (Ljava/net/URISyntaxException;)Ljava/net/URISyntaxException;
    //   54: athrow
    //   55: iconst_0
    //   56: istore #4
    //   58: iload #4
    //   60: ifeq -> 71
    //   63: aload_0
    //   64: goto -> 87
    //   67: invokestatic a : (Ljava/net/URISyntaxException;)Ljava/net/URISyntaxException;
    //   70: athrow
    //   71: aload_0
    //   72: sipush #27937
    //   75: sipush #20101
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: swap
    //   82: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   87: astore #5
    //   89: new java/net/URL
    //   92: dup
    //   93: aload #5
    //   95: invokespecial <init> : (Ljava/lang/String;)V
    //   98: invokevirtual toURI : ()Ljava/net/URI;
    //   101: astore #6
    //   103: aload #6
    //   105: invokevirtual getPath : ()Ljava/lang/String;
    //   108: invokevirtual isEmpty : ()Z
    //   111: ifeq -> 129
    //   114: aload #6
    //   116: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   119: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   124: astore_2
    //   125: aload_1
    //   126: ifnonnull -> 140
    //   129: aload #6
    //   131: ldc '.'
    //   133: invokevirtual resolve : (Ljava/lang/String;)Ljava/net/URI;
    //   136: invokevirtual toString : ()Ljava/lang/String;
    //   139: astore_2
    //   140: aload_2
    //   141: sipush #27937
    //   144: sipush #20101
    //   147: invokestatic a : (II)Ljava/lang/String;
    //   150: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   153: ifne -> 183
    //   156: aload_2
    //   157: sipush #27938
    //   160: bipush #-127
    //   162: invokestatic a : (II)Ljava/lang/String;
    //   165: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   168: ifne -> 183
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/net/URISyntaxException;)Ljava/net/URISyntaxException;
    //   177: athrow
    //   178: aconst_null
    //   179: astore_2
    //   180: goto -> 205
    //   183: iload #4
    //   185: ifne -> 205
    //   188: aload_2
    //   189: sipush #27937
    //   192: sipush #20101
    //   195: invokestatic a : (II)Ljava/lang/String;
    //   198: invokevirtual length : ()I
    //   201: invokevirtual substring : (I)Ljava/lang/String;
    //   204: astore_2
    //   205: goto -> 220
    //   208: astore #6
    //   210: aload #6
    //   212: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   215: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   218: aconst_null
    //   219: astore_2
    //   220: aload_2
    //   221: areturn
    // Exception table:
    //   from	to	target	type
    //   9	40	43	java/net/URISyntaxException
    //   25	51	51	java/net/URISyntaxException
    //   58	67	67	java/net/URISyntaxException
    //   89	205	208	java/net/URISyntaxException
    //   89	205	208	java/net/MalformedURLException
    //   140	171	174	java/net/URISyntaxException
  }
  
  public static boolean ZV(List<String> paramList, Zzxj paramZzxj, Zbnt paramZbnt, Zr_4 paramZr_4, Zr1j paramZr1j) {
    // Byte code:
    //   0: aload_3
    //   1: new burp/Ztwg
    //   4: dup
    //   5: iconst_1
    //   6: invokespecial <init> : (Z)V
    //   9: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   14: checkcast burp/Zl34
    //   17: astore #5
    //   19: aload_3
    //   20: new burp/Ztwg
    //   23: dup
    //   24: iconst_0
    //   25: invokespecial <init> : (Z)V
    //   28: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   33: checkcast burp/Zl34
    //   36: astore #6
    //   38: aload_1
    //   39: aload #5
    //   41: aload #6
    //   43: aload_3
    //   44: aload #4
    //   46: invokevirtual Zm : (Lburp/Zl34;Lburp/Zl34;Lburp/Zr_4;Lburp/Zr1j;)Lburp/Zlor;
    //   49: astore #7
    //   51: aload_0
    //   52: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   57: aload_2
    //   58: aload_3
    //   59: <illegal opcode> apply : (Lburp/Zbnt;Lburp/Zr_4;)Ljava/util/function/Function;
    //   64: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   69: aload #7
    //   71: <illegal opcode> test : (Lburp/Zz28;)Ljava/util/function/Predicate;
    //   76: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   81: istore #8
    //   83: iload #8
    //   85: ifne -> 92
    //   88: iconst_1
    //   89: goto -> 93
    //   92: iconst_0
    //   93: ireturn
  }
  
  public static Optional<String> ZE(List<String> paramList, Zgyw paramZgyw) {
    return (Zb(paramZgyw) && paramList.stream().anyMatch(Zgvb::lambda$verifyAllSeedUrlsMatchConfig$4)) ? Optional.of(Zrgs.FRAGMENT_IN_URL_IN_LEGACY.ZN(new Object[0])) : Optional.empty();
  }
  
  public static boolean Zb(Zgyw paramZgyw) {
    return paramZgyw.ZU.stream().filter(Zgvb::lambda$usingLegacyMode$5).map(Zgvb::lambda$usingLegacyMode$6).reduce(Zgvb::lambda$usingLegacyMode$7).filter(Zgvb::lambda$usingLegacyMode$8).isPresent();
  }
  
  private static boolean lambda$usingLegacyMode$8(Integer paramInteger) {
    return (paramInteger.intValue() == Zt4o.DONT_USE.ordinal());
  }
  
  private static Integer lambda$usingLegacyMode$7(Integer paramInteger1, Integer paramInteger2) {
    return paramInteger2;
  }
  
  private static Integer lambda$usingLegacyMode$6(Zkbn paramZkbn) {
    return Integer.valueOf(paramZkbn.ZR().ZM(a(27940, -16944), (List<String>)Arrays.<Zt4o>stream(Zt4o.values()).map(Zt4o::ZH).collect(Collectors.toList()), 1));
  }
  
  private static boolean lambda$usingLegacyMode$5(Zkbn paramZkbn) {
    return paramZkbn.ZR().Zh(a(27936, 4487));
  }
  
  private static boolean lambda$verifyAllSeedUrlsMatchConfig$4(String paramString) {
    return paramString.contains("#");
  }
  
  private static boolean lambda$verifyAllSeedUrlsAreInScope$3(Zz28 paramZz28, Zlit paramZlit) {
    return !paramZz28.ZG(paramZlit);
  }
  
  private static Zlit lambda$verifyAllSeedUrlsAreInScope$2(Zbnt paramZbnt, Zr_4 paramZr_4, String paramString) {
    return Zmg3.Zl(paramString, paramZbnt, paramZr_4);
  }
  
  private static void lambda$deriveScopePrefixesFromSeedUrls$1(List paramList, String paramString) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: invokestatic Zk : ()[I
    //   5: iconst_0
    //   6: istore #4
    //   8: astore_2
    //   9: iload #4
    //   11: aload_0
    //   12: invokeinterface size : ()I
    //   17: if_icmpge -> 92
    //   20: aload_0
    //   21: iload #4
    //   23: invokeinterface get : (I)Ljava/lang/Object;
    //   28: checkcast java/lang/String
    //   31: astore #5
    //   33: aload #5
    //   35: aload_1
    //   36: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   39: ifeq -> 70
    //   42: aload #5
    //   44: invokevirtual length : ()I
    //   47: aload_1
    //   48: invokevirtual length : ()I
    //   51: if_icmple -> 70
    //   54: aload_0
    //   55: iload #4
    //   57: aload_1
    //   58: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   63: pop
    //   64: iconst_0
    //   65: istore_3
    //   66: aload_2
    //   67: ifnonnull -> 85
    //   70: iload_3
    //   71: ifeq -> 85
    //   74: aload_1
    //   75: aload #5
    //   77: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   80: ifeq -> 85
    //   83: iconst_0
    //   84: istore_3
    //   85: iinc #4, 1
    //   88: aload_2
    //   89: ifnonnull -> 9
    //   92: iload_3
    //   93: ifeq -> 104
    //   96: aload_0
    //   97: aload_1
    //   98: invokeinterface add : (Ljava/lang/Object;)Z
    //   103: pop
    //   104: return
  }
  
  private static Stream lambda$deriveSeedUrls$0(Zzd paramZzd, String paramString) {
    return ZJ(paramString, paramZzd).stream();
  }
  
  private static URISyntaxException a(URISyntaxException paramURISyntaxException) {
    return paramURISyntaxException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Hß`Ï3YÉ²÷¯öpDyÿÓ4×ÊLPåú*mîªoEò$¤_G¨\\rùÁÇ\\nü°Þü?ÇÈ-\\bÇ\\tyåSè"'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #79
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
    //   68: ldc '/®Õ¸Ë3Ê¾ûwÝ¦5©Õýrô§4µÍìz ¿£»å\7¢Àáo%ÓV¤°HÃP¹ø¤'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #28
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
    //   129: putstatic burp/Zgvb.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgvb.b : [Ljava/lang/String;
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
    //   212: bipush #27
    //   214: goto -> 244
    //   217: bipush #75
    //   219: goto -> 244
    //   222: bipush #48
    //   224: goto -> 244
    //   227: bipush #29
    //   229: goto -> 244
    //   232: bipush #79
    //   234: goto -> 244
    //   237: bipush #61
    //   239: goto -> 244
    //   242: bipush #41
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6D21) & 0xFFFF;
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
      byte b1 = 11;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */