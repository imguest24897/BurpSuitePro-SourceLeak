package burp;

import java.io.File;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.portswigger.Za8;
import net.portswigger.Zah;
import net.portswigger.Zce;
import net.portswigger.Zk_;
import net.portswigger.Zny;
import net.portswigger.Zrmt;
import net.portswigger.Zs1;
import net.portswigger.Zt5;
import net.portswigger.Zup;

public class Zg1c implements Zmum {
  private static final Pattern ZJ;
  
  private final String ZS;
  
  private final String ZH;
  
  private final boolean Zf;
  
  private final Supplier<Zkvo> ZL;
  
  private final Zbnt ZI;
  
  private final Zb_l Zz;
  
  private final Zboc Zi;
  
  private final Zrud ZZ;
  
  private final Zm6e ZD;
  
  private final Zey9 ZF;
  
  private final String Zj;
  
  private final Zmy0 ZE;
  
  private final Zesi ZK;
  
  private static Zbqc[] ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg1c(String paramString1, String paramString2, boolean paramBoolean, Supplier<Zkvo> paramSupplier, Zbnt paramZbnt, Zkl6 paramZkl6, Zb_l paramZb_l, Zboc paramZboc, Zrud paramZrud, String paramString3, Zg0v paramZg0v, Zesi paramZesi) {
    this.ZS = paramString1;
    Zbqc[] arrayOfZbqc = Zp();
    try {
      this.ZH = paramString2;
      this.Zf = paramBoolean;
      this.ZL = paramSupplier;
      this.ZI = paramZbnt;
      this.Zz = paramZb_l;
      this.Zi = paramZboc;
      this.ZZ = paramZrud;
      this.Zj = paramString3;
      this.ZK = paramZesi;
      this.ZD = paramZkl6.Zs();
      this.ZF = paramZkl6.ZH();
      this.ZE = new Zmy0(paramZg0v);
      if (Zbqc.Zwu() == null)
        ZW(new Zbqc[3]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public Zup Zn() {
    try {
      Zkvo zkvo = this.ZL.get();
      Zlit zlit = ZK(zkvo, (this.ZZ.Zz()).Zl, this.ZK.Zqj());
      return ZQ(zkvo, zlit, this::ZI);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public Zup ZV() {
    try {
      Zkvo zkvo = this.ZL.get();
      Zlit zlit = Z_(zkvo, (this.ZZ.Zz()).Zl);
      return ZQ(zkvo, zlit, Zg1c::lambda$getAvailableInstallers$0);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  private Zup ZQ(Zkvo paramZkvo, Zlit paramZlit, Consumer<Zup> paramConsumer) {
    Zg3d zg3d = Zp(paramZlit);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Zb6q zb6q = (zg3d == null) ? null : zg3d.Ze();
    try {
      if (zb6q != null)
        try {
          if (zb6q.Zt() != null)
            try {
              if (zb6q.Zt().Zpu() != 0) {
                short s = zb6q.Ze();
                try {
                  if (s != 200)
                    return null; 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                Zup zup = Zp(zb6q.Zt().ZiD());
                try {
                  if (ZP(zup, paramZkvo)) {
                    paramConsumer.accept(zup);
                    return zup;
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                return null;
              } 
              return null;
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  private void ZI(Zup paramZup) {
    List<Ze9e> list = (List)paramZup.ZR.stream().map(Zg1c::lambda$updateAllowedChannelsFromUpdateServiceResponse$1).collect(Collectors.toList());
    try {
      if (paramZup.Zj != null)
        this.ZZ.Zx(new Ze9e(paramZup.Zj.ZU, paramZup.Zj.Zx)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.ZZ.Ze(list);
      if (paramZup.ZS == Za8.INVALID_CHANNEL)
        this.ZZ.ZU(Ze9e.Zo); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private Zup Zp(byte[] paramArrayOfbyte) {
    return Za(Zny.ZL(paramArrayOfbyte));
  }
  
  private Zup Za(String paramString) {
    try {
      return this.ZE.ZX(paramString);
    } catch (RuntimeException runtimeException) {
      Zah.Zl(runtimeException, Zk_.RETHROWN);
      throw new RuntimeException(paramString, runtimeException);
    } 
  }
  
  public String Zd(String paramString1, String paramString2, String paramString3, File paramFile, Zs1 paramZs1, Zlc8 paramZlc8) {
    return ZV(paramString1, paramString2, paramString3, paramFile, paramZs1.Za, paramZlc8);
  }
  
  public String ZV(String paramString1, String paramString2, String paramString3, File paramFile, Zt5 paramZt5, Zlc8 paramZlc8) {
    return Zi(paramString1, Zce.PRO, paramString2, paramString3, paramFile, paramZt5, paramZlc8);
  }
  
  public String Zi(String paramString1, Zce paramZce, String paramString2, String paramString3, File paramFile, Zt5 paramZt5, Zlc8 paramZlc8) {
    // Byte code:
    //   0: aload_2
    //   1: getstatic net/portswigger/Zce.DASTARDLY : Lnet/portswigger/Zce;
    //   4: if_acmpne -> 19
    //   7: new java/lang/UnsupportedOperationException
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: athrow
    //   15: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   18: athrow
    //   19: aconst_null
    //   20: astore #8
    //   22: aconst_null
    //   23: astore #9
    //   25: aload_0
    //   26: aload_1
    //   27: aload_2
    //   28: aload_3
    //   29: aload #4
    //   31: aload #6
    //   33: aload_0
    //   34: getfield ZL : Ljava/util/function/Supplier;
    //   37: invokeinterface get : ()Ljava/lang/Object;
    //   42: checkcast burp/Zkvo
    //   45: invokevirtual ZH : (Ljava/lang/String;Lnet/portswigger/Zce;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/Zt5;Lburp/Zkvo;)Lburp/Zlit;
    //   48: astore #10
    //   50: new net/portswigger/Zon
    //   53: dup
    //   54: aload #5
    //   56: iconst_0
    //   57: invokespecial <init> : (Ljava/io/File;Z)V
    //   60: astore #9
    //   62: aload_0
    //   63: aload #10
    //   65: aload #9
    //   67: aload #7
    //   69: invokevirtual Zp : (Lburp/Zlit;Ljava/io/OutputStream;Lburp/Zlc8;)Lburp/Zg3d;
    //   72: astore #11
    //   74: aload #11
    //   76: ifnull -> 96
    //   79: aload #11
    //   81: invokeinterface Ze : ()Lburp/Zb6q;
    //   86: ifnonnull -> 104
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: aconst_null
    //   97: goto -> 129
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: aload #11
    //   106: invokeinterface Ze : ()Lburp/Zb6q;
    //   111: invokeinterface Zm : ()Ljava/util/List;
    //   116: sipush #-27812
    //   119: sipush #-15149
    //   122: invokestatic a : (II)Ljava/lang/String;
    //   125: iconst_0
    //   126: invokestatic ZZ : (Ljava/util/List;Ljava/lang/String;Z)Ljava/lang/String;
    //   129: astore #12
    //   131: aload #12
    //   133: ifnonnull -> 144
    //   136: aconst_null
    //   137: goto -> 164
    //   140: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   143: athrow
    //   144: aload #12
    //   146: sipush #-27813
    //   149: sipush #-22146
    //   152: invokestatic a : (II)Ljava/lang/String;
    //   155: invokevirtual length : ()I
    //   158: invokevirtual substring : (I)Ljava/lang/String;
    //   161: invokevirtual trim : ()Ljava/lang/String;
    //   164: astore #13
    //   166: aload #13
    //   168: ifnull -> 188
    //   171: aload #9
    //   173: aload #13
    //   175: invokevirtual ZS : (Ljava/lang/String;)Z
    //   178: ifne -> 198
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   187: athrow
    //   188: sipush #-27818
    //   191: bipush #114
    //   193: invokestatic a : (II)Ljava/lang/String;
    //   196: astore #8
    //   198: aload #9
    //   200: ifnull -> 311
    //   203: aload #9
    //   205: invokevirtual close : ()V
    //   208: goto -> 311
    //   211: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   214: athrow
    //   215: astore #10
    //   217: aload #10
    //   219: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   222: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   225: goto -> 311
    //   228: astore #10
    //   230: sipush #-27819
    //   233: aload #10
    //   235: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   238: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   241: sipush #3818
    //   244: invokestatic a : (II)Ljava/lang/String;
    //   247: astore #8
    //   249: aload #9
    //   251: ifnull -> 311
    //   254: aload #9
    //   256: invokevirtual close : ()V
    //   259: goto -> 311
    //   262: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   265: athrow
    //   266: astore #10
    //   268: aload #10
    //   270: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   273: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   276: goto -> 311
    //   279: astore #14
    //   281: aload #9
    //   283: ifnull -> 308
    //   286: aload #9
    //   288: invokevirtual close : ()V
    //   291: goto -> 308
    //   294: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   297: athrow
    //   298: astore #15
    //   300: aload #15
    //   302: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   305: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   308: aload #14
    //   310: athrow
    //   311: aload #8
    //   313: ifnull -> 329
    //   316: aload #5
    //   318: invokevirtual delete : ()Z
    //   321: pop
    //   322: goto -> 329
    //   325: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   328: athrow
    //   329: aload #8
    //   331: areturn
    // Exception table:
    //   from	to	target	type
    //   0	15	15	java/io/IOException
    //   25	198	228	java/lang/Exception
    //   25	198	279	finally
    //   74	89	92	java/io/IOException
    //   79	100	100	java/io/IOException
    //   131	140	140	java/io/IOException
    //   166	181	184	java/io/IOException
    //   198	211	211	java/lang/RuntimeException
    //   203	208	215	java/io/IOException
    //   228	249	279	finally
    //   249	262	262	java/lang/RuntimeException
    //   254	259	266	java/io/IOException
    //   279	281	279	finally
    //   281	294	294	java/lang/RuntimeException
    //   286	291	298	java/io/IOException
    //   311	322	325	java/io/IOException
  }
  
  private Zg3d Zp(Zlit paramZlit) {
    Zefx zefx = this.ZF.ZY(paramZlit.Zdz(), this.ZD.ZO().Zf(paramZlit).ZK(Zxk3.HTTP_V11).Zw(a(-27810, 9493)).Zr().ZiD());
    return this.Zz.Zu(zefx, this.Zf);
  }
  
  private Zg3d Zp(Zlit paramZlit, OutputStream paramOutputStream, Zlc8 paramZlc8) {
    Zefx zefx = this.ZF.ZY(paramZlit.Zdz(), this.ZD.ZO().Zf(paramZlit).ZK(Zxk3.HTTP_V11).Zw(a(-27811, -10221)).Zr().ZiD());
    return this.Zz.Zv(zefx, this.Zf, paramOutputStream, paramZlc8);
  }
  
  private Zlit ZK(Zkvo paramZkvo, String paramString, boolean paramBoolean) throws Zxgy, Zxg5, MalformedURLException {
    return ZE(paramZkvo, paramString, a(-27809, 10725), Boolean.valueOf(paramBoolean));
  }
  
  private Zlit Z_(Zkvo paramZkvo, String paramString) throws Zxgy, Zxg5, MalformedURLException {
    return ZE(paramZkvo, paramString, a(-27825, 15124), null);
  }
  
  private Zlit ZE(Zkvo paramZkvo, String paramString1, String paramString2, Boolean paramBoolean) throws Zxgy, Zxg5, MalformedURLException {
    String str4 = this.Zj;
    String str5 = paramString1;
    String str6 = Zgkt.Zj();
    String str7 = paramString2;
    String str8 = this.ZH;
    String str1 = this.ZS + this.ZS + str8 + str7 + a(-27817, -15198) + str6 + a(-27829, 24024) + str5 + a(-27823, 9155);
    if (paramBoolean != null)
      str1 = str1 + str1 + a(-27826, -4628); 
    String str2 = Zkav.ZM(paramZkvo.ZF());
    str1 = str1 + str1 + a(-27828, -28270);
    String str3 = paramZkvo.Zb();
    if (str3 != null)
      str1 = str1 + str1 + a(-27815, 21294); 
    return new Zax(new URL(str1), this.ZI);
  }
  
  private Zlit ZH(String paramString1, Zce paramZce, String paramString2, String paramString3, Zt5 paramZt5, Zkvo paramZkvo) throws Zxgy, Zxg5, MalformedURLException {
    try {
    
    } catch (Zxgy zxgy) {
      throw a(null);
    } 
    String str1 = ZJ.matcher(paramString1).matches() ? paramString1 : (this.ZS + this.ZS + this.ZH);
    String str4 = paramZt5.serviceApiValue;
    String str5 = (this.ZZ.Zz()).Zl;
    String str6 = paramString3;
    String str7 = paramString2;
    String str8 = paramZce.jsonValue;
    String str2 = str1 + str1 + a(-27814, -26290) + str8 + a(-27816, 32353) + str7 + a(-27820, -1632) + str6 + a(-27824, -8340) + str5 + a(-27821, -2611);
    String str3 = Zgt4.Zk(paramZkvo.Zr());
    if (str3 != null)
      str2 = str2 + str2 + a(-27822, -21365); 
    return new Zax(new URL(str2), this.ZI);
  }
  
  private boolean ZP(Zup paramZup, Zkvo paramZkvo) {
    String str = paramZkvo.Zr();
    try {
      if (!str.equals(paramZup.Zy))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramZup.ZS == Za8.LICENSE_INVALID) {
        this.Zi.Z_(str);
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  private static Ze9e lambda$updateAllowedChannelsFromUpdateServiceResponse$1(Zrmt paramZrmt) {
    return new Ze9e(paramZrmt.ZU, paramZrmt.Zx);
  }
  
  private static void lambda$getAvailableInstallers$0(Zup paramZup) {}
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: aconst_null
    //   10: ldc 'Y3ÀSàÞ#ûþËU©Òò\\rÅ·;÷Ù¹JTÚç> 4íD\\f\\tRþVúðS\\f5\\nmYäù@Ì+\\tS2ïÑhgÕ\\tùàë§I>\\t¸B×"%¾ïã!hú¨kj8ÐéjìÝBô7~=ÚÊÙ'ýÑÓ>0=§)MAhÓÒzgÆôg¹\é´ø¨u§Ã1Ñ¸.þ\\bgroÒ-£ã¯¤fèDÎâ5³é¾Å|\\t$Ö[o¦Iàã©êÎ\\tûZ¡hKTm%_P ?ãoâ=×ûJß=±aý]q¯ CU)$HåY\\nÉÓêøÕÑ-iÖÊôY/Üä#,É'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #30
    //   21: istore_1
    //   22: invokestatic ZW : ([Lburp/Zbqc;)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #30
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
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
    //   72: ldc 'Z8\\r³\\tíxè§¸9D'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #9
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #121
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zg1c.a : [Ljava/lang/String;
    //   136: bipush #21
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zg1c.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #101
    //   218: goto -> 248
    //   221: bipush #62
    //   223: goto -> 248
    //   226: bipush #37
    //   228: goto -> 248
    //   231: bipush #87
    //   233: goto -> 248
    //   236: bipush #92
    //   238: goto -> 248
    //   241: bipush #82
    //   243: goto -> 248
    //   246: bipush #72
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: sipush #-27827
    //   307: sipush #29612
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   316: putstatic burp/Zg1c.ZJ : Ljava/util/regex/Pattern;
    //   319: return
  }
  
  public static void ZW(Zbqc[] paramArrayOfZbqc) {
    ZW = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zp() {
    return ZW;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF935F) & 0xFFFF;
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
      char c = 'Ë';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg1c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */