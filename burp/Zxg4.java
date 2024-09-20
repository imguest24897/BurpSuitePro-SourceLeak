package burp;

public class Zxg4 implements Zmgs {
  private final Ztj1 ZE;
  
  private final Zzkr ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zxg4(Ztj1 paramZtj1, Zzkr paramZzkr) {
    this.ZE = paramZtj1;
    this.ZF = paramZzkr;
  }
  
  public void Zl(Zz9t paramZz9t) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZE : Lburp/Ztj1;
    //   4: invokevirtual ZG : ()Lburp/Zgna;
    //   7: astore_3
    //   8: invokestatic ZD : ()Ljava/lang/String;
    //   11: aload_1
    //   12: aload_0
    //   13: getfield ZE : Lburp/Ztj1;
    //   16: aload_0
    //   17: getfield ZF : Lburp/Zzkr;
    //   20: invokestatic Zg : (Lburp/Zz9t;Lburp/Ztj1;Lburp/Zzkr;)V
    //   23: astore_2
    //   24: getstatic burp/Zzxt.ZW : [I
    //   27: aload_3
    //   28: invokeinterface ZNs : ()Lburp/Zkcl;
    //   33: invokevirtual ordinal : ()I
    //   36: iaload
    //   37: tableswitch default -> 168, 1 -> 88, 2 -> 100, 3 -> 100, 4 -> 122, 5 -> 144, 6 -> 168, 7 -> 168, 8 -> 168, 9 -> 168
    //   88: aload_1
    //   89: aload_3
    //   90: checkcast burp/Zlog
    //   93: invokestatic ZG : (Lburp/Zz9t;Lburp/Zlog;)V
    //   96: aload_2
    //   97: ifnull -> 168
    //   100: aload_1
    //   101: aload_3
    //   102: checkcast burp/Zr5h
    //   105: aload_0
    //   106: getfield ZE : Lburp/Ztj1;
    //   109: invokevirtual Zi : ()Lburp/Zrbm;
    //   112: checkcast burp/Zriy
    //   115: invokestatic Zz : (Lburp/Zz9t;Lburp/Zr5h;Lburp/Zriy;)V
    //   118: aload_2
    //   119: ifnull -> 168
    //   122: aload_1
    //   123: aload_3
    //   124: checkcast burp/Zzep
    //   127: aload_0
    //   128: getfield ZE : Lburp/Ztj1;
    //   131: invokevirtual Zi : ()Lburp/Zrbm;
    //   134: checkcast burp/Zxn8
    //   137: invokestatic Zb : (Lburp/Zz9t;Lburp/Zzep;Lburp/Zxn8;)V
    //   140: aload_2
    //   141: ifnull -> 168
    //   144: aload_1
    //   145: aload_3
    //   146: checkcast burp/Zzep
    //   149: aload_0
    //   150: getfield ZE : Lburp/Ztj1;
    //   153: invokevirtual Zi : ()Lburp/Zrbm;
    //   156: checkcast burp/Zxn8
    //   159: invokevirtual ZH : ()Lburp/Zriy;
    //   162: invokestatic Zz : (Lburp/Zz9t;Lburp/Zr5h;Lburp/Zriy;)V
    //   165: goto -> 168
    //   168: return
  }
  
  private static void Zg(Zz9t paramZz9t, Ztj1 paramZtj1, Zzkr paramZzkr) {
    Zgna zgna = paramZtj1.ZG();
    Zr5_ zr5_ = paramZzkr.ZZ(zgna.ZPm());
    paramZz9t.ZF(a(26187, -25535), Integer.valueOf(zgna.ZPo()));
    paramZz9t.ZF(a(26213, 20915), zgna.ZNs().Zy());
    paramZz9t.ZF(a(26199, 1003), zr5_.Zu());
    paramZz9t.ZF(a(26205, 9183), Boolean.valueOf(zgna.ZPw()));
    paramZz9t.ZF(a(26184, -28384), Integer.valueOf(zgna.ZdT()));
    paramZz9t.ZF(a(26185, -26328), Integer.valueOf(zgna.Zdy()));
    Zen5 zen5 = paramZtj1.ZY().get();
    paramZz9t.ZF(a(26179, -5861), Integer.valueOf(zen5.ZB()));
    paramZz9t.ZF(a(26201, -27504), Integer.valueOf(zen5.ZF()));
    paramZtj1.Zx(paramZz9t);
  }
  
  private static void Zb(Zz9t paramZz9t, Zzep paramZzep, Zxn8 paramZxn8) {
    paramZz9t.ZF(a(26181, -22191), ZF(paramZxn8));
    paramZz9t.ZF(a(26189, 1913), Integer.valueOf(paramZzep.ZnH().ZVI()));
    paramZz9t.ZF(a(26183, -3484), Integer.valueOf(paramZzep.ZnH().ZVp()));
    paramZz9t.ZF(a(26217, 31125), Integer.valueOf(paramZzep.Zdm().ZHW()));
    paramZz9t.ZF(a(26197, -14662), Integer.valueOf(paramZzep.Zdm().ZHg()));
    ZG(paramZz9t, paramZzep);
    if (paramZxn8.Zz())
      Zz(paramZz9t, paramZzep, paramZxn8.ZH()); 
  }
  
  private static String ZF(Zxn8 paramZxn8) {
    // Byte code:
    //   0: invokestatic ZD : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: invokevirtual Zn : ()Z
    //   8: ifeq -> 25
    //   11: sipush #26177
    //   14: sipush #-29769
    //   17: invokestatic a : (II)Ljava/lang/String;
    //   20: astore_2
    //   21: aload_1
    //   22: ifnull -> 98
    //   25: aload_0
    //   26: invokevirtual Zz : ()Z
    //   29: ifeq -> 46
    //   32: sipush #26198
    //   35: sipush #-17866
    //   38: invokestatic a : (II)Ljava/lang/String;
    //   41: astore_2
    //   42: aload_1
    //   43: ifnull -> 98
    //   46: aload_0
    //   47: invokevirtual ZG : ()Z
    //   50: ifeq -> 67
    //   53: sipush #26222
    //   56: sipush #-5475
    //   59: invokestatic a : (II)Ljava/lang/String;
    //   62: astore_2
    //   63: aload_1
    //   64: ifnull -> 98
    //   67: aload_0
    //   68: invokevirtual Zv : ()Z
    //   71: ifeq -> 88
    //   74: sipush #26200
    //   77: sipush #-16176
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: astore_2
    //   84: aload_1
    //   85: ifnull -> 98
    //   88: sipush #26203
    //   91: sipush #11088
    //   94: invokestatic a : (II)Ljava/lang/String;
    //   97: astore_2
    //   98: aload_2
    //   99: areturn
  }
  
  private static void ZG(Zz9t paramZz9t, Zlog paramZlog) {
    Zl7h zl7h = paramZlog.ZnH();
    paramZz9t.ZF(a(26188, -9844), Integer.valueOf(zl7h.ZVJ()));
    paramZz9t.ZF(a(26206, 21863), Integer.valueOf(zl7h.ZVP().ZXY()));
    paramZz9t.ZF(a(26193, -8198), Boolean.valueOf(!zl7h.ZVv().ZZk()));
  }
  
  private static void Zz(Zz9t paramZz9t, Zr5h paramZr5h, Zriy paramZriy) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zdm : ()Lburp/Zz1i;
    //   6: astore_3
    //   7: aload_3
    //   8: invokeinterface ZH0 : ()Ljava/lang/Object;
    //   13: dup
    //   14: astore #4
    //   16: monitorenter
    //   17: aload_3
    //   18: invokeinterface ZHU : ()Lburp/Zefg;
    //   23: invokeinterface size : ()I
    //   28: istore #5
    //   30: aload_0
    //   31: sipush #26191
    //   34: sipush #-12225
    //   37: invokestatic a : (II)Ljava/lang/String;
    //   40: iload #5
    //   42: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   45: invokevirtual ZF : (Ljava/lang/String;Ljava/lang/Object;)V
    //   48: aload_0
    //   49: sipush #26220
    //   52: sipush #-5914
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: aload_3
    //   59: invokeinterface ZHo : ()J
    //   64: invokestatic valueOf : (J)Ljava/lang/Long;
    //   67: invokevirtual ZF : (Ljava/lang/String;Ljava/lang/Object;)V
    //   70: iload #5
    //   72: ifle -> 358
    //   75: aload_0
    //   76: invokevirtual Zt : ()V
    //   79: aload_0
    //   80: sipush #26202
    //   83: sipush #12452
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: bipush #8
    //   91: anewarray java/lang/Object
    //   94: dup
    //   95: iconst_0
    //   96: sipush #26219
    //   99: bipush #-127
    //   101: invokestatic a : (II)Ljava/lang/String;
    //   104: aastore
    //   105: dup
    //   106: iconst_1
    //   107: sipush #26195
    //   110: sipush #18809
    //   113: invokestatic a : (II)Ljava/lang/String;
    //   116: aastore
    //   117: dup
    //   118: iconst_2
    //   119: sipush #26178
    //   122: sipush #-32659
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: aastore
    //   129: dup
    //   130: iconst_3
    //   131: sipush #26223
    //   134: sipush #4413
    //   137: invokestatic a : (II)Ljava/lang/String;
    //   140: aastore
    //   141: dup
    //   142: iconst_4
    //   143: sipush #26180
    //   146: sipush #-27918
    //   149: invokestatic a : (II)Ljava/lang/String;
    //   152: aastore
    //   153: dup
    //   154: iconst_5
    //   155: sipush #26218
    //   158: sipush #25104
    //   161: invokestatic a : (II)Ljava/lang/String;
    //   164: aastore
    //   165: dup
    //   166: bipush #6
    //   168: sipush #26196
    //   171: sipush #24136
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: aastore
    //   178: dup
    //   179: bipush #7
    //   181: sipush #26212
    //   184: sipush #-1784
    //   187: invokestatic a : (II)Ljava/lang/String;
    //   190: aastore
    //   191: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   194: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   197: pop
    //   198: aload_0
    //   199: invokevirtual ZG : ()V
    //   202: aload_2
    //   203: invokevirtual Zj : ()Lburp/Zt5o;
    //   206: aload_0
    //   207: aload_3
    //   208: <illegal opcode> accept : (Lburp/Zz9t;Lburp/Zz1i;)Ljava/util/function/Consumer;
    //   213: invokevirtual Zk : (Ljava/util/function/Consumer;)V
    //   216: aload_0
    //   217: invokevirtual Zt : ()V
    //   220: aload_0
    //   221: sipush #26194
    //   224: sipush #-9901
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: bipush #8
    //   232: anewarray java/lang/Object
    //   235: dup
    //   236: iconst_0
    //   237: sipush #26186
    //   240: sipush #12450
    //   243: invokestatic a : (II)Ljava/lang/String;
    //   246: aastore
    //   247: dup
    //   248: iconst_1
    //   249: sipush #26204
    //   252: sipush #-4894
    //   255: invokestatic a : (II)Ljava/lang/String;
    //   258: aastore
    //   259: dup
    //   260: iconst_2
    //   261: sipush #26221
    //   264: sipush #20459
    //   267: invokestatic a : (II)Ljava/lang/String;
    //   270: aastore
    //   271: dup
    //   272: iconst_3
    //   273: sipush #26216
    //   276: sipush #-31056
    //   279: invokestatic a : (II)Ljava/lang/String;
    //   282: aastore
    //   283: dup
    //   284: iconst_4
    //   285: sipush #26176
    //   288: sipush #14074
    //   291: invokestatic a : (II)Ljava/lang/String;
    //   294: aastore
    //   295: dup
    //   296: iconst_5
    //   297: sipush #26190
    //   300: sipush #23524
    //   303: invokestatic a : (II)Ljava/lang/String;
    //   306: aastore
    //   307: dup
    //   308: bipush #6
    //   310: sipush #26207
    //   313: sipush #-30337
    //   316: invokestatic a : (II)Ljava/lang/String;
    //   319: aastore
    //   320: dup
    //   321: bipush #7
    //   323: sipush #26182
    //   326: sipush #31936
    //   329: invokestatic a : (II)Ljava/lang/String;
    //   332: aastore
    //   333: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   336: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   339: pop
    //   340: aload_0
    //   341: invokevirtual ZG : ()V
    //   344: aload_2
    //   345: invokevirtual ZG : ()Lburp/Zt5o;
    //   348: aload_0
    //   349: aload_3
    //   350: <illegal opcode> accept : (Lburp/Zz9t;Lburp/Zz1i;)Ljava/util/function/Consumer;
    //   355: invokevirtual Zk : (Ljava/util/function/Consumer;)V
    //   358: aload #4
    //   360: monitorexit
    //   361: goto -> 372
    //   364: astore #6
    //   366: aload #4
    //   368: monitorexit
    //   369: aload #6
    //   371: athrow
    //   372: return
    // Exception table:
    //   from	to	target	type
    //   17	361	364	finally
    //   364	369	364	finally
  }
  
  private static void ZK(Zz9t paramZz9t, Zl3i paramZl3i, int paramInt, long paramLong) {
    paramZz9t.append(String.format(a(26192, -9928), new Object[] { paramZl3i.Zc, Integer.valueOf(paramZl3i.Zy), Integer.valueOf(paramZl3i.ZW), Integer.valueOf(paramInt), Boolean.valueOf(paramZl3i.ZY), Integer.valueOf(paramZl3i.Zk), Long.valueOf(paramLong), Boolean.valueOf(paramZl3i.ZT) }));
    paramZz9t.ZG();
  }
  
  private static void lambda$printAuditTaskDetails$0(Zz9t paramZz9t, Zz1i paramZz1i, Zl3i paramZl3i) {
    ZK(paramZz9t, paramZl3i, paramZz1i.ZT(paramZl3i.Zc), paramZz1i.Zd(paramZl3i.Zc));
  }
  
  static {
    // Byte code:
    //   0: bipush #42
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÅµF_k­6\\n?<\\n_B+ãÏ7Øk§QÃ&>Û«Ðæ+TI¯è.Äê'þäz]CR¡ðf`ó\\r)Óë:ùîè?¿ ÍÕ³öh²\\\f\¾+ ù°À ¡V¡¼¹\\bùïÌåº;\\r6p¦ ØùáÔtE ×aB¤9åw¿:ÿ§8ÈKN6.çºÕê¦üaÛÂý³ÚÙù:ùD¹­*Ö"6\\bÄÏ÷Ya¡ãî&\\fÉÅ9:ÏN,ýwÝÒ²b÷S¬c@XÃlD]¤­\·\\n#ubfáð5ËBoA8KU¸#é¬\\fË6×>Îh&;}5:½ä\\r0rôü>77`µ[ÃÕ\\bv³`qU¤ßT9IO <0Îåºit+³ÈJ!ê6~Àòµb¿Ò5¡\\bhÔ9ï>ÁÎíú»bÚpRÛo}Õóâ9÷XÂt·F[ôbKxoÇ@ÄM¯JXu{tiFôKo*@yúYJuÙ{i)öØ*ª¸Aë@$Å"¨US­\\f~ñKi,Ät(E8I.S"Ä¼¬/}%ùó½ ¦Z~ëö}Ä\'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #14
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #118
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
    //   68: ldc ',Î¶&U'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #14
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
    //   128: putstatic burp/Zxg4.a : [Ljava/lang/String;
    //   131: bipush #42
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zxg4.b : [Ljava/lang/String;
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
    //   212: bipush #48
    //   214: goto -> 244
    //   217: bipush #93
    //   219: goto -> 244
    //   222: bipush #84
    //   224: goto -> 244
    //   227: bipush #15
    //   229: goto -> 244
    //   232: bipush #86
    //   234: goto -> 244
    //   237: bipush #9
    //   239: goto -> 244
    //   242: bipush #98
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x664D) & 0xFFFF;
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
      char c = 'Ê';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxg4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */