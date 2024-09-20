package burp;

public final class Zsdu extends Record {
  private final boolean ZAW;
  
  private final boolean ZAr;
  
  private final boolean ZAz;
  
  public Zsdu(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.ZAW = paramBoolean1;
    this.ZAr = paramBoolean2;
    this.ZAz = paramBoolean3;
  }
  
  public static Zsdu ZAK() {
    return new Zsdu(false, false, false);
  }
  
  public static Zsdu Zz(String paramString) {
    // Byte code:
    //   0: invokestatic ZR : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: ifnonnull -> 16
    //   8: invokestatic ZAK : ()Lburp/Zsdu;
    //   11: areturn
    //   12: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   15: athrow
    //   16: iconst_0
    //   17: istore_2
    //   18: aload_0
    //   19: invokestatic parseInt : (Ljava/lang/String;)I
    //   22: pop
    //   23: iconst_1
    //   24: istore_2
    //   25: goto -> 47
    //   28: astore_3
    //   29: aload_3
    //   30: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   33: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   36: goto -> 47
    //   39: astore_3
    //   40: aload_3
    //   41: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   44: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   47: iconst_0
    //   48: istore_3
    //   49: aload_0
    //   50: invokevirtual length : ()I
    //   53: bipush #8
    //   55: if_icmpne -> 75
    //   58: iload_2
    //   59: ifeq -> 75
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   68: athrow
    //   69: iconst_1
    //   70: istore_3
    //   71: aload_1
    //   72: ifnonnull -> 275
    //   75: aload_0
    //   76: invokevirtual length : ()I
    //   79: bipush #10
    //   81: if_icmpne -> 275
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   90: athrow
    //   91: aload_0
    //   92: iconst_0
    //   93: invokevirtual charAt : (I)C
    //   96: invokestatic isDigit : (C)Z
    //   99: ifeq -> 275
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   108: athrow
    //   109: aload_0
    //   110: iconst_1
    //   111: invokevirtual charAt : (I)C
    //   114: invokestatic isDigit : (C)Z
    //   117: ifeq -> 275
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   126: athrow
    //   127: aload_0
    //   128: iconst_2
    //   129: invokevirtual charAt : (I)C
    //   132: invokestatic isDigit : (C)Z
    //   135: ifeq -> 275
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   144: athrow
    //   145: aload_0
    //   146: iconst_3
    //   147: invokevirtual charAt : (I)C
    //   150: invokestatic isDigit : (C)Z
    //   153: ifeq -> 275
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   162: athrow
    //   163: aload_0
    //   164: iconst_4
    //   165: invokevirtual charAt : (I)C
    //   168: bipush #45
    //   170: if_icmpne -> 275
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   179: athrow
    //   180: aload_0
    //   181: iconst_5
    //   182: invokevirtual charAt : (I)C
    //   185: invokestatic isDigit : (C)Z
    //   188: ifeq -> 275
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   197: athrow
    //   198: aload_0
    //   199: bipush #6
    //   201: invokevirtual charAt : (I)C
    //   204: invokestatic isDigit : (C)Z
    //   207: ifeq -> 275
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   216: athrow
    //   217: aload_0
    //   218: bipush #7
    //   220: invokevirtual charAt : (I)C
    //   223: bipush #45
    //   225: if_icmpne -> 275
    //   228: goto -> 235
    //   231: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   234: athrow
    //   235: aload_0
    //   236: bipush #8
    //   238: invokevirtual charAt : (I)C
    //   241: invokestatic isDigit : (C)Z
    //   244: ifeq -> 275
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   253: athrow
    //   254: aload_0
    //   255: bipush #9
    //   257: invokevirtual charAt : (I)C
    //   260: invokestatic isDigit : (C)Z
    //   263: ifeq -> 275
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   272: athrow
    //   273: iconst_1
    //   274: istore_3
    //   275: goto -> 288
    //   278: astore #4
    //   280: aload #4
    //   282: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   285: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   288: iconst_0
    //   289: istore #4
    //   291: iload_2
    //   292: ifne -> 339
    //   295: iload_3
    //   296: ifne -> 339
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   305: athrow
    //   306: aload_0
    //   307: invokestatic Zy : (Ljava/lang/String;)[B
    //   310: iconst_0
    //   311: aload_0
    //   312: invokevirtual length : ()I
    //   315: invokestatic Zy : ([BII)Lburp/Zsba;
    //   318: astore #5
    //   320: aload #5
    //   322: getstatic burp/Zsba.JSON : Lburp/Zsba;
    //   325: if_acmpne -> 336
    //   328: iconst_1
    //   329: goto -> 337
    //   332: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   335: athrow
    //   336: iconst_0
    //   337: istore #4
    //   339: new burp/Zsdu
    //   342: dup
    //   343: iload_2
    //   344: iload_3
    //   345: iload #4
    //   347: invokespecial <init> : (ZZZ)V
    //   350: areturn
    // Exception table:
    //   from	to	target	type
    //   4	12	12	java/lang/NumberFormatException
    //   18	25	28	java/lang/NumberFormatException
    //   18	25	39	java/lang/Exception
    //   49	62	65	java/lang/NumberFormatException
    //   49	275	278	java/lang/Exception
    //   71	84	87	java/lang/NumberFormatException
    //   75	102	105	java/lang/NumberFormatException
    //   91	120	123	java/lang/NumberFormatException
    //   109	138	141	java/lang/NumberFormatException
    //   127	156	159	java/lang/NumberFormatException
    //   145	173	176	java/lang/NumberFormatException
    //   163	191	194	java/lang/NumberFormatException
    //   180	210	213	java/lang/NumberFormatException
    //   198	228	231	java/lang/NumberFormatException
    //   217	247	250	java/lang/NumberFormatException
    //   235	266	269	java/lang/NumberFormatException
    //   291	299	302	java/lang/NumberFormatException
    //   320	332	332	java/lang/NumberFormatException
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zsdu;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zsdu;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zsdu;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean ZAW() {
    return this.ZAW;
  }
  
  public boolean ZAr() {
    return this.ZAr;
  }
  
  public boolean ZAz() {
    return this.ZAz;
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsdu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */