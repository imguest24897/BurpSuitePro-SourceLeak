package net.portswigger;

import java.util.List;
import java.util.Map;

public class Z_6 {
  private static final Map<Integer, byte[]> Zk;
  
  private static final byte[] Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private static void Zn(int paramInt, String paramString) {
    Zk.put(Integer.valueOf(paramInt), Zny.ZI(String.format(a(3333, 27751), new Object[] { Integer.valueOf(paramInt), paramString })));
  }
  
  private static int Zp(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    System.arraycopy(paramArrayOfbyte1, 0, paramArrayOfbyte2, paramInt, paramArrayOfbyte1.length);
    return paramInt + paramArrayOfbyte1.length;
  }
  
  private static byte[] ZW(int paramInt) {
    byte[] arrayOfByte = Zk.get(Integer.valueOf(paramInt));
    if (arrayOfByte == null) {
      arrayOfByte = Zny.ZI(String.format(a(3390, 3907), new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramInt) }));
      Zk.put(Integer.valueOf(paramInt), arrayOfByte);
    } 
    return arrayOfByte;
  }
  
  static byte[] Z_(Zu0 paramZu0) {
    return ZJ(paramZu0.ZD, paramZu0.ZK, paramZu0.Zr, paramZu0.Zc);
  }
  
  public static byte[] ZJ(int paramInt, Zvw paramZvw, byte[] paramArrayOfbyte, boolean paramBoolean) {
    // Byte code:
    //   0: iload_0
    //   1: invokestatic ZW : (I)[B
    //   4: astore #4
    //   6: new java/util/ArrayList
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore #5
    //   15: iconst_1
    //   16: newarray int
    //   18: dup
    //   19: iconst_0
    //   20: iconst_0
    //   21: iastore
    //   22: astore #6
    //   24: iconst_1
    //   25: newarray boolean
    //   27: dup
    //   28: iconst_0
    //   29: iconst_0
    //   30: bastore
    //   31: astore #7
    //   33: aload_1
    //   34: invokevirtual iterator : ()Ljava/util/Iterator;
    //   37: astore #8
    //   39: aload #8
    //   41: invokeinterface hasNext : ()Z
    //   46: ifeq -> 147
    //   49: aload #8
    //   51: invokeinterface next : ()Ljava/lang/Object;
    //   56: checkcast net/portswigger/Zdi
    //   59: astore #9
    //   61: <illegal opcode> test : ()Ljava/util/function/BiPredicate;
    //   66: astore #10
    //   68: iload_3
    //   69: <illegal opcode> test : (Z)Ljava/util/function/BiPredicate;
    //   74: astore #11
    //   76: <illegal opcode> test : ()Ljava/util/function/BiPredicate;
    //   81: astore #12
    //   83: aload #9
    //   85: aload #10
    //   87: aload #11
    //   89: invokeinterface and : (Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    //   94: aload #12
    //   96: invokeinterface or : (Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    //   101: invokeinterface negate : ()Ljava/util/function/BiPredicate;
    //   106: aload #6
    //   108: aload #5
    //   110: <illegal opcode> Zx : ([ILjava/util/List;)Lnet/portswigger/Zcb;
    //   115: invokevirtual ZE : (Ljava/util/function/BiPredicate;Lnet/portswigger/Zcb;)V
    //   118: aload #9
    //   120: aload #10
    //   122: aload #11
    //   124: invokeinterface negate : ()Ljava/util/function/BiPredicate;
    //   129: invokeinterface and : (Ljava/util/function/BiPredicate;)Ljava/util/function/BiPredicate;
    //   134: aload #7
    //   136: <illegal opcode> Zx : ([Z)Lnet/portswigger/Zcb;
    //   141: invokevirtual ZE : (Ljava/util/function/BiPredicate;Lnet/portswigger/Zcb;)V
    //   144: goto -> 39
    //   147: aload #7
    //   149: iconst_0
    //   150: baload
    //   151: ifne -> 223
    //   154: sipush #3389
    //   157: sipush #-2458
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: iconst_2
    //   164: anewarray java/lang/Object
    //   167: dup
    //   168: iconst_0
    //   169: sipush #3344
    //   172: sipush #30253
    //   175: invokestatic a : (II)Ljava/lang/String;
    //   178: aastore
    //   179: dup
    //   180: iconst_1
    //   181: aload_2
    //   182: ifnonnull -> 189
    //   185: iconst_0
    //   186: goto -> 191
    //   189: aload_2
    //   190: arraylength
    //   191: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   194: aastore
    //   195: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   198: invokestatic ZI : (Ljava/lang/String;)[B
    //   201: astore #8
    //   203: aload #6
    //   205: iconst_0
    //   206: dup2
    //   207: iaload
    //   208: aload #8
    //   210: arraylength
    //   211: iadd
    //   212: iastore
    //   213: aload #5
    //   215: aload #8
    //   217: invokeinterface add : (Ljava/lang/Object;)Z
    //   222: pop
    //   223: aload_2
    //   224: ifnonnull -> 247
    //   227: aload #4
    //   229: arraylength
    //   230: aload #6
    //   232: iconst_0
    //   233: iaload
    //   234: iadd
    //   235: getstatic net/portswigger/Z_6.Zc : [B
    //   238: arraylength
    //   239: iadd
    //   240: newarray byte
    //   242: astore #8
    //   244: goto -> 267
    //   247: aload #4
    //   249: arraylength
    //   250: aload #6
    //   252: iconst_0
    //   253: iaload
    //   254: iadd
    //   255: getstatic net/portswigger/Z_6.Zc : [B
    //   258: arraylength
    //   259: iadd
    //   260: aload_2
    //   261: arraylength
    //   262: iadd
    //   263: newarray byte
    //   265: astore #8
    //   267: iconst_0
    //   268: istore #9
    //   270: aload #4
    //   272: aload #8
    //   274: iload #9
    //   276: invokestatic Zp : ([B[BI)I
    //   279: istore #9
    //   281: aload #5
    //   283: invokeinterface iterator : ()Ljava/util/Iterator;
    //   288: astore #10
    //   290: aload #10
    //   292: invokeinterface hasNext : ()Z
    //   297: ifeq -> 326
    //   300: aload #10
    //   302: invokeinterface next : ()Ljava/lang/Object;
    //   307: checkcast [B
    //   310: astore #11
    //   312: aload #11
    //   314: aload #8
    //   316: iload #9
    //   318: invokestatic Zp : ([B[BI)I
    //   321: istore #9
    //   323: goto -> 290
    //   326: getstatic net/portswigger/Z_6.Zc : [B
    //   329: aload #8
    //   331: iload #9
    //   333: invokestatic Zp : ([B[BI)I
    //   336: istore #9
    //   338: aload_2
    //   339: ifnull -> 351
    //   342: aload_2
    //   343: aload #8
    //   345: iload #9
    //   347: invokestatic Zp : ([B[BI)I
    //   350: pop
    //   351: aload #8
    //   353: areturn
  }
  
  private static void lambda$from$4(boolean[] paramArrayOfboolean, Z_3 paramZ_3, String paramString) {
    paramArrayOfboolean[0] = true;
  }
  
  private static void lambda$from$3(int[] paramArrayOfint, List<byte[]> paramList, Z_3 paramZ_3, String paramString) {
    byte[] arrayOfByte = Zny.ZI(String.format(a(3357, -24176), new Object[] { paramZ_3.ZZ, paramString }));
    paramArrayOfint[0] = paramArrayOfint[0] + arrayOfByte.length;
    paramList.add(arrayOfByte);
  }
  
  private static boolean lambda$from$2(Z_3 paramZ_3, String paramString) {
    return (paramZ_3.Zr(a(3378, 7505)) && paramString.equalsIgnoreCase(a(3331, 6768)));
  }
  
  private static boolean lambda$from$1(boolean paramBoolean, Z_3 paramZ_3, String paramString) {
    return !paramBoolean;
  }
  
  private static boolean lambda$from$0(Z_3 paramZ_3, String paramString) {
    return paramZ_3.Zr(a(3373, 31779));
  }
  
  static {
    // Byte code:
    //   0: bipush #70
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'MAÏyÚKÌ¸<~ÍëÜ!+V*\\fÉ5ã<¶ÁXc\\b>" wØ»¦í²ÙZ=koËdÈÈ7ëÌ¢øêmÚèE?´º2É£\\rôÁ\\b©Ái¯ÕÀê×~Ã\\b¤ÉÞ¾ÿ£,r{xÎïð9¾ç2JS¢õÃcîÄøä<±U#(Ó\\n©hU4%®Û&%ò³2\\rï0å)OÄ²ëË\\f»÷AI\\frü¾V¹VzÍ:bew]wIô)å] ¶Ö½¨âÊl:hñZ¶ba×½ÆRø²æ\\t¤.<w~§ÿ\\t«´òþ(,çdpÆ}âm.¶ÜUn\\fv+º¯ØðFO0\\r9ÛãÀ¯i,G`¡¾ÈW=#¢þ\\b+zÍ$.É¼}ÎÏ:<\\bÆ(äê{|0~E»~N§Öj(\öìÕçnÂ÷´fä½R'´ÉàýU_ÈÝN5:oaJDNNI\\b¶Â{tÎ1^E%)Ât{êø¶è¾A-7¥´ÿôÉ=RnQü.´\\bíÿ7ê¤Fì^ßïòep^~Np8lã$ÏSDd\\r«åöÊÜ;ûEÎ´& \³þÞCjÖ/LÊaJrMÐ9Æé#_?®ããO&z:±æMqs°ä\\b>9%°ÄÔ¬\\tÑzB1WæPÚÁ jr$'Ú-9Þrj\\bÂA¿+6Ø 6ÃCµ0ÒÃ9÷"èÅ!¢lð¡$\\trT}gtû»\\t¿ò®&y\\niÊ½J¨Xíþ]«)D½Kt»ü¡\\nØÊÆÜTléS1¡<°nK çpxÖ9Å½1Tò1ï»°:\\fi?[ë9Ekù\\fÄ»tüuE÷ÐZÔÿld»u(|ÜÔø^ñ÷u\\npkùÜVüª"øh²2fÉüL¥\\tWiÊáÐ~tÄ\\tN\\b|"LàÁG¢§(Õ]ik-8`ô¦\\f9çÜÒÑÝãcv ¶£¾PÁOx¤)AHÑ¿Näð« þN_ò\dÒwoT¼©óçýÁìÜ\\f¨ú0U;Uu&ðg\\fO·Á©ø]A2¦\\nÈeV·ê8rk¥8ö#Çþâè+¯¶{ðöú÷b7tóU3\\fÌHáÝëûÅýXÊ³o¢\\faÅLÍjåêW;\\bÃz@R(Åùq®Ñl(k&S¦ÉwèG·³5Yg+SÄ6óÇCFùÙôkºjU/Ë.Btëjã&\\f£o\\n1qëÖ6'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #73
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
    //   68: ldc 'ÓÄicíå2Yá§i6®É:+êFÐÛïtë7G\\r2ë×'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #17
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #55
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
    //   129: putstatic net/portswigger/Z_6.a : [Ljava/lang/String;
    //   132: bipush #70
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/Z_6.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #71
    //   214: goto -> 244
    //   217: bipush #52
    //   219: goto -> 244
    //   222: bipush #96
    //   224: goto -> 244
    //   227: bipush #60
    //   229: goto -> 244
    //   232: bipush #7
    //   234: goto -> 244
    //   237: bipush #108
    //   239: goto -> 244
    //   242: bipush #89
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new java/util/HashMap
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic net/portswigger/Z_6.Zk : Ljava/util/Map;
    //   310: bipush #100
    //   312: sipush #3367
    //   315: sipush #22402
    //   318: invokestatic a : (II)Ljava/lang/String;
    //   321: invokestatic Zn : (ILjava/lang/String;)V
    //   324: bipush #101
    //   326: sipush #3454
    //   329: sipush #1047
    //   332: invokestatic a : (II)Ljava/lang/String;
    //   335: invokestatic Zn : (ILjava/lang/String;)V
    //   338: bipush #102
    //   340: sipush #3351
    //   343: sipush #-13685
    //   346: invokestatic a : (II)Ljava/lang/String;
    //   349: invokestatic Zn : (ILjava/lang/String;)V
    //   352: bipush #103
    //   354: sipush #3339
    //   357: sipush #12249
    //   360: invokestatic a : (II)Ljava/lang/String;
    //   363: invokestatic Zn : (ILjava/lang/String;)V
    //   366: sipush #200
    //   369: sipush #3347
    //   372: sipush #-18140
    //   375: invokestatic a : (II)Ljava/lang/String;
    //   378: invokestatic Zn : (ILjava/lang/String;)V
    //   381: sipush #201
    //   384: sipush #3342
    //   387: sipush #18732
    //   390: invokestatic a : (II)Ljava/lang/String;
    //   393: invokestatic Zn : (ILjava/lang/String;)V
    //   396: sipush #202
    //   399: sipush #3360
    //   402: sipush #31171
    //   405: invokestatic a : (II)Ljava/lang/String;
    //   408: invokestatic Zn : (ILjava/lang/String;)V
    //   411: sipush #203
    //   414: sipush #3368
    //   417: sipush #1602
    //   420: invokestatic a : (II)Ljava/lang/String;
    //   423: invokestatic Zn : (ILjava/lang/String;)V
    //   426: sipush #204
    //   429: sipush #3334
    //   432: sipush #-21572
    //   435: invokestatic a : (II)Ljava/lang/String;
    //   438: invokestatic Zn : (ILjava/lang/String;)V
    //   441: sipush #205
    //   444: sipush #3363
    //   447: sipush #-1549
    //   450: invokestatic a : (II)Ljava/lang/String;
    //   453: invokestatic Zn : (ILjava/lang/String;)V
    //   456: sipush #206
    //   459: sipush #3349
    //   462: sipush #-31821
    //   465: invokestatic a : (II)Ljava/lang/String;
    //   468: invokestatic Zn : (ILjava/lang/String;)V
    //   471: sipush #207
    //   474: sipush #3328
    //   477: sipush #-32298
    //   480: invokestatic a : (II)Ljava/lang/String;
    //   483: invokestatic Zn : (ILjava/lang/String;)V
    //   486: sipush #208
    //   489: sipush #3383
    //   492: sipush #-26963
    //   495: invokestatic a : (II)Ljava/lang/String;
    //   498: invokestatic Zn : (ILjava/lang/String;)V
    //   501: sipush #226
    //   504: sipush #3372
    //   507: sipush #8258
    //   510: invokestatic a : (II)Ljava/lang/String;
    //   513: invokestatic Zn : (ILjava/lang/String;)V
    //   516: sipush #300
    //   519: sipush #3362
    //   522: sipush #-1148
    //   525: invokestatic a : (II)Ljava/lang/String;
    //   528: invokestatic Zn : (ILjava/lang/String;)V
    //   531: sipush #301
    //   534: sipush #3453
    //   537: sipush #29683
    //   540: invokestatic a : (II)Ljava/lang/String;
    //   543: invokestatic Zn : (ILjava/lang/String;)V
    //   546: sipush #302
    //   549: sipush #3329
    //   552: sipush #9626
    //   555: invokestatic a : (II)Ljava/lang/String;
    //   558: invokestatic Zn : (ILjava/lang/String;)V
    //   561: sipush #303
    //   564: sipush #3354
    //   567: sipush #23628
    //   570: invokestatic a : (II)Ljava/lang/String;
    //   573: invokestatic Zn : (ILjava/lang/String;)V
    //   576: sipush #304
    //   579: sipush #3452
    //   582: sipush #-2729
    //   585: invokestatic a : (II)Ljava/lang/String;
    //   588: invokestatic Zn : (ILjava/lang/String;)V
    //   591: sipush #305
    //   594: sipush #3343
    //   597: sipush #10188
    //   600: invokestatic a : (II)Ljava/lang/String;
    //   603: invokestatic Zn : (ILjava/lang/String;)V
    //   606: sipush #307
    //   609: sipush #3345
    //   612: sipush #19630
    //   615: invokestatic a : (II)Ljava/lang/String;
    //   618: invokestatic Zn : (ILjava/lang/String;)V
    //   621: sipush #308
    //   624: sipush #3379
    //   627: sipush #20678
    //   630: invokestatic a : (II)Ljava/lang/String;
    //   633: invokestatic Zn : (ILjava/lang/String;)V
    //   636: sipush #400
    //   639: sipush #3338
    //   642: sipush #-29539
    //   645: invokestatic a : (II)Ljava/lang/String;
    //   648: invokestatic Zn : (ILjava/lang/String;)V
    //   651: sipush #401
    //   654: sipush #3348
    //   657: sipush #-16700
    //   660: invokestatic a : (II)Ljava/lang/String;
    //   663: invokestatic Zn : (ILjava/lang/String;)V
    //   666: sipush #402
    //   669: sipush #3380
    //   672: sipush #21261
    //   675: invokestatic a : (II)Ljava/lang/String;
    //   678: invokestatic Zn : (ILjava/lang/String;)V
    //   681: sipush #403
    //   684: sipush #3377
    //   687: sipush #31572
    //   690: invokestatic a : (II)Ljava/lang/String;
    //   693: invokestatic Zn : (ILjava/lang/String;)V
    //   696: sipush #404
    //   699: sipush #3359
    //   702: sipush #28663
    //   705: invokestatic a : (II)Ljava/lang/String;
    //   708: invokestatic Zn : (ILjava/lang/String;)V
    //   711: sipush #405
    //   714: sipush #3365
    //   717: sipush #-17714
    //   720: invokestatic a : (II)Ljava/lang/String;
    //   723: invokestatic Zn : (ILjava/lang/String;)V
    //   726: sipush #406
    //   729: sipush #3340
    //   732: sipush #8774
    //   735: invokestatic a : (II)Ljava/lang/String;
    //   738: invokestatic Zn : (ILjava/lang/String;)V
    //   741: sipush #407
    //   744: sipush #3361
    //   747: sipush #-30748
    //   750: invokestatic a : (II)Ljava/lang/String;
    //   753: invokestatic Zn : (ILjava/lang/String;)V
    //   756: sipush #408
    //   759: sipush #3391
    //   762: sipush #-2309
    //   765: invokestatic a : (II)Ljava/lang/String;
    //   768: invokestatic Zn : (ILjava/lang/String;)V
    //   771: sipush #409
    //   774: sipush #3341
    //   777: sipush #2489
    //   780: invokestatic a : (II)Ljava/lang/String;
    //   783: invokestatic Zn : (ILjava/lang/String;)V
    //   786: sipush #410
    //   789: sipush #3332
    //   792: sipush #-24714
    //   795: invokestatic a : (II)Ljava/lang/String;
    //   798: invokestatic Zn : (ILjava/lang/String;)V
    //   801: sipush #411
    //   804: sipush #3370
    //   807: sipush #-7956
    //   810: invokestatic a : (II)Ljava/lang/String;
    //   813: invokestatic Zn : (ILjava/lang/String;)V
    //   816: sipush #412
    //   819: sipush #3371
    //   822: sipush #29469
    //   825: invokestatic a : (II)Ljava/lang/String;
    //   828: invokestatic Zn : (ILjava/lang/String;)V
    //   831: sipush #413
    //   834: sipush #3358
    //   837: sipush #25515
    //   840: invokestatic a : (II)Ljava/lang/String;
    //   843: invokestatic Zn : (ILjava/lang/String;)V
    //   846: sipush #414
    //   849: sipush #3335
    //   852: sipush #-17254
    //   855: invokestatic a : (II)Ljava/lang/String;
    //   858: invokestatic Zn : (ILjava/lang/String;)V
    //   861: sipush #415
    //   864: sipush #3388
    //   867: sipush #-11031
    //   870: invokestatic a : (II)Ljava/lang/String;
    //   873: invokestatic Zn : (ILjava/lang/String;)V
    //   876: sipush #416
    //   879: sipush #3336
    //   882: sipush #-14230
    //   885: invokestatic a : (II)Ljava/lang/String;
    //   888: invokestatic Zn : (ILjava/lang/String;)V
    //   891: sipush #417
    //   894: sipush #3381
    //   897: sipush #31838
    //   900: invokestatic a : (II)Ljava/lang/String;
    //   903: invokestatic Zn : (ILjava/lang/String;)V
    //   906: sipush #418
    //   909: sipush #3375
    //   912: sipush #-29320
    //   915: invokestatic a : (II)Ljava/lang/String;
    //   918: invokestatic Zn : (ILjava/lang/String;)V
    //   921: sipush #421
    //   924: sipush #3352
    //   927: bipush #-61
    //   929: invokestatic a : (II)Ljava/lang/String;
    //   932: invokestatic Zn : (ILjava/lang/String;)V
    //   935: sipush #422
    //   938: sipush #3369
    //   941: sipush #-5106
    //   944: invokestatic a : (II)Ljava/lang/String;
    //   947: invokestatic Zn : (ILjava/lang/String;)V
    //   950: sipush #423
    //   953: sipush #3382
    //   956: sipush #-19837
    //   959: invokestatic a : (II)Ljava/lang/String;
    //   962: invokestatic Zn : (ILjava/lang/String;)V
    //   965: sipush #424
    //   968: sipush #3451
    //   971: sipush #-4520
    //   974: invokestatic a : (II)Ljava/lang/String;
    //   977: invokestatic Zn : (ILjava/lang/String;)V
    //   980: sipush #425
    //   983: sipush #3353
    //   986: sipush #-8220
    //   989: invokestatic a : (II)Ljava/lang/String;
    //   992: invokestatic Zn : (ILjava/lang/String;)V
    //   995: sipush #426
    //   998: sipush #3364
    //   1001: sipush #-7237
    //   1004: invokestatic a : (II)Ljava/lang/String;
    //   1007: invokestatic Zn : (ILjava/lang/String;)V
    //   1010: sipush #428
    //   1013: sipush #3356
    //   1016: sipush #25384
    //   1019: invokestatic a : (II)Ljava/lang/String;
    //   1022: invokestatic Zn : (ILjava/lang/String;)V
    //   1025: sipush #429
    //   1028: sipush #3346
    //   1031: sipush #-23942
    //   1034: invokestatic a : (II)Ljava/lang/String;
    //   1037: invokestatic Zn : (ILjava/lang/String;)V
    //   1040: sipush #431
    //   1043: sipush #3366
    //   1046: sipush #32089
    //   1049: invokestatic a : (II)Ljava/lang/String;
    //   1052: invokestatic Zn : (ILjava/lang/String;)V
    //   1055: sipush #451
    //   1058: sipush #3455
    //   1061: sipush #31915
    //   1064: invokestatic a : (II)Ljava/lang/String;
    //   1067: invokestatic Zn : (ILjava/lang/String;)V
    //   1070: sipush #500
    //   1073: sipush #3387
    //   1076: sipush #-5652
    //   1079: invokestatic a : (II)Ljava/lang/String;
    //   1082: invokestatic Zn : (ILjava/lang/String;)V
    //   1085: sipush #501
    //   1088: sipush #3350
    //   1091: sipush #-12118
    //   1094: invokestatic a : (II)Ljava/lang/String;
    //   1097: invokestatic Zn : (ILjava/lang/String;)V
    //   1100: sipush #502
    //   1103: sipush #3355
    //   1106: sipush #-23544
    //   1109: invokestatic a : (II)Ljava/lang/String;
    //   1112: invokestatic Zn : (ILjava/lang/String;)V
    //   1115: sipush #503
    //   1118: sipush #3450
    //   1121: sipush #-19647
    //   1124: invokestatic a : (II)Ljava/lang/String;
    //   1127: invokestatic Zn : (ILjava/lang/String;)V
    //   1130: sipush #504
    //   1133: sipush #3386
    //   1136: sipush #14327
    //   1139: invokestatic a : (II)Ljava/lang/String;
    //   1142: invokestatic Zn : (ILjava/lang/String;)V
    //   1145: sipush #505
    //   1148: sipush #3376
    //   1151: sipush #-28260
    //   1154: invokestatic a : (II)Ljava/lang/String;
    //   1157: invokestatic Zn : (ILjava/lang/String;)V
    //   1160: sipush #506
    //   1163: sipush #3385
    //   1166: sipush #-23441
    //   1169: invokestatic a : (II)Ljava/lang/String;
    //   1172: invokestatic Zn : (ILjava/lang/String;)V
    //   1175: sipush #507
    //   1178: sipush #3384
    //   1181: sipush #-25142
    //   1184: invokestatic a : (II)Ljava/lang/String;
    //   1187: invokestatic Zn : (ILjava/lang/String;)V
    //   1190: sipush #508
    //   1193: sipush #3374
    //   1196: sipush #-5596
    //   1199: invokestatic a : (II)Ljava/lang/String;
    //   1202: invokestatic Zn : (ILjava/lang/String;)V
    //   1205: sipush #510
    //   1208: sipush #3330
    //   1211: sipush #2823
    //   1214: invokestatic a : (II)Ljava/lang/String;
    //   1217: invokestatic Zn : (ILjava/lang/String;)V
    //   1220: sipush #511
    //   1223: sipush #3337
    //   1226: sipush #-26292
    //   1229: invokestatic a : (II)Ljava/lang/String;
    //   1232: invokestatic Zn : (ILjava/lang/String;)V
    //   1235: iconst_2
    //   1236: newarray byte
    //   1238: dup
    //   1239: iconst_0
    //   1240: bipush #13
    //   1242: bastore
    //   1243: dup
    //   1244: iconst_1
    //   1245: bipush #10
    //   1247: bastore
    //   1248: putstatic net/portswigger/Z_6.Zc : [B
    //   1251: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xD3F) & 0xFFFF;
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
      byte b1 = 72;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_6.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */