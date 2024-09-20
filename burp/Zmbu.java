package burp;

import java.util.EnumSet;

public class Zmbu extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmbu() {
    super(EnumSet.of(Zzqz.VARIANT, Zzqz.FLAGS));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: aload #4
    //   2: getstatic burp/Ztz3.REDIRECTION_METHOD : Lburp/Ztz3;
    //   5: invokevirtual Zq : (Lburp/Ztz3;)B
    //   8: istore #12
    //   10: invokestatic Zq : ()Ljava/lang/String;
    //   13: aload #4
    //   15: getstatic burp/Ztz3.REDIRECTION_TARGET : Lburp/Ztz3;
    //   18: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   21: astore #13
    //   23: astore #11
    //   25: new java/lang/StringBuilder
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: astore #14
    //   34: aload #14
    //   36: sipush #-19737
    //   39: sipush #7597
    //   42: invokestatic a : (II)Ljava/lang/String;
    //   45: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload #14
    //   51: aload #6
    //   53: iconst_1
    //   54: iconst_1
    //   55: invokestatic ZM : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload #14
    //   64: sipush #-19733
    //   67: sipush #-17838
    //   70: invokestatic a : (II)Ljava/lang/String;
    //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: iload #12
    //   79: tableswitch default -> 195, 0 -> 108, 1 -> 135, 2 -> 155, 3 -> 175
    //   108: aload #14
    //   110: sipush #-19714
    //   113: sipush #-4504
    //   116: invokestatic a : (II)Ljava/lang/String;
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: aload #11
    //   125: ifnull -> 205
    //   128: iconst_1
    //   129: anewarray burp/Zbqc
    //   132: invokestatic Zr : ([Lburp/Zbqc;)V
    //   135: aload #14
    //   137: sipush #-19726
    //   140: sipush #32483
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: aload #11
    //   152: ifnull -> 205
    //   155: aload #14
    //   157: sipush #-19740
    //   160: sipush #-31786
    //   163: invokestatic a : (II)Ljava/lang/String;
    //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: aload #11
    //   172: ifnull -> 205
    //   175: aload #14
    //   177: sipush #-19734
    //   180: sipush #17847
    //   183: invokestatic a : (II)Ljava/lang/String;
    //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload #11
    //   192: ifnull -> 205
    //   195: iconst_0
    //   196: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   199: iload #12
    //   201: i2l
    //   202: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   205: aload #14
    //   207: sipush #-19713
    //   210: sipush #-10233
    //   213: invokestatic a : (II)Ljava/lang/String;
    //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: aload_1
    //   221: getstatic burp/Zzu2.OPEN_REDIRECTION_REFLECTED : Lburp/Zzu2;
    //   224: if_acmpne -> 292
    //   227: aload #5
    //   229: invokevirtual Zd : ()Lburp/Zkcp;
    //   232: invokeinterface Zub : ()Lburp/Zll7;
    //   237: invokeinterface Zsf : ()Lburp/Zstu;
    //   242: invokeinterface Zis : ()Ljava/lang/String;
    //   247: astore #15
    //   249: aload #14
    //   251: aload #15
    //   253: invokestatic ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   256: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   259: aload #14
    //   261: sipush #-19720
    //   264: sipush #-17354
    //   267: invokestatic a : (II)Ljava/lang/String;
    //   270: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: aload #14
    //   276: aload #6
    //   278: iconst_1
    //   279: iconst_0
    //   280: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   283: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: pop
    //   287: aload #11
    //   289: ifnull -> 409
    //   292: aload_1
    //   293: getstatic burp/Zzu2.OPEN_REDIRECTION_STORED : Lburp/Zzu2;
    //   296: if_acmpne -> 402
    //   299: aload #5
    //   301: invokevirtual Zx : ()Lburp/Zrp9;
    //   304: invokeinterface Zub : ()Lburp/Zll7;
    //   309: invokeinterface Zsf : ()Lburp/Zstu;
    //   314: invokeinterface Zis : ()Ljava/lang/String;
    //   319: astore #15
    //   321: aload #14
    //   323: aload #15
    //   325: invokestatic ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   328: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   331: aload #14
    //   333: sipush #-19749
    //   336: sipush #-22631
    //   339: invokestatic a : (II)Ljava/lang/String;
    //   342: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: pop
    //   346: aload #14
    //   348: aload #5
    //   350: invokevirtual Zx : ()Lburp/Zrp9;
    //   353: invokeinterface Zvs : ()[B
    //   358: invokestatic ZG : ([B)Ljava/lang/String;
    //   361: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   364: aload #14
    //   366: sipush #-19742
    //   369: sipush #24703
    //   372: invokestatic a : (II)Ljava/lang/String;
    //   375: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: pop
    //   379: aload #14
    //   381: aload #5
    //   383: invokevirtual Zx : ()Lburp/Zrp9;
    //   386: invokeinterface ZvM : ()[B
    //   391: invokestatic ZG : ([B)Ljava/lang/String;
    //   394: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   397: aload #11
    //   399: ifnull -> 409
    //   402: iconst_0
    //   403: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   406: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   409: aload #14
    //   411: sipush #-19727
    //   414: sipush #27394
    //   417: invokestatic a : (II)Ljava/lang/String;
    //   420: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   423: pop
    //   424: aload #14
    //   426: aload #13
    //   428: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   431: aload #14
    //   433: sipush #-19732
    //   436: sipush #-1130
    //   439: invokestatic a : (II)Ljava/lang/String;
    //   442: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   445: pop
    //   446: iload_2
    //   447: tableswitch default -> 551, 1 -> 472, 2 -> 492, 3 -> 512
    //   472: aload #14
    //   474: sipush #-19744
    //   477: sipush #24462
    //   480: invokestatic a : (II)Ljava/lang/String;
    //   483: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: pop
    //   487: aload #11
    //   489: ifnull -> 551
    //   492: aload #14
    //   494: sipush #-19743
    //   497: sipush #25846
    //   500: invokestatic a : (II)Ljava/lang/String;
    //   503: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: pop
    //   507: aload #11
    //   509: ifnull -> 551
    //   512: aload #14
    //   514: sipush #-19716
    //   517: sipush #-19751
    //   520: invokestatic a : (II)Ljava/lang/String;
    //   523: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   526: pop
    //   527: iload_3
    //   528: bipush #16
    //   530: iand
    //   531: bipush #16
    //   533: if_icmpne -> 551
    //   536: aload #14
    //   538: sipush #-19731
    //   541: sipush #4532
    //   544: invokestatic a : (II)Ljava/lang/String;
    //   547: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   550: pop
    //   551: iload_3
    //   552: iconst_1
    //   553: iand
    //   554: iconst_1
    //   555: if_icmpne -> 621
    //   558: aload #6
    //   560: invokestatic ZS : (Lburp/Zefg;)Z
    //   563: ifeq -> 578
    //   566: sipush #-19739
    //   569: sipush #-7763
    //   572: invokestatic a : (II)Ljava/lang/String;
    //   575: goto -> 587
    //   578: sipush #-19741
    //   581: sipush #-9656
    //   584: invokestatic a : (II)Ljava/lang/String;
    //   587: astore #16
    //   589: aload #14
    //   591: sipush #-19715
    //   594: sipush #1099
    //   597: invokestatic a : (II)Ljava/lang/String;
    //   600: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   603: aload #16
    //   605: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   608: sipush #-19717
    //   611: sipush #-4458
    //   614: invokestatic a : (II)Ljava/lang/String;
    //   617: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   620: pop
    //   621: iload_3
    //   622: iconst_2
    //   623: iand
    //   624: iconst_2
    //   625: if_icmpne -> 643
    //   628: aload #14
    //   630: sipush #-19718
    //   633: sipush #-26624
    //   636: invokestatic a : (II)Ljava/lang/String;
    //   639: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   642: pop
    //   643: iload_3
    //   644: bipush #8
    //   646: iand
    //   647: bipush #8
    //   649: if_icmpne -> 667
    //   652: aload #14
    //   654: sipush #-19736
    //   657: sipush #-11749
    //   660: invokestatic a : (II)Ljava/lang/String;
    //   663: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   666: pop
    //   667: iload_3
    //   668: iconst_4
    //   669: iand
    //   670: iconst_4
    //   671: if_icmpne -> 689
    //   674: aload #14
    //   676: sipush #-19735
    //   679: sipush #-15168
    //   682: invokestatic a : (II)Ljava/lang/String;
    //   685: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   688: pop
    //   689: aload #6
    //   691: invokeinterface isEmpty : ()Z
    //   696: ifne -> 703
    //   699: iconst_1
    //   700: goto -> 704
    //   703: iconst_0
    //   704: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   707: sipush #-19719
    //   710: sipush #-8491
    //   713: invokestatic a : (II)Ljava/lang/String;
    //   716: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   719: aload #6
    //   721: iconst_0
    //   722: invokeinterface get : (I)Ljava/lang/Object;
    //   727: checkcast burp/Zxtl
    //   730: invokeinterface ZTr : ()Lburp/Zs66;
    //   735: astore #16
    //   737: aload #16
    //   739: getstatic burp/Zs66.COOKIE : Lburp/Zs66;
    //   742: if_acmpne -> 760
    //   745: aload #14
    //   747: sipush #-19728
    //   750: sipush #24474
    //   753: invokestatic a : (II)Ljava/lang/String;
    //   756: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   759: pop
    //   760: aload #16
    //   762: getstatic burp/Zs66.HEADER : Lburp/Zs66;
    //   765: if_acmpne -> 783
    //   768: aload #14
    //   770: sipush #-19721
    //   773: sipush #-11430
    //   776: invokestatic a : (II)Ljava/lang/String;
    //   779: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   782: pop
    //   783: aload #14
    //   785: invokevirtual toString : ()Ljava/lang/String;
    //   788: areturn
  }
  
  public String Zt(Zvs paramZvs, byte paramByte, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg) {
    // Byte code:
    //   0: invokestatic Zq : ()Ljava/lang/String;
    //   3: astore #7
    //   5: new java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #8
    //   14: iload_2
    //   15: tableswitch default -> 95, 1 -> 40, 2 -> 60, 3 -> 80
    //   40: aload #8
    //   42: sipush #-19722
    //   45: sipush #-19668
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload #7
    //   57: ifnull -> 95
    //   60: aload #8
    //   62: sipush #-19725
    //   65: sipush #12548
    //   68: invokestatic a : (II)Ljava/lang/String;
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload #7
    //   77: ifnull -> 95
    //   80: aload #8
    //   82: sipush #-19729
    //   85: sipush #20594
    //   88: invokestatic a : (II)Ljava/lang/String;
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: iload_3
    //   96: iconst_1
    //   97: iand
    //   98: iconst_1
    //   99: if_icmpne -> 168
    //   102: aload #8
    //   104: sipush #-19724
    //   107: sipush #-20437
    //   110: invokestatic a : (II)Ljava/lang/String;
    //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload #8
    //   119: aload #6
    //   121: iconst_1
    //   122: iconst_0
    //   123: invokestatic ZM : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload #6
    //   132: invokestatic ZS : (Lburp/Zefg;)Z
    //   135: ifeq -> 153
    //   138: aload #8
    //   140: sipush #-19723
    //   143: sipush #-10917
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: pop
    //   153: aload #8
    //   155: sipush #-19730
    //   158: sipush #-18111
    //   161: invokestatic a : (II)Ljava/lang/String;
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: iload_3
    //   169: iconst_2
    //   170: iand
    //   171: iconst_2
    //   172: if_icmpne -> 190
    //   175: aload #8
    //   177: sipush #-19738
    //   180: sipush #-15197
    //   183: invokestatic a : (II)Ljava/lang/String;
    //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload #8
    //   192: invokevirtual toString : ()Ljava/lang/String;
    //   195: astore #9
    //   197: ldc ''
    //   199: aload #9
    //   201: invokevirtual equals : (Ljava/lang/Object;)Z
    //   204: ifeq -> 210
    //   207: aconst_null
    //   208: astore #9
    //   210: aload #9
    //   212: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #33
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' ¥êuÛ"KªÆ»]Rü°Ð`W°jçrÅG¯¹!÷±C?ÿl÷_7 D\\n(«yÞ3Ý&½IÓ¿,cjLÛ¡µâFI%àrÎÈR¬¤h8gHÜ;fýéX=§n¥s/fÄ2}ª<Aì^ SabøÆ¾îh@ÝD¦È½kÃ¨LIVí¥e8O6³Pâ!ô"º§!ÛVdbÙ,roÉxcðZï·]¢¾Âµ&¶þp@1ºZíLº·»«Ì!fx?©°pI4Óì.éÈ%9ª\\rø'mº,§Ä=Þ2QÃÜqÌGøÍèÃ{\\b¨þEqÐÏ¢Ô%)&îr¦]åGI¿ÖáGE¤\\f¤øÛÍr.ÅÍjp¦g²\\b*ªYSkÈsæø¾QAæ,ôIH7n±>ËHuRé\\r¹SºO°éºô [\\fJ×Ô\\tJ¶ôNûÁ«²Ô`%tlÃ«? \\r\ßY=7G·sÇKÙS·c6c$¸Ýø=¶i]`vrÉ*k­Kðzú¾%¹¤lôÌXª\\nËNëëGãôËû\\bßëÃùÏÊfrøDWlÏo`6Fdª]E:\\t*ªµKÊžA?é«cÄJ¸ÞÓA³Ã<'éÔ¡8MmÍ;ïóLÊû_ìâôËæÈz¬¯çe^¶ÒuIªE-ß;LN1ÈI¥Ç}g·W\d\\np«/[ï\\r`©|}{ÜvCw[¥}÷ÚH1péí±Ó»¥<^=tî¦÷_ea?97ûð\?vhÂVÅûT(¯Tlî4õ¯Q@Óõd]Nºø±cúô(Ümû+öAV:Â%Ç2=uKCÒLÌ¡¼¿]LÎÈéøI® )òÀ[Ð¯LM¯Åá'_ë2h;ïâ«`#:Ø×¹B\\t7#Ä@9"·;í<\\fæ9îÆÏÈì<3qÆúHÿKkà\\fg¢:À?-\\rúÉ>1º´¡±isÅPh#¼ë¤wzQÇrQÜÜÈñéòËG:ì<Ê Ó-8Ôjþ9GYFª3 ÅôS;ùï_y¿ ðè¨"¶­ñãÀã Çªºoÿ7Ø<»óþ S(è»#×þgKºÿ­±Q}iFÂô\\rÑq±ZläNHH/µQ¶LÌzØ¦xë>í(.Bxt:Ã¾ÑA~\\fbÑiéWO¬¯UñAN&?MÁÚvÐÖ;N%ýæ·ýhöÊÒÃ#ªz´gsz=,áFT¥ÌWÄ|/K°ÉÄºè)è=pF9ø+~@4!=o"IÛ$M8mæÈ/\ñ]r¤3víÊ"Yä±½Ø0Ù¯7»÷MrTBYÄº2Z¬Ākz©vp ðÿ eÓÖ\\bª]§kq!{ÃG{¸êruZ12^%Ä}ÒNÍs¾sþd\\rZá3ØÕ@§9²JóÂîqÞ\\bv3_O2¼²[Ê·ù¹&M¬A|¿~Në¼hèò¢=©Ù/Íâ+ÎÊ8ØÓ4ÆÎ¹Ç©Ü«x }ûé×ô+·äøUÙ°Ç4nZCN¡¶T^¥(e¡ê'¼A ¹E;5-:£7ÿkw\ú2Ö1±Ç¿Px{2ÐG¬ÞÉWxÆã®A/Ï£ \\tyÊ£Xðe,æC¸õëÀĀcÂ{!#r5ðäxî[ \\b!Ò^(»YÄ{ù#;áOÔz0Êcqx±J"Ö'Õ=¯Ú\\nÌûb% ÐîìK¡ÐÙ]`¶=38ævïÀØËaM<eùb%èµHBÅÔd:øÁiBE A½ùº"»+fí2@89jeß>T&N¾×ÁmX¿û[|á5«ã¦>®¸CfÊ¿{a³÷~r1 mÀ»[CRîåÎ]!}$'Mµ%æÅWBQ¬aÖÂ%Ìð¨\\n,òË¿ð_iF+$·2À¾¬¡~ ó§ýT½ËZ#k rûÞ¿OñúÓÁÙb¤ Â5¥?¿fXRÒË_õ}{~Ëùò;ÁgvY3-ÎÕûâüÚm~>f%_n·ð38Ñâ*78Ì\\b;y¥uàrÂ× Ûµèä,Ëàû!²¤àÊx¤:³ZV5ôÚE¨E/'V[W»´?p»\Ñ; f¿,oHJÎ|6Kßò©]Wý"Ý6ºÎ¼õ¦¾^»+@¸·ZÏ¡JWÚAb9á"Y:Ëdîdn³.$ú,+ñ9ç¦ä9¡³ÛDäíÑèàÁcU8ãk|\\f¼c}8úÃYêX{Èm 6|§ÃÝ:Ñþ¤æûQÎú$UòKv}Qê>Â¤K¶4Ãðµ¥ ¯<2ùÓõ=¹þ¤Úě7áñEr\\fX¤£Û¦rPÐrfª\\r¤£Äær\kø-oüXÿµÙÚO/²ä«(j\\bõnæÅKòü:"\\fä6#ì<i(«¶KZ(gòÌÛc\\r¸Ð¦;æî¬ãÖE ææ°¨bj° :n.²í/º\\b=Me²æI¾9óßl¹\\bEá\\rj2çÃX(Ç¾É}Ø<±WxrTÊ\\nO£n©å4+#n.ÅR"×Ðaxõ|ZÄ\\bqîÃj¹,J+[[C<ýµôþ¸P\\tª§ÜùªM-óZHºU^Bsö ß"(N]d§«8ä áò£?õq­¼ËÍjs¡3·zð²©¬f·µºAg£Â}Á&æ_/g#%å7iºp_Abÿy)l\Òª%c@B=¯\\f×ß"ËÝsRãRVùÎ8ë)<qq£¬àz=Ú¯ã\\fi\\tñqýÛWöõ3\Ý ¿ìRÂc@áV2pÙÓÖÐ33ð¾Jp¶,[ùLÙvC°ë¦5)¼tÛ$°cû»RIcÚ-Xø­pS 3ì.áß¶ý´kÌaÆe\\bT)Á3{GM~vXºI`o'æõÞL>í³%\\bWlï¨´Þ\\r¡ö+GD;e@ÕW!+<gJÎ"s,ÄpsØ2Ê&­*ð©{×ÐñLlØôD\©<Àë'JDÔ÷J\\t"=´}Á®t)t²6²³û§.WâÉÜÿù.=X\\bÒÍf{mi»qÙ¢-P%é¥56Vh@çâ)ÆýÁ¸f>;ÖÒÆ ¨ áRVR ìiv¾\\rU¥IÛ)*í\"lGImä¥®L©ª9¨²iÆM´`Kâ{¦:½LÀcdÕ÷^%´»gzß?ÿµ>^(²¨c1Õ£°9ß=¸¶B"¨PJíïy7ãHøUöOò/`Mq?«X>Nrj´¿ÿjNïÀÔªÐÔTTuæýW'';Wč§*ã<0#Aªgåg7ä4UmÃéÏøýîËþó)QA!ô¼äH2+ÐMÔ#²fal¶Fâ59[bw¨-HÒ;öJc³#ùùjÅ¨Õ²ß"W&¹=¢¾Nöµ,mv;E&RW_:7QÅEî¤Ó\¸½}2B6`_äÓï6Þb|dM²lPnÈÜ(ggAçåfÄ*:FweáTgúäÇ1ò¢ÙÀZ?u%´Ú|B\GÅÕI×Aä\\baÍôZ¡N Ðàÿ4­®itù {ÖH¥.sç{$yÚÒª@{·ªÅ_[GYCú%º´Ø©7Cl~ö\\n\\n;E\i«)ÂZUyÞ*^ÅÍ/@ÿ Ú×!P\mñÜ'çÀoÑG¿ªèªĐãwk!V2ïî²_v`ÆÞ0KBè¸a¼0F±xR§lÆª¦ÆÝPø\7y¶;I&YÑVÍZ^¹.`Ö³YG\ý% pÝRqÆk L°\\fîX\"w)ìÝÇÃ=àÕ.£ß»Þ¤¡ãUfNÓäkÉõ¯bX*'"JCóTâiæÕÀMÃ2ÚkJgrÊFë?í OÕð_Èj5`ôêÌ/;5Óß)3(S{;öcºÃ&ìF¦+]¾ËÎ³U7»¢PV<ýõÛñÆJ9*@?ú)^[úâQí!î­ÉÐöHX·oyþßûw>byØ{-`Y¸ČÇ>ï¾±s K¬&GÍ2ç5yÏkÍªÅþ¤ÙÔãY½U#EV ¸IjUe¾3rÍ-¶|ÃòÎ+|AhÛÉUnWt8èüZ~?~Î3+»æ¾BïÕ4iüNý·{Â­ê+¬ùU]éØÕUCG2KïJÿ0¬ÎøzÛ \\bn^¹óÓaá±pIé8.ÎDÎEù'mGQTÏeÕ:Î¥>RlVÝ7ûD·ïêÔ8mQÒFÙ­ö¨áû¿-­ÛðFÞ§æ`ÒúÓ®Ð\\t·]Jú7EÛÅÌOZF»lDayT/*&1¦.n+ q©KŒq=;}Î7[5Ñ·[S=Ì <B÷_=§êV©=½ê´Ctã^"n¬^?NôC³ Áñsj{0¨$ü{, ­Â&C\nÙMýËn{\\t\\tÆ÷Hô?à)ÑeÎgP\\rÇ*Ù¼Åþúº½$¬U&PßQNIù¿f$g²ÜØ?¹XÖM®wíã·ÌÞêò'ÐâÅ1DÃãÚC?KøÙ#Ù~3Ò8mä¼­,?'>{¯õ¦í@jhÎ"èÎ§¯¯)z\\nJ×ìTê9£:-B´>¡¯I5ë§¯S+ÐÛÛÙæ¯?¼lmÃI3j²\\brç;\\nÑ ¦\\rSÊ`ÀRþWÅùÒ$ªrHjuu1ÇÑ½­? TºãbKÈþÂÁÕ4·Û|ÇjDz&±·\\r8°bú£4÷±Q×¡^ír'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #30
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc '<\ö3Zi©ÜÆMQüâROF|Ýs¶ÍlxÛ@ìIs/a¨9Æã¶ëÛ¯^ë+>÷à²ÐS9@ÄØx×7°'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #38
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #97
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zmbu.a : [Ljava/lang/String;
    //   132: bipush #33
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmbu.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #104
    //   214: goto -> 243
    //   217: bipush #28
    //   219: goto -> 243
    //   222: bipush #14
    //   224: goto -> 243
    //   227: bipush #55
    //   229: goto -> 243
    //   232: bipush #80
    //   234: goto -> 243
    //   237: iconst_4
    //   238: goto -> 243
    //   241: bipush #8
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB2FB) & 0xFFFF;
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
      byte b1 = 7;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmbu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */