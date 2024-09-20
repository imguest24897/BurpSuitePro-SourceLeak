package burp;

import net.portswigger.Zrmq;

public class Zkkn extends Zkkx {
  private final Zmdu ZI;
  
  private static final String[] c;
  
  private static final String[] d;
  
  Zkkn(Zmdu paramZmdu) {
    this.ZI = paramZmdu;
  }
  
  protected Zbzm ZO(Zrmq paramZrmq) {
    String str1 = ZO(paramZrmq, b(-10769, -6240));
    String str2 = ZO(paramZrmq, b(-10813, 15868));
    if (str2 == null || str1 == null)
      return null; 
    String str3 = ZO(paramZrmq, b(-10787, 6811));
    String str4 = ZO(paramZrmq, b(-10870, 32416));
    String str5 = ZO(paramZrmq, b(-10876, -21785));
    String str6 = ZO(paramZrmq, b(-10791, 30201));
    String str7 = ZO(paramZrmq, b(-10895, -7832));
    String str8 = ZO(paramZrmq, b(-10844, 20976));
    String str9 = ZO(paramZrmq, b(-10854, -31389));
    String str10 = ZO(paramZrmq, b(-10819, -23970));
    boolean bool1 = ZQ(paramZrmq, b(-10779, 23449));
    String str11 = b(-10832, -9804).equals(str6) ? null : str6;
    String str12 = ZO(paramZrmq, b(-10833, 32453));
    String str13 = ZO(paramZrmq, b(-10863, 11660));
    boolean bool2 = ZQ(paramZrmq, b(-10809, 12929));
    String str14 = Zl(ZO(paramZrmq, b(-10883, -634)));
    String str15 = Zl(ZO(paramZrmq, b(-10836, 32220)));
    String str16 = Zl(ZO(paramZrmq, b(-10762, -7957)));
    Zvs zvs1 = Zv(str1, str3);
    Zvs zvs2 = Zeb4.Zs(zvs1, this.ZI);
    Zzct zzct = Zzct.ZH(paramZrmq.Zo(b(-10812, 7724)).Zk().intValue());
    String str17 = ZO(paramZrmq, b(-10764, -24512));
    String str18 = ZO(paramZrmq, b(-10756, -15365));
    String str19 = ZO(paramZrmq, b(-10840, -24584));
    String str20 = ZO(paramZrmq, b(-10856, 32761));
    return (new Zrh4()).ZL(str3).ZD(str8).Zo(str9).Zv(str10).ZA(str7).ZA(bool1).Zb(str16).ZU(ZN(str2)).Zt(zvs2).Zz(str11).ZK(str2).ZJ(str4).ZB(str14).ZY(str12).ZG(str13).Zf(str1).ZN(str15).Zy(str5).ZI(bool2).Zt(zzct).Z_(str17).Zp(str18).Zd(str19).Ze(str20).ZH();
  }
  
  private static int ZN(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: astore_2
    //   2: invokestatic ZT : ()I
    //   5: iconst_m1
    //   6: istore_3
    //   7: istore_1
    //   8: aload_2
    //   9: invokevirtual hashCode : ()I
    //   12: lookupswitch default -> 140, -2010875241 -> 122, -1363913139 -> 78, 1869336009 -> 56, 2007196093 -> 100
    //   56: aload_2
    //   57: sipush #-10830
    //   60: sipush #20193
    //   63: invokestatic b : (II)Ljava/lang/String;
    //   66: invokevirtual equals : (Ljava/lang/Object;)Z
    //   69: ifeq -> 140
    //   72: iconst_0
    //   73: istore_3
    //   74: iload_1
    //   75: ifeq -> 140
    //   78: aload_2
    //   79: sipush #-10893
    //   82: sipush #-10127
    //   85: invokestatic b : (II)Ljava/lang/String;
    //   88: invokevirtual equals : (Ljava/lang/Object;)Z
    //   91: ifeq -> 140
    //   94: iconst_1
    //   95: istore_3
    //   96: iload_1
    //   97: ifeq -> 140
    //   100: aload_2
    //   101: sipush #-10772
    //   104: sipush #-18413
    //   107: invokestatic b : (II)Ljava/lang/String;
    //   110: invokevirtual equals : (Ljava/lang/Object;)Z
    //   113: ifeq -> 140
    //   116: iconst_2
    //   117: istore_3
    //   118: iload_1
    //   119: ifeq -> 140
    //   122: aload_2
    //   123: sipush #-10773
    //   126: sipush #30243
    //   129: invokestatic b : (II)Ljava/lang/String;
    //   132: invokevirtual equals : (Ljava/lang/Object;)Z
    //   135: ifeq -> 140
    //   138: iconst_3
    //   139: istore_3
    //   140: iload_3
    //   141: tableswitch default -> 185, 0 -> 172, 1 -> 176, 2 -> 176, 3 -> 181
    //   172: iconst_2
    //   173: goto -> 186
    //   176: bipush #8
    //   178: goto -> 186
    //   181: iconst_1
    //   182: goto -> 186
    //   185: iconst_0
    //   186: ireturn
  }
  
  private static Zvs Zv(String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: astore_3
    //   2: invokestatic ZT : ()I
    //   5: iconst_m1
    //   6: istore #4
    //   8: istore_2
    //   9: aload_3
    //   10: invokevirtual hashCode : ()I
    //   13: lookupswitch default -> 3598, -2010875241 -> 3362, -1982315273 -> 3482, -1920911180 -> 1035, -1850962679 -> 3386, -1842224217 -> 2354, -1842210751 -> 2066, -1842208316 -> 2210, -1840385205 -> 1562, -1790587850 -> 2474, -1735228601 -> 1826, -1688275493 -> 2858, -1682569773 -> 3314, -1631196817 -> 1970, -1623907527 -> 1130, -1589846332 -> 2546, -1585232513 -> 2930, -1556774962 -> 989, -1394675040 -> 2450, -1389898779 -> 3122, -1389763738 -> 2522, -1363913139 -> 2882, -1308297507 -> 1898, -1276412789 -> 2906, -1270962146 -> 1442, -1238513605 -> 2282, -1181885826 -> 1730, -1144899171 -> 3026, -1034723000 -> 2114, -946039377 -> 3530, -917332854 -> 1058, -842982847 -> 1778, -820882892 -> 1706, -820507690 -> 2834, -672082756 -> 1274, -657422825 -> 3146, -657287784 -> 2570, -649524905 -> 2666, -626298295 -> 2378, -616759302 -> 3554, -612667607 -> 3290, -532855295 -> 2762, -515810952 -> 1754, -507171485 -> 3266, -460462519 -> 2498, -449313604 -> 1850, -435775774 -> 3578, -418378488 -> 1346, -362646416 -> 3002, -333418358 -> 1418, -323811686 -> 2786, -323724094 -> 2018, -315236113 -> 1490, -291302211 -> 2642, -229565497 -> 3338, -212476549 -> 2138, -195432138 -> 2234, -195323276 -> 2258, -119799243 -> 1994, -108267595 -> 3098, -41926735 -> 2426, 3125404 -> 1802, 69581734 -> 1538, 127497836 -> 1514, 135108962 -> 1082, 227860257 -> 2714, 260214870 -> 2306, 281429275 -> 1322, 281453184 -> 1178, 281873850 -> 1298, 401610142 -> 1682, 401985344 -> 2978, 438729193 -> 2954, 504848325 -> 2618, 507876684 -> 966, 523433613 -> 3506, 539812659 -> 1370, 625632540 -> 3242, 642867591 -> 1250, 725348190 -> 2330, 820289069 -> 3410, 840355121 -> 1202, 840361770 -> 1226, 992861196 -> 3434, 1087186391 -> 3194, 1089084047 -> 1012, 1089459249 -> 2810, 1101341226 -> 1466, 1141427358 -> 2402, 1143884733 -> 1106, 1181904460 -> 3218, 1182039501 -> 2594, 1267454300 -> 1610, 1297006972 -> 1586, 1341439710 -> 2738, 1379812394 -> 943, 1384920986 -> 920, 1444330673 -> 2042, 1445582840 -> 1922, 1473839367 -> 1634, 1494273770 -> 3074, 1503392039 -> 1658, 1517750351 -> 1874, 1659754143 -> 1946, 1707507877 -> 1154, 1722113492 -> 3458, 1845440878 -> 1394, 1854790744 -> 3050, 1869336009 -> 2690, 1869379976 -> 2186, 1901043637 -> 2162, 1977803522 -> 3170, 2133690956 -> 2090
    //   920: aload_3
    //   921: sipush #-10790
    //   924: sipush #13996
    //   927: invokestatic b : (II)Ljava/lang/String;
    //   930: invokevirtual equals : (Ljava/lang/Object;)Z
    //   933: ifeq -> 3598
    //   936: iconst_0
    //   937: istore #4
    //   939: iload_2
    //   940: ifeq -> 3598
    //   943: aload_3
    //   944: sipush #-10852
    //   947: sipush #7569
    //   950: invokestatic b : (II)Ljava/lang/String;
    //   953: invokevirtual equals : (Ljava/lang/Object;)Z
    //   956: ifeq -> 3598
    //   959: iconst_1
    //   960: istore #4
    //   962: iload_2
    //   963: ifeq -> 3598
    //   966: aload_3
    //   967: sipush #-10843
    //   970: sipush #-8131
    //   973: invokestatic b : (II)Ljava/lang/String;
    //   976: invokevirtual equals : (Ljava/lang/Object;)Z
    //   979: ifeq -> 3598
    //   982: iconst_2
    //   983: istore #4
    //   985: iload_2
    //   986: ifeq -> 3598
    //   989: aload_3
    //   990: sipush #-10768
    //   993: sipush #8722
    //   996: invokestatic b : (II)Ljava/lang/String;
    //   999: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1002: ifeq -> 3598
    //   1005: iconst_3
    //   1006: istore #4
    //   1008: iload_2
    //   1009: ifeq -> 3598
    //   1012: aload_3
    //   1013: sipush #-10881
    //   1016: sipush #-3832
    //   1019: invokestatic b : (II)Ljava/lang/String;
    //   1022: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1025: ifeq -> 3598
    //   1028: iconst_4
    //   1029: istore #4
    //   1031: iload_2
    //   1032: ifeq -> 3598
    //   1035: aload_3
    //   1036: sipush #-10800
    //   1039: sipush #32040
    //   1042: invokestatic b : (II)Ljava/lang/String;
    //   1045: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1048: ifeq -> 3598
    //   1051: iconst_5
    //   1052: istore #4
    //   1054: iload_2
    //   1055: ifeq -> 3598
    //   1058: aload_3
    //   1059: sipush #-10868
    //   1062: sipush #-30305
    //   1065: invokestatic b : (II)Ljava/lang/String;
    //   1068: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1071: ifeq -> 3598
    //   1074: bipush #6
    //   1076: istore #4
    //   1078: iload_2
    //   1079: ifeq -> 3598
    //   1082: aload_3
    //   1083: sipush #-10850
    //   1086: sipush #26245
    //   1089: invokestatic b : (II)Ljava/lang/String;
    //   1092: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1095: ifeq -> 3598
    //   1098: bipush #7
    //   1100: istore #4
    //   1102: iload_2
    //   1103: ifeq -> 3598
    //   1106: aload_3
    //   1107: sipush #-10885
    //   1110: sipush #27613
    //   1113: invokestatic b : (II)Ljava/lang/String;
    //   1116: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1119: ifeq -> 3598
    //   1122: bipush #8
    //   1124: istore #4
    //   1126: iload_2
    //   1127: ifeq -> 3598
    //   1130: aload_3
    //   1131: sipush #-10778
    //   1134: sipush #-31057
    //   1137: invokestatic b : (II)Ljava/lang/String;
    //   1140: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1143: ifeq -> 3598
    //   1146: bipush #9
    //   1148: istore #4
    //   1150: iload_2
    //   1151: ifeq -> 3598
    //   1154: aload_3
    //   1155: sipush #-10874
    //   1158: sipush #-4381
    //   1161: invokestatic b : (II)Ljava/lang/String;
    //   1164: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1167: ifeq -> 3598
    //   1170: bipush #10
    //   1172: istore #4
    //   1174: iload_2
    //   1175: ifeq -> 3598
    //   1178: aload_3
    //   1179: sipush #-10825
    //   1182: sipush #-31831
    //   1185: invokestatic b : (II)Ljava/lang/String;
    //   1188: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1191: ifeq -> 3598
    //   1194: bipush #11
    //   1196: istore #4
    //   1198: iload_2
    //   1199: ifeq -> 3598
    //   1202: aload_3
    //   1203: sipush #-10767
    //   1206: sipush #1452
    //   1209: invokestatic b : (II)Ljava/lang/String;
    //   1212: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1215: ifeq -> 3598
    //   1218: bipush #12
    //   1220: istore #4
    //   1222: iload_2
    //   1223: ifeq -> 3598
    //   1226: aload_3
    //   1227: sipush #-10803
    //   1230: sipush #29669
    //   1233: invokestatic b : (II)Ljava/lang/String;
    //   1236: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1239: ifeq -> 3598
    //   1242: bipush #13
    //   1244: istore #4
    //   1246: iload_2
    //   1247: ifeq -> 3598
    //   1250: aload_3
    //   1251: sipush #-10816
    //   1254: sipush #-25841
    //   1257: invokestatic b : (II)Ljava/lang/String;
    //   1260: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1263: ifeq -> 3598
    //   1266: bipush #14
    //   1268: istore #4
    //   1270: iload_2
    //   1271: ifeq -> 3598
    //   1274: aload_3
    //   1275: sipush #-10851
    //   1278: sipush #13720
    //   1281: invokestatic b : (II)Ljava/lang/String;
    //   1284: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1287: ifeq -> 3598
    //   1290: bipush #15
    //   1292: istore #4
    //   1294: iload_2
    //   1295: ifeq -> 3598
    //   1298: aload_3
    //   1299: sipush #-10877
    //   1302: sipush #-11837
    //   1305: invokestatic b : (II)Ljava/lang/String;
    //   1308: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1311: ifeq -> 3598
    //   1314: bipush #16
    //   1316: istore #4
    //   1318: iload_2
    //   1319: ifeq -> 3598
    //   1322: aload_3
    //   1323: sipush #-10807
    //   1326: sipush #-12430
    //   1329: invokestatic b : (II)Ljava/lang/String;
    //   1332: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1335: ifeq -> 3598
    //   1338: bipush #17
    //   1340: istore #4
    //   1342: iload_2
    //   1343: ifeq -> 3598
    //   1346: aload_3
    //   1347: sipush #-10887
    //   1350: sipush #30934
    //   1353: invokestatic b : (II)Ljava/lang/String;
    //   1356: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1359: ifeq -> 3598
    //   1362: bipush #18
    //   1364: istore #4
    //   1366: iload_2
    //   1367: ifeq -> 3598
    //   1370: aload_3
    //   1371: sipush #-10815
    //   1374: sipush #32649
    //   1377: invokestatic b : (II)Ljava/lang/String;
    //   1380: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1383: ifeq -> 3598
    //   1386: bipush #19
    //   1388: istore #4
    //   1390: iload_2
    //   1391: ifeq -> 3598
    //   1394: aload_3
    //   1395: sipush #-10857
    //   1398: sipush #20452
    //   1401: invokestatic b : (II)Ljava/lang/String;
    //   1404: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1407: ifeq -> 3598
    //   1410: bipush #20
    //   1412: istore #4
    //   1414: iload_2
    //   1415: ifeq -> 3598
    //   1418: aload_3
    //   1419: sipush #-10827
    //   1422: sipush #2304
    //   1425: invokestatic b : (II)Ljava/lang/String;
    //   1428: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1431: ifeq -> 3598
    //   1434: bipush #21
    //   1436: istore #4
    //   1438: iload_2
    //   1439: ifeq -> 3598
    //   1442: aload_3
    //   1443: sipush #-10841
    //   1446: sipush #19639
    //   1449: invokestatic b : (II)Ljava/lang/String;
    //   1452: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1455: ifeq -> 3598
    //   1458: bipush #22
    //   1460: istore #4
    //   1462: iload_2
    //   1463: ifeq -> 3598
    //   1466: aload_3
    //   1467: sipush #-10865
    //   1470: sipush #-22097
    //   1473: invokestatic b : (II)Ljava/lang/String;
    //   1476: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1479: ifeq -> 3598
    //   1482: bipush #23
    //   1484: istore #4
    //   1486: iload_2
    //   1487: ifeq -> 3598
    //   1490: aload_3
    //   1491: sipush #-10820
    //   1494: sipush #23917
    //   1497: invokestatic b : (II)Ljava/lang/String;
    //   1500: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1503: ifeq -> 3598
    //   1506: bipush #24
    //   1508: istore #4
    //   1510: iload_2
    //   1511: ifeq -> 3598
    //   1514: aload_3
    //   1515: sipush #-10822
    //   1518: sipush #-11992
    //   1521: invokestatic b : (II)Ljava/lang/String;
    //   1524: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1527: ifeq -> 3598
    //   1530: bipush #25
    //   1532: istore #4
    //   1534: iload_2
    //   1535: ifeq -> 3598
    //   1538: aload_3
    //   1539: sipush #-10861
    //   1542: sipush #-15675
    //   1545: invokestatic b : (II)Ljava/lang/String;
    //   1548: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1551: ifeq -> 3598
    //   1554: bipush #26
    //   1556: istore #4
    //   1558: iload_2
    //   1559: ifeq -> 3598
    //   1562: aload_3
    //   1563: sipush #-10853
    //   1566: sipush #-29227
    //   1569: invokestatic b : (II)Ljava/lang/String;
    //   1572: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1575: ifeq -> 3598
    //   1578: bipush #27
    //   1580: istore #4
    //   1582: iload_2
    //   1583: ifeq -> 3598
    //   1586: aload_3
    //   1587: sipush #-10845
    //   1590: sipush #13811
    //   1593: invokestatic b : (II)Ljava/lang/String;
    //   1596: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1599: ifeq -> 3598
    //   1602: bipush #28
    //   1604: istore #4
    //   1606: iload_2
    //   1607: ifeq -> 3598
    //   1610: aload_3
    //   1611: sipush #-10754
    //   1614: sipush #3105
    //   1617: invokestatic b : (II)Ljava/lang/String;
    //   1620: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1623: ifeq -> 3598
    //   1626: bipush #29
    //   1628: istore #4
    //   1630: iload_2
    //   1631: ifeq -> 3598
    //   1634: aload_3
    //   1635: sipush #-10811
    //   1638: sipush #-18737
    //   1641: invokestatic b : (II)Ljava/lang/String;
    //   1644: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1647: ifeq -> 3598
    //   1650: bipush #30
    //   1652: istore #4
    //   1654: iload_2
    //   1655: ifeq -> 3598
    //   1658: aload_3
    //   1659: sipush #-10771
    //   1662: sipush #27835
    //   1665: invokestatic b : (II)Ljava/lang/String;
    //   1668: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1671: ifeq -> 3598
    //   1674: bipush #31
    //   1676: istore #4
    //   1678: iload_2
    //   1679: ifeq -> 3598
    //   1682: aload_3
    //   1683: sipush #-10797
    //   1686: sipush #-29584
    //   1689: invokestatic b : (II)Ljava/lang/String;
    //   1692: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1695: ifeq -> 3598
    //   1698: bipush #32
    //   1700: istore #4
    //   1702: iload_2
    //   1703: ifeq -> 3598
    //   1706: aload_3
    //   1707: sipush #-10864
    //   1710: sipush #29080
    //   1713: invokestatic b : (II)Ljava/lang/String;
    //   1716: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1719: ifeq -> 3598
    //   1722: bipush #33
    //   1724: istore #4
    //   1726: iload_2
    //   1727: ifeq -> 3598
    //   1730: aload_3
    //   1731: sipush #-10765
    //   1734: sipush #-12742
    //   1737: invokestatic b : (II)Ljava/lang/String;
    //   1740: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1743: ifeq -> 3598
    //   1746: bipush #34
    //   1748: istore #4
    //   1750: iload_2
    //   1751: ifeq -> 3598
    //   1754: aload_3
    //   1755: sipush #-10855
    //   1758: sipush #-11608
    //   1761: invokestatic b : (II)Ljava/lang/String;
    //   1764: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1767: ifeq -> 3598
    //   1770: bipush #35
    //   1772: istore #4
    //   1774: iload_2
    //   1775: ifeq -> 3598
    //   1778: aload_3
    //   1779: sipush #-10798
    //   1782: sipush #-12743
    //   1785: invokestatic b : (II)Ljava/lang/String;
    //   1788: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1791: ifeq -> 3598
    //   1794: bipush #36
    //   1796: istore #4
    //   1798: iload_2
    //   1799: ifeq -> 3598
    //   1802: aload_3
    //   1803: sipush #-10875
    //   1806: sipush #-19658
    //   1809: invokestatic b : (II)Ljava/lang/String;
    //   1812: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1815: ifeq -> 3598
    //   1818: bipush #37
    //   1820: istore #4
    //   1822: iload_2
    //   1823: ifeq -> 3598
    //   1826: aload_3
    //   1827: sipush #-10859
    //   1830: sipush #32179
    //   1833: invokestatic b : (II)Ljava/lang/String;
    //   1836: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1839: ifeq -> 3598
    //   1842: bipush #38
    //   1844: istore #4
    //   1846: iload_2
    //   1847: ifeq -> 3598
    //   1850: aload_3
    //   1851: sipush #-10838
    //   1854: sipush #-18343
    //   1857: invokestatic b : (II)Ljava/lang/String;
    //   1860: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1863: ifeq -> 3598
    //   1866: bipush #39
    //   1868: istore #4
    //   1870: iload_2
    //   1871: ifeq -> 3598
    //   1874: aload_3
    //   1875: sipush #-10753
    //   1878: sipush #26270
    //   1881: invokestatic b : (II)Ljava/lang/String;
    //   1884: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1887: ifeq -> 3598
    //   1890: bipush #40
    //   1892: istore #4
    //   1894: iload_2
    //   1895: ifeq -> 3598
    //   1898: aload_3
    //   1899: sipush #-10758
    //   1902: sipush #-23373
    //   1905: invokestatic b : (II)Ljava/lang/String;
    //   1908: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1911: ifeq -> 3598
    //   1914: bipush #41
    //   1916: istore #4
    //   1918: iload_2
    //   1919: ifeq -> 3598
    //   1922: aload_3
    //   1923: sipush #-10802
    //   1926: sipush #26558
    //   1929: invokestatic b : (II)Ljava/lang/String;
    //   1932: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1935: ifeq -> 3598
    //   1938: bipush #42
    //   1940: istore #4
    //   1942: iload_2
    //   1943: ifeq -> 3598
    //   1946: aload_3
    //   1947: sipush #-10849
    //   1950: sipush #-19265
    //   1953: invokestatic b : (II)Ljava/lang/String;
    //   1956: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1959: ifeq -> 3598
    //   1962: bipush #43
    //   1964: istore #4
    //   1966: iload_2
    //   1967: ifeq -> 3598
    //   1970: aload_3
    //   1971: sipush #-10784
    //   1974: sipush #-23860
    //   1977: invokestatic b : (II)Ljava/lang/String;
    //   1980: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1983: ifeq -> 3598
    //   1986: bipush #44
    //   1988: istore #4
    //   1990: iload_2
    //   1991: ifeq -> 3598
    //   1994: aload_3
    //   1995: sipush #-10801
    //   1998: sipush #21942
    //   2001: invokestatic b : (II)Ljava/lang/String;
    //   2004: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2007: ifeq -> 3598
    //   2010: bipush #45
    //   2012: istore #4
    //   2014: iload_2
    //   2015: ifeq -> 3598
    //   2018: aload_3
    //   2019: sipush #-10817
    //   2022: sipush #-4790
    //   2025: invokestatic b : (II)Ljava/lang/String;
    //   2028: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2031: ifeq -> 3598
    //   2034: bipush #46
    //   2036: istore #4
    //   2038: iload_2
    //   2039: ifeq -> 3598
    //   2042: aload_3
    //   2043: sipush #-10793
    //   2046: sipush #17035
    //   2049: invokestatic b : (II)Ljava/lang/String;
    //   2052: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2055: ifeq -> 3598
    //   2058: bipush #47
    //   2060: istore #4
    //   2062: iload_2
    //   2063: ifeq -> 3598
    //   2066: aload_3
    //   2067: sipush #-10805
    //   2070: sipush #-21186
    //   2073: invokestatic b : (II)Ljava/lang/String;
    //   2076: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2079: ifeq -> 3598
    //   2082: bipush #48
    //   2084: istore #4
    //   2086: iload_2
    //   2087: ifeq -> 3598
    //   2090: aload_3
    //   2091: sipush #-10842
    //   2094: sipush #10559
    //   2097: invokestatic b : (II)Ljava/lang/String;
    //   2100: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2103: ifeq -> 3598
    //   2106: bipush #49
    //   2108: istore #4
    //   2110: iload_2
    //   2111: ifeq -> 3598
    //   2114: aload_3
    //   2115: sipush #-10862
    //   2118: sipush #-4673
    //   2121: invokestatic b : (II)Ljava/lang/String;
    //   2124: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2127: ifeq -> 3598
    //   2130: bipush #50
    //   2132: istore #4
    //   2134: iload_2
    //   2135: ifeq -> 3598
    //   2138: aload_3
    //   2139: sipush #-10867
    //   2142: sipush #-5593
    //   2145: invokestatic b : (II)Ljava/lang/String;
    //   2148: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2151: ifeq -> 3598
    //   2154: bipush #51
    //   2156: istore #4
    //   2158: iload_2
    //   2159: ifeq -> 3598
    //   2162: aload_3
    //   2163: sipush #-10894
    //   2166: sipush #-14913
    //   2169: invokestatic b : (II)Ljava/lang/String;
    //   2172: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2175: ifeq -> 3598
    //   2178: bipush #52
    //   2180: istore #4
    //   2182: iload_2
    //   2183: ifeq -> 3598
    //   2186: aload_3
    //   2187: sipush #-10878
    //   2190: sipush #-5009
    //   2193: invokestatic b : (II)Ljava/lang/String;
    //   2196: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2199: ifeq -> 3598
    //   2202: bipush #53
    //   2204: istore #4
    //   2206: iload_2
    //   2207: ifeq -> 3598
    //   2210: aload_3
    //   2211: sipush #-10824
    //   2214: sipush #12423
    //   2217: invokestatic b : (II)Ljava/lang/String;
    //   2220: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2223: ifeq -> 3598
    //   2226: bipush #54
    //   2228: istore #4
    //   2230: iload_2
    //   2231: ifeq -> 3598
    //   2234: aload_3
    //   2235: sipush #-10831
    //   2238: sipush #13810
    //   2241: invokestatic b : (II)Ljava/lang/String;
    //   2244: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2247: ifeq -> 3598
    //   2250: bipush #55
    //   2252: istore #4
    //   2254: iload_2
    //   2255: ifeq -> 3598
    //   2258: aload_3
    //   2259: sipush #-10761
    //   2262: sipush #27418
    //   2265: invokestatic b : (II)Ljava/lang/String;
    //   2268: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2271: ifeq -> 3598
    //   2274: bipush #56
    //   2276: istore #4
    //   2278: iload_2
    //   2279: ifeq -> 3598
    //   2282: aload_3
    //   2283: sipush #-10780
    //   2286: sipush #-20581
    //   2289: invokestatic b : (II)Ljava/lang/String;
    //   2292: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2295: ifeq -> 3598
    //   2298: bipush #57
    //   2300: istore #4
    //   2302: iload_2
    //   2303: ifeq -> 3598
    //   2306: aload_3
    //   2307: sipush #-10755
    //   2310: sipush #-15988
    //   2313: invokestatic b : (II)Ljava/lang/String;
    //   2316: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2319: ifeq -> 3598
    //   2322: bipush #58
    //   2324: istore #4
    //   2326: iload_2
    //   2327: ifeq -> 3598
    //   2330: aload_3
    //   2331: sipush #-10882
    //   2334: sipush #16871
    //   2337: invokestatic b : (II)Ljava/lang/String;
    //   2340: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2343: ifeq -> 3598
    //   2346: bipush #59
    //   2348: istore #4
    //   2350: iload_2
    //   2351: ifeq -> 3598
    //   2354: aload_3
    //   2355: sipush #-10880
    //   2358: sipush #-31869
    //   2361: invokestatic b : (II)Ljava/lang/String;
    //   2364: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2367: ifeq -> 3598
    //   2370: bipush #60
    //   2372: istore #4
    //   2374: iload_2
    //   2375: ifeq -> 3598
    //   2378: aload_3
    //   2379: sipush #-10766
    //   2382: sipush #-18659
    //   2385: invokestatic b : (II)Ljava/lang/String;
    //   2388: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2391: ifeq -> 3598
    //   2394: bipush #61
    //   2396: istore #4
    //   2398: iload_2
    //   2399: ifeq -> 3598
    //   2402: aload_3
    //   2403: sipush #-10796
    //   2406: sipush #-27755
    //   2409: invokestatic b : (II)Ljava/lang/String;
    //   2412: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2415: ifeq -> 3598
    //   2418: bipush #62
    //   2420: istore #4
    //   2422: iload_2
    //   2423: ifeq -> 3598
    //   2426: aload_3
    //   2427: sipush #-10786
    //   2430: sipush #-7016
    //   2433: invokestatic b : (II)Ljava/lang/String;
    //   2436: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2439: ifeq -> 3598
    //   2442: bipush #63
    //   2444: istore #4
    //   2446: iload_2
    //   2447: ifeq -> 3598
    //   2450: aload_3
    //   2451: sipush #-10770
    //   2454: sipush #-16928
    //   2457: invokestatic b : (II)Ljava/lang/String;
    //   2460: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2463: ifeq -> 3598
    //   2466: bipush #64
    //   2468: istore #4
    //   2470: iload_2
    //   2471: ifeq -> 3598
    //   2474: aload_3
    //   2475: sipush #-10869
    //   2478: sipush #10421
    //   2481: invokestatic b : (II)Ljava/lang/String;
    //   2484: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2487: ifeq -> 3598
    //   2490: bipush #65
    //   2492: istore #4
    //   2494: iload_2
    //   2495: ifeq -> 3598
    //   2498: aload_3
    //   2499: sipush #-10795
    //   2502: sipush #6420
    //   2505: invokestatic b : (II)Ljava/lang/String;
    //   2508: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2511: ifeq -> 3598
    //   2514: bipush #66
    //   2516: istore #4
    //   2518: iload_2
    //   2519: ifeq -> 3598
    //   2522: aload_3
    //   2523: sipush #-10782
    //   2526: sipush #-7596
    //   2529: invokestatic b : (II)Ljava/lang/String;
    //   2532: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2535: ifeq -> 3598
    //   2538: bipush #67
    //   2540: istore #4
    //   2542: iload_2
    //   2543: ifeq -> 3598
    //   2546: aload_3
    //   2547: sipush #-10839
    //   2550: sipush #7785
    //   2553: invokestatic b : (II)Ljava/lang/String;
    //   2556: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2559: ifeq -> 3598
    //   2562: bipush #68
    //   2564: istore #4
    //   2566: iload_2
    //   2567: ifeq -> 3598
    //   2570: aload_3
    //   2571: sipush #-10823
    //   2574: sipush #31121
    //   2577: invokestatic b : (II)Ljava/lang/String;
    //   2580: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2583: ifeq -> 3598
    //   2586: bipush #69
    //   2588: istore #4
    //   2590: iload_2
    //   2591: ifeq -> 3598
    //   2594: aload_3
    //   2595: sipush #-10799
    //   2598: sipush #-28332
    //   2601: invokestatic b : (II)Ljava/lang/String;
    //   2604: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2607: ifeq -> 3598
    //   2610: bipush #70
    //   2612: istore #4
    //   2614: iload_2
    //   2615: ifeq -> 3598
    //   2618: aload_3
    //   2619: sipush #-10826
    //   2622: sipush #21456
    //   2625: invokestatic b : (II)Ljava/lang/String;
    //   2628: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2631: ifeq -> 3598
    //   2634: bipush #71
    //   2636: istore #4
    //   2638: iload_2
    //   2639: ifeq -> 3598
    //   2642: aload_3
    //   2643: sipush #-10763
    //   2646: sipush #-9943
    //   2649: invokestatic b : (II)Ljava/lang/String;
    //   2652: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2655: ifeq -> 3598
    //   2658: bipush #72
    //   2660: istore #4
    //   2662: iload_2
    //   2663: ifeq -> 3598
    //   2666: aload_3
    //   2667: sipush #-10776
    //   2670: sipush #26399
    //   2673: invokestatic b : (II)Ljava/lang/String;
    //   2676: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2679: ifeq -> 3598
    //   2682: bipush #73
    //   2684: istore #4
    //   2686: iload_2
    //   2687: ifeq -> 3598
    //   2690: aload_3
    //   2691: sipush #-10834
    //   2694: sipush #-29083
    //   2697: invokestatic b : (II)Ljava/lang/String;
    //   2700: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2703: ifeq -> 3598
    //   2706: bipush #74
    //   2708: istore #4
    //   2710: iload_2
    //   2711: ifeq -> 3598
    //   2714: aload_3
    //   2715: sipush #-10821
    //   2718: sipush #4955
    //   2721: invokestatic b : (II)Ljava/lang/String;
    //   2724: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2727: ifeq -> 3598
    //   2730: bipush #75
    //   2732: istore #4
    //   2734: iload_2
    //   2735: ifeq -> 3598
    //   2738: aload_3
    //   2739: sipush #-10896
    //   2742: sipush #-6913
    //   2745: invokestatic b : (II)Ljava/lang/String;
    //   2748: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2751: ifeq -> 3598
    //   2754: bipush #76
    //   2756: istore #4
    //   2758: iload_2
    //   2759: ifeq -> 3598
    //   2762: aload_3
    //   2763: sipush #-10794
    //   2766: sipush #-3490
    //   2769: invokestatic b : (II)Ljava/lang/String;
    //   2772: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2775: ifeq -> 3598
    //   2778: bipush #77
    //   2780: istore #4
    //   2782: iload_2
    //   2783: ifeq -> 3598
    //   2786: aload_3
    //   2787: sipush #-10847
    //   2790: sipush #24271
    //   2793: invokestatic b : (II)Ljava/lang/String;
    //   2796: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2799: ifeq -> 3598
    //   2802: bipush #78
    //   2804: istore #4
    //   2806: iload_2
    //   2807: ifeq -> 3598
    //   2810: aload_3
    //   2811: sipush #-10835
    //   2814: sipush #-32327
    //   2817: invokestatic b : (II)Ljava/lang/String;
    //   2820: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2823: ifeq -> 3598
    //   2826: bipush #79
    //   2828: istore #4
    //   2830: iload_2
    //   2831: ifeq -> 3598
    //   2834: aload_3
    //   2835: sipush #-10848
    //   2838: sipush #-18680
    //   2841: invokestatic b : (II)Ljava/lang/String;
    //   2844: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2847: ifeq -> 3598
    //   2850: bipush #80
    //   2852: istore #4
    //   2854: iload_2
    //   2855: ifeq -> 3598
    //   2858: aload_3
    //   2859: sipush #-10858
    //   2862: sipush #14828
    //   2865: invokestatic b : (II)Ljava/lang/String;
    //   2868: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2871: ifeq -> 3598
    //   2874: bipush #81
    //   2876: istore #4
    //   2878: iload_2
    //   2879: ifeq -> 3598
    //   2882: aload_3
    //   2883: sipush #-10866
    //   2886: sipush #31248
    //   2889: invokestatic b : (II)Ljava/lang/String;
    //   2892: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2895: ifeq -> 3598
    //   2898: bipush #82
    //   2900: istore #4
    //   2902: iload_2
    //   2903: ifeq -> 3598
    //   2906: aload_3
    //   2907: sipush #-10829
    //   2910: sipush #-20091
    //   2913: invokestatic b : (II)Ljava/lang/String;
    //   2916: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2919: ifeq -> 3598
    //   2922: bipush #83
    //   2924: istore #4
    //   2926: iload_2
    //   2927: ifeq -> 3598
    //   2930: aload_3
    //   2931: sipush #-10759
    //   2934: sipush #31704
    //   2937: invokestatic b : (II)Ljava/lang/String;
    //   2940: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2943: ifeq -> 3598
    //   2946: bipush #84
    //   2948: istore #4
    //   2950: iload_2
    //   2951: ifeq -> 3598
    //   2954: aload_3
    //   2955: sipush #-10818
    //   2958: sipush #-18983
    //   2961: invokestatic b : (II)Ljava/lang/String;
    //   2964: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2967: ifeq -> 3598
    //   2970: bipush #85
    //   2972: istore #4
    //   2974: iload_2
    //   2975: ifeq -> 3598
    //   2978: aload_3
    //   2979: sipush #-10806
    //   2982: sipush #-29964
    //   2985: invokestatic b : (II)Ljava/lang/String;
    //   2988: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2991: ifeq -> 3598
    //   2994: bipush #86
    //   2996: istore #4
    //   2998: iload_2
    //   2999: ifeq -> 3598
    //   3002: aload_3
    //   3003: sipush #-10808
    //   3006: sipush #14127
    //   3009: invokestatic b : (II)Ljava/lang/String;
    //   3012: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3015: ifeq -> 3598
    //   3018: bipush #87
    //   3020: istore #4
    //   3022: iload_2
    //   3023: ifeq -> 3598
    //   3026: aload_3
    //   3027: sipush #-10775
    //   3030: sipush #22976
    //   3033: invokestatic b : (II)Ljava/lang/String;
    //   3036: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3039: ifeq -> 3598
    //   3042: bipush #88
    //   3044: istore #4
    //   3046: iload_2
    //   3047: ifeq -> 3598
    //   3050: aload_3
    //   3051: sipush #-10886
    //   3054: sipush #-28485
    //   3057: invokestatic b : (II)Ljava/lang/String;
    //   3060: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3063: ifeq -> 3598
    //   3066: bipush #89
    //   3068: istore #4
    //   3070: iload_2
    //   3071: ifeq -> 3598
    //   3074: aload_3
    //   3075: sipush #-10760
    //   3078: sipush #23906
    //   3081: invokestatic b : (II)Ljava/lang/String;
    //   3084: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3087: ifeq -> 3598
    //   3090: bipush #90
    //   3092: istore #4
    //   3094: iload_2
    //   3095: ifeq -> 3598
    //   3098: aload_3
    //   3099: sipush #-10884
    //   3102: sipush #30923
    //   3105: invokestatic b : (II)Ljava/lang/String;
    //   3108: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3111: ifeq -> 3598
    //   3114: bipush #91
    //   3116: istore #4
    //   3118: iload_2
    //   3119: ifeq -> 3598
    //   3122: aload_3
    //   3123: sipush #-10788
    //   3126: sipush #-31620
    //   3129: invokestatic b : (II)Ljava/lang/String;
    //   3132: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3135: ifeq -> 3598
    //   3138: bipush #92
    //   3140: istore #4
    //   3142: iload_2
    //   3143: ifeq -> 3598
    //   3146: aload_3
    //   3147: sipush #-10757
    //   3150: sipush #-10177
    //   3153: invokestatic b : (II)Ljava/lang/String;
    //   3156: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3159: ifeq -> 3598
    //   3162: bipush #93
    //   3164: istore #4
    //   3166: iload_2
    //   3167: ifeq -> 3598
    //   3170: aload_3
    //   3171: sipush #-10873
    //   3174: sipush #-24735
    //   3177: invokestatic b : (II)Ljava/lang/String;
    //   3180: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3183: ifeq -> 3598
    //   3186: bipush #94
    //   3188: istore #4
    //   3190: iload_2
    //   3191: ifeq -> 3598
    //   3194: aload_3
    //   3195: sipush #-10777
    //   3198: sipush #-22868
    //   3201: invokestatic b : (II)Ljava/lang/String;
    //   3204: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3207: ifeq -> 3598
    //   3210: bipush #95
    //   3212: istore #4
    //   3214: iload_2
    //   3215: ifeq -> 3598
    //   3218: aload_3
    //   3219: sipush #-10789
    //   3222: sipush #-20853
    //   3225: invokestatic b : (II)Ljava/lang/String;
    //   3228: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3231: ifeq -> 3598
    //   3234: bipush #96
    //   3236: istore #4
    //   3238: iload_2
    //   3239: ifeq -> 3598
    //   3242: aload_3
    //   3243: sipush #-10871
    //   3246: sipush #27636
    //   3249: invokestatic b : (II)Ljava/lang/String;
    //   3252: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3255: ifeq -> 3598
    //   3258: bipush #97
    //   3260: istore #4
    //   3262: iload_2
    //   3263: ifeq -> 3598
    //   3266: aload_3
    //   3267: sipush #-10828
    //   3270: sipush #-10626
    //   3273: invokestatic b : (II)Ljava/lang/String;
    //   3276: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3279: ifeq -> 3598
    //   3282: bipush #98
    //   3284: istore #4
    //   3286: iload_2
    //   3287: ifeq -> 3598
    //   3290: aload_3
    //   3291: sipush #-10804
    //   3294: sipush #-2091
    //   3297: invokestatic b : (II)Ljava/lang/String;
    //   3300: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3303: ifeq -> 3598
    //   3306: bipush #99
    //   3308: istore #4
    //   3310: iload_2
    //   3311: ifeq -> 3598
    //   3314: aload_3
    //   3315: sipush #-10792
    //   3318: sipush #23480
    //   3321: invokestatic b : (II)Ljava/lang/String;
    //   3324: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3327: ifeq -> 3598
    //   3330: bipush #100
    //   3332: istore #4
    //   3334: iload_2
    //   3335: ifeq -> 3598
    //   3338: aload_3
    //   3339: sipush #-10872
    //   3342: sipush #-19737
    //   3345: invokestatic b : (II)Ljava/lang/String;
    //   3348: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3351: ifeq -> 3598
    //   3354: bipush #101
    //   3356: istore #4
    //   3358: iload_2
    //   3359: ifeq -> 3598
    //   3362: aload_3
    //   3363: sipush #-10814
    //   3366: sipush #4869
    //   3369: invokestatic b : (II)Ljava/lang/String;
    //   3372: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3375: ifeq -> 3598
    //   3378: bipush #102
    //   3380: istore #4
    //   3382: iload_2
    //   3383: ifeq -> 3598
    //   3386: aload_3
    //   3387: sipush #-10837
    //   3390: sipush #-24081
    //   3393: invokestatic b : (II)Ljava/lang/String;
    //   3396: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3399: ifeq -> 3598
    //   3402: bipush #103
    //   3404: istore #4
    //   3406: iload_2
    //   3407: ifeq -> 3598
    //   3410: aload_3
    //   3411: sipush #-10781
    //   3414: sipush #24780
    //   3417: invokestatic b : (II)Ljava/lang/String;
    //   3420: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3423: ifeq -> 3598
    //   3426: bipush #104
    //   3428: istore #4
    //   3430: iload_2
    //   3431: ifeq -> 3598
    //   3434: aload_3
    //   3435: sipush #-10860
    //   3438: sipush #15339
    //   3441: invokestatic b : (II)Ljava/lang/String;
    //   3444: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3447: ifeq -> 3598
    //   3450: bipush #105
    //   3452: istore #4
    //   3454: iload_2
    //   3455: ifeq -> 3598
    //   3458: aload_3
    //   3459: sipush #-10783
    //   3462: sipush #-8715
    //   3465: invokestatic b : (II)Ljava/lang/String;
    //   3468: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3471: ifeq -> 3598
    //   3474: bipush #106
    //   3476: istore #4
    //   3478: iload_2
    //   3479: ifeq -> 3598
    //   3482: aload_3
    //   3483: sipush #-10810
    //   3486: sipush #-6120
    //   3489: invokestatic b : (II)Ljava/lang/String;
    //   3492: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3495: ifeq -> 3598
    //   3498: bipush #107
    //   3500: istore #4
    //   3502: iload_2
    //   3503: ifeq -> 3598
    //   3506: aload_3
    //   3507: sipush #-10774
    //   3510: sipush #21989
    //   3513: invokestatic b : (II)Ljava/lang/String;
    //   3516: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3519: ifeq -> 3598
    //   3522: bipush #108
    //   3524: istore #4
    //   3526: iload_2
    //   3527: ifeq -> 3598
    //   3530: aload_3
    //   3531: sipush #-10888
    //   3534: sipush #22296
    //   3537: invokestatic b : (II)Ljava/lang/String;
    //   3540: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3543: ifeq -> 3598
    //   3546: bipush #109
    //   3548: istore #4
    //   3550: iload_2
    //   3551: ifeq -> 3598
    //   3554: aload_3
    //   3555: sipush #-10879
    //   3558: sipush #-26022
    //   3561: invokestatic b : (II)Ljava/lang/String;
    //   3564: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3567: ifeq -> 3598
    //   3570: bipush #110
    //   3572: istore #4
    //   3574: iload_2
    //   3575: ifeq -> 3598
    //   3578: aload_3
    //   3579: sipush #-10846
    //   3582: sipush #11857
    //   3585: invokestatic b : (II)Ljava/lang/String;
    //   3588: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3591: ifeq -> 3598
    //   3594: bipush #111
    //   3596: istore #4
    //   3598: iload #4
    //   3600: tableswitch default -> 4142, 0 -> 4064, 1 -> 4090, 2 -> 4090, 3 -> 4090, 4 -> 4090, 5 -> 4090, 6 -> 4090, 7 -> 4090, 8 -> 4090, 9 -> 4090, 10 -> 4090, 11 -> 4090, 12 -> 4090, 13 -> 4090, 14 -> 4090, 15 -> 4090, 16 -> 4090, 17 -> 4090, 18 -> 4090, 19 -> 4090, 20 -> 4090, 21 -> 4090, 22 -> 4090, 23 -> 4090, 24 -> 4090, 25 -> 4090, 26 -> 4090, 27 -> 4090, 28 -> 4090, 29 -> 4090, 30 -> 4090, 31 -> 4090, 32 -> 4090, 33 -> 4090, 34 -> 4090, 35 -> 4090, 36 -> 4090, 37 -> 4094, 38 -> 4094, 39 -> 4094, 40 -> 4094, 41 -> 4094, 42 -> 4094, 43 -> 4094, 44 -> 4094, 45 -> 4094, 46 -> 4094, 47 -> 4098, 48 -> 4098, 49 -> 4098, 50 -> 4098, 51 -> 4098, 52 -> 4098, 53 -> 4098, 54 -> 4098, 55 -> 4098, 56 -> 4098, 57 -> 4098, 58 -> 4098, 59 -> 4098, 60 -> 4098, 61 -> 4098, 62 -> 4102, 63 -> 4102, 64 -> 4102, 65 -> 4102, 66 -> 4102, 67 -> 4102, 68 -> 4102, 69 -> 4102, 70 -> 4102, 71 -> 4106, 72 -> 4106, 73 -> 4106, 74 -> 4106, 75 -> 4106, 76 -> 4106, 77 -> 4106, 78 -> 4106, 79 -> 4106, 80 -> 4106, 81 -> 4106, 82 -> 4106, 83 -> 4106, 84 -> 4106, 85 -> 4106, 86 -> 4106, 87 -> 4106, 88 -> 4106, 89 -> 4106, 90 -> 4106, 91 -> 4106, 92 -> 4106, 93 -> 4106, 94 -> 4106, 95 -> 4106, 96 -> 4106, 97 -> 4106, 98 -> 4106, 99 -> 4110, 100 -> 4110, 101 -> 4114, 102 -> 4118, 103 -> 4122, 104 -> 4126, 105 -> 4130, 106 -> 4130, 107 -> 4134, 108 -> 4138, 109 -> 4138, 110 -> 4138, 111 -> 4138
    //   4064: sipush #-10785
    //   4067: sipush #-23890
    //   4070: invokestatic b : (II)Ljava/lang/String;
    //   4073: aload_1
    //   4074: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4077: ifeq -> 4086
    //   4080: getstatic burp/Zzu2.XSS_DOM_BASED : Lburp/Zzu2;
    //   4083: goto -> 4089
    //   4086: getstatic burp/Zzu2.LINK_MANIPULATION_DOM_BASED : Lburp/Zzu2;
    //   4089: areturn
    //   4090: getstatic burp/Zzu2.XSS_DOM_BASED : Lburp/Zzu2;
    //   4093: areturn
    //   4094: getstatic burp/Zzu2.JAVASCRIPT_INJECTION_DOM_BASED : Lburp/Zzu2;
    //   4097: areturn
    //   4098: getstatic burp/Zzu2.OPEN_REDIRECTION_DOM_BASED : Lburp/Zzu2;
    //   4101: areturn
    //   4102: getstatic burp/Zzu2.LINK_MANIPULATION_DOM_BASED : Lburp/Zzu2;
    //   4105: areturn
    //   4106: getstatic burp/Zzu2.DOM_DATA_MANIPULATION_DOM_BASED : Lburp/Zzu2;
    //   4109: areturn
    //   4110: getstatic burp/Zzu2.AJAX_REQUEST_HEADER_MANIPULATION_DOM_BASED : Lburp/Zzu2;
    //   4113: areturn
    //   4114: getstatic burp/Zzu2.WEBSOCKET_URL_POISONING_DOM_BASED : Lburp/Zzu2;
    //   4117: areturn
    //   4118: getstatic burp/Zzu2.COOKIE_MANIPULATION_DOM_BASED : Lburp/Zzu2;
    //   4121: areturn
    //   4122: getstatic burp/Zzu2.DENIAL_OF_SERVICE_DOM_BASED : Lburp/Zzu2;
    //   4125: areturn
    //   4126: getstatic burp/Zzu2.CLIENT_SIDE_JSON_INJECTION_DOM_BASED : Lburp/Zzu2;
    //   4129: areturn
    //   4130: getstatic burp/Zzu2.CLIENT_SIDE_XPATH_INJECTION_DOM_BASED : Lburp/Zzu2;
    //   4133: areturn
    //   4134: getstatic burp/Zzu2.DOCUMENT_DOMAIN_MANIPULATION_DOM_BASED : Lburp/Zzu2;
    //   4137: areturn
    //   4138: getstatic burp/Zzu2.HTML5_STORAGE_MANIPULATION_DOM_BASED : Lburp/Zzu2;
    //   4141: areturn
    //   4142: iconst_0
    //   4143: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   4146: aload_0
    //   4147: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   4150: getstatic burp/Zzu2.XSS_DOM_BASED : Lburp/Zzu2;
    //   4153: areturn
  }
  
  static {
    // Byte code:
    //   0: sipush #140
    //   3: anewarray java/lang/String
    //   6: astore #5
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc '­íE¸}#E· y×²/`/ªH÷zXÃ°ô[åMV®Ó\\r±ÙÆU@\\fò×Ñ8· GÇ5íq\\fÍ?·ü:÷{%C(Ó7®`T!{gÜ\\tê÷r)ÂhÇpU4@.ÉLb*@9§^Dû+g{\d\\r©(\\n)=%¨Éèñ}5°úPÓ8þ;Æ/<ú.äIÑA:}èá>Í`ê0³½¬:\\nxèüP q¥Ùþ­#-v»4m ¿¦ó¦9W\\b9ü,õö@?NØj1Md6ÿ^çÕL±~O|·ú`+ÖÏÎ]/\\bî±Âg×Kgd¿JQìÃ\\r(m Þ ^päåIó-+÷"½gFKH´ð¿bT9üyÛoâW*¸Â\\rÒÐsþ³\\bÇâFiÖÚÜ¬~º^DµK5« /ÇÊ\\t(Rh8$×á;7?KùVJD6Ë\MáêCÿþndAÁ·REA9Ã34\\nr½D°È\\f¯óB[úwd$ÄçG¥^Þk\\tö]f¢:ZËðõS! Å1jmx9üÞ  µóÁå\\n\\tW\\bêêÀv\\r¥½8¯rÕ½(\\nèõLÊ\:}ôYYË¢*d/À)µV&}A;W$³eÖîSÆ¸6}µKaÜl½¹ÉH4nìÓ=j*UÖi\\boºa³)ÅêQÔÈl¿Æx\\tºé>p3ÿ¢ìy*£þø8£ÈTZ¤rñ Ýk\\nøç®?¼*Jú°ÉúIô1EE\ÔnÚu\\b9Ý« ùM ¶áÿµ¬TsÚ¢ö'N pï¤ï'#Ê=áþåÇÚ~UäóÚÝCÂÞIÃOþäã¨Éuìi ÿ8(ûpNöO@c#àß¶¼X©ÅDvPÇ\\r'¢ö4\\nlÖ\\röÙE½½Ùí~\\tü;\\f<Ì<Ê=+³q\\b o¸ûq¯6¸õ1*#é©¤²O¸d['Üýê D¡v<ÃàâIÁ\\nD½3;+ø¿*vë/4¦¥%ãC9|A ñLÜ?_gª`nÁëÑTÕ\\t¬­.9¸b¸¥tþÎ/\\tÒ0w1js) ågüÍ?§Ã³$Å·ð o¬ª^&ÐÙ\\f/Y!£`_7¸Áãªõrp£#ä %0íEäB3W\\fþ\\f9«ù ø³ø²×²Óß)ËäÚÝ\\bCUÚ\\b·\­»\\r\\tÅ}þñ&¦BÁt)ÂáÔ½]Ì~î>tÓÂ\\nþ¢n¤?I%ø©]\\tÍh¡\\rQ|£a§ÎÞ¿5y+a\\r¡Ê¸âìZ9Ý$FåUÌ+o©rÃñyÔú\\bé(¸ìu¼7²k*Fuéód3¯w¤xTú)¸V¾×¾d}âÃdQãezkÔ>ª?`\\bÆM)È!Y@3)û§éyÂK<\\b<ùiIKC52Ú\\t%b½WçÍWlø¶ím1à¹oaníA¤ÊÔ¾·&VÁ¿t¼\\rq®Yÿ´'sZ[\\n\\rÓÓÅë~W©ìé<Qâ1p*rê~÷i¨^Ó¯ÊþßýW¨OØ~Øâ­ÿ\\téµC\Vaë4ÎX&]Æ¹ºìbÁ ²¥Ë¾ëu/§n´ªd\\t£8Ùî>\\b\\r­Çªqz{À4¼;³!0ÇâaaÒ!!áVjbÀýh3@ùs|À!çÛ;\\nÒ3sï=Íf\\nQõ¦Ýç\\nX;Ã _"M­±®ªã\\t:÷µx£.GÎ&7í!1ª¾Ê½êr´Ç{Ø dV«ö'§¥ó«¤Ù\\bÖóSõ££0ø½úí5i(¤éd¦¨ä,ÓãÓðÐ¸Ld<"Â²ày/ëNË`Î)1\\f¯ÒÅ(²æÄì©)è\\t|ôco­\\fõ2\\nÊ\\fÆòw ¡\\n¨Ñ¢âð"lmç8°.wëÓñÁ²uÉÃ^¸êúÞÕ µêÖxÜ\\f\\bçg»ãûÇóµáÜTéh[ádÁò'WGÁkc¬ÓÕ)!P(.#ÕwïsY©Â\\nûÊ?90çðÔNèàO¢(æQ4)ÜÊøk¢ØØð<Ì"í\\t"Kä»HqI·l£ß3¸EæÙ>rË'\\nædmeæhIX\\t'o@9ìý{pázÆ\\rÞë£#ÀN§=\\t\\tô>úD;®?é \\rÅè°âi¹\\rtøm±«|\\rÑöU¬@æ'Ôå\Bmi:gËWõ§!}æ»V`CWfù@r7\YßÙi9>¢yyÞW3¨ Ys ré*¸¬u´'»Q¤á½nÚ~}&\\r7TºÌ\\t@9n¡Ø(»Jé{ä2L¸O§+·;ÝGÑÀðãj&Á´¢\\t/¬õÅÄsãt§H§95ö\søþÛfûX HYÿ_\\t ·­|eÑÖ~¹ "6ºOÙAxß¢ÄÕ!:°8U^Ni.îu\\n?kiá`£dÐù<Ük­ãª-ÚÆ½PÌõ<Wº.ò¶Ö\\rÉÍÈ|çÚpàQÏYVÂ©u±}p×s8\\r<íoÓ¯P¹ÀÊ]/h>îfü&YKÈEÝ\\fÑñ¾4gïÍd¾qWÐ\OMXL\\b»Þ+;j+ªðzN7fÇ'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #24
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #87
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 145
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
    //   69: ldc 'R~ 3<£WV*'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #10
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #85
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 145
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
    //   130: putstatic burp/Zkkn.c : [Ljava/lang/String;
    //   133: sipush #140
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zkkn.d : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #49
    //   218: goto -> 248
    //   221: bipush #81
    //   223: goto -> 248
    //   226: bipush #69
    //   228: goto -> 248
    //   231: bipush #50
    //   233: goto -> 248
    //   236: bipush #48
    //   238: goto -> 248
    //   241: bipush #6
    //   243: goto -> 248
    //   246: bipush #54
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 41, 0 -> 100
    //   304: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD5FA) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      char c = 'é';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkkn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */