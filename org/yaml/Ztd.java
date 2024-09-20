package org.yaml;

import java.io.IOException;

class Ztd implements Zd {
  final Zb Zu;
  
  private Ztd(Zb paramZb) {}
  
  public void Zt() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zu : Lorg/yaml/Zb;
    //   4: invokestatic ZP : (Lorg/yaml/Zb;)Ljava/lang/Boolean;
    //   7: invokevirtual booleanValue : ()Z
    //   10: ifne -> 57
    //   13: aload_0
    //   14: getfield Zu : Lorg/yaml/Zb;
    //   17: invokestatic Zt : (Lorg/yaml/Zb;)I
    //   20: aload_0
    //   21: getfield Zu : Lorg/yaml/Zb;
    //   24: invokestatic Z_ : (Lorg/yaml/Zb;)I
    //   27: if_icmpgt -> 57
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   36: athrow
    //   37: aload_0
    //   38: getfield Zu : Lorg/yaml/Zb;
    //   41: invokestatic ZN : (Lorg/yaml/Zb;)Ljava/lang/Boolean;
    //   44: invokevirtual booleanValue : ()Z
    //   47: ifeq -> 71
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   56: athrow
    //   57: aload_0
    //   58: getfield Zu : Lorg/yaml/Zb;
    //   61: invokevirtual ZJ : ()V
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   70: athrow
    //   71: aload_0
    //   72: getfield Zu : Lorg/yaml/Zb;
    //   75: ldc ':'
    //   77: iconst_1
    //   78: iconst_0
    //   79: iconst_0
    //   80: invokevirtual Zv : (Ljava/lang/String;ZZZ)V
    //   83: aload_0
    //   84: getfield Zu : Lorg/yaml/Zb;
    //   87: aload_0
    //   88: getfield Zu : Lorg/yaml/Zb;
    //   91: invokestatic ZS : (Lorg/yaml/Zb;)Lorg/yaml/Zj8;
    //   94: aload_0
    //   95: getfield Zu : Lorg/yaml/Zb;
    //   98: invokestatic ZJ : (Lorg/yaml/Zb;)Lorg/yaml/Zlv;
    //   101: invokevirtual ZY : (Lorg/yaml/Zlv;)Lorg/yaml/Zlv;
    //   104: invokestatic Za : (Lorg/yaml/Zb;Lorg/yaml/Zlv;)Lorg/yaml/Zlv;
    //   107: pop
    //   108: aload_0
    //   109: getfield Zu : Lorg/yaml/Zb;
    //   112: invokestatic Zl : (Lorg/yaml/Zb;)Z
    //   115: pop
    //   116: aload_0
    //   117: getfield Zu : Lorg/yaml/Zb;
    //   120: invokestatic Za : (Lorg/yaml/Zb;)Lorg/yaml/Zq;
    //   123: new org/yaml/Zll
    //   126: dup
    //   127: aload_0
    //   128: getfield Zu : Lorg/yaml/Zb;
    //   131: aconst_null
    //   132: invokespecial <init> : (Lorg/yaml/Zb;Lorg/yaml/Zjq;)V
    //   135: invokevirtual Zq : (Ljava/lang/Object;)V
    //   138: aload_0
    //   139: getfield Zu : Lorg/yaml/Zb;
    //   142: iconst_0
    //   143: iconst_1
    //   144: iconst_0
    //   145: invokestatic Zu : (Lorg/yaml/Zb;ZZZ)V
    //   148: aload_0
    //   149: getfield Zu : Lorg/yaml/Zb;
    //   152: invokestatic ZS : (Lorg/yaml/Zb;)Lorg/yaml/Zj8;
    //   155: aload_0
    //   156: getfield Zu : Lorg/yaml/Zb;
    //   159: invokestatic ZJ : (Lorg/yaml/Zb;)Lorg/yaml/Zlv;
    //   162: invokevirtual ZF : (Lorg/yaml/Zlv;)Lorg/yaml/Zlv;
    //   165: pop
    //   166: aload_0
    //   167: getfield Zu : Lorg/yaml/Zb;
    //   170: invokestatic Zl : (Lorg/yaml/Zb;)Z
    //   173: pop
    //   174: return
    // Exception table:
    //   from	to	target	type
    //   0	30	33	java/io/IOException
    //   13	50	53	java/io/IOException
    //   37	64	67	java/io/IOException
  }
  
  Ztd(Zb paramZb, Zjq paramZjq) {
    this(paramZb);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Ztd.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */