package burp;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.portswigger.Zf9;
import net.portswigger.Zq0;
import net.portswigger.Zq7;
import net.portswigger.Zrme;
import net.portswigger.Zrmz;

class Zbuq implements Zsjt {
  protected final Ztpm Zn;
  
  protected final Zra1 Zd;
  
  protected final Zrfd ZO;
  
  protected final Zm0l Zq;
  
  private final Zr1j ZH;
  
  protected final Zkl6 ZK;
  
  private final Zr_4 Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbuq(Ztpm paramZtpm, Zra1 paramZra1, Zrfd paramZrfd, Zm0l paramZm0l, Zr1j paramZr1j, Zkl6 paramZkl6, Zr_4 paramZr_4) {
    this.Zn = paramZtpm;
    this.Zd = paramZra1;
    this.ZO = paramZrfd;
    this.Zq = paramZm0l;
    this.ZH = paramZr1j;
    this.ZK = paramZkl6;
    this.Zt = paramZr_4;
  }
  
  public Ztj1 ZN(Zf9 paramZf9) {
    throw new Zehm();
  }
  
  public Ztj1 Za(Zf9 paramZf9) {
    return Ze(paramZf9, Zkcl.SCAN_CRAWL_AND_AUDIT, false);
  }
  
  public Ztj1 Zk(Zq0 paramZq0) {
    throw new Zehm();
  }
  
  public Ztj1 ZW(Zq7 paramZq7) {
    throw new Zehm();
  }
  
  protected Ztj1 Ze(Zf9 paramZf9, Zkcl paramZkcl, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZC : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: getfield Zl : Ljava/util/List;
    //   9: invokeinterface isEmpty : ()Z
    //   14: ifeq -> 38
    //   17: new net/portswigger/Zrme
    //   20: dup
    //   21: sipush #-22221
    //   24: sipush #28948
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokespecial <init> : (Ljava/lang/String;)V
    //   33: athrow
    //   34: invokestatic a : (Lburp/Zehm;)Lburp/Zehm;
    //   37: athrow
    //   38: aload_1
    //   39: getfield Zz : Ljava/lang/String;
    //   42: ifnull -> 66
    //   45: new net/portswigger/Zrme
    //   48: dup
    //   49: sipush #-22224
    //   52: sipush #25217
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: invokespecial <init> : (Ljava/lang/String;)V
    //   61: athrow
    //   62: invokestatic a : (Lburp/Zehm;)Lburp/Zehm;
    //   65: athrow
    //   66: aload_1
    //   67: getfield Zt : Lnet/portswigger/Zq_;
    //   70: ifnull -> 114
    //   73: aload_1
    //   74: getfield Zt : Lnet/portswigger/Zq_;
    //   77: getfield Zt : Ljava/lang/String;
    //   80: invokestatic Zu : (Ljava/lang/String;)Lnet/portswigger/Zmg;
    //   83: astore #5
    //   85: aload #5
    //   87: getfield ZO : Ljava/lang/String;
    //   90: ifnull -> 114
    //   93: new net/portswigger/Zrme
    //   96: dup
    //   97: sipush #-22223
    //   100: sipush #7822
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: invokestatic a : (Lburp/Zehm;)Lburp/Zehm;
    //   113: athrow
    //   114: aload_0
    //   115: aload_1
    //   116: getfield Zl : Ljava/util/List;
    //   119: invokevirtual ZH : (Ljava/util/List;)Ljava/util/List;
    //   122: aload_1
    //   123: getfield Zj : Lnet/portswigger/Zzd;
    //   126: invokestatic Zw : (Ljava/util/List;Lnet/portswigger/Zzd;)Ljava/util/List;
    //   129: astore #5
    //   131: new burp/Zzxj
    //   134: dup
    //   135: aload_0
    //   136: getfield ZK : Lburp/Zkl6;
    //   139: invokeinterface ZB : ()Lburp/Zbnt;
    //   144: aload_0
    //   145: getfield Zt : Lburp/Zr_4;
    //   148: invokespecial <init> : (Lburp/Zbnt;Lburp/Zr_4;)V
    //   151: astore #6
    //   153: aload #6
    //   155: aload_1
    //   156: getfield ZF : Lnet/portswigger/Zsu;
    //   159: aload #5
    //   161: invokevirtual ZD : (Lnet/portswigger/Zsu;Ljava/util/List;)V
    //   164: iload_3
    //   165: ifne -> 183
    //   168: aload_0
    //   169: aload #5
    //   171: aload #6
    //   173: invokevirtual ZL : (Ljava/util/List;Lburp/Zzxj;)V
    //   176: goto -> 183
    //   179: invokestatic a : (Lburp/Zehm;)Lburp/Zehm;
    //   182: athrow
    //   183: aload_0
    //   184: aload_1
    //   185: invokevirtual ZK : (Lnet/portswigger/Zf9;)Lburp/Zgyw;
    //   188: astore #7
    //   190: new burp/Zkv4
    //   193: dup
    //   194: new burp/Ztfs
    //   197: dup
    //   198: aload_2
    //   199: aload #6
    //   201: aload #5
    //   203: aconst_null
    //   204: invokespecial <init> : (Lburp/Zkcl;Lburp/Zzxj;Ljava/util/List;Ljava/util/List;)V
    //   207: getstatic burp/Zz5.ZO : Lburp/Zz5;
    //   210: aload #7
    //   212: aload_0
    //   213: aload_1
    //   214: aload #7
    //   216: invokevirtual Zs : (Lnet/portswigger/Zf9;Lburp/Zgyw;)Lburp/Zmpo;
    //   219: aload_0
    //   220: aload_1
    //   221: invokevirtual ZJ : (Lnet/portswigger/Zf9;)Lburp/Zb2y;
    //   224: getstatic burp/Zlj4.API : Lburp/Zlj4;
    //   227: iload_3
    //   228: invokespecial <init> : (Lburp/Ztfs;Lburp/Zz5;Lburp/Zgyw;Lburp/Zmpo;Lburp/Zb2y;Lburp/Zlj4;Z)V
    //   231: astore #8
    //   233: aload_0
    //   234: aload_1
    //   235: <illegal opcode> ZI : (Lburp/Zbuq;Lnet/portswigger/Zf9;)Lburp/Zm0l;
    //   240: astore #9
    //   242: aload_0
    //   243: getfield Zd : Lburp/Zra1;
    //   246: getstatic burp/Zra1.EXECUTION_MODE_ENTERPRISE_AGENT : Lburp/Zra1;
    //   249: if_acmpne -> 312
    //   252: aload_1
    //   253: getfield Zk : Ljava/util/List;
    //   256: invokestatic ZG : (Ljava/util/List;)Lburp/Zge3;
    //   259: astore #10
    //   261: aload_0
    //   262: getfield ZO : Lburp/Zrfd;
    //   265: aload #8
    //   267: iconst_3
    //   268: anewarray burp/Zm0l
    //   271: dup
    //   272: iconst_0
    //   273: aload #9
    //   275: aastore
    //   276: dup
    //   277: iconst_1
    //   278: aload_0
    //   279: getfield Zq : Lburp/Zm0l;
    //   282: aastore
    //   283: dup
    //   284: iconst_2
    //   285: aload #10
    //   287: invokevirtual ZCf : ()Lburp/Zm0l;
    //   290: aastore
    //   291: invokestatic ZI : ([Lburp/Zm0l;)Lburp/Zx5;
    //   294: aload #10
    //   296: dup
    //   297: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   300: pop
    //   301: <illegal opcode> ZU : (Lburp/Zge3;)Lburp/Zsv0;
    //   306: iconst_0
    //   307: iconst_0
    //   308: invokevirtual ZP : (Lburp/Zkv4;Lburp/Zm0l;Lburp/Zsv0;ZZ)Lburp/Ztj1;
    //   311: areturn
    //   312: aload_0
    //   313: getfield ZO : Lburp/Zrfd;
    //   316: aload #8
    //   318: iconst_2
    //   319: anewarray burp/Zm0l
    //   322: dup
    //   323: iconst_0
    //   324: aload #9
    //   326: aastore
    //   327: dup
    //   328: iconst_1
    //   329: aload_0
    //   330: getfield Zq : Lburp/Zm0l;
    //   333: aastore
    //   334: invokestatic ZI : ([Lburp/Zm0l;)Lburp/Zx5;
    //   337: invokevirtual Zq : (Lburp/Zkv4;Lburp/Zm0l;)Lburp/Ztj1;
    //   340: aload #4
    //   342: ifnonnull -> 359
    //   345: iconst_1
    //   346: anewarray burp/Zbqc
    //   349: invokestatic Zr : ([Lburp/Zbqc;)V
    //   352: goto -> 359
    //   355: invokestatic a : (Lburp/Zehm;)Lburp/Zehm;
    //   358: athrow
    //   359: areturn
    // Exception table:
    //   from	to	target	type
    //   5	34	34	burp/Zehm
    //   38	62	62	burp/Zehm
    //   85	110	110	burp/Zehm
    //   153	176	179	burp/Zehm
    //   312	352	355	burp/Zehm
  }
  
  protected static Zge3 ZG(List<Zrmz> paramList) {
    List list = paramList.stream().map(Zbuq::lambda$getBCheckConfig$1).toList();
    Zm0l zm0l = list::lambda$getBCheckConfig$4;
    List<Zsvm> list1 = list.stream().flatMap(Zbuq::lambda$getBCheckConfig$5).toList();
    return new Zge3(zm0l, list1);
  }
  
  protected Zgyw ZK(Zf9 paramZf9) {
    return Zgyw.Zi;
  }
  
  protected Zmpo Zs(Zf9 paramZf9, Zgyw paramZgyw) {
    return Zmpo.Zi;
  }
  
  protected Zb2y ZJ(Zf9 paramZf9) {
    return Zb2y.ZX();
  }
  
  private List<String> ZH(List<String> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_1
    //   9: aload_0
    //   10: aload_2
    //   11: <illegal opcode> accept : (Lburp/Zbuq;Ljava/util/List;)Ljava/util/function/Consumer;
    //   16: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   21: aload_2
    //   22: areturn
  }
  
  private void ZL(List<String> paramList, Zzxj paramZzxj) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: aload_1
    //   3: aload_2
    //   4: <illegal opcode> accept : (Lburp/Zbuq;Ljava/util/List;Lburp/Zzxj;)Ljava/util/function/Consumer;
    //   9: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   14: return
  }
  
  private void lambda$checkUrls$7(List<String> paramList, Zzxj paramZzxj, String paramString) {
    try {
      if (!Zgvb.ZV(paramList, paramZzxj, this.ZK.ZB(), this.Zt, this.ZH))
        throw new Zrme(a(-22222, 28218)); 
    } catch (Zehm zehm) {
      throw a(null);
    } 
  }
  
  private void lambda$validateSeedUrls$6(List<String> paramList, String paramString) {
    Zs7e zs7e = new Zs7e(paramString, this.ZK.ZB());
    try {
      if (!zs7e.ZW())
        throw new Zrme(zs7e.ZK().getMessage()); 
    } catch (Zehm zehm) {
      throw a(null);
    } 
    paramList.add(zs7e.Zo());
  }
  
  private static Stream lambda$getBCheckConfig$5(Zs95 paramZs95) {
    return paramZs95.ZV.Z_().stream();
  }
  
  private static void lambda$getBCheckConfig$4(List paramList, Ztj1 paramZtj1, Zgna paramZgna, Zskh paramZskh, Zrbm paramZrbm, Zg09 paramZg09, Zkg9 paramZkg9, Supplier paramSupplier, Zlli paramZlli1, Zl2h paramZl2h, Zlli paramZlli2, boolean paramBoolean) {
    paramList.stream().filter(Zbuq::lambda$getBCheckConfig$2).forEach(paramZskh::lambda$getBCheckConfig$3);
  }
  
  private static void lambda$getBCheckConfig$3(Zskh paramZskh, Zs95 paramZs95) {
    Zmgc.BCHECK_NOT_RUN_DUE_TO_PARSE_ERROR.ZV(paramZskh, new Object[] { "'" + paramZs95.Zk + "'" });
  }
  
  private static boolean lambda$getBCheckConfig$2(Zs95 paramZs95) {
    try {
    
    } catch (Zehm zehm) {
      throw a(null);
    } 
    return !paramZs95.ZV.Zz().isEmpty();
  }
  
  private static Zs95 lambda$getBCheckConfig$1(Zrmz paramZrmz) {
    return new Zs95(paramZrmz.ZQ, (new Zgig()).Zv(paramZrmz.ZI));
  }
  
  private void lambda$launchScan$0(Zf9 paramZf9, Ztj1 paramZtj1, Zgna paramZgna, Zskh paramZskh, Zrbm paramZrbm, Zg09 paramZg09, Zkg9 paramZkg9, Supplier paramSupplier, Zlli paramZlli1, Zl2h paramZl2h, Zlli paramZlli2, boolean paramBoolean) {
    this.Zn.Z_(paramZtj1, paramZgna, paramZrbm, paramZf9.Zt);
  }
  
  private static Zehm a(Zehm paramZehm) {
    return paramZehm;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Î}\\t ÁDÆÁç+n÷¸l0[ÑsÆª&äK/¡C+Â·çMýÔe J\\t\\rSdÑ×~r917~mUú%Q¸(GËo9gµYÑjWÑ- £«ah&$B­ ­(>9åµLþÊ°ã´UL_Jë§ðPäJêÔU¿~xTí'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #49
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #112
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'ÓsFâzL»B(Ötw·Ñ«l¥TóÊÉk^ìóö{6öT|ÅÍ¹ wYàßøÇr~P'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #22
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #26
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
    //   128: putstatic burp/Zbuq.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zbuq.b : [Ljava/lang/String;
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
    //   212: bipush #97
    //   214: goto -> 244
    //   217: bipush #69
    //   219: goto -> 244
    //   222: bipush #49
    //   224: goto -> 244
    //   227: bipush #97
    //   229: goto -> 244
    //   232: bipush #75
    //   234: goto -> 244
    //   237: bipush #14
    //   239: goto -> 244
    //   242: bipush #47
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA931) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbuq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */