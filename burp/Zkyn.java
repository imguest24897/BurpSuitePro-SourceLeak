package burp;

import java.io.IOException;

public class Zkyn extends Zkte {
  private final Zsxg ZM;
  
  public Zkyn(Zr_4 paramZr_4, Zsxg paramZsxg) {
    super(paramZr_4, paramZsxg);
    this.ZM = paramZsxg;
  }
  
  public void Zy4() {
    this.ZM.Zy4();
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: invokestatic ZE : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZM : Lburp/Zsxg;
    //   8: invokeinterface ZJl : ()I
    //   13: istore #4
    //   15: iload #4
    //   17: ifle -> 58
    //   20: aload_0
    //   21: getfield ZM : Lburp/Zsxg;
    //   24: invokeinterface ZJc : ()I
    //   29: iload #4
    //   31: if_icmplt -> 58
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   40: athrow
    //   41: aload_0
    //   42: getfield ZM : Lburp/Zsxg;
    //   45: aconst_null
    //   46: invokeinterface ZP : (Lburp/Zstu;)V
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: aload_0
    //   59: getfield ZM : Lburp/Zsxg;
    //   62: invokeinterface ZJJ : ()Lburp/Zstu;
    //   67: ifnonnull -> 86
    //   70: aload_0
    //   71: invokevirtual Zoe : ()Z
    //   74: ifeq -> 84
    //   77: goto -> 114
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: aconst_null
    //   85: areturn
    //   86: aload_0
    //   87: invokevirtual ZoI : ()Z
    //   90: ifeq -> 100
    //   93: goto -> 114
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload_0
    //   101: getfield ZM : Lburp/Zsxg;
    //   104: aconst_null
    //   105: invokeinterface ZP : (Lburp/Zstu;)V
    //   110: aload_3
    //   111: ifnull -> 58
    //   114: aload_0
    //   115: getfield ZM : Lburp/Zsxg;
    //   118: invokeinterface ZJ9 : ()Lburp/Zmyi;
    //   123: invokeinterface ZKg : ()[I
    //   128: astore #7
    //   130: aload_0
    //   131: getfield ZM : Lburp/Zsxg;
    //   134: invokeinterface ZJJ : ()Lburp/Zstu;
    //   139: invokeinterface ZiD : ()[B
    //   144: astore #8
    //   146: aload_0
    //   147: getfield ZM : Lburp/Zsxg;
    //   150: invokeinterface ZJa : ()Lburp/Zstu;
    //   155: invokeinterface ZiD : ()[B
    //   160: astore #9
    //   162: aload #7
    //   164: iconst_2
    //   165: iaload
    //   166: iconst_1
    //   167: if_icmpne -> 224
    //   170: aload #7
    //   172: iconst_3
    //   173: iaload
    //   174: ifne -> 204
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   183: athrow
    //   184: aload #8
    //   186: arraylength
    //   187: aload #7
    //   189: iconst_5
    //   190: iaload
    //   191: isub
    //   192: istore #5
    //   194: aload #7
    //   196: iconst_4
    //   197: iaload
    //   198: istore #6
    //   200: aload_3
    //   201: ifnull -> 234
    //   204: aload #7
    //   206: iconst_4
    //   207: iaload
    //   208: istore #5
    //   210: aload #9
    //   212: arraylength
    //   213: aload #7
    //   215: iconst_5
    //   216: iaload
    //   217: isub
    //   218: istore #6
    //   220: aload_3
    //   221: ifnull -> 234
    //   224: aload #8
    //   226: arraylength
    //   227: istore #5
    //   229: aload #9
    //   231: arraylength
    //   232: istore #6
    //   234: aload_0
    //   235: getfield ZM : Lburp/Zsxg;
    //   238: invokeinterface ZJx : ()Lburp/Zstu;
    //   243: ifnonnull -> 254
    //   246: aconst_null
    //   247: goto -> 268
    //   250: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   253: athrow
    //   254: aload_0
    //   255: getfield ZM : Lburp/Zsxg;
    //   258: invokeinterface ZJx : ()Lburp/Zstu;
    //   263: invokeinterface ZiD : ()[B
    //   268: astore #10
    //   270: new java/io/ByteArrayOutputStream
    //   273: dup
    //   274: iload #5
    //   276: iload #6
    //   278: iadd
    //   279: iconst_1
    //   280: iadd
    //   281: aload #10
    //   283: ifnonnull -> 294
    //   286: iconst_0
    //   287: goto -> 297
    //   290: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   293: athrow
    //   294: aload #10
    //   296: arraylength
    //   297: iadd
    //   298: invokespecial <init> : (I)V
    //   301: astore #11
    //   303: aload #7
    //   305: iconst_1
    //   306: iaload
    //   307: ifne -> 363
    //   310: aload #11
    //   312: aload #8
    //   314: iconst_0
    //   315: iload #5
    //   317: invokevirtual write : ([BII)V
    //   320: aload #7
    //   322: iconst_0
    //   323: iaload
    //   324: iconst_1
    //   325: if_icmpne -> 349
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   334: athrow
    //   335: aload #11
    //   337: bipush #46
    //   339: invokevirtual write : (I)V
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   348: athrow
    //   349: aload #11
    //   351: aload #9
    //   353: iconst_0
    //   354: iload #6
    //   356: invokevirtual write : ([BII)V
    //   359: aload_3
    //   360: ifnull -> 412
    //   363: aload #11
    //   365: aload #9
    //   367: iconst_0
    //   368: iload #6
    //   370: invokevirtual write : ([BII)V
    //   373: aload #7
    //   375: iconst_0
    //   376: iaload
    //   377: iconst_1
    //   378: if_icmpne -> 402
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   387: athrow
    //   388: aload #11
    //   390: bipush #46
    //   392: invokevirtual write : (I)V
    //   395: goto -> 402
    //   398: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   401: athrow
    //   402: aload #11
    //   404: aload #8
    //   406: iconst_0
    //   407: iload #5
    //   409: invokevirtual write : ([BII)V
    //   412: aload #10
    //   414: ifnull -> 435
    //   417: aload #11
    //   419: aload #10
    //   421: iconst_0
    //   422: aload #10
    //   424: arraylength
    //   425: invokevirtual write : ([BII)V
    //   428: goto -> 435
    //   431: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   434: athrow
    //   435: aload_0
    //   436: getfield ZM : Lburp/Zsxg;
    //   439: aload_0
    //   440: getfield ZM : Lburp/Zsxg;
    //   443: invokeinterface ZJc : ()I
    //   448: iconst_1
    //   449: iadd
    //   450: invokeinterface ZMb : (I)V
    //   455: aload_0
    //   456: getfield ZM : Lburp/Zsxg;
    //   459: invokeinterface Zyn : ()Lburp/Zm41;
    //   464: new burp/Zr1f
    //   467: dup
    //   468: aload_1
    //   469: invokespecial <init> : (Lburp/Zzlx;)V
    //   472: aload_2
    //   473: aload #11
    //   475: invokevirtual toByteArray : ()[B
    //   478: invokeinterface Zm : (Lburp/Zm42;[B[B)[[B
    //   483: areturn
    //   484: astore #7
    //   486: aload #7
    //   488: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   491: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   494: aconst_null
    //   495: areturn
    // Exception table:
    //   from	to	target	type
    //   15	34	37	java/lang/Exception
    //   20	51	54	java/lang/Exception
    //   70	80	80	java/lang/Exception
    //   86	96	96	java/lang/Exception
    //   114	483	484	java/lang/Exception
    //   162	177	180	java/lang/Exception
    //   234	250	250	java/lang/Exception
    //   270	290	290	java/lang/Exception
    //   303	328	331	java/lang/Exception
    //   310	342	345	java/lang/Exception
    //   349	381	384	java/lang/Exception
    //   363	395	398	java/lang/Exception
    //   412	428	431	java/lang/Exception
  }
  
  private boolean Zoe() {
    // Byte code:
    //   0: invokestatic ZE : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZM : Lburp/Zsxg;
    //   8: invokeinterface ZJb : ()Lburp/Zefg;
    //   13: astore_2
    //   14: aload_0
    //   15: getfield ZM : Lburp/Zsxg;
    //   18: invokeinterface ZJu : ()I
    //   23: istore_3
    //   24: iload_3
    //   25: aload_2
    //   26: invokeinterface size : ()I
    //   31: if_icmplt -> 36
    //   34: iconst_0
    //   35: ireturn
    //   36: aload_2
    //   37: iload_3
    //   38: invokeinterface get : (I)Ljava/lang/Object;
    //   43: checkcast burp/Zstu
    //   46: invokeinterface ZiD : ()[B
    //   51: astore #4
    //   53: new java/io/ByteArrayOutputStream
    //   56: dup
    //   57: aload #4
    //   59: arraylength
    //   60: invokespecial <init> : (I)V
    //   63: astore #5
    //   65: iconst_0
    //   66: istore #6
    //   68: iload #6
    //   70: aload #4
    //   72: arraylength
    //   73: if_icmpge -> 120
    //   76: aload #4
    //   78: iload #6
    //   80: baload
    //   81: istore #7
    //   83: iload #7
    //   85: invokestatic isLetterOrDigit : (I)Z
    //   88: ifeq -> 102
    //   91: aload #5
    //   93: iload #7
    //   95: invokevirtual write : (I)V
    //   98: aload_1
    //   99: ifnull -> 113
    //   102: aload #5
    //   104: invokevirtual size : ()I
    //   107: ifle -> 113
    //   110: goto -> 120
    //   113: iinc #6, 1
    //   116: aload_1
    //   117: ifnull -> 68
    //   120: aload_0
    //   121: getfield ZM : Lburp/Zsxg;
    //   124: aload_0
    //   125: getfield Zn : Lburp/Zr_4;
    //   128: aload #5
    //   130: invokevirtual toByteArray : ()[B
    //   133: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   138: invokeinterface ZP : (Lburp/Zstu;)V
    //   143: new java/io/ByteArrayOutputStream
    //   146: dup
    //   147: aload #4
    //   149: arraylength
    //   150: aload_0
    //   151: getfield ZM : Lburp/Zsxg;
    //   154: invokeinterface ZJJ : ()Lburp/Zstu;
    //   159: invokeinterface Zpu : ()I
    //   164: isub
    //   165: invokespecial <init> : (I)V
    //   168: astore #5
    //   170: iload #6
    //   172: aload #4
    //   174: arraylength
    //   175: if_icmpge -> 221
    //   178: aload #4
    //   180: iload #6
    //   182: baload
    //   183: istore #7
    //   185: iload #7
    //   187: invokestatic isLetterOrDigit : (I)Z
    //   190: ifeq -> 204
    //   193: aload #5
    //   195: iload #7
    //   197: invokevirtual write : (I)V
    //   200: aload_1
    //   201: ifnull -> 214
    //   204: iload #7
    //   206: bipush #64
    //   208: if_icmpne -> 214
    //   211: goto -> 221
    //   214: iinc #6, 1
    //   217: aload_1
    //   218: ifnull -> 170
    //   221: aload_0
    //   222: getfield ZM : Lburp/Zsxg;
    //   225: aload_0
    //   226: getfield Zn : Lburp/Zr_4;
    //   229: aload #5
    //   231: invokevirtual toByteArray : ()[B
    //   234: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   239: invokeinterface Zz : (Lburp/Zstu;)V
    //   244: iload #6
    //   246: aload #4
    //   248: arraylength
    //   249: if_icmpge -> 284
    //   252: aload_0
    //   253: getfield ZM : Lburp/Zsxg;
    //   256: aload_0
    //   257: getfield Zn : Lburp/Zr_4;
    //   260: aload #4
    //   262: iload #6
    //   264: aload #4
    //   266: arraylength
    //   267: invokestatic Zz : ([BII)[B
    //   270: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   275: invokeinterface Zd : (Lburp/Zstu;)V
    //   280: aload_1
    //   281: ifnull -> 294
    //   284: aload_0
    //   285: getfield ZM : Lburp/Zsxg;
    //   288: aconst_null
    //   289: invokeinterface Zd : (Lburp/Zstu;)V
    //   294: aload_0
    //   295: getfield ZM : Lburp/Zsxg;
    //   298: aload_0
    //   299: getfield ZM : Lburp/Zsxg;
    //   302: invokeinterface ZJu : ()I
    //   307: iconst_1
    //   308: iadd
    //   309: invokeinterface ZM0 : (I)V
    //   314: aload_0
    //   315: getfield ZM : Lburp/Zsxg;
    //   318: invokeinterface ZJJ : ()Lburp/Zstu;
    //   323: invokeinterface Zpu : ()I
    //   328: ifgt -> 348
    //   331: aload_0
    //   332: getfield ZM : Lburp/Zsxg;
    //   335: invokeinterface ZJa : ()Lburp/Zstu;
    //   340: invokeinterface Zpu : ()I
    //   345: ifle -> 414
    //   348: aload_0
    //   349: getfield ZM : Lburp/Zsxg;
    //   352: iconst_0
    //   353: invokeinterface ZMb : (I)V
    //   358: aload_0
    //   359: getfield ZM : Lburp/Zsxg;
    //   362: invokeinterface ZJ9 : ()Lburp/Zmyi;
    //   367: astore #7
    //   369: iconst_0
    //   370: istore #8
    //   372: iload #8
    //   374: aload #7
    //   376: invokeinterface Zpu : ()I
    //   381: if_icmpge -> 401
    //   384: aload #7
    //   386: iload #8
    //   388: iconst_0
    //   389: invokeinterface ZX : (II)V
    //   394: iinc #8, 1
    //   397: aload_1
    //   398: ifnull -> 372
    //   401: aload_0
    //   402: getfield ZM : Lburp/Zsxg;
    //   405: aload #7
    //   407: invokeinterface Zv : (Lburp/Zmyi;)V
    //   412: iconst_1
    //   413: ireturn
    //   414: goto -> 4
  }
  
  private boolean ZoI() {
    Zmyi zmyi = this.ZM.ZJ9();
    int[] arrayOfInt = zmyi.ZKg();
    byte[] arrayOfByte1 = this.ZM.ZJJ().ZiD();
    byte[] arrayOfByte2 = this.ZM.ZJa().ZiD();
    boolean bool = (arrayOfInt[2] == 0) ? ((arrayOfByte1.length == 0 || arrayOfByte2.length == 0) ? true : false) : ((arrayOfInt[3] == 0) ? ((arrayOfInt[5] - arrayOfByte1.length == 0 || arrayOfInt[4] == 0) ? true : false) : ((arrayOfInt[4] == 0 || arrayOfInt[5] - arrayOfByte2.length == 0) ? true : false));
    arrayOfInt[0] = arrayOfInt[0] + 1;
    if (arrayOfInt[0] == 1 && !bool) {
      zmyi.ZC(arrayOfInt);
      this.ZM.Zv(zmyi);
      return true;
    } 
    arrayOfInt[0] = 0;
    arrayOfInt[1] = arrayOfInt[1] + 1;
    if (arrayOfInt[1] == 1 && !bool) {
      zmyi.ZC(arrayOfInt);
      this.ZM.Zv(zmyi);
      return true;
    } 
    arrayOfInt[1] = 0;
    if (arrayOfInt[2] == 0) {
      arrayOfInt[2] = 1;
      if (!bool) {
        zmyi.ZC(arrayOfInt);
        this.ZM.Zv(zmyi);
        return true;
      } 
    } 
    arrayOfInt[3] = arrayOfInt[3] + 1;
    if (arrayOfInt[3] == 1 && arrayOfInt[4] + arrayOfInt[5] < arrayOfByte1.length && arrayOfInt[5] <= arrayOfByte2.length && (arrayOfInt[4] > 0 || arrayOfByte2.length - arrayOfInt[5] > 0)) {
      zmyi.ZC(arrayOfInt);
      this.ZM.Zv(zmyi);
      return true;
    } 
    arrayOfInt[4] = arrayOfInt[4] + 1;
    if (arrayOfInt[4] + arrayOfInt[5] < arrayOfByte2.length && arrayOfInt[5] <= arrayOfByte1.length) {
      arrayOfInt[3] = 0;
      zmyi.ZC(arrayOfInt);
      this.ZM.Zv(zmyi);
      return true;
    } 
    if (arrayOfInt[4] + arrayOfInt[5] < arrayOfByte1.length && arrayOfInt[5] <= arrayOfByte2.length) {
      arrayOfInt[3] = 1;
      zmyi.ZC(arrayOfInt);
      this.ZM.Zv(zmyi);
      return true;
    } 
    arrayOfInt[4] = 0;
    arrayOfInt[5] = arrayOfInt[5] + 1;
    if (arrayOfInt[5] < arrayOfByte1.length && arrayOfInt[5] <= arrayOfByte2.length) {
      arrayOfInt[3] = 0;
      zmyi.ZC(arrayOfInt);
      this.ZM.Zv(zmyi);
      return true;
    } 
    if (arrayOfInt[5] < arrayOfByte2.length && arrayOfInt[5] <= arrayOfByte1.length) {
      arrayOfInt[3] = 1;
      zmyi.ZC(arrayOfInt);
      this.ZM.Zv(zmyi);
      return true;
    } 
    zmyi.ZC(arrayOfInt);
    this.ZM.Zv(zmyi);
    return false;
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.ZM.ZS(paramZs4f);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkyn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */