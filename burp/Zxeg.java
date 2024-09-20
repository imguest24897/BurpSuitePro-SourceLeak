package burp;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import net.portswigger.Zrzt;

public class Zxeg implements Zehc {
  private final Zz_9 Zd;
  
  private final Ze3n Zm;
  
  private final Zbnt ZG;
  
  private static String ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zxeg(Zz_9 paramZz_9, Ze3n paramZe3n, Zbnt paramZbnt) {
    this.Zd = paramZz_9;
    this.Zm = paramZe3n;
    this.ZG = paramZbnt;
  }
  
  public Ztk8 Zb() {
    // Byte code:
    //   0: invokestatic ZL : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zm : Lburp/Ze3n;
    //   8: invokevirtual Zp : ()Lburp/Zs68;
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull -> 57
    //   16: aload_2
    //   17: getfield Zd : Ljava/util/List;
    //   20: ifnull -> 57
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   29: athrow
    //   30: aload_0
    //   31: getfield Zm : Lburp/Ze3n;
    //   34: invokevirtual ZA : ()Lburp/Zefx;
    //   37: invokeinterface ZF : ()Lburp/Zlit;
    //   42: aload_2
    //   43: aload_0
    //   44: getfield ZG : Lburp/Zbnt;
    //   47: invokestatic Zf : (Lburp/Zlit;Lburp/Zs68;Lburp/Zbnt;)Ljava/util/List;
    //   50: goto -> 60
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: invokestatic emptyList : ()Ljava/util/List;
    //   60: astore_3
    //   61: aload_3
    //   62: invokeinterface isEmpty : ()Z
    //   67: ifeq -> 78
    //   70: invokestatic ZD : ()Lburp/Ztk8;
    //   73: areturn
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: aload_0
    //   79: getfield Zd : Lburp/Zz_9;
    //   82: iconst_3
    //   83: anewarray burp/Zvs
    //   86: dup
    //   87: iconst_0
    //   88: getstatic burp/Zzu2.MIXED_CONTENT : Lburp/Zzu2;
    //   91: aastore
    //   92: dup
    //   93: iconst_1
    //   94: getstatic burp/Zzu2.CROSS_DOMAIN_REFERER_LEAKAGE : Lburp/Zzu2;
    //   97: aastore
    //   98: dup
    //   99: iconst_2
    //   100: getstatic burp/Zzu2.CROSS_DOMAIN_SCRIPT_INCLUDE : Lburp/Zzu2;
    //   103: aastore
    //   104: invokevirtual ZN : ([Lburp/Zvs;)Z
    //   107: ifne -> 158
    //   110: aload_0
    //   111: getfield Zd : Lburp/Zz_9;
    //   114: getstatic burp/Zzu2.SESSION_TOKEN_IN_URL : Lburp/Zzu2;
    //   117: invokevirtual Zr : (Lburp/Zvs;)Z
    //   120: ifne -> 158
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   129: athrow
    //   130: aload_0
    //   131: getfield Zd : Lburp/Zz_9;
    //   134: getstatic burp/Zzu2.SERIALIZED_OBJECT_IN_HTTP_MESSAGE : Lburp/Zzu2;
    //   137: invokevirtual Zr : (Lburp/Zvs;)Z
    //   140: ifne -> 158
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: invokestatic ZD : ()Lburp/Ztk8;
    //   153: areturn
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: new java/util/ArrayList
    //   161: dup
    //   162: invokespecial <init> : ()V
    //   165: astore #4
    //   167: new java/util/ArrayList
    //   170: dup
    //   171: invokespecial <init> : ()V
    //   174: astore #5
    //   176: new burp/Zgq
    //   179: dup
    //   180: invokespecial <init> : ()V
    //   183: astore #6
    //   185: new burp/Zzn4
    //   188: dup
    //   189: aload_0
    //   190: getfield Zm : Lburp/Ze3n;
    //   193: invokespecial <init> : (Lburp/Ze3n;)V
    //   196: astore #7
    //   198: aload_3
    //   199: invokeinterface iterator : ()Ljava/util/Iterator;
    //   204: astore #8
    //   206: aload #8
    //   208: invokeinterface hasNext : ()Z
    //   213: ifeq -> 408
    //   216: aload #8
    //   218: invokeinterface next : ()Ljava/lang/Object;
    //   223: checkcast burp/Zsq8
    //   226: astore #9
    //   228: aload #9
    //   230: getfield Zm : B
    //   233: ifeq -> 253
    //   236: iconst_0
    //   237: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   240: aload #9
    //   242: getfield Zm : B
    //   245: i2l
    //   246: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   249: aload_1
    //   250: ifnull -> 206
    //   253: aload_0
    //   254: getfield Zd : Lburp/Zz_9;
    //   257: iconst_2
    //   258: anewarray burp/Zvs
    //   261: dup
    //   262: iconst_0
    //   263: getstatic burp/Zzu2.CROSS_DOMAIN_REFERER_LEAKAGE : Lburp/Zzu2;
    //   266: aastore
    //   267: dup
    //   268: iconst_1
    //   269: getstatic burp/Zzu2.CROSS_DOMAIN_SCRIPT_INCLUDE : Lburp/Zzu2;
    //   272: aastore
    //   273: invokevirtual ZN : ([Lburp/Zvs;)Z
    //   276: ifeq -> 319
    //   279: aload_0
    //   280: aload #9
    //   282: aload #4
    //   284: invokevirtual Zo : (Lburp/Zsq8;Ljava/util/List;)Z
    //   287: istore #10
    //   289: aload_0
    //   290: getfield Zd : Lburp/Zz_9;
    //   293: getstatic burp/Zzu2.CROSS_DOMAIN_REFERER_LEAKAGE : Lburp/Zzu2;
    //   296: invokevirtual Zr : (Lburp/Zvs;)Z
    //   299: ifeq -> 319
    //   302: aload_0
    //   303: aload #9
    //   305: iload #10
    //   307: aload #5
    //   309: invokevirtual Zn : (Lburp/Zsq8;ZLjava/util/List;)V
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   318: athrow
    //   319: aload_0
    //   320: getfield Zd : Lburp/Zz_9;
    //   323: getstatic burp/Zzu2.SERIALIZED_OBJECT_IN_HTTP_MESSAGE : Lburp/Zzu2;
    //   326: invokevirtual Zr : (Lburp/Zvs;)Z
    //   329: ifeq -> 364
    //   332: new burp/Ztlf
    //   335: dup
    //   336: aload_0
    //   337: getfield Zm : Lburp/Ze3n;
    //   340: aload_0
    //   341: getfield Zd : Lburp/Zz_9;
    //   344: invokevirtual ZqM : ()Lburp/Zeko;
    //   347: invokespecial <init> : (Lburp/Ze3n;Lburp/Zeko;)V
    //   350: astore #10
    //   352: aload #6
    //   354: aload #10
    //   356: aload #9
    //   358: invokevirtual Zc : (Lburp/Zsq8;)Lburp/Zgq;
    //   361: invokevirtual ZF : (Lburp/Zgq;)V
    //   364: aload_0
    //   365: getfield Zd : Lburp/Zz_9;
    //   368: getstatic burp/Zzu2.MIXED_CONTENT : Lburp/Zzu2;
    //   371: invokevirtual Zr : (Lburp/Zvs;)Z
    //   374: ifeq -> 391
    //   377: aload #7
    //   379: aload #9
    //   381: invokevirtual Zi : (Lburp/Zsq8;)V
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   390: athrow
    //   391: goto -> 404
    //   394: astore #10
    //   396: aload #10
    //   398: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   401: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   404: aload_1
    //   405: ifnull -> 206
    //   408: aload_0
    //   409: getfield Zd : Lburp/Zz_9;
    //   412: getstatic burp/Zzu2.SESSION_TOKEN_IN_URL : Lburp/Zzu2;
    //   415: invokevirtual Zr : (Lburp/Zvs;)Z
    //   418: ifeq -> 428
    //   421: aload_0
    //   422: aload_3
    //   423: aload #6
    //   425: invokevirtual ZP : (Ljava/util/List;Lburp/Zgq;)V
    //   428: goto -> 441
    //   431: astore #8
    //   433: aload #8
    //   435: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   438: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   441: aload_0
    //   442: getfield Zd : Lburp/Zz_9;
    //   445: getstatic burp/Zzu2.CROSS_DOMAIN_SCRIPT_INCLUDE : Lburp/Zzu2;
    //   448: invokevirtual Zr : (Lburp/Zvs;)Z
    //   451: ifeq -> 474
    //   454: aload_0
    //   455: aload #4
    //   457: aload #6
    //   459: <illegal opcode> Zq : ()Lburp/Zr44;
    //   464: invokevirtual Zt : (Ljava/util/List;Lburp/Zgq;Lburp/Zr44;)V
    //   467: goto -> 474
    //   470: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   473: athrow
    //   474: aload_0
    //   475: aload #5
    //   477: aload #6
    //   479: <illegal opcode> Zq : ()Lburp/Zr44;
    //   484: invokevirtual Zt : (Ljava/util/List;Lburp/Zgq;Lburp/Zr44;)V
    //   487: aload_0
    //   488: getfield Zd : Lburp/Zz_9;
    //   491: getstatic burp/Zzu2.MIXED_CONTENT : Lburp/Zzu2;
    //   494: invokevirtual Zr : (Lburp/Zvs;)Z
    //   497: ifeq -> 514
    //   500: aload #7
    //   502: aload #6
    //   504: invokevirtual Zv : (Lburp/Zgq;)V
    //   507: goto -> 514
    //   510: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   513: athrow
    //   514: aload #6
    //   516: invokestatic Zy : (Lburp/Zgq;)Lburp/Ztk8;
    //   519: areturn
    // Exception table:
    //   from	to	target	type
    //   12	23	26	java/lang/Exception
    //   16	53	53	java/lang/Exception
    //   61	74	74	java/lang/Exception
    //   78	123	126	java/lang/Exception
    //   110	143	146	java/lang/Exception
    //   130	154	154	java/lang/Exception
    //   228	249	394	java/lang/Exception
    //   253	391	394	java/lang/Exception
    //   289	312	315	java/lang/Exception
    //   364	384	387	java/lang/Exception
    //   408	428	431	java/lang/Exception
    //   441	467	470	java/lang/Exception
    //   474	507	510	java/lang/Exception
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_VulnerableLinks;
  }
  
  private boolean Zo(Zsq8 paramZsq8, List<Zsq8> paramList) {
    boolean bool = Zmhb.ZN(this.Zm.Za().ZJ1(), paramZsq8.ZZ.Zd1());
    if (bool && a(-30461, -19529).equalsIgnoreCase(paramZsq8.ZH.ZlP().ZJ3()))
      paramList.add(paramZsq8); 
    return bool;
  }
  
  private void Zn(Zsq8 paramZsq8, boolean paramBoolean, List<Zsq8> paramList) {
    if (paramBoolean && this.Zm.ZA().ZF().Zds() && !ZD(paramZsq8) && !ZL(paramZsq8))
      paramList.add(paramZsq8); 
  }
  
  private boolean ZD(Zsq8 paramZsq8) {
    return (this.Zm.ZA().ZF().Zdr() && !paramZsq8.ZZ.Zdr());
  }
  
  private boolean ZL(Zsq8 paramZsq8) {
    Zs5n zs5n = paramZsq8.ZH.ZlP().ZIm(a(-30462, -32151));
    return (zs5n != null && zs5n.ZQG().equals(a(-30464, -30182)));
  }
  
  private void ZP(List<Zsq8> paramList, Zgq<Zrdb> paramZgq) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: new java/util/HashMap
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore #4
    //   17: aload_1
    //   18: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   23: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   28: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   33: aload_3
    //   34: aload #4
    //   36: <illegal opcode> accept : (Ljava/util/Map;Ljava/util/Map;)Ljava/util/function/Consumer;
    //   41: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   46: aload_3
    //   47: aload_0
    //   48: aload_2
    //   49: aload #4
    //   51: <illegal opcode> accept : (Lburp/Zxeg;Lburp/Zgq;Ljava/util/Map;)Ljava/util/function/BiConsumer;
    //   56: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   61: return
  }
  
  private void Zt(List<Zsq8> paramList, Zgq<Zrdb> paramZgq, Zr44 paramZr44) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    TreeMap<Object, Object> treeMap = new TreeMap<>();
    null = paramList.iterator();
    String str = ZL();
    while (null.hasNext()) {
      Zsq8 zsq8 = null.next();
      ((Collection<Zl1r>)hashMap.computeIfAbsent(zsq8.ZZ.Zd1(), Zxeg::lambda$checkForSessionTokenInLinkUrl$1)).add(Zrlp.Zj(zsq8.ZJ, zsq8.Zv));
      ((Set<Zlit>)treeMap.computeIfAbsent(zsq8.ZZ.Zd1(), Zxeg::lambda$reportVulnerableLinksPerHost$6)).add(zsq8.ZZ);
      if (str != null)
        break; 
    } 
    for (String str1 : treeMap.keySet()) {
      Zvow zvow = this.Zm.Zt().Z_((Collection<Zl1r>)hashMap.get(str1));
      paramZgq.Zu(paramZr44.Zq(this.Zm.Za(), this.Zm.ZN(), zvow, str1, (Set<Zlit>)treeMap.get(str1)));
      if (str != null)
        break; 
    } 
  }
  
  private static Set lambda$reportVulnerableLinksPerHost$6(String paramString) {
    return new HashSet();
  }
  
  private void lambda$checkForSessionTokenInLinkUrl$4(Zgq<Zrdb> paramZgq, Map paramMap, String paramString, Collection<String> paramCollection) {
    paramZgq.Zu(Zsry.Zf(this.Zm.Za(), this.Zm.ZN(), this.Zm.Zt().Z_((Collection<Zl1r>)paramMap.get(paramString)), (byte)2, paramString, paramCollection));
  }
  
  private static void lambda$checkForSessionTokenInLinkUrl$3(Map<String, Collection<String>> paramMap1, Map<String, Collection<Zl1r>> paramMap2, Zsq8 paramZsq8) {
    byte[] arrayOfByte = paramZsq8.ZZ.ZdC();
    List<Zt8g> list = Zznx.Zm(Zrdu.URL_PARAM, arrayOfByte, 0, arrayOfByte.length, Zsba.URL_ENCODED, null);
    String str = ZL();
    for (Zt8g zt8g : list) {
      if (Zmhb.ZE(Zrzt.Zn(zt8g.Zns()), Zrzt.Zn(zt8g.Zbn()))) {
        ((Collection<String>)paramMap1.computeIfAbsent(zt8g.Zns(), Zxeg::lambda$checkForSessionTokenInLinkUrl$1)).add(paramZsq8.ZZ.toString());
        ((Collection<Zl1r>)paramMap2.computeIfAbsent(zt8g.Zns(), Zxeg::lambda$checkForSessionTokenInLinkUrl$1)).add(Zrlp.Zj(paramZsq8.ZJ, paramZsq8.Zv));
      } 
      if (str != null)
        break; 
    } 
  }
  
  private static Collection lambda$checkForSessionTokenInLinkUrl$1(String paramString) {
    return new HashSet();
  }
  
  private static boolean lambda$checkForSessionTokenInLinkUrl$0(Zsq8 paramZsq8) {
    return paramZsq8.ZZ.Zds();
  }
  
  public static void ZV(String paramString) {
    ZL = paramString;
  }
  
  public static String ZL() {
    return ZL;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: aconst_null
    //   9: ldc 'v1æ» g?U\\n/'sÙK:ýâ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: invokestatic ZV : (Ljava/lang/String;)V
    //   23: iconst_m1
    //   24: istore_0
    //   25: bipush #56
    //   27: iinc #0, 1
    //   30: aload_2
    //   31: iload_0
    //   32: dup
    //   33: iload_1
    //   34: iadd
    //   35: invokevirtual substring : (II)Ljava/lang/String;
    //   38: iconst_m1
    //   39: goto -> 85
    //   42: aload #5
    //   44: swap
    //   45: iload_3
    //   46: iinc #3, 1
    //   49: swap
    //   50: aastore
    //   51: iload_0
    //   52: iload_1
    //   53: iadd
    //   54: dup
    //   55: istore_0
    //   56: iload #4
    //   58: if_icmpge -> 70
    //   61: aload_2
    //   62: iload_0
    //   63: invokevirtual charAt : (I)C
    //   66: istore_1
    //   67: goto -> 25
    //   70: aload #5
    //   72: putstatic burp/Zxeg.a : [Ljava/lang/String;
    //   75: iconst_3
    //   76: anewarray java/lang/String
    //   79: putstatic burp/Zxeg.b : [Ljava/lang/String;
    //   82: goto -> 231
    //   85: dup_x2
    //   86: pop
    //   87: invokevirtual toCharArray : ()[C
    //   90: dup_x1
    //   91: arraylength
    //   92: dup_x2
    //   93: pop
    //   94: iconst_0
    //   95: istore #6
    //   97: dup2_x1
    //   98: pop2
    //   99: dup_x2
    //   100: iconst_1
    //   101: if_icmpgt -> 204
    //   104: dup2
    //   105: swap
    //   106: iload #6
    //   108: dup2_x1
    //   109: caload
    //   110: swap
    //   111: iload #6
    //   113: bipush #7
    //   115: irem
    //   116: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #122
    //   158: goto -> 188
    //   161: bipush #51
    //   163: goto -> 188
    //   166: bipush #99
    //   168: goto -> 188
    //   171: bipush #47
    //   173: goto -> 188
    //   176: bipush #52
    //   178: goto -> 188
    //   181: bipush #83
    //   183: goto -> 188
    //   186: bipush #96
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 108
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 104
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 42
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8902) & 0xFFFF;
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
      byte b1 = 38;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxeg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */