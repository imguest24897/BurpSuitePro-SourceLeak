package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Zsr extends Zzg<InetSocketAddress> {
  public Zsr() {
    super(InetSocketAddress.class);
  }
  
  public void ZW(InetSocketAddress paramInetSocketAddress, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: aload_1
    //   4: invokevirtual getAddress : ()Ljava/net/InetAddress;
    //   7: astore #5
    //   9: astore #4
    //   11: aload #5
    //   13: ifnonnull -> 27
    //   16: aload_1
    //   17: invokevirtual getHostName : ()Ljava/lang/String;
    //   20: goto -> 35
    //   23: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   26: athrow
    //   27: aload #5
    //   29: invokevirtual toString : ()Ljava/lang/String;
    //   32: invokevirtual trim : ()Ljava/lang/String;
    //   35: astore #6
    //   37: aload #6
    //   39: bipush #47
    //   41: invokevirtual indexOf : (I)I
    //   44: istore #7
    //   46: iload #7
    //   48: iflt -> 137
    //   51: iload #7
    //   53: ifne -> 127
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   62: athrow
    //   63: aload #5
    //   65: instanceof java/net/Inet6Address
    //   68: ifeq -> 114
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   77: athrow
    //   78: new java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial <init> : ()V
    //   85: ldc '['
    //   87: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: aload #6
    //   92: iconst_1
    //   93: invokevirtual substring : (I)Ljava/lang/String;
    //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: ldc ']'
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: invokevirtual toString : ()Ljava/lang/String;
    //   107: goto -> 120
    //   110: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   113: athrow
    //   114: aload #6
    //   116: iconst_1
    //   117: invokevirtual substring : (I)Ljava/lang/String;
    //   120: astore #6
    //   122: aload #4
    //   124: ifnull -> 137
    //   127: aload #6
    //   129: iconst_0
    //   130: iload #7
    //   132: invokevirtual substring : (II)Ljava/lang/String;
    //   135: astore #6
    //   137: aload_2
    //   138: new java/lang/StringBuilder
    //   141: dup
    //   142: invokespecial <init> : ()V
    //   145: aload #6
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: ldc ':'
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: aload_1
    //   156: invokevirtual getPort : ()I
    //   159: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   162: invokevirtual toString : ()Ljava/lang/String;
    //   165: invokevirtual ZD : (Ljava/lang/String;)V
    //   168: return
    // Exception table:
    //   from	to	target	type
    //   11	23	23	java/io/IOException
    //   46	56	59	java/io/IOException
    //   51	71	74	java/io/IOException
    //   63	110	110	java/io/IOException
  }
  
  public void ZU(InetSocketAddress paramInetSocketAddress, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Ze(paramInetSocketAddress, InetSocketAddress.class, Zl.VALUE_STRING));
    ZW(paramInetSocketAddress, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */