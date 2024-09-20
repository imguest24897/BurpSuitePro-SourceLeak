package org.yaml;

import java.io.IOException;

class Zj5 implements Zd {
  private final boolean ZK;
  
  final Zb ZE;
  
  public Zj5(Zb paramZb, boolean paramBoolean) {
    this.ZK = paramBoolean;
  }
  
  public void Zt() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZK : Z
    //   8: ifne -> 84
    //   11: aload_0
    //   12: getfield ZE : Lorg/yaml/Zb;
    //   15: invokestatic ZJ : (Lorg/yaml/Zb;)Lorg/yaml/Zlv;
    //   18: instanceof org/yaml/Zlu
    //   21: ifeq -> 84
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   30: athrow
    //   31: aload_0
    //   32: getfield ZE : Lorg/yaml/Zb;
    //   35: aload_0
    //   36: getfield ZE : Lorg/yaml/Zb;
    //   39: invokestatic Zf : (Lorg/yaml/Zb;)Lorg/yaml/Zq;
    //   42: invokevirtual ZE : ()Ljava/lang/Object;
    //   45: checkcast java/lang/Integer
    //   48: invokestatic ZE : (Lorg/yaml/Zb;Ljava/lang/Integer;)Ljava/lang/Integer;
    //   51: pop
    //   52: aload_0
    //   53: getfield ZE : Lorg/yaml/Zb;
    //   56: aload_0
    //   57: getfield ZE : Lorg/yaml/Zb;
    //   60: invokestatic Za : (Lorg/yaml/Zb;)Lorg/yaml/Zq;
    //   63: invokevirtual ZE : ()Ljava/lang/Object;
    //   66: checkcast org/yaml/Zd
    //   69: invokestatic ZB : (Lorg/yaml/Zb;Lorg/yaml/Zd;)Lorg/yaml/Zd;
    //   72: pop
    //   73: aload_1
    //   74: ifnonnull -> 447
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   83: athrow
    //   84: aload_0
    //   85: getfield ZE : Lorg/yaml/Zb;
    //   88: invokestatic ZJ : (Lorg/yaml/Zb;)Lorg/yaml/Zlv;
    //   91: instanceof org/yaml/Zld
    //   94: ifeq -> 133
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   103: athrow
    //   104: aload_0
    //   105: getfield ZE : Lorg/yaml/Zb;
    //   108: invokestatic ZM : (Lorg/yaml/Zb;)Lorg/yaml/Zj8;
    //   111: aload_0
    //   112: getfield ZE : Lorg/yaml/Zb;
    //   115: invokestatic ZJ : (Lorg/yaml/Zb;)Lorg/yaml/Zlv;
    //   118: invokevirtual ZF : (Lorg/yaml/Zlv;)Lorg/yaml/Zlv;
    //   121: pop
    //   122: aload_1
    //   123: ifnonnull -> 447
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   132: athrow
    //   133: aload_0
    //   134: getfield ZE : Lorg/yaml/Zb;
    //   137: invokevirtual ZJ : ()V
    //   140: aload_0
    //   141: getfield ZE : Lorg/yaml/Zb;
    //   144: invokestatic ZL : (Lorg/yaml/Zb;)Z
    //   147: ifeq -> 171
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   156: athrow
    //   157: aload_0
    //   158: getfield ZK : Z
    //   161: ifeq -> 192
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   170: athrow
    //   171: aload_0
    //   172: getfield ZE : Lorg/yaml/Zb;
    //   175: aload_0
    //   176: getfield ZE : Lorg/yaml/Zb;
    //   179: invokestatic ZU : (Lorg/yaml/Zb;)I
    //   182: invokestatic Zx : (Lorg/yaml/Zb;I)V
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   191: athrow
    //   192: aload_0
    //   193: getfield ZE : Lorg/yaml/Zb;
    //   196: ldc '-'
    //   198: iconst_1
    //   199: iconst_0
    //   200: iconst_1
    //   201: invokevirtual Zv : (Ljava/lang/String;ZZZ)V
    //   204: aload_0
    //   205: getfield ZE : Lorg/yaml/Zb;
    //   208: invokestatic ZL : (Lorg/yaml/Zb;)Z
    //   211: ifeq -> 264
    //   214: aload_0
    //   215: getfield ZK : Z
    //   218: ifeq -> 264
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   227: athrow
    //   228: aload_0
    //   229: getfield ZE : Lorg/yaml/Zb;
    //   232: aload_0
    //   233: getfield ZE : Lorg/yaml/Zb;
    //   236: invokestatic Zy : (Lorg/yaml/Zb;)Ljava/lang/Integer;
    //   239: invokevirtual intValue : ()I
    //   242: aload_0
    //   243: getfield ZE : Lorg/yaml/Zb;
    //   246: invokestatic ZU : (Lorg/yaml/Zb;)I
    //   249: iadd
    //   250: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   253: invokestatic ZE : (Lorg/yaml/Zb;Ljava/lang/Integer;)Ljava/lang/Integer;
    //   256: pop
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   263: athrow
    //   264: aload_0
    //   265: getfield ZE : Lorg/yaml/Zb;
    //   268: invokestatic ZM : (Lorg/yaml/Zb;)Lorg/yaml/Zj8;
    //   271: invokevirtual ZR : ()Z
    //   274: ifne -> 396
    //   277: aload_0
    //   278: getfield ZE : Lorg/yaml/Zb;
    //   281: iconst_0
    //   282: iconst_0
    //   283: invokestatic ZE : (Lorg/yaml/Zb;ZZ)V
    //   286: aload_0
    //   287: getfield ZE : Lorg/yaml/Zb;
    //   290: invokestatic ZB : (Lorg/yaml/Zb;)V
    //   293: aload_0
    //   294: getfield ZE : Lorg/yaml/Zb;
    //   297: invokestatic ZJ : (Lorg/yaml/Zb;)Lorg/yaml/Zlv;
    //   300: instanceof org/yaml/Zl4
    //   303: ifeq -> 375
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   312: athrow
    //   313: aload_0
    //   314: getfield ZE : Lorg/yaml/Zb;
    //   317: aload_0
    //   318: getfield ZE : Lorg/yaml/Zb;
    //   321: aload_0
    //   322: getfield ZE : Lorg/yaml/Zb;
    //   325: invokestatic ZJ : (Lorg/yaml/Zb;)Lorg/yaml/Zlv;
    //   328: checkcast org/yaml/Zl4
    //   331: invokevirtual Zw : ()Ljava/lang/String;
    //   334: invokestatic ZA : (Lorg/yaml/Zb;Ljava/lang/String;)Lorg/yaml/Zjb;
    //   337: invokestatic ZB : (Lorg/yaml/Zb;Lorg/yaml/Zjb;)Lorg/yaml/Zjb;
    //   340: pop
    //   341: aload_0
    //   342: getfield ZE : Lorg/yaml/Zb;
    //   345: invokestatic Zd : (Lorg/yaml/Zb;)Lorg/yaml/Zjb;
    //   348: invokevirtual Zh : ()Z
    //   351: ifne -> 375
    //   354: goto -> 361
    //   357: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   360: athrow
    //   361: aload_0
    //   362: getfield ZE : Lorg/yaml/Zb;
    //   365: invokevirtual ZJ : ()V
    //   368: goto -> 375
    //   371: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   374: athrow
    //   375: aload_0
    //   376: getfield ZE : Lorg/yaml/Zb;
    //   379: aload_0
    //   380: getfield ZE : Lorg/yaml/Zb;
    //   383: invokestatic Zf : (Lorg/yaml/Zb;)Lorg/yaml/Zq;
    //   386: invokevirtual ZE : ()Ljava/lang/Object;
    //   389: checkcast java/lang/Integer
    //   392: invokestatic ZE : (Lorg/yaml/Zb;Ljava/lang/Integer;)Ljava/lang/Integer;
    //   395: pop
    //   396: aload_0
    //   397: getfield ZE : Lorg/yaml/Zb;
    //   400: invokestatic Za : (Lorg/yaml/Zb;)Lorg/yaml/Zq;
    //   403: new org/yaml/Zj5
    //   406: dup
    //   407: aload_0
    //   408: getfield ZE : Lorg/yaml/Zb;
    //   411: iconst_0
    //   412: invokespecial <init> : (Lorg/yaml/Zb;Z)V
    //   415: invokevirtual Zq : (Ljava/lang/Object;)V
    //   418: aload_0
    //   419: getfield ZE : Lorg/yaml/Zb;
    //   422: iconst_0
    //   423: iconst_0
    //   424: iconst_0
    //   425: invokestatic Zu : (Lorg/yaml/Zb;ZZZ)V
    //   428: aload_0
    //   429: getfield ZE : Lorg/yaml/Zb;
    //   432: invokestatic ZS : (Lorg/yaml/Zb;)Lorg/yaml/Zj8;
    //   435: invokevirtual Zh : ()Lorg/yaml/Zj8;
    //   438: pop
    //   439: aload_0
    //   440: getfield ZE : Lorg/yaml/Zb;
    //   443: invokestatic Zl : (Lorg/yaml/Zb;)Z
    //   446: pop
    //   447: return
    // Exception table:
    //   from	to	target	type
    //   4	24	27	java/io/IOException
    //   11	77	80	java/io/IOException
    //   31	97	100	java/io/IOException
    //   84	126	129	java/io/IOException
    //   104	150	153	java/io/IOException
    //   133	164	167	java/io/IOException
    //   157	185	188	java/io/IOException
    //   192	221	224	java/io/IOException
    //   214	257	260	java/io/IOException
    //   264	306	309	java/io/IOException
    //   277	354	357	java/io/IOException
    //   313	368	371	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zj5.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */