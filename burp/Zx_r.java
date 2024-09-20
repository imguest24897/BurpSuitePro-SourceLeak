package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx_r {
  private static String ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static byte Zd(Zvs paramZvs, Zs66 paramZs66, short paramShort, int paramInt, String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2, byte paramByte, EnumSet<Zklf> paramEnumSet) {
    if (paramByte == 18)
      return paramEnumSet.isEmpty() ? 1 : 4; 
    Zlg0 zlg0 = new Zlg0(paramString1, paramBoolean1, paramBoolean2);
    paramEnumSet = zlg0.ZK(paramString2);
    EnumSet<Zklf> enumSet = zlg0.ZN();
    if (!Zt1t.Zb(paramString1) && paramEnumSet.isEmpty() && enumSet.isEmpty()) {
      Zuh.Zb((paramZvs == Zzu2.XSS_REFLECTED || paramZvs == Zzu2.XSS_STORED), Zqf.Zr);
      return 1;
    } 
    if (!Zt1t.Zb(paramString1) && paramEnumSet.isEmpty() && !enumSet.isEmpty() && (paramInt & 0x20000) == 0 && (paramInt & 0x40000) == 0) {
      Zuh.Zb((paramZvs == Zzu2.XSS_REFLECTED || paramZvs == Zzu2.XSS_STORED), Zqf.Zr);
      return 1;
    } 
    return Zk(paramZvs, paramZs66, paramShort, paramInt, paramByte);
  }
  
  public static byte Zk(Zvs paramZvs, Zs66 paramZs66, short paramShort, int paramInt, byte paramByte) {
    // Byte code:
    //   0: invokestatic ZO : ()Ljava/lang/String;
    //   3: astore #5
    //   5: aload_0
    //   6: getstatic burp/Zzu2.XSS_REFLECTED : Lburp/Zzu2;
    //   9: if_acmpne -> 118
    //   12: iload_2
    //   13: sipush #300
    //   16: if_icmplt -> 34
    //   19: iload_2
    //   20: sipush #400
    //   23: if_icmpge -> 34
    //   26: iconst_1
    //   27: istore #6
    //   29: aload #5
    //   31: ifnull -> 67
    //   34: aload_1
    //   35: getstatic burp/Zs66.HEADER : Lburp/Zs66;
    //   38: if_acmpne -> 49
    //   41: iconst_2
    //   42: istore #6
    //   44: aload #5
    //   46: ifnull -> 67
    //   49: aload_1
    //   50: getstatic burp/Zs66.COOKIE : Lburp/Zs66;
    //   53: if_acmpne -> 64
    //   56: iconst_3
    //   57: istore #6
    //   59: aload #5
    //   61: ifnull -> 67
    //   64: iconst_4
    //   65: istore #6
    //   67: iload_3
    //   68: sipush #8192
    //   71: iand
    //   72: sipush #8192
    //   75: if_icmpne -> 95
    //   78: iload_3
    //   79: sipush #4096
    //   82: iand
    //   83: ifne -> 95
    //   86: iload #6
    //   88: iconst_2
    //   89: invokestatic min : (II)I
    //   92: i2b
    //   93: istore #6
    //   95: iload #4
    //   97: bipush #15
    //   99: if_icmpne -> 105
    //   102: iconst_1
    //   103: istore #6
    //   105: iload #4
    //   107: bipush #17
    //   109: if_icmpne -> 115
    //   112: iconst_1
    //   113: istore #6
    //   115: iload #6
    //   117: ireturn
    //   118: aload_0
    //   119: getstatic burp/Zzu2.XSS_STORED : Lburp/Zzu2;
    //   122: if_acmpne -> 145
    //   125: iload_2
    //   126: sipush #300
    //   129: if_icmplt -> 143
    //   132: iload_2
    //   133: sipush #400
    //   136: if_icmpge -> 143
    //   139: iconst_1
    //   140: goto -> 144
    //   143: iconst_4
    //   144: ireturn
    //   145: iconst_0
    //   146: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   149: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   152: iconst_0
    //   153: ireturn
  }
  
  public static String ZB(byte paramByte, Zefg<Zxtl> paramZefg, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZO : ()Ljava/lang/String;
    //   3: astore #4
    //   5: new java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #5
    //   14: iload_0
    //   15: tableswitch default -> 251, 0 -> 246, 1 -> 212, 2 -> 246, 3 -> 246, 4 -> 246, 5 -> 246, 6 -> 246, 7 -> 246, 8 -> 246, 9 -> 246, 10 -> 246, 11 -> 246, 12 -> 226, 13 -> 226, 14 -> 226, 15 -> 226, 16 -> 132, 17 -> 132, 18 -> 132, 19 -> 246, 20 -> 152, 21 -> 172, 22 -> 246, 23 -> 192, 24 -> 132, 25 -> 132
    //   132: aload #5
    //   134: sipush #-6788
    //   137: sipush #1124
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: aload #4
    //   149: ifnull -> 260
    //   152: aload #5
    //   154: sipush #-6795
    //   157: sipush #-27730
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: pop
    //   167: aload #4
    //   169: ifnull -> 260
    //   172: aload #5
    //   174: sipush #-6797
    //   177: sipush #21341
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload #4
    //   189: ifnull -> 260
    //   192: aload #5
    //   194: sipush #-6792
    //   197: sipush #25716
    //   200: invokestatic a : (II)Ljava/lang/String;
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: aload #4
    //   209: ifnull -> 260
    //   212: iconst_0
    //   213: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   216: iload_0
    //   217: i2l
    //   218: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   221: aload #4
    //   223: ifnull -> 260
    //   226: aload #5
    //   228: sipush #-6789
    //   231: sipush #-32189
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: pop
    //   241: aload #4
    //   243: ifnull -> 260
    //   246: aload #4
    //   248: ifnull -> 260
    //   251: iconst_0
    //   252: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   255: iload_0
    //   256: i2l
    //   257: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   260: iload_2
    //   261: iconst_1
    //   262: iand
    //   263: iconst_1
    //   264: if_icmpne -> 328
    //   267: aload #5
    //   269: sipush #-6785
    //   272: sipush #7309
    //   275: invokestatic a : (II)Ljava/lang/String;
    //   278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: pop
    //   282: aload #5
    //   284: aload_1
    //   285: iconst_1
    //   286: iconst_0
    //   287: invokestatic ZM : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: pop
    //   294: iload_3
    //   295: ifeq -> 313
    //   298: aload #5
    //   300: sipush #-6794
    //   303: sipush #-3712
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: pop
    //   313: aload #5
    //   315: sipush #-6787
    //   318: sipush #-12727
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: pop
    //   328: iload_2
    //   329: iconst_2
    //   330: iand
    //   331: iconst_2
    //   332: if_icmpne -> 350
    //   335: aload #5
    //   337: sipush #-6790
    //   340: sipush #21032
    //   343: invokestatic a : (II)Ljava/lang/String;
    //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: pop
    //   350: iload_2
    //   351: bipush #8
    //   353: iand
    //   354: bipush #8
    //   356: if_icmpne -> 374
    //   359: aload #5
    //   361: sipush #-6793
    //   364: sipush #-22885
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: pop
    //   374: iload_2
    //   375: bipush #64
    //   377: iand
    //   378: bipush #64
    //   380: if_icmpne -> 398
    //   383: aload #5
    //   385: sipush #-6798
    //   388: sipush #-21318
    //   391: invokestatic a : (II)Ljava/lang/String;
    //   394: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: pop
    //   398: iload_2
    //   399: sipush #256
    //   402: iand
    //   403: sipush #256
    //   406: if_icmpne -> 424
    //   409: aload #5
    //   411: sipush #-6786
    //   414: sipush #-18020
    //   417: invokestatic a : (II)Ljava/lang/String;
    //   420: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   423: pop
    //   424: iload_2
    //   425: ldc 32768
    //   427: iand
    //   428: ldc 32768
    //   430: if_icmpne -> 448
    //   433: aload #5
    //   435: sipush #-6791
    //   438: sipush #28172
    //   441: invokestatic a : (II)Ljava/lang/String;
    //   444: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   447: pop
    //   448: aload #5
    //   450: invokevirtual toString : ()Ljava/lang/String;
    //   453: astore #6
    //   455: ldc ''
    //   457: aload #6
    //   459: invokevirtual equals : (Ljava/lang/Object;)Z
    //   462: ifeq -> 468
    //   465: aconst_null
    //   466: astore #6
    //   468: aload #6
    //   470: areturn
  }
  
  public static void Zs(StringBuilder paramStringBuilder, byte[] paramArrayOfbyte, int paramInt, Ztlj paramZtlj) {
    String str1 = ZO();
    if (!paramZtlj.Zn(Ztz3.NO_SNIFF_HEADER) || !paramZtlj.Zn(Ztz3.CONTENT_DISPOSITION_ATTACHMENT_HEADER))
      return; 
    boolean bool1 = paramZtlj.Zj(Ztz3.NO_SNIFF_HEADER);
    boolean bool2 = paramZtlj.Zj(Ztz3.CONTENT_DISPOSITION_ATTACHMENT_HEADER);
    String str2 = paramZtlj.ZJ(Ztz3.CONTENT_TYPE_STATED);
    if (Zt1t.Zb(str2))
      return; 
    Zlg0 zlg0 = new Zlg0(str2, bool1, bool2);
    EnumSet<Zklf> enumSet1 = zlg0.ZK(Zkb.ZG(paramArrayOfbyte));
    EnumSet<Zklf> enumSet2 = zlg0.ZN();
    if (!a(-6800, 6424).equals(str2))
      paramStringBuilder.append(a(-6799, -754)); 
    if (enumSet1.isEmpty() && enumSet2.isEmpty()) {
      paramStringBuilder.append(a(-6796, 22689));
      if (str1 != null) {
        Zmcz.Zz(enumSet1, enumSet2, str2, paramInt, paramArrayOfbyte, paramStringBuilder);
        return;
      } 
      return;
    } 
    Zmcz.Zz(enumSet1, enumSet2, str2, paramInt, paramArrayOfbyte, paramStringBuilder);
  }
  
  private static void ZQ(String paramString, boolean paramBoolean1, boolean paramBoolean2, Map<Long, String> paramMap) {
    paramMap.put(Long.valueOf(Ztz3.NO_SNIFF_HEADER.permanentIndex), String.valueOf(paramBoolean1));
    paramMap.put(Long.valueOf(Ztz3.CONTENT_DISPOSITION_ATTACHMENT_HEADER.permanentIndex), String.valueOf(paramBoolean2));
    paramMap.put(Long.valueOf(Ztz3.CONTENT_TYPE_STATED.permanentIndex), paramString);
  }
  
  public static Zx_5 ZE(Zxs7 paramZxs7, byte[] paramArrayOfbyte1, byte paramByte1, int paramInt, String paramString1, boolean paramBoolean1, boolean paramBoolean2, short paramShort, Zlvf paramZlvf, byte paramByte2, byte[] paramArrayOfbyte2, String paramString2, Zmzk paramZmzk, List<Zl1r> paramList1, List<Zl1r> paramList2, List<Zl1r> paramList3) {
    String str = ZO();
    byte b = ((paramInt & 0x4) == 4) ? 3 : 2;
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.LOCATION, Byte.toString(paramByte2)), Zriz.ZG(Ztz3.STATUS_CODE, Short.toString(paramShort)), Zriz.ZG(Ztz3.MATCH, Zkb.ZG(paramArrayOfbyte2)) });
    ZQ(paramString1, paramBoolean1, paramBoolean2, map);
    byte b1 = Zd(paramZlvf.<Zvs>Za(Zzu2.XSS_REFLECTED, Zzu2.XSS_STORED), paramZxs7.Z_(), paramShort, paramInt, paramString1, paramBoolean1, paramBoolean2, paramString2, paramByte1, null);
    List<Zei8<?>> list = Collections.singletonList(paramZlvf.Zl(new Zz25(paramArrayOfbyte1, paramInt), paramList1, new ArrayList<>(), paramList2, paramList3));
    if (Zbqc.Zwu() == null)
      Zz("O3E6Xb"); 
    return new Zx_5(paramZlvf.<Zvs>Za(Zzu2.XSS_REFLECTED, Zzu2.XSS_STORED), paramByte1, paramInt, map, (List)list, b, b1, paramZmzk, paramZlvf.ZD(), paramZxs7);
  }
  
  public static Zx_5 Zr(Zxs7 paramZxs7, String paramString1, Zmzk paramZmzk, byte paramByte, short paramShort, byte[] paramArrayOfbyte1, String paramString2, String paramString3, Zlvf paramZlvf, byte[] paramArrayOfbyte2, Zl1r paramZl1r, List<Zl1r> paramList) {
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.LOCATION, Byte.toString(paramByte)), Zriz.ZG(Ztz3.STATUS_CODE, Short.toString(paramShort)), Zriz.ZG(Ztz3.MATCH, Zkb.ZG(paramArrayOfbyte1)), Zriz.ZG(Ztz3.HTML_TAG, paramString3), Zriz.ZG(Ztz3.HTML_ATTRIBUTE, paramString2) });
    Zvs zvs = paramZlvf.<Zvs>Za(Zzu2.XSS_REFLECTED, Zzu2.XSS_STORED);
    return new Zx_5(zvs, (byte)14, 0, map, (List)Collections.singletonList(paramZlvf.Zq(new Zz25(paramArrayOfbyte2, 0), paramList, Collections.singletonList(paramZl1r))), (byte)2, Zk(zvs, paramZxs7.Z_(), (short)200, 0, (byte)14), paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static Zx_5 Za(Zlvf paramZlvf, Zmzk paramZmzk, String paramString, Zxs7 paramZxs7, byte[] paramArrayOfbyte, byte paramByte, int paramInt, List<Zl1r> paramList1, List<Zl1r> paramList2) {
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.LOCATION, String.valueOf(0)) });
    int i = 0x4 | paramInt;
    return new Zx_5(Zzu2.XSS_REFLECTED, paramByte, i, map, (List)Collections.singletonList(paramZlvf.Zq(new Zz25(paramArrayOfbyte, 0), paramList1, paramList2)), (byte)3, Zk(Zzu2.XSS_REFLECTED, paramZxs7.Z_(), (short)200, i, paramByte), paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zx_5 ZP(EnumSet<Zklf> paramEnumSet, String paramString1, Zmzk paramZmzk, String paramString2, Zlvf paramZlvf, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7) {
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.CONTENT_TYPE_STATED, paramString1), Zriz.ZG(Ztz3.BROWSERS, Zrt0.Zm(paramEnumSet)), Zriz.ZG(Ztz3.LOCATION, String.valueOf(0)) });
    return new Zx_5(Zzu2.XSS_REFLECTED, (byte)18, 0, map, (List)Collections.singletonList(paramZlvf.Zq(Zz25.ZP, paramList1, paramList2)), (byte)3, Zd(Zzu2.XSS_REFLECTED, paramZxs7.Z_(), (short)200, 0, paramString1, false, false, paramString2, (byte)18, paramEnumSet), paramZmzk, Zkb.Zy(paramString2), paramZxs7);
  }
  
  public static Zx_5 Zd(Zmzk paramZmzk, String paramString, Zlvf paramZlvf, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7) {
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.LOCATION, String.valueOf(0)) });
    return new Zx_5(Zzu2.XSS_REFLECTED, (byte)17, 0, map, (List)Collections.singletonList(paramZlvf.Zq(Zz25.ZP, paramList1, paramList2)), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zsqx<Zrdb> ZQ(Zmzk paramZmzk, String paramString, byte paramByte, Zvow paramZvow, List<Zsjh<?>> paramList, Zxs7 paramZxs7) {
    return new Zx_5(Zzu2.XSS_STORED, paramByte, 0, Collections.emptyMap(), Zbxq.ZS(new byte[0], paramZvow, paramList), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void Zz(String paramString) {
    ZB = paramString;
  }
  
  public static String ZO() {
    return ZB;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'ñQþÉdÅgÆIÎßÏS¿dØ'Ó!úÍ¼¹d¶xn¼^Qð2ÐÚ;V{Ãð'µ-q/KGyPç±\\r}ÍQIÐï,ãJÝ2ÜËÍR¡÷  `!?r;*#Îvù5f, ´B>k®Ì]ØcLùêký¬l}s¿?²r©éuÒ®5»ÃÝf»=Â¾ÝßÄ§:VñF¨ØêÆE¿ð¢QÐÊfD´¾î<¾rz°£mu­ìI8ÈLÝª¢ô<Ú\\r:[°Ï®ÍÔ¤ØÚª0|sYyk0yÕCÌZ$üoFÉ«)²[ìË\\fûªë½Ã5Sf«&Åa<Wâ/è%Lòóîr\\fK|tF¤o@%4ÝÕÌSîxÕj1AwÿÜ^ôwu7´Ä°ÎéÃvV0ä««|¹÷ p.Öp;ðórÈä&°nÕÙtVâzùæ}OÎ\4*H:ZX}qhF:\\føÁWW@EÐÖ¿ÕIldJøÝ>Â«$Ñj|OWÓíÄû°¶tìÜÖøÕO¶Ø sZúõmÚâk¼û×P7û1ôñ¼úÔã¡Cså¾Ý7|5î¼÷¶ èH^Ô¤Ê­jÀ,E¯yhÛ}ï{»ûlsåÄ´:îNÎ¥ã¾QzJÃ9èç±$\\t!$òeÓÂîƇf2]¬Ã?GË¢P4Ä&á ¡8v]q}c¡ÙÙõ\\t³FÌvC<êÏmð£<3êâTBôí\\tF}M<o¼y¶Vº.6ÇÂÄæ¦¿"e~þ¼Çÿ\\fñ9%7þ\\rëgO¦Hã×­Ò3Zô¿ê£Ö£øÞrJØÄÛ)ÁýºceFêÁÖÑ¿Zè'6klR¡ LNDG\\nXä¢ÞdÁìpÞB_pèhHB¨Í\\bÁ7@\\rkÁ8¼ñ¸i7±7Tø¯¯ÄDçÎ£Õb_X¥ >)Ùx\ãR*:Ìx­8ÞU³wa([ÎPÙÍçGSó,,¬RC*\\t"W[¦|QZíÄìk7NÍY5Ô@ØJèCÞ6ðÝZáxéÙL;­Wºah0m1Ætá¬J§Òæ7ût$Iú"7|*ö^ÅZ9AgvÈÿxÄ5éÂEý,#à6qVGaÂó_¢¾nŒ_c[+"%7VG¢\\f(¥ú·Å\\b1ÖR®6÷-yZÑ|=9#ôÄ´jÊæ½Üg&Ê'Ïûr)éÉ7{rÚ×uf©;(ú¸\\t`eà¥ÉÿPFÃÅ,éÓï×nòGérÙã»ÈÎÞFD0÷7Í"10å£Z&|«*¦ì½/@Kãæ\\b÷zá'Å¿sÈï:´7ª#Éef>²¸Í:{MP\\rM2úf¡4ýålèp¸æ[ïk3-:õa:FÞeËÓÜØý§CU½ðºyíå¢ïhDë±\\nØ®ÓÕ8¸È{{Å/uìëf­û±pÝeNùÆC]ØË"CfÒàøÂ1½íq'î¬Þ[KmÂ>ÓNM¢û3EÚ\\b»\\tK¶Ãö«¨ÙD n¯ì§xÑ¥YN¢*üdRî\÷ÖN!!ÜÍ83âPd¿ò«/ôØkI}F,Ur`§ò~ÿÉ¾ÈÖÛÇ!Ä>¯pyo×"þmòµû+ÜÌo$fRiaà eyùÆyl)ÔÙ=´ãó¤<?Utás®2.S_ïAÐ:£* ÙW¶¸øaàP±ö¼\\fÙV8dîH÷rýF¿;IDÉb"^üGnÎs]¬2¶çiäèãC}%¨FpxU!xOÇÇ~E1<=ÏÛÆWVFh\\r(#µÁz¹ðáS2ß«Z»zEõb¡SS³=´\\nÓ¤îÖ(k³&¨2¸ÌhøÇàäÆü8Ív(jÔ~/öu6,»©=M®·«SrØx°:ñRaÊõB4ð» §6¥é'séÓ}$Ùªð>ÎÀ±@ìª#<öyðLï#+¥Z!ø\*]ä5Æ«¿Ï=æïþ~UÖ±hxû¥'qq\\bçdjR]<w;,{L\\fÙ©Î\\bAÎ¢VÙ@x[äþ¯!$Â¥kø){aä>¼<Î\\rµ* 0IÒ´yÿw&EQ>ÿO_(8íùîAú7 2ÈQp*L¥1ÑÖLóxË"È!}@Ù7°D Xã³çPR&@@tö¦y·Ú[¥Ïñù|Ã*÷âÄ«)¶á0^Yª\\n;dY ²jú3L\um¤ëê_cÇ¤$}>Ò©ÑS£¡ç,JËøÀ|hn¾µÁK\\f;b§Ã^ävïá¨{ß±Û2oM!²ëé«p{»ÖÞwa$3ULh5¦6äTÖT3)ñE&nñÁÊ6áÝ,ágîÏ\\b\¤3ÃtñÔ#ØÓ4/¿!®$&¤÷ {t®jdË1MÉPA¼A$ôÂ·ôEøÏ*¸äDßæÏqG/è£åRÚ`;°x4¹÷õ¦çíÅx¸Åk\\tGí;ßg\\tWDT½ùå ñ½=¸ºnRótØ¬ðöÿoÛûóÅ¹ón.õ3@éÉ=ÑÆH¼íòÜùdá&Rx\\n3ìÁ¹wº¥ý)\\tWÉíwÒ`øLmãÝ$+7ã¡áWÔã7mÖZ'Ï<väàh¶+ÔõümÙ­sÓ&Ð}Òã¤è\\f=Ëß}ïa]¡¶as,ê:\\nô?½ÜÐ!Ð;TÍÈ*(:ó®^¦Ã²[ãa§Ö¹êiO?®>wGé:^åäKÅ¶þþñ|M¤j÷¢kþ\\f~hÜ'Æãnø1åérÍó¨É©¸,&Â@vµÝ\\b4«~R4-\\n1Ëj \\f?íÑpJWÝWÐëpÁ+ÿæ@Zö\\tÐ}÷?$»pYÙC¡q>lC5àM¾WZú}ú©PæöªñØ+ø^ ¹W~xtTÑDD2ö0âgÜßRU«­XãEËI,Ö$é·yN6zËï!Ñá.}R·öE`òÊiªÃ:ëÅ'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #57
    //   21: istore_1
    //   22: invokestatic Zz : (Ljava/lang/String;)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #32
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 148
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
    //   72: ldc '`e`OUØPq¡ Í)D×@×Öß w¼ÇèH¨±=K´n(¸6#Hy¥mÒ·²s.Æ«8;)µAë>úvH6Cõ@S½ÓÝë"XéÒ¯\\fÿÕåae\\f%9OùÙkBÀÙ 6nXTwê7Î!3;lÔ¤&,tÇù÷_ðk8ía«8#ÂæNî,ô\\t¢¹v¥ZeY '
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: sipush #166
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #85
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
    //   134: putstatic burp/Zx_r.a : [Ljava/lang/String;
    //   137: bipush #16
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zx_r.b : [Ljava/lang/String;
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
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #96
    //   218: goto -> 248
    //   221: bipush #109
    //   223: goto -> 248
    //   226: bipush #83
    //   228: goto -> 248
    //   231: bipush #125
    //   233: goto -> 248
    //   236: bipush #89
    //   238: goto -> 248
    //   241: bipush #107
    //   243: goto -> 248
    //   246: bipush #68
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 104
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE57F) & 0xFFFF;
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
      char c = '¦';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx_r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */