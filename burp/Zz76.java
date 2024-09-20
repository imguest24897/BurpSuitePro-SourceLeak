package burp;

public class Zz76 {
  private final String ZI;
  
  private final String ZU;
  
  private Zz76(String paramString1, String paramString2) {
    this.ZI = paramString1;
    this.ZU = paramString2;
  }
  
  public String ZG() {
    return this.ZI;
  }
  
  public String ZC() {
    return this.ZU;
  }
  
  public static Zz76 Zf(Ze3n paramZe3n, Zxs7 paramZxs7) {
    // Byte code:
    //   0: invokestatic Zt : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zb4_.ZO : [I
    //   7: aload_1
    //   8: invokeinterface Z_ : ()Lburp/Zs66;
    //   13: invokevirtual ordinal : ()I
    //   16: iaload
    //   17: tableswitch default -> 116, 1 -> 130, 2 -> 158, 3 -> 258, 4 -> 308, 5 -> 308, 6 -> 308, 7 -> 324, 8 -> 324, 9 -> 337, 10 -> 337, 11 -> 337, 12 -> 337, 13 -> 337, 14 -> 337, 15 -> 337, 16 -> 337, 17 -> 337, 18 -> 337, 19 -> 337, 20 -> 337, 21 -> 361
    //   116: new java/lang/MatchException
    //   119: dup
    //   120: aconst_null
    //   121: aconst_null
    //   122: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   125: athrow
    //   126: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   129: athrow
    //   130: new burp/Zz76
    //   133: dup
    //   134: aload_0
    //   135: invokevirtual ZA : ()Lburp/Zefx;
    //   138: invokeinterface ZF : ()Lburp/Zlit;
    //   143: invokeinterface toString : ()Ljava/lang/String;
    //   148: ldc ''
    //   150: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   153: astore_3
    //   154: aload_3
    //   155: goto -> 390
    //   158: aload_1
    //   159: invokeinterface Zf : ()Ljava/lang/String;
    //   164: astore #4
    //   166: aload #4
    //   168: invokestatic parseInt : (Ljava/lang/String;)I
    //   171: istore #5
    //   173: iload #5
    //   175: iconst_1
    //   176: if_icmpne -> 187
    //   179: ldc ''
    //   181: astore #6
    //   183: iload_2
    //   184: ifne -> 214
    //   187: aload_0
    //   188: invokevirtual ZA : ()Lburp/Zefx;
    //   191: invokeinterface ZF : ()Lburp/Zlit;
    //   196: invokeinterface Zd4 : ()[B
    //   201: invokestatic ZG : ([B)Ljava/lang/String;
    //   204: ldc '/'
    //   206: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   209: iload #5
    //   211: aaload
    //   212: astore #6
    //   214: new burp/Zz76
    //   217: dup
    //   218: aload #4
    //   220: aload #6
    //   222: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   225: astore_3
    //   226: aload_3
    //   227: goto -> 390
    //   230: astore #5
    //   232: aload #5
    //   234: aload #4
    //   236: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   239: invokestatic ZU : (Ljava/lang/Throwable;Ljava/lang/String;Lnet/portswigger/Zk_;)V
    //   242: new burp/Zz76
    //   245: dup
    //   246: ldc '0'
    //   248: ldc ''
    //   250: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   253: astore_3
    //   254: aload_3
    //   255: goto -> 390
    //   258: aload_0
    //   259: invokevirtual ZA : ()Lburp/Zefx;
    //   262: invokeinterface ZF : ()Lburp/Zlit;
    //   267: invokeinterface Zd4 : ()[B
    //   272: invokestatic ZG : ([B)Ljava/lang/String;
    //   275: astore #4
    //   277: aload #4
    //   279: iconst_0
    //   280: aload #4
    //   282: ldc '/'
    //   284: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   287: invokevirtual substring : (II)Ljava/lang/String;
    //   290: astore #5
    //   292: new burp/Zz76
    //   295: dup
    //   296: ldc ''
    //   298: aload #5
    //   300: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   303: astore_3
    //   304: aload_3
    //   305: goto -> 390
    //   308: new burp/Zz76
    //   311: dup
    //   312: ldc ''
    //   314: ldc ''
    //   316: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   319: astore_3
    //   320: aload_3
    //   321: goto -> 390
    //   324: aload_0
    //   325: aload_1
    //   326: invokestatic Z_ : (Lburp/Zxs7;)Lburp/Zxs7;
    //   329: invokestatic Zf : (Lburp/Ze3n;Lburp/Zxs7;)Lburp/Zz76;
    //   332: astore_3
    //   333: aload_3
    //   334: goto -> 390
    //   337: new burp/Zz76
    //   340: dup
    //   341: aload_1
    //   342: invokeinterface Zf : ()Ljava/lang/String;
    //   347: aload_1
    //   348: invokeinterface ZI : ()Ljava/lang/String;
    //   353: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   356: astore_3
    //   357: aload_3
    //   358: goto -> 390
    //   361: iconst_0
    //   362: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   365: aload_1
    //   366: invokeinterface Z_ : ()Lburp/Zs66;
    //   371: invokevirtual toString : ()Ljava/lang/String;
    //   374: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   377: new burp/Zz76
    //   380: dup
    //   381: ldc ''
    //   383: ldc ''
    //   385: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   388: astore_3
    //   389: aload_3
    //   390: areturn
    // Exception table:
    //   from	to	target	type
    //   4	126	126	java/lang/NumberFormatException
    //   166	226	230	java/lang/NumberFormatException
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz76.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */