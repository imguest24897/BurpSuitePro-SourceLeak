package burp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zm5k {
  private final Ztwv ZP;
  
  private final Consumer<Socket> ZX;
  
  private final AtomicReference<ServerSocket> Zg;
  
  private static String Zq;
  
  private static final String b;
  
  public Zm5k(Ztwv paramZtwv, Consumer<Socket> paramConsumer) {
    this.ZP = paramZtwv;
    this.ZX = paramConsumer;
    this.Zg = new AtomicReference<>();
  }
  
  public synchronized void ZF() {
    try {
      if (this.Zg.compareAndSet(null, new ServerSocket(0, 0, Zg())))
        this.ZP.Zx(new Zs7b(this.Zg.get(), this.ZX)); 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
    } 
  }
  
  public int ZW() {
    ServerSocket serverSocket = this.Zg.get();
    return (serverSocket != null) ? serverSocket.getLocalPort() : 0;
  }
  
  static InetAddress Zg() {
    try {
      return InetAddress.getByName(b);
    } catch (UnknownHostException unknownHostException) {
      Zah.Zl(unknownHostException, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public synchronized void ZX() {
    try {
      if (this.Zg.get() == null)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      ((ServerSocket)this.Zg.getAndSet(null)).close();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
  
  public static void Za(String paramString) {
    Zq = paramString;
  }
  
  public static String Ze() {
    return Zq;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Ze : ()Ljava/lang/String;
    //   3: ifnull -> 11
    //   6: ldc 'aMiRmc'
    //   8: invokestatic Za : (Ljava/lang/String;)V
    //   11: bipush #17
    //   13: ldc 'huh]dwv'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zm5k.b : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #72
    //   94: goto -> 124
    //   97: bipush #86
    //   99: goto -> 124
    //   102: bipush #78
    //   104: goto -> 124
    //   107: bipush #60
    //   109: goto -> 124
    //   112: bipush #50
    //   114: goto -> 124
    //   117: bipush #98
    //   119: goto -> 124
    //   122: bipush #69
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm5k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */