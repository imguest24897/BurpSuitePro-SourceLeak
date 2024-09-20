package net.portswigger;

import java.io.IOException;
import java.io.InputStream;

public class Ztl implements Runnable {
  private final Zod ZH;
  
  private final Zep ZY;
  
  private final Zfg Z_;
  
  public Ztl(InputStream paramInputStream, Zfg paramZfg) {
    this(Zod.Zv, paramInputStream, paramZfg);
  }
  
  public Ztl(Zod paramZod, InputStream paramInputStream, Zfg paramZfg) {
    this.ZH = paramZod;
    this.ZY = new Zep(paramInputStream);
    this.Z_ = paramZfg;
  }
  
  public void run() {
    while (true) {
      Zrz_ zrz_;
      try {
        zrz_ = Zt();
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.IGNORED);
        this.Z_.Zy(throwable);
        break;
      } 
      this.Z_.Zo(zrz_);
    } 
  }
  
  private Zrz_ Zt() throws IOException {
    int i = this.ZY.ZI();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool1 = ((i & 0x80) != 0) ? true : false;
    int j = i & 0x70;
    byte b = (byte)(i & 0xF);
    byte[] arrayOfByte1 = new byte[4];
    int k = this.ZY.ZI();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool2 = ((k & 0x80) != 0) ? true : false;
    int m = Zg(k);
    try {
      if (bool2)
        this.ZY.ZN(arrayOfByte1); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte[] arrayOfByte2 = this.ZY.Zd(m);
    try {
      if (bool2)
        Zi(arrayOfByte1, arrayOfByte2); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return new Zrz_(bool1, new Zo(j), b, bool2, arrayOfByte1, arrayOfByte2);
  }
  
  private int Zg(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic Za : ()I
    //   3: iload_1
    //   4: bipush #127
    //   6: iand
    //   7: istore_3
    //   8: istore_2
    //   9: iload_3
    //   10: bipush #125
    //   12: if_icmple -> 81
    //   15: iload_3
    //   16: bipush #126
    //   18: if_icmpne -> 40
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   27: athrow
    //   28: aload_0
    //   29: getfield ZY : Lnet/portswigger/Zep;
    //   32: invokevirtual Zt : ()I
    //   35: istore_3
    //   36: iload_2
    //   37: ifeq -> 81
    //   40: aload_0
    //   41: getfield ZY : Lnet/portswigger/Zep;
    //   44: invokevirtual Zz : ()J
    //   47: lstore #4
    //   49: lload #4
    //   51: lconst_0
    //   52: lcmp
    //   53: ifle -> 68
    //   56: new net/portswigger/Zzs
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: athrow
    //   64: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   67: athrow
    //   68: aload_0
    //   69: getfield ZY : Lnet/portswigger/Zep;
    //   72: invokevirtual Zz : ()J
    //   75: lstore #6
    //   77: lload #6
    //   79: l2i
    //   80: istore_3
    //   81: aload_0
    //   82: getfield ZH : Lnet/portswigger/Zod;
    //   85: invokevirtual Zm : ()Ljava/util/Optional;
    //   88: invokevirtual isPresent : ()Z
    //   91: ifeq -> 133
    //   94: iload_3
    //   95: aload_0
    //   96: getfield ZH : Lnet/portswigger/Zod;
    //   99: invokevirtual Zm : ()Ljava/util/Optional;
    //   102: invokevirtual get : ()Ljava/lang/Object;
    //   105: checkcast java/lang/Integer
    //   108: invokevirtual intValue : ()I
    //   111: if_icmple -> 133
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   120: athrow
    //   121: new net/portswigger/Zzs
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: athrow
    //   129: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   132: athrow
    //   133: iload_3
    //   134: ireturn
    // Exception table:
    //   from	to	target	type
    //   9	21	24	java/io/IOException
    //   49	64	64	java/io/IOException
    //   81	114	117	java/io/IOException
    //   94	129	129	java/io/IOException
  }
  
  private void Zi(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte b = 0;
    int i = Zo.ZD();
    while (b < paramArrayOfbyte2.length) {
      paramArrayOfbyte2[b] = (byte)(paramArrayOfbyte1[b % 4] ^ paramArrayOfbyte2[b]);
      b++;
      if (i == 0)
        break; 
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ztl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */