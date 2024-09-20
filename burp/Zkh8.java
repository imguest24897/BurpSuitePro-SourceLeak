package burp;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zi7;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zlh;
import net.portswigger.Zrmq;
import net.portswigger.Zrzt;
import net.portswigger.Zv3;

public class Zkh8 {
  public static final List<String> ZG;
  
  public static final List<String> Zs;
  
  private static final List<String> Zu;
  
  private static String Ze;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Optional<Zrdu> ZT(List<Zlou> paramList) {
    return paramList.stream().filter(Zkh8::lambda$inferQueryParameterTypeFromParams$0).map(Zkh8::lambda$inferQueryParameterTypeFromParams$1).findFirst();
  }
  
  public static Optional<Zrdu> ZF(Zsba paramZsba, String paramString) {
    try {
      switch (Zsuu.Zs[paramZsba.ordinal()]) {
        case 1:
          try {
          
          } catch (Zlh zlh) {
            throw a(null);
          } 
          return Optional.ofNullable(a(-20490, -21928).equals(paramString) ? Zrdu.URL_PARAM : Zrdu.BODY_PARAM_URL_ENCODED);
        case 2:
        
      } 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    try {
    
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return Optional.ofNullable(a(-20487, 13996).equals(paramString) ? Zrdu.URL_PARAM : null);
  }
  
  private static int Ze(Zefx paramZefx) {
    return ((Integer)ZT(paramZefx.Zc()).or(paramZefx::lambda$getMatchingGraphQlParameterCount$2).map(paramZefx::lambda$getMatchingGraphQlParameterCount$4).orElse(Integer.valueOf(0))).intValue();
  }
  
  public static Optional<String> ZY(Zefx paramZefx) {
    return ZT(paramZefx.Zc()).or(paramZefx::lambda$getMatchingGraphQlParameterCount$2).flatMap(paramZefx::lambda$getGraphQlQuery$7);
  }
  
  private static String Zf(Zlou paramZlou) {
    try {
      if (paramZlou.Zx.Z_())
        return Zrzt.ZJ(paramZlou.Zr); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    try {
      if (paramZlou.Zx == Zrdu.JSON_PARAM)
        return Zv3.Zx("\"" + paramZlou.Zr + "\"").ZW(); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return paramZlou.Zr;
  }
  
  public static boolean Zv(Zb6q paramZb6q) {
    try {
      if (paramZb6q != null)
        try {
          if (((Boolean)paramZb6q.ZY(a(-20504, -6711)).<Boolean>map(Zkh8::lambda$hasJsonContentType$8).orElse(Boolean.valueOf(false))).booleanValue());
        } catch (Zlh zlh) {
          throw a(null);
        }  
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return false;
  }
  
  public static Optional<Byte> ZR(Zefx paramZefx, Zb6q paramZb6q) {
    int i = Ze(paramZefx);
    try {
      if (i > 0)
        try {
          if (ZK(paramZb6q)) {
            try {
              if (i > 1)
                return Optional.of(Byte.valueOf((byte)2)); 
            } catch (Zlh zlh) {
              throw a(null);
            } 
            try {
              if (Zkb.ZG(paramZefx.ZF().Zd4()).matches(a(-20483, -10331)))
                return Optional.of(Byte.valueOf((byte)2)); 
            } catch (Zlh zlh) {
              throw a(null);
            } 
            String str = ZY(paramZefx).orElse("");
            try {
              if (str.contains("\n"))
                return Optional.of(Byte.valueOf((byte)2)); 
            } catch (Zlh zlh) {
              throw a(null);
            } 
            return Optional.of(Byte.valueOf((byte)1));
          } 
        } catch (Zlh zlh) {
          throw a(null);
        }  
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return Optional.empty();
  }
  
  public static Optional<Byte> ZG(Ze3n paramZe3n) {
    return ZR(paramZe3n.ZA(), paramZe3n.ZL());
  }
  
  public static Optional<Byte> Zb(Zb6q paramZb6q) {
    Optional<Zrmq> optional = ZY(paramZb6q);
    try {
      if (!optional.isEmpty()) {
        try {
          if (!((Zrmq)optional.get()).Za())
            return Optional.empty(); 
        } catch (Zlh zlh) {
          throw a(null);
        } 
      } else {
        return Optional.empty();
      } 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    Zi7 zi7 = ((Zrmq)optional.get()).Zu();
    Zrmq zrmq = zi7.Zo(a(-20505, 2235));
    try {
      if (zrmq != null)
        try {
          if (zrmq.Za()) {
            try {
            
            } catch (Zlh zlh) {
              throw a(null);
            } 
            return zrmq.Zm(a(-20512, 26605)) ? Optional.<Byte>of(Byte.valueOf((byte)3)) : Optional.<Byte>empty();
          } 
          return Optional.empty();
        } catch (Zlh zlh) {
          throw a(null);
        }  
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return Optional.empty();
  }
  
  public static boolean ZK(Zb6q paramZb6q) {
    Optional<Zrmq> optional = ZY(paramZb6q);
    try {
      if (optional.isEmpty())
        return false; 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    try {
      if (!((Zrmq)optional.get()).Za())
        return false; 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    Zi7 zi7 = ((Zrmq)optional.get()).Zu();
    try {
      if (!zi7.Zm(a(-20505, 2235))) {
        try {
          if (zi7.Zm(a(-20497, 15181)));
        } catch (Zlh zlh) {
          throw a(null);
        } 
        return false;
      } 
    } catch (Zlh zlh) {
      throw a(null);
    } 
  }
  
  public static Optional<Zrmq> ZY(Zb6q paramZb6q) {
    try {
      if (paramZb6q.Zt() != null)
        try {
          if (Zv(paramZb6q))
            try {
              return Optional.of(Zv3.ZD(paramZb6q.Zt().ZiD()));
            } catch (Zlh zlh) {
              Zah.Zl((Throwable)zlh, Zk_.IGNORED);
              return Optional.empty();
            }  
          return Optional.empty();
        } catch (Zlh zlh) {
          throw a(null);
        }  
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return Optional.empty();
  }
  
  public static Zg3d Z_(Ze3n paramZe3n, Zrtz paramZrtz) {
    return ZP(paramZe3n, paramZrtz, Zrec.Zd(), false);
  }
  
  public static Zg3d Zr(Ze3n paramZe3n, Zrtz paramZrtz, Zrec paramZrec) {
    return ZP(paramZe3n, paramZrtz, paramZrec, true);
  }
  
  private static Zg3d ZP(Ze3n paramZe3n, Zrtz paramZrtz, Zrec paramZrec, boolean paramBoolean) {
    if (paramZrec == null)
      paramZrec = Zrec.Zd(); 
    Zlyj zlyj = paramZe3n.Zr((new Zlv5()).Za(Zxgd.Zu(paramZrtz).ZY(paramZrec)).Ze(paramBoolean));
    return zlyj.ZBB().ZG();
  }
  
  public static List<Zl1r> ZG(Zefx paramZefx) {
    String str = Zj();
    try {
      if (Zbqc.Zwu() == null)
        Zu("NJfz4b"); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return ZT(paramZefx.Zc()).or(paramZefx::lambda$getMatchingGraphQlParameterCount$2).map(paramZefx::lambda$getGraphQlQueryHighlights$12).orElse(Collections.emptyList());
  }
  
  public static boolean Zk(Zb6q paramZb6q) {
    try {
      Optional<Zrmq> optional = ZY(paramZb6q);
      if (optional.isEmpty())
        return false; 
      if (!((Zrmq)optional.get()).Za())
        return false; 
      Zi7 zi71 = ((Zrmq)optional.get()).Zu();
      try {
        if (!zi71.Zm(a(-20510, 1408)) || !zi71.Zo(a(-20505, 2235)).Za())
          return false; 
      } catch (Zlh zlh) {
        throw a(null);
      } 
      Zi7 zi72 = zi71.Zo(a(-20505, 2235)).Zu();
      try {
        if (!zi72.Zm(a(-20486, 10118)) || !zi72.Zo(a(-20485, -9430)).Za())
          return false; 
      } catch (Zlh zlh) {
        throw a(null);
      } 
      Zi7 zi73 = zi72.Zo(a(-20485, -9430)).Zu();
      return Zu.stream().anyMatch(zi73::lambda$hasIntrospection$13);
    } catch (Zlh zlh) {
      Zah.Zl((Throwable)zlh, Zk_.COMMON_RUNTIME_FAILURE);
      return false;
    } 
  }
  
  private static boolean lambda$hasIntrospection$13(Zi7 paramZi7, String paramString) {
    try {
      if (paramZi7.Zm(paramString))
        try {
          if (paramZi7.Zo(paramString).Za());
        } catch (Zlh zlh) {
          throw a(null);
        }  
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return false;
  }
  
  private static List lambda$getGraphQlQueryHighlights$12(Zefx paramZefx, Zrdu paramZrdu) {
    return paramZefx.ZZ(paramZrdu::lambda$getGraphQlQueryHighlights$10).stream().map(Zkh8::lambda$getGraphQlQueryHighlights$11).toList();
  }
  
  private static Zl1r lambda$getGraphQlQueryHighlights$11(Zlou paramZlou) {
    return new Zl1r(paramZlou.ZE, paramZlou.ZV);
  }
  
  private static boolean lambda$getGraphQlQueryHighlights$10(Zrdu paramZrdu, Zlou paramZlou) {
    try {
      if (paramZlou.Zx == paramZrdu)
        try {
          if (paramZlou.ZA.equalsIgnoreCase(a(-20499, -21464)));
        } catch (Zlh zlh) {
          throw a(null);
        }  
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return false;
  }
  
  private static Boolean lambda$hasJsonContentType$8(String paramString) {
    return Boolean.valueOf(paramString.toLowerCase().contains(a(-20506, 30529)));
  }
  
  private static Optional lambda$getGraphQlQuery$7(Zefx paramZefx, Zrdu paramZrdu) {
    return paramZefx.ZZ(paramZrdu::lambda$getGraphQlQuery$6).stream().map(Zkh8::Zf).findFirst();
  }
  
  private static boolean lambda$getGraphQlQuery$6(Zrdu paramZrdu, Zlou paramZlou) {
    try {
      if (paramZlou.ZA.equalsIgnoreCase(a(-20489, 29548)))
        try {
          if (paramZlou.Zx == paramZrdu);
        } catch (Zlh zlh) {
          throw a(null);
        }  
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return false;
  }
  
  private static Integer lambda$getMatchingGraphQlParameterCount$4(Zefx paramZefx, Zrdu paramZrdu) {
    return Integer.valueOf(paramZefx.ZZ(paramZrdu::lambda$getMatchingGraphQlParameterCount$3).size());
  }
  
  private static boolean lambda$getMatchingGraphQlParameterCount$3(Zrdu paramZrdu, Zlou paramZlou) {
    try {
      if (Zs.contains(paramZlou.ZA.toLowerCase()))
        try {
          if (paramZlou.Zx == paramZrdu);
        } catch (Zlh zlh) {
          throw a(null);
        }  
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return false;
  }
  
  private static Optional lambda$getMatchingGraphQlParameterCount$2(Zefx paramZefx) {
    return ZF(paramZefx.Zv(), paramZefx.Zr());
  }
  
  private static Zrdu lambda$inferQueryParameterTypeFromParams$1(Zlou paramZlou) {
    return paramZlou.Zx;
  }
  
  private static boolean lambda$inferQueryParameterTypeFromParams$0(Zlou paramZlou) {
    return paramZlou.ZA.equals(a(-20499, -21464));
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc '¸SÉkÂt¦LD¦¬ª.Ì\\f¯%Év\\b\\fÒJl?_°å0Äfðø¦*ÂDèHÎ¦¤8èðA¨]\\b\\r8ê.êõ@\\bqCg#ÅÓg\\b,³Vf2ûú}KÕõÙ\\f9\\b¹oÉmf±g¥¹\\tÖ~nú!ê3FH\\t|*¥"¨p88qÖÕfÂu "\\nÝÎóVb.?ónÊúå:£óA\\r¡] _÷`Î,÷·Ë9k\\f>_\\fyæ"ývÐ\\f Ä:¾.Zen$ûòo¦Úh{\\b6,ðóölþûîÝgâ®rá_µ(ÖÓåq^5¨uÛW8;ræÛ¼²Q¹úAM\\nN©d&bìQuv¥âÑÃ¤ù}à>'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #9
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic Zu : (Ljava/lang/String;)V
    //   27: bipush #124
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'Ì%\\nù)H«ãþ~á«q:¹J9'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_4
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #69
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zkh8.a : [Ljava/lang/String;
    //   135: bipush #32
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zkh8.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #11
    //   218: goto -> 248
    //   221: bipush #106
    //   223: goto -> 248
    //   226: bipush #28
    //   228: goto -> 248
    //   231: bipush #34
    //   233: goto -> 248
    //   236: bipush #44
    //   238: goto -> 248
    //   241: bipush #106
    //   243: goto -> 248
    //   246: bipush #78
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: bipush #13
    //   306: anewarray java/lang/String
    //   309: dup
    //   310: iconst_0
    //   311: sipush #-20507
    //   314: sipush #-184
    //   317: invokestatic a : (II)Ljava/lang/String;
    //   320: aastore
    //   321: dup
    //   322: iconst_1
    //   323: sipush #-20494
    //   326: sipush #5564
    //   329: invokestatic a : (II)Ljava/lang/String;
    //   332: aastore
    //   333: dup
    //   334: iconst_2
    //   335: sipush #-20500
    //   338: sipush #-15661
    //   341: invokestatic a : (II)Ljava/lang/String;
    //   344: aastore
    //   345: dup
    //   346: iconst_3
    //   347: sipush #-20511
    //   350: sipush #9552
    //   353: invokestatic a : (II)Ljava/lang/String;
    //   356: aastore
    //   357: dup
    //   358: iconst_4
    //   359: sipush #-20502
    //   362: sipush #7164
    //   365: invokestatic a : (II)Ljava/lang/String;
    //   368: aastore
    //   369: dup
    //   370: iconst_5
    //   371: sipush #-20488
    //   374: sipush #-15572
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: aastore
    //   381: dup
    //   382: bipush #6
    //   384: sipush #-20481
    //   387: sipush #-17293
    //   390: invokestatic a : (II)Ljava/lang/String;
    //   393: aastore
    //   394: dup
    //   395: bipush #7
    //   397: sipush #-20493
    //   400: sipush #13331
    //   403: invokestatic a : (II)Ljava/lang/String;
    //   406: aastore
    //   407: dup
    //   408: bipush #8
    //   410: sipush #-20492
    //   413: sipush #15681
    //   416: invokestatic a : (II)Ljava/lang/String;
    //   419: aastore
    //   420: dup
    //   421: bipush #9
    //   423: sipush #-20491
    //   426: sipush #-11761
    //   429: invokestatic a : (II)Ljava/lang/String;
    //   432: aastore
    //   433: dup
    //   434: bipush #10
    //   436: sipush #-20496
    //   439: sipush #-23418
    //   442: invokestatic a : (II)Ljava/lang/String;
    //   445: aastore
    //   446: dup
    //   447: bipush #11
    //   449: sipush #-20482
    //   452: sipush #18583
    //   455: invokestatic a : (II)Ljava/lang/String;
    //   458: aastore
    //   459: dup
    //   460: bipush #12
    //   462: sipush #-20501
    //   465: sipush #-1268
    //   468: invokestatic a : (II)Ljava/lang/String;
    //   471: aastore
    //   472: invokestatic of : ([Ljava/lang/Object;)Ljava/util/List;
    //   475: putstatic burp/Zkh8.ZG : Ljava/util/List;
    //   478: sipush #-20499
    //   481: sipush #-21464
    //   484: invokestatic a : (II)Ljava/lang/String;
    //   487: sipush #-20498
    //   490: sipush #14346
    //   493: invokestatic a : (II)Ljava/lang/String;
    //   496: sipush #-20509
    //   499: sipush #-21490
    //   502: invokestatic a : (II)Ljava/lang/String;
    //   505: sipush #-20484
    //   508: sipush #1474
    //   511: invokestatic a : (II)Ljava/lang/String;
    //   514: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   517: putstatic burp/Zkh8.Zs : Ljava/util/List;
    //   520: sipush #-20495
    //   523: sipush #-27063
    //   526: invokestatic a : (II)Ljava/lang/String;
    //   529: sipush #-20508
    //   532: sipush #-23827
    //   535: invokestatic a : (II)Ljava/lang/String;
    //   538: sipush #-20503
    //   541: sipush #16306
    //   544: invokestatic a : (II)Ljava/lang/String;
    //   547: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   550: putstatic burp/Zkh8.Zu : Ljava/util/List;
    //   553: return
  }
  
  public static void Zu(String paramString) {
    Ze = paramString;
  }
  
  public static String Zj() {
    return Ze;
  }
  
  private static Zlh a(Zlh paramZlh) {
    return paramZlh;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAFFC) & 0xFFFF;
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
      char c = '¡';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkh8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */