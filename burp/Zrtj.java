package burp;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zel;

public class Zrtj implements Ze7n {
  private final Zz_4 Zo;
  
  private final Zl2w Z_;
  
  private final String Zd;
  
  private final String Zu;
  
  private final String ZC;
  
  private final String ZL;
  
  private final boolean ZP;
  
  private final boolean Ze;
  
  private final boolean ZW;
  
  private final boolean Zn;
  
  private final Map<String, String> ZJ;
  
  private final List<String> Zc;
  
  private final Zel Zx;
  
  private final Map<String, Zel> Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zrtj(Zz_4 paramZz_4, Zl2w paramZl2w, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, Map<String, String> paramMap, List<String> paramList, Zel paramZel, Map<String, Zel> paramMap1) {
    this.Zo = paramZz_4;
    this.Z_ = paramZl2w;
    this.Zd = paramString1;
    this.Zu = paramString2;
    this.ZC = paramString3;
    this.ZL = paramString4;
    this.ZW = paramBoolean3;
    this.ZP = paramBoolean1;
    this.Ze = paramBoolean2;
    this.Zn = paramBoolean4;
    this.ZJ = paramMap;
    this.Zc = paramList;
    this.Zx = paramZel;
    this.Zt = paramMap1;
  }
  
  public Zl2w ZN() {
    return this.Z_;
  }
  
  public String Z_() {
    return this.Zd;
  }
  
  public String ZC(String paramString) {
    return this.ZJ.get(paramString);
  }
  
  public Zz_4 ZI() {
    return this.Zo;
  }
  
  public byte Zg() {
    return this.Z_.persistedForm;
  }
  
  public String ZW() {
    return this.Zu;
  }
  
  public String Ze() {
    return this.ZC;
  }
  
  public List<String> ZX() {
    return this.Zc;
  }
  
  public String ZS() {
    return this.ZL;
  }
  
  public Zmtz ZY() {
    try {
      switch (Zbl5.Zm[this.Z_.ordinal()]) {
        case 1:
        
        case 2:
        case 3:
        case 4:
        case 5:
        
        case 6:
        
        case 7:
        case 8:
        case 9:
        
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return Zmtz.NONE;
  }
  
  public boolean Zy() {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return (this.Z_ == Zl2w.PASSWORD);
  }
  
  public Optional<Zegu> Zu() {
    // Byte code:
    //   0: invokestatic ZD : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: invokevirtual ZN : ()Lburp/Zl2w;
    //   8: getstatic burp/Zl2w.FILE : Lburp/Zl2w;
    //   11: if_acmpeq -> 22
    //   14: invokestatic empty : ()Ljava/util/Optional;
    //   17: areturn
    //   18: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   21: athrow
    //   22: new burp/Zlzw
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore_2
    //   30: aload_0
    //   31: getfield ZC : Ljava/lang/String;
    //   34: invokestatic ZS : (Ljava/lang/String;)Z
    //   37: ifeq -> 370
    //   40: aload_2
    //   41: invokevirtual ZB : ()Lburp/Zlzw;
    //   44: pop
    //   45: aload_0
    //   46: sipush #24717
    //   49: sipush #12983
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: invokevirtual ZC : (Ljava/lang/String;)Ljava/lang/String;
    //   58: astore_3
    //   59: aload_3
    //   60: ifnonnull -> 102
    //   63: aload_2
    //   64: sipush #24708
    //   67: sipush #-31192
    //   70: invokestatic a : (II)Ljava/lang/String;
    //   73: invokevirtual ZT : (Ljava/lang/String;)Lburp/Zlzw;
    //   76: pop
    //   77: aload_2
    //   78: sipush #24733
    //   81: sipush #27363
    //   84: invokestatic a : (II)Ljava/lang/String;
    //   87: invokevirtual ZM : (Ljava/lang/String;)Lburp/Zlzw;
    //   90: pop
    //   91: aload_1
    //   92: ifnull -> 370
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   101: athrow
    //   102: aload_3
    //   103: ldc ','
    //   105: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   108: astore #4
    //   110: iconst_0
    //   111: istore #5
    //   113: iload #5
    //   115: aload #4
    //   117: arraylength
    //   118: if_icmpge -> 370
    //   121: aload #4
    //   123: iload #5
    //   125: aaload
    //   126: astore #6
    //   128: aload #6
    //   130: ldc '.'
    //   132: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   135: ifeq -> 156
    //   138: aload_2
    //   139: aload #6
    //   141: invokevirtual ZM : (Ljava/lang/String;)Lburp/Zlzw;
    //   144: pop
    //   145: aload_1
    //   146: ifnull -> 370
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   155: athrow
    //   156: aload #6
    //   158: invokestatic Zv : (Ljava/lang/String;)S
    //   161: istore #7
    //   163: iload #7
    //   165: sipush #512
    //   168: if_icmpne -> 210
    //   171: aload_2
    //   172: sipush #24734
    //   175: sipush #10670
    //   178: invokestatic a : (II)Ljava/lang/String;
    //   181: invokevirtual ZT : (Ljava/lang/String;)Lburp/Zlzw;
    //   184: pop
    //   185: aload_2
    //   186: sipush #24715
    //   189: sipush #12903
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: invokevirtual ZM : (Ljava/lang/String;)Lburp/Zlzw;
    //   198: pop
    //   199: aload_1
    //   200: ifnull -> 370
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   209: athrow
    //   210: iload #7
    //   212: sipush #1025
    //   215: if_icmpeq -> 240
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   224: athrow
    //   225: iload #7
    //   227: sipush #1026
    //   230: if_icmpne -> 265
    //   233: goto -> 240
    //   236: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   239: athrow
    //   240: aload_2
    //   241: sipush #24747
    //   244: sipush #-3725
    //   247: invokestatic a : (II)Ljava/lang/String;
    //   250: invokevirtual ZT : (Ljava/lang/String;)Lburp/Zlzw;
    //   253: pop
    //   254: aload_1
    //   255: ifnull -> 370
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   264: athrow
    //   265: iload #7
    //   267: invokestatic ZC : (S)Ljava/util/Optional;
    //   270: astore #8
    //   272: aload #8
    //   274: invokevirtual isPresent : ()Z
    //   277: ifeq -> 311
    //   280: aload_2
    //   281: aload #6
    //   283: invokevirtual ZT : (Ljava/lang/String;)Lburp/Zlzw;
    //   286: pop
    //   287: aload_2
    //   288: aload #8
    //   290: invokevirtual get : ()Ljava/lang/Object;
    //   293: checkcast java/lang/String
    //   296: invokevirtual ZM : (Ljava/lang/String;)Lburp/Zlzw;
    //   299: pop
    //   300: aload_1
    //   301: ifnull -> 370
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   310: athrow
    //   311: iload #5
    //   313: aload #4
    //   315: arraylength
    //   316: iconst_1
    //   317: isub
    //   318: if_icmpne -> 363
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   327: athrow
    //   328: aload_2
    //   329: sipush #24748
    //   332: sipush #-18365
    //   335: invokestatic a : (II)Ljava/lang/String;
    //   338: invokevirtual ZT : (Ljava/lang/String;)Lburp/Zlzw;
    //   341: pop
    //   342: aload_2
    //   343: sipush #24733
    //   346: sipush #27363
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: invokevirtual ZM : (Ljava/lang/String;)Lburp/Zlzw;
    //   355: pop
    //   356: goto -> 363
    //   359: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   362: athrow
    //   363: iinc #5, 1
    //   366: aload_1
    //   367: ifnull -> 113
    //   370: aload_2
    //   371: invokevirtual ZE : ()Lburp/Zegu;
    //   374: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   377: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	18	java/util/regex/PatternSyntaxException
    //   59	95	98	java/util/regex/PatternSyntaxException
    //   128	149	152	java/util/regex/PatternSyntaxException
    //   163	203	206	java/util/regex/PatternSyntaxException
    //   171	218	221	java/util/regex/PatternSyntaxException
    //   210	233	236	java/util/regex/PatternSyntaxException
    //   225	258	261	java/util/regex/PatternSyntaxException
    //   272	304	307	java/util/regex/PatternSyntaxException
    //   280	321	324	java/util/regex/PatternSyntaxException
    //   311	356	359	java/util/regex/PatternSyntaxException
  }
  
  private static Optional<String> ZC(short paramShort) {
    try {
      switch (paramShort) {
        case 256:
        
        case 257:
        
        case 258:
        
        case 259:
        
        case 260:
        
        case 261:
        
        case 262:
        
        case 513:
        
        case 514:
        
        case 515:
        
        case 516:
        
        case 517:
        
        case 518:
        
        case 768:
        
        case 769:
        
        case 1536:
        
        case 1537:
        
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return Optional.empty();
  }
  
  private static String Zp(String paramString) {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return (paramString == null) ? "" : paramString.toLowerCase(Locale.ENGLISH).replaceAll(a(24718, -22729), "");
  }
  
  public Zxaq Zm() {
    // Byte code:
    //   0: aload_0
    //   1: sipush #24728
    //   4: sipush #10338
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: invokevirtual ZC : (Ljava/lang/String;)Ljava/lang/String;
    //   13: invokestatic Zp : (Ljava/lang/String;)Ljava/lang/String;
    //   16: astore_2
    //   17: invokestatic ZD : ()Ljava/lang/String;
    //   20: iconst_m1
    //   21: istore_3
    //   22: astore_1
    //   23: aload_2
    //   24: invokevirtual hashCode : ()I
    //   27: lookupswitch default -> 444, -1034364087 -> 182, -251848496 -> 418, 114715 -> 211, 116079 -> 240, 3076014 -> 269, 3143036 -> 153, 3560141 -> 388, 3645428 -> 328, 96619420 -> 124, 104080000 -> 298, 108280125 -> 358
    //   124: aload_2
    //   125: sipush #24727
    //   128: sipush #9203
    //   131: invokestatic a : (II)Ljava/lang/String;
    //   134: invokevirtual equals : (Ljava/lang/Object;)Z
    //   137: ifeq -> 444
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   146: athrow
    //   147: iconst_0
    //   148: istore_3
    //   149: aload_1
    //   150: ifnull -> 444
    //   153: aload_2
    //   154: sipush #24735
    //   157: sipush #-18893
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: invokevirtual equals : (Ljava/lang/Object;)Z
    //   166: ifeq -> 444
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   175: athrow
    //   176: iconst_1
    //   177: istore_3
    //   178: aload_1
    //   179: ifnull -> 444
    //   182: aload_2
    //   183: sipush #24736
    //   186: sipush #25867
    //   189: invokestatic a : (II)Ljava/lang/String;
    //   192: invokevirtual equals : (Ljava/lang/Object;)Z
    //   195: ifeq -> 444
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   204: athrow
    //   205: iconst_2
    //   206: istore_3
    //   207: aload_1
    //   208: ifnull -> 444
    //   211: aload_2
    //   212: sipush #24746
    //   215: sipush #-2619
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: invokevirtual equals : (Ljava/lang/Object;)Z
    //   224: ifeq -> 444
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   233: athrow
    //   234: iconst_3
    //   235: istore_3
    //   236: aload_1
    //   237: ifnull -> 444
    //   240: aload_2
    //   241: sipush #24731
    //   244: sipush #-12922
    //   247: invokestatic a : (II)Ljava/lang/String;
    //   250: invokevirtual equals : (Ljava/lang/Object;)Z
    //   253: ifeq -> 444
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   262: athrow
    //   263: iconst_4
    //   264: istore_3
    //   265: aload_1
    //   266: ifnull -> 444
    //   269: aload_2
    //   270: sipush #24751
    //   273: sipush #20149
    //   276: invokestatic a : (II)Ljava/lang/String;
    //   279: invokevirtual equals : (Ljava/lang/Object;)Z
    //   282: ifeq -> 444
    //   285: goto -> 292
    //   288: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   291: athrow
    //   292: iconst_5
    //   293: istore_3
    //   294: aload_1
    //   295: ifnull -> 444
    //   298: aload_2
    //   299: sipush #24749
    //   302: sipush #-8883
    //   305: invokestatic a : (II)Ljava/lang/String;
    //   308: invokevirtual equals : (Ljava/lang/Object;)Z
    //   311: ifeq -> 444
    //   314: goto -> 321
    //   317: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   320: athrow
    //   321: bipush #6
    //   323: istore_3
    //   324: aload_1
    //   325: ifnull -> 444
    //   328: aload_2
    //   329: sipush #24706
    //   332: sipush #-24945
    //   335: invokestatic a : (II)Ljava/lang/String;
    //   338: invokevirtual equals : (Ljava/lang/Object;)Z
    //   341: ifeq -> 444
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   350: athrow
    //   351: bipush #7
    //   353: istore_3
    //   354: aload_1
    //   355: ifnull -> 444
    //   358: aload_2
    //   359: sipush #24713
    //   362: sipush #-7675
    //   365: invokestatic a : (II)Ljava/lang/String;
    //   368: invokevirtual equals : (Ljava/lang/Object;)Z
    //   371: ifeq -> 444
    //   374: goto -> 381
    //   377: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   380: athrow
    //   381: bipush #8
    //   383: istore_3
    //   384: aload_1
    //   385: ifnull -> 444
    //   388: aload_2
    //   389: sipush #24725
    //   392: sipush #-5311
    //   395: invokestatic a : (II)Ljava/lang/String;
    //   398: invokevirtual equals : (Ljava/lang/Object;)Z
    //   401: ifeq -> 444
    //   404: goto -> 411
    //   407: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   410: athrow
    //   411: bipush #9
    //   413: istore_3
    //   414: aload_1
    //   415: ifnull -> 444
    //   418: aload_2
    //   419: sipush #24744
    //   422: sipush #-5714
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: invokevirtual equals : (Ljava/lang/Object;)Z
    //   431: ifeq -> 444
    //   434: goto -> 441
    //   437: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   440: athrow
    //   441: bipush #10
    //   443: istore_3
    //   444: iload_3
    //   445: tableswitch default -> 574, 0 -> 504, 1 -> 514, 2 -> 520, 3 -> 526, 4 -> 532, 5 -> 538, 6 -> 544, 7 -> 550, 8 -> 556, 9 -> 562, 10 -> 568
    //   504: getstatic burp/Zxaq.EMAIL : Lburp/Zxaq;
    //   507: goto -> 577
    //   510: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   513: athrow
    //   514: getstatic burp/Zxaq.FILE : Lburp/Zxaq;
    //   517: goto -> 577
    //   520: getstatic burp/Zxaq.NUMBER : Lburp/Zxaq;
    //   523: goto -> 577
    //   526: getstatic burp/Zxaq.TEL : Lburp/Zxaq;
    //   529: goto -> 577
    //   532: getstatic burp/Zxaq.URL : Lburp/Zxaq;
    //   535: goto -> 577
    //   538: getstatic burp/Zxaq.DATE : Lburp/Zxaq;
    //   541: goto -> 577
    //   544: getstatic burp/Zxaq.YEAR_MONTH : Lburp/Zxaq;
    //   547: goto -> 577
    //   550: getstatic burp/Zxaq.YEAR_WEEK : Lburp/Zxaq;
    //   553: goto -> 577
    //   556: getstatic burp/Zxaq.RANGE : Lburp/Zxaq;
    //   559: goto -> 577
    //   562: getstatic burp/Zxaq.TIME : Lburp/Zxaq;
    //   565: goto -> 577
    //   568: getstatic burp/Zxaq.DATE_TIME : Lburp/Zxaq;
    //   571: goto -> 577
    //   574: getstatic burp/Zxaq.TEXT : Lburp/Zxaq;
    //   577: areturn
    // Exception table:
    //   from	to	target	type
    //   23	140	143	java/util/regex/PatternSyntaxException
    //   149	169	172	java/util/regex/PatternSyntaxException
    //   178	198	201	java/util/regex/PatternSyntaxException
    //   207	227	230	java/util/regex/PatternSyntaxException
    //   236	256	259	java/util/regex/PatternSyntaxException
    //   265	285	288	java/util/regex/PatternSyntaxException
    //   294	314	317	java/util/regex/PatternSyntaxException
    //   324	344	347	java/util/regex/PatternSyntaxException
    //   354	374	377	java/util/regex/PatternSyntaxException
    //   384	404	407	java/util/regex/PatternSyntaxException
    //   414	434	437	java/util/regex/PatternSyntaxException
    //   444	510	510	java/util/regex/PatternSyntaxException
  }
  
  public Zzuz ZH() {
    return (new Zssk()).ZE((this.Z_ != Zl2w.HIDDEN)).Zk(this.ZP).ZI(this.Ze).Zr(this.ZW).ZS(this.Zn).Ze();
  }
  
  public Zmlc ZE() {
    return (new Zrbg()).ZF(Zx(ZC(a(24716, 19694)))).Zp(ZR(ZC(a(24714, -3046)))).Zj(ZR(ZC(a(24720, 6624)))).Zq(ZR(ZC(a(24709, -13425)))).ZE(ZR(ZC(a(24729, -5720)))).ZV();
  }
  
  private static Pattern Zx(String paramString) {
    try {
      if (paramString == null)
        return null; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      return Pattern.compile(paramString);
    } catch (PatternSyntaxException patternSyntaxException) {
      Zah.Zl(patternSyntaxException, Zk_.IGNORED);
      return null;
    } 
  }
  
  private static Integer ZR(String paramString) {
    try {
      if (paramString == null)
        return null; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      return Integer.valueOf(Integer.parseInt(paramString));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      return null;
    } 
  }
  
  public Zel Zj() {
    try {
      if (this.ZC != null)
        try {
          return this.Zt.containsKey(this.ZC) ? this.Zt.get(this.ZC) : this.Zx;
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return this.Zx;
  }
  
  public Ze7n Zg(String paramString) {
    return new Zrtj(this.Zo, this.Z_, this.Zd, this.Zu, paramString, this.ZL, this.ZP, this.Ze, this.ZW, this.Zn, this.ZJ, this.Zc, this.Zx, this.Zt);
  }
  
  public Zrpq ZO() {
    return (new Zzel(this.Zo, this.Z_, this.Zd, this.Zu, this.ZC, this.ZL, this.ZP, this.Ze, this.ZW, this.Zn, this.ZJ, this.Zc)).ZA(new Zruo());
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (getClass() != paramObject.getClass())
            return false; 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zrtj zrtj = (Zrtj)paramObject;
    try {
      if (this.ZP == zrtj.ZP)
        try {
          if (this.Ze == zrtj.Ze)
            try {
              if (this.Zo == zrtj.Zo)
                try {
                  if (this.Z_ == zrtj.Z_)
                    try {
                      if (Objects.equals(this.Zd, zrtj.Zd))
                        try {
                          if (Objects.equals(this.Zu, zrtj.Zu))
                            try {
                              if (Objects.equals(this.ZC, zrtj.ZC))
                                try {
                                  if (Objects.equals(this.ZL, zrtj.ZL))
                                    try {
                                      if (Objects.equals(this.ZJ, zrtj.ZJ))
                                        try {
                                          if (Objects.equals(this.Zc, zrtj.Zc))
                                            try {
                                              if (Objects.equals(this.Zx, zrtj.Zx))
                                                try {
                                                  if (Objects.equals(this.Zt, zrtj.Zt));
                                                } catch (PatternSyntaxException patternSyntaxException) {
                                                  throw a(null);
                                                }  
                                            } catch (PatternSyntaxException patternSyntaxException) {
                                              throw a(null);
                                            }  
                                        } catch (PatternSyntaxException patternSyntaxException) {
                                          throw a(null);
                                        }  
                                    } catch (PatternSyntaxException patternSyntaxException) {
                                      throw a(null);
                                    }  
                                } catch (PatternSyntaxException patternSyntaxException) {
                                  throw a(null);
                                }  
                            } catch (PatternSyntaxException patternSyntaxException) {
                              throw a(null);
                            }  
                        } catch (PatternSyntaxException patternSyntaxException) {
                          throw a(null);
                        }  
                    } catch (PatternSyntaxException patternSyntaxException) {
                      throw a(null);
                    }  
                } catch (PatternSyntaxException patternSyntaxException) {
                  throw a(null);
                }  
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            }  
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    String str = Zvy.ZD();
    try {
      if (str != null)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return Objects.hash(new Object[] { 
          this.Zo, this.Z_, this.Zd, this.Zu, this.ZC, this.ZL, Boolean.valueOf(this.ZP), Boolean.valueOf(this.Ze), this.ZJ, this.Zc, 
          this.Zx, this.Zt });
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #42
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ar\±1\\t;Õ3ß¸ùWô¾G=¾bwæ\\tlKül[_\\t583±¯fÁKÂ>½íêÀâÎÿêÄ4þË«\\n8»JS$5±ÏÚ\\ta@@¸XÔÎ[r\\tíÊ%öp(D}i&y®xSd\\n7\\fï6'#G²~ÜÆ#\\tO¨­ôU'"æ9lv\9voZm=/îg~\\t2àvâ6lÒ\\r*Rûy°¯h¸d\\fZ&¦ U¤óåFNCëO,È6eZá6Uhj±&\\nLæÄøõú5Çº\\nUùù'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #66
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'ª+|ý¾ VÎ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #92
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
    //   128: putstatic burp/Zrtj.a : [Ljava/lang/String;
    //   131: bipush #42
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zrtj.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 258
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 240, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #53
    //   214: goto -> 242
    //   217: iconst_5
    //   218: goto -> 242
    //   221: bipush #99
    //   223: goto -> 242
    //   226: bipush #51
    //   228: goto -> 242
    //   231: bipush #83
    //   233: goto -> 242
    //   236: iconst_3
    //   237: goto -> 242
    //   240: bipush #119
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 165
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 161
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6088) & 0xFFFF;
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
      byte b1 = 99;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrtj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */