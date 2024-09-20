package net.portswigger;

import burp.Zbqc;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class Zng {
  private final int Ze;
  
  private final Zvk ZG;
  
  private Zow Zh = new Zrmk();
  
  private Zc4 ZN = new Zc4();
  
  private InetAddress Za = null;
  
  private Runnable ZZ = Zgn.Zi;
  
  private Consumer<Zgn> ZI = Zng::lambda$new$0;
  
  private Optional<String> ZT = Optional.empty();
  
  private final Zqk Zm = new Zqk();
  
  private int Z_ = 15000;
  
  private int ZE = 10000;
  
  private int ZK = 10000;
  
  private boolean ZY = false;
  
  private int Zx = 50;
  
  private int ZA;
  
  private Zay Zf;
  
  private boolean ZM;
  
  private static final String a;
  
  public Zng(int paramInt, Zvk paramZvk) {
    String str = Zu0.ZK();
    this.ZA = 50;
    this.Zf = Zng::lambda$new$1;
    this.ZM = true;
    this.Ze = paramInt;
    this.ZG = paramZvk;
    if (str != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public Zng(int paramInt, Zsg paramZsg) {
    this(paramInt, paramZsg);
  }
  
  public Zng ZP(InetAddress paramInetAddress) {
    this.Za = paramInetAddress;
    return this;
  }
  
  public Zng ZM(Runnable paramRunnable) {
    this.ZZ = paramRunnable;
    return this;
  }
  
  public Zgn Zz() throws IOException {
    Znf znf = Zp(this.Zm);
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return new Zgn(znf.Zy(), this.ZT, znf.Zd().createServerSocket(this.Ze, this.ZA, (this.Za == null) ? InetAddress.getByAddress(a, new byte[] { Byte.MAX_VALUE, 0, 0, 1 }) : this.Za), Executors.newFixedThreadPool(this.Zx), this.ZZ, this.ZI, this.Zh, this.ZN, this.Zf, this.ZM, this.ZG, this.Z_, this.ZE, this.ZK, this.ZY, this.Zx);
  }
  
  private static Znf Zp(Zqk paramZqk) {
    return paramZqk.Zx() ? Znf.Zs : paramZqk.Zd();
  }
  
  private static void lambda$whenReady$2(Runnable paramRunnable, Zgn paramZgn) {
    paramRunnable.run();
  }
  
  private static Zd7 lambda$new$1(Zgk paramZgk, InputStream paramInputStream, Socket paramSocket) throws IOException {
    return Zd7.ABORTED;
  }
  
  private static void lambda$new$0(Zgn paramZgn) {}
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #49
    //   2: ldc '=;%a++" '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zng.a : Ljava/lang/String;
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
    //   80: bipush #96
    //   82: goto -> 112
    //   85: bipush #101
    //   87: goto -> 112
    //   90: bipush #119
    //   92: goto -> 112
    //   95: bipush #49
    //   97: goto -> 112
    //   100: bipush #118
    //   102: goto -> 112
    //   105: bipush #72
    //   107: goto -> 112
    //   110: bipush #117
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
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zng.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */