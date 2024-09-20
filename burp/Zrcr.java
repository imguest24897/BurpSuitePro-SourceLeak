package burp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.portswigger.Zkb;
import net.portswigger.Zli;

public class Zrcr {
  private final int Zt;
  
  private final int ZL;
  
  private final byte[] ZP;
  
  private final Set<String> Zk = new HashSet<>();
  
  private static final String[] ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrcr(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    this.Zt = paramInt1;
    this.ZL = paramInt2;
    this.ZP = paramArrayOfbyte;
  }
  
  public Zkv8 ZD(byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    String str2 = Zkb.ZG(paramArrayOfbyte2);
    List<Ztu8> list = Zeam.Zv(paramArrayOfbyte1, 0, paramArrayOfbyte1.length, (byte)0);
    Iterator<Ztu8> iterator = list.iterator();
    String str1 = Zz_p.Zl();
    while (iterator.hasNext()) {
      Ztu8 ztu8 = iterator.next();
      boolean bool = (this.Zt >= ztu8.ZlK() + this.ZL && this.Zt < ztu8.Zli() + this.ZL) ? true : false;
      switch (ztu8.ZlD()) {
        case 3:
          if (bool)
            return ZT(paramByte, paramArrayOfbyte1, paramArrayOfbyte2, ztu8.ZlK(), ztu8.Zli()); 
          break;
        case 0:
        case 1:
        case 4:
        
        case 2:
          if (bool)
            return new Zz_p(paramByte, (byte)23, this.Zt, ztu8.ZlK() + this.ZL, this.ZP); 
          break;
      } 
      continue;
      if (str1 != null)
        break; 
    } 
    return null;
  }
  
  private Zkv8 ZB(byte paramByte, Ztu8 paramZtu8, Zs5n paramZs5n, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_3
    //   3: invokevirtual Zq : (Lburp/Ztu8;Lburp/Zs5n;)Z
    //   6: istore #6
    //   8: invokestatic Zl : ()Ljava/lang/String;
    //   11: iconst_0
    //   12: istore #7
    //   14: astore #5
    //   16: iload #6
    //   18: ifne -> 78
    //   21: getstatic burp/Zrcr.ZY : [Ljava/lang/String;
    //   24: astore #8
    //   26: aload #8
    //   28: arraylength
    //   29: istore #9
    //   31: iconst_0
    //   32: istore #10
    //   34: iload #10
    //   36: iload #9
    //   38: if_icmpge -> 78
    //   41: aload #8
    //   43: iload #10
    //   45: aaload
    //   46: astore #11
    //   48: aload #11
    //   50: aload_3
    //   51: invokeinterface ZQd : ()Ljava/lang/String;
    //   56: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   59: ifeq -> 70
    //   62: iconst_1
    //   63: istore #7
    //   65: aload #5
    //   67: ifnull -> 78
    //   70: iinc #10, 1
    //   73: aload #5
    //   75: ifnull -> 34
    //   78: aload_0
    //   79: aload #4
    //   81: aload_3
    //   82: invokevirtual ZA : (Ljava/lang/String;Lburp/Zs5n;)Ljava/lang/String;
    //   85: astore #8
    //   87: aload_3
    //   88: invokeinterface ZQr : ()B
    //   93: tableswitch default -> 450, 0 -> 124, 1 -> 205, 2 -> 286, 3 -> 368
    //   124: new burp/Zg5y
    //   127: dup
    //   128: new burp/Zz_p
    //   131: dup
    //   132: iload_1
    //   133: iload #6
    //   135: ifeq -> 143
    //   138: bipush #8
    //   140: goto -> 154
    //   143: iload #7
    //   145: ifeq -> 153
    //   148: bipush #12
    //   150: goto -> 154
    //   153: iconst_4
    //   154: aload_0
    //   155: getfield Zt : I
    //   158: aload_3
    //   159: invokeinterface ZQs : ()I
    //   164: aload_0
    //   165: getfield ZL : I
    //   168: iadd
    //   169: aload_0
    //   170: getfield ZP : [B
    //   173: invokespecial <init> : (BBII[B)V
    //   176: aload_2
    //   177: invokeinterface ZlP : ()Lburp/Zs_n;
    //   182: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   187: aload_3
    //   188: invokeinterface ZQd : ()Ljava/lang/String;
    //   193: aload #8
    //   195: aload_2
    //   196: invokeinterface ZlP : ()Lburp/Zs_n;
    //   201: invokespecial <init> : (Lburp/Zz_p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lburp/Zs_n;)V
    //   204: areturn
    //   205: new burp/Zg5y
    //   208: dup
    //   209: new burp/Zz_p
    //   212: dup
    //   213: iload_1
    //   214: iload #6
    //   216: ifeq -> 224
    //   219: bipush #9
    //   221: goto -> 235
    //   224: iload #7
    //   226: ifeq -> 234
    //   229: bipush #13
    //   231: goto -> 235
    //   234: iconst_5
    //   235: aload_0
    //   236: getfield Zt : I
    //   239: aload_3
    //   240: invokeinterface ZQs : ()I
    //   245: aload_0
    //   246: getfield ZL : I
    //   249: iadd
    //   250: aload_0
    //   251: getfield ZP : [B
    //   254: invokespecial <init> : (BBII[B)V
    //   257: aload_2
    //   258: invokeinterface ZlP : ()Lburp/Zs_n;
    //   263: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   268: aload_3
    //   269: invokeinterface ZQd : ()Ljava/lang/String;
    //   274: aload #8
    //   276: aload_2
    //   277: invokeinterface ZlP : ()Lburp/Zs_n;
    //   282: invokespecial <init> : (Lburp/Zz_p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lburp/Zs_n;)V
    //   285: areturn
    //   286: new burp/Zg5y
    //   289: dup
    //   290: new burp/Zz_p
    //   293: dup
    //   294: iload_1
    //   295: iload #6
    //   297: ifeq -> 305
    //   300: bipush #10
    //   302: goto -> 317
    //   305: iload #7
    //   307: ifeq -> 315
    //   310: bipush #14
    //   312: goto -> 317
    //   315: bipush #6
    //   317: aload_0
    //   318: getfield Zt : I
    //   321: aload_3
    //   322: invokeinterface ZQs : ()I
    //   327: aload_0
    //   328: getfield ZL : I
    //   331: iadd
    //   332: aload_0
    //   333: getfield ZP : [B
    //   336: invokespecial <init> : (BBII[B)V
    //   339: aload_2
    //   340: invokeinterface ZlP : ()Lburp/Zs_n;
    //   345: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   350: aload_3
    //   351: invokeinterface ZQd : ()Ljava/lang/String;
    //   356: aload #8
    //   358: aload_2
    //   359: invokeinterface ZlP : ()Lburp/Zs_n;
    //   364: invokespecial <init> : (Lburp/Zz_p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lburp/Zs_n;)V
    //   367: areturn
    //   368: new burp/Zg5y
    //   371: dup
    //   372: new burp/Zz_p
    //   375: dup
    //   376: iload_1
    //   377: iload #6
    //   379: ifeq -> 387
    //   382: bipush #11
    //   384: goto -> 399
    //   387: iload #7
    //   389: ifeq -> 397
    //   392: bipush #15
    //   394: goto -> 399
    //   397: bipush #7
    //   399: aload_0
    //   400: getfield Zt : I
    //   403: aload_3
    //   404: invokeinterface ZQs : ()I
    //   409: aload_0
    //   410: getfield ZL : I
    //   413: iadd
    //   414: aload_0
    //   415: getfield ZP : [B
    //   418: invokespecial <init> : (BBII[B)V
    //   421: aload_2
    //   422: invokeinterface ZlP : ()Lburp/Zs_n;
    //   427: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   432: aload_3
    //   433: invokeinterface ZQd : ()Ljava/lang/String;
    //   438: aload #8
    //   440: aload_2
    //   441: invokeinterface ZlP : ()Lburp/Zs_n;
    //   446: invokespecial <init> : (Lburp/Zz_p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lburp/Zs_n;)V
    //   449: areturn
    //   450: iconst_0
    //   451: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   454: aload_3
    //   455: invokeinterface ZQr : ()B
    //   460: i2l
    //   461: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   464: aconst_null
    //   465: areturn
  }
  
  private boolean Zq(Ztu8 paramZtu8, Zs5n paramZs5n) {
    String str1 = paramZtu8.ZlP().ZJ3();
    String str2 = paramZs5n.ZQd();
    return ((a(-8381, -419).equalsIgnoreCase(str2) || a(-8320, 23234).equalsIgnoreCase(str2)) && (a(-8366, -768).equalsIgnoreCase(str1) || a(-8353, -30805).equalsIgnoreCase(str1) || a(-8312, -17513).equalsIgnoreCase(str1) || a(-8307, 10337).equalsIgnoreCase(str1))) ? true : ((a(-8264, 16084).equalsIgnoreCase(str2) && ("a".equalsIgnoreCase(str1) || a(-8279, 9077).equalsIgnoreCase(str1))) ? true : ((a(-8244, 15715).equalsIgnoreCase(str2) && (a(-8235, 17863).equalsIgnoreCase(str1) || a(-8334, -27172).equalsIgnoreCase(str1))) ? true : ((a(-8255, -19613).equalsIgnoreCase(str2) && a(-8224, 14929).equalsIgnoreCase(str1)))));
  }
  
  private void ZO(Ztu8 paramZtu8) {
    String str = Zz_p.Zl();
    if (paramZtu8.ZlD() == 1) {
      this.Zk.remove(paramZtu8.ZlP().ZJ3().toLowerCase());
      if (str != null) {
        this.Zk.add(paramZtu8.ZlP().ZJ3().toLowerCase());
        return;
      } 
      return;
    } 
    this.Zk.add(paramZtu8.ZlP().ZJ3().toLowerCase());
  }
  
  private Zkv8 ZT(byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    return this.Zk.contains(a(-8208, -3515)) ? ZW(paramByte, paramArrayOfbyte1, paramArrayOfbyte2, paramInt1, paramInt2) : (this.Zk.contains(a(-8298, 20540)) ? new Zz_p(paramByte, (byte)20, this.Zt, paramInt1 + this.ZL, this.ZP) : (this.Zk.contains(a(-8303, -26665)) ? new Zz_p(paramByte, (byte)21, this.Zt, paramInt1 + this.ZL, this.ZP) : (this.Zk.contains(a(-8248, 2077)) ? new Zz_p(paramByte, (byte)22, this.Zt, paramInt1 + this.ZL, this.ZP) : new Zz_p(paramByte, (byte)19, this.Zt, paramInt1 + this.ZL, this.ZP))));
  }
  
  public Zkv8 ZW(byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: astore #6
    //   5: iload #4
    //   7: istore #7
    //   9: iload #7
    //   11: iload #5
    //   13: if_icmpge -> 326
    //   16: iload #7
    //   18: istore #8
    //   20: iconst_2
    //   21: istore #9
    //   23: iload #7
    //   25: iload #5
    //   27: if_icmpge -> 208
    //   30: aload_2
    //   31: iload #7
    //   33: baload
    //   34: bipush #39
    //   36: if_icmpne -> 47
    //   39: iconst_1
    //   40: istore #9
    //   42: aload #6
    //   44: ifnull -> 208
    //   47: aload_2
    //   48: iload #7
    //   50: baload
    //   51: bipush #34
    //   53: if_icmpne -> 71
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: iconst_0
    //   64: istore #9
    //   66: aload #6
    //   68: ifnull -> 208
    //   71: iload #7
    //   73: iconst_1
    //   74: iadd
    //   75: iload #5
    //   77: if_icmpge -> 132
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: aload_2
    //   88: iload #7
    //   90: baload
    //   91: bipush #47
    //   93: if_icmpne -> 132
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: aload_2
    //   104: iload #7
    //   106: iconst_1
    //   107: iadd
    //   108: baload
    //   109: bipush #47
    //   111: if_icmpne -> 132
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: iconst_3
    //   122: istore #9
    //   124: iinc #7, 1
    //   127: aload #6
    //   129: ifnull -> 208
    //   132: iload #7
    //   134: iconst_1
    //   135: iadd
    //   136: iload #5
    //   138: if_icmpge -> 193
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   147: athrow
    //   148: aload_2
    //   149: iload #7
    //   151: baload
    //   152: bipush #47
    //   154: if_icmpne -> 193
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: aload_2
    //   165: iload #7
    //   167: iconst_1
    //   168: iadd
    //   169: baload
    //   170: bipush #42
    //   172: if_icmpne -> 193
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   181: athrow
    //   182: iconst_4
    //   183: istore #9
    //   185: iinc #7, 1
    //   188: aload #6
    //   190: ifnull -> 208
    //   193: iinc #7, 1
    //   196: aload #6
    //   198: ifnull -> 23
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   207: athrow
    //   208: aload_2
    //   209: aload_3
    //   210: iload #8
    //   212: iload #7
    //   214: invokestatic Zw : ([B[BII)I
    //   217: iconst_m1
    //   218: if_icmpeq -> 247
    //   221: new burp/Zz_p
    //   224: dup
    //   225: iload_1
    //   226: bipush #18
    //   228: aload_0
    //   229: getfield Zt : I
    //   232: iload #8
    //   234: aload_0
    //   235: getfield ZL : I
    //   238: iadd
    //   239: aload_0
    //   240: getfield ZP : [B
    //   243: invokespecial <init> : (BBII[B)V
    //   246: areturn
    //   247: iinc #7, 1
    //   250: iload #7
    //   252: istore #8
    //   254: aload_0
    //   255: aload_2
    //   256: iload #7
    //   258: iload #5
    //   260: iload #9
    //   262: invokevirtual ZR : ([BIIB)I
    //   265: istore #7
    //   267: aload_0
    //   268: iload_1
    //   269: aload_2
    //   270: aload_3
    //   271: iload #8
    //   273: iload #7
    //   275: iload #9
    //   277: invokevirtual ZV : (B[B[BIIB)Lburp/Zkv8;
    //   280: astore #10
    //   282: aload #10
    //   284: ifnull -> 290
    //   287: aload #10
    //   289: areturn
    //   290: iload #9
    //   292: iconst_4
    //   293: if_icmpne -> 311
    //   296: iinc #7, 2
    //   299: aload #6
    //   301: ifnull -> 321
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   310: athrow
    //   311: iinc #7, 1
    //   314: goto -> 321
    //   317: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   320: athrow
    //   321: aload #6
    //   323: ifnull -> 9
    //   326: goto -> 339
    //   329: astore #7
    //   331: aload #7
    //   333: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   336: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   339: iconst_0
    //   340: getstatic net/portswigger/Zqf.ZH : Lnet/portswigger/Zqf;
    //   343: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   346: new burp/Zz_p
    //   349: dup
    //   350: iload_1
    //   351: bipush #18
    //   353: aload_0
    //   354: getfield Zt : I
    //   357: iload #4
    //   359: aload_0
    //   360: getfield ZL : I
    //   363: iadd
    //   364: aload_0
    //   365: getfield ZP : [B
    //   368: invokespecial <init> : (BBII[B)V
    //   371: areturn
    // Exception table:
    //   from	to	target	type
    //   5	246	329	java/lang/Exception
    //   42	56	59	java/lang/Exception
    //   66	80	83	java/lang/Exception
    //   71	96	99	java/lang/Exception
    //   87	114	117	java/lang/Exception
    //   124	141	144	java/lang/Exception
    //   132	157	160	java/lang/Exception
    //   148	175	178	java/lang/Exception
    //   185	201	204	java/lang/Exception
    //   247	289	329	java/lang/Exception
    //   290	304	307	java/lang/Exception
    //   290	326	329	java/lang/Exception
    //   296	314	317	java/lang/Exception
  }
  
  private Zkv8 ZV(byte paramByte1, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, byte paramByte2) {
    if (Zli.Zw(paramArrayOfbyte1, paramArrayOfbyte2, paramInt1, paramInt2) != -1) {
      String str = Zkb.Zo(paramArrayOfbyte1, paramInt1, paramInt2 - paramInt1);
      str = Zl(paramArrayOfbyte2, str);
      if (paramByte2 == 1)
        return new Zz64(new Zz_p(paramByte1, (byte)17, this.Zt, paramInt1 + this.ZL, this.ZP), str); 
      if (paramByte2 == 0)
        return new Zz64(new Zz_p(paramByte1, (byte)16, this.Zt, paramInt1 + this.ZL, this.ZP), str); 
      if (paramByte2 == 3)
        return new Zz64(new Zz_p(paramByte1, (byte)24, this.Zt, paramInt1 + this.ZL, this.ZP), str); 
      if (paramByte2 == 4)
        return new Zz64(new Zz_p(paramByte1, (byte)25, this.Zt, paramInt1 + this.ZL, this.ZP), str); 
    } 
    return null;
  }
  
  private String ZA(String paramString, Zs5n paramZs5n) {
    return paramZs5n.ZQG().replace(paramString, Zkb.ZG(this.ZP));
  }
  
  private String Zl(byte[] paramArrayOfbyte, String paramString) {
    return paramString.replace(Zkb.ZG(paramArrayOfbyte), Zkb.ZG(this.ZP));
  }
  
  private int ZR(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, byte paramByte) {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: astore #5
    //   5: iload_2
    //   6: iload_3
    //   7: if_icmpge -> 126
    //   10: aload_1
    //   11: iload_2
    //   12: baload
    //   13: bipush #92
    //   15: if_icmpne -> 26
    //   18: iinc #2, 2
    //   21: aload #5
    //   23: ifnull -> 5
    //   26: iload #4
    //   28: iconst_1
    //   29: if_icmpne -> 43
    //   32: aload_1
    //   33: iload_2
    //   34: baload
    //   35: bipush #39
    //   37: if_icmpne -> 43
    //   40: goto -> 126
    //   43: iload #4
    //   45: ifne -> 59
    //   48: aload_1
    //   49: iload_2
    //   50: baload
    //   51: bipush #34
    //   53: if_icmpne -> 59
    //   56: goto -> 126
    //   59: iload #4
    //   61: iconst_3
    //   62: if_icmpne -> 84
    //   65: aload_1
    //   66: iload_2
    //   67: baload
    //   68: bipush #10
    //   70: if_icmpeq -> 126
    //   73: aload_1
    //   74: iload_2
    //   75: baload
    //   76: bipush #13
    //   78: if_icmpne -> 84
    //   81: goto -> 126
    //   84: iload #4
    //   86: iconst_4
    //   87: if_icmpne -> 118
    //   90: iload_2
    //   91: iconst_1
    //   92: iadd
    //   93: iload_3
    //   94: if_icmpge -> 118
    //   97: aload_1
    //   98: iload_2
    //   99: baload
    //   100: bipush #42
    //   102: if_icmpne -> 118
    //   105: aload_1
    //   106: iload_2
    //   107: iconst_1
    //   108: iadd
    //   109: baload
    //   110: bipush #47
    //   112: if_icmpne -> 118
    //   115: goto -> 126
    //   118: iinc #2, 1
    //   121: aload #5
    //   123: ifnull -> 5
    //   126: iload_2
    //   127: ireturn
  }
  
  static {
    // Byte code:
    //   0: sipush #168
    //   3: anewarray java/lang/String
    //   6: astore #5
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'òç"×©>W$±¹]û1ÂcAOT[¨\\tI¦²öÕ\\f_ÆÃ¤¶×§S³e%\\rÏSßáKE~-faK[;ü~>Ãcÿ:Öá@¡Ú\\tm¬o[Ã¥Ò/uÇUá¿Ò¾Çc§ew­²OÎÆQU~D­±¿ë£ê­\ê\\t7TÙ/*eêç|j)eBÍL)c°y».ïÄ"c>3gN^ö½<ÊWªã'¥Ë¹]Qùç]}M3ªcªTÿpe=sµYò>ißu2\´IÜr\\tv¸·Åp²ç!n¿Zµ;<úyÑÜOm\\nô°&ÙJq4µWH<çÒ÷ªÜ'³ÏKæë\\nî8¿¼Ùõk¿1\\rºJ["u<tø£[eZØÞH1æUïÜL^c,C£a¹ô´¢rUfm9^rÙÎ¡d\\ntõ°O3ÐÛ'|"éÐ\\f¢K³\\n¬²½*yË.|â\\tAìûÆ¸\\rþsE'0 \\r-ìfÀ½«\\fxi'Q*¤Dk,V5\\nßXÛv­W÷A\\nklrÒh#á5 {!NvSRØXÂGhÉ\\n»8Bu*ù7´ÞSs¼YØ\\fVUûÐDx¤µLÚ08"víêl¸PgKí\\rjè}~k¯NHDbeç3gkö½-¶ (%æKà\\tkDOspù\\tóÛTxÞÿ{¼_÷.îÃlCÖ\\t*¹\\nYS£ZGû!Vÿqê·åtË£ÍËz\\n¬´bdheÀ¡gØÍ\\bÏ,ÓøïªÍá\\b!RÚfGý*¡¥ÐÄä_M¶ì\\nÌ9¨[áõ0A\\bBféÿAP 9?î@q\\f;©C@*¸r;·B½´Ð°fAñ°Ð¸ù¥gìD\\bw^Ø»hv\\t#DUòF Ø)èWz\1g´ì\\tÕéO«Aÿµ\\tÀÌÜÄ"ç¯Ý¶ÇÒ|Va±«Io\\t³°@`Ñ~ÇéVû_u}Y ZC>à</\\b¨ÙjTTy/ð£Bßå^×Ü"l\\fÔ±g]x$EÓSjM;¾4¥ÞÙR&¹^næ¬Uáâ_&Þé!îöÎÇ¯0ÔghÈ¯¶¦HÕ1GSÀÖLÛlØüL\\nÓ¦Y¨ðsc\\tDG ÜX-&\\t[óG¡Ý_\\nk\\f\\fÜ¶éåjy8ãÁ\\ròòsß1Ì×Èbkt z39UþÍ­õÕ¹\\rÈø\\fÝ¥È¥¸XQ`-*Ú^¶ÔæLÚ²jG÷ì\\tSÖ_¥SjÇk|©F$]®Ý?ñ;ç3m\\b,´µëzÎpª\\nÃÒ/ÐÄü\\t¥ñÅÇwëØ­þª³@GâøyRçgëÐ9Æô¶°\\t³k@\\n¶|¢ÀBÑ\\fj|LÓsåZÄ¹#l\\rÂ1oPÚÙûr)v\\fÙ:1¦åMÀÅjÎ\\rÑ4LµPÑxssÉGv\\fr¡3âßo\\fÆõ#Ó>»_'Y;¼Fö4íÐf>±Ñh»-j\\bÂ¶ç\\f7 ðÍOG®çÕ¾»æªR3]j~ÎIû[â<Sºu¹×«71à'=ødØf´ý·Éæh¥qï\\f¨Bû«Z$\\bIô[:é±\\nDÓ®ÄYØÝÿ\\nªüCÚmýÏµ¯?\\t¢2s9TÚÜ¤ü\\bÂ3n ÉÉÁÒ¦&¸W¹U0S¿óIê×WUËË]ðÁgwe\\t`V/¶W^)ìS\\bÔñ­HÖèn[LXó»,·=±Mï|kFGçÎÄ\\bð¡?U<ª-Ø\\rÏÚ·"{?Æ\2;yº\\rOÈü]ûÇ"{|yÊ*ï;û®8jktl=\\f:o¥XíX%4úJÆþ£«ùe§BZÕ¥ïú¿&¸Mèmy:1[,e\¥ùmwtÞ÷áT\\fXDÚiUÜÑ±m\\bÍDË#&ð\\tFôàâÒÒ[§×ð?6$þ~î[xÓ¾#\Bð]v>'%=9%\\rËðÀ\\n4dúùÑÓÚ\\b`A:^D5\\t?Ç::ïMØ\\fBa×*m\Åïô\\t«^,1­Ô ¶ñ5,~\\r!m×@¢Â¯J¬ÉÛNé/.?ÔS%©cäEàSë¹x\\tª(í´'·Å¤"ì <QÃéAË¥g,×12v·5b^;}FýRT¤Ñ¡Qft\\fÊïsóÜ\\ní²[Ê\/¨<Á3ÇÐsI9t{õ\\n¦>þ¶Uèdo\\nFæé­ÂjÊ\\r0RZ{Ã\\f3ÑÕ\\t+QØ¤ä9\\b7¤Ç¥«\\föoï\\t¬-j«7\\tÛI¢VÆËþÚízÛ®¾"fÔ!Ëh&²\\nL¢ù?I~Æ\\nñ¢p.uÓx)Ô%TÚy=^8Z$-9m\\nº+úDs§\\f^8ìq¯ñ¯ª%Â\\rRKnFµ:\\rc²Á\\r¢Bu4Jûå^(6Y'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #19
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: iconst_2
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 144
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
    //   65: goto -> 24
    //   68: ldc '½¨¨[iñ«\\fêmMâ9ÿôñÆÁq¶'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #19
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 144
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
    //   129: putstatic burp/Zrcr.a : [Ljava/lang/String;
    //   132: sipush #168
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zrcr.b : [Ljava/lang/String;
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
    //   212: bipush #61
    //   214: goto -> 244
    //   217: bipush #13
    //   219: goto -> 244
    //   222: bipush #34
    //   224: goto -> 244
    //   227: bipush #83
    //   229: goto -> 244
    //   232: bipush #125
    //   234: goto -> 244
    //   237: bipush #87
    //   239: goto -> 244
    //   242: bipush #82
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
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: sipush #151
    //   303: anewarray java/lang/String
    //   306: dup
    //   307: iconst_0
    //   308: sipush #-8202
    //   311: sipush #21852
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: aastore
    //   318: dup
    //   319: iconst_1
    //   320: sipush #-8258
    //   323: sipush #26116
    //   326: invokestatic a : (II)Ljava/lang/String;
    //   329: aastore
    //   330: dup
    //   331: iconst_2
    //   332: sipush #-8216
    //   335: sipush #28267
    //   338: invokestatic a : (II)Ljava/lang/String;
    //   341: aastore
    //   342: dup
    //   343: iconst_3
    //   344: sipush #-8253
    //   347: sipush #8322
    //   350: invokestatic a : (II)Ljava/lang/String;
    //   353: aastore
    //   354: dup
    //   355: iconst_4
    //   356: sipush #-8375
    //   359: sipush #18486
    //   362: invokestatic a : (II)Ljava/lang/String;
    //   365: aastore
    //   366: dup
    //   367: iconst_5
    //   368: sipush #-8284
    //   371: sipush #-1140
    //   374: invokestatic a : (II)Ljava/lang/String;
    //   377: aastore
    //   378: dup
    //   379: bipush #6
    //   381: sipush #-8318
    //   384: sipush #-17505
    //   387: invokestatic a : (II)Ljava/lang/String;
    //   390: aastore
    //   391: dup
    //   392: bipush #7
    //   394: sipush #-8233
    //   397: sipush #-24563
    //   400: invokestatic a : (II)Ljava/lang/String;
    //   403: aastore
    //   404: dup
    //   405: bipush #8
    //   407: sipush #-8314
    //   410: sipush #26933
    //   413: invokestatic a : (II)Ljava/lang/String;
    //   416: aastore
    //   417: dup
    //   418: bipush #9
    //   420: sipush #-8380
    //   423: sipush #-8595
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: aastore
    //   430: dup
    //   431: bipush #10
    //   433: sipush #-8300
    //   436: sipush #5057
    //   439: invokestatic a : (II)Ljava/lang/String;
    //   442: aastore
    //   443: dup
    //   444: bipush #11
    //   446: sipush #-8374
    //   449: sipush #-30446
    //   452: invokestatic a : (II)Ljava/lang/String;
    //   455: aastore
    //   456: dup
    //   457: bipush #12
    //   459: sipush #-8293
    //   462: sipush #12841
    //   465: invokestatic a : (II)Ljava/lang/String;
    //   468: aastore
    //   469: dup
    //   470: bipush #13
    //   472: sipush #-8277
    //   475: sipush #-3888
    //   478: invokestatic a : (II)Ljava/lang/String;
    //   481: aastore
    //   482: dup
    //   483: bipush #14
    //   485: sipush #-8195
    //   488: sipush #-13747
    //   491: invokestatic a : (II)Ljava/lang/String;
    //   494: aastore
    //   495: dup
    //   496: bipush #15
    //   498: sipush #-8288
    //   501: sipush #21543
    //   504: invokestatic a : (II)Ljava/lang/String;
    //   507: aastore
    //   508: dup
    //   509: bipush #16
    //   511: sipush #-8267
    //   514: sipush #-5769
    //   517: invokestatic a : (II)Ljava/lang/String;
    //   520: aastore
    //   521: dup
    //   522: bipush #17
    //   524: sipush #-8370
    //   527: sipush #22614
    //   530: invokestatic a : (II)Ljava/lang/String;
    //   533: aastore
    //   534: dup
    //   535: bipush #18
    //   537: sipush #-8357
    //   540: sipush #-30711
    //   543: invokestatic a : (II)Ljava/lang/String;
    //   546: aastore
    //   547: dup
    //   548: bipush #19
    //   550: sipush #-8265
    //   553: sipush #-14062
    //   556: invokestatic a : (II)Ljava/lang/String;
    //   559: aastore
    //   560: dup
    //   561: bipush #20
    //   563: sipush #-8331
    //   566: sipush #10573
    //   569: invokestatic a : (II)Ljava/lang/String;
    //   572: aastore
    //   573: dup
    //   574: bipush #21
    //   576: sipush #-8289
    //   579: sipush #-32519
    //   582: invokestatic a : (II)Ljava/lang/String;
    //   585: aastore
    //   586: dup
    //   587: bipush #22
    //   589: sipush #-8228
    //   592: sipush #30766
    //   595: invokestatic a : (II)Ljava/lang/String;
    //   598: aastore
    //   599: dup
    //   600: bipush #23
    //   602: sipush #-8254
    //   605: sipush #186
    //   608: invokestatic a : (II)Ljava/lang/String;
    //   611: aastore
    //   612: dup
    //   613: bipush #24
    //   615: sipush #-8270
    //   618: sipush #14952
    //   621: invokestatic a : (II)Ljava/lang/String;
    //   624: aastore
    //   625: dup
    //   626: bipush #25
    //   628: sipush #-8358
    //   631: sipush #5561
    //   634: invokestatic a : (II)Ljava/lang/String;
    //   637: aastore
    //   638: dup
    //   639: bipush #26
    //   641: sipush #-8234
    //   644: sipush #4633
    //   647: invokestatic a : (II)Ljava/lang/String;
    //   650: aastore
    //   651: dup
    //   652: bipush #27
    //   654: sipush #-8355
    //   657: sipush #3515
    //   660: invokestatic a : (II)Ljava/lang/String;
    //   663: aastore
    //   664: dup
    //   665: bipush #28
    //   667: sipush #-8215
    //   670: sipush #-14509
    //   673: invokestatic a : (II)Ljava/lang/String;
    //   676: aastore
    //   677: dup
    //   678: bipush #29
    //   680: sipush #-8294
    //   683: sipush #-22644
    //   686: invokestatic a : (II)Ljava/lang/String;
    //   689: aastore
    //   690: dup
    //   691: bipush #30
    //   693: sipush #-8246
    //   696: sipush #9293
    //   699: invokestatic a : (II)Ljava/lang/String;
    //   702: aastore
    //   703: dup
    //   704: bipush #31
    //   706: sipush #-8232
    //   709: sipush #10873
    //   712: invokestatic a : (II)Ljava/lang/String;
    //   715: aastore
    //   716: dup
    //   717: bipush #32
    //   719: sipush #-8368
    //   722: sipush #-5011
    //   725: invokestatic a : (II)Ljava/lang/String;
    //   728: aastore
    //   729: dup
    //   730: bipush #33
    //   732: sipush #-8242
    //   735: sipush #31129
    //   738: invokestatic a : (II)Ljava/lang/String;
    //   741: aastore
    //   742: dup
    //   743: bipush #34
    //   745: sipush #-8203
    //   748: sipush #-23954
    //   751: invokestatic a : (II)Ljava/lang/String;
    //   754: aastore
    //   755: dup
    //   756: bipush #35
    //   758: sipush #-8359
    //   761: sipush #32442
    //   764: invokestatic a : (II)Ljava/lang/String;
    //   767: aastore
    //   768: dup
    //   769: bipush #36
    //   771: sipush #-8313
    //   774: sipush #8557
    //   777: invokestatic a : (II)Ljava/lang/String;
    //   780: aastore
    //   781: dup
    //   782: bipush #37
    //   784: sipush #-8372
    //   787: sipush #2090
    //   790: invokestatic a : (II)Ljava/lang/String;
    //   793: aastore
    //   794: dup
    //   795: bipush #38
    //   797: sipush #-8290
    //   800: sipush #29458
    //   803: invokestatic a : (II)Ljava/lang/String;
    //   806: aastore
    //   807: dup
    //   808: bipush #39
    //   810: sipush #-8196
    //   813: sipush #23624
    //   816: invokestatic a : (II)Ljava/lang/String;
    //   819: aastore
    //   820: dup
    //   821: bipush #40
    //   823: sipush #-8364
    //   826: sipush #-28769
    //   829: invokestatic a : (II)Ljava/lang/String;
    //   832: aastore
    //   833: dup
    //   834: bipush #41
    //   836: sipush #-8212
    //   839: sipush #29573
    //   842: invokestatic a : (II)Ljava/lang/String;
    //   845: aastore
    //   846: dup
    //   847: bipush #42
    //   849: sipush #-8222
    //   852: sipush #-1393
    //   855: invokestatic a : (II)Ljava/lang/String;
    //   858: aastore
    //   859: dup
    //   860: bipush #43
    //   862: sipush #-8311
    //   865: sipush #16862
    //   868: invokestatic a : (II)Ljava/lang/String;
    //   871: aastore
    //   872: dup
    //   873: bipush #44
    //   875: sipush #-8230
    //   878: sipush #8205
    //   881: invokestatic a : (II)Ljava/lang/String;
    //   884: aastore
    //   885: dup
    //   886: bipush #45
    //   888: sipush #-8286
    //   891: sipush #-29749
    //   894: invokestatic a : (II)Ljava/lang/String;
    //   897: aastore
    //   898: dup
    //   899: bipush #46
    //   901: sipush #-8239
    //   904: sipush #-29217
    //   907: invokestatic a : (II)Ljava/lang/String;
    //   910: aastore
    //   911: dup
    //   912: bipush #47
    //   914: sipush #-8201
    //   917: sipush #-16752
    //   920: invokestatic a : (II)Ljava/lang/String;
    //   923: aastore
    //   924: dup
    //   925: bipush #48
    //   927: sipush #-8218
    //   930: sipush #23562
    //   933: invokestatic a : (II)Ljava/lang/String;
    //   936: aastore
    //   937: dup
    //   938: bipush #49
    //   940: sipush #-8369
    //   943: sipush #12999
    //   946: invokestatic a : (II)Ljava/lang/String;
    //   949: aastore
    //   950: dup
    //   951: bipush #50
    //   953: sipush #-8219
    //   956: sipush #-11145
    //   959: invokestatic a : (II)Ljava/lang/String;
    //   962: aastore
    //   963: dup
    //   964: bipush #51
    //   966: sipush #-8205
    //   969: sipush #11435
    //   972: invokestatic a : (II)Ljava/lang/String;
    //   975: aastore
    //   976: dup
    //   977: bipush #52
    //   979: sipush #-8268
    //   982: sipush #-32262
    //   985: invokestatic a : (II)Ljava/lang/String;
    //   988: aastore
    //   989: dup
    //   990: bipush #53
    //   992: sipush #-8356
    //   995: sipush #29059
    //   998: invokestatic a : (II)Ljava/lang/String;
    //   1001: aastore
    //   1002: dup
    //   1003: bipush #54
    //   1005: sipush #-8226
    //   1008: sipush #16387
    //   1011: invokestatic a : (II)Ljava/lang/String;
    //   1014: aastore
    //   1015: dup
    //   1016: bipush #55
    //   1018: sipush #-8272
    //   1021: sipush #-1004
    //   1024: invokestatic a : (II)Ljava/lang/String;
    //   1027: aastore
    //   1028: dup
    //   1029: bipush #56
    //   1031: sipush #-8292
    //   1034: sipush #-26258
    //   1037: invokestatic a : (II)Ljava/lang/String;
    //   1040: aastore
    //   1041: dup
    //   1042: bipush #57
    //   1044: sipush #-8336
    //   1047: sipush #-31430
    //   1050: invokestatic a : (II)Ljava/lang/String;
    //   1053: aastore
    //   1054: dup
    //   1055: bipush #58
    //   1057: sipush #-8285
    //   1060: sipush #19434
    //   1063: invokestatic a : (II)Ljava/lang/String;
    //   1066: aastore
    //   1067: dup
    //   1068: bipush #59
    //   1070: sipush #-8302
    //   1073: sipush #19793
    //   1076: invokestatic a : (II)Ljava/lang/String;
    //   1079: aastore
    //   1080: dup
    //   1081: bipush #60
    //   1083: sipush #-8367
    //   1086: sipush #30221
    //   1089: invokestatic a : (II)Ljava/lang/String;
    //   1092: aastore
    //   1093: dup
    //   1094: bipush #61
    //   1096: sipush #-8223
    //   1099: sipush #24922
    //   1102: invokestatic a : (II)Ljava/lang/String;
    //   1105: aastore
    //   1106: dup
    //   1107: bipush #62
    //   1109: sipush #-8362
    //   1112: sipush #15988
    //   1115: invokestatic a : (II)Ljava/lang/String;
    //   1118: aastore
    //   1119: dup
    //   1120: bipush #63
    //   1122: sipush #-8259
    //   1125: sipush #18088
    //   1128: invokestatic a : (II)Ljava/lang/String;
    //   1131: aastore
    //   1132: dup
    //   1133: bipush #64
    //   1135: sipush #-8382
    //   1138: sipush #17039
    //   1141: invokestatic a : (II)Ljava/lang/String;
    //   1144: aastore
    //   1145: dup
    //   1146: bipush #65
    //   1148: sipush #-8220
    //   1151: sipush #-6374
    //   1154: invokestatic a : (II)Ljava/lang/String;
    //   1157: aastore
    //   1158: dup
    //   1159: bipush #66
    //   1161: sipush #-8276
    //   1164: bipush #46
    //   1166: invokestatic a : (II)Ljava/lang/String;
    //   1169: aastore
    //   1170: dup
    //   1171: bipush #67
    //   1173: sipush #-8274
    //   1176: sipush #31932
    //   1179: invokestatic a : (II)Ljava/lang/String;
    //   1182: aastore
    //   1183: dup
    //   1184: bipush #68
    //   1186: sipush #-8210
    //   1189: sipush #20841
    //   1192: invokestatic a : (II)Ljava/lang/String;
    //   1195: aastore
    //   1196: dup
    //   1197: bipush #69
    //   1199: sipush #-8333
    //   1202: sipush #26009
    //   1205: invokestatic a : (II)Ljava/lang/String;
    //   1208: aastore
    //   1209: dup
    //   1210: bipush #70
    //   1212: sipush #-8280
    //   1215: bipush #-84
    //   1217: invokestatic a : (II)Ljava/lang/String;
    //   1220: aastore
    //   1221: dup
    //   1222: bipush #71
    //   1224: sipush #-8231
    //   1227: sipush #-8429
    //   1230: invokestatic a : (II)Ljava/lang/String;
    //   1233: aastore
    //   1234: dup
    //   1235: bipush #72
    //   1237: sipush #-8257
    //   1240: sipush #-11750
    //   1243: invokestatic a : (II)Ljava/lang/String;
    //   1246: aastore
    //   1247: dup
    //   1248: bipush #73
    //   1250: sipush #-8361
    //   1253: sipush #-27696
    //   1256: invokestatic a : (II)Ljava/lang/String;
    //   1259: aastore
    //   1260: dup
    //   1261: bipush #74
    //   1263: sipush #-8354
    //   1266: sipush #7554
    //   1269: invokestatic a : (II)Ljava/lang/String;
    //   1272: aastore
    //   1273: dup
    //   1274: bipush #75
    //   1276: sipush #-8373
    //   1279: sipush #12124
    //   1282: invokestatic a : (II)Ljava/lang/String;
    //   1285: aastore
    //   1286: dup
    //   1287: bipush #76
    //   1289: sipush #-8229
    //   1292: sipush #-5366
    //   1295: invokestatic a : (II)Ljava/lang/String;
    //   1298: aastore
    //   1299: dup
    //   1300: bipush #77
    //   1302: sipush #-8245
    //   1305: sipush #13562
    //   1308: invokestatic a : (II)Ljava/lang/String;
    //   1311: aastore
    //   1312: dup
    //   1313: bipush #78
    //   1315: sipush #-8227
    //   1318: sipush #-12724
    //   1321: invokestatic a : (II)Ljava/lang/String;
    //   1324: aastore
    //   1325: dup
    //   1326: bipush #79
    //   1328: sipush #-8197
    //   1331: sipush #1899
    //   1334: invokestatic a : (II)Ljava/lang/String;
    //   1337: aastore
    //   1338: dup
    //   1339: bipush #80
    //   1341: sipush #-8249
    //   1344: sipush #22771
    //   1347: invokestatic a : (II)Ljava/lang/String;
    //   1350: aastore
    //   1351: dup
    //   1352: bipush #81
    //   1354: sipush #-8308
    //   1357: sipush #-24644
    //   1360: invokestatic a : (II)Ljava/lang/String;
    //   1363: aastore
    //   1364: dup
    //   1365: bipush #82
    //   1367: sipush #-8329
    //   1370: sipush #-8222
    //   1373: invokestatic a : (II)Ljava/lang/String;
    //   1376: aastore
    //   1377: dup
    //   1378: bipush #83
    //   1380: sipush #-8262
    //   1383: sipush #-14997
    //   1386: invokestatic a : (II)Ljava/lang/String;
    //   1389: aastore
    //   1390: dup
    //   1391: bipush #84
    //   1393: sipush #-8304
    //   1396: sipush #-25777
    //   1399: invokestatic a : (II)Ljava/lang/String;
    //   1402: aastore
    //   1403: dup
    //   1404: bipush #85
    //   1406: sipush #-8225
    //   1409: sipush #-1685
    //   1412: invokestatic a : (II)Ljava/lang/String;
    //   1415: aastore
    //   1416: dup
    //   1417: bipush #86
    //   1419: sipush #-8365
    //   1422: sipush #11773
    //   1425: invokestatic a : (II)Ljava/lang/String;
    //   1428: aastore
    //   1429: dup
    //   1430: bipush #87
    //   1432: sipush #-8236
    //   1435: sipush #1869
    //   1438: invokestatic a : (II)Ljava/lang/String;
    //   1441: aastore
    //   1442: dup
    //   1443: bipush #88
    //   1445: sipush #-8330
    //   1448: sipush #7146
    //   1451: invokestatic a : (II)Ljava/lang/String;
    //   1454: aastore
    //   1455: dup
    //   1456: bipush #89
    //   1458: sipush #-8243
    //   1461: sipush #-13278
    //   1464: invokestatic a : (II)Ljava/lang/String;
    //   1467: aastore
    //   1468: dup
    //   1469: bipush #90
    //   1471: sipush #-8238
    //   1474: sipush #-22341
    //   1477: invokestatic a : (II)Ljava/lang/String;
    //   1480: aastore
    //   1481: dup
    //   1482: bipush #91
    //   1484: sipush #-8281
    //   1487: sipush #-22881
    //   1490: invokestatic a : (II)Ljava/lang/String;
    //   1493: aastore
    //   1494: dup
    //   1495: bipush #92
    //   1497: sipush #-8295
    //   1500: sipush #9697
    //   1503: invokestatic a : (II)Ljava/lang/String;
    //   1506: aastore
    //   1507: dup
    //   1508: bipush #93
    //   1510: sipush #-8335
    //   1513: sipush #-6894
    //   1516: invokestatic a : (II)Ljava/lang/String;
    //   1519: aastore
    //   1520: dup
    //   1521: bipush #94
    //   1523: sipush #-8305
    //   1526: sipush #20071
    //   1529: invokestatic a : (II)Ljava/lang/String;
    //   1532: aastore
    //   1533: dup
    //   1534: bipush #95
    //   1536: sipush #-8256
    //   1539: sipush #-3121
    //   1542: invokestatic a : (II)Ljava/lang/String;
    //   1545: aastore
    //   1546: dup
    //   1547: bipush #96
    //   1549: sipush #-8263
    //   1552: sipush #9627
    //   1555: invokestatic a : (II)Ljava/lang/String;
    //   1558: aastore
    //   1559: dup
    //   1560: bipush #97
    //   1562: sipush #-8266
    //   1565: sipush #29213
    //   1568: invokestatic a : (II)Ljava/lang/String;
    //   1571: aastore
    //   1572: dup
    //   1573: bipush #98
    //   1575: sipush #-8278
    //   1578: sipush #29331
    //   1581: invokestatic a : (II)Ljava/lang/String;
    //   1584: aastore
    //   1585: dup
    //   1586: bipush #99
    //   1588: sipush #-8198
    //   1591: sipush #10604
    //   1594: invokestatic a : (II)Ljava/lang/String;
    //   1597: aastore
    //   1598: dup
    //   1599: bipush #100
    //   1601: sipush #-8384
    //   1604: sipush #-13804
    //   1607: invokestatic a : (II)Ljava/lang/String;
    //   1610: aastore
    //   1611: dup
    //   1612: bipush #101
    //   1614: sipush #-8240
    //   1617: sipush #361
    //   1620: invokestatic a : (II)Ljava/lang/String;
    //   1623: aastore
    //   1624: dup
    //   1625: bipush #102
    //   1627: sipush #-8371
    //   1630: sipush #12261
    //   1633: invokestatic a : (II)Ljava/lang/String;
    //   1636: aastore
    //   1637: dup
    //   1638: bipush #103
    //   1640: sipush #-8379
    //   1643: sipush #-29147
    //   1646: invokestatic a : (II)Ljava/lang/String;
    //   1649: aastore
    //   1650: dup
    //   1651: bipush #104
    //   1653: sipush #-8199
    //   1656: sipush #-28037
    //   1659: invokestatic a : (II)Ljava/lang/String;
    //   1662: aastore
    //   1663: dup
    //   1664: bipush #105
    //   1666: sipush #-8221
    //   1669: sipush #-17651
    //   1672: invokestatic a : (II)Ljava/lang/String;
    //   1675: aastore
    //   1676: dup
    //   1677: bipush #106
    //   1679: sipush #-8251
    //   1682: sipush #-27206
    //   1685: invokestatic a : (II)Ljava/lang/String;
    //   1688: aastore
    //   1689: dup
    //   1690: bipush #107
    //   1692: sipush #-8309
    //   1695: sipush #-22897
    //   1698: invokestatic a : (II)Ljava/lang/String;
    //   1701: aastore
    //   1702: dup
    //   1703: bipush #108
    //   1705: sipush #-8207
    //   1708: sipush #-26068
    //   1711: invokestatic a : (II)Ljava/lang/String;
    //   1714: aastore
    //   1715: dup
    //   1716: bipush #109
    //   1718: sipush #-8271
    //   1721: sipush #-29502
    //   1724: invokestatic a : (II)Ljava/lang/String;
    //   1727: aastore
    //   1728: dup
    //   1729: bipush #110
    //   1731: sipush #-8237
    //   1734: sipush #-12028
    //   1737: invokestatic a : (II)Ljava/lang/String;
    //   1740: aastore
    //   1741: dup
    //   1742: bipush #111
    //   1744: sipush #-8287
    //   1747: sipush #6450
    //   1750: invokestatic a : (II)Ljava/lang/String;
    //   1753: aastore
    //   1754: dup
    //   1755: bipush #112
    //   1757: sipush #-8363
    //   1760: sipush #28660
    //   1763: invokestatic a : (II)Ljava/lang/String;
    //   1766: aastore
    //   1767: dup
    //   1768: bipush #113
    //   1770: sipush #-8378
    //   1773: sipush #-14072
    //   1776: invokestatic a : (II)Ljava/lang/String;
    //   1779: aastore
    //   1780: dup
    //   1781: bipush #114
    //   1783: sipush #-8269
    //   1786: sipush #-30261
    //   1789: invokestatic a : (II)Ljava/lang/String;
    //   1792: aastore
    //   1793: dup
    //   1794: bipush #115
    //   1796: sipush #-8282
    //   1799: sipush #10011
    //   1802: invokestatic a : (II)Ljava/lang/String;
    //   1805: aastore
    //   1806: dup
    //   1807: bipush #116
    //   1809: sipush #-8213
    //   1812: sipush #-2338
    //   1815: invokestatic a : (II)Ljava/lang/String;
    //   1818: aastore
    //   1819: dup
    //   1820: bipush #117
    //   1822: sipush #-8306
    //   1825: sipush #-21371
    //   1828: invokestatic a : (II)Ljava/lang/String;
    //   1831: aastore
    //   1832: dup
    //   1833: bipush #118
    //   1835: sipush #-8247
    //   1838: sipush #19921
    //   1841: invokestatic a : (II)Ljava/lang/String;
    //   1844: aastore
    //   1845: dup
    //   1846: bipush #119
    //   1848: sipush #-8252
    //   1851: sipush #22680
    //   1854: invokestatic a : (II)Ljava/lang/String;
    //   1857: aastore
    //   1858: dup
    //   1859: bipush #120
    //   1861: sipush #-8260
    //   1864: sipush #-4276
    //   1867: invokestatic a : (II)Ljava/lang/String;
    //   1870: aastore
    //   1871: dup
    //   1872: bipush #121
    //   1874: sipush #-8310
    //   1877: sipush #12091
    //   1880: invokestatic a : (II)Ljava/lang/String;
    //   1883: aastore
    //   1884: dup
    //   1885: bipush #122
    //   1887: sipush #-8315
    //   1890: sipush #32009
    //   1893: invokestatic a : (II)Ljava/lang/String;
    //   1896: aastore
    //   1897: dup
    //   1898: bipush #123
    //   1900: sipush #-8383
    //   1903: sipush #-24610
    //   1906: invokestatic a : (II)Ljava/lang/String;
    //   1909: aastore
    //   1910: dup
    //   1911: bipush #124
    //   1913: sipush #-8273
    //   1916: sipush #15177
    //   1919: invokestatic a : (II)Ljava/lang/String;
    //   1922: aastore
    //   1923: dup
    //   1924: bipush #125
    //   1926: sipush #-8209
    //   1929: sipush #30040
    //   1932: invokestatic a : (II)Ljava/lang/String;
    //   1935: aastore
    //   1936: dup
    //   1937: bipush #126
    //   1939: sipush #-8214
    //   1942: sipush #9844
    //   1945: invokestatic a : (II)Ljava/lang/String;
    //   1948: aastore
    //   1949: dup
    //   1950: bipush #127
    //   1952: sipush #-8241
    //   1955: sipush #17114
    //   1958: invokestatic a : (II)Ljava/lang/String;
    //   1961: aastore
    //   1962: dup
    //   1963: sipush #128
    //   1966: sipush #-8217
    //   1969: sipush #-16637
    //   1972: invokestatic a : (II)Ljava/lang/String;
    //   1975: aastore
    //   1976: dup
    //   1977: sipush #129
    //   1980: sipush #-8376
    //   1983: sipush #23539
    //   1986: invokestatic a : (II)Ljava/lang/String;
    //   1989: aastore
    //   1990: dup
    //   1991: sipush #130
    //   1994: sipush #-8261
    //   1997: sipush #-26084
    //   2000: invokestatic a : (II)Ljava/lang/String;
    //   2003: aastore
    //   2004: dup
    //   2005: sipush #131
    //   2008: sipush #-8301
    //   2011: sipush #656
    //   2014: invokestatic a : (II)Ljava/lang/String;
    //   2017: aastore
    //   2018: dup
    //   2019: sipush #132
    //   2022: sipush #-8317
    //   2025: sipush #-17789
    //   2028: invokestatic a : (II)Ljava/lang/String;
    //   2031: aastore
    //   2032: dup
    //   2033: sipush #133
    //   2036: sipush #-8291
    //   2039: sipush #-18408
    //   2042: invokestatic a : (II)Ljava/lang/String;
    //   2045: aastore
    //   2046: dup
    //   2047: sipush #134
    //   2050: sipush #-8316
    //   2053: sipush #-14996
    //   2056: invokestatic a : (II)Ljava/lang/String;
    //   2059: aastore
    //   2060: dup
    //   2061: sipush #135
    //   2064: sipush #-8204
    //   2067: sipush #3004
    //   2070: invokestatic a : (II)Ljava/lang/String;
    //   2073: aastore
    //   2074: dup
    //   2075: sipush #136
    //   2078: sipush #-8299
    //   2081: sipush #-16892
    //   2084: invokestatic a : (II)Ljava/lang/String;
    //   2087: aastore
    //   2088: dup
    //   2089: sipush #137
    //   2092: sipush #-8200
    //   2095: sipush #-1207
    //   2098: invokestatic a : (II)Ljava/lang/String;
    //   2101: aastore
    //   2102: dup
    //   2103: sipush #138
    //   2106: sipush #-8250
    //   2109: sipush #-18631
    //   2112: invokestatic a : (II)Ljava/lang/String;
    //   2115: aastore
    //   2116: dup
    //   2117: sipush #139
    //   2120: sipush #-8283
    //   2123: sipush #7161
    //   2126: invokestatic a : (II)Ljava/lang/String;
    //   2129: aastore
    //   2130: dup
    //   2131: sipush #140
    //   2134: sipush #-8211
    //   2137: sipush #-27866
    //   2140: invokestatic a : (II)Ljava/lang/String;
    //   2143: aastore
    //   2144: dup
    //   2145: sipush #141
    //   2148: sipush #-8193
    //   2151: sipush #23860
    //   2154: invokestatic a : (II)Ljava/lang/String;
    //   2157: aastore
    //   2158: dup
    //   2159: sipush #142
    //   2162: sipush #-8297
    //   2165: sipush #30061
    //   2168: invokestatic a : (II)Ljava/lang/String;
    //   2171: aastore
    //   2172: dup
    //   2173: sipush #143
    //   2176: sipush #-8360
    //   2179: sipush #-7047
    //   2182: invokestatic a : (II)Ljava/lang/String;
    //   2185: aastore
    //   2186: dup
    //   2187: sipush #144
    //   2190: sipush #-8332
    //   2193: sipush #18132
    //   2196: invokestatic a : (II)Ljava/lang/String;
    //   2199: aastore
    //   2200: dup
    //   2201: sipush #145
    //   2204: sipush #-8319
    //   2207: sipush #-8213
    //   2210: invokestatic a : (II)Ljava/lang/String;
    //   2213: aastore
    //   2214: dup
    //   2215: sipush #146
    //   2218: sipush #-8275
    //   2221: sipush #30615
    //   2224: invokestatic a : (II)Ljava/lang/String;
    //   2227: aastore
    //   2228: dup
    //   2229: sipush #147
    //   2232: sipush #-8296
    //   2235: sipush #-17752
    //   2238: invokestatic a : (II)Ljava/lang/String;
    //   2241: aastore
    //   2242: dup
    //   2243: sipush #148
    //   2246: sipush #-8194
    //   2249: sipush #-31600
    //   2252: invokestatic a : (II)Ljava/lang/String;
    //   2255: aastore
    //   2256: dup
    //   2257: sipush #149
    //   2260: sipush #-8377
    //   2263: sipush #-26119
    //   2266: invokestatic a : (II)Ljava/lang/String;
    //   2269: aastore
    //   2270: dup
    //   2271: sipush #150
    //   2274: sipush #-8206
    //   2277: sipush #24523
    //   2280: invokestatic a : (II)Ljava/lang/String;
    //   2283: aastore
    //   2284: putstatic burp/Zrcr.ZY : [Ljava/lang/String;
    //   2287: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDFD3) & 0xFFFF;
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
      char c = 'È';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrcr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */