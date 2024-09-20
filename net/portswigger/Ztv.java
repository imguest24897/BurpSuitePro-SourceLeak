package net.portswigger;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Ztv implements Za1 {
  private final OutputStream Zh;
  
  private final CharsetEncoder Zc;
  
  private final CharBuffer ZP = CharBuffer.allocate(2048);
  
  private final ByteBuffer ZA = ByteBuffer.allocate(4096);
  
  private final byte[] Z_ = new byte[2049];
  
  public Ztv(OutputStream paramOutputStream) {
    this.Zh = paramOutputStream;
    this.Zc = StandardCharsets.UTF_8.newEncoder();
  }
  
  public Za1 Zz(char paramChar) {
    try {
      if (!this.ZP.hasRemaining())
        ZA(false); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.ZP.put(paramChar);
    return this;
  }
  
  public Za1 Zk(long paramLong) {
    Z_(String.valueOf(paramLong));
    return this;
  }
  
  public Za1 Zr(boolean paramBoolean) {
    Z_(String.valueOf(paramBoolean));
    return this;
  }
  
  public Za1 Z_(String paramString) {
    return ZF(paramString, 0, paramString.length());
  }
  
  public Za1 ZF(String paramString, int paramInt1, int paramInt2) {
    boolean bool = Zv3.ZP();
    while (paramInt1 < paramInt2) {
      try {
        if (!this.ZP.hasRemaining())
          ZA(false); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      int i = Math.min(paramInt2 - paramInt1, this.ZP.remaining());
      this.ZP.put(paramString, paramInt1, paramInt1 + i);
      paramInt1 += i;
      if (bool)
        break; 
    } 
    return this;
  }
  
  public Za1 ZD(Zij paramZij) {
    // Byte code:
    //   0: invokestatic Zz : ()Z
    //   3: aload_1
    //   4: invokeinterface Zpu : ()I
    //   9: istore_3
    //   10: istore_2
    //   11: iload_3
    //   12: sipush #2049
    //   15: if_icmplt -> 96
    //   18: iconst_0
    //   19: istore #4
    //   21: iload_3
    //   22: ifle -> 92
    //   25: iload_3
    //   26: sipush #2049
    //   29: if_icmpge -> 58
    //   32: aload_0
    //   33: aload_1
    //   34: iload #4
    //   36: aload_0
    //   37: getfield Z_ : [B
    //   40: iload_3
    //   41: invokestatic copyOf : ([BI)[B
    //   44: invokevirtual Zf : (Lnet/portswigger/Zij;I[B)V
    //   47: iload_2
    //   48: ifne -> 76
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: aload_0
    //   59: aload_1
    //   60: iload #4
    //   62: aload_0
    //   63: getfield Z_ : [B
    //   66: invokevirtual Zf : (Lnet/portswigger/Zij;I[B)V
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: wide iinc #3 -2049
    //   82: wide iinc #4 2049
    //   88: iload_2
    //   89: ifne -> 21
    //   92: iload_2
    //   93: ifne -> 115
    //   96: aload_0
    //   97: aload_1
    //   98: iconst_0
    //   99: aload_1
    //   100: invokeinterface ZiH : ()[B
    //   105: invokevirtual Zf : (Lnet/portswigger/Zij;I[B)V
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: aload_0
    //   116: areturn
    // Exception table:
    //   from	to	target	type
    //   25	51	54	java/lang/RuntimeException
    //   32	69	72	java/lang/RuntimeException
    //   92	108	111	java/lang/RuntimeException
  }
  
  private void Zf(Zij paramZij, int paramInt, byte[] paramArrayOfbyte) {
    try {
      ZG();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      throw new RuntimeException(iOException);
    } 
    paramZij.Zo(paramInt, paramArrayOfbyte, paramArrayOfbyte.length);
    int i = (paramArrayOfbyte.length + 2) / 3 * 4;
    Base64.getEncoder().encode(paramArrayOfbyte, this.ZA.array());
    this.ZA.position(i);
  }
  
  public void Zr() throws IOException {
    ZG();
    this.Zh.flush();
  }
  
  private void ZG() throws IOException {
    // Byte code:
    //   0: invokestatic Zz : ()Z
    //   3: aload_0
    //   4: iconst_1
    //   5: invokevirtual ZA : (Z)Z
    //   8: istore_2
    //   9: istore_1
    //   10: iload_2
    //   11: ifeq -> 73
    //   14: aload_0
    //   15: getfield Zc : Ljava/nio/charset/CharsetEncoder;
    //   18: aload_0
    //   19: getfield ZA : Ljava/nio/ByteBuffer;
    //   22: invokevirtual flush : (Ljava/nio/ByteBuffer;)Ljava/nio/charset/CoderResult;
    //   25: astore_3
    //   26: aload_3
    //   27: getstatic java/nio/charset/CoderResult.OVERFLOW : Ljava/nio/charset/CoderResult;
    //   30: if_acmpne -> 41
    //   33: aload_0
    //   34: invokevirtual ZT : ()V
    //   37: iload_1
    //   38: ifne -> 66
    //   41: aload_3
    //   42: invokevirtual isError : ()Z
    //   45: ifeq -> 66
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: aload_3
    //   56: invokevirtual throwException : ()V
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: aload_3
    //   67: getstatic java/nio/charset/CoderResult.OVERFLOW : Ljava/nio/charset/CoderResult;
    //   70: if_acmpeq -> 14
    //   73: aload_0
    //   74: invokevirtual ZT : ()V
    //   77: aload_0
    //   78: getfield Zc : Ljava/nio/charset/CharsetEncoder;
    //   81: invokevirtual reset : ()Ljava/nio/charset/CharsetEncoder;
    //   84: pop
    //   85: return
    // Exception table:
    //   from	to	target	type
    //   33	48	51	java/io/IOException
    //   41	59	62	java/io/IOException
  }
  
  private boolean ZA(boolean paramBoolean) {
    boolean bool = Zv3.Zz();
    try {
      if (this.ZP.position() == 0)
        return false; 
    } catch (CharacterCodingException characterCodingException) {
      throw a(null);
    } 
    this.ZP.flip();
    try {
      while (true) {
        CoderResult coderResult;
        while (true) {
          coderResult = this.Zc.encode(this.ZP, this.ZA, paramBoolean);
          break;
        } 
        if (coderResult != CoderResult.OVERFLOW)
          return true; 
      } 
    } finally {
      this.ZP.clear();
    } 
  }
  
  private void ZT() {
    try {
      if (this.ZA.position() == 0)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZA.flip();
    try {
      this.Zh.write(this.ZA.array(), 0, this.ZA.limit());
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      throw new UncheckedIOException(iOException);
    } finally {
      this.ZA.clear();
    } 
  }
  
  static {
    Zuh.Zb(true, Zqf.Zr);
    Zuh.Zb(true, Zqf.Zr);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ztv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */