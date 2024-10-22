package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketTimeoutException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zli;

public class Zr_ implements Runnable {
  private static final byte[] Zm;
  
  private final Socket Zc;
  
  private final Zb25 Zx;
  
  private final Zxo0 ZX;
  
  private final Zl3v Zq;
  
  private final Long ZH;
  
  private final ByteArrayOutputStream Zf;
  
  private static final String a;
  
  Zr_(Socket paramSocket, Zb25 paramZb25, Zxo0 paramZxo0, Zl3v paramZl3v, long paramLong) {
    this.Zc = paramSocket;
    this.Zx = paramZb25;
    this.ZX = paramZxo0;
    this.Zq = paramZl3v;
    this.ZH = Long.valueOf(paramLong);
    this.Zf = new ByteArrayOutputStream(1024);
  }
  
  public void run() {
    try {
      ZN();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
    } finally {
      try {
        try {
          if (this.Zc.getInputStream() != null)
            this.Zc.getInputStream().close(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        this.Zc.close();
      } catch (IOException iOException) {
        Zah.Zl(iOException, Zk_.IGNORED);
      } 
    } 
  }
  
  private void ZN() throws IOException {
    InputStream inputStream = this.Zc.getInputStream();
    int i = Math.min(4096, (int)this.ZH.longValue());
    byte[] arrayOfByte = new byte[i];
    int j = 0;
    int k = -1;
    int[] arrayOfInt = Zken.Zd();
    while (k == -1 && this.Zf.size() < this.ZH.longValue() && (j = inputStream.read(arrayOfByte, 0, arrayOfByte.length)) != -1) {
      int m = (int)Math.min(j, this.ZH.longValue() - this.Zf.size());
      this.Zf.write(arrayOfByte, 0, m);
      k = ZV(this.Zf.toByteArray());
      if (arrayOfInt == null)
        break; 
    } 
    try {
      if (j != -1)
        try {
          if (this.Zf.size() < this.ZH.longValue() && Zk()) {
            long l1 = (this.Zf.size() - k);
            long l2 = Zz(this.Zf) - l1;
            long l3 = Math.min(l2, this.ZH.longValue() - this.Zf.size());
            try {
              if (l3 > 0L)
                ZN(inputStream, l3); 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (this.Zf.size() > 0) {
      Zmf zmf = this.ZX.Zb(new Zgv1(this.Zf.toByteArray(), this.Zc.getInetAddress(), this.Zx, Zkj4.Zy(this.Zc.getRemoteSocketAddress()), this.Zc.getPort()));
      Zken zken = zmf.ZC();
      Zw(this.Zc, zken.toString());
    } 
    this.Zq.ZT();
  }
  
  private static long Zz(ByteArrayOutputStream paramByteArrayOutputStream) {
    String str = Zgw9.ZX(paramByteArrayOutputStream.toByteArray(), a);
    try {
      if (str != null)
        return Integer.parseInt(str.split(":")[1].trim()); 
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
    } 
    return Long.MAX_VALUE;
  }
  
  private boolean Zk() {
    return Zli.ZC(this.Zf.toByteArray(), Zm, false, 0);
  }
  
  private static int ZV(byte[] paramArrayOfbyte) {
    byte b = 0;
    int[] arrayOfInt = Zken.Zd();
    while (b + 1 < paramArrayOfbyte.length) {
      try {
        if (b + 3 < paramArrayOfbyte.length)
          try {
            if (paramArrayOfbyte[b] == 13)
              try {
                if (paramArrayOfbyte[b + 1] == 10)
                  try {
                    if (paramArrayOfbyte[b + 2] == 13)
                      try {
                        if (paramArrayOfbyte[b + 3] == 10)
                          return b + 4; 
                      } catch (NumberFormatException numberFormatException) {
                        throw a(null);
                      }  
                  } catch (NumberFormatException numberFormatException) {
                    throw a(null);
                  }  
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              }  
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          }  
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      try {
        if (paramArrayOfbyte[b] == 10)
          try {
            if (paramArrayOfbyte[b + 1] == 10)
              return b + 2; 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          }  
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return -1;
  }
  
  private void ZN(InputStream paramInputStream, long paramLong) throws IOException {
    int i = Math.min(4096, (int)paramLong);
    byte[] arrayOfByte = new byte[i];
    int[] arrayOfInt = Zken.Zd();
    long l = 0L;
    try {
      int j;
      while (l < paramLong && (j = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length)) != -1) {
        int k = (int)Math.min(j, paramLong - l);
        this.Zf.write(arrayOfByte, 0, k);
        l += k;
        if (arrayOfInt == null)
          break; 
      } 
    } catch (SocketTimeoutException socketTimeoutException) {
      Zah.Zl(socketTimeoutException, Zk_.IGNORED);
    } 
  }
  
  private static void Zw(Socket paramSocket, String paramString) throws IOException {
    PrintWriter printWriter = new PrintWriter(paramSocket.getOutputStream(), true);
    printWriter.write(paramString);
    printWriter.flush();
    printWriter.close();
  }
  
  static {
    // Byte code:
    //   0: bipush #61
    //   2: ldc 'y\\nb&2o)i$(s '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zr_.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #7
    //   82: goto -> 112
    //   85: bipush #88
    //   87: goto -> 112
    //   90: bipush #49
    //   92: goto -> 112
    //   95: bipush #66
    //   97: goto -> 112
    //   100: bipush #126
    //   102: goto -> 112
    //   105: bipush #97
    //   107: goto -> 112
    //   110: bipush #38
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: iconst_4
    //   155: newarray byte
    //   157: dup
    //   158: iconst_0
    //   159: bipush #112
    //   161: bastore
    //   162: dup
    //   163: iconst_1
    //   164: bipush #111
    //   166: bastore
    //   167: dup
    //   168: iconst_2
    //   169: bipush #115
    //   171: bastore
    //   172: dup
    //   173: iconst_3
    //   174: bipush #116
    //   176: bastore
    //   177: putstatic burp/Zr_.Zm : [B
    //   180: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */