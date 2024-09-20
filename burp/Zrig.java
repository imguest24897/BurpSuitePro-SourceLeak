package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Zrig {
  static final List<Zko6> ZB;
  
  private static Zbqc[] Zi;
  
  private static List<String> Zv(int paramInt1, int paramInt2, Zlk4 paramZlk4) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<Zko6> iterator = ZB.iterator();
    Zbqc[] arrayOfZbqc = ZC();
    while (iterator.hasNext()) {
      Zko6 zko6 = iterator.next();
      if (zko6.ZG(paramInt1, paramInt2, paramZlk4))
        arrayList.add(zko6.Zg()); 
      if (arrayOfZbqc != null)
        break; 
    } 
    return arrayList;
  }
  
  static List<String> ZW(String paramString, byte paramByte, Zlk4 paramZlk4) {
    ArrayList<String> arrayList = new ArrayList<>(Zv(paramByte, 0, paramZlk4));
    List<String> list1 = Zv(paramByte, 1, paramZlk4);
    Iterator<String> iterator = list1.iterator();
    Zbqc[] arrayOfZbqc = ZC();
    while (iterator.hasNext()) {
      String str = iterator.next();
      arrayList.add(paramString + paramString);
      if (arrayOfZbqc != null)
        break; 
    } 
    List<String> list2 = Zv(paramByte, 2, paramZlk4);
    for (String str : list2) {
      arrayList.add(str + "\000" + str);
      if (arrayOfZbqc != null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zb(new Zbqc[2]); 
    return arrayList;
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: aconst_null
    //   10: ldc 'dN Zdb|<RZdbNRZb|NR(db|N Z|<R(dN Zdb|<RZdb.QI!<$W<\\t?db|N Zdb|<RZNR(db|N Zdb|<RZNR(db|N #PZ=(=WP|\\t,WR7ZS[e[J1O\\f9MI6Fd}NSZd|ORZd}NRZe|NR[d|NSZe|OR[d}NSZd|ORZd}\\beN_!ko\\f[wRQ]`YF/1ENo\\f[wUQx[`YA)\\f7ENo]wRQx[gYF/\\f7EIo\\f[wRQ]`YF/1ENo\\f[wU#PZ=Q]I;R$Wfo\\f[wRQxX`YF/\\f4ENo\\f[wRQx[`YF,\\f7ENo\\fXwRQx[`YF/\\f7ENo\\f[wRQxX`YF/\\f4ENo\\f[wR>]`\\f9MI6=d|NSZd|ORZe}NR[d|NSZd|ORZe}NR[d|NS#PP&O$W<\\t?db|N Zdb|<RZNR(db|N Zdb|<RZNR(db|N #PZ=(=WP|\\tKdNSZdb|ORZdb}NRZ|NR(d|N Ze|<R[dNSZdb|ORZdb}.QI!O$W<\\t)b%\\t%IMdWP;=d|NSZd|ORZe}NR[d|NSZd|ORZe}NR[d|NS#PP&O$W<\\t:d|NSZd|ORZe}NR[d|NSZd|ORZe}NR[d|NS>]"=ZLþü à´äþü¼ÚþÎ Ò´äþ¢Î¼Ú¢þü Ò´ÖþÎ¼èþü à´äþü¼ÚþÎ.QI! à#P;=db|N Zdb|<RZNR(db|N Zdb|<RZNR(db|N #PP&<$W<\\tKd}N Zd|<RZdNRZeb|NR[db|NSZ|OR(d}N Zd|<RZd.QI!O$W<\\t?d|NSZd|ORZe}NR[d|NSZd|ORZe}NR[d|NS#PZ=[=WP|\\te[J1O\\f9MI6,WR7ZS[e]}.QI!O$W<\\t)b%\\t%IMdWP;:d|NSZd|ORZe}NR[d|NSZd|ORZe}NR[d|NS>]"=ZGþü Ó´äþÏ¼Úþý Ò´äþÎ¼Úþü Ò´åþÎ¼Ûþü Ó´äþÏ¼Úþý\\bN3.=db|N Zdb|<RZNR(db|N Zdb|<RZNR(db|N #PP&<$W<\\t'
    //   12: dup
    //   13: astore_3
    //   14: invokevirtual length : ()I
    //   17: istore #5
    //   19: invokestatic Zb : ([Lburp/Zbqc;)V
    //   22: bipush #75
    //   24: istore_2
    //   25: iconst_m1
    //   26: istore_1
    //   27: bipush #19
    //   29: iinc #1, 1
    //   32: aload_3
    //   33: iload_1
    //   34: dup
    //   35: iload_2
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 134
    //   44: aload_0
    //   45: swap
    //   46: iload #4
    //   48: iinc #4, 1
    //   51: swap
    //   52: aastore
    //   53: iload_1
    //   54: iload_2
    //   55: iadd
    //   56: dup
    //   57: istore_1
    //   58: iload #5
    //   60: if_icmpge -> 72
    //   63: aload_3
    //   64: iload_1
    //   65: invokevirtual charAt : (I)C
    //   68: istore_2
    //   69: goto -> 27
    //   72: ldc 'Q{CTD~%|IZc?#WV;\\t#VW;\\b"WW:\\t#WV;\\t#VW;\\b"WW:\\t#WV;\\tDdzPHz;NUZ'
    //   74: dup
    //   75: astore_3
    //   76: invokevirtual length : ()I
    //   79: istore #5
    //   81: bipush #16
    //   83: istore_2
    //   84: iconst_m1
    //   85: istore_1
    //   86: bipush #84
    //   88: iinc #1, 1
    //   91: aload_3
    //   92: iload_1
    //   93: dup
    //   94: iload_2
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 134
    //   103: aload_0
    //   104: swap
    //   105: iload #4
    //   107: iinc #4, 1
    //   110: swap
    //   111: aastore
    //   112: iload_1
    //   113: iload_2
    //   114: iadd
    //   115: dup
    //   116: istore_1
    //   117: iload #5
    //   119: if_icmpge -> 131
    //   122: aload_3
    //   123: iload_1
    //   124: invokevirtual charAt : (I)C
    //   127: istore_2
    //   128: goto -> 86
    //   131: goto -> 292
    //   134: dup_x2
    //   135: pop
    //   136: invokevirtual toCharArray : ()[C
    //   139: dup_x1
    //   140: arraylength
    //   141: dup_x2
    //   142: pop
    //   143: iconst_0
    //   144: istore #6
    //   146: dup2_x1
    //   147: pop2
    //   148: dup_x2
    //   149: iconst_1
    //   150: if_icmpgt -> 252
    //   153: dup2
    //   154: swap
    //   155: iload #6
    //   157: dup2_x1
    //   158: caload
    //   159: swap
    //   160: iload #6
    //   162: bipush #7
    //   164: irem
    //   165: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #89
    //   206: goto -> 236
    //   209: bipush #45
    //   211: goto -> 236
    //   214: bipush #45
    //   216: goto -> 236
    //   219: bipush #65
    //   221: goto -> 236
    //   224: bipush #115
    //   226: goto -> 236
    //   229: bipush #111
    //   231: goto -> 236
    //   234: bipush #103
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 157
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 153
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 44, 0 -> 103
    //   292: new java/util/ArrayList
    //   295: dup
    //   296: invokespecial <init> : ()V
    //   299: putstatic burp/Zrig.ZB : Ljava/util/List;
    //   302: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   305: new burp/Zko6
    //   308: dup
    //   309: iconst_0
    //   310: iconst_0
    //   311: getstatic burp/Zlk4.FAST : Lburp/Zlk4;
    //   314: aload_0
    //   315: bipush #7
    //   317: aaload
    //   318: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   321: invokeinterface add : (Ljava/lang/Object;)Z
    //   326: pop
    //   327: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   330: new burp/Zko6
    //   333: dup
    //   334: iconst_0
    //   335: iconst_0
    //   336: getstatic burp/Zlk4.NORMAL : Lburp/Zlk4;
    //   339: aload_0
    //   340: bipush #9
    //   342: aaload
    //   343: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   346: invokeinterface add : (Ljava/lang/Object;)Z
    //   351: pop
    //   352: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   355: new burp/Zko6
    //   358: dup
    //   359: iconst_0
    //   360: iconst_0
    //   361: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   364: aload_0
    //   365: bipush #15
    //   367: aaload
    //   368: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   371: invokeinterface add : (Ljava/lang/Object;)Z
    //   376: pop
    //   377: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   380: new burp/Zko6
    //   383: dup
    //   384: iconst_0
    //   385: iconst_0
    //   386: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   389: aload_0
    //   390: bipush #21
    //   392: aaload
    //   393: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   396: invokeinterface add : (Ljava/lang/Object;)Z
    //   401: pop
    //   402: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   405: new burp/Zko6
    //   408: dup
    //   409: iconst_0
    //   410: iconst_0
    //   411: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   414: aload_0
    //   415: bipush #6
    //   417: aaload
    //   418: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   421: invokeinterface add : (Ljava/lang/Object;)Z
    //   426: pop
    //   427: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   430: new burp/Zko6
    //   433: dup
    //   434: iconst_0
    //   435: iconst_0
    //   436: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   439: aload_0
    //   440: bipush #22
    //   442: aaload
    //   443: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   446: invokeinterface add : (Ljava/lang/Object;)Z
    //   451: pop
    //   452: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   455: new burp/Zko6
    //   458: dup
    //   459: iconst_0
    //   460: iconst_0
    //   461: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   464: aload_0
    //   465: bipush #17
    //   467: aaload
    //   468: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   471: invokeinterface add : (Ljava/lang/Object;)Z
    //   476: pop
    //   477: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   480: new burp/Zko6
    //   483: dup
    //   484: iconst_0
    //   485: iconst_0
    //   486: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   489: aload_0
    //   490: iconst_0
    //   491: aaload
    //   492: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   495: invokeinterface add : (Ljava/lang/Object;)Z
    //   500: pop
    //   501: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   504: new burp/Zko6
    //   507: dup
    //   508: iconst_0
    //   509: iconst_0
    //   510: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   513: aload_0
    //   514: bipush #14
    //   516: aaload
    //   517: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   520: invokeinterface add : (Ljava/lang/Object;)Z
    //   525: pop
    //   526: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   529: new burp/Zko6
    //   532: dup
    //   533: iconst_0
    //   534: iconst_0
    //   535: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   538: aload_0
    //   539: bipush #8
    //   541: aaload
    //   542: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   545: invokeinterface add : (Ljava/lang/Object;)Z
    //   550: pop
    //   551: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   554: new burp/Zko6
    //   557: dup
    //   558: iconst_0
    //   559: iconst_0
    //   560: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   563: aload_0
    //   564: bipush #12
    //   566: aaload
    //   567: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   570: invokeinterface add : (Ljava/lang/Object;)Z
    //   575: pop
    //   576: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   579: new burp/Zko6
    //   582: dup
    //   583: iconst_0
    //   584: iconst_0
    //   585: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   588: aload_0
    //   589: iconst_4
    //   590: aaload
    //   591: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   594: invokeinterface add : (Ljava/lang/Object;)Z
    //   599: pop
    //   600: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   603: new burp/Zko6
    //   606: dup
    //   607: iconst_0
    //   608: iconst_1
    //   609: getstatic burp/Zlk4.FAST : Lburp/Zlk4;
    //   612: aload_0
    //   613: iconst_1
    //   614: aaload
    //   615: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   618: invokeinterface add : (Ljava/lang/Object;)Z
    //   623: pop
    //   624: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   627: new burp/Zko6
    //   630: dup
    //   631: iconst_0
    //   632: iconst_1
    //   633: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   636: aload_0
    //   637: bipush #23
    //   639: aaload
    //   640: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   643: invokeinterface add : (Ljava/lang/Object;)Z
    //   648: pop
    //   649: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   652: new burp/Zko6
    //   655: dup
    //   656: iconst_0
    //   657: iconst_1
    //   658: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   661: aload_0
    //   662: bipush #13
    //   664: aaload
    //   665: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   668: invokeinterface add : (Ljava/lang/Object;)Z
    //   673: pop
    //   674: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   677: new burp/Zko6
    //   680: dup
    //   681: iconst_0
    //   682: iconst_1
    //   683: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   686: aload_0
    //   687: bipush #10
    //   689: aaload
    //   690: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   693: invokeinterface add : (Ljava/lang/Object;)Z
    //   698: pop
    //   699: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   702: new burp/Zko6
    //   705: dup
    //   706: iconst_0
    //   707: iconst_2
    //   708: getstatic burp/Zlk4.NORMAL : Lburp/Zlk4;
    //   711: aload_0
    //   712: iconst_1
    //   713: aaload
    //   714: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   717: invokeinterface add : (Ljava/lang/Object;)Z
    //   722: pop
    //   723: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   726: new burp/Zko6
    //   729: dup
    //   730: iconst_0
    //   731: iconst_2
    //   732: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   735: aload_0
    //   736: bipush #18
    //   738: aaload
    //   739: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   742: invokeinterface add : (Ljava/lang/Object;)Z
    //   747: pop
    //   748: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   751: new burp/Zko6
    //   754: dup
    //   755: iconst_0
    //   756: iconst_2
    //   757: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   760: aload_0
    //   761: bipush #13
    //   763: aaload
    //   764: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   767: invokeinterface add : (Ljava/lang/Object;)Z
    //   772: pop
    //   773: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   776: new burp/Zko6
    //   779: dup
    //   780: iconst_1
    //   781: iconst_0
    //   782: getstatic burp/Zlk4.FAST : Lburp/Zlk4;
    //   785: aload_0
    //   786: bipush #11
    //   788: aaload
    //   789: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   792: invokeinterface add : (Ljava/lang/Object;)Z
    //   797: pop
    //   798: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   801: new burp/Zko6
    //   804: dup
    //   805: iconst_1
    //   806: iconst_0
    //   807: getstatic burp/Zlk4.NORMAL : Lburp/Zlk4;
    //   810: aload_0
    //   811: bipush #16
    //   813: aaload
    //   814: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   817: invokeinterface add : (Ljava/lang/Object;)Z
    //   822: pop
    //   823: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   826: new burp/Zko6
    //   829: dup
    //   830: iconst_1
    //   831: iconst_0
    //   832: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   835: aload_0
    //   836: iconst_2
    //   837: aaload
    //   838: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   841: invokeinterface add : (Ljava/lang/Object;)Z
    //   846: pop
    //   847: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   850: new burp/Zko6
    //   853: dup
    //   854: iconst_1
    //   855: iconst_0
    //   856: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   859: aload_0
    //   860: iconst_3
    //   861: aaload
    //   862: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   865: invokeinterface add : (Ljava/lang/Object;)Z
    //   870: pop
    //   871: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   874: new burp/Zko6
    //   877: dup
    //   878: iconst_1
    //   879: iconst_0
    //   880: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   883: aload_0
    //   884: bipush #20
    //   886: aaload
    //   887: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   890: invokeinterface add : (Ljava/lang/Object;)Z
    //   895: pop
    //   896: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   899: new burp/Zko6
    //   902: dup
    //   903: iconst_1
    //   904: iconst_0
    //   905: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   908: aload_0
    //   909: iconst_5
    //   910: aaload
    //   911: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   914: invokeinterface add : (Ljava/lang/Object;)Z
    //   919: pop
    //   920: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   923: new burp/Zko6
    //   926: dup
    //   927: iconst_1
    //   928: iconst_1
    //   929: getstatic burp/Zlk4.FAST : Lburp/Zlk4;
    //   932: aload_0
    //   933: bipush #19
    //   935: aaload
    //   936: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   939: invokeinterface add : (Ljava/lang/Object;)Z
    //   944: pop
    //   945: getstatic burp/Zrig.ZB : Ljava/util/List;
    //   948: new burp/Zko6
    //   951: dup
    //   952: iconst_1
    //   953: iconst_2
    //   954: getstatic burp/Zlk4.NORMAL : Lburp/Zlk4;
    //   957: aload_0
    //   958: bipush #19
    //   960: aaload
    //   961: invokespecial <init> : (IILburp/Zlk4;Ljava/lang/String;)V
    //   964: invokeinterface add : (Ljava/lang/Object;)Z
    //   969: pop
    //   970: return
  }
  
  public static void Zb(Zbqc[] paramArrayOfZbqc) {
    Zi = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZC() {
    return Zi;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */