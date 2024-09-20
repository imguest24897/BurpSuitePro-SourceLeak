package burp;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import net.portswigger.Zsy;

public class Zmdb implements Zmxj {
  private final Map<Long, Zrot> ZR;
  
  private final Zs4b ZQ;
  
  private final ScheduledFuture<?> ZW;
  
  private final Ztwv Zo;
  
  private static boolean Zg;
  
  public Zmdb(Ztwv paramZtwv, Zrgd paramZrgd, Zsy paramZsy, Ztbb paramZtbb, Zbnt paramZbnt, Zzen paramZzen) {
    this(paramZtwv, paramZrgd, paramZsy, paramZtbb, paramZbnt, paramZzen, Zlvt.Zw());
  }
  
  public Zmdb(Ztwv paramZtwv, Zrgd paramZrgd, Zsy paramZsy, Ztbb paramZtbb, Zbnt paramZbnt, Zzen paramZzen, Zlvt paramZlvt) {
    this.Zo = paramZtwv;
    boolean bool = ZT();
    this.ZQ = new Zs4b(paramZtwv, paramZrgd, paramZsy, paramZtbb, paramZbnt, paramZzen, new Zloz(), paramZlvt);
    this.ZR = new ConcurrentHashMap<>();
    this.ZW = paramZtwv.Ze().scheduleAtFixedRate(new Zshp(this.ZR), paramZlvt.ZA(), paramZlvt.ZA(), TimeUnit.MILLISECONDS);
    if (!bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Zrot ZB(SSLSocket paramSSLSocket) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Zs4b;
    //   4: aload_1
    //   5: aload_0
    //   6: aload_1
    //   7: <illegal opcode> accept : (Lburp/Zmdb;Ljavax/net/ssl/SSLSocket;)Ljava/util/function/Consumer;
    //   12: invokevirtual ZQ : (Ljava/net/Socket;Ljava/util/function/Consumer;)Lburp/Zrot;
    //   15: astore_3
    //   16: invokestatic ZT : ()Z
    //   19: aload_0
    //   20: getfield ZR : Ljava/util/Map;
    //   23: aload_3
    //   24: invokevirtual Zi : ()Ljava/lang/Long;
    //   27: aload_3
    //   28: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   33: pop
    //   34: istore_2
    //   35: aload_3
    //   36: invokestatic Zwu : ()[Lburp/Zbqc;
    //   39: ifnonnull -> 65
    //   42: iload_2
    //   43: ifeq -> 61
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   52: athrow
    //   53: iconst_0
    //   54: goto -> 62
    //   57: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   60: athrow
    //   61: iconst_1
    //   62: invokestatic ZD : (Z)V
    //   65: areturn
    // Exception table:
    //   from	to	target	type
    //   35	46	49	java/io/IOException
    //   42	57	57	java/io/IOException
  }
  
  public void Zp() {
    Collection<Zrot> collection = this.ZR.values();
    collection.forEach(Zrot::ZY);
  }
  
  private void lambda$newServerConnection$1(SSLSocket paramSSLSocket, Long paramLong) {
    this.Zo.Ze().schedule(paramSSLSocket::lambda$newServerConnection$0, 50L, TimeUnit.MILLISECONDS);
    this.ZR.remove(paramLong);
  }
  
  private static void lambda$newServerConnection$0(SSLSocket paramSSLSocket) {
    Zsdz.ZW(paramSSLSocket);
  }
  
  public static void ZD(boolean paramBoolean) {
    Zg = paramBoolean;
  }
  
  public static boolean ZT() {
    return Zg;
  }
  
  public static boolean ZN() {
    boolean bool = ZT();
    return !bool;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    if (ZN())
      ZD(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmdb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */