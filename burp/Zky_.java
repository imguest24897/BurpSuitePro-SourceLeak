package burp;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

class Zky_ extends Socket {
  private final Zbw_ Z_;
  
  private final Socket ZP;
  
  private final Zxoo Zf;
  
  private final int Zq;
  
  private final boolean ZF;
  
  private String Zs;
  
  private Zkdu ZU;
  
  private Socket Zy;
  
  private boolean ZD;
  
  private String Zx;
  
  Zky_(Zbw_ paramZbw_, Socket paramSocket, Zxoo paramZxoo, String paramString, int paramInt, boolean paramBoolean) {
    this.Z_ = paramZbw_;
    this.ZP = paramSocket;
    this.Zf = paramZxoo;
    this.Zs = paramString;
    this.Zq = paramInt;
    this.ZF = paramBoolean;
  }
  
  void ZW() throws IOException, Zz8e {
    InputStream inputStream = this.ZP.getInputStream();
    byte[] arrayOfByte = Zw(inputStream);
    String[] arrayOfString = Zz2j.ZJ();
    try {
      this.ZU = new Zkdu(inputStream, arrayOfByte);
      if (ZH(arrayOfByte)) {
        try {
          Zc(arrayOfByte);
          if (arrayOfString == null) {
            ZG();
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
    ZG();
  }
  
  private byte[] Zw(InputStream paramInputStream) throws IOException {
    byte[] arrayOfByte = new byte[4096];
    int i = paramInputStream.read(arrayOfByte);
    try {
      if (i <= 0)
        throw new IOException(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (i < 4096) {
      byte[] arrayOfByte1 = new byte[i];
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, i);
      arrayOfByte = arrayOfByte1;
    } 
    return arrayOfByte;
  }
  
  private boolean ZH(byte[] paramArrayOfbyte) {
    String[] arrayOfString = Zz2j.ZJ();
    byte b = 0;
    while (b < 6) {
      byte b1 = paramArrayOfbyte[b];
      if (b1 < 32 || b1 > 126)
        return true; 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return false;
  }
  
  private void Zc(byte[] paramArrayOfbyte) throws IOException, Zz8e {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zs : Ljava/lang/String;
    //   4: ifnull -> 21
    //   7: aload_0
    //   8: getfield ZF : Z
    //   11: ifeq -> 59
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   20: athrow
    //   21: aload_0
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual Zr : ([B)Ljava/lang/String;
    //   27: putfield Zx : Ljava/lang/String;
    //   30: aload_0
    //   31: getfield Zx : Ljava/lang/String;
    //   34: ifnull -> 59
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: aload_0
    //   45: aload_0
    //   46: getfield Zx : Ljava/lang/String;
    //   49: putfield Zs : Ljava/lang/String;
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: aload_0
    //   60: invokevirtual Zb : ()V
    //   63: aload_0
    //   64: getfield Zf : Lburp/Zxoo;
    //   67: aload_0
    //   68: getfield Zs : Ljava/lang/String;
    //   71: aload_0
    //   72: getfield Zq : I
    //   75: invokeinterface ZP : (Ljava/lang/String;I)Ljavax/net/ssl/SSLSocketFactory;
    //   80: astore_2
    //   81: aload_2
    //   82: new burp/Zl72
    //   85: dup
    //   86: aload_0
    //   87: getfield ZP : Ljava/net/Socket;
    //   90: aload_0
    //   91: getfield ZU : Lburp/Zkdu;
    //   94: invokespecial <init> : (Ljava/net/Socket;Ljava/io/InputStream;)V
    //   97: aload_0
    //   98: getfield ZP : Ljava/net/Socket;
    //   101: invokevirtual getInetAddress : ()Ljava/net/InetAddress;
    //   104: invokevirtual getHostName : ()Ljava/lang/String;
    //   107: aload_0
    //   108: getfield ZP : Ljava/net/Socket;
    //   111: invokevirtual getLocalPort : ()I
    //   114: iconst_1
    //   115: invokevirtual createSocket : (Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    //   118: checkcast javax/net/ssl/SSLSocket
    //   121: astore_3
    //   122: aload_3
    //   123: iconst_0
    //   124: invokevirtual setUseClientMode : (Z)V
    //   127: aload_3
    //   128: aload_3
    //   129: invokevirtual getSupportedProtocols : ()[Ljava/lang/String;
    //   132: invokevirtual setEnabledProtocols : ([Ljava/lang/String;)V
    //   135: aload_0
    //   136: aload_3
    //   137: putfield Zy : Ljava/net/Socket;
    //   140: aload_0
    //   141: iconst_1
    //   142: putfield ZD : Z
    //   145: return
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/io/IOException
    //   7	37	40	java/io/IOException
    //   21	52	55	java/io/IOException
  }
  
  private void Zb() throws Zz8e, IOException {
    try {
      if (this.Zs == null)
        return; 
    } catch (Zz8e zz8e) {
      throw a(null);
    } 
    try {
      if (this.Z_.Zu(this.Zs, this.Zq))
        throw new Zz8e(this.ZP, this.ZU, this.ZP.getOutputStream(), this.Zs, this.Zq); 
    } catch (Zz8e zz8e) {
      throw a(null);
    } 
  }
  
  private String Zr(byte[] paramArrayOfbyte) {
    String[] arrayOfString = Zz2j.ZJ();
    try {
      int i = paramArrayOfbyte.length;
      try {
        if (i >= 50) {
          try {
            if (paramArrayOfbyte[0] != 22 || paramArrayOfbyte[5] != 1)
              return null; 
          } catch (Exception exception) {
            throw a(null);
          } 
        } else {
          return null;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      int j = 43;
      j += (0xFF & paramArrayOfbyte[j]) + 1;
      if (j + 2 > i)
        return null; 
      j += (0xFF & paramArrayOfbyte[j]) * 256 + (0xFF & paramArrayOfbyte[j + 1]) + 2;
      j += (0xFF & paramArrayOfbyte[j]) + 1;
      if (j + 2 > i)
        return null; 
      j += 2;
      while (j + 8 < i) {
        int k = (0xFF & paramArrayOfbyte[j]) * 256 + (0xFF & paramArrayOfbyte[j + 1]);
        j += 2;
        int m = (0xFF & paramArrayOfbyte[j]) * 256 + (0xFF & paramArrayOfbyte[j + 1]);
        try {
          j += 2;
          if (k == 0) {
            j += 2;
            if (paramArrayOfbyte[j] != 0)
              return null; 
            int n = (0xFF & paramArrayOfbyte[++j]) * 256 + (0xFF & paramArrayOfbyte[j + 1]);
            j += 2;
            return Zkb.Zo(paramArrayOfbyte, j, n);
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
        j += m;
        if (arrayOfString == null)
          break; 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return null;
  }
  
  private void ZG() {
    this.Zy = new Zl72(this.ZP, this.ZU);
    this.ZD = false;
  }
  
  Socket ZC() {
    return this.Zy;
  }
  
  boolean ZU() {
    return this.ZD;
  }
  
  String Za() {
    return this.Zx;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zky_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */