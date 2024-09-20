package burp;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;

public class Zkti {
  public static final List<Zer7> Zf;
  
  public static final List<Zer7> ZN;
  
  private static String[] ZB;
  
  public static Zx_5 ZV(String paramString1, boolean paramBoolean, byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, String paramString2, Zmzk paramZmzk, Zvow paramZvow1, Zvow paramZvow2) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    hashMap.put(Long.valueOf(Ztz3.EXTENSION_NAME.permanentIndex), paramString2);
    String[] arrayOfString = Z_();
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[2]); 
    return new Zx_5(Zzu2.BACKUP_FILE, paramByte, 0, Zkb.ZG(paramArrayOfbyte1), (Map)hashMap, Zb99.Zh((Zlfv<? extends Zgkc>[])new Zlfv[] { new Zt2w(new Zz25(paramArrayOfbyte1, 0), paramZvow1), new Zt2w(new Zz25(paramArrayOfbyte2, 0), paramZvow2) }), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString1 + paramString1), null);
  }
  
  public static Zkvd Zf(Zbnt paramZbnt, Zs57 paramZs571, Zs57 paramZs572) {
    Ztwq ztwq = new Ztwq(paramZs571.ZX, paramZs572.ZX, paramZbnt);
    Zl13 zl13 = new Zl13(paramZs571.Zb);
    zl13.ZO(new Zl13(paramZs572.Zb), ztwq);
    return ztwq.ZL();
  }
  
  public static Zvow ZR(Zvow paramZvow, Zs57 paramZs57, byte[] paramArrayOfbyte, List<Zl1r> paramList) {
    String str1 = Zkb.ZG(paramZs57.ZR);
    String str2 = Zkb.ZG(paramArrayOfbyte);
    int i = str1.indexOf(str2);
    i = (i != -1) ? i : 0;
    return paramZvow.Zp(paramZs57.ZR).ZK(Collections.singletonList(new Zl1r(i, i + str2.length()))).Zu(paramZs57.ZX).Z_(paramList);
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: aconst_null
    //   10: ldc ']0l]0u5]+]H]0u]+j2,0d8\\f~]8j]\\r0u\\b]\\r0u}tA\\t]\\r0u}t,0l]#]\\r0u}t]0u]0u]=c]3}]\\r0u}Nt2])b]0d,=c]+5]]0d8\\f~]\\r0u}t]8w]+'
    //   12: dup
    //   13: astore_3
    //   14: invokevirtual length : ()I
    //   17: istore #5
    //   19: invokestatic ZN : ([Ljava/lang/String;)V
    //   22: iconst_4
    //   23: istore_2
    //   24: iconst_m1
    //   25: istore_1
    //   26: bipush #104
    //   28: iinc #1, 1
    //   31: aload_3
    //   32: iload_1
    //   33: dup
    //   34: iload_2
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 132
    //   43: aload_0
    //   44: swap
    //   45: iload #4
    //   47: iinc #4, 1
    //   50: swap
    //   51: aastore
    //   52: iload_1
    //   53: iload_2
    //   54: iadd
    //   55: dup
    //   56: istore_1
    //   57: iload #5
    //   59: if_icmpge -> 71
    //   62: aload_3
    //   63: iload_1
    //   64: invokevirtual charAt : (I)C
    //   67: istore_2
    //   68: goto -> 26
    //   71: ldc '&/\\rjy'
    //   73: dup
    //   74: astore_3
    //   75: invokevirtual length : ()I
    //   78: istore #5
    //   80: iconst_3
    //   81: istore_2
    //   82: iconst_m1
    //   83: istore_1
    //   84: bipush #95
    //   86: iinc #1, 1
    //   89: aload_3
    //   90: iload_1
    //   91: dup
    //   92: iload_2
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 132
    //   101: aload_0
    //   102: swap
    //   103: iload #4
    //   105: iinc #4, 1
    //   108: swap
    //   109: aastore
    //   110: iload_1
    //   111: iload_2
    //   112: iadd
    //   113: dup
    //   114: istore_1
    //   115: iload #5
    //   117: if_icmpge -> 129
    //   120: aload_3
    //   121: iload_1
    //   122: invokevirtual charAt : (I)C
    //   125: istore_2
    //   126: goto -> 84
    //   129: goto -> 288
    //   132: dup_x2
    //   133: pop
    //   134: invokevirtual toCharArray : ()[C
    //   137: dup_x1
    //   138: arraylength
    //   139: dup_x2
    //   140: pop
    //   141: iconst_0
    //   142: istore #6
    //   144: dup2_x1
    //   145: pop2
    //   146: dup_x2
    //   147: iconst_1
    //   148: if_icmpgt -> 248
    //   151: dup2
    //   152: swap
    //   153: iload #6
    //   155: dup2_x1
    //   156: caload
    //   157: swap
    //   158: iload #6
    //   160: bipush #7
    //   162: irem
    //   163: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #27
    //   202: goto -> 232
    //   205: bipush #17
    //   207: goto -> 232
    //   210: bipush #57
    //   212: goto -> 232
    //   215: bipush #111
    //   217: goto -> 232
    //   220: bipush #59
    //   222: goto -> 232
    //   225: bipush #17
    //   227: goto -> 232
    //   230: bipush #102
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 155
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 151
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 43, 0 -> 101
    //   288: bipush #20
    //   290: anewarray burp/Zer7
    //   293: dup
    //   294: iconst_0
    //   295: aload_0
    //   296: bipush #31
    //   298: aaload
    //   299: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   302: aastore
    //   303: dup
    //   304: iconst_1
    //   305: aload_0
    //   306: bipush #13
    //   308: aaload
    //   309: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   312: aastore
    //   313: dup
    //   314: iconst_2
    //   315: aload_0
    //   316: bipush #24
    //   318: aaload
    //   319: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   322: aastore
    //   323: dup
    //   324: iconst_3
    //   325: aload_0
    //   326: bipush #18
    //   328: aaload
    //   329: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   332: aastore
    //   333: dup
    //   334: iconst_4
    //   335: aload_0
    //   336: bipush #21
    //   338: aaload
    //   339: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   342: aastore
    //   343: dup
    //   344: iconst_5
    //   345: aload_0
    //   346: iconst_3
    //   347: aaload
    //   348: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   351: aastore
    //   352: dup
    //   353: bipush #6
    //   355: aload_0
    //   356: iconst_1
    //   357: aaload
    //   358: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   361: aastore
    //   362: dup
    //   363: bipush #7
    //   365: aload_0
    //   366: bipush #6
    //   368: aaload
    //   369: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   372: aastore
    //   373: dup
    //   374: bipush #8
    //   376: aload_0
    //   377: bipush #9
    //   379: aaload
    //   380: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   383: aastore
    //   384: dup
    //   385: bipush #9
    //   387: aload_0
    //   388: bipush #19
    //   390: aaload
    //   391: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   394: aastore
    //   395: dup
    //   396: bipush #10
    //   398: aload_0
    //   399: bipush #10
    //   401: aaload
    //   402: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   405: aastore
    //   406: dup
    //   407: bipush #11
    //   409: aload_0
    //   410: bipush #27
    //   412: aaload
    //   413: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   416: aastore
    //   417: dup
    //   418: bipush #12
    //   420: aload_0
    //   421: bipush #11
    //   423: aaload
    //   424: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   427: aastore
    //   428: dup
    //   429: bipush #13
    //   431: aload_0
    //   432: bipush #14
    //   434: aaload
    //   435: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   438: aastore
    //   439: dup
    //   440: bipush #14
    //   442: aload_0
    //   443: bipush #29
    //   445: aaload
    //   446: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   449: aastore
    //   450: dup
    //   451: bipush #15
    //   453: aload_0
    //   454: bipush #28
    //   456: aaload
    //   457: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   460: aastore
    //   461: dup
    //   462: bipush #16
    //   464: aload_0
    //   465: iconst_5
    //   466: aaload
    //   467: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   470: aastore
    //   471: dup
    //   472: bipush #17
    //   474: aload_0
    //   475: bipush #8
    //   477: aaload
    //   478: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   481: aastore
    //   482: dup
    //   483: bipush #18
    //   485: aload_0
    //   486: bipush #16
    //   488: aaload
    //   489: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   492: aastore
    //   493: dup
    //   494: bipush #19
    //   496: aload_0
    //   497: bipush #15
    //   499: aaload
    //   500: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   503: aastore
    //   504: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   507: putstatic burp/Zkti.Zf : Ljava/util/List;
    //   510: bipush #13
    //   512: anewarray burp/Zer7
    //   515: dup
    //   516: iconst_0
    //   517: aload_0
    //   518: bipush #17
    //   520: aaload
    //   521: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   524: aastore
    //   525: dup
    //   526: iconst_1
    //   527: aload_0
    //   528: iconst_0
    //   529: aaload
    //   530: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   533: aastore
    //   534: dup
    //   535: iconst_2
    //   536: aload_0
    //   537: bipush #22
    //   539: aaload
    //   540: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   543: aastore
    //   544: dup
    //   545: iconst_3
    //   546: aload_0
    //   547: bipush #26
    //   549: aaload
    //   550: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   553: aastore
    //   554: dup
    //   555: iconst_4
    //   556: aload_0
    //   557: iconst_4
    //   558: aaload
    //   559: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   562: aastore
    //   563: dup
    //   564: iconst_5
    //   565: aload_0
    //   566: bipush #25
    //   568: aaload
    //   569: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   572: aastore
    //   573: dup
    //   574: bipush #6
    //   576: aload_0
    //   577: bipush #23
    //   579: aaload
    //   580: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   583: aastore
    //   584: dup
    //   585: bipush #7
    //   587: aload_0
    //   588: iconst_2
    //   589: aaload
    //   590: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   593: aastore
    //   594: dup
    //   595: bipush #8
    //   597: aload_0
    //   598: bipush #12
    //   600: aaload
    //   601: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   604: aastore
    //   605: dup
    //   606: bipush #9
    //   608: aload_0
    //   609: bipush #30
    //   611: aaload
    //   612: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   615: aastore
    //   616: dup
    //   617: bipush #10
    //   619: aload_0
    //   620: bipush #7
    //   622: aaload
    //   623: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   626: aastore
    //   627: dup
    //   628: bipush #11
    //   630: aload_0
    //   631: bipush #20
    //   633: aaload
    //   634: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   637: aastore
    //   638: dup
    //   639: bipush #12
    //   641: ldc '1'
    //   643: ldc '2'
    //   645: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   648: invokestatic ZZ : (Ljava/lang/String;Ljava/util/List;)Lburp/Ziq;
    //   651: aastore
    //   652: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   655: putstatic burp/Zkti.ZN : Ljava/util/List;
    //   658: return
  }
  
  public static void ZN(String[] paramArrayOfString) {
    ZB = paramArrayOfString;
  }
  
  public static String[] Z_() {
    return ZB;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkti.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */