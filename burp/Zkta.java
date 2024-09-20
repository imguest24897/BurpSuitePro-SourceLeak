package burp;

import java.io.IOException;

public class Zkta extends Zkte {
  private final Zxgv ZH;
  
  public Zkta(Zr_4 paramZr_4, Zxgv paramZxgv) {
    super(paramZr_4, paramZxgv);
    this.ZH = paramZxgv;
  }
  
  public void Zy4() {
    this.ZH.Zy4();
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.ZH.ZS(paramZs4f);
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: invokestatic ZK : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZH : Lburp/Zxgv;
    //   8: invokeinterface ZKV : ()Ljava/lang/String;
    //   13: astore #4
    //   15: aload #4
    //   17: ifnull -> 26
    //   20: aload #4
    //   22: invokestatic Zy : (Ljava/lang/String;)[B
    //   25: astore_2
    //   26: aload_0
    //   27: aload_2
    //   28: invokevirtual Zo : ([B)I
    //   31: istore #5
    //   33: aload_0
    //   34: getfield ZH : Lburp/Zxgv;
    //   37: invokeinterface ZKq : ()I
    //   42: iload #5
    //   44: if_icmpge -> 178
    //   47: aload_0
    //   48: getfield ZH : Lburp/Zxgv;
    //   51: invokeinterface ZKx : ()Z
    //   56: ifeq -> 118
    //   59: aload_2
    //   60: iconst_2
    //   61: aload_0
    //   62: getfield ZH : Lburp/Zxgv;
    //   65: invokeinterface ZKq : ()I
    //   70: imul
    //   71: iconst_2
    //   72: invokestatic Zo : ([BII)Ljava/lang/String;
    //   75: bipush #16
    //   77: invokestatic parseInt : (Ljava/lang/String;I)I
    //   80: pop
    //   81: goto -> 118
    //   84: astore #6
    //   86: aload #6
    //   88: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   91: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   94: aload_0
    //   95: getfield ZH : Lburp/Zxgv;
    //   98: aload_0
    //   99: getfield ZH : Lburp/Zxgv;
    //   102: invokeinterface ZKq : ()I
    //   107: iconst_1
    //   108: iadd
    //   109: invokeinterface Zdp : (I)V
    //   114: aload_3
    //   115: ifnonnull -> 33
    //   118: aload_0
    //   119: invokevirtual ZY2 : ()V
    //   122: aload_0
    //   123: getfield ZH : Lburp/Zxgv;
    //   126: invokeinterface ZKK : ()I
    //   131: sipush #256
    //   134: if_icmpge -> 144
    //   137: goto -> 178
    //   140: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   143: athrow
    //   144: aload_0
    //   145: getfield ZH : Lburp/Zxgv;
    //   148: aload_0
    //   149: getfield ZH : Lburp/Zxgv;
    //   152: invokeinterface ZKq : ()I
    //   157: iconst_1
    //   158: iadd
    //   159: invokeinterface Zdp : (I)V
    //   164: aload_0
    //   165: getfield ZH : Lburp/Zxgv;
    //   168: iconst_1
    //   169: invokeinterface Zdg : (I)V
    //   174: aload_3
    //   175: ifnonnull -> 33
    //   178: aload_0
    //   179: getfield ZH : Lburp/Zxgv;
    //   182: invokeinterface ZKq : ()I
    //   187: iload #5
    //   189: if_icmplt -> 198
    //   192: aconst_null
    //   193: areturn
    //   194: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   197: athrow
    //   198: aload_0
    //   199: getfield ZH : Lburp/Zxgv;
    //   202: iload #5
    //   204: aload_0
    //   205: getfield ZH : Lburp/Zxgv;
    //   208: invokeinterface ZKe : ()I
    //   213: imul
    //   214: invokeinterface ZvH : (I)V
    //   219: aload_2
    //   220: invokestatic Zm : ([B)[B
    //   223: astore #6
    //   225: aload_0
    //   226: getfield ZH : Lburp/Zxgv;
    //   229: invokeinterface ZKx : ()Z
    //   234: ifeq -> 372
    //   237: aload_2
    //   238: iconst_2
    //   239: aload_0
    //   240: getfield ZH : Lburp/Zxgv;
    //   243: invokeinterface ZKq : ()I
    //   248: imul
    //   249: iconst_2
    //   250: invokestatic Zo : ([BII)Ljava/lang/String;
    //   253: bipush #16
    //   255: invokestatic parseInt : (Ljava/lang/String;I)I
    //   258: istore #7
    //   260: iload #7
    //   262: aload_0
    //   263: getfield ZH : Lburp/Zxgv;
    //   266: invokeinterface ZKK : ()I
    //   271: ixor
    //   272: istore #7
    //   274: iload #7
    //   276: invokestatic toHexString : (I)Ljava/lang/String;
    //   279: astore #8
    //   281: aload #6
    //   283: iconst_2
    //   284: aload_0
    //   285: getfield ZH : Lburp/Zxgv;
    //   288: invokeinterface ZKq : ()I
    //   293: imul
    //   294: aload #8
    //   296: invokevirtual length : ()I
    //   299: iconst_1
    //   300: if_icmpne -> 312
    //   303: bipush #48
    //   305: goto -> 324
    //   308: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   311: athrow
    //   312: aload #8
    //   314: aload #8
    //   316: invokevirtual length : ()I
    //   319: iconst_2
    //   320: isub
    //   321: invokevirtual charAt : (I)C
    //   324: i2b
    //   325: bastore
    //   326: aload #6
    //   328: iconst_2
    //   329: aload_0
    //   330: getfield ZH : Lburp/Zxgv;
    //   333: invokeinterface ZKq : ()I
    //   338: imul
    //   339: iconst_1
    //   340: iadd
    //   341: aload #8
    //   343: aload #8
    //   345: invokevirtual length : ()I
    //   348: iconst_1
    //   349: isub
    //   350: invokevirtual charAt : (I)C
    //   353: i2b
    //   354: bastore
    //   355: goto -> 404
    //   358: astore #7
    //   360: aload #7
    //   362: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   365: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   368: aload_3
    //   369: ifnonnull -> 404
    //   372: aload #6
    //   374: aload_0
    //   375: getfield ZH : Lburp/Zxgv;
    //   378: invokeinterface ZKq : ()I
    //   383: dup2
    //   384: baload
    //   385: aload_0
    //   386: getfield ZH : Lburp/Zxgv;
    //   389: invokeinterface ZKK : ()I
    //   394: ixor
    //   395: i2b
    //   396: bastore
    //   397: goto -> 404
    //   400: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   403: athrow
    //   404: aload_0
    //   405: getfield ZH : Lburp/Zxgv;
    //   408: aload_0
    //   409: getfield ZH : Lburp/Zxgv;
    //   412: invokeinterface ZKK : ()I
    //   417: iconst_1
    //   418: ishl
    //   419: invokeinterface Zdg : (I)V
    //   424: aload_0
    //   425: getfield ZH : Lburp/Zxgv;
    //   428: invokeinterface Zyn : ()Lburp/Zm41;
    //   433: new burp/Zr1f
    //   436: dup
    //   437: aload_1
    //   438: invokespecial <init> : (Lburp/Zzlx;)V
    //   441: aload_2
    //   442: iconst_3
    //   443: anewarray [B
    //   446: dup
    //   447: iconst_0
    //   448: aload #6
    //   450: aastore
    //   451: dup
    //   452: iconst_1
    //   453: aconst_null
    //   454: aastore
    //   455: dup
    //   456: iconst_2
    //   457: aconst_null
    //   458: aastore
    //   459: invokeinterface ZL : (Lburp/Zm42;[B[[B)[[B
    //   464: areturn
    // Exception table:
    //   from	to	target	type
    //   59	81	84	java/lang/NumberFormatException
    //   118	140	140	java/lang/NumberFormatException
    //   178	194	194	java/lang/NumberFormatException
    //   237	355	358	java/lang/Exception
    //   281	308	308	java/lang/NumberFormatException
    //   360	397	400	java/lang/NumberFormatException
  }
  
  private void ZY2() {
    String[] arrayOfString = Ze9j.ZK();
    while (this.ZH.ZKK() < 256) {
      try {
        if ((this.ZH.ZKl() & this.ZH.ZKK()) == 0) {
          this.ZH.Zdg(this.ZH.ZKK() << 1);
          if (arrayOfString == null)
            break; 
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } 
  }
  
  private int Zo(byte[] paramArrayOfbyte) {
    return this.ZH.Zz(paramArrayOfbyte);
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkta.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */