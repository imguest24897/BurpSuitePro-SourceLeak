package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

class Zzn4 {
  private static final List<Zlo9> Zx;
  
  private static final List<Zlo9> ZE;
  
  private final Ze3n Za;
  
  private final List<Zsq8> Zt = new ArrayList<>();
  
  private final List<Zsq8> Zo = new ArrayList<>();
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zzn4(Ze3n paramZe3n) {
    String str = Zxeg.ZL();
    this.Za = paramZe3n;
    if (Zbqc.Zwu() == null)
      Zxeg.ZV("H0OONb"); 
  }
  
  void Zi(Zsq8 paramZsq8) {
    // Byte code:
    //   0: invokestatic ZL : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Za : Lburp/Ze3n;
    //   8: invokevirtual Zod : ()Lburp/Zmzk;
    //   11: invokeinterface ZJZ : ()Z
    //   16: ifeq -> 48
    //   19: aload_1
    //   20: getfield ZZ : Lburp/Zlit;
    //   23: invokeinterface Zdr : ()Z
    //   28: ifne -> 48
    //   31: aload_1
    //   32: getfield ZH : Lburp/Ztu8;
    //   35: invokeinterface ZlP : ()Lburp/Zs_n;
    //   40: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   45: ifnonnull -> 49
    //   48: return
    //   49: sipush #-16424
    //   52: sipush #10816
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: aload_1
    //   59: getfield ZH : Lburp/Ztu8;
    //   62: invokeinterface ZlP : ()Lburp/Zs_n;
    //   67: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   72: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   75: ifeq -> 84
    //   78: aload_0
    //   79: aload_1
    //   80: invokevirtual Zu : (Lburp/Zsq8;)V
    //   83: return
    //   84: aload_0
    //   85: aload_1
    //   86: getfield ZH : Lburp/Ztu8;
    //   89: invokeinterface ZlP : ()Lburp/Zs_n;
    //   94: getstatic burp/Zzn4.Zx : Ljava/util/List;
    //   97: invokevirtual ZR : (Lburp/Zs_n;Ljava/util/List;)Lburp/Zlo9;
    //   100: astore_3
    //   101: aload_3
    //   102: ifnull -> 120
    //   105: aload_0
    //   106: getfield Zo : Ljava/util/List;
    //   109: aload_1
    //   110: invokeinterface add : (Ljava/lang/Object;)Z
    //   115: pop
    //   116: aload_2
    //   117: ifnull -> 154
    //   120: aload_0
    //   121: aload_1
    //   122: getfield ZH : Lburp/Ztu8;
    //   125: invokeinterface ZlP : ()Lburp/Zs_n;
    //   130: getstatic burp/Zzn4.ZE : Ljava/util/List;
    //   133: invokevirtual ZR : (Lburp/Zs_n;Ljava/util/List;)Lburp/Zlo9;
    //   136: astore #4
    //   138: aload #4
    //   140: ifnull -> 154
    //   143: aload_0
    //   144: getfield Zt : Ljava/util/List;
    //   147: aload_1
    //   148: invokeinterface add : (Ljava/lang/Object;)Z
    //   153: pop
    //   154: return
  }
  
  private Zlo9 ZR(Zs_n paramZs_n, List<Zlo9> paramList) {
    String str = Zxeg.ZL();
    for (Zlo9 zlo9 : paramList) {
      if (!zlo9.ZN.equalsIgnoreCase(paramZs_n.ZJ3()))
        continue; 
      String[] arrayOfString = zlo9.ZH;
      int i = arrayOfString.length;
      byte b = 0;
      while (b < i) {
        String str1 = arrayOfString[b];
        if (paramZs_n.ZI2(str1) != null)
          return zlo9; 
        b++;
        if (str != null)
          break; 
      } 
      if (str != null)
        break; 
    } 
    return null;
  }
  
  void Zv(Zgq<Zrdb> paramZgq) {
    Zh(paramZgq, this.Zo, Zerw::ZF);
    Zh(paramZgq, this.Zt, Zerw::ZV);
  }
  
  private void Zh(Zgq<Zrdb> paramZgq, List<Zsq8> paramList, Function<String, String> paramFunction) {
    TreeSet<String> treeSet = new TreeSet();
    HashMap<Object, Object> hashMap = new HashMap<>();
    String str = Zxeg.ZL();
    for (Zsq8 zsq8 : paramList) {
      String str1 = zsq8.ZZ.toString();
      ((Collection<Zl1r>)hashMap.computeIfAbsent(str1, Zzn4::lambda$reportIssues$0)).add(Zrlp.Zj(zsq8.ZJ, zsq8.Zv));
      treeSet.add(str1);
      if (str != null)
        break; 
    } 
    for (String str1 : treeSet) {
      Zvow zvow = this.Za.Zt().Z_((Collection<Zl1r>)hashMap.get(str1));
      paramZgq.Zu(Zerw.ZC(this.Za.Za(), this.Za.ZN(), zvow, paramFunction.apply(str1)));
      if (str != null)
        break; 
    } 
  }
  
  private void Zu(Zsq8 paramZsq8) {
    String str = Zxeg.ZL();
    Zs5n zs5n = paramZsq8.ZH.ZlP().ZIm(a(-16447, 22698));
    if (zs5n != null && a(-16433, -32065).equalsIgnoreCase(zs5n.ZQG())) {
      this.Zo.add(paramZsq8);
      if (str != null) {
        this.Zt.add(paramZsq8);
        return;
      } 
      return;
    } 
    this.Zt.add(paramZsq8);
  }
  
  private static Collection lambda$reportIssues$0(String paramString) {
    return new ArrayList();
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\r¼GOß\\nq$Aµi450»KóéV:Û×1ñü\\b¯QM¨\ËTW­l#R2â¯ã·(âÍï;çÈã½'¯û!Öt(x£bDí¡\\bÑÄz:Ábì'¡ê49`ÅÙìØVñÞÝÕ?3Ð'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #74
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc ';©8{cÐÎÎ¹Ç'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #86
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
    //   128: putstatic burp/Zzn4.a : [Ljava/lang/String;
    //   131: bipush #25
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zzn4.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #35
    //   214: goto -> 243
    //   217: bipush #52
    //   219: goto -> 243
    //   222: bipush #108
    //   224: goto -> 243
    //   227: iconst_5
    //   228: goto -> 243
    //   231: bipush #32
    //   233: goto -> 243
    //   236: bipush #10
    //   238: goto -> 243
    //   241: bipush #23
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: bipush #7
    //   302: anewarray burp/Zlo9
    //   305: dup
    //   306: iconst_0
    //   307: new burp/Zlo9
    //   310: dup
    //   311: sipush #-16418
    //   314: sipush #-30384
    //   317: invokestatic a : (II)Ljava/lang/String;
    //   320: iconst_1
    //   321: anewarray java/lang/String
    //   324: dup
    //   325: iconst_0
    //   326: sipush #-16436
    //   329: sipush #-26855
    //   332: invokestatic a : (II)Ljava/lang/String;
    //   335: aastore
    //   336: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;)V
    //   339: aastore
    //   340: dup
    //   341: iconst_1
    //   342: new burp/Zlo9
    //   345: dup
    //   346: sipush #-16427
    //   349: sipush #11222
    //   352: invokestatic a : (II)Ljava/lang/String;
    //   355: iconst_1
    //   356: anewarray java/lang/String
    //   359: dup
    //   360: iconst_0
    //   361: sipush #-16448
    //   364: sipush #-2380
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: aastore
    //   371: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;)V
    //   374: aastore
    //   375: dup
    //   376: iconst_2
    //   377: new burp/Zlo9
    //   380: dup
    //   381: sipush #-16422
    //   384: sipush #11419
    //   387: invokestatic a : (II)Ljava/lang/String;
    //   390: iconst_1
    //   391: anewarray java/lang/String
    //   394: dup
    //   395: iconst_0
    //   396: sipush #-16448
    //   399: sipush #-2380
    //   402: invokestatic a : (II)Ljava/lang/String;
    //   405: aastore
    //   406: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;)V
    //   409: aastore
    //   410: dup
    //   411: iconst_3
    //   412: new burp/Zlo9
    //   415: dup
    //   416: sipush #-16445
    //   419: sipush #4273
    //   422: invokestatic a : (II)Ljava/lang/String;
    //   425: iconst_2
    //   426: anewarray java/lang/String
    //   429: dup
    //   430: iconst_0
    //   431: sipush #-16448
    //   434: sipush #-2380
    //   437: invokestatic a : (II)Ljava/lang/String;
    //   440: aastore
    //   441: dup
    //   442: iconst_1
    //   443: sipush #-16421
    //   446: sipush #23239
    //   449: invokestatic a : (II)Ljava/lang/String;
    //   452: aastore
    //   453: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;)V
    //   456: aastore
    //   457: dup
    //   458: iconst_4
    //   459: new burp/Zlo9
    //   462: dup
    //   463: sipush #-16423
    //   466: sipush #-11326
    //   469: invokestatic a : (II)Ljava/lang/String;
    //   472: iconst_2
    //   473: anewarray java/lang/String
    //   476: dup
    //   477: iconst_0
    //   478: sipush #-16420
    //   481: sipush #4235
    //   484: invokestatic a : (II)Ljava/lang/String;
    //   487: aastore
    //   488: dup
    //   489: iconst_1
    //   490: sipush #-16446
    //   493: sipush #-4179
    //   496: invokestatic a : (II)Ljava/lang/String;
    //   499: aastore
    //   500: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;)V
    //   503: aastore
    //   504: dup
    //   505: iconst_5
    //   506: new burp/Zlo9
    //   509: dup
    //   510: sipush #-16435
    //   513: sipush #-27417
    //   516: invokestatic a : (II)Ljava/lang/String;
    //   519: iconst_3
    //   520: anewarray java/lang/String
    //   523: dup
    //   524: iconst_0
    //   525: sipush #-16441
    //   528: sipush #-344
    //   531: invokestatic a : (II)Ljava/lang/String;
    //   534: aastore
    //   535: dup
    //   536: iconst_1
    //   537: sipush #-16417
    //   540: sipush #-21487
    //   543: invokestatic a : (II)Ljava/lang/String;
    //   546: aastore
    //   547: dup
    //   548: iconst_2
    //   549: sipush #-16438
    //   552: sipush #16292
    //   555: invokestatic a : (II)Ljava/lang/String;
    //   558: aastore
    //   559: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;)V
    //   562: aastore
    //   563: dup
    //   564: bipush #6
    //   566: new burp/Zlo9
    //   569: dup
    //   570: sipush #-16444
    //   573: sipush #-14430
    //   576: invokestatic a : (II)Ljava/lang/String;
    //   579: iconst_1
    //   580: anewarray java/lang/String
    //   583: dup
    //   584: iconst_0
    //   585: sipush #-16437
    //   588: sipush #18914
    //   591: invokestatic a : (II)Ljava/lang/String;
    //   594: aastore
    //   595: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;)V
    //   598: aastore
    //   599: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   602: putstatic burp/Zzn4.Zx : Ljava/util/List;
    //   605: iconst_5
    //   606: anewarray burp/Zlo9
    //   609: dup
    //   610: iconst_0
    //   611: new burp/Zlo9
    //   614: dup
    //   615: sipush #-16439
    //   618: sipush #26207
    //   621: invokestatic a : (II)Ljava/lang/String;
    //   624: iconst_1
    //   625: anewarray java/lang/String
    //   628: dup
    //   629: iconst_0
    //   630: sipush #-16448
    //   633: sipush #-2380
    //   636: invokestatic a : (II)Ljava/lang/String;
    //   639: aastore
    //   640: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;)V
    //   643: aastore
    //   644: dup
    //   645: iconst_1
    //   646: new burp/Zlo9
    //   649: dup
    //   650: sipush #-16434
    //   653: sipush #21425
    //   656: invokestatic a : (II)Ljava/lang/String;
    //   659: iconst_1
    //   660: anewarray java/lang/String
    //   663: dup
    //   664: iconst_0
    //   665: sipush #-16448
    //   668: sipush #-2380
    //   671: invokestatic a : (II)Ljava/lang/String;
    //   674: aastore
    //   675: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;)V
    //   678: aastore
    //   679: dup
    //   680: iconst_2
    //   681: new burp/Zlo9
    //   684: dup
    //   685: sipush #-16419
    //   688: sipush #-30827
    //   691: invokestatic a : (II)Ljava/lang/String;
    //   694: iconst_1
    //   695: anewarray java/lang/String
    //   698: dup
    //   699: iconst_0
    //   700: sipush #-16448
    //   703: sipush #-2380
    //   706: invokestatic a : (II)Ljava/lang/String;
    //   709: aastore
    //   710: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;)V
    //   713: aastore
    //   714: dup
    //   715: iconst_3
    //   716: new burp/Zlo9
    //   719: dup
    //   720: sipush #-16442
    //   723: sipush #21640
    //   726: invokestatic a : (II)Ljava/lang/String;
    //   729: iconst_1
    //   730: anewarray java/lang/String
    //   733: dup
    //   734: iconst_0
    //   735: sipush #-16448
    //   738: sipush #-2380
    //   741: invokestatic a : (II)Ljava/lang/String;
    //   744: aastore
    //   745: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;)V
    //   748: aastore
    //   749: dup
    //   750: iconst_4
    //   751: new burp/Zlo9
    //   754: dup
    //   755: sipush #-16443
    //   758: sipush #-17601
    //   761: invokestatic a : (II)Ljava/lang/String;
    //   764: iconst_2
    //   765: anewarray java/lang/String
    //   768: dup
    //   769: iconst_0
    //   770: sipush #-16440
    //   773: sipush #338
    //   776: invokestatic a : (II)Ljava/lang/String;
    //   779: aastore
    //   780: dup
    //   781: iconst_1
    //   782: sipush #-16448
    //   785: sipush #-2380
    //   788: invokestatic a : (II)Ljava/lang/String;
    //   791: aastore
    //   792: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;)V
    //   795: aastore
    //   796: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   799: putstatic burp/Zzn4.ZE : Ljava/util/List;
    //   802: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBFCD) & 0xFFFF;
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
      byte b1 = 19;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzn4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */