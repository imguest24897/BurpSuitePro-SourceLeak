package burp;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zb43 implements Zlvr {
  private final Socket Zs;
  
  private final Zmzk ZF;
  
  private final Consumer<Zb43> Zk;
  
  private final AtomicBoolean ZY;
  
  private final long ZG;
  
  private static int[] ZI;
  
  public Zb43(Socket paramSocket, Zmzk paramZmzk, long paramLong) {
    this(paramSocket, paramZmzk, paramSocket::lambda$new$0, paramLong);
  }
  
  public Zb43(Socket paramSocket, Zmzk paramZmzk, Consumer<Zb43> paramConsumer, long paramLong) {
    this.Zs = paramSocket;
    int[] arrayOfInt = Zm();
    this.Zk = paramConsumer;
    this.ZF = paramZmzk;
    this.ZY = new AtomicBoolean();
    this.ZG = paramLong;
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public long ZH() {
    return this.ZG;
  }
  
  public Socket ZY() {
    return this.Zs;
  }
  
  public Zmzk ZA() {
    return this.ZF;
  }
  
  public void Zq() {
    this.ZY.set(true);
  }
  
  public boolean ZT() {
    try {
      if (this.ZY.get())
        return true; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      return Ze();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      return true;
    } 
  }
  
  private boolean Ze() throws IOException {
    int i = this.Zs.getSoTimeout();
    this.Zs.setSoTimeout(10);
    try {
      this.Zs.getInputStream().read();
      return true;
    } catch (SocketTimeoutException socketTimeoutException) {
      Zah.Zl(socketTimeoutException, Zk_.IGNORED);
      this.Zs.setSoTimeout(i);
      return false;
    } 
  }
  
  public void Zo(Zmko paramZmko) {
    paramZmko.ZM(this);
  }
  
  public void Zo() {
    // Byte code:
    //   0: invokestatic Zm : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZY : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   8: invokevirtual get : ()Z
    //   11: ifeq -> 25
    //   14: aload_0
    //   15: getfield Zs : Ljava/net/Socket;
    //   18: invokestatic ZQ : (Ljava/net/Socket;)V
    //   21: aload_1
    //   22: ifnull -> 35
    //   25: aload_0
    //   26: getfield Zk : Ljava/util/function/Consumer;
    //   29: aload_0
    //   30: invokeinterface accept : (Ljava/lang/Object;)V
    //   35: invokestatic Zwu : ()[Lburp/Zbqc;
    //   38: ifnonnull -> 47
    //   41: iconst_5
    //   42: newarray int
    //   44: invokestatic Zb : ([I)V
    //   47: return
  }
  
  private static void lambda$new$0(Socket paramSocket, Zb43 paramZb43) {
    Zsdz.ZQ(paramSocket);
  }
  
  public static void Zb(int[] paramArrayOfint) {
    ZI = paramArrayOfint;
  }
  
  public static int[] Zm() {
    return ZI;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    if (Zm() != null)
      Zb(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb43.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */