package burp;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkk3 implements Zk5_ {
  private static final String[] ZU;
  
  private static final String[] ZG;
  
  private final Zg05 ZI;
  
  private final Zr_4 ZB;
  
  private Pattern ZW = null;
  
  private static String ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zkk3(Zg05 paramZg05, Zr_4 paramZr_4) {
    this.ZI = paramZg05;
    this.ZB = paramZr_4;
    if (paramZg05.Zon() != null)
      this.ZW = ZE(); 
    Zy();
  }
  
  public Zkk3(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean, Zg05 paramZg05, Zr_4 paramZr_4) {
    this.ZI = paramZg05;
    this.ZB = paramZr_4;
    this.ZI.ZA((byte)0);
    this.ZI.Zw(paramArrayOfbyte1);
    this.ZI.ZZ((byte)0);
    this.ZI.Zq(paramArrayOfbyte2);
    this.ZI.ZcO(paramBoolean);
    Zy();
  }
  
  public Zkk3(String paramString, boolean paramBoolean1, byte[] paramArrayOfbyte, boolean paramBoolean2, Zg05 paramZg05, Zr_4 paramZr_4) {
    this.ZI = paramZg05;
    this.ZB = paramZr_4;
    this.ZI.ZcE(true);
    this.ZI.Zcf(paramBoolean1);
    String str = (paramArrayOfbyte.length == 0) ? "$" : Zg8q.ZV(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    this.ZI.Zs8(paramString + paramString + a(-28455, 4361));
    this.ZW = ZE();
    this.ZI.ZcO(paramBoolean2);
    Zy();
  }
  
  public void ZX() {
    this.ZI.ZcE(true);
    Zy();
  }
  
  public Zkk3 ZI() {
    Zxlb zxlb = new Zxlb(this.ZI);
    Zg05 zg05 = this.ZB.<Zg05>ZH(zxlb);
    return new Zkk3(zg05, this.ZB);
  }
  
  public boolean Zg(Zkk3 paramZkk3) {
    try {
      if (paramZkk3 == null)
        return false; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (this.ZI.Zoi() != null)
        try {
          if (paramZkk3.Zr() != null)
            try {
              if (!Zr().equals(paramZkk3.Zr()))
                return false; 
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            }  
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (ZB() != paramZkk3.ZB())
        return false; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (this.ZI.ZoF() != paramZkk3.ZI.ZoF())
        return false; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (this.ZI.Zob())
        return Zd(paramZkk3); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return Zu(paramZkk3);
  }
  
  private boolean Zd(Zkk3 paramZkk3) {
    try {
      if (this.ZI.Zo0() != paramZkk3.ZI.Zo0())
        return false; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (this.ZI.Zon() != null)
        try {
          return (paramZkk3.ZI.Zon() != null) ? this.ZI.Zon().equals(paramZkk3.ZI.Zon()) : false;
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean Zu(Zkk3 paramZkk3) {
    try {
      if (this.ZI.Zou() != paramZkk3.ZI.Zou())
        return false; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      switch (this.ZI.Zou()) {
        case 0:
          try {
            if (!Zli.ZQ(this.ZI.Zox(), paramZkk3.ZI.Zox()))
              return false; 
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          break;
        case 1:
          try {
            if (this.ZI.Zop() != paramZkk3.ZI.Zop())
              return false; 
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          break;
        default:
          Zuh.Zv(false, Zqf.Zk, this.ZI.Zou());
          return false;
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (this.ZI.Zoh() != paramZkk3.ZI.Zoh())
        return false; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      switch (this.ZI.Zoh()) {
        case 0:
          try {
            if (!Zli.ZQ(this.ZI.ZoA(), paramZkk3.ZI.ZoA()))
              return false; 
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          return true;
        case 1:
          try {
            if (this.ZI.ZoN() != paramZkk3.ZI.ZoN())
              return false; 
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          return true;
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zuh.Zv(false, Zqf.Zk, this.ZI.Zou());
    return false;
  }
  
  public String Zi() {
    return this.ZI.ZoY();
  }
  
  public String Zr() {
    return this.ZI.Zoi();
  }
  
  public String toString() {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return (this.ZI.Zoi() == null) ? a(-28459, -16480) : this.ZI.Zoi();
  }
  
  private Pattern ZE() {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return Pattern.compile(this.ZI.Zon(), 0x20 | (this.ZI.Zo0() ? 0 : 2));
  }
  
  public int[] Zh(byte[] paramArrayOfbyte, String paramString, int paramInt) {
    return ZV(paramArrayOfbyte, paramString, paramInt, 0);
  }
  
  public int[] ZV(byte[] paramArrayOfbyte, String paramString, int paramInt1, int paramInt2) {
    if (this.ZI.ZoF())
      paramInt2 = Math.max(paramInt2, paramInt1); 
    int i = paramArrayOfbyte.length;
    try {
      if (ZB())
        return Za(paramArrayOfbyte, paramString, paramInt2); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return Zt(paramArrayOfbyte, paramInt2, i);
  }
  
  private int[] Za(byte[] paramArrayOfbyte, String paramString, int paramInt) {
    try {
      if (this.ZW == null)
        return null; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    if (paramString == null)
      paramString = Zkb.ZG(paramArrayOfbyte); 
    Matcher matcher = this.ZW.matcher(paramString);
    try {
      if (!matcher.find(paramInt))
        return null; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (matcher.groupCount() < 1)
        return null; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return new int[] { matcher.start(1), matcher.end(1) };
  }
  
  private int[] Zt(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zs : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield ZI : Lburp/Zg05;
    //   9: invokeinterface Zou : ()B
    //   14: lookupswitch default -> 128, 0 -> 40, 1 -> 112
    //   40: aload_0
    //   41: getfield ZI : Lburp/Zg05;
    //   44: invokeinterface Zox : ()[B
    //   49: astore #6
    //   51: aload #6
    //   53: ifnull -> 69
    //   56: aload #6
    //   58: arraylength
    //   59: ifne -> 77
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: iload_2
    //   70: istore #5
    //   72: aload #4
    //   74: ifnull -> 151
    //   77: aload_1
    //   78: aload #6
    //   80: iload_2
    //   81: iload_3
    //   82: invokestatic Zw : ([B[BII)I
    //   85: istore #5
    //   87: iload #5
    //   89: iconst_m1
    //   90: if_icmpne -> 99
    //   93: aconst_null
    //   94: areturn
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: iload #5
    //   101: aload #6
    //   103: arraylength
    //   104: iadd
    //   105: istore #5
    //   107: aload #4
    //   109: ifnull -> 151
    //   112: aload_0
    //   113: getfield ZI : Lburp/Zg05;
    //   116: invokeinterface Zop : ()I
    //   121: istore #5
    //   123: aload #4
    //   125: ifnull -> 151
    //   128: iconst_0
    //   129: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   132: aload_0
    //   133: getfield ZI : Lburp/Zg05;
    //   136: invokeinterface Zou : ()B
    //   141: i2l
    //   142: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   145: aconst_null
    //   146: areturn
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: iload #5
    //   153: iload_2
    //   154: if_icmplt -> 170
    //   157: iload #5
    //   159: iload_3
    //   160: if_icmple -> 176
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   169: athrow
    //   170: aconst_null
    //   171: areturn
    //   172: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   175: athrow
    //   176: aload_0
    //   177: getfield ZI : Lburp/Zg05;
    //   180: invokeinterface Zoh : ()B
    //   185: lookupswitch default -> 302, 0 -> 212, 1 -> 274
    //   212: aload_0
    //   213: getfield ZI : Lburp/Zg05;
    //   216: invokeinterface ZoA : ()[B
    //   221: astore #7
    //   223: aload #7
    //   225: ifnull -> 241
    //   228: aload #7
    //   230: arraylength
    //   231: ifne -> 249
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   240: athrow
    //   241: iload_3
    //   242: istore #6
    //   244: aload #4
    //   246: ifnull -> 325
    //   249: aload_1
    //   250: aload #7
    //   252: iload #5
    //   254: iload_3
    //   255: invokestatic Zw : ([B[BII)I
    //   258: istore #6
    //   260: iload #6
    //   262: iconst_m1
    //   263: if_icmpne -> 325
    //   266: iload_3
    //   267: istore #6
    //   269: aload #4
    //   271: ifnull -> 325
    //   274: iload #5
    //   276: aload_0
    //   277: getfield ZI : Lburp/Zg05;
    //   280: invokeinterface ZoN : ()I
    //   285: iadd
    //   286: istore #6
    //   288: iload #6
    //   290: iload_3
    //   291: if_icmple -> 325
    //   294: iload_3
    //   295: istore #6
    //   297: aload #4
    //   299: ifnull -> 325
    //   302: iconst_0
    //   303: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   306: aload_0
    //   307: getfield ZI : Lburp/Zg05;
    //   310: invokeinterface Zoh : ()B
    //   315: i2l
    //   316: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   319: aconst_null
    //   320: areturn
    //   321: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   324: athrow
    //   325: iload #6
    //   327: iload #5
    //   329: if_icmple -> 345
    //   332: iload #6
    //   334: iload_3
    //   335: if_icmple -> 351
    //   338: goto -> 345
    //   341: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   344: athrow
    //   345: aconst_null
    //   346: areturn
    //   347: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   350: athrow
    //   351: iload #5
    //   353: iload_2
    //   354: if_icmpne -> 376
    //   357: iload #6
    //   359: iload_3
    //   360: if_icmpne -> 376
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   369: athrow
    //   370: aconst_null
    //   371: areturn
    //   372: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   375: athrow
    //   376: iconst_2
    //   377: newarray int
    //   379: dup
    //   380: iconst_0
    //   381: iload #5
    //   383: iastore
    //   384: dup
    //   385: iconst_1
    //   386: iload #6
    //   388: iastore
    //   389: areturn
    // Exception table:
    //   from	to	target	type
    //   51	62	65	java/util/regex/PatternSyntaxException
    //   87	95	95	java/util/regex/PatternSyntaxException
    //   123	147	147	java/util/regex/PatternSyntaxException
    //   151	163	166	java/util/regex/PatternSyntaxException
    //   157	172	172	java/util/regex/PatternSyntaxException
    //   223	234	237	java/util/regex/PatternSyntaxException
    //   297	321	321	java/util/regex/PatternSyntaxException
    //   325	338	341	java/util/regex/PatternSyntaxException
    //   332	347	347	java/util/regex/PatternSyntaxException
    //   351	363	366	java/util/regex/PatternSyntaxException
    //   357	372	372	java/util/regex/PatternSyntaxException
  }
  
  private void Zy() {
    // Byte code:
    //   0: invokestatic Zs : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZI : Lburp/Zg05;
    //   8: invokeinterface Zox : ()[B
    //   13: astore_2
    //   14: aload_0
    //   15: getfield ZI : Lburp/Zg05;
    //   18: invokeinterface ZoA : ()[B
    //   23: astore_3
    //   24: aload_0
    //   25: getfield ZI : Lburp/Zg05;
    //   28: invokeinterface Zob : ()Z
    //   33: ifne -> 131
    //   36: aload_0
    //   37: getfield ZI : Lburp/Zg05;
    //   40: invokeinterface Zou : ()B
    //   45: ifne -> 131
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: aload_2
    //   56: ifnull -> 78
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: aload_2
    //   67: arraylength
    //   68: ifne -> 131
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: aload_0
    //   79: getfield ZI : Lburp/Zg05;
    //   82: invokeinterface Zoh : ()B
    //   87: ifne -> 131
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: aload_3
    //   98: ifnull -> 120
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload_3
    //   109: arraylength
    //   110: ifne -> 131
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: aload_0
    //   121: invokevirtual Zf : ()V
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   130: athrow
    //   131: aload_0
    //   132: getfield ZI : Lburp/Zg05;
    //   135: invokeinterface Zob : ()Z
    //   140: ifeq -> 158
    //   143: aload_0
    //   144: invokevirtual Zo : ()V
    //   147: aload_1
    //   148: ifnull -> 169
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: aload_0
    //   159: invokevirtual Zv : ()V
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   168: athrow
    //   169: goto -> 190
    //   172: astore_2
    //   173: aload_2
    //   174: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   177: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   180: aload_0
    //   181: getfield ZI : Lburp/Zg05;
    //   184: aconst_null
    //   185: invokeinterface ZsS : (Ljava/lang/String;)V
    //   190: return
    // Exception table:
    //   from	to	target	type
    //   4	169	172	java/lang/Exception
    //   24	48	51	java/lang/Exception
    //   36	59	62	java/lang/Exception
    //   55	71	74	java/lang/Exception
    //   66	90	93	java/lang/Exception
    //   78	101	104	java/lang/Exception
    //   97	113	116	java/lang/Exception
    //   108	124	127	java/lang/Exception
    //   131	151	154	java/lang/Exception
    //   143	162	165	java/lang/Exception
  }
  
  private void Zo() throws Exception {
    try {
      if (this.ZW == null)
        Zf(); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (this.ZW.matcher("").groupCount() < 1)
        Zf(); 
    } catch (Exception exception) {
      throw a(null);
    } 
    this.ZI.Zsv(this.ZI.Zon());
    this.ZI.ZsS(a(-28452, -26391) + a(-28452, -26391));
  }
  
  private void Zv() throws Exception {
    // Byte code:
    //   0: invokestatic Zs : ()Ljava/lang/String;
    //   3: astore_1
    //   4: new java/lang/StringBuilder
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_2
    //   12: aload_0
    //   13: getfield ZI : Lburp/Zg05;
    //   16: invokeinterface Zou : ()B
    //   21: lookupswitch default -> 238, 0 -> 48, 1 -> 157
    //   48: aload_0
    //   49: getfield ZI : Lburp/Zg05;
    //   52: invokeinterface Zox : ()[B
    //   57: astore_3
    //   58: aload_3
    //   59: ifnull -> 74
    //   62: aload_3
    //   63: arraylength
    //   64: ifne -> 99
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: aload_2
    //   75: sipush #-28468
    //   78: sipush #-4773
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload_1
    //   89: ifnull -> 266
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_0
    //   100: getfield ZI : Lburp/Zg05;
    //   103: aload_3
    //   104: iconst_0
    //   105: aload_3
    //   106: arraylength
    //   107: invokestatic ZQ : ([BII)Ljava/lang/String;
    //   110: invokeinterface Zsv : (Ljava/lang/String;)V
    //   115: aload_2
    //   116: sipush #-28466
    //   119: sipush #32537
    //   122: invokestatic a : (II)Ljava/lang/String;
    //   125: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: aload_0
    //   129: getfield ZI : Lburp/Zg05;
    //   132: invokeinterface ZoY : ()Ljava/lang/String;
    //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: ldc ']'
    //   142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload_1
    //   147: ifnull -> 266
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: aload_0
    //   158: getfield ZI : Lburp/Zg05;
    //   161: invokeinterface Zop : ()I
    //   166: ifge -> 187
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   175: athrow
    //   176: aload_0
    //   177: invokevirtual Zf : ()V
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: aload_0
    //   188: getfield ZI : Lburp/Zg05;
    //   191: aload_0
    //   192: getfield ZI : Lburp/Zg05;
    //   195: invokeinterface Zop : ()I
    //   200: invokestatic toString : (I)Ljava/lang/String;
    //   203: invokeinterface Zsv : (Ljava/lang/String;)V
    //   208: aload_2
    //   209: sipush #-28449
    //   212: sipush #15152
    //   215: invokestatic a : (II)Ljava/lang/String;
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: aload_0
    //   222: getfield ZI : Lburp/Zg05;
    //   225: invokeinterface ZoY : ()Ljava/lang/String;
    //   230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: pop
    //   234: aload_1
    //   235: ifnull -> 266
    //   238: iconst_0
    //   239: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   242: aload_0
    //   243: getfield ZI : Lburp/Zg05;
    //   246: invokeinterface Zou : ()B
    //   251: i2l
    //   252: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   255: aload_0
    //   256: invokevirtual Zf : ()V
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   265: athrow
    //   266: aload_0
    //   267: getfield ZI : Lburp/Zg05;
    //   270: invokeinterface Zoh : ()B
    //   275: lookupswitch default -> 602, 0 -> 300, 1 -> 464
    //   300: aload_0
    //   301: getfield ZI : Lburp/Zg05;
    //   304: invokeinterface ZoA : ()[B
    //   309: astore_3
    //   310: aload_2
    //   311: invokevirtual length : ()I
    //   314: ifle -> 342
    //   317: aload_2
    //   318: sipush #-28437
    //   321: sipush #-10639
    //   324: invokestatic a : (II)Ljava/lang/String;
    //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: pop
    //   331: aload_1
    //   332: ifnull -> 363
    //   335: goto -> 342
    //   338: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   341: athrow
    //   342: aload_2
    //   343: sipush #-28464
    //   346: sipush #27991
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   355: pop
    //   356: goto -> 363
    //   359: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   362: athrow
    //   363: aload_3
    //   364: ifnull -> 379
    //   367: aload_3
    //   368: arraylength
    //   369: ifne -> 404
    //   372: goto -> 379
    //   375: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   378: athrow
    //   379: aload_2
    //   380: sipush #-28420
    //   383: sipush #-31303
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: pop
    //   393: aload_1
    //   394: ifnull -> 630
    //   397: goto -> 404
    //   400: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   403: athrow
    //   404: aload_3
    //   405: iconst_0
    //   406: aload_3
    //   407: arraylength
    //   408: invokestatic ZQ : ([BII)Ljava/lang/String;
    //   411: astore #4
    //   413: aload_2
    //   414: ldc '['
    //   416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   419: aload #4
    //   421: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   424: ldc ']'
    //   426: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   429: pop
    //   430: aload_0
    //   431: getfield ZI : Lburp/Zg05;
    //   434: invokeinterface ZoY : ()Ljava/lang/String;
    //   439: ifnonnull -> 460
    //   442: aload_0
    //   443: getfield ZI : Lburp/Zg05;
    //   446: aload #4
    //   448: invokeinterface Zsv : (Ljava/lang/String;)V
    //   453: goto -> 460
    //   456: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   459: athrow
    //   460: aload_1
    //   461: ifnull -> 630
    //   464: aload_0
    //   465: getfield ZI : Lburp/Zg05;
    //   468: invokeinterface ZoN : ()I
    //   473: ifge -> 494
    //   476: goto -> 483
    //   479: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   482: athrow
    //   483: aload_0
    //   484: invokevirtual Zf : ()V
    //   487: goto -> 494
    //   490: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   493: athrow
    //   494: aload_2
    //   495: invokevirtual length : ()I
    //   498: ifle -> 526
    //   501: aload_2
    //   502: sipush #-28446
    //   505: sipush #-569
    //   508: invokestatic a : (II)Ljava/lang/String;
    //   511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: pop
    //   515: aload_1
    //   516: ifnull -> 547
    //   519: goto -> 526
    //   522: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   525: athrow
    //   526: aload_2
    //   527: sipush #-28465
    //   530: sipush #11165
    //   533: invokestatic a : (II)Ljava/lang/String;
    //   536: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: pop
    //   540: goto -> 547
    //   543: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   546: athrow
    //   547: aload_0
    //   548: getfield ZI : Lburp/Zg05;
    //   551: invokeinterface ZoN : ()I
    //   556: invokestatic toString : (I)Ljava/lang/String;
    //   559: astore #4
    //   561: aload_2
    //   562: aload #4
    //   564: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   567: pop
    //   568: aload_0
    //   569: getfield ZI : Lburp/Zg05;
    //   572: invokeinterface ZoY : ()Ljava/lang/String;
    //   577: ifnonnull -> 630
    //   580: aload_0
    //   581: getfield ZI : Lburp/Zg05;
    //   584: aload #4
    //   586: invokeinterface Zsv : (Ljava/lang/String;)V
    //   591: aload_1
    //   592: ifnull -> 630
    //   595: goto -> 602
    //   598: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   601: athrow
    //   602: iconst_0
    //   603: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   606: aload_0
    //   607: getfield ZI : Lburp/Zg05;
    //   610: invokeinterface Zoh : ()B
    //   615: i2l
    //   616: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   619: aload_0
    //   620: invokevirtual Zf : ()V
    //   623: goto -> 630
    //   626: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   629: athrow
    //   630: aload_0
    //   631: getfield ZI : Lburp/Zg05;
    //   634: aload_2
    //   635: invokevirtual toString : ()Ljava/lang/String;
    //   638: invokeinterface ZsS : (Ljava/lang/String;)V
    //   643: return
    // Exception table:
    //   from	to	target	type
    //   58	67	70	java/lang/Exception
    //   62	92	95	java/lang/Exception
    //   74	150	153	java/lang/Exception
    //   99	169	172	java/lang/Exception
    //   157	180	183	java/lang/Exception
    //   187	259	262	java/lang/Exception
    //   310	335	338	java/lang/Exception
    //   317	356	359	java/lang/Exception
    //   363	372	375	java/lang/Exception
    //   367	397	400	java/lang/Exception
    //   413	453	456	java/lang/Exception
    //   460	476	479	java/lang/Exception
    //   464	487	490	java/lang/Exception
    //   494	519	522	java/lang/Exception
    //   501	540	543	java/lang/Exception
    //   561	595	598	java/lang/Exception
    //   580	623	626	java/lang/Exception
  }
  
  public byte Zk() {
    return this.ZI.Zoh();
  }
  
  public byte[] ZD() {
    return this.ZI.ZoA();
  }
  
  public int Zl() {
    return this.ZI.ZoN();
  }
  
  public byte ZJ() {
    return this.ZI.Zou();
  }
  
  public byte[] Zw() {
    return this.ZI.Zox();
  }
  
  public int Zn() {
    return this.ZI.Zop();
  }
  
  public boolean ZY() {
    return this.ZI.Zo0();
  }
  
  public String ZF() {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return (this.ZW == null) ? null : this.ZW.pattern();
  }
  
  public boolean ZH() {
    return this.ZI.ZoF();
  }
  
  public void ZF(byte paramByte) {
    this.ZI.ZZ(paramByte);
    Zy();
  }
  
  public void ZY(byte[] paramArrayOfbyte) {
    this.ZI.Zq(paramArrayOfbyte);
    Zy();
  }
  
  public void ZH(int paramInt) {
    this.ZI.ZWF(paramInt);
    Zy();
  }
  
  public void Zd(byte paramByte) {
    this.ZI.ZA(paramByte);
    Zy();
  }
  
  public void Zs(byte[] paramArrayOfbyte) {
    this.ZI.Zw(paramArrayOfbyte);
    Zy();
  }
  
  public void Zh(int paramInt) {
    this.ZI.ZWl(paramInt);
    Zy();
  }
  
  public void ZZ(boolean paramBoolean) {
    try {
      this.ZI.Zcf(paramBoolean);
      if (this.ZI.Zon() != null)
        this.ZW = ZE(); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zy();
  }
  
  public void ZF(String paramString) throws Exception {
    try {
      try {
        this.ZI.Zs8(paramString);
        this.ZW = ZE();
        if (this.ZW.matcher("").groupCount() < 1)
          throw new Exception(a(-28471, 29698)); 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
      Zy();
    } catch (PatternSyntaxException patternSyntaxException) {
      Zah.Zl(patternSyntaxException, Zk_.USER_ERROR);
      this.ZW = null;
      Zy();
      throw new Exception(a(-28430, -27279));
    } 
  }
  
  public void Zj(boolean paramBoolean) {
    this.ZI.ZcO(paramBoolean);
    Zy();
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    String str = Zs();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      paramZs4f.Zb("m", this.ZI.Zob() ? 1 : 0);
      paramZs4f.Zb(a(-28474, -8142), this.ZI.Zou());
      paramZs4f.Zb(a(-28427, -26624), this.ZI.Zoh());
      paramZs4f.ZY(a(-28422, 10526), this.ZI.Zox());
      paramZs4f.Zb(a(-28462, -23614), this.ZI.Zop());
      paramZs4f.ZY(a(-28441, -513), this.ZI.ZoA());
      paramZs4f.Zb(a(-28478, -8430), this.ZI.ZoN());
      paramZs4f.Zk(a(-28443, -23216), this.ZI.Zo0());
      if (this.ZI.Zon() != null)
        paramZs4f.ZL(a(-28435, 21666), this.ZI.Zon()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      paramZs4f.Zk(a(-28418, -21460), this.ZI.ZoF());
      if (this.ZI.Zoi() != null)
        paramZs4f.ZL(a(-28419, -10602), this.ZI.Zoi()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZI.ZoY() != null)
        paramZs4f.ZM(a(-28458, 399), this.ZI.ZoY(), StandardCharsets.UTF_8); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (str != null)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public static Zkk3 Za(String paramString, Zgyp paramZgyp, Zr_4 paramZr_4) throws IOException, Ze27 {
    Zgyp zgyp = paramZgyp.Zm(paramString);
    try {
      if (zgyp == null)
        return null; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zkk3 zkk3 = new Zkk3(paramZr_4.<Zg05>ZH(new Zxlb()), paramZr_4);
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    zkk3.ZI.ZcE((zgyp.ZM("m").intValue() == 1));
    zkk3.ZI.ZA(zgyp.ZM(a(-28444, 19859)).byteValue());
    zkk3.ZI.ZZ(zgyp.ZM(a(-28423, -31477)).byteValue());
    zkk3.ZI.Zw(zgyp.ZI(a(-28473, 1850)));
    zkk3.ZI.ZWl(zgyp.ZM(a(-28463, 24633)).intValue());
    zkk3.ZI.Zq(zgyp.ZI(a(-28450, -25356)));
    zkk3.ZI.ZWF(zgyp.ZM(a(-28428, 24489)).intValue());
    zkk3.ZI.Zcf(zgyp.Zq(a(-28440, -32463)).booleanValue());
    try {
      String str = zgyp.ZW(a(-28436, -9296));
      try {
        if (str != null) {
          zkk3.ZI.Zs8(str);
          zkk3.ZW = zkk3.ZE();
        } 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      Zah.Zl(patternSyntaxException, Zk_.IGNORED);
    } 
    zkk3.Zj(zgyp.Zq(a(-28447, 1485)).booleanValue());
    zkk3.ZI.ZsS(zgyp.ZW(a(-28454, -11616)));
    zkk3.ZI.Zsv(zgyp.ZA(a(-28456, -5723), StandardCharsets.UTF_8));
    zgyp.ZE();
    return zkk3;
  }
  
  public boolean ZB() {
    return this.ZI.Zob();
  }
  
  public Zg05 Z_() {
    return this.ZI;
  }
  
  public void ZY(Zzqp paramZzqp) {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      paramZzqp.Zm(a(-28434, 10724), ZB() ? a(-28426, 18506) : a(-28439, -29567));
      paramZzqp.Zm(a(-28432, 25890), ZU[ZJ()]);
      paramZzqp.ZL(a(-28425, 30388), Zw());
      paramZzqp.ZU(a(-28448, -23334), Zn());
      paramZzqp.Zm(a(-28421, 22244), ZG[Zk()]);
      paramZzqp.ZL(a(-28480, -21678), ZD());
      paramZzqp.ZU(a(-28479, -26705), Zl());
      if (Zsw8.ZS(ZF())) {
        paramZzqp.Zm(a(-28451, -16369), ZF());
        paramZzqp.Zj(a(-28467, -12952), ZY());
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    paramZzqp.Zj(a(-28424, 627), ZH());
  }
  
  public void Zs(Zvt paramZvt) throws Zzam {
    String str1 = Zs();
    try {
      if (a(-28438, -17891).equals(paramZvt.Zf(a(-28475, 23570), a(-28469, -1720))))
        ZX(); 
    } catch (Exception exception) {
      throw a(null);
    } 
    Zd((byte)paramZvt.ZI(a(-28453, -14775), ZU, 0));
    Zs(paramZvt.Zz(a(-28433, 11739), Zli.Zj));
    Zh(paramZvt.Za(a(-28470, 19264), -1));
    ZF((byte)paramZvt.ZI(a(-28461, -12114), ZG, 0));
    ZY(paramZvt.Zz(a(-28460, 12692), Zli.Zj));
    ZH(paramZvt.Za(a(-28445, 15636), -1));
    ZZ(paramZvt.Zc(a(-28429, 12555), true));
    String str2 = paramZvt.Zf(a(-28477, -15737), null);
    if (Zsw8.ZS(str2))
      try {
        ZF(str2);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.USER_ERROR);
        throw new Zzam(a(-28457, -7927));
      }  
    try {
      Zj(paramZvt.Z_(a(-28417, 29029)));
      if (Zbqc.Zwu() == null)
        ZB("T1f7r"); 
    } catch (Exception exception) {
      throw a(null);
    } 
  }
  
  private void Zf() throws Exception {
    this.ZI.Zsv(null);
    this.ZI.ZsS(null);
    throw new Exception();
  }
  
  static {
    // Byte code:
    //   0: bipush #64
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'ä¦\íÂ_òp#¼É\\rï;ÞÑ£¢Óm½óz\\tÇ³q°Cð*húê"«¡Þ¤©vö\\rtÛÇÁ.eÆõzëxà@u:ß¸\\fV¥h¦ó£iy|6Ü\\n|FÚIÚä^:B>w°QþÖ}Õ("âÁ@Ó*ðüÊµeÂK¿n¢FzJÀ¹'pºûâÎ.6]N"´ÉÞÅÈ[`¯VôoeIÑýg%]p'1pWu\\fm%Q?Èß¿+ÁÍ1[¹dÅ¼×Øý©T7J]o/×qÚÒb@øñÅ.ÜåÒ@cÖ1ËIÕM³ü`\\r÷êql¢æÚÁYÚ§\\f@/;4^àzª`ôDÖ¬Oö=ûYEá|~Ø¡êË@T9m\\n#®°ð´ ½Ã»û´6Ê^{=? \\rC+KÓ½ãôÛOÆM\\fÅõí­÷À:ä\\rø«ãL¢ÔWÃH×­ J¤ h9Ózk=[d_èQÔsxFaß¬îJªø\\bás¤æº@s{2×!©\\bªn/õÊY¬NÑ3()y)(þ´@ùr6,gàfÌÊÅÃ¿[ýÿ²V¥É,DOaQ¥u"I:\\t3dý/\\\tM\Y¾¤Ä¸!=Ó3çú fÞÊk©ËÑ3\\tÍé \\tÞÜüzM¶ÎôâÃjÿÍß\\bªî&Xr¨éÙãfe®e,v×üÁlqZð°êõ¹´MØ JÍýP\\fn;¼üu`=ÐIÊÎ'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #8
    //   21: istore_1
    //   22: invokestatic ZB : (Ljava/lang/String;)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #79
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
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
    //   72: ldc 'yÛZñ'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_3
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #127
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zkk3.a : [Ljava/lang/String;
    //   135: bipush #64
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zkk3.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #111
    //   218: goto -> 248
    //   221: bipush #68
    //   223: goto -> 248
    //   226: bipush #126
    //   228: goto -> 248
    //   231: bipush #90
    //   233: goto -> 248
    //   236: bipush #105
    //   238: goto -> 248
    //   241: bipush #80
    //   243: goto -> 248
    //   246: bipush #77
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: iconst_2
    //   305: anewarray java/lang/String
    //   308: dup
    //   309: iconst_0
    //   310: sipush #-28476
    //   313: sipush #-26051
    //   316: invokestatic a : (II)Ljava/lang/String;
    //   319: aastore
    //   320: dup
    //   321: iconst_1
    //   322: sipush #-28442
    //   325: sipush #19271
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: aastore
    //   332: putstatic burp/Zkk3.ZU : [Ljava/lang/String;
    //   335: iconst_2
    //   336: anewarray java/lang/String
    //   339: dup
    //   340: iconst_0
    //   341: sipush #-28472
    //   344: sipush #-19774
    //   347: invokestatic a : (II)Ljava/lang/String;
    //   350: aastore
    //   351: dup
    //   352: iconst_1
    //   353: sipush #-28431
    //   356: sipush #-13061
    //   359: invokestatic a : (II)Ljava/lang/String;
    //   362: aastore
    //   363: putstatic burp/Zkk3.ZG : [Ljava/lang/String;
    //   366: return
  }
  
  public static void ZB(String paramString) {
    ZT = paramString;
  }
  
  public static String Zs() {
    return ZT;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF90D3) & 0xFFFF;
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
      byte b1 = 25;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkk3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */