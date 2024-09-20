package burp;

import java.util.EnumSet;

public class Zme7 extends Zmvg {
  private static final Zxll Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zme7() {
    super(EnumSet.of(Zzqz.VARIANT));
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return Zr.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic Zl : ()[Ljava/lang/String;
    //   3: astore #11
    //   5: new java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #12
    //   14: iload_2
    //   15: iconst_1
    //   16: if_icmpeq -> 23
    //   19: iload_2
    //   20: ifne -> 233
    //   23: aload #12
    //   25: sipush #21065
    //   28: sipush #16643
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: iload_2
    //   38: iconst_1
    //   39: if_icmpne -> 54
    //   42: sipush #21061
    //   45: sipush #-13893
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: goto -> 63
    //   54: sipush #21087
    //   57: sipush #26795
    //   60: invokestatic a : (II)Ljava/lang/String;
    //   63: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: sipush #21068
    //   69: sipush #-24233
    //   72: invokestatic a : (II)Ljava/lang/String;
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: sipush #21059
    //   81: sipush #-25983
    //   84: invokestatic a : (II)Ljava/lang/String;
    //   87: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: pop
    //   91: aload #4
    //   93: getstatic burp/Ztz3.REQUEST_HEADERS : Lburp/Ztz3;
    //   96: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   99: astore #13
    //   101: aload #13
    //   103: ifnull -> 124
    //   106: aload #12
    //   108: aload #13
    //   110: ldc '§'
    //   112: ldc '\\n'
    //   114: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   117: invokestatic ZY : (Ljava/lang/String;)Ljava/lang/String;
    //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: aload #12
    //   126: sipush #21086
    //   129: sipush #23769
    //   132: invokestatic a : (II)Ljava/lang/String;
    //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: aload #4
    //   141: getstatic burp/Ztz3.RESPONSE_CONTAINS_CANARY : Lburp/Ztz3;
    //   144: invokevirtual Zj : (Lburp/Ztz3;)Z
    //   147: ifeq -> 184
    //   150: aload #12
    //   152: sipush #21071
    //   155: sipush #17888
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: aload #4
    //   166: getstatic burp/Ztz3.CANARY : Lburp/Ztz3;
    //   169: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   172: invokestatic ZY : (Ljava/lang/String;)Ljava/lang/String;
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: aload #11
    //   181: ifnonnull -> 213
    //   184: aload #12
    //   186: sipush #21070
    //   189: sipush #24154
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: aload #4
    //   200: getstatic burp/Ztz3.STATUS_CODE : Lburp/Ztz3;
    //   203: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   206: invokestatic ZY : (Ljava/lang/String;)Ljava/lang/String;
    //   209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: aload #12
    //   215: sipush #21056
    //   218: sipush #526
    //   221: invokestatic a : (II)Ljava/lang/String;
    //   224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: pop
    //   228: aload #11
    //   230: ifnonnull -> 602
    //   233: iload_2
    //   234: iconst_3
    //   235: if_icmpne -> 355
    //   238: aload #12
    //   240: sipush #21058
    //   243: sipush #2089
    //   246: invokestatic a : (II)Ljava/lang/String;
    //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: pop
    //   253: aload #6
    //   255: iconst_0
    //   256: invokeinterface get : (I)Ljava/lang/Object;
    //   261: checkcast burp/Zxtl
    //   264: invokeinterface ZTs : ()Ljava/lang/String;
    //   269: astore #13
    //   271: aload #4
    //   273: getstatic burp/Ztz3.CANARY : Lburp/Ztz3;
    //   276: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   279: astore #14
    //   281: aload #12
    //   283: aload #13
    //   285: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: bipush #61
    //   290: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   293: aload #14
    //   295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: sipush #21057
    //   301: sipush #6084
    //   304: invokestatic a : (II)Ljava/lang/String;
    //   307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: aload #14
    //   312: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: sipush #21085
    //   318: sipush #-18667
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: pop
    //   328: aload #6
    //   330: invokeinterface size : ()I
    //   335: iconst_1
    //   336: if_icmple -> 350
    //   339: aload #12
    //   341: aload #6
    //   343: invokestatic Zs : (Lburp/Zefg;)Ljava/lang/String;
    //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: pop
    //   350: aload #11
    //   352: ifnonnull -> 602
    //   355: iload_2
    //   356: iconst_4
    //   357: if_icmpeq -> 365
    //   360: iload_2
    //   361: iconst_5
    //   362: if_icmpne -> 444
    //   365: aload #12
    //   367: sipush #21066
    //   370: sipush #32230
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   379: pop
    //   380: aload #4
    //   382: getstatic burp/Ztz3.CANARY : Lburp/Ztz3;
    //   385: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   388: astore #13
    //   390: aload #12
    //   392: sipush #21084
    //   395: sipush #1292
    //   398: invokestatic a : (II)Ljava/lang/String;
    //   401: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   404: aload #13
    //   406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   409: sipush #21063
    //   412: sipush #27994
    //   415: invokestatic a : (II)Ljava/lang/String;
    //   418: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   421: aload #13
    //   423: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   426: sipush #21069
    //   429: sipush #-14242
    //   432: invokestatic a : (II)Ljava/lang/String;
    //   435: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   438: pop
    //   439: aload #11
    //   441: ifnonnull -> 602
    //   444: iload_2
    //   445: iconst_2
    //   446: if_icmpne -> 453
    //   449: iconst_1
    //   450: goto -> 454
    //   453: iconst_0
    //   454: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   457: iload_2
    //   458: i2l
    //   459: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   462: aload #12
    //   464: sipush #21060
    //   467: sipush #25448
    //   470: invokestatic a : (II)Ljava/lang/String;
    //   473: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   476: pop
    //   477: aload #4
    //   479: getstatic burp/Ztz3.UNKEYED_PARAM_IS_UTM_CONTENT : Lburp/Ztz3;
    //   482: invokevirtual Zj : (Lburp/Ztz3;)Z
    //   485: ifeq -> 500
    //   488: sipush #21064
    //   491: sipush #29659
    //   494: invokestatic a : (II)Ljava/lang/String;
    //   497: goto -> 516
    //   500: aload #6
    //   502: iconst_0
    //   503: invokeinterface get : (I)Ljava/lang/Object;
    //   508: checkcast burp/Zxtl
    //   511: invokeinterface ZTs : ()Ljava/lang/String;
    //   516: astore #13
    //   518: aload #4
    //   520: getstatic burp/Ztz3.CANARY : Lburp/Ztz3;
    //   523: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   526: astore #14
    //   528: aload #12
    //   530: aload #13
    //   532: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   535: bipush #61
    //   537: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   540: aload #14
    //   542: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   545: sipush #21063
    //   548: sipush #27994
    //   551: invokestatic a : (II)Ljava/lang/String;
    //   554: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   557: aload #14
    //   559: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   562: sipush #21062
    //   565: sipush #-5475
    //   568: invokestatic a : (II)Ljava/lang/String;
    //   571: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   574: pop
    //   575: aload #6
    //   577: ifnull -> 602
    //   580: aload #6
    //   582: invokeinterface size : ()I
    //   587: iconst_1
    //   588: if_icmple -> 602
    //   591: aload #12
    //   593: aload #6
    //   595: invokestatic Zs : (Lburp/Zefg;)Ljava/lang/String;
    //   598: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   601: pop
    //   602: aload #12
    //   604: invokevirtual toString : ()Ljava/lang/String;
    //   607: areturn
  }
  
  private static String Zs(Zefg<Zxtl> paramZefg) {
    StringBuilder stringBuilder = new StringBuilder(a(21067, 28488));
    byte b = 1;
    String[] arrayOfString = Zmtk.Zl();
    while (b < paramZefg.size()) {
      stringBuilder.append(((Zxtl)paramZefg.get(b)).ZTs());
      if (b < paramZefg.size() - 1)
        stringBuilder.append(a(21080, 9792)); 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ytYR¬µ Núk*óäO<a@0³µ"¾|dø\\b÷yâaÙÇ\\rfaÏB(<fb~#¸ÀJWs1°\\fÚ¨b1î\\b/Ø÷/\\rnb#íV¬ßº×wdªTÇÕyr¡xþ1»f8·\\f$Ó]yåA0~eÒc¹Lª#É«CªçÔr]­æ>9»\\fc©,¢RÏ=iüCE"É+¦«*9ê1¹}ya¾ôæÖ\\bå{6òÇþ®EZ\\bÉÓòÁ £Ç`Eäö£%A¿Î2Ð¿`ðê.âÍâ¿3TÏYK´'±[7$PW*×¡½yÐ° ÀõgkJ8ò'¨foËI:geP\\frð·ppU@·°Z'ç¼¬®¹ÙBV±§pùkfÁIU|ÜÛ±p«ìAdSA\5ËI"¼,NIÚ¬·yYÒJùö¼\\r´åÓèW.ê¥Ý\m\\rfÎÁ$ó¡æ}8HJ\\bÁ¶ÝÍ·ýU¬#ÚP¢qÛG»®KäáÉßm×Ò¾yV¥Y¨ê2àXñâüïÒ]Î[R~`H|]fÐ 83ó«ÌKæêÇMX*Ì\\t«¸@RVüÔÿ1Ì^·ïm"ü|ÒÒA¨b³¼ð´jôÅÞ"»}o÷j©$k=UÜøÀm;ãø²ß\\tUô¡a8åöJc¾ÖLVé_:«ÝºüMþíÎ¤OA*6Ä`\\f7ä¦D±Ù9ÊBß±"¬hü¤Å·¿{Xÿ1?eTùºwfha² ¼}y=V½ÜT¶/ø2¿ATć|uÛp·ìÛd +\~Íól+n1#\Ï¡x¾åöñâÆ­Ìx:ÀvUë5Âð9]\\t>ÚÈÇ2Ó©|T·£ÚMí:P;± +Ë¾?H·£swAµâc·s«Zý6ó\ÕPvÐ$¿_ÞÃµp\\rD/ã;,V×Ý|w±9iî#~AÞÿ7Id·PKJ@On¹Ïs2º©hê¢ö\\fxy-ôL~³l2§£^}zA¾)Ö Þ'sÄRXàõóö¼NÊï¿\+j!ßÅ»ôéÛfDåg´¼Yt'B\e­5±§j\\f²féf%ÿAt~6¢®Ó¨aGo³£DÊ$XU]4pð^Ñ(¬`ec ZÏÑ0Éüfþà-áÝ ïtå\\tèwzpµ81?'7µ@\\f7®$Y~ë# Pþùë.¦Ì®øðð0cí²N\\bçÜ£4 Oì\*'­ºH/É5=§%0w¾¥C±rG.Å<+âf¦²"ÃÖÖæôZî?@n*~Eý©s÷¢©v3Å´ê6­`BZÖ¬BZ«kÜNkU¢bÂÉ²5E#¿Vz#Ó«~Â¾Mä+ã_\:ÝÙ`LX{|5m$tïe:c±¤ID£3ÂSNP<ØÑÕ¯ðR¼Ì¹ Å¥îi/ ¾ÖÒ6Týÿÿ.¥üo|'ú¤±Àçl]?Ót\\núÜÖ¹i7çõâ¶*o[ÊxÐ@.ñ¾±ü\\n¿Ôü÷p5á¼*º²ôxI¯4uÁ+|P\\tQX½(ô9¾W®xcO¿Ü9ySøÉbèDs+GuF8å·&yd§KÊð6Ù74YJ<>/bÎ\«Ï×£&#äN¦ÔpÇ¶EivÔvÁ´û^Ù«1$Õy"C]Å\\bÌUÙ©#z\°ÈAÄ9±:IU\\rBû`lMu·½só_ø<sVâ 5ê4$¾2hþë\\nj¦/8:êHª®iÓ«!\\f©ñ+i¸<Ë8Á¤\\n*pöÍVýû9¨KÄårÕ (u°Ï ®¿KÁ8ãoýcxT]¨\¬´íJ£©Ò,Ì'\lÆ\\b~\\b³e6V2ÌMKûsàÙR\\tô`¥o$½KTI#\\nÝ]\\tú)r5qå`²HÄèØ·ð@u»øøøÏ^£iÈ]_Nð]K¿P³dMdDWQ7 \\b|Á(2[-î¥.ó·J{°[þ5"\\bÊ@]\\t)åö­'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #114
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #26
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
    //   68: ldc 'ÞÃc"'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_3
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #77
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
    //   128: putstatic burp/Zme7.a : [Ljava/lang/String;
    //   131: bipush #21
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zme7.b : [Ljava/lang/String;
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
    //   212: bipush #28
    //   214: goto -> 244
    //   217: bipush #75
    //   219: goto -> 244
    //   222: bipush #23
    //   224: goto -> 244
    //   227: bipush #33
    //   229: goto -> 244
    //   232: bipush #57
    //   234: goto -> 244
    //   237: bipush #34
    //   239: goto -> 244
    //   242: bipush #100
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: new burp/Zxll
    //   303: dup
    //   304: new burp/Ztlm
    //   307: dup
    //   308: new burp/Zt97
    //   311: dup
    //   312: new burp/Zxn2
    //   315: dup
    //   316: new burp/Zg1f
    //   319: dup
    //   320: new burp/Zt6_
    //   323: dup
    //   324: new burp/Zgq9
    //   327: dup
    //   328: new burp/Zlet
    //   331: dup
    //   332: new burp/Zs7y
    //   335: dup
    //   336: invokespecial <init> : ()V
    //   339: invokespecial <init> : (Lburp/Zmxz;)V
    //   342: invokespecial <init> : (Lburp/Zmxz;)V
    //   345: invokespecial <init> : (Lburp/Zmxz;)V
    //   348: invokespecial <init> : (Lburp/Zmxz;)V
    //   351: invokespecial <init> : (Lburp/Zmxz;)V
    //   354: invokespecial <init> : (Lburp/Zmxz;)V
    //   357: invokespecial <init> : (Lburp/Zmxz;)V
    //   360: invokespecial <init> : (Lburp/Zmxz;)V
    //   363: putstatic burp/Zme7.Zr : Lburp/Zxll;
    //   366: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x524C) & 0xFFFF;
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
      byte b1 = 74;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zme7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */