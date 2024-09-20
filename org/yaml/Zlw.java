package org.yaml;

import java.io.IOException;

class Zlw implements Zd {
  private final boolean Zw;
  
  final Zb Zp;
  
  public Zlw(Zb paramZb, boolean paramBoolean) {
    this.Zw = paramBoolean;
  }
  
  public void Zt() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zp : Lorg/yaml/Zb;
    //   7: aload_0
    //   8: getfield Zp : Lorg/yaml/Zb;
    //   11: invokestatic ZM : (Lorg/yaml/Zb;)Lorg/yaml/Zj8;
    //   14: aload_0
    //   15: getfield Zp : Lorg/yaml/Zb;
    //   18: invokestatic ZJ : (Lorg/yaml/Zb;)Lorg/yaml/Zlv;
    //   21: invokevirtual ZY : (Lorg/yaml/Zlv;)Lorg/yaml/Zlv;
    //   24: invokestatic Za : (Lorg/yaml/Zb;Lorg/yaml/Zlv;)Lorg/yaml/Zlv;
    //   27: pop
    //   28: astore_1
    //   29: aload_0
    //   30: getfield Zp : Lorg/yaml/Zb;
    //   33: invokestatic ZB : (Lorg/yaml/Zb;)V
    //   36: aload_0
    //   37: getfield Zw : Z
    //   40: ifne -> 116
    //   43: aload_0
    //   44: getfield Zp : Lorg/yaml/Zb;
    //   47: invokestatic ZJ : (Lorg/yaml/Zb;)Lorg/yaml/Zlv;
    //   50: instanceof org/yaml/Zl5
    //   53: ifeq -> 116
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   62: athrow
    //   63: aload_0
    //   64: getfield Zp : Lorg/yaml/Zb;
    //   67: aload_0
    //   68: getfield Zp : Lorg/yaml/Zb;
    //   71: invokestatic Zf : (Lorg/yaml/Zb;)Lorg/yaml/Zq;
    //   74: invokevirtual ZE : ()Ljava/lang/Object;
    //   77: checkcast java/lang/Integer
    //   80: invokestatic ZE : (Lorg/yaml/Zb;Ljava/lang/Integer;)Ljava/lang/Integer;
    //   83: pop
    //   84: aload_0
    //   85: getfield Zp : Lorg/yaml/Zb;
    //   88: aload_0
    //   89: getfield Zp : Lorg/yaml/Zb;
    //   92: invokestatic Za : (Lorg/yaml/Zb;)Lorg/yaml/Zq;
    //   95: invokevirtual ZE : ()Ljava/lang/Object;
    //   98: checkcast org/yaml/Zd
    //   101: invokestatic ZB : (Lorg/yaml/Zb;Lorg/yaml/Zd;)Lorg/yaml/Zd;
    //   104: pop
    //   105: aload_1
    //   106: ifnonnull -> 234
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   115: athrow
    //   116: aload_0
    //   117: getfield Zp : Lorg/yaml/Zb;
    //   120: invokevirtual ZJ : ()V
    //   123: aload_0
    //   124: getfield Zp : Lorg/yaml/Zb;
    //   127: invokestatic Zo : (Lorg/yaml/Zb;)Z
    //   130: ifeq -> 183
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   139: athrow
    //   140: aload_0
    //   141: getfield Zp : Lorg/yaml/Zb;
    //   144: invokestatic Za : (Lorg/yaml/Zb;)Lorg/yaml/Zq;
    //   147: new org/yaml/Zj_
    //   150: dup
    //   151: aload_0
    //   152: getfield Zp : Lorg/yaml/Zb;
    //   155: aconst_null
    //   156: invokespecial <init> : (Lorg/yaml/Zb;Lorg/yaml/Zjq;)V
    //   159: invokevirtual Zq : (Ljava/lang/Object;)V
    //   162: aload_0
    //   163: getfield Zp : Lorg/yaml/Zb;
    //   166: iconst_0
    //   167: iconst_1
    //   168: iconst_1
    //   169: invokestatic Zu : (Lorg/yaml/Zb;ZZZ)V
    //   172: aload_1
    //   173: ifnonnull -> 234
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   182: athrow
    //   183: aload_0
    //   184: getfield Zp : Lorg/yaml/Zb;
    //   187: ldc '?'
    //   189: iconst_1
    //   190: iconst_0
    //   191: iconst_1
    //   192: invokevirtual Zv : (Ljava/lang/String;ZZZ)V
    //   195: aload_0
    //   196: getfield Zp : Lorg/yaml/Zb;
    //   199: invokestatic Za : (Lorg/yaml/Zb;)Lorg/yaml/Zq;
    //   202: new org/yaml/Z_6
    //   205: dup
    //   206: aload_0
    //   207: getfield Zp : Lorg/yaml/Zb;
    //   210: aconst_null
    //   211: invokespecial <init> : (Lorg/yaml/Zb;Lorg/yaml/Zjq;)V
    //   214: invokevirtual Zq : (Ljava/lang/Object;)V
    //   217: aload_0
    //   218: getfield Zp : Lorg/yaml/Zb;
    //   221: iconst_0
    //   222: iconst_1
    //   223: iconst_0
    //   224: invokestatic Zu : (Lorg/yaml/Zb;ZZZ)V
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   233: athrow
    //   234: return
    // Exception table:
    //   from	to	target	type
    //   29	56	59	java/io/IOException
    //   43	109	112	java/io/IOException
    //   63	133	136	java/io/IOException
    //   116	176	179	java/io/IOException
    //   140	227	230	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zlw.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */