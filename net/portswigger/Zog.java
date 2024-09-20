package net.portswigger;

import java.io.IOException;
import java.io.OutputStream;

public class Zog {
  private final Zod Zx;
  
  private final Zzt ZU;
  
  public Zog(OutputStream paramOutputStream) {
    this(Zod.Zv, paramOutputStream);
  }
  
  public Zog(Zod paramZod, OutputStream paramOutputStream) {
    this.Zx = paramZod;
    this.ZU = new Zzt(paramOutputStream);
  }
  
  public void Zy(Zrz_ paramZrz_) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Zp : ()I
    //   4: istore_2
    //   5: aload_0
    //   6: getfield Zx : Lnet/portswigger/Zod;
    //   9: invokevirtual ZC : ()Ljava/util/Optional;
    //   12: invokevirtual isPresent : ()Z
    //   15: ifeq -> 53
    //   18: iload_2
    //   19: aload_0
    //   20: getfield Zx : Lnet/portswigger/Zod;
    //   23: invokevirtual ZC : ()Ljava/util/Optional;
    //   26: invokevirtual get : ()Ljava/lang/Object;
    //   29: checkcast java/lang/Integer
    //   32: invokevirtual intValue : ()I
    //   35: if_icmple -> 53
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   44: athrow
    //   45: iconst_1
    //   46: goto -> 54
    //   49: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   52: athrow
    //   53: iconst_0
    //   54: istore_3
    //   55: iload_3
    //   56: ifeq -> 71
    //   59: new net/portswigger/Zzs
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: athrow
    //   67: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   70: athrow
    //   71: aload_0
    //   72: aload_1
    //   73: invokevirtual Zi : (Lnet/portswigger/Zrz_;)V
    //   76: aload_0
    //   77: aload_1
    //   78: invokevirtual Zn : (Lnet/portswigger/Zrz_;)V
    //   81: aload_0
    //   82: aload_1
    //   83: invokevirtual ZZ : (Lnet/portswigger/Zrz_;)V
    //   86: return
    // Exception table:
    //   from	to	target	type
    //   5	38	41	java/io/IOException
    //   18	49	49	java/io/IOException
    //   55	67	67	java/io/IOException
  }
  
  private void Zi(Zrz_ paramZrz_) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool = paramZrz_.ZP() ? true : false;
    int i = bool | paramZrz_.ZS().Ze() | paramZrz_.ZD();
    this.ZU.ZR(i);
  }
  
  private void Zn(Zrz_ paramZrz_) throws IOException {
    int i = paramZrz_.Zp();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    int j = paramZrz_.Zw() ? 128 : 0;
    long l = 0L;
    if (i > 125) {
      l = i;
      try {
      
      } catch (IOException iOException) {
        throw a(null);
      } 
      i = (i < 65536) ? 126 : 127;
    } 
    int k = j | i;
    try {
      this.ZU.ZR(k);
      if (i == 126)
        this.ZU.ZD((int)l); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (i == 127) {
        this.ZU.ZG(0L);
        this.ZU.ZG(l);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void ZZ(Zrz_ paramZrz_) throws IOException {
    int i = Zo.Za();
    try {
      if (paramZrz_.Zw()) {
        try {
          this.ZU.ZI(paramZrz_.ZV());
          Zw(paramZrz_);
          if (i != 0) {
            this.ZU.ZJ(paramZrz_.ZK(), 0, paramZrz_.Zp());
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZU.ZJ(paramZrz_.ZK(), 0, paramZrz_.Zp());
  }
  
  private void Zw(Zrz_ paramZrz_) throws IOException {
    int i = Zo.ZD();
    try {
      if (paramZrz_.Zp() == 0)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    char c = 'Ѐ';
    int j = paramZrz_.Zp();
    int k = Math.min(j, c);
    byte[] arrayOfByte1 = new byte[k];
    int m = j;
    int n = 0;
    byte[] arrayOfByte2 = paramZrz_.ZK();
    byte[] arrayOfByte3 = paramZrz_.ZV();
    while (m >= k) {
      Zi(arrayOfByte3, arrayOfByte2, arrayOfByte1, n);
      n += k;
      m -= k;
      if (i == 0)
        break; 
    } 
    if (m > 0) {
      arrayOfByte1 = new byte[m];
      Zi(arrayOfByte3, arrayOfByte2, arrayOfByte1, n);
    } 
  }
  
  private void Zi(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt) throws IOException {
    System.arraycopy(paramArrayOfbyte2, paramInt, paramArrayOfbyte3, 0, paramArrayOfbyte3.length);
    Zs(paramArrayOfbyte1, paramArrayOfbyte3);
    this.ZU.ZI(paramArrayOfbyte3);
  }
  
  private void Zs(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte b = 0;
    int i = Zo.Za();
    while (b < paramArrayOfbyte2.length) {
      paramArrayOfbyte2[b] = (byte)(paramArrayOfbyte1[b % 4] ^ paramArrayOfbyte2[b]);
      b++;
      if (i != 0)
        break; 
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zog.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */