package burp;

import java.io.IOException;
import java.io.Reader;
import javax.swing.text.Segment;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zeyn extends Zeyj {
  private static final char[] Zj;
  
  private static final int[] ZB;
  
  private static final int[] Zk;
  
  private static final int[] Zb;
  
  private static final String[] ZR;
  
  private static final int[] ZH;
  
  private Reader ZQ;
  
  private int Za;
  
  private int ZO = 0;
  
  private char[] Zl = new char[16384];
  
  private int ZD;
  
  private int Zi;
  
  private int Zc;
  
  private int Zw;
  
  private int ZW;
  
  private boolean ZZ = true;
  
  private boolean ZN;
  
  private boolean Zg;
  
  private static String Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private static int[] Zm() {
    int[] arrayOfInt = new int[56];
    int i = 0;
    i = Zc(a(-1158, -3084), i, arrayOfInt);
    return arrayOfInt;
  }
  
  private static int Zc(String paramString, int paramInt, int[] paramArrayOfint) {
    byte b = 0;
    int i = paramInt;
    int j = paramString.length();
    label12: while (b < j) {
      char c1 = paramString.charAt(b++);
      char c2 = paramString.charAt(b++);
      try {
        while (true) {
          paramArrayOfint[i++] = c2;
          if (--c1 <= '\000')
            continue label12; 
        } 
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        throw a(null);
      } 
    } 
    return i;
  }
  
  private static int[] Zp() {
    int[] arrayOfInt = new int[56];
    int i = 0;
    i = ZO(a(-1156, 30197), i, arrayOfInt);
    return arrayOfInt;
  }
  
  private static int ZO(String paramString, int paramInt, int[] paramArrayOfint) {
    byte b = 0;
    int i = paramInt;
    int j = paramString.length();
    while (b < j) {
      int k = paramString.charAt(b++) << 16;
      paramArrayOfint[i++] = k | paramString.charAt(b++);
    } 
    return i;
  }
  
  private static int[] ZV() {
    int[] arrayOfInt = new int[1472];
    int i = 0;
    i = Zg(a(-1160, -902), i, arrayOfInt);
    return arrayOfInt;
  }
  
  private static int Zg(String paramString, int paramInt, int[] paramArrayOfint) {
    byte b = 0;
    int i = paramInt;
    int j = paramString.length();
    label12: while (b < j) {
      char c1 = paramString.charAt(b++);
      char c2 = paramString.charAt(b++);
      c2--;
      try {
        while (true) {
          paramArrayOfint[i++] = c2;
          if (--c1 <= '\000')
            continue label12; 
        } 
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        throw a(null);
      } 
    } 
    return i;
  }
  
  private static int[] Zr() {
    int[] arrayOfInt = new int[56];
    int i = 0;
    i = Zu(a(-1154, -19847), i, arrayOfInt);
    return arrayOfInt;
  }
  
  private static int Zu(String paramString, int paramInt, int[] paramArrayOfint) {
    byte b = 0;
    int i = paramInt;
    int j = paramString.length();
    label12: while (b < j) {
      char c1 = paramString.charAt(b++);
      char c2 = paramString.charAt(b++);
      try {
        while (true) {
          paramArrayOfint[i++] = c2;
          if (--c1 <= '\000')
            continue label12; 
        } 
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        throw a(null);
      } 
    } 
    return i;
  }
  
  public Zeyn() {}
  
  public Zeyn(Zmpr paramZmpr) {
    super(paramZmpr);
  }
  
  public static Zeyn ZM() {
    return new Zeyn(new Zr6o(new Zghs()));
  }
  
  private void Ze(int paramInt) {
    Zb(this.Zw, this.ZD - 1, paramInt);
  }
  
  private void Zb(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt1 + this.ZM;
    Zq(this.Zl, paramInt1, paramInt2, paramInt3, i);
  }
  
  public Zska Zq(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Zska zska = super.Zq(paramArrayOfchar, paramInt1, paramInt2, paramInt3, paramInt4);
    this.Zw = this.ZD;
    return zska;
  }
  
  public Ze7g Z_(int paramInt1, Segment paramSegment, Zska paramZska, int paramInt2) {
    ZS();
    this.ZM = -paramSegment.offset + paramInt2;
    boolean bool = false;
    this.ZJ = paramSegment.offset;
    this.ZC = paramSegment;
    try {
      ZM(this.ZQ);
      Zc(bool);
      return Zy();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
      return new Ze7g();
    } 
  }
  
  private boolean ZQ() {
    try {
    
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    return (this.Zc >= this.ZC.offset + this.ZC.count);
  }
  
  public final void ZM(Reader paramReader) {
    this.Zl = this.ZC.array;
    this.Zw = this.ZC.offset;
    this.ZW = this.Zw + this.ZC.count - 1;
    this.Zc = this.ZD = this.ZC.offset;
    this.ZO = 0;
    this.ZQ = paramReader;
    this.ZZ = true;
    this.ZN = false;
  }
  
  private static char[] ZI(String paramString) {
    char[] arrayOfChar = new char[65536];
    byte b1 = 0;
    byte b2 = 0;
    label12: while (b1 < 124) {
      char c1 = paramString.charAt(b1++);
      char c2 = paramString.charAt(b1++);
      try {
        while (true) {
          arrayOfChar[b2++] = c2;
          if (--c1 <= '\000')
            continue label12; 
        } 
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        throw a(null);
      } 
    } 
    return arrayOfChar;
  }
  
  public final void Zc(int paramInt) {
    this.ZO = paramInt;
  }
  
  private void Zr(int paramInt) {
    String str;
    try {
      str = ZR[paramInt];
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      Zah.Zl(arrayIndexOutOfBoundsException, Zk_.UNEXPECTED);
      str = ZR[0];
    } 
    throw new Error(str);
  }
  
  public Ze7g Zy() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZW : I
    //   4: istore #6
    //   6: invokestatic Zd : ()Ljava/lang/String;
    //   9: aload_0
    //   10: getfield Zl : [C
    //   13: astore #7
    //   15: astore_1
    //   16: getstatic burp/Zeyn.Zj : [C
    //   19: astore #8
    //   21: getstatic burp/Zeyn.Zb : [I
    //   24: astore #9
    //   26: getstatic burp/Zeyn.Zk : [I
    //   29: astore #10
    //   31: getstatic burp/Zeyn.ZH : [I
    //   34: astore #11
    //   36: aload_0
    //   37: iconst_m1
    //   38: dup_x1
    //   39: putfield Zi : I
    //   42: istore #12
    //   44: aload_0
    //   45: getfield ZD : I
    //   48: istore #5
    //   50: iconst_m1
    //   51: istore_3
    //   52: aload_0
    //   53: aload_0
    //   54: iload #5
    //   56: dup_x1
    //   57: putfield Zw : I
    //   60: dup_x1
    //   61: putfield Zc : I
    //   64: istore #4
    //   66: aload_0
    //   67: aload_0
    //   68: getfield ZO : I
    //   71: putfield Za : I
    //   74: iconst_0
    //   75: istore #13
    //   77: iload #4
    //   79: iload #6
    //   81: if_icmpge -> 111
    //   84: aload #7
    //   86: iload #4
    //   88: iinc #4, 1
    //   91: caload
    //   92: istore_2
    //   93: aload_1
    //   94: ifnonnull -> 198
    //   97: iconst_1
    //   98: anewarray burp/Zbqc
    //   101: invokestatic Zr : ([Lburp/Zbqc;)V
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   110: athrow
    //   111: aload_0
    //   112: getfield ZN : Z
    //   115: ifeq -> 124
    //   118: iconst_m1
    //   119: istore_2
    //   120: aload_1
    //   121: ifnonnull -> 319
    //   124: aload_0
    //   125: iload #4
    //   127: putfield Zc : I
    //   130: aload_0
    //   131: iload #5
    //   133: putfield ZD : I
    //   136: aload_0
    //   137: iload #12
    //   139: putfield Zi : I
    //   142: aload_0
    //   143: invokevirtual ZQ : ()Z
    //   146: istore #14
    //   148: aload_0
    //   149: getfield Zc : I
    //   152: istore #4
    //   154: aload_0
    //   155: getfield ZD : I
    //   158: istore #5
    //   160: aload_0
    //   161: getfield Zl : [C
    //   164: astore #7
    //   166: aload_0
    //   167: getfield ZW : I
    //   170: istore #6
    //   172: aload_0
    //   173: getfield Zi : I
    //   176: istore #12
    //   178: iload #14
    //   180: ifeq -> 189
    //   183: iconst_m1
    //   184: istore_2
    //   185: aload_1
    //   186: ifnonnull -> 319
    //   189: aload #7
    //   191: iload #4
    //   193: iinc #4, 1
    //   196: caload
    //   197: istore_2
    //   198: aload #9
    //   200: aload #10
    //   202: aload_0
    //   203: getfield Za : I
    //   206: iaload
    //   207: aload #8
    //   209: iload_2
    //   210: caload
    //   211: iadd
    //   212: iaload
    //   213: istore #14
    //   215: iload #14
    //   217: iconst_m1
    //   218: if_icmpne -> 228
    //   221: goto -> 319
    //   224: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   227: athrow
    //   228: aload_0
    //   229: iload #14
    //   231: putfield Za : I
    //   234: aload #11
    //   236: aload_0
    //   237: getfield Za : I
    //   240: iaload
    //   241: istore #15
    //   243: iload #15
    //   245: iconst_2
    //   246: iand
    //   247: iconst_2
    //   248: if_icmpne -> 255
    //   251: iload #4
    //   253: istore #12
    //   255: iload #15
    //   257: iconst_1
    //   258: iand
    //   259: iconst_1
    //   260: if_icmpne -> 315
    //   263: iload #15
    //   265: iconst_4
    //   266: iand
    //   267: iconst_4
    //   268: if_icmpne -> 286
    //   271: goto -> 278
    //   274: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   277: athrow
    //   278: iconst_1
    //   279: goto -> 287
    //   282: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   285: athrow
    //   286: iconst_0
    //   287: istore #13
    //   289: aload_0
    //   290: getfield Za : I
    //   293: istore_3
    //   294: iload #4
    //   296: istore #5
    //   298: iload #15
    //   300: bipush #8
    //   302: iand
    //   303: bipush #8
    //   305: if_icmpne -> 315
    //   308: goto -> 319
    //   311: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   314: athrow
    //   315: aload_1
    //   316: ifnonnull -> 77
    //   319: aload_0
    //   320: iload #5
    //   322: putfield ZD : I
    //   325: iload #13
    //   327: ifeq -> 343
    //   330: aload_0
    //   331: iload #12
    //   333: putfield ZD : I
    //   336: goto -> 343
    //   339: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   342: athrow
    //   343: iload_3
    //   344: ifge -> 355
    //   347: iload_3
    //   348: goto -> 360
    //   351: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   354: athrow
    //   355: getstatic burp/Zeyn.ZB : [I
    //   358: iload_3
    //   359: iaload
    //   360: tableswitch default -> 752, 1 -> 513, 2 -> 553, 3 -> 609, 4 -> 679, 5 -> 742, 6 -> 738, 7 -> 699, 8 -> 533, 9 -> 629, 10 -> 523, 11 -> 728, 12 -> 543, 13 -> 496, 14 -> 619, 15 -> 563, 16 -> 509, 17 -> 519, 18 -> 529, 19 -> 539, 20 -> 549, 21 -> 559, 22 -> 605, 23 -> 615, 24 -> 625, 25 -> 675, 26 -> 695, 27 -> 724, 28 -> 734, 29 -> 738, 30 -> 748
    //   496: aload_0
    //   497: bipush #6
    //   499: invokevirtual Ze : (I)V
    //   502: goto -> 509
    //   505: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   508: athrow
    //   509: aload_1
    //   510: ifnonnull -> 44
    //   513: aload_0
    //   514: bipush #21
    //   516: invokevirtual Ze : (I)V
    //   519: aload_1
    //   520: ifnonnull -> 44
    //   523: aload_0
    //   524: bipush #11
    //   526: invokevirtual Ze : (I)V
    //   529: aload_1
    //   530: ifnonnull -> 44
    //   533: aload_0
    //   534: bipush #13
    //   536: invokevirtual Ze : (I)V
    //   539: aload_1
    //   540: ifnonnull -> 44
    //   543: aload_0
    //   544: bipush #18
    //   546: invokevirtual Ze : (I)V
    //   549: aload_1
    //   550: ifnonnull -> 44
    //   553: aload_0
    //   554: bipush #22
    //   556: invokevirtual Ze : (I)V
    //   559: aload_1
    //   560: ifnonnull -> 44
    //   563: aload_0
    //   564: getfield Zw : I
    //   567: istore #14
    //   569: aload_0
    //   570: aload_0
    //   571: getfield ZJ : I
    //   574: aload_0
    //   575: getfield Zw : I
    //   578: iconst_1
    //   579: isub
    //   580: iconst_1
    //   581: invokevirtual Zb : (III)V
    //   584: aload_0
    //   585: iload #14
    //   587: aload_0
    //   588: getfield ZD : I
    //   591: iconst_1
    //   592: isub
    //   593: iconst_1
    //   594: invokevirtual Zb : (III)V
    //   597: aload_0
    //   598: aload_0
    //   599: getfield ZD : I
    //   602: putfield ZJ : I
    //   605: aload_1
    //   606: ifnonnull -> 44
    //   609: aload_0
    //   610: bipush #10
    //   612: invokevirtual Ze : (I)V
    //   615: aload_1
    //   616: ifnonnull -> 44
    //   619: aload_0
    //   620: bipush #9
    //   622: invokevirtual Ze : (I)V
    //   625: aload_1
    //   626: ifnonnull -> 44
    //   629: aload_0
    //   630: getfield Zg : Z
    //   633: ifeq -> 662
    //   636: aload_0
    //   637: aload_0
    //   638: getfield ZD : I
    //   641: iconst_2
    //   642: isub
    //   643: putfield ZJ : I
    //   646: aload_0
    //   647: iconst_1
    //   648: invokevirtual Zc : (I)V
    //   651: aload_1
    //   652: ifnonnull -> 675
    //   655: goto -> 662
    //   658: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   661: athrow
    //   662: aload_0
    //   663: bipush #21
    //   665: invokevirtual Ze : (I)V
    //   668: goto -> 675
    //   671: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   674: athrow
    //   675: aload_1
    //   676: ifnonnull -> 44
    //   679: aload_0
    //   680: bipush #38
    //   682: invokevirtual Ze : (I)V
    //   685: aload_0
    //   686: invokevirtual Zf : ()Lburp/Zska;
    //   689: pop
    //   690: aload_0
    //   691: getfield Zz : Lburp/Ze7g;
    //   694: areturn
    //   695: aload_1
    //   696: ifnonnull -> 44
    //   699: aload_0
    //   700: aload_0
    //   701: getfield ZJ : I
    //   704: aload_0
    //   705: getfield Zw : I
    //   708: iconst_1
    //   709: isub
    //   710: iconst_1
    //   711: invokevirtual Zb : (III)V
    //   714: aload_0
    //   715: invokevirtual Zf : ()Lburp/Zska;
    //   718: pop
    //   719: aload_0
    //   720: getfield Zz : Lburp/Ze7g;
    //   723: areturn
    //   724: aload_1
    //   725: ifnonnull -> 44
    //   728: aload_0
    //   729: bipush #38
    //   731: invokevirtual Ze : (I)V
    //   734: aload_1
    //   735: ifnonnull -> 44
    //   738: aload_1
    //   739: ifnonnull -> 44
    //   742: aload_0
    //   743: bipush #23
    //   745: invokevirtual Ze : (I)V
    //   748: aload_1
    //   749: ifnonnull -> 44
    //   752: iload_2
    //   753: iconst_m1
    //   754: if_icmpne -> 881
    //   757: aload_0
    //   758: getfield Zw : I
    //   761: aload_0
    //   762: getfield Zc : I
    //   765: if_icmpne -> 881
    //   768: goto -> 775
    //   771: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   774: athrow
    //   775: aload_0
    //   776: iconst_1
    //   777: putfield ZN : Z
    //   780: aload_0
    //   781: getfield ZO : I
    //   784: lookupswitch default -> 879, 0 -> 865, 1 -> 832, 57 -> 861, 58 -> 875
    //   828: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   831: athrow
    //   832: aload_0
    //   833: aload_0
    //   834: getfield ZJ : I
    //   837: aload_0
    //   838: getfield Zw : I
    //   841: iconst_1
    //   842: isub
    //   843: iconst_1
    //   844: invokevirtual Zb : (III)V
    //   847: aload_0
    //   848: invokevirtual Zf : ()Lburp/Zska;
    //   851: pop
    //   852: aload_0
    //   853: getfield Zz : Lburp/Ze7g;
    //   856: areturn
    //   857: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   860: athrow
    //   861: aload_1
    //   862: ifnonnull -> 44
    //   865: aload_0
    //   866: invokevirtual Zf : ()Lburp/Zska;
    //   869: pop
    //   870: aload_0
    //   871: getfield Zz : Lburp/Ze7g;
    //   874: areturn
    //   875: aload_1
    //   876: ifnonnull -> 44
    //   879: aconst_null
    //   880: areturn
    //   881: aload_0
    //   882: iconst_1
    //   883: invokevirtual Zr : (I)V
    //   886: goto -> 44
    // Exception table:
    //   from	to	target	type
    //   93	104	107	java/io/IOException
    //   215	224	224	java/io/IOException
    //   255	271	274	java/io/IOException
    //   263	282	282	java/io/IOException
    //   298	311	311	java/io/IOException
    //   319	336	339	java/io/IOException
    //   343	351	351	java/io/IOException
    //   360	502	505	java/io/IOException
    //   629	655	658	java/io/IOException
    //   636	668	671	java/io/IOException
    //   752	768	771	java/io/IOException
    //   757	828	828	java/io/IOException
    //   775	857	857	java/io/IOException
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: ldc 'eKRqW'
    //   9: iconst_0
    //   10: istore_3
    //   11: invokestatic ZG : (Ljava/lang/String;)V
    //   14: ldc 'ÎÈù&ñ²FQü°¾à'}é{WØ©¹Át®8êÀ±}ñù6¬è¶Lh °RÒäA"Øk;=½íbùnfXìþùâKåÄà\\nCÕ1gÕÊú!|Å\\fM3L1^§íÅLuyhÒ-Ç2áø*ì7º\\rÝê¬¤\\f·¢J7µVªhÊKã_ÎÈ·°Q]ÀhÈà9¸´µx\\n½IH])ô¶,õ¢Õ¿Ö³/úÅÍ+1F t¼ruiÄt\\r®'FªëqÃÐÆòÿg¦iôÈﾍ}pfÝ(bÙø;/ÔÒW¯Ò)ĕ"Ɓ=ǈ§ǭGvëƃá@àƯƂǴCʾÛ˰xȃɈ®ɖÒ˹#·dɞ?˴ä̛ ̓ÜοϜêϫ]Α̡ I͝OʠîÛ¤γі!ӭ'ҠxмÓӘ}ШÖӭÚљèc_Ԥ7ԗáօEԄ¨ְ¦ׁ×֩Ro\\t\\rhhÁFkpÙEê%\\nªn4SHÔì/Å©e2``ð:^Wì(Æx¹Ç¡ÛÁÇ5§9®¯Gø¨-©®É\\b@s]ÿ)}j«±OHxZLþc"³@'
    //   16: dup
    //   17: astore_2
    //   18: invokevirtual length : ()I
    //   21: istore #4
    //   23: bipush #35
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #124
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 148
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc 'eeþ8d*½Ò¹®è5GgrõoG½yìâ4ʀ»<ð(AúiÞvÚ&BTî\\r~þ½:ËùleÇ)ë¡ÜAø1ÖÎ\\fHòÝuÚ{thyuÀÎ§0æâÉ "Æ|÷z|vçÏvV±7W!þ¢H8vï×§nq¢\\nG<ÐÅâóGÙoí¤8ê{L­èqeÊï\\t9ÂXhj5\\r!ÀÅn¯JqK^u&Ñ9Aä\\t©*Á,ÈBì\\nJg­qjÅJ(°}=\\nÓöU7]D£7¹"B²OZcÉ|u²¦J>ïÈ*@Áÿ´|£Ò/]Aò§ð¡D\\t2l©B wÆ´vÚ ôkÂzj!mD´52ÁÁOo¥âïlÿì;å)¢·R }XÎhÆÛÃ\uWEÓµ(3ÂxC&÷UPÕÖÛ!Ë{.Ä<>=p ªZN.-'a{2#3ÏÝµ´ÙE²EÁUg _Z+S0[!6fÁ[VÄµÞÛ£Nøc÷4®A=¯Ú©»OºÖ½y¯µx>lÜª«+è"ß<Ù,nþÇk£ÿàÍú»Ý¼BiujO2'A+\\t<M-]Ç?¥æÖÄ^Sôq¹ÊÉÙÌjÑMÑbØWA?k4Ñ¢vdMÂåké NðeCôòÂµzä¹iÍ9Ú'òÜzËúèVe0ö\\n:ph5uÄ|ÄE¸{M)0}n®¯ÎºUHªG¦Ñü¿ppRyh}V!¦Y&z\\bvSê:èÔåTów:¾«õÀå,TLÒ4á7K¸\\ruù¿'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #29
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #45
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
    //   134: putstatic burp/Zeyn.a : [Ljava/lang/String;
    //   137: bipush #8
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zeyn.b : [Ljava/lang/String;
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
    //   216: bipush #73
    //   218: goto -> 248
    //   221: bipush #114
    //   223: goto -> 248
    //   226: bipush #6
    //   228: goto -> 248
    //   231: bipush #14
    //   233: goto -> 248
    //   236: bipush #52
    //   238: goto -> 248
    //   241: bipush #49
    //   243: goto -> 248
    //   246: bipush #12
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
    //   287: tableswitch default -> 45, 0 -> 104
    //   304: sipush #-1155
    //   307: sipush #28775
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokestatic ZI : (Ljava/lang/String;)[C
    //   316: putstatic burp/Zeyn.Zj : [C
    //   319: invokestatic Zm : ()[I
    //   322: putstatic burp/Zeyn.ZB : [I
    //   325: invokestatic Zp : ()[I
    //   328: putstatic burp/Zeyn.Zk : [I
    //   331: invokestatic ZV : ()[I
    //   334: putstatic burp/Zeyn.Zb : [I
    //   337: iconst_3
    //   338: anewarray java/lang/String
    //   341: dup
    //   342: iconst_0
    //   343: sipush #-1159
    //   346: sipush #-3315
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: aastore
    //   353: dup
    //   354: iconst_1
    //   355: sipush #-1157
    //   358: sipush #20061
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: aastore
    //   365: dup
    //   366: iconst_2
    //   367: sipush #-1153
    //   370: sipush #18257
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: aastore
    //   377: putstatic burp/Zeyn.ZR : [Ljava/lang/String;
    //   380: invokestatic Zr : ()[I
    //   383: putstatic burp/Zeyn.ZH : [I
    //   386: return
  }
  
  public static void ZG(String paramString) {
    Zv = paramString;
  }
  
  public static String Zd() {
    return Zv;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFB7F) & 0xFFFF;
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
      byte b1 = 77;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeyn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */