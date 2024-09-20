package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmes extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmes() {
    super(EnumSet.of(Zzqz.VARIANT));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #12
    //   9: invokestatic ZG : ()[I
    //   12: aload #12
    //   14: sipush #14840
    //   17: sipush #-6962
    //   20: invokestatic a : (II)Ljava/lang/String;
    //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: pop
    //   27: astore #11
    //   29: aload_0
    //   30: iload_2
    //   31: invokevirtual Zm : (B)Z
    //   34: ifeq -> 61
    //   37: aload_0
    //   38: aload_1
    //   39: iload_2
    //   40: aload #5
    //   42: aload #6
    //   44: aload #12
    //   46: invokevirtual ZT : (Lburp/Zvs;BLburp/Ztub;Lburp/Zefg;Ljava/lang/StringBuilder;)V
    //   49: aload #11
    //   51: ifnull -> 73
    //   54: iconst_2
    //   55: anewarray burp/Zbqc
    //   58: invokestatic Zr : ([Lburp/Zbqc;)V
    //   61: aload_0
    //   62: aload_1
    //   63: iload_2
    //   64: aload #5
    //   66: aload #6
    //   68: aload #12
    //   70: invokevirtual ZM : (Lburp/Zvs;BLburp/Ztub;Lburp/Zefg;Ljava/lang/StringBuilder;)V
    //   73: aload #12
    //   75: sipush #14821
    //   78: sipush #-9752
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload #12
    //   90: sipush #14801
    //   93: sipush #15271
    //   96: invokestatic a : (II)Ljava/lang/String;
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: aload_0
    //   103: aload_1
    //   104: aload #5
    //   106: invokevirtual ZO : (Lburp/Zvs;Lburp/Ztub;)Ljava/lang/String;
    //   109: invokestatic Zv : (Ljava/lang/String;)Ljava/lang/String;
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: sipush #14843
    //   118: sipush #10922
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload_1
    //   129: getstatic burp/Zzu2.SUSPICIOUS_INPUT_TRANSFORMATION_REFLECTED : Lburp/Zzu2;
    //   132: if_acmpne -> 165
    //   135: aload #12
    //   137: sipush #14825
    //   140: sipush #-18595
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: aload #6
    //   151: iconst_1
    //   152: iconst_0
    //   153: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload #11
    //   162: ifnull -> 204
    //   165: aload_1
    //   166: getstatic burp/Zzu2.SUSPICIOUS_INPUT_TRANSFORMATION_STORED : Lburp/Zzu2;
    //   169: if_acmpne -> 197
    //   172: aload #5
    //   174: invokevirtual Zx : ()Lburp/Zrp9;
    //   177: aload #12
    //   179: aload #5
    //   181: <illegal opcode> accept : (Ljava/lang/StringBuilder;Lburp/Ztub;)Ljava/util/function/Consumer;
    //   186: invokeinterface Zd : (Ljava/util/function/Consumer;)Lburp/Zr1s;
    //   191: pop
    //   192: aload #11
    //   194: ifnull -> 204
    //   197: iconst_0
    //   198: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   201: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   204: aload #4
    //   206: getstatic burp/Ztz3.REFLECTION : Lburp/Ztz3;
    //   209: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   212: invokestatic Zv : (Ljava/lang/String;)Ljava/lang/String;
    //   215: astore #13
    //   217: iload_2
    //   218: tableswitch default -> 1158, 0 -> 272, 1 -> 357, 2 -> 442, 3 -> 539, 4 -> 818, 5 -> 903, 6 -> 624, 7 -> 721, 8 -> 988, 9 -> 1073
    //   272: aload #12
    //   274: sipush #14796
    //   277: sipush #8505
    //   280: invokestatic a : (II)Ljava/lang/String;
    //   283: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: sipush #14810
    //   289: sipush #22974
    //   292: invokestatic a : (II)Ljava/lang/String;
    //   295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: sipush #14844
    //   301: sipush #-26690
    //   304: invokestatic a : (II)Ljava/lang/String;
    //   307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: aload #13
    //   312: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: sipush #14816
    //   318: sipush #-17012
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: sipush #14847
    //   330: sipush #20555
    //   333: invokestatic a : (II)Ljava/lang/String;
    //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: sipush #14817
    //   342: sipush #-4751
    //   345: invokestatic a : (II)Ljava/lang/String;
    //   348: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   351: pop
    //   352: aload #11
    //   354: ifnull -> 1167
    //   357: aload #12
    //   359: sipush #14814
    //   362: sipush #14785
    //   365: invokestatic a : (II)Ljava/lang/String;
    //   368: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   371: sipush #14797
    //   374: sipush #-10943
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: sipush #14844
    //   386: sipush #-26690
    //   389: invokestatic a : (II)Ljava/lang/String;
    //   392: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   395: aload #13
    //   397: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   400: sipush #14816
    //   403: sipush #-17012
    //   406: invokestatic a : (II)Ljava/lang/String;
    //   409: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: sipush #14839
    //   415: sipush #-10149
    //   418: invokestatic a : (II)Ljava/lang/String;
    //   421: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   424: sipush #14800
    //   427: sipush #-7737
    //   430: invokestatic a : (II)Ljava/lang/String;
    //   433: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: pop
    //   437: aload #11
    //   439: ifnull -> 1167
    //   442: aload #12
    //   444: sipush #14842
    //   447: sipush #-21411
    //   450: invokestatic a : (II)Ljava/lang/String;
    //   453: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: sipush #14797
    //   459: sipush #-10943
    //   462: invokestatic a : (II)Ljava/lang/String;
    //   465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: sipush #14844
    //   471: sipush #-26690
    //   474: invokestatic a : (II)Ljava/lang/String;
    //   477: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   480: aload #13
    //   482: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   485: sipush #14816
    //   488: sipush #-17012
    //   491: invokestatic a : (II)Ljava/lang/String;
    //   494: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: sipush #14804
    //   500: sipush #-24490
    //   503: invokestatic a : (II)Ljava/lang/String;
    //   506: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: sipush #14803
    //   512: sipush #31443
    //   515: invokestatic a : (II)Ljava/lang/String;
    //   518: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   521: sipush #14838
    //   524: sipush #-21805
    //   527: invokestatic a : (II)Ljava/lang/String;
    //   530: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   533: pop
    //   534: aload #11
    //   536: ifnull -> 1167
    //   539: aload #12
    //   541: sipush #14809
    //   544: sipush #3184
    //   547: invokestatic a : (II)Ljava/lang/String;
    //   550: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   553: sipush #14797
    //   556: sipush #-10943
    //   559: invokestatic a : (II)Ljava/lang/String;
    //   562: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   565: sipush #14844
    //   568: sipush #-26690
    //   571: invokestatic a : (II)Ljava/lang/String;
    //   574: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   577: aload #13
    //   579: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   582: sipush #14816
    //   585: sipush #-17012
    //   588: invokestatic a : (II)Ljava/lang/String;
    //   591: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   594: sipush #14792
    //   597: sipush #15302
    //   600: invokestatic a : (II)Ljava/lang/String;
    //   603: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   606: sipush #14806
    //   609: sipush #23317
    //   612: invokestatic a : (II)Ljava/lang/String;
    //   615: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   618: pop
    //   619: aload #11
    //   621: ifnull -> 1167
    //   624: aload #12
    //   626: sipush #14808
    //   629: sipush #-26537
    //   632: invokestatic a : (II)Ljava/lang/String;
    //   635: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   638: sipush #14797
    //   641: sipush #-10943
    //   644: invokestatic a : (II)Ljava/lang/String;
    //   647: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   650: sipush #14844
    //   653: sipush #-26690
    //   656: invokestatic a : (II)Ljava/lang/String;
    //   659: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   662: aload #13
    //   664: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   667: sipush #14816
    //   670: sipush #-17012
    //   673: invokestatic a : (II)Ljava/lang/String;
    //   676: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   679: sipush #14790
    //   682: sipush #27948
    //   685: invokestatic a : (II)Ljava/lang/String;
    //   688: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   691: sipush #14813
    //   694: sipush #28812
    //   697: invokestatic a : (II)Ljava/lang/String;
    //   700: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   703: sipush #14805
    //   706: sipush #26215
    //   709: invokestatic a : (II)Ljava/lang/String;
    //   712: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   715: pop
    //   716: aload #11
    //   718: ifnull -> 1167
    //   721: aload #12
    //   723: sipush #14841
    //   726: sipush #20889
    //   729: invokestatic a : (II)Ljava/lang/String;
    //   732: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   735: sipush #14797
    //   738: sipush #-10943
    //   741: invokestatic a : (II)Ljava/lang/String;
    //   744: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   747: sipush #14844
    //   750: sipush #-26690
    //   753: invokestatic a : (II)Ljava/lang/String;
    //   756: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   759: aload #13
    //   761: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   764: sipush #14816
    //   767: sipush #-17012
    //   770: invokestatic a : (II)Ljava/lang/String;
    //   773: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   776: sipush #14792
    //   779: sipush #15302
    //   782: invokestatic a : (II)Ljava/lang/String;
    //   785: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   788: sipush #14837
    //   791: sipush #-9018
    //   794: invokestatic a : (II)Ljava/lang/String;
    //   797: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   800: sipush #14836
    //   803: sipush #22870
    //   806: invokestatic a : (II)Ljava/lang/String;
    //   809: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   812: pop
    //   813: aload #11
    //   815: ifnull -> 1167
    //   818: aload #12
    //   820: sipush #14822
    //   823: sipush #9509
    //   826: invokestatic a : (II)Ljava/lang/String;
    //   829: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   832: sipush #14797
    //   835: sipush #-10943
    //   838: invokestatic a : (II)Ljava/lang/String;
    //   841: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   844: sipush #14844
    //   847: sipush #-26690
    //   850: invokestatic a : (II)Ljava/lang/String;
    //   853: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   856: aload #13
    //   858: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   861: sipush #14816
    //   864: sipush #-17012
    //   867: invokestatic a : (II)Ljava/lang/String;
    //   870: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   873: sipush #14820
    //   876: sipush #17994
    //   879: invokestatic a : (II)Ljava/lang/String;
    //   882: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   885: sipush #14811
    //   888: sipush #-18154
    //   891: invokestatic a : (II)Ljava/lang/String;
    //   894: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   897: pop
    //   898: aload #11
    //   900: ifnull -> 1167
    //   903: aload #12
    //   905: sipush #14786
    //   908: sipush #-8661
    //   911: invokestatic a : (II)Ljava/lang/String;
    //   914: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   917: sipush #14797
    //   920: sipush #-10943
    //   923: invokestatic a : (II)Ljava/lang/String;
    //   926: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   929: sipush #14844
    //   932: sipush #-26690
    //   935: invokestatic a : (II)Ljava/lang/String;
    //   938: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   941: aload #13
    //   943: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   946: sipush #14816
    //   949: sipush #-17012
    //   952: invokestatic a : (II)Ljava/lang/String;
    //   955: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   958: sipush #14792
    //   961: sipush #15302
    //   964: invokestatic a : (II)Ljava/lang/String;
    //   967: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   970: sipush #14806
    //   973: sipush #23317
    //   976: invokestatic a : (II)Ljava/lang/String;
    //   979: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   982: pop
    //   983: aload #11
    //   985: ifnull -> 1167
    //   988: aload #12
    //   990: sipush #14784
    //   993: sipush #-13373
    //   996: invokestatic a : (II)Ljava/lang/String;
    //   999: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1002: sipush #14797
    //   1005: sipush #-10943
    //   1008: invokestatic a : (II)Ljava/lang/String;
    //   1011: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1014: sipush #14844
    //   1017: sipush #-26690
    //   1020: invokestatic a : (II)Ljava/lang/String;
    //   1023: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1026: aload #13
    //   1028: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1031: sipush #14816
    //   1034: sipush #-17012
    //   1037: invokestatic a : (II)Ljava/lang/String;
    //   1040: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1043: sipush #14835
    //   1046: sipush #-2617
    //   1049: invokestatic a : (II)Ljava/lang/String;
    //   1052: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1055: sipush #14818
    //   1058: sipush #31655
    //   1061: invokestatic a : (II)Ljava/lang/String;
    //   1064: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1067: pop
    //   1068: aload #11
    //   1070: ifnull -> 1167
    //   1073: aload #12
    //   1075: sipush #14845
    //   1078: sipush #-16354
    //   1081: invokestatic a : (II)Ljava/lang/String;
    //   1084: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1087: sipush #14797
    //   1090: sipush #-10943
    //   1093: invokestatic a : (II)Ljava/lang/String;
    //   1096: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1099: sipush #14844
    //   1102: sipush #-26690
    //   1105: invokestatic a : (II)Ljava/lang/String;
    //   1108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1111: aload #13
    //   1113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1116: sipush #14816
    //   1119: sipush #-17012
    //   1122: invokestatic a : (II)Ljava/lang/String;
    //   1125: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1128: sipush #14792
    //   1131: sipush #15302
    //   1134: invokestatic a : (II)Ljava/lang/String;
    //   1137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1140: sipush #14806
    //   1143: sipush #23317
    //   1146: invokestatic a : (II)Ljava/lang/String;
    //   1149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1152: pop
    //   1153: aload #11
    //   1155: ifnull -> 1167
    //   1158: iconst_0
    //   1159: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   1162: iload_2
    //   1163: i2l
    //   1164: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   1167: aload_1
    //   1168: getstatic burp/Zzu2.SUSPICIOUS_INPUT_TRANSFORMATION_STORED : Lburp/Zzu2;
    //   1171: if_acmpne -> 1213
    //   1174: aload #12
    //   1176: sipush #14789
    //   1179: sipush #-3828
    //   1182: invokestatic a : (II)Ljava/lang/String;
    //   1185: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1188: sipush #14827
    //   1191: sipush #-10421
    //   1194: invokestatic a : (II)Ljava/lang/String;
    //   1197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1200: sipush #14799
    //   1203: sipush #-30166
    //   1206: invokestatic a : (II)Ljava/lang/String;
    //   1209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1212: pop
    //   1213: aload #12
    //   1215: invokevirtual toString : ()Ljava/lang/String;
    //   1218: areturn
  }
  
  private String ZO(Zvs paramZvs, Ztub paramZtub) {
    if (paramZvs == Zzu2.SUSPICIOUS_INPUT_TRANSFORMATION_REFLECTED)
      return paramZtub.Zd().Zub().Zsf().Zis(); 
    if (paramZvs == Zzu2.SUSPICIOUS_INPUT_TRANSFORMATION_STORED)
      return paramZtub.Zx().Zub().Zsf().Zis(); 
    Zuh.Zb(false, Zqf.Zk);
    return "";
  }
  
  private void ZM(Zvs paramZvs, byte paramByte, Ztub paramZtub, Zefg<Zxtl> paramZefg, StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: invokestatic ZG : ()[I
    //   3: astore #6
    //   5: aload #5
    //   7: sipush #14823
    //   10: sipush #-11256
    //   13: invokestatic a : (II)Ljava/lang/String;
    //   16: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: pop
    //   20: iload_2
    //   21: tableswitch default -> 172, 0 -> 72, 1 -> 172, 2 -> 92, 3 -> 172, 4 -> 132, 5 -> 172, 6 -> 112, 7 -> 172, 8 -> 152
    //   72: aload #5
    //   74: sipush #14812
    //   77: sipush #20462
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload #6
    //   89: ifnull -> 181
    //   92: aload #5
    //   94: sipush #14832
    //   97: sipush #28363
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload #6
    //   109: ifnull -> 181
    //   112: aload #5
    //   114: sipush #14798
    //   117: sipush #-5837
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: aload #6
    //   129: ifnull -> 181
    //   132: aload #5
    //   134: sipush #14807
    //   137: sipush #5718
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: aload #6
    //   149: ifnull -> 181
    //   152: aload #5
    //   154: sipush #14802
    //   157: sipush #20248
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: pop
    //   167: aload #6
    //   169: ifnull -> 181
    //   172: iconst_0
    //   173: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   176: iload_2
    //   177: i2l
    //   178: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   181: aload #5
    //   183: ldc ' '
    //   185: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: pop
    //   189: aload #5
    //   191: aload #4
    //   193: iconst_1
    //   194: iconst_1
    //   195: invokestatic ZM : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: pop
    //   202: aload_1
    //   203: getstatic burp/Zzu2.SUSPICIOUS_INPUT_TRANSFORMATION_REFLECTED : Lburp/Zzu2;
    //   206: if_acmpne -> 229
    //   209: aload #5
    //   211: sipush #14787
    //   214: sipush #-23156
    //   217: invokestatic a : (II)Ljava/lang/String;
    //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: aload #6
    //   226: ifnull -> 265
    //   229: aload_1
    //   230: getstatic burp/Zzu2.SUSPICIOUS_INPUT_TRANSFORMATION_STORED : Lburp/Zzu2;
    //   233: if_acmpne -> 258
    //   236: aload_3
    //   237: invokevirtual Zx : ()Lburp/Zrp9;
    //   240: aload #5
    //   242: <illegal opcode> accept : (Ljava/lang/StringBuilder;)Ljava/util/function/Consumer;
    //   247: invokeinterface Zd : (Ljava/util/function/Consumer;)Lburp/Zr1s;
    //   252: pop
    //   253: aload #6
    //   255: ifnull -> 265
    //   258: iconst_0
    //   259: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   262: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   265: return
  }
  
  private void ZT(Zvs paramZvs, byte paramByte, Ztub paramZtub, Zefg<Zxtl> paramZefg, StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: aload #5
    //   2: sipush #14785
    //   5: sipush #-10673
    //   8: invokestatic a : (II)Ljava/lang/String;
    //   11: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: pop
    //   15: invokestatic ZG : ()[I
    //   18: aload #5
    //   20: aload #4
    //   22: iconst_1
    //   23: iconst_1
    //   24: invokestatic ZM : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: astore #6
    //   33: aload #5
    //   35: sipush #14834
    //   38: sipush #13982
    //   41: invokestatic a : (II)Ljava/lang/String;
    //   44: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: iload_2
    //   49: tableswitch default -> 200, 1 -> 100, 2 -> 200, 3 -> 120, 4 -> 200, 5 -> 160, 6 -> 200, 7 -> 140, 8 -> 200, 9 -> 180
    //   100: aload #5
    //   102: sipush #14794
    //   105: sipush #-7400
    //   108: invokestatic a : (II)Ljava/lang/String;
    //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: aload #6
    //   117: ifnull -> 209
    //   120: aload #5
    //   122: sipush #14788
    //   125: sipush #6967
    //   128: invokestatic a : (II)Ljava/lang/String;
    //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: aload #6
    //   137: ifnull -> 209
    //   140: aload #5
    //   142: sipush #14833
    //   145: sipush #14356
    //   148: invokestatic a : (II)Ljava/lang/String;
    //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload #6
    //   157: ifnull -> 209
    //   160: aload #5
    //   162: sipush #14826
    //   165: sipush #-21930
    //   168: invokestatic a : (II)Ljava/lang/String;
    //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload #6
    //   177: ifnull -> 209
    //   180: aload #5
    //   182: sipush #14791
    //   185: sipush #26691
    //   188: invokestatic a : (II)Ljava/lang/String;
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: aload #6
    //   197: ifnull -> 209
    //   200: iconst_0
    //   201: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   204: iload_2
    //   205: i2l
    //   206: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   209: aload_1
    //   210: getstatic burp/Zzu2.SUSPICIOUS_INPUT_TRANSFORMATION_REFLECTED : Lburp/Zzu2;
    //   213: if_acmpne -> 236
    //   216: aload #5
    //   218: sipush #14793
    //   221: sipush #-17634
    //   224: invokestatic a : (II)Ljava/lang/String;
    //   227: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: pop
    //   231: aload #6
    //   233: ifnull -> 272
    //   236: aload_1
    //   237: getstatic burp/Zzu2.SUSPICIOUS_INPUT_TRANSFORMATION_STORED : Lburp/Zzu2;
    //   240: if_acmpne -> 265
    //   243: aload_3
    //   244: invokevirtual Zx : ()Lburp/Zrp9;
    //   247: aload #5
    //   249: <illegal opcode> accept : (Ljava/lang/StringBuilder;)Ljava/util/function/Consumer;
    //   254: invokeinterface Zd : (Ljava/util/function/Consumer;)Lburp/Zr1s;
    //   259: pop
    //   260: aload #6
    //   262: ifnull -> 272
    //   265: iconst_0
    //   266: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   269: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   272: return
  }
  
  private boolean Zm(byte paramByte) {
    return (paramByte == 1 || paramByte == 3 || paramByte == 5 || paramByte == 7 || paramByte == 9);
  }
  
  private static String Zv(String paramString) {
    return Zrlp.ZY(Zmey.ZW(paramString));
  }
  
  static <T extends Zgkc> Zsqx<Zrdb> Zh(Zvs paramZvs, byte paramByte, Zlfv<T> paramZlfv, String paramString, Zku6 paramZku6, Zxs7 paramZxs7) {
    int[] arrayOfInt = Zedl.ZG();
    Zz_p zz_p = ((Zkv8)paramZku6.ZP((byte)2).get(0)).Zw();
    if (Zbqc.Zwu() == null)
      Zedl.ZI(new int[5]); 
    return new Zx_5(paramZvs, paramByte, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.REFLECTION, Zkb.ZG(zz_p.Ze)) }), (List)Collections.singletonList(paramZlfv), (byte)2, (byte)1, paramZku6.ZV().ZB(), Zkb.Zy(paramString), paramZxs7);
  }
  
  public static List<Zl1r> ZE(List<Zkv8> paramList) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Iterator<Zkv8> iterator = paramList.iterator();
    int[] arrayOfInt = Zedl.ZG();
    while (iterator.hasNext()) {
      Zkv8 zkv8 = iterator.next();
      arrayList.add(Zrlp.ZJ(zkv8));
      if (arrayOfInt != null)
        break; 
    } 
    return arrayList;
  }
  
  private static void lambda$buildUnexpectedTransformationDescription$2(StringBuilder paramStringBuilder, Zrp9 paramZrp9) {
    paramStringBuilder.append(a(14846, 1601));
  }
  
  private static void lambda$buildDecodingDescription$1(StringBuilder paramStringBuilder, Zrp9 paramZrp9) {
    paramStringBuilder.append(a(14815, -15021));
  }
  
  private static void lambda$buildIssueDetail$0(StringBuilder paramStringBuilder, Ztub paramZtub, Zrp9 paramZrp9) {
    paramStringBuilder.append(a(14795, 11709));
    Zrlp.Zn(paramStringBuilder, Zkb.ZG(paramZrp9.Zvs()));
    paramStringBuilder.append(a(14819, 16803));
    Zrlp.Zn(paramStringBuilder, Zkb.ZG(paramZtub.Zx().ZvM()));
  }
  
  static {
    // Byte code:
    //   0: bipush #59
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'òy_1Ê.¾¦@ôjHÀxÃ1}:Q]¥?730?sÖóí$EÇå'UUFËK­¨ÖÌ£½äA³ª¿á<0Ó,Îü½ëqV^úxÂ÷ÅK¥mÎùÊ¸[=ÿH1\\t$BæÓýÜ\\føS§w¿ÐâÄ9¶q\\bS?¶É6¤ý4B- :~@óá¿9&\\båj»,Ãéî÷rnOÓÈßW¥¶ñ`1nð@h!3!B2ýPsú3°/pq³f,4é1 #íÕQÛ©¯õC¡ÿÁLU(hãpþBêE x¼XöÝäòç+=ÇX@ï¤eä0ÆzJ^Yi­¶*ê©Ä\\rA¹#¤üæ6Û] À~Ý¤±J~íXºÀ õÈià(T,FßÞè=ãGì $É<ÜcßÍ9WDPéÃ`ýxy1CÜÂ]®hH¿l@é1QÚ8>t­ìFD6*û[*+rXåÎP.Tµ`à\ÏX ö;h\\t\\fI%¿øÚSbÉ7fÀZ|Ãz÷d¨Ä\Æ×´åÞÆVNªùk:I~S|þ K½¦Þí¨)¸MX¦d´ÛÃq÷î ÀíÁÐØÕfOÐß¦Yá&aà¯õ9*èÀB<ªü ^¦4l^SòöXZ+2uä('üoAUZ²@ÅÊ»^ìöhfiÈQu~4ME¯Þ¯"ð\\f7M¼¿nÂ]ßúM;ÄÆZ6(:ÝlrÐËn¿óÙ>}Â­åÍ¾ZV/óC\\tÁ[_aÃõ: <=òsiS¯<Ñ VöLPÕÔSÃoïÚ¶í¸¼3]} XÓáã¤2"5dÄZÞËÛp\\bÇøj»ò*écWÐwéÇv£ÎMª=Ñ6^Py8ð4à]Á:R£+wÂy¡úÇ¹³øhkºåöÍ¥c¦ÊÍTØ4?'öè¶_É`EN²ÿHªIbçG\\n{²c¾ÅÅÕ,?®Ä37Ud³êÁ|±äþ×K%í5Ù8ö}!mÝVN´©ÛøA=Ã*¦7Ìí\\t0(Çè¼JÔí[Qá7tFf«èØ9N}â³d½¬q`6XÉ¢Yi¯ü*ap!R\\tèàÖÉâÜþ:¡ÞÁÇDc½aê\\bÞøÚ,øl²ZMI¤Mÿ¥º.Z!jðn~¯£Î Eb`BpSû5ëm]O#ñ01¡hUX0'ª¾\\toä¼±A»¾çÜù¿§{wì:K.P¶RN}W}Ï­ü\.g¤o@,k\¯tÆÛ¬È\\r:Å6Re d>8Ó"õ0x-äÞFJUü·@­Ñ«Ää?úuAS4nË?B£}þã¡°ÏÜqbÖÁ¼VR¯ììü¬»49ê§èß\\nuÜÕö°@Ü-</ÂÛµÇñN³oîõ}×ªQøÁæ½Æ~äö¥¨TÅ©Ď©WB¨Þ=8k_BóöýA<GPïÝ¶Ü»:µ©ÕÏv\\fÔ°ä®+íÏ¿Sqûf%ÖÍ±x*jKN%ZÈpÈiÑÚaÄ ×É,ºQX\\b 0¦\\fõÂþ¿å¬ß1äd÷èýì@ÛÝX¯ç¾É¡ë<xQd4ÁC4Û ÓÃz$Â0)D*ÿp¢B×½yÀUEiÍðÄíêòÜ¿`t£Ý-u\\f»V¸È¡øJvq×@Gfû¿##N«zÌ&zù- \\t¾kháyãÿ£ýî¯!ÝN+Lêm ^di-cÎÐ}U>Îe.[EÏÂIÀ\\nðZâ!àÆ¾ZîOª«Ã]ÞÌÃ'Ç{_¸~º¨:´6áÂäÖZøÞí`6ôb9»£S#Â,:/¦kDhoBÍ¸¬1dÂw\ª\\f;ÃÀâ8à¦.qn*À*e÷¬ºê¹T¿"¼åj·ßºrfv¤®Þn;K¯3"öþÀàUd(2rØ¨ø6s\\tA9Fñj½"`¸zÄí9ÏÖV^§Ã_Òý$'IÕÏßp7@ç§`ÁzêG&l\\fä±]µó°-5X¸Ìã¹rYàpBL Ky©ó¨¬*[ÎlÌ© ^¸Äxø«ò"±jÝø*"£ÈäµÞ\\b .Ñ#Àä R¨¥f®DXkóFbIP«rÖÐÙëVÜ\\bubRaW&é Ùéu8÷(v'FE¹è\\rk½ôwÞ&\\bÇ,­÷Â¶]1­J,â40ÓE¦·ËçàÐÖÒY?í&TÊÀÅ@ªlÞ²?7Â×\\tÈ3Ùáv«K­Øê°÷ Ý"]!"FÙÌ\\t}Î>(µ~óe¹Vóøí£Àv¥¶¶`&ÅL¸ÍéµýäÍ²ßfoäb&Î®/§ýÿ-väVÐ]¥DOMËÚW\\tBMèn|î-^Ê¥Ùìpúcþ®}ì×¿_^¶,Ëëý\\n9Òfâûí{\\f\\rY!µA1G_ÌJ¸\SQªÎ(,»Î¢×ç)³¸Ä£#[µV«ÁzÖg9ÏK6FÞvºíõ>ÑÆµÜýüÒ>\\bJÅÕ]$fw/¨ÖîX^­>X®Gf*ÿýþ/eûkl'´¡müfN «V:ãìm7)ÃÇÒ×ÕfRR+®vùcègY&DjÏ<2às2ä WÑÒÚú¹_Â÷nBo}àò8Ýïv\\r7Ã&Y7bB(úÂgnªÉñ\¨[6xvå[FoÉóÛM%þà©CéWwP«#Æ\\t}Fì1éá²Ï<¨¿aÊFå¬l7\\f\\n3ýÜÍá¼É `çÌµÝ£SùßdÚÂ$vS³=~]=2]^KÉC­ÐÈÈ6®ÇgãgQd'h}|8ö4 0BáõIãehEÞñyë¦Ü©1#XüÆ®>°NtT¸µø;Ø9ÐSðò}(zc)f¥+\\n&ì7»[}b'ä¯Kqû¼öÖC@=²%<RõRµØ?Zx_àV_&©R©VÛÑÚÆ=xh½¨!6Bá,ªV&ñ²gO¹ê]Ü5NÖ%`rÂ){ÚÔÊþÝ¶Ám³UÞD¸$Éîw½@"ô«àp¬]ig~"Õr_/ôämùÜ]=Cý7àk´*ôs»teêt½»Èüøå]Ü4ã{rÖ®fìâtë!°EAã¡ïÖiÀ?|lÉ¸\\f7ÔUÕ´+ÔiÞw³ßøýÔúcÃ£zÂÂ÷4Â-ñp2Ðx¨× \\n¾37=Ñ^±ÎW®]ËP]_ñÀ"& Ç³Þ\\t_çÉiËò*¥â÷Ø\\f1VrÒvÍ'ä`o1çm\\rÀ 9¥)0bëÏ¿\\f[ú|\\fKUÎ\\rq#æ@Þ¾Vq¿-büçrKÄ¸a<MçØÂ'aÝä§\\n$bdf|»ÍáßíÝ¥Õól©q!C:# \\t¥ã\¤$é\\nëÄ ­1SCã\\náEL.nYø]Í£Âðw"/hûP:V0¼\PËg<O)8IekãD×êÛú^½aÙ96ADcuÎÔ/·G7#3\ÃÀ`þq*2súÌj¶Ç"CEÇdM­{Õcøgnà&¬~\\fËH°)M5H¸I}sOçh[<jùBmsÙòYv2UÛéÓw£¡W©&ÀÞñ×M!o&`ËÏñ¬ñü]8Q5MRØÏ¹8üÖVè\\tjcÛD²p¾Ê}BS.Êä>ñb¨o²iÇInú¾d\\b Escµ÷+øçÑÔC§ì2¿ÓÁ+ÀÍöÚr$þäq\\t¬oµxåãÝ£>àøÜFèèËbì%­À|ªß/¦Rò ¡>14Íº¹nDY\\fºåÁoKÖ¶VÒù*</^/æµ6w?|2| ÄÛgiM\é±KX¾nqÔ#ûÚ[úMyÁm'&­«kD-¿\Ög8n=o«/§àæ+±À ;®ø¿@îÿ6Là<×7MÇ Ì9\\rø%ÀOÕE°Qíßg»õòtR`á6-N{»w|~Æ@ßS¥=÷kì0Âc'z´&K§õ­¼Ê3ËN¿7\\bL("T \\fÌð_<~ut%v¬äøîÂá§f\\fÃîÀñqÒRØdð9¼5(ÔÅgþ®a®Ït#ÇéW<\\b+îý i»SGAô©ññä¹×Æy0ÁeÄt³K|jK©ôÄ´ÏõZ:£}PQOj!\\fèv.¼²ßSlïV3¦3ºíHHmÍÓuîf^©\\rÃ|×°¬N­{±7µaÕe´Øÿ«Ù$[mÓioµ£  ÒÝÏÒùSL£ tûÀn¯ëÉUÊ+B\;ãrØÐh!Ò¨^PhÑP`çmÿ\\n[¾£1?éùI¡°EV¼<@â®EØÉ¥Ñ°`~NÐBf\\nr:sY;kPP¡ÏØY'ð6ÔT÷/hÆ·G·æséÝõØ:9,ïÎi©QQ´çì_ÆØÞ¿pÍ,R\\bseÁ!1$!4ÆÅªßÖð.Ve"ÏùI|9¤;¬¬µ«R$RÐE³\\thò½×(NĎ´ÇÔn².u©a4ýç^¤Õh®`ËGbr¢-®i 7ÌT!=ö/ñçVXx/ãYfB§èTÌEáDE4+õ´Ù^ÌAúÃçÜ1M¥}cÝt°\\rÁd*T2ÉÞú<MTë*Ã´Ðì¼GòbÂy.ýÍÄF\\t£?9"+÷CV¿$õ23òíôÃ]û^ü¼åÊÎ*á\\nqÃñ~,ïKÚË°®Ù×wúùÐémÞÀË×1">&Øh¡7íìQow!Áû:åW@Âbä®05e{ÑZÚDr\\b2OkK¬¥k¤üð=éPçtZã!wùOÜy'ÍFZNT¾ÈA1ËoõßÂYÛD¬tã.7¢õ³'DÍN\0»þÓxOVûb7.L$Ù.t¨`´·%@\\f'½zõ·ØÅ:<#ôÅ¬û!ã q7}ä;öÝi1I­Z<íK\\bË4tÚ£ùµôc¦ÉTT+HtîrèC@Lp·ËyÚÆöÅãñiMôäuæé77Zí~Â$ª(VâÛsb*íMqîñÿ@øåÙ|èäØå?Ç§z¬§lûDç¤fgºé¹ZÆhe¥hFTº\ÀYÝdÈâs¿TQÐTÒú^q~þ7kVjª:ÑÊÙzWÅ\\b`ã®ÿº(«<Hàd½NxËO^(6[îÝ{N Xy^G´Hâæ-QbGæß ûË®·à¹5·TöBûªÕ;\\b\\r¦`nP)ùz %KÑ çÃÏ\\nL7Úl=üÛ®´å?TdüGNè!å»½iOÏ¬·#DÒ^×]mv÷K Ø`%'ÍÝÊ/ÝxUi¥BÔUCB)ñ£]­Ò¬ÀT«VqHJãê·Q¢ à9\\rSgAi¢$É|¤:C¼1SºÉ1ÝÃ¤®Ã0#È{mÜ` ©×Û Rv<?ãNø\Y×*äd9ÂyjÎûª_7=k1\\rÇ×Áf OjF¡JGÝl&º¯ÜûNz þè¾WÕÙïONqêßÇ[égiÆÌ¶ýðþ/Öx"ñO:C<GClw=vjÿ«÷5ó¶ËÎÜçtyíÓ0ku,Ð(Z§2#Jfã{n©^ï\\t1&_@£$eÔYtÜ#°MÓ±\\rt7¦÷Ì1¶>h¦.vF¡È÷tàÅ{ÕÎx{6Z§4tðóºJ]ÍÉ\\fÇù\\rçVáÎ»£PáîY{2b'òÀÿ9êc¬§õt½ÐöCk\\fêC`s©:ûÚýuT(V\\b,pDÅ]¬³WçîÊaûr~jLxMÀ²¨º¼ò¶Ì»8µóÞÚi@¦%\¬XçCq|\\f¬´òôÞCwÖÇ´æôstê¸s®½~jíádQ-èC`¾âOÍ£S¿ØÉ+své]°ÕdÄ´;;·M° P¼Î?'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #142
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #12
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 144
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc '¿ ]îûÔÉãÇ/á/Ó1XWwéÂs ÐÈl`Þ·üUVp'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #16
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #59
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zmes.a : [Ljava/lang/String;
    //   133: bipush #59
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zmes.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #9
    //   214: goto -> 244
    //   217: bipush #101
    //   219: goto -> 244
    //   222: bipush #100
    //   224: goto -> 244
    //   227: bipush #47
    //   229: goto -> 244
    //   232: bipush #32
    //   234: goto -> 244
    //   237: bipush #86
    //   239: goto -> 244
    //   242: bipush #14
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 41, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x39D3) & 0xFFFF;
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
      byte b1 = 119;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmes.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */