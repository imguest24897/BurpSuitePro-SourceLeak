package net.portswigger;

import java.util.List;

public class Zfy {
  private final String ZQ;
  
  private final List<String> ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zfy(String paramString) {
    // Byte code:
    //   0: invokestatic Zl : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_1
    //   9: ifnonnull -> 29
    //   12: aload_0
    //   13: ldc ''
    //   15: putfield ZQ : Ljava/lang/String;
    //   18: aload_2
    //   19: ifnonnull -> 77
    //   22: goto -> 29
    //   25: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   28: athrow
    //   29: aload_1
    //   30: ldc '.'
    //   32: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   35: ifeq -> 65
    //   38: goto -> 45
    //   41: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   44: athrow
    //   45: aload_0
    //   46: aload_1
    //   47: iconst_1
    //   48: invokevirtual substring : (I)Ljava/lang/String;
    //   51: putfield ZQ : Ljava/lang/String;
    //   54: aload_2
    //   55: ifnonnull -> 77
    //   58: goto -> 65
    //   61: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   64: athrow
    //   65: aload_0
    //   66: aload_1
    //   67: putfield ZQ : Ljava/lang/String;
    //   70: goto -> 77
    //   73: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   76: athrow
    //   77: aload_0
    //   78: aload_0
    //   79: getfield ZQ : Ljava/lang/String;
    //   82: sipush #5275
    //   85: sipush #27618
    //   88: invokestatic a : (II)Ljava/lang/String;
    //   91: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   94: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   97: putfield ZI : Ljava/util/List;
    //   100: return
    // Exception table:
    //   from	to	target	type
    //   8	22	25	net/portswigger/Zki
    //   12	38	41	net/portswigger/Zki
    //   29	58	61	net/portswigger/Zki
    //   45	70	73	net/portswigger/Zki
  }
  
  public List<Zrz1> Zv() {
    // Byte code:
    //   0: invokestatic Zl : ()[Ljava/lang/String;
    //   3: new java/util/ArrayList
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_2
    //   11: astore_1
    //   12: aload_0
    //   13: getfield ZQ : Ljava/lang/String;
    //   16: invokestatic Zr : (Ljava/lang/String;)Z
    //   19: ifeq -> 455
    //   22: iconst_0
    //   23: istore_3
    //   24: iconst_0
    //   25: istore #4
    //   27: iload #4
    //   29: aload_0
    //   30: getfield ZI : Ljava/util/List;
    //   33: invokeinterface size : ()I
    //   38: if_icmpge -> 455
    //   41: aload_0
    //   42: getfield ZI : Ljava/util/List;
    //   45: iload #4
    //   47: invokeinterface get : (I)Ljava/lang/Object;
    //   52: checkcast java/lang/String
    //   55: astore #5
    //   57: new net/portswigger/Zvr
    //   60: dup
    //   61: invokespecial <init> : ()V
    //   64: aload #5
    //   66: invokevirtual Zi : (Ljava/lang/String;)Lnet/portswigger/Zvr;
    //   69: getstatic net/portswigger/Zkt.UNKNOWN : Lnet/portswigger/Zkt;
    //   72: invokevirtual Zj : (Lnet/portswigger/Zkt;)Lnet/portswigger/Zvr;
    //   75: astore #6
    //   77: aload_2
    //   78: aload #6
    //   80: invokeinterface add : (Ljava/lang/Object;)Z
    //   85: pop
    //   86: ldc '{'
    //   88: aload #5
    //   90: invokevirtual equals : (Ljava/lang/Object;)Z
    //   93: ifeq -> 111
    //   96: iconst_1
    //   97: istore_3
    //   98: aload #6
    //   100: getstatic net/portswigger/Zkt.PARAM_DELIM : Lnet/portswigger/Zkt;
    //   103: invokevirtual Zj : (Lnet/portswigger/Zkt;)Lnet/portswigger/Zvr;
    //   106: pop
    //   107: aload_1
    //   108: ifnonnull -> 448
    //   111: ldc '}'
    //   113: aload #5
    //   115: invokevirtual equals : (Ljava/lang/Object;)Z
    //   118: ifeq -> 143
    //   121: goto -> 128
    //   124: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   127: athrow
    //   128: iconst_0
    //   129: istore_3
    //   130: aload #6
    //   132: getstatic net/portswigger/Zkt.PARAM_DELIM : Lnet/portswigger/Zkt;
    //   135: invokevirtual Zj : (Lnet/portswigger/Zkt;)Lnet/portswigger/Zvr;
    //   138: pop
    //   139: aload_1
    //   140: ifnonnull -> 448
    //   143: ldc ':'
    //   145: aload #5
    //   147: invokevirtual equals : (Ljava/lang/Object;)Z
    //   150: ifeq -> 175
    //   153: goto -> 160
    //   156: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   159: athrow
    //   160: iconst_0
    //   161: istore_3
    //   162: aload #6
    //   164: getstatic net/portswigger/Zkt.PART_DELIM : Lnet/portswigger/Zkt;
    //   167: invokevirtual Zj : (Lnet/portswigger/Zkt;)Lnet/portswigger/Zvr;
    //   170: pop
    //   171: aload_1
    //   172: ifnonnull -> 448
    //   175: sipush #5273
    //   178: sipush #-31016
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: aload #5
    //   186: invokevirtual equals : (Ljava/lang/Object;)Z
    //   189: ifeq -> 214
    //   192: goto -> 199
    //   195: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   198: athrow
    //   199: iconst_0
    //   200: istore_3
    //   201: aload #6
    //   203: getstatic net/portswigger/Zkt.PART_DELIM : Lnet/portswigger/Zkt;
    //   206: invokevirtual Zj : (Lnet/portswigger/Zkt;)Lnet/portswigger/Zvr;
    //   209: pop
    //   210: aload_1
    //   211: ifnonnull -> 448
    //   214: ldc '/'
    //   216: aload #5
    //   218: invokevirtual equals : (Ljava/lang/Object;)Z
    //   221: ifeq -> 246
    //   224: goto -> 231
    //   227: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   230: athrow
    //   231: iconst_0
    //   232: istore_3
    //   233: aload #6
    //   235: getstatic net/portswigger/Zkt.PART_DELIM : Lnet/portswigger/Zkt;
    //   238: invokevirtual Zj : (Lnet/portswigger/Zkt;)Lnet/portswigger/Zvr;
    //   241: pop
    //   242: aload_1
    //   243: ifnonnull -> 448
    //   246: aload #6
    //   248: iload_3
    //   249: invokevirtual ZV : (Z)Lnet/portswigger/Zvr;
    //   252: pop
    //   253: aload_0
    //   254: iload_3
    //   255: ifeq -> 276
    //   258: goto -> 265
    //   261: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   264: athrow
    //   265: iload #4
    //   267: iconst_2
    //   268: iadd
    //   269: goto -> 280
    //   272: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   275: athrow
    //   276: iload #4
    //   278: iconst_1
    //   279: iadd
    //   280: invokevirtual ZV : (I)Z
    //   283: ifeq -> 306
    //   286: aload #6
    //   288: getstatic net/portswigger/Zkt.PROTOCOL : Lnet/portswigger/Zkt;
    //   291: invokevirtual Zj : (Lnet/portswigger/Zkt;)Lnet/portswigger/Zvr;
    //   294: pop
    //   295: aload_1
    //   296: ifnonnull -> 448
    //   299: goto -> 306
    //   302: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   305: athrow
    //   306: aload_0
    //   307: iload #4
    //   309: invokevirtual Zx : (I)Z
    //   312: ifeq -> 342
    //   315: goto -> 322
    //   318: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   321: athrow
    //   322: aload #6
    //   324: getstatic net/portswigger/Zkt.HOST : Lnet/portswigger/Zkt;
    //   327: invokevirtual Zj : (Lnet/portswigger/Zkt;)Lnet/portswigger/Zvr;
    //   330: pop
    //   331: aload_1
    //   332: ifnonnull -> 448
    //   335: goto -> 342
    //   338: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   341: athrow
    //   342: aload_0
    //   343: iload #4
    //   345: invokevirtual ZF : (I)Z
    //   348: ifeq -> 378
    //   351: goto -> 358
    //   354: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   357: athrow
    //   358: aload #6
    //   360: getstatic net/portswigger/Zkt.PORT : Lnet/portswigger/Zkt;
    //   363: invokevirtual Zj : (Lnet/portswigger/Zkt;)Lnet/portswigger/Zvr;
    //   366: pop
    //   367: aload_1
    //   368: ifnonnull -> 448
    //   371: goto -> 378
    //   374: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   377: athrow
    //   378: aload_0
    //   379: iload #4
    //   381: invokevirtual Zt : (I)Z
    //   384: ifeq -> 414
    //   387: goto -> 394
    //   390: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   393: athrow
    //   394: aload #6
    //   396: getstatic net/portswigger/Zkt.PATH : Lnet/portswigger/Zkt;
    //   399: invokevirtual Zj : (Lnet/portswigger/Zkt;)Lnet/portswigger/Zvr;
    //   402: pop
    //   403: aload_1
    //   404: ifnonnull -> 448
    //   407: goto -> 414
    //   410: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   413: athrow
    //   414: new net/portswigger/Zki
    //   417: dup
    //   418: getstatic net/portswigger/Ztt.FAILED_TO_PARSE_URL : Lnet/portswigger/Ztt;
    //   421: iconst_2
    //   422: anewarray java/lang/Object
    //   425: dup
    //   426: iconst_0
    //   427: aload #5
    //   429: aastore
    //   430: dup
    //   431: iconst_1
    //   432: aload_0
    //   433: getfield ZQ : Ljava/lang/String;
    //   436: aastore
    //   437: invokevirtual ZU : ([Ljava/lang/Object;)Ljava/lang/String;
    //   440: invokespecial <init> : (Ljava/lang/String;)V
    //   443: athrow
    //   444: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   447: athrow
    //   448: iinc #4, 1
    //   451: aload_1
    //   452: ifnonnull -> 27
    //   455: aload_2
    //   456: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   461: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   466: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   471: invokestatic toList : ()Ljava/util/stream/Collector;
    //   474: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   479: checkcast java/util/List
    //   482: areturn
    // Exception table:
    //   from	to	target	type
    //   98	121	124	net/portswigger/Zki
    //   130	153	156	net/portswigger/Zki
    //   162	192	195	net/portswigger/Zki
    //   201	224	227	net/portswigger/Zki
    //   233	258	261	net/portswigger/Zki
    //   246	272	272	net/portswigger/Zki
    //   280	299	302	net/portswigger/Zki
    //   286	315	318	net/portswigger/Zki
    //   306	335	338	net/portswigger/Zki
    //   322	351	354	net/portswigger/Zki
    //   342	371	374	net/portswigger/Zki
    //   358	387	390	net/portswigger/Zki
    //   378	407	410	net/portswigger/Zki
    //   394	444	444	net/portswigger/Zki
  }
  
  private boolean Zt(int paramInt) {
    String str = String.join("", this.ZI.subList(0, paramInt));
    return str.replaceAll(a(5272, -14269), "").contains("/");
  }
  
  private boolean ZF(int paramInt) {
    String str = String.join("", this.ZI.subList(0, paramInt));
    try {
      if (str.contains(a(5274, 9742)))
        try {
          if (!str.replaceAll(a(5272, -14269), "").contains("/"))
            try {
              if (str.replaceAll(a(5272, -14269), "").contains(":"));
            } catch (Zki zki) {
              throw a(null);
            }  
        } catch (Zki zki) {
          throw a(null);
        }  
    } catch (Zki zki) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean Zx(int paramInt) {
    String str = String.join("", this.ZI.subList(0, paramInt));
    try {
      if (str.contains(a(5272, -14269)))
        try {
          if (!str.replaceAll(a(5272, -14269), "").contains("/"))
            try {
              if (!str.replaceAll(a(5272, -14269), "").contains(":"));
            } catch (Zki zki) {
              throw a(null);
            }  
        } catch (Zki zki) {
          throw a(null);
        }  
    } catch (Zki zki) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean ZV(int paramInt) {
    try {
      if (paramInt <= this.ZI.size())
        try {
          if (String.join("", this.ZI.subList(paramInt, this.ZI.size())).startsWith(a(5272, -14269)));
        } catch (Zki zki) {
          throw a(null);
        }  
    } catch (Zki zki) {
      throw a(null);
    } 
    return false;
  }
  
  private static Zki a(Zki paramZki) {
    return paramZki;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '¾L^tkk °©\\ré£:VN\\bt¸HO.²-0µ\\b\OØpÓÓ×au« üýK\\b«ÒñÊËÕ_:ù{Ç(²\\fbx)°HoÜ=T{MÔij6*Ó&ÑÌ(sY¾ÿòLÇò4U4@Ê¶+µî+[¾çt\\b:¸íw'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: sipush #133
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #96
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 141
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
    //   68: ldc 'eg½'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_2
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #30
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic net/portswigger/Zfy.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/Zfy.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #44
    //   214: goto -> 244
    //   217: bipush #112
    //   219: goto -> 244
    //   222: bipush #113
    //   224: goto -> 244
    //   227: bipush #122
    //   229: goto -> 244
    //   232: bipush #118
    //   234: goto -> 244
    //   237: bipush #117
    //   239: goto -> 244
    //   242: bipush #13
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
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
    int i = (paramInt1 ^ 0x149B) & 0xFFFF;
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
      byte b1 = 63;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zfy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */