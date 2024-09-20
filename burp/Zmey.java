package burp;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmey {
  private static final Set<String> Zk;
  
  private static Function<String, String> Zf;
  
  public static final Function<String, String> ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static String Zn(byte[] paramArrayOfbyte) {
    return ZW(Zkb.ZG(paramArrayOfbyte));
  }
  
  public static String ZW(String paramString) {
    paramString = Zx(paramString);
    ZS(paramString);
    return paramString;
  }
  
  public static boolean ZS(Zefg<Zxtl> paramZefg) {
    Zxtl zxtl = paramZefg.get(paramZefg.size() - 1);
    return zxtl.ZTr().ZM();
  }
  
  public static String ZZ(String paramString) {
    return Zs(paramString, Collections.emptySet());
  }
  
  public static String Z_(String paramString) {
    return Zs(paramString, Zk);
  }
  
  private static String Zs(String paramString, Set<String> paramSet) {
    String[] arrayOfString = Zx_5.Zq();
    if (paramString == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    byte[] arrayOfByte = paramString.getBytes(StandardCharsets.UTF_8);
    List<Ztu8> list = Zeam.Zf(arrayOfByte, 0, arrayOfByte.length, (byte)0, StandardCharsets.UTF_8.name());
    for (Ztu8 ztu8 : list) {
      switch (ztu8.ZlD()) {
        case 0:
        case 1:
        case 4:
          ZK(stringBuilder, ztu8, paramString, paramSet);
        case 3:
          ZI(stringBuilder, ztu8.Zlv());
        case 2:
        
        default:
          Zuh.Zv(false, Zqf.Zk, ztu8.ZlD());
          break;
      } 
      continue;
      if (arrayOfString != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  private static void ZI(StringBuilder paramStringBuilder, String paramString) {
    String str = paramString.replace("<", a(23953, 16908)).replace(">", a(23985, -16192));
    paramStringBuilder.append(str);
  }
  
  private static void ZK(StringBuilder paramStringBuilder, Ztu8 paramZtu8, String paramString, Set<String> paramSet) {
    Zs_n zs_n = paramZtu8.ZlP();
    boolean bool = ZD(zs_n, paramSet);
    String[] arrayOfString = Zx_5.Zq();
    paramStringBuilder.append(bool ? "<" : a(23954, -14342));
    if (paramZtu8.ZlD() == 1)
      paramStringBuilder.append("/"); 
    ZI(paramStringBuilder, zs_n.ZJ3().toLowerCase());
    for (Zs5n zs5n : zs_n.ZJo()) {
      if (ZT(zs_n, zs5n, paramString)) {
        paramStringBuilder.append(" ");
        ZI(paramStringBuilder, zs5n.ZQd());
        paramStringBuilder.append(a(23999, 7056));
        ZI(paramStringBuilder, zs5n.ZQG());
        paramStringBuilder.append("\"");
      } 
      if (arrayOfString != null)
        break; 
    } 
    paramStringBuilder.append(bool ? ">" : a(23997, 16725));
  }
  
  private static boolean ZD(Zs_n paramZs_n, Set<String> paramSet) {
    return paramSet.contains(paramZs_n.ZJ3().toLowerCase());
  }
  
  private static boolean ZT(Zs_n paramZs_n, Zs5n paramZs5n, String paramString) {
    if (paramString.length() <= paramZs5n.ZQc())
      return false; 
    String str1 = paramZs_n.ZJ3().toLowerCase();
    String str2 = paramZs5n.ZQd().toLowerCase();
    return ("a".equals(str1) && a(23987, 1040).equals(str2)) ? Zh(paramZs5n) : false;
  }
  
  private static boolean Zh(Zs5n paramZs5n) {
    String str = paramZs5n.ZQG().toLowerCase();
    return (!str.startsWith(a(23986, 8699)) && !str.startsWith(a(23984, 23791))) ? false : ((!str.contains("\"") && !str.contains("'") && !str.contains("`") && !str.contains("<") && !str.contains(">")));
  }
  
  private static String Zx(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    char[] arrayOfChar = paramString.toCharArray();
    int i = arrayOfChar.length;
    String[] arrayOfString = Zx_5.Zq();
    byte b = 0;
    while (b < i) {
      char c = arrayOfChar[b];
      switch (c) {
        case '\000':
          stringBuilder.append(a(23993, 31923));
        case '\r':
          stringBuilder.append(a(23991, -29539));
        case '\n':
          stringBuilder.append(a(23948, -47));
        case '':
          stringBuilder.append(a(23968, -19477));
        case '®':
          stringBuilder.append(a(23943, 17851));
        case '¯':
          stringBuilder.append(a(23949, 7892));
        case 'À':
          stringBuilder.append(a(23944, 15850));
        case 'Á':
          stringBuilder.append(a(23964, -5548));
        case '':
          stringBuilder.append(a(23960, 28288));
        case '\001':
          stringBuilder.append(a(23998, -29930));
        default:
          stringBuilder.append(c);
          break;
      } 
      b++;
      continue;
      if (arrayOfString != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  private static void ZS(String paramString) {
    char[] arrayOfChar = paramString.toCharArray();
    int i = arrayOfChar.length;
    String[] arrayOfString = Zx_5.Zq();
    byte b = 0;
    while (b < i) {
      char c = arrayOfChar[b];
      Zuh.Zb((c >= '\000' && c < ''), Zqf.Zk, Integer.toHexString(c), paramString);
      b++;
      if (arrayOfString != null)
        break; 
    } 
  }
  
  public static boolean Zv(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    Zefg<Zxtl> zefg1 = paramZrdb1.Zaq();
    Zefg<Zxtl> zefg2 = paramZrdb2.Zaq();
    String[] arrayOfString = Zx_5.Zq();
    if (zefg1 == null && zefg2 == null)
      return false; 
    if (zefg1 == null || zefg2 == null)
      return true; 
    if (zefg1.size() != zefg2.size())
      return true; 
    byte b = 0;
    while (b < zefg1.size()) {
      Zxtl zxtl1 = zefg1.get(b);
      Zxtl zxtl2 = zefg2.get(b);
      if (zxtl1.ZTr() != zxtl2.ZTr() || (zxtl1.ZTs() != null && !zxtl1.ZTs().equals(zxtl2.ZTs())))
        return true; 
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return false;
  }
  
  public static String Ze(List<Zrdb> paramList) {
    Zmzk zmzk = ((Zrdb)paramList.get(0)).ZaB();
    byte b = 1;
    String[] arrayOfString = Zx_5.Zq();
    while (b < paramList.size()) {
      if (!((Zrdb)paramList.get(b)).ZaB().equals(zmzk)) {
        zmzk = null;
        break;
      } 
      b++;
      if (arrayOfString != null)
        break; 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(Integer.toString(paramList.size()));
    stringBuilder.append(a(23990, -4861));
    for (Zrdb zrdb : paramList) {
      stringBuilder.append(a(23942, 15714));
      if (zmzk == null)
        stringBuilder.append(zrdb.ZaB().toString()); 
      Zrlp.Zn(stringBuilder, zrdb.Za0());
      stringBuilder.append(a(23950, -26626));
      if (arrayOfString != null)
        break; 
    } 
    stringBuilder.append(a(23969, 13505));
    return stringBuilder.toString();
  }
  
  public static int Ze(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    int i = Zb3i.ZZ(paramZrdb1, paramZrdb2);
    if (i != 0)
      return i; 
    String str1 = paramZrdb1.Za0();
    if (str1 == null)
      return 1; 
    String str2 = paramZrdb2.Za0();
    return (str2 == null) ? -1 : str1.compareTo(str2);
  }
  
  public static void Zz(StringBuilder paramStringBuilder, long paramLong1, long paramLong2, String paramString) {
    String[] arrayOfString = Zx_5.Zq();
    if (paramLong2 == 0L) {
      paramStringBuilder.append(a(23936, 29442)).append(paramString).append(a(23962, -7009));
      if (arrayOfString != null) {
        paramStringBuilder.append(a(23955, 3659));
        paramStringBuilder.append(Long.toString(paramLong2));
        paramStringBuilder.append(a(23959, 30381));
        paramStringBuilder.append(Long.toString(paramLong1));
        paramStringBuilder.append(a(23946, -7029)).append(paramString).append(a(23945, -15503));
        return;
      } 
      return;
    } 
    paramStringBuilder.append(a(23955, 3659));
    paramStringBuilder.append(Long.toString(paramLong2));
    paramStringBuilder.append(a(23959, 30381));
    paramStringBuilder.append(Long.toString(paramLong1));
    paramStringBuilder.append(a(23946, -7029)).append(paramString).append(a(23945, -15503));
  }
  
  public static Zl4m ZL(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    if (paramZrdb1.Za6() != paramZrdb2.Za6())
      return Zl4m.ZX; 
    if (Zv(paramZrdb1, paramZrdb2) || paramZrdb1.Zam() != paramZrdb2.Zam() || paramZrdb1.Za8() != paramZrdb2.Za8())
      return Zl4m.ZX; 
    byte b1 = paramZrdb1.Zaw();
    byte b2 = paramZrdb2.Zaw();
    byte b3 = paramZrdb1.Zak();
    byte b4 = paramZrdb2.Zak();
    return (b1 >= b2 && b3 >= b4) ? Zl4m.Zh : ((b1 <= b2 && b3 <= b4) ? Zl4m.Zf : Zl4m.ZX);
  }
  
  public static String ZY(List<Zrdb> paramList, String paramString1, String paramString2) {
    return ZC(paramList, paramString1, paramString2, Zf);
  }
  
  public static String ZC(List<Zrdb> paramList, String paramString1, String paramString2, Function<String, String> paramFunction) {
    // Byte code:
    //   0: new java/util/TreeSet
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: invokestatic Zq : ()[Ljava/lang/String;
    //   12: aload_0
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore #6
    //   20: astore #4
    //   22: aload #6
    //   24: invokeinterface hasNext : ()Z
    //   29: ifeq -> 131
    //   32: aload #6
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: checkcast burp/Zrdb
    //   42: astore #7
    //   44: aload #7
    //   46: invokeinterface Za7 : ()Lburp/Ztub;
    //   51: invokevirtual Zt : ()Lburp/Zt38;
    //   54: invokeinterface ZCr : ()Lburp/Zefg;
    //   59: astore #8
    //   61: aload #8
    //   63: ifnull -> 126
    //   66: aload #8
    //   68: invokeinterface iterator : ()Ljava/util/Iterator;
    //   73: astore #9
    //   75: aload #9
    //   77: invokeinterface hasNext : ()Z
    //   82: ifeq -> 126
    //   85: aload #9
    //   87: invokeinterface next : ()Ljava/lang/Object;
    //   92: checkcast burp/Zsdr
    //   95: astore #10
    //   97: aload #5
    //   99: aload_3
    //   100: aload #10
    //   102: invokeinterface toString : ()Ljava/lang/String;
    //   107: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
    //   112: checkcast java/lang/String
    //   115: invokeinterface add : (Ljava/lang/Object;)Z
    //   120: pop
    //   121: aload #4
    //   123: ifnull -> 75
    //   126: aload #4
    //   128: ifnull -> 22
    //   131: new java/lang/StringBuilder
    //   134: dup
    //   135: invokespecial <init> : ()V
    //   138: astore #6
    //   140: aload #6
    //   142: aload_0
    //   143: invokeinterface size : ()I
    //   148: invokestatic toString : (I)Ljava/lang/String;
    //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload #6
    //   157: sipush #23967
    //   160: sipush #-22908
    //   163: invokestatic a : (II)Ljava/lang/String;
    //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: aload #5
    //   172: invokeinterface size : ()I
    //   177: istore #7
    //   179: iload #7
    //   181: iconst_1
    //   182: if_icmpne -> 212
    //   185: aload #6
    //   187: aload_1
    //   188: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: aload #6
    //   194: sipush #23956
    //   197: sipush #9472
    //   200: invokestatic a : (II)Ljava/lang/String;
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: aload #4
    //   209: ifnull -> 260
    //   212: aload #6
    //   214: iload #7
    //   216: invokestatic toString : (I)Ljava/lang/String;
    //   219: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: pop
    //   223: aload #6
    //   225: sipush #23938
    //   228: sipush #13935
    //   231: invokestatic a : (II)Ljava/lang/String;
    //   234: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: pop
    //   238: aload #6
    //   240: aload_2
    //   241: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: pop
    //   245: aload #6
    //   247: sipush #23966
    //   250: sipush #14519
    //   253: invokestatic a : (II)Ljava/lang/String;
    //   256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: pop
    //   260: aload #5
    //   262: invokeinterface iterator : ()Ljava/util/Iterator;
    //   267: astore #8
    //   269: aload #8
    //   271: invokeinterface hasNext : ()Z
    //   276: ifeq -> 333
    //   279: aload #8
    //   281: invokeinterface next : ()Ljava/lang/Object;
    //   286: checkcast java/lang/String
    //   289: astore #9
    //   291: aload #6
    //   293: sipush #23939
    //   296: sipush #-9368
    //   299: invokestatic a : (II)Ljava/lang/String;
    //   302: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: pop
    //   306: aload #6
    //   308: aload #9
    //   310: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   313: aload #6
    //   315: sipush #23965
    //   318: sipush #14287
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: pop
    //   328: aload #4
    //   330: ifnull -> 269
    //   333: aload #6
    //   335: sipush #23992
    //   338: sipush #28705
    //   341: invokestatic a : (II)Ljava/lang/String;
    //   344: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: pop
    //   348: aload #6
    //   350: invokevirtual toString : ()Ljava/lang/String;
    //   353: areturn
  }
  
  public static String Zh(Zmzk paramZmzk) {
    return paramZmzk.toString().replaceFirst(a(23995, 29825), "");
  }
  
  private static String lambda$static$1(String paramString) {
    return paramString.replaceFirst(a(23947, 11355), "");
  }
  
  private static String lambda$static$0(String paramString) {
    return paramString;
  }
  
  static {
    // Byte code:
    //   0: bipush #50
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ài¹ôknØCLÖÿ­à9×Í@´-J«¡Ü`¬Ü8³2é'{$g¤.>YkæÔÎÞ¹>ÚÏñF¾fj{\\rðbEÃn#\\tC§NQ²Dò{r]ÛEÊô )±GP$O£)?qëJÊo6¼EY®³Ë9Tû/É@¼!O\\fì÷²ö·´Õj»¨[îê'£@ÎÔ/\\rp$ÿ8p·)¾Ûö Pù\\rûìßÓ-Z°ÏlÂÀ\\fÕ¾²ò3áo<¿!J¢ÖÕ·Abö»D,©°h´­t)ÐÆ\\bDd @Ö\WF¦òUÞ(êmûGÅÚ®}Ý`"é axË¯ê­Ö u÷4à«9l^×ÂÚH­1'Ñx$@Aû"(¢¨iâÄ×< ûòÛÕ­>qÆx\\bÂ¶¡Êé?y1ô±(-Ya\\bÕ¾)T\\r¶¶{¤¤×¬ûpSõëòMóTÿ\\f3CûB4ñ~Ù5èsILÈ=Dèð´®{Ø½vÓÎ[9U¯ æTFÓ¤\\b!p7rBÚ~nÆÓJ¾z¤ÙÃÝÕhÆ{iËÅ^é$­ >ÒCOúÌw¡*^/îâ,d«Uo\.>/\\bDCô>#ì×ôótcqÛëþ69xû\\t¨Ä0á<IRmkSÅçwrÿØ¤/á/U¨\\n[Kçík(H§ÄË+¶Nð8/ÖÌÂ©V~Ñ«Ô7hðfðT|ÜuÂØ\\rÃì@tæùúQàºôËRåÀ4°+]^_~GHòmXS}ýÅIPÜµ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #95
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 140
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
    //   67: ldc '\\rD¯½FEoB­'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_5
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: iconst_3
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 140
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
    //   121: goto -> 80
    //   124: aload #5
    //   126: putstatic burp/Zmey.a : [Ljava/lang/String;
    //   129: bipush #50
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zmey.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 256
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #124
    //   210: goto -> 240
    //   213: bipush #20
    //   215: goto -> 240
    //   218: bipush #86
    //   220: goto -> 240
    //   223: bipush #73
    //   225: goto -> 240
    //   228: bipush #87
    //   230: goto -> 240
    //   233: bipush #73
    //   235: goto -> 240
    //   238: bipush #71
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 163
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 159
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 39, 0 -> 96
    //   296: new java/util/HashSet
    //   299: dup
    //   300: bipush #17
    //   302: anewarray java/lang/String
    //   305: dup
    //   306: iconst_0
    //   307: ldc 'b'
    //   309: aastore
    //   310: dup
    //   311: iconst_1
    //   312: sipush #23941
    //   315: sipush #25722
    //   318: invokestatic a : (II)Ljava/lang/String;
    //   321: aastore
    //   322: dup
    //   323: iconst_2
    //   324: ldc 'i'
    //   326: aastore
    //   327: dup
    //   328: iconst_3
    //   329: ldc 'p'
    //   331: aastore
    //   332: dup
    //   333: iconst_4
    //   334: sipush #23989
    //   337: sipush #-32585
    //   340: invokestatic a : (II)Ljava/lang/String;
    //   343: aastore
    //   344: dup
    //   345: iconst_5
    //   346: ldc 'a'
    //   348: aastore
    //   349: dup
    //   350: bipush #6
    //   352: sipush #23957
    //   355: sipush #-25253
    //   358: invokestatic a : (II)Ljava/lang/String;
    //   361: aastore
    //   362: dup
    //   363: bipush #7
    //   365: sipush #23963
    //   368: sipush #12192
    //   371: invokestatic a : (II)Ljava/lang/String;
    //   374: aastore
    //   375: dup
    //   376: bipush #8
    //   378: sipush #23951
    //   381: sipush #8900
    //   384: invokestatic a : (II)Ljava/lang/String;
    //   387: aastore
    //   388: dup
    //   389: bipush #9
    //   391: sipush #23952
    //   394: sipush #-780
    //   397: invokestatic a : (II)Ljava/lang/String;
    //   400: aastore
    //   401: dup
    //   402: bipush #10
    //   404: sipush #23994
    //   407: sipush #1970
    //   410: invokestatic a : (II)Ljava/lang/String;
    //   413: aastore
    //   414: dup
    //   415: bipush #11
    //   417: sipush #23940
    //   420: sipush #-22734
    //   423: invokestatic a : (II)Ljava/lang/String;
    //   426: aastore
    //   427: dup
    //   428: bipush #12
    //   430: sipush #23961
    //   433: sipush #8763
    //   436: invokestatic a : (II)Ljava/lang/String;
    //   439: aastore
    //   440: dup
    //   441: bipush #13
    //   443: sipush #23937
    //   446: sipush #-22293
    //   449: invokestatic a : (II)Ljava/lang/String;
    //   452: aastore
    //   453: dup
    //   454: bipush #14
    //   456: sipush #23996
    //   459: sipush #-28880
    //   462: invokestatic a : (II)Ljava/lang/String;
    //   465: aastore
    //   466: dup
    //   467: bipush #15
    //   469: sipush #23958
    //   472: sipush #-22737
    //   475: invokestatic a : (II)Ljava/lang/String;
    //   478: aastore
    //   479: dup
    //   480: bipush #16
    //   482: sipush #23988
    //   485: sipush #-9107
    //   488: invokestatic a : (II)Ljava/lang/String;
    //   491: aastore
    //   492: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   495: invokespecial <init> : (Ljava/util/Collection;)V
    //   498: putstatic burp/Zmey.Zk : Ljava/util/Set;
    //   501: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   506: putstatic burp/Zmey.Zf : Ljava/util/function/Function;
    //   509: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   514: putstatic burp/Zmey.ZN : Ljava/util/function/Function;
    //   517: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5D91) & 0xFFFF;
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
      byte b1 = 33;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmey.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */