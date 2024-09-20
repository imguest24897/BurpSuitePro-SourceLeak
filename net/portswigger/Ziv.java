package net.portswigger;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;

public class Ziv implements Zf7 {
  private final Ztj ZD;
  
  private final String ZC;
  
  private final String Zx;
  
  private final String Zm;
  
  private final String ZM;
  
  private static final Map<String, String> ZX;
  
  private static String ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Ziv(Zrx7 paramZrx7, List<Zu8> paramList, Ztj paramZtj, Zs5 paramZs51, Zmc paramZmc, Zs5 paramZs52) {
    this.ZD = paramZtj;
    this.Zx = Zy(paramZrx7, "", "", a(-21964, -29421), a(-22012, -3587), false);
    this.Zm = Za(paramZs51, paramZs51.Zq);
    this.ZM = paramZmc.toString();
    this.ZC = Zf(Zy(paramZrx7, "", Zo(paramList, ""), a(-22009, 22006), "", true), paramZs52.Zq);
  }
  
  private String Za(Zs5 paramZs5, TreeMap<String, Map<Zz0, String>> paramTreeMap) {
    StringBuilder stringBuilder = new StringBuilder(a(-22006, -2956));
    Iterator<Map> iterator = paramTreeMap.values().iterator();
    String str = Zw();
    while (iterator.hasNext()) {
      Map map = iterator.next();
      for (String str1 : map.values()) {
        stringBuilder.append(str1).append(',');
        if (str == null)
          break; 
      } 
      if (str == null)
        break; 
    } 
    if (paramZs5.Zq.size() > 0)
      stringBuilder.setLength(stringBuilder.length() - 1); 
    return stringBuilder.append(a(-21955, -21444)).toString();
  }
  
  public Zu0 Zl(Zz0 paramZz0, Zat paramZat, Zsv paramZsv) {
    try {
      if (!Zz0.Zg.equals(paramZz0))
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZat.ZX.equals("/"))
        return Zu0.Zl(this.ZC); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (paramZat.ZX.startsWith(a(-22001, -6461))) {
      String str = paramZat.ZX.substring(5);
      try {
        if (!this.ZD.Zz(str))
          return Zrxs.Zo(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return Zu0.Zl(String.format(this.Zx, new Object[] { Zb(this.ZD.ZO(str)) }));
    } 
    try {
      if (paramZat.ZX.startsWith(a(-22016, -24742)))
        return Zu0.Zj(200, Zvw.ZQ(new String[] { a(-21965, -8439), a(-21961, 3961) }), Zny.Zv(this.ZM)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZat.ZX.startsWith(a(-21990, -13382)))
        return Zu0.Zj(200, Zvw.ZQ(new String[] { a(-21957, 17105), a(-21961, 3961) }), Zny.Zv(this.Zm)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZat.ZX.startsWith(a(-21970, 8426))) {
        try {
          if (paramZat.ZX.contains(a(-22011, 2930)))
            return Zrxs.Zo(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        int i = paramZat.ZX.indexOf('?');
        if (i != -1)
          paramZat = paramZat.Zm(paramZat.ZX.substring(0, i)); 
        InputStream inputStream = Ziv.class.getResourceAsStream(a(-21998, 22024) + a(-21998, 22024));
        try {
          if (inputStream == null)
            return Zrxs.Zo(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          byte[] arrayOfByte = ZN(inputStream);
          inputStream.close();
          return Zu0.Zj(200, Zvw.ZQ(new String[] { a(-21957, 17105), Zy(paramZat.ZX) }), arrayOfByte);
        } catch (IOException iOException) {
          Zah.Zl(iOException, Zk_.IGNORED);
          return Zrxs.ZJ(iOException);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null;
  }
  
  private static String Zy(String paramString) {
    int i = paramString.lastIndexOf('.');
    String str1 = (i == -1) ? null : paramString.substring(i + 1);
    String str2 = ZX.get(str1);
    return (str2 == null) ? a(-22010, 25335) : str2;
  }
  
  private static byte[] ZN(InputStream paramInputStream) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    String str = Zw();
    byte[] arrayOfByte = new byte[1024];
    int i;
    while ((i = paramInputStream.read(arrayOfByte)) != -1) {
      byteArrayOutputStream.write(arrayOfByte, 0, i);
      if (str == null)
        break; 
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  String Zb(Zm1 paramZm1) {
    StringBuilder stringBuilder = new StringBuilder();
    paramZm1.Zu(new Zrxn(this, stringBuilder));
    return stringBuilder.toString();
  }
  
  private String Zf(String paramString, TreeMap<String, Map<Zz0, String>> paramTreeMap) {
    StringBuilder stringBuilder = new StringBuilder();
    String str = Zw();
    for (Map<Zz0, String> map : paramTreeMap.values()) {
      for (String str1 : map.values()) {
        stringBuilder.append(str1);
        if (str == null)
          break; 
      } 
      if (str == null)
        break; 
    } 
    return String.format(paramString, new Object[] { stringBuilder.toString() });
  }
  
  private static String Zo(Ztj paramZtj, Type paramType) {
    return "\"" + paramZtj.Zz(paramType) + "\"";
  }
  
  private static String Zo(List<Zu8> paramList, String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<Zu8> iterator = paramList.iterator();
    String str = Zw();
    while (iterator.hasNext()) {
      Zu8 zu8 = iterator.next();
      stringBuilder.append(a(-21972, -16091)).append(zu8.ZH()).append(a(-21994, 26171)).append(zu8.ZH()).append(a(-21973, -3284));
      stringBuilder.append(a(-21953, 175)).append(paramString).append(a(-21991, 3658)).append(a(-21975, -3257)).append(zu8.ZO()).append(a(-21986, -7722));
      stringBuilder.append(a(-21966, 2054));
      if (str == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  private static String Zy(Zrx7 paramZrx7, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean) {
    String str3 = ZD(paramString4, new String[] { a(-21958, -13169) });
    String str4 = Zd(paramString4, a(-21968, 3762));
    String str5 = paramString4;
    String str1 = a(-21976, 12878) + a(-21976, 12878) + str5 + a(-21989, -31147) + str4;
    String str2 = paramBoolean ? ZZ(paramString4, new String[] { a(-21997, -10270), a(-22007, 11886), a(-21922, -7591), a(-21982, -32313), a(-22015, -19001) }) : "";
    String str6 = str2;
    String str7 = paramString3;
    String str8 = paramString2;
    String str9 = paramZrx7.filenameFragment;
    String str10 = paramString4;
    String str11 = paramString1;
    String str12 = str1;
    return a(-21992, -17285) + a(-21992, -17285) + str12 + str11 + a(-21988, -14515) + str10 + a(-21993, 26720) + str9 + a(-21927, -4079) + str8 + a(-21980, -27054) + str7 + str6;
  }
  
  private static String ZZ(String paramString, String... paramVarArgs) {
    StringBuilder stringBuilder = new StringBuilder();
    String[] arrayOfString = paramVarArgs;
    int i = arrayOfString.length;
    byte b = 0;
    String str = Zw();
    while (b < i) {
      String str1 = arrayOfString[b];
      stringBuilder.append(Zg(paramString, str1));
      b++;
      if (str == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  private static String Zg(String paramString1, String paramString2) {
    a(-22014, -4066);
    return a(-22014, -4066) + a(-22014, -4066) + paramString1 + a(-21999, 11467) + paramString2;
  }
  
  private static String ZD(String paramString, String... paramVarArgs) {
    StringBuilder stringBuilder = new StringBuilder();
    String[] arrayOfString = paramVarArgs;
    String str = Zw();
    int i = arrayOfString.length;
    byte b = 0;
    while (b < i) {
      String str1 = arrayOfString[b];
      stringBuilder.append(ZL(paramString, str1));
      b++;
      if (str == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  private static String ZL(String paramString1, String paramString2) {
    a(-21956, 6182);
    return a(-21956, 6182) + a(-21956, 6182) + paramString1 + a(-21926, 27517) + paramString2;
  }
  
  private static String Zd(String paramString1, String paramString2) {
    a(-21978, 21870);
    return a(-21978, 21870) + a(-21978, 21870) + paramString1 + a(-22004, 8353) + paramString2;
  }
  
  private static Function<Type, Optional<String>> Zm(Ztj paramZtj, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> apply : (Lnet/portswigger/Ztj;Ljava/lang/String;)Ljava/util/function/Function;
    //   7: areturn
  }
  
  private static Optional lambda$hyperlinker$1(Ztj paramZtj, String paramString, Type paramType) {
    return paramZtj.Za(paramType).map(paramString::lambda$hyperlinker$0);
  }
  
  private static String lambda$hyperlinker$0(String paramString, Zm1 paramZm1) {
    return String.format(a(-22000, 31180), new Object[] { paramString, paramZm1.Za(), paramZm1.Za() });
  }
  
  static {
    // Byte code:
    //   0: bipush #69
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: ldc 'gsjSXb'
    //   9: iconst_0
    //   10: istore_3
    //   11: ldc 'Þoªsf.ñóöºÞJù°Øh{4Ig_¬; ë!Y¸]$÷¥QÑ×Æ¬pê:¥xQ§¸Ý·avÑDãÑÅõÏ)úð#ÕÞ°jaËuwÍTZ­¼óÆhd+ãIjØð\\fÒÙ³è_\\n^DöÑ5L(²9F<R^×ï~Ï.9Or}ä·ë%¥ÑðgÜÙÎÆ§¿\\fVâ?Dæ³èL°6»cö:3ûà»è¢¦0ñiìEºZ©í¿®D80åH\\twL·ÂÑØIàÄB\\n©C¢úq-§\\bUq¶¨»Kíª»#7Hðx>&æäTj6ÛÐ©lu` :pÐ&¨Æ5*©DVËä±Ò¹/,à-nan5²sj» =#{ºÚØ7¸yóKfB½Ìô·V¸Ô¹-\\fb7ëû3_ ÌSGÓ¹³àëÝ8ß\\rèrkoÑ¼;\\r?êÈ4ø\\t¸¾ýû\\rIÊûøÐdÅäsTqÞ<n\\b¡¢«°ä-OÔmÚðwrZü\\f²í´Pv\\nöø©Å¢êsµçj\\tâ\\thsGîY¸\\b'½Ók¤ØwÀqüJdJm¤)¾ei÷ÏQpò^ó-ËÚ8õã|µ=¢³ì}@cþld|ø[åtúë°ò°RÈºT³F@rkê4@\\fGxÄW¦º¡]í¡T©V5×8ßÆ5Oâ\\r2YRÉÒ&D_>?\\n4î-ÝÇLW(ú9ÏÆwÐý^ËÎeæ  È0²æì;L\\bUÎ£#=VÌ\\f/ªéZ\J¢²4¬IdY\\b`».3®h\\fø«NªN$[á)vË=¤¢U©Èù¾®"RFþägBº©ûÿl~9WH[>|>ÒfÂ5þ<Bdk\W\\fy`àwÇK!©*rºS1?ÕøAßr/y9ñ±>XVo4ìÀ6Ù&USö]uõ!ÒÅÜ|Éøøÿ¹®Ñò'í5~sù©Q}ÎÛã^pdïåxÕ¶"+ÃÒrÁÄ D+©!÷ë}±ÓK+°×®Èæ. µìÚ>Ä#ü8ìQ¹fz>%N^cbZ\\f=:æ¡hðLÙ\\tgÓA\\bB^üyØ<(ûÕËOS\\ng´ÚÓÙõ<{Î9bd°ÆXW^ëFæ¦=ß 2Át¢CÏ|®ë%hýahµÍh¦\\fë,dÒk»ß¿è\\rCæ¦ä>"7ÓQniÉ\\f¬hÔë.¹°À,\fô"\\fÈÌ^Î÷¦ÂLf cï±¢ÂC$Ä.6½¾Á+úÝ~¯'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: invokestatic ZN : (Ljava/lang/String;)V
    //   23: bipush #23
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #123
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 148
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc '1¢¹q½Ø§$Är@ säVºØmpxìðR\\f,¾U4ÝðùQé'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #32
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #53
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic net/portswigger/Ziv.a : [Ljava/lang/String;
    //   137: bipush #69
    //   139: anewarray java/lang/String
    //   142: putstatic net/portswigger/Ziv.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 263
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 245, 0 -> 216, 1 -> 220, 2 -> 225, 3 -> 230, 4 -> 235, 5 -> 240
    //   216: iconst_2
    //   217: goto -> 247
    //   220: bipush #28
    //   222: goto -> 247
    //   225: bipush #94
    //   227: goto -> 247
    //   230: bipush #89
    //   232: goto -> 247
    //   235: bipush #22
    //   237: goto -> 247
    //   240: bipush #8
    //   242: goto -> 247
    //   245: bipush #124
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 171
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 167
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 45, 0 -> 104
    //   304: new java/util/HashMap
    //   307: dup
    //   308: invokespecial <init> : ()V
    //   311: astore #7
    //   313: aload #7
    //   315: sipush #-21985
    //   318: sipush #-4199
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: sipush #-21959
    //   327: sipush #-8301
    //   330: invokestatic a : (II)Ljava/lang/String;
    //   333: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   336: pop
    //   337: aload #7
    //   339: sipush #-22008
    //   342: sipush #-26706
    //   345: invokestatic a : (II)Ljava/lang/String;
    //   348: sipush #-21974
    //   351: sipush #-18795
    //   354: invokestatic a : (II)Ljava/lang/String;
    //   357: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   360: pop
    //   361: aload #7
    //   363: sipush #-21925
    //   366: sipush #25974
    //   369: invokestatic a : (II)Ljava/lang/String;
    //   372: sipush #-21981
    //   375: sipush #-29260
    //   378: invokestatic a : (II)Ljava/lang/String;
    //   381: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   384: pop
    //   385: aload #7
    //   387: sipush #-21928
    //   390: sipush #-16497
    //   393: invokestatic a : (II)Ljava/lang/String;
    //   396: sipush #-21962
    //   399: sipush #8788
    //   402: invokestatic a : (II)Ljava/lang/String;
    //   405: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   408: pop
    //   409: aload #7
    //   411: sipush #-21984
    //   414: sipush #-12902
    //   417: invokestatic a : (II)Ljava/lang/String;
    //   420: sipush #-21979
    //   423: sipush #25700
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   432: pop
    //   433: aload #7
    //   435: sipush #-21977
    //   438: sipush #24295
    //   441: invokestatic a : (II)Ljava/lang/String;
    //   444: sipush #-21983
    //   447: sipush #8848
    //   450: invokestatic a : (II)Ljava/lang/String;
    //   453: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   456: pop
    //   457: aload #7
    //   459: sipush #-21960
    //   462: sipush #-30891
    //   465: invokestatic a : (II)Ljava/lang/String;
    //   468: sipush #-22003
    //   471: sipush #-1463
    //   474: invokestatic a : (II)Ljava/lang/String;
    //   477: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   480: pop
    //   481: aload #7
    //   483: sipush #-22002
    //   486: sipush #-19103
    //   489: invokestatic a : (II)Ljava/lang/String;
    //   492: sipush #-22013
    //   495: sipush #22120
    //   498: invokestatic a : (II)Ljava/lang/String;
    //   501: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   504: pop
    //   505: aload #7
    //   507: sipush #-21969
    //   510: sipush #-20794
    //   513: invokestatic a : (II)Ljava/lang/String;
    //   516: sipush #-22005
    //   519: sipush #24814
    //   522: invokestatic a : (II)Ljava/lang/String;
    //   525: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   528: pop
    //   529: aload #7
    //   531: sipush #-21954
    //   534: sipush #22714
    //   537: invokestatic a : (II)Ljava/lang/String;
    //   540: sipush #-21995
    //   543: sipush #12863
    //   546: invokestatic a : (II)Ljava/lang/String;
    //   549: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   552: pop
    //   553: aload #7
    //   555: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   558: putstatic net/portswigger/Ziv.ZX : Ljava/util/Map;
    //   561: return
  }
  
  public static void ZN(String paramString) {
    ZE = paramString;
  }
  
  public static String Zw() {
    return ZE;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAA1A) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ziv.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */