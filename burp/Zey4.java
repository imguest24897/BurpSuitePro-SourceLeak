package burp;

import java.util.List;
import javax.swing.text.Segment;

public class Zey4 extends Zey0 {
  private final String Zp;
  
  private final String ZS;
  
  private int ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zey4(List<String> paramList) {
    String str = Zgyj.ZZ(paramList, a(-2837, -15444), false);
    int i = str.indexOf(a(-2843, 8806));
    try {
      if (i == -1) {
        this.Zp = this.ZS = null;
        return;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zp = a(-2840, 6504) + a(-2840, 6504);
    this.ZS = this.Zp + this.Zp;
  }
  
  public Ze7g Z_(int paramInt1, Segment paramSegment, Zska paramZska, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZS : ()V
    //   4: aload_0
    //   5: aload_2
    //   6: aload_3
    //   7: invokevirtual ZX : ()I
    //   10: invokevirtual Zg : (Ljavax/swing/text/Segment;I)Lburp/Zt6w;
    //   13: astore #6
    //   15: getstatic burp/Zt6w.SPACE : Lburp/Zt6w;
    //   18: astore #7
    //   20: aload_2
    //   21: getfield offset : I
    //   24: istore #8
    //   26: invokestatic Zj : ()Ljava/lang/String;
    //   29: iconst_0
    //   30: istore #10
    //   32: aload_0
    //   33: iload #4
    //   35: aload_2
    //   36: getfield offset : I
    //   39: isub
    //   40: putfield ZJ : I
    //   43: astore #5
    //   45: aload_2
    //   46: getfield offset : I
    //   49: istore #9
    //   51: iload #9
    //   53: aload_2
    //   54: getfield offset : I
    //   57: aload_2
    //   58: getfield count : I
    //   61: iadd
    //   62: if_icmpge -> 992
    //   65: aload_2
    //   66: getfield array : [C
    //   69: iload #9
    //   71: caload
    //   72: istore #11
    //   74: aload #6
    //   76: invokevirtual ordinal : ()I
    //   79: tableswitch default -> 952, 0 -> 136, 1 -> 186, 2 -> 294, 3 -> 391, 4 -> 601, 5 -> 671, 6 -> 701, 7 -> 782, 8 -> 347, 9 -> 852, 10 -> 902
    //   136: iload #11
    //   138: invokestatic ZC : (C)Z
    //   141: ifeq -> 984
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   150: athrow
    //   151: aload_0
    //   152: aload_2
    //   153: getfield array : [C
    //   156: iload #8
    //   158: iload #9
    //   160: iconst_1
    //   161: isub
    //   162: bipush #21
    //   164: invokevirtual Zb : ([CIII)V
    //   167: iload #9
    //   169: istore #8
    //   171: getstatic burp/Zt6w.SPACE : Lburp/Zt6w;
    //   174: astore #6
    //   176: getstatic burp/Zt6w.END : Lburp/Zt6w;
    //   179: astore #7
    //   181: aload #5
    //   183: ifnull -> 984
    //   186: iload #11
    //   188: bipush #58
    //   190: if_icmpne -> 244
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   199: athrow
    //   200: aload_0
    //   201: aload_2
    //   202: getfield array : [C
    //   205: iload #8
    //   207: iload #9
    //   209: invokevirtual ZN : ([CII)Z
    //   212: istore #10
    //   214: aload_0
    //   215: aload_2
    //   216: getfield array : [C
    //   219: iload #8
    //   221: iload #9
    //   223: iconst_1
    //   224: isub
    //   225: bipush #41
    //   227: invokevirtual Zb : ([CIII)V
    //   230: iload #9
    //   232: istore #8
    //   234: getstatic burp/Zt6w.HEADER_SEPARATOR : Lburp/Zt6w;
    //   237: astore #6
    //   239: aload #5
    //   241: ifnull -> 984
    //   244: iload #11
    //   246: invokestatic ZC : (C)Z
    //   249: ifeq -> 984
    //   252: goto -> 259
    //   255: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   258: athrow
    //   259: aload_0
    //   260: aload_2
    //   261: getfield array : [C
    //   264: iload #8
    //   266: iload #9
    //   268: iconst_1
    //   269: isub
    //   270: bipush #41
    //   272: invokevirtual Zb : ([CIII)V
    //   275: iload #9
    //   277: istore #8
    //   279: getstatic burp/Zt6w.SPACE : Lburp/Zt6w;
    //   282: astore #6
    //   284: getstatic burp/Zt6w.END : Lburp/Zt6w;
    //   287: astore #7
    //   289: aload #5
    //   291: ifnull -> 984
    //   294: aload_0
    //   295: aload_2
    //   296: getfield array : [C
    //   299: iload #8
    //   301: iload #9
    //   303: iconst_1
    //   304: isub
    //   305: bipush #23
    //   307: invokevirtual Zb : ([CIII)V
    //   310: iload #9
    //   312: istore #8
    //   314: iload #11
    //   316: invokestatic ZC : (C)Z
    //   319: ifeq -> 332
    //   322: getstatic burp/Zt6w.SPACE : Lburp/Zt6w;
    //   325: goto -> 335
    //   328: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   331: athrow
    //   332: getstatic burp/Zt6w.HEADER_VALUE : Lburp/Zt6w;
    //   335: astore #6
    //   337: getstatic burp/Zt6w.HEADER_VALUE : Lburp/Zt6w;
    //   340: astore #7
    //   342: aload #5
    //   344: ifnull -> 984
    //   347: iload #11
    //   349: invokestatic ZC : (C)Z
    //   352: ifne -> 984
    //   355: goto -> 362
    //   358: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   361: athrow
    //   362: aload_0
    //   363: aload_2
    //   364: getfield array : [C
    //   367: iload #8
    //   369: iload #9
    //   371: iconst_1
    //   372: isub
    //   373: bipush #22
    //   375: invokevirtual Zb : ([CIII)V
    //   378: iload #9
    //   380: istore #8
    //   382: aload #7
    //   384: astore #6
    //   386: aload #5
    //   388: ifnull -> 984
    //   391: iload #10
    //   393: ifeq -> 520
    //   396: goto -> 403
    //   399: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   402: athrow
    //   403: iload #11
    //   405: bipush #61
    //   407: if_icmpne -> 520
    //   410: goto -> 417
    //   413: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   416: athrow
    //   417: aload_0
    //   418: aload_2
    //   419: getfield array : [C
    //   422: iload #8
    //   424: iload #9
    //   426: invokevirtual Ze : ([CII)Ljava/lang/String;
    //   429: astore #12
    //   431: aload #12
    //   433: sipush #-2835
    //   436: sipush #19835
    //   439: invokestatic a : (II)Ljava/lang/String;
    //   442: invokevirtual equals : (Ljava/lang/Object;)Z
    //   445: ifeq -> 473
    //   448: aload_0
    //   449: aload_2
    //   450: getfield array : [C
    //   453: iload #8
    //   455: iload #9
    //   457: iconst_1
    //   458: isub
    //   459: bipush #42
    //   461: invokevirtual Zb : ([CIII)V
    //   464: iload #9
    //   466: istore #8
    //   468: getstatic burp/Zt6w.PARAM_NAME_EQUALS : Lburp/Zt6w;
    //   471: astore #6
    //   473: aload #12
    //   475: sipush #-2834
    //   478: sipush #5898
    //   481: invokestatic a : (II)Ljava/lang/String;
    //   484: invokevirtual equals : (Ljava/lang/Object;)Z
    //   487: ifeq -> 515
    //   490: aload_0
    //   491: aload_2
    //   492: getfield array : [C
    //   495: iload #8
    //   497: iload #9
    //   499: iconst_1
    //   500: isub
    //   501: bipush #42
    //   503: invokevirtual Zb : ([CIII)V
    //   506: iload #9
    //   508: istore #8
    //   510: getstatic burp/Zt6w.PARAM_NAME_EQUALS : Lburp/Zt6w;
    //   513: astore #6
    //   515: aload #5
    //   517: ifnull -> 984
    //   520: iload #11
    //   522: bipush #59
    //   524: if_icmpeq -> 549
    //   527: goto -> 534
    //   530: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   533: athrow
    //   534: iload #11
    //   536: invokestatic ZC : (C)Z
    //   539: ifeq -> 984
    //   542: goto -> 549
    //   545: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   548: athrow
    //   549: aload_0
    //   550: aload_2
    //   551: getfield array : [C
    //   554: iload #8
    //   556: iload #9
    //   558: iconst_1
    //   559: isub
    //   560: bipush #42
    //   562: invokevirtual Zb : ([CIII)V
    //   565: iload #9
    //   567: istore #8
    //   569: iload #11
    //   571: bipush #59
    //   573: if_icmpne -> 586
    //   576: getstatic burp/Zt6w.HEADER_SEPARATOR : Lburp/Zt6w;
    //   579: goto -> 589
    //   582: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   585: athrow
    //   586: getstatic burp/Zt6w.SPACE : Lburp/Zt6w;
    //   589: astore #6
    //   591: getstatic burp/Zt6w.HEADER_VALUE : Lburp/Zt6w;
    //   594: astore #7
    //   596: aload #5
    //   598: ifnull -> 984
    //   601: aload_0
    //   602: aload_2
    //   603: getfield array : [C
    //   606: iload #8
    //   608: iload #9
    //   610: iconst_1
    //   611: isub
    //   612: bipush #24
    //   614: invokevirtual Zb : ([CIII)V
    //   617: iload #9
    //   619: istore #8
    //   621: iload #11
    //   623: bipush #34
    //   625: if_icmpne -> 638
    //   628: getstatic burp/Zt6w.PARAM_NAME_QUOTE : Lburp/Zt6w;
    //   631: goto -> 659
    //   634: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   637: athrow
    //   638: iload #11
    //   640: invokestatic ZC : (C)Z
    //   643: ifeq -> 656
    //   646: getstatic burp/Zt6w.SPACE : Lburp/Zt6w;
    //   649: goto -> 659
    //   652: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   655: athrow
    //   656: getstatic burp/Zt6w.HEADER_VALUE : Lburp/Zt6w;
    //   659: astore #6
    //   661: getstatic burp/Zt6w.HEADER_VALUE : Lburp/Zt6w;
    //   664: astore #7
    //   666: aload #5
    //   668: ifnull -> 984
    //   671: aload_0
    //   672: aload_2
    //   673: getfield array : [C
    //   676: iload #8
    //   678: iload #9
    //   680: iconst_1
    //   681: isub
    //   682: bipush #42
    //   684: invokevirtual Zb : ([CIII)V
    //   687: iload #9
    //   689: istore #8
    //   691: getstatic burp/Zt6w.PARAM_NAME : Lburp/Zt6w;
    //   694: astore #6
    //   696: aload #5
    //   698: ifnull -> 984
    //   701: iload #11
    //   703: bipush #34
    //   705: if_icmpeq -> 730
    //   708: goto -> 715
    //   711: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   714: athrow
    //   715: iload #11
    //   717: invokestatic ZC : (C)Z
    //   720: ifeq -> 984
    //   723: goto -> 730
    //   726: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   729: athrow
    //   730: aload_0
    //   731: aload_2
    //   732: getfield array : [C
    //   735: iload #8
    //   737: iload #9
    //   739: iconst_1
    //   740: isub
    //   741: bipush #43
    //   743: invokevirtual Zb : ([CIII)V
    //   746: iload #9
    //   748: istore #8
    //   750: iload #11
    //   752: bipush #34
    //   754: if_icmpne -> 767
    //   757: getstatic burp/Zt6w.PARAM_NAME_ENDQUOTE : Lburp/Zt6w;
    //   760: goto -> 770
    //   763: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   766: athrow
    //   767: getstatic burp/Zt6w.SPACE : Lburp/Zt6w;
    //   770: astore #6
    //   772: getstatic burp/Zt6w.PARAM_NAME : Lburp/Zt6w;
    //   775: astore #7
    //   777: aload #5
    //   779: ifnull -> 984
    //   782: aload_0
    //   783: aload_2
    //   784: getfield array : [C
    //   787: iload #8
    //   789: iload #9
    //   791: iconst_1
    //   792: isub
    //   793: bipush #42
    //   795: invokevirtual Zb : ([CIII)V
    //   798: iload #9
    //   800: istore #8
    //   802: iload #11
    //   804: bipush #59
    //   806: if_icmpne -> 819
    //   809: getstatic burp/Zt6w.HEADER_SEPARATOR : Lburp/Zt6w;
    //   812: goto -> 840
    //   815: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   818: athrow
    //   819: iload #11
    //   821: invokestatic ZC : (C)Z
    //   824: ifeq -> 837
    //   827: getstatic burp/Zt6w.SPACE : Lburp/Zt6w;
    //   830: goto -> 840
    //   833: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   836: athrow
    //   837: getstatic burp/Zt6w.HEADER_VALUE : Lburp/Zt6w;
    //   840: astore #6
    //   842: getstatic burp/Zt6w.HEADER_VALUE : Lburp/Zt6w;
    //   845: astore #7
    //   847: aload #5
    //   849: ifnull -> 984
    //   852: iload #11
    //   854: invokestatic ZC : (C)Z
    //   857: ifeq -> 984
    //   860: goto -> 867
    //   863: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   866: athrow
    //   867: aload_0
    //   868: aload_2
    //   869: getfield array : [C
    //   872: iload #8
    //   874: iload #9
    //   876: iconst_1
    //   877: isub
    //   878: bipush #44
    //   880: invokevirtual Zb : ([CIII)V
    //   883: iload #9
    //   885: istore #8
    //   887: getstatic burp/Zt6w.SPACE : Lburp/Zt6w;
    //   890: astore #6
    //   892: getstatic burp/Zt6w.PARAM_VALUE : Lburp/Zt6w;
    //   895: astore #7
    //   897: aload #5
    //   899: ifnull -> 984
    //   902: iload #11
    //   904: invokestatic ZC : (C)Z
    //   907: ifeq -> 984
    //   910: goto -> 917
    //   913: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   916: athrow
    //   917: aload_0
    //   918: aload_2
    //   919: getfield array : [C
    //   922: iload #8
    //   924: iload #9
    //   926: iconst_1
    //   927: isub
    //   928: bipush #21
    //   930: invokevirtual Zb : ([CIII)V
    //   933: iload #9
    //   935: istore #8
    //   937: getstatic burp/Zt6w.SPACE : Lburp/Zt6w;
    //   940: astore #6
    //   942: getstatic burp/Zt6w.END : Lburp/Zt6w;
    //   945: astore #7
    //   947: aload #5
    //   949: ifnull -> 984
    //   952: new java/lang/IllegalStateException
    //   955: dup
    //   956: aload #6
    //   958: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   961: sipush #-2838
    //   964: sipush #16082
    //   967: invokestatic a : (II)Ljava/lang/String;
    //   970: swap
    //   971: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   976: invokespecial <init> : (Ljava/lang/String;)V
    //   979: athrow
    //   980: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   983: athrow
    //   984: iinc #9, 1
    //   987: aload #5
    //   989: ifnull -> 51
    //   992: iload #9
    //   994: iload #8
    //   996: if_icmple -> 1092
    //   999: aload #6
    //   1001: getstatic burp/Zt6w.PARAM_VALUE : Lburp/Zt6w;
    //   1004: if_acmpne -> 1073
    //   1007: goto -> 1014
    //   1010: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   1013: athrow
    //   1014: aload_0
    //   1015: aload_2
    //   1016: getfield array : [C
    //   1019: iload #8
    //   1021: iload #9
    //   1023: invokevirtual ZQ : ([CII)Z
    //   1026: ifeq -> 1046
    //   1029: goto -> 1036
    //   1032: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   1035: athrow
    //   1036: getstatic burp/Zt6w.BOUNDARY : Lburp/Zt6w;
    //   1039: astore #6
    //   1041: aload #5
    //   1043: ifnull -> 1073
    //   1046: aload_0
    //   1047: aload_2
    //   1048: getfield array : [C
    //   1051: iload #8
    //   1053: iload #9
    //   1055: invokevirtual Zn : ([CII)Z
    //   1058: ifeq -> 1073
    //   1061: goto -> 1068
    //   1064: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   1067: athrow
    //   1068: getstatic burp/Zt6w.END : Lburp/Zt6w;
    //   1071: astore #6
    //   1073: aload_0
    //   1074: aload_2
    //   1075: getfield array : [C
    //   1078: iload #8
    //   1080: iload #9
    //   1082: iconst_1
    //   1083: isub
    //   1084: aload #6
    //   1086: getfield Zs : I
    //   1089: invokevirtual Zb : ([CIII)V
    //   1092: aload_0
    //   1093: aload_2
    //   1094: getfield array : [C
    //   1097: iload #8
    //   1099: iload #9
    //   1101: aload #6
    //   1103: aload #7
    //   1105: invokevirtual ZJ : ([CIILburp/Zt6w;Lburp/Zt6w;)V
    //   1108: aload_0
    //   1109: getfield Zz : Lburp/Ze7g;
    //   1112: invokestatic Zwu : ()[Lburp/Zbqc;
    //   1115: ifnonnull -> 1130
    //   1118: ldc 'beyQ2'
    //   1120: invokestatic Zv : (Ljava/lang/String;)V
    //   1123: goto -> 1130
    //   1126: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   1129: athrow
    //   1130: areturn
    // Exception table:
    //   from	to	target	type
    //   74	144	147	java/lang/IllegalStateException
    //   181	193	196	java/lang/IllegalStateException
    //   239	252	255	java/lang/IllegalStateException
    //   314	328	328	java/lang/IllegalStateException
    //   342	355	358	java/lang/IllegalStateException
    //   386	396	399	java/lang/IllegalStateException
    //   391	410	413	java/lang/IllegalStateException
    //   515	527	530	java/lang/IllegalStateException
    //   520	542	545	java/lang/IllegalStateException
    //   569	582	582	java/lang/IllegalStateException
    //   621	634	634	java/lang/IllegalStateException
    //   638	652	652	java/lang/IllegalStateException
    //   696	708	711	java/lang/IllegalStateException
    //   701	723	726	java/lang/IllegalStateException
    //   750	763	763	java/lang/IllegalStateException
    //   802	815	815	java/lang/IllegalStateException
    //   819	833	833	java/lang/IllegalStateException
    //   847	860	863	java/lang/IllegalStateException
    //   897	910	913	java/lang/IllegalStateException
    //   947	980	980	java/lang/IllegalStateException
    //   992	1007	1010	java/lang/IllegalStateException
    //   999	1029	1032	java/lang/IllegalStateException
    //   1041	1061	1064	java/lang/IllegalStateException
    //   1092	1123	1126	java/lang/IllegalStateException
  }
  
  private Zt6w Zg(Segment paramSegment, int paramInt) {
    try {
      if (paramInt == -1)
        try {
          if (paramSegment.count == 0)
            return Zt6w.PARAM_VALUE; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      switch (paramInt) {
        default:
          return Zt6w.BOUNDARY;
        case -1:
          return Zt6w.HEADER_NAME;
        case -2:
          break;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Zt6w.PARAM_VALUE;
  }
  
  private boolean ZN(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    return Ze(paramArrayOfchar, paramInt1, paramInt2).equalsIgnoreCase(a(-2833, 31441));
  }
  
  private boolean ZQ(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    return Ze(paramArrayOfchar, paramInt1, paramInt2).equals(this.Zp);
  }
  
  private boolean Zn(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    return Ze(paramArrayOfchar, paramInt1, paramInt2).equals(this.ZS);
  }
  
  private void ZJ(char[] paramArrayOfchar, int paramInt1, int paramInt2, Zt6w paramZt6w1, Zt6w paramZt6w2) {
    // Byte code:
    //   0: invokestatic Zj : ()Ljava/lang/String;
    //   3: astore #6
    //   5: aload #4
    //   7: getfield Zy : I
    //   10: istore #7
    //   12: aload #4
    //   14: getstatic burp/Zt6w.BOUNDARY : Lburp/Zt6w;
    //   17: if_acmpne -> 45
    //   20: aload_0
    //   21: aload_1
    //   22: iload_2
    //   23: iload_3
    //   24: invokevirtual ZQ : ([CII)Z
    //   27: ifne -> 107
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   36: athrow
    //   37: iconst_0
    //   38: istore #7
    //   40: aload #6
    //   42: ifnull -> 107
    //   45: aload #4
    //   47: getstatic burp/Zt6w.PARAM_VALUE : Lburp/Zt6w;
    //   50: if_acmpne -> 85
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   59: athrow
    //   60: aload_0
    //   61: aload_1
    //   62: iload_2
    //   63: iload_3
    //   64: invokevirtual ZQ : ([CII)Z
    //   67: ifeq -> 107
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   76: athrow
    //   77: iconst_0
    //   78: istore #7
    //   80: aload #6
    //   82: ifnull -> 107
    //   85: aload #4
    //   87: getstatic burp/Zt6w.SPACE : Lburp/Zt6w;
    //   90: if_acmpne -> 107
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   99: athrow
    //   100: aload #5
    //   102: getfield Zy : I
    //   105: istore #7
    //   107: aload_0
    //   108: aload_1
    //   109: iconst_0
    //   110: iconst_0
    //   111: iload #7
    //   113: invokevirtual Zb : ([CIII)V
    //   116: return
    // Exception table:
    //   from	to	target	type
    //   12	30	33	java/lang/IllegalStateException
    //   40	53	56	java/lang/IllegalStateException
    //   45	70	73	java/lang/IllegalStateException
    //   80	93	96	java/lang/IllegalStateException
  }
  
  private String Ze(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    return new String(paramArrayOfchar, paramInt1, paramInt2 - paramInt1);
  }
  
  private void Zb(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) {
    Zq(paramArrayOfchar, paramInt1, paramInt2, paramInt3, paramInt1 + this.ZJ);
  }
  
  public Zm_0 ZC() {
    return new Zm_0();
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'eï}Ñ\\tìXÙã^®^%mÛ÷âµ£*/'ª°z$Þt\\bôG½J;Þ M;ù\\r¢pÝD``â¦µ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #10
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc '=áJ»â÷µÖò7¢ÙzPN\\t*ï1ûW]'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #18
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #38
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
    //   128: putstatic burp/Zey4.a : [Ljava/lang/String;
    //   131: bipush #9
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zey4.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #18
    //   214: goto -> 244
    //   217: bipush #97
    //   219: goto -> 244
    //   222: bipush #22
    //   224: goto -> 244
    //   227: bipush #99
    //   229: goto -> 244
    //   232: bipush #83
    //   234: goto -> 244
    //   237: bipush #55
    //   239: goto -> 244
    //   242: bipush #99
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF4ED) & 0xFFFF;
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
      byte b1 = 117;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zey4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */