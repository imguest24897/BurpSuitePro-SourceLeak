package burp;

class Zs5p implements Zih {
  private final Zkko Zg;
  
  private final Ze0y Zp;
  
  private final Zbip Zk;
  
  private Zs5p(Zkko paramZkko, Ze0y paramZe0y, Zbip paramZbip) {
    this.Zg = paramZkko;
    this.Zp = paramZe0y;
    this.Zk = paramZbip;
  }
  
  public byte[] ZL(Zsp paramZsp) throws Zzt7 {
    // Byte code:
    //   0: invokestatic ZB : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: getfield Zi : Lburp/Zmcm;
    //   8: getstatic burp/Zmcm.HEADERS : Lburp/Zmcm;
    //   11: if_acmpne -> 22
    //   14: iconst_1
    //   15: goto -> 23
    //   18: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   21: athrow
    //   22: iconst_0
    //   23: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   26: aload_1
    //   27: getfield Zi : Lburp/Zmcm;
    //   30: invokevirtual toString : ()Ljava/lang/String;
    //   33: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   36: aload_1
    //   37: checkcast burp/Zsu
    //   40: astore_3
    //   41: aload_0
    //   42: getfield Zp : Lburp/Ze0y;
    //   45: aload_3
    //   46: invokevirtual Zv : ()Ljava/util/List;
    //   49: invokevirtual ZY : (Ljava/util/List;)[B
    //   52: astore #4
    //   54: aload #4
    //   56: arraylength
    //   57: aload_0
    //   58: getfield Zk : Lburp/Zbip;
    //   61: invokevirtual Zw : ()I
    //   64: idiv
    //   65: istore #5
    //   67: aload #4
    //   69: arraylength
    //   70: aload_0
    //   71: getfield Zk : Lburp/Zbip;
    //   74: invokevirtual Zw : ()I
    //   77: irem
    //   78: istore #6
    //   80: iload #6
    //   82: ifne -> 107
    //   85: aload #4
    //   87: arraylength
    //   88: ifle -> 107
    //   91: goto -> 98
    //   94: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   97: athrow
    //   98: iload #5
    //   100: goto -> 111
    //   103: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   106: athrow
    //   107: iload #5
    //   109: iconst_1
    //   110: iadd
    //   111: istore #7
    //   113: iload #7
    //   115: bipush #9
    //   117: imul
    //   118: aload #4
    //   120: arraylength
    //   121: iadd
    //   122: istore #8
    //   124: iload #8
    //   126: newarray byte
    //   128: astore #9
    //   130: aload #9
    //   132: invokestatic wrap : ([B)Ljava/nio/ByteBuffer;
    //   135: astore #10
    //   137: iconst_0
    //   138: istore #11
    //   140: iload #11
    //   142: iload #7
    //   144: if_icmpge -> 339
    //   147: iload #11
    //   149: iload #7
    //   151: iconst_1
    //   152: isub
    //   153: if_icmpne -> 164
    //   156: iconst_1
    //   157: goto -> 165
    //   160: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   163: athrow
    //   164: iconst_0
    //   165: istore #12
    //   167: iload #12
    //   169: ifeq -> 183
    //   172: aload_1
    //   173: getfield ZS : Lburp/Zz0x;
    //   176: goto -> 186
    //   179: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   182: athrow
    //   183: getstatic burp/Zz0x.Zh : Lburp/Zz0x;
    //   186: astore #13
    //   188: iload #11
    //   190: ifne -> 216
    //   193: new burp/Zsu
    //   196: dup
    //   197: aload_1
    //   198: getfield ZD : I
    //   201: aload #13
    //   203: invokestatic emptyList : ()Ljava/util/List;
    //   206: invokespecial <init> : (ILburp/Zz0x;Ljava/util/List;)V
    //   209: goto -> 232
    //   212: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   215: athrow
    //   216: new burp/Zss
    //   219: dup
    //   220: aload_1
    //   221: getfield ZD : I
    //   224: aload #13
    //   226: invokestatic emptyList : ()Ljava/util/List;
    //   229: invokespecial <init> : (ILburp/Zz0x;Ljava/util/List;)V
    //   232: astore #14
    //   234: aload #4
    //   236: arraylength
    //   237: ifne -> 261
    //   240: iconst_0
    //   241: istore #15
    //   243: iload_2
    //   244: ifeq -> 295
    //   247: iconst_2
    //   248: anewarray burp/Zbqc
    //   251: invokestatic Zr : ([Lburp/Zbqc;)V
    //   254: goto -> 261
    //   257: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   260: athrow
    //   261: iload #12
    //   263: ifeq -> 286
    //   266: iload #6
    //   268: ifle -> 286
    //   271: goto -> 278
    //   274: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   277: athrow
    //   278: iload #6
    //   280: istore #15
    //   282: iload_2
    //   283: ifeq -> 295
    //   286: aload_0
    //   287: getfield Zk : Lburp/Zbip;
    //   290: invokevirtual Zw : ()I
    //   293: istore #15
    //   295: aload_0
    //   296: getfield Zg : Lburp/Zkko;
    //   299: aload #10
    //   301: aload #14
    //   303: iload #15
    //   305: invokevirtual ZE : (Ljava/nio/ByteBuffer;Lburp/Zsp;I)V
    //   308: iload #11
    //   310: aload_0
    //   311: getfield Zk : Lburp/Zbip;
    //   314: invokevirtual Zw : ()I
    //   317: imul
    //   318: istore #16
    //   320: aload #10
    //   322: aload #4
    //   324: iload #16
    //   326: iload #15
    //   328: invokevirtual put : ([BII)Ljava/nio/ByteBuffer;
    //   331: pop
    //   332: iinc #11, 1
    //   335: iload_2
    //   336: ifeq -> 140
    //   339: aload #9
    //   341: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	18	burp/Zzt7
    //   80	91	94	burp/Zzt7
    //   85	103	103	burp/Zzt7
    //   147	160	160	burp/Zzt7
    //   167	179	179	burp/Zzt7
    //   188	212	212	burp/Zzt7
    //   243	254	257	burp/Zzt7
    //   261	271	274	burp/Zzt7
  }
  
  private static Zzt7 a(Zzt7 paramZzt7) {
    return paramZzt7;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs5p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */