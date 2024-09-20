package burp;

import java.util.List;
import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zv3;
import net.portswigger.Zzo;

public class Zlue implements Zt5v {
  private final String Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zlue(String paramString) {
    this.Zm = paramString;
  }
  
  public Zstu Zt(List<Ze7n> paramList) {
    // Byte code:
    //   0: invokestatic ZB : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   10: invokestatic identity : ()Ljava/util/function/Function;
    //   13: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   18: <illegal opcode> apply : ()Ljava/util/function/BinaryOperator;
    //   23: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   28: invokestatic toMap : (Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BinaryOperator;Ljava/util/function/Supplier;)Ljava/util/stream/Collector;
    //   31: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   36: checkcast java/util/Map
    //   39: astore_3
    //   40: aload_3
    //   41: invokeinterface isEmpty : ()Z
    //   46: ifne -> 115
    //   49: aload_3
    //   50: invokeinterface values : ()Ljava/util/Collection;
    //   55: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   60: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   65: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   70: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   75: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   80: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   85: invokeinterface allMatch : (Ljava/util/function/Predicate;)Z
    //   90: ifeq -> 115
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   99: athrow
    //   100: invokestatic ZG : ()Lnet/portswigger/Zfb;
    //   103: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   108: goto -> 123
    //   111: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   114: athrow
    //   115: invokestatic ZU : ()Lnet/portswigger/Zi7;
    //   118: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   123: astore #4
    //   125: aload_3
    //   126: invokeinterface entrySet : ()Ljava/util/Set;
    //   131: invokeinterface iterator : ()Ljava/util/Iterator;
    //   136: astore #5
    //   138: aload #5
    //   140: invokeinterface hasNext : ()Z
    //   145: ifeq -> 986
    //   148: aload #5
    //   150: invokeinterface next : ()Ljava/lang/Object;
    //   155: checkcast java/util/Map$Entry
    //   158: astore #6
    //   160: aload #6
    //   162: invokeinterface getKey : ()Ljava/lang/Object;
    //   167: checkcast burp/Ze7n
    //   170: astore #7
    //   172: aload #6
    //   174: invokeinterface getValue : ()Ljava/lang/Object;
    //   179: checkcast [Ljava/lang/String;
    //   182: astore #8
    //   184: aload #7
    //   186: getstatic burp/Zrdu.JSON_PARAM : Lburp/Zrdu;
    //   189: invokestatic ZM : (Lburp/Ze7n;Lburp/Zrdu;)Ljava/util/List;
    //   192: invokeinterface iterator : ()Ljava/util/Iterator;
    //   197: astore #9
    //   199: aload #9
    //   201: invokeinterface hasNext : ()Z
    //   206: ifeq -> 982
    //   209: aload #9
    //   211: invokeinterface next : ()Ljava/lang/Object;
    //   216: checkcast burp/Zt8g
    //   219: astore #10
    //   221: aload #4
    //   223: astore #11
    //   225: iconst_0
    //   226: istore #12
    //   228: iload #12
    //   230: aload #8
    //   232: arraylength
    //   233: iconst_1
    //   234: isub
    //   235: if_icmpge -> 635
    //   238: aload #8
    //   240: iload #12
    //   242: aaload
    //   243: astore #13
    //   245: aload #8
    //   247: iload #12
    //   249: iconst_1
    //   250: iadd
    //   251: aaload
    //   252: astore #14
    //   254: aload #13
    //   256: invokestatic ZY : (Ljava/lang/String;)Ljava/util/Optional;
    //   259: astore #15
    //   261: aload #14
    //   263: invokestatic ZY : (Ljava/lang/String;)Ljava/util/Optional;
    //   266: astore #16
    //   268: aload #15
    //   270: invokevirtual isPresent : ()Z
    //   273: ifeq -> 479
    //   276: aload #11
    //   278: invokeinterface Zw : ()Z
    //   283: ifeq -> 479
    //   286: goto -> 293
    //   289: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   292: athrow
    //   293: aload #11
    //   295: invokeinterface Zi : ()I
    //   300: istore #17
    //   302: iload #17
    //   304: aload #15
    //   306: invokevirtual get : ()Ljava/lang/Object;
    //   309: checkcast java/lang/Integer
    //   312: invokevirtual intValue : ()I
    //   315: iconst_1
    //   316: isub
    //   317: if_icmpge -> 338
    //   320: aload #11
    //   322: invokestatic ZE : ()Lnet/portswigger/Zmp;
    //   325: invokeinterface Zh : (Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   330: pop
    //   331: iinc #17, 1
    //   334: iload_2
    //   335: ifne -> 302
    //   338: aload #11
    //   340: aload #15
    //   342: invokevirtual get : ()Ljava/lang/Object;
    //   345: checkcast java/lang/Integer
    //   348: invokevirtual intValue : ()I
    //   351: invokeinterface ZG : (I)Lnet/portswigger/Zrmq;
    //   356: astore #17
    //   358: aload #16
    //   360: invokevirtual isPresent : ()Z
    //   363: ifeq -> 411
    //   366: aload #17
    //   368: invokeinterface Zw : ()Z
    //   373: ifne -> 411
    //   376: goto -> 383
    //   379: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   382: athrow
    //   383: invokestatic ZG : ()Lnet/portswigger/Zfb;
    //   386: astore #18
    //   388: aload #11
    //   390: aload #18
    //   392: invokeinterface Zh : (Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   397: pop
    //   398: aload #18
    //   400: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   405: astore #11
    //   407: iload_2
    //   408: ifne -> 475
    //   411: aload #16
    //   413: invokevirtual isEmpty : ()Z
    //   416: ifeq -> 471
    //   419: goto -> 426
    //   422: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   425: athrow
    //   426: aload #17
    //   428: invokeinterface Za : ()Z
    //   433: ifne -> 471
    //   436: goto -> 443
    //   439: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   442: athrow
    //   443: invokestatic ZU : ()Lnet/portswigger/Zi7;
    //   446: astore #18
    //   448: aload #11
    //   450: aload #18
    //   452: invokeinterface Zh : (Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   457: pop
    //   458: aload #18
    //   460: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   465: astore #11
    //   467: iload_2
    //   468: ifne -> 475
    //   471: aload #17
    //   473: astore #11
    //   475: iload_2
    //   476: ifne -> 628
    //   479: aload #11
    //   481: invokeinterface Za : ()Z
    //   486: ifeq -> 628
    //   489: goto -> 496
    //   492: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   495: athrow
    //   496: aload #11
    //   498: aload #13
    //   500: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   505: astore #17
    //   507: aload #16
    //   509: invokevirtual isPresent : ()Z
    //   512: ifeq -> 562
    //   515: aload #17
    //   517: invokeinterface Zw : ()Z
    //   522: ifne -> 562
    //   525: goto -> 532
    //   528: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   531: athrow
    //   532: invokestatic ZG : ()Lnet/portswigger/Zfb;
    //   535: astore #18
    //   537: aload #11
    //   539: aload #13
    //   541: aload #18
    //   543: invokeinterface ZN : (Ljava/lang/String;Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   548: pop
    //   549: aload #18
    //   551: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   556: astore #11
    //   558: iload_2
    //   559: ifne -> 628
    //   562: aload #16
    //   564: invokevirtual isEmpty : ()Z
    //   567: ifeq -> 624
    //   570: goto -> 577
    //   573: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   576: athrow
    //   577: aload #17
    //   579: invokeinterface Za : ()Z
    //   584: ifne -> 624
    //   587: goto -> 594
    //   590: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   593: athrow
    //   594: invokestatic ZU : ()Lnet/portswigger/Zi7;
    //   597: astore #18
    //   599: aload #11
    //   601: aload #13
    //   603: aload #18
    //   605: invokeinterface ZN : (Ljava/lang/String;Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   610: pop
    //   611: aload #18
    //   613: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   618: astore #11
    //   620: iload_2
    //   621: ifne -> 628
    //   624: aload #17
    //   626: astore #11
    //   628: iinc #12, 1
    //   631: iload_2
    //   632: ifne -> 228
    //   635: aload #10
    //   637: invokeinterface Zns : ()Ljava/lang/String;
    //   642: astore #12
    //   644: aload #10
    //   646: invokeinterface Zbn : ()Ljava/lang/String;
    //   651: astore #13
    //   653: aload #12
    //   655: ifnonnull -> 676
    //   658: iconst_0
    //   659: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   662: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   665: iload_2
    //   666: ifne -> 978
    //   669: goto -> 676
    //   672: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   675: athrow
    //   676: aload #13
    //   678: ifnonnull -> 725
    //   681: goto -> 688
    //   684: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   687: athrow
    //   688: aload #7
    //   690: invokeinterface ZH : ()Lburp/Zzuz;
    //   695: invokevirtual Zl : ()Z
    //   698: ifne -> 978
    //   701: goto -> 708
    //   704: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   707: athrow
    //   708: aload #11
    //   710: invokeinterface Zw : ()Z
    //   715: ifne -> 978
    //   718: goto -> 725
    //   721: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   724: athrow
    //   725: invokestatic ZE : ()Lnet/portswigger/Zmp;
    //   728: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   733: astore #14
    //   735: aload #7
    //   737: invokeinterface ZY : ()Lburp/Zmtz;
    //   742: getstatic burp/Zmtz.TEXT : Lburp/Zmtz;
    //   745: if_acmpeq -> 768
    //   748: aload #7
    //   750: invokeinterface ZY : ()Lburp/Zmtz;
    //   755: getstatic burp/Zmtz.ENUMERATION : Lburp/Zmtz;
    //   758: if_acmpne -> 796
    //   761: goto -> 768
    //   764: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   767: athrow
    //   768: aload #13
    //   770: ifnull -> 893
    //   773: goto -> 780
    //   776: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   779: athrow
    //   780: aload #13
    //   782: invokestatic ZN : (Ljava/lang/String;)Lnet/portswigger/Zhq;
    //   785: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   790: astore #14
    //   792: iload_2
    //   793: ifne -> 893
    //   796: aload #7
    //   798: invokeinterface ZY : ()Lburp/Zmtz;
    //   803: getstatic burp/Zmtz.BOOLEAN : Lburp/Zmtz;
    //   806: if_acmpne -> 835
    //   809: goto -> 816
    //   812: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   815: athrow
    //   816: aload #13
    //   818: invokestatic parseBoolean : (Ljava/lang/String;)Z
    //   821: invokestatic ZK : (Z)Lnet/portswigger/Zkw;
    //   824: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   829: astore #14
    //   831: iload_2
    //   832: ifne -> 893
    //   835: aload #7
    //   837: invokeinterface ZY : ()Lburp/Zmtz;
    //   842: getstatic burp/Zmtz.NUMBER : Lburp/Zmtz;
    //   845: if_acmpne -> 871
    //   848: goto -> 855
    //   851: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   854: athrow
    //   855: aload #13
    //   857: invokestatic Za : (Ljava/lang/String;)Lnet/portswigger/Zzo;
    //   860: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   865: astore #14
    //   867: iload_2
    //   868: ifne -> 893
    //   871: iconst_0
    //   872: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   875: aload #7
    //   877: invokeinterface Zg : ()B
    //   882: i2l
    //   883: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   886: goto -> 893
    //   889: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   892: athrow
    //   893: aload #11
    //   895: invokeinterface Za : ()Z
    //   900: ifeq -> 926
    //   903: aload #11
    //   905: aload #12
    //   907: aload #14
    //   909: invokeinterface ZN : (Ljava/lang/String;Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   914: pop
    //   915: iload_2
    //   916: ifne -> 978
    //   919: goto -> 926
    //   922: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   925: athrow
    //   926: aload #11
    //   928: invokeinterface Zw : ()Z
    //   933: ifeq -> 964
    //   936: goto -> 943
    //   939: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   942: athrow
    //   943: aload #11
    //   945: aload #14
    //   947: invokeinterface Zh : (Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   952: pop
    //   953: iload_2
    //   954: ifne -> 978
    //   957: goto -> 964
    //   960: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   963: athrow
    //   964: iconst_0
    //   965: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   968: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   971: goto -> 978
    //   974: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   977: athrow
    //   978: iload_2
    //   979: ifne -> 199
    //   982: iload_2
    //   983: ifne -> 138
    //   986: aload #4
    //   988: invokeinterface toString : ()Ljava/lang/String;
    //   993: invokestatic Za : (Ljava/lang/String;)Lburp/Zyf;
    //   996: invokestatic Zwu : ()[Lburp/Zbqc;
    //   999: ifnonnull -> 1016
    //   1002: iinc #2, 1
    //   1005: iload_2
    //   1006: invokestatic Zk : (I)V
    //   1009: goto -> 1016
    //   1012: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   1015: athrow
    //   1016: areturn
    // Exception table:
    //   from	to	target	type
    //   40	93	96	java/lang/NumberFormatException
    //   49	111	111	java/lang/NumberFormatException
    //   268	286	289	java/lang/NumberFormatException
    //   358	376	379	java/lang/NumberFormatException
    //   407	419	422	java/lang/NumberFormatException
    //   411	436	439	java/lang/NumberFormatException
    //   475	489	492	java/lang/NumberFormatException
    //   507	525	528	java/lang/NumberFormatException
    //   558	570	573	java/lang/NumberFormatException
    //   562	587	590	java/lang/NumberFormatException
    //   653	669	672	java/lang/NumberFormatException
    //   658	681	684	java/lang/NumberFormatException
    //   676	701	704	java/lang/NumberFormatException
    //   688	718	721	java/lang/NumberFormatException
    //   735	761	764	java/lang/NumberFormatException
    //   748	773	776	java/lang/NumberFormatException
    //   792	809	812	java/lang/NumberFormatException
    //   831	848	851	java/lang/NumberFormatException
    //   867	886	889	java/lang/NumberFormatException
    //   893	919	922	java/lang/NumberFormatException
    //   903	936	939	java/lang/NumberFormatException
    //   926	957	960	java/lang/NumberFormatException
    //   943	971	974	java/lang/NumberFormatException
    //   986	1009	1012	java/lang/NumberFormatException
  }
  
  public Ztnz Zf() {
    return new Ztnz(a(8903, -6414), this.Zm);
  }
  
  private static Optional<Integer> ZY(String paramString) {
    try {
      if (paramString.startsWith("[") && paramString.endsWith("]"))
        try {
          return Optional.of(Integer.valueOf(Integer.parseInt(paramString.substring(1, paramString.length() - 1))));
        } catch (NumberFormatException numberFormatException) {
          Zah.Zl(numberFormatException, Zk_.COMMON_RUNTIME_FAILURE);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return Optional.empty();
  }
  
  private static Zzo Za(String paramString) {
    if (paramString != null)
      try {
        return Zv3.Zb(Double.parseDouble(paramString));
      } catch (NumberFormatException numberFormatException) {
        Zah.Zl(numberFormatException, Zk_.COMMON_RUNTIME_FAILURE);
      }  
    return Zv3.Za(0);
  }
  
  private static String lambda$buildRequestBodyFor$2(String[] paramArrayOfString) {
    return paramArrayOfString[0];
  }
  
  private static String[] lambda$buildRequestBodyFor$1(String[] paramArrayOfString1, String[] paramArrayOfString2) {
    return paramArrayOfString2;
  }
  
  private static String[] lambda$buildRequestBodyFor$0(Ze7n paramZe7n) {
    return paramZe7n.ZS().split(a(8902, -11625));
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '=RÏ"^ò\\n·~Äý'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #12
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #118
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zlue.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zlue.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #83
    //   154: goto -> 184
    //   157: bipush #93
    //   159: goto -> 184
    //   162: bipush #98
    //   164: goto -> 184
    //   167: bipush #75
    //   169: goto -> 184
    //   172: bipush #90
    //   174: goto -> 184
    //   177: bipush #62
    //   179: goto -> 184
    //   182: bipush #84
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x22C7) & 0xFFFF;
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
      byte b1 = 23;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlue.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */