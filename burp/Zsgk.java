package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.net.ssl.SSLSocket;
import net.portswigger.Zdo;
import net.portswigger.Zli;

public class Zsgk {
  private final Zz1 Zp;
  
  private final Zz2j ZM;
  
  private final Zml3 ZV;
  
  private final Ztbb ZZ;
  
  private final Ztae ZP;
  
  private final Zey9 Zu;
  
  private final AtomicReference<Zxym> Zy;
  
  private final Zzmb ZR;
  
  private final Zgb6 ZW;
  
  private final Consumer<String> ZG;
  
  private static final String a;
  
  public Zsgk(Zz1 paramZz1, Consumer<String> paramConsumer, Zz2j paramZz2j, Zml3 paramZml3, Zkl6 paramZkl6, Ztae paramZtae, Zzmb paramZzmb, Zgb6 paramZgb6) {
    this.ZG = paramConsumer;
    this.Zp = paramZz1;
    this.ZM = paramZz2j;
    this.ZV = paramZml3;
    String str = Zm5k.Ze();
    this.ZP = paramZtae;
    this.ZR = paramZzmb;
    this.ZW = paramZgb6;
    this.ZZ = paramZkl6.ZM();
    this.Zu = paramZkl6.ZH();
    this.Zy = new AtomicReference<>();
    if (str != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void Zb() throws Zz8h, IOException, Zs2o {
    ZN();
    Zk();
    Ztyh.Zc();
  }
  
  private void ZN() throws Zz8h {
    Objects.requireNonNull(this.Zy);
    Zs8o zs8o = new Zs8o(this.ZM, this.Zp, this.ZV.Zu(), this.ZP, this.Zy::set, this.Zu, this.ZR, this.ZW);
    zs8o.Zt();
    Zsxd zsxd = zs8o.Zf();
    Zb6q zb6q = zsxd.ZG().Ze();
    try {
    
    } catch (Zz8h zz8h) {
      throw a(null);
    } 
    byte[] arrayOfByte = (zb6q == null) ? null : zb6q.Za().ZiD();
    this.ZM.Zc(arrayOfByte);
  }
  
  void Zk() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZV : Lburp/Zml3;
    //   4: invokeinterface Zu : ()Ljava/net/Socket;
    //   9: astore_2
    //   10: invokestatic Ze : ()Ljava/lang/String;
    //   13: aload_2
    //   14: invokevirtual getSoTimeout : ()I
    //   17: istore_3
    //   18: astore_1
    //   19: aload_2
    //   20: ldc 120000
    //   22: invokevirtual setSoTimeout : (I)V
    //   25: aload_0
    //   26: aload_2
    //   27: aload_2
    //   28: invokevirtual getOutputStream : ()Ljava/io/OutputStream;
    //   31: aload_0
    //   32: getfield ZV : Lburp/Zml3;
    //   35: invokeinterface ZZ : ()Lburp/Zmzk;
    //   40: invokevirtual ZG : (Ljava/net/Socket;Ljava/io/OutputStream;Lburp/Zmzk;)V
    //   43: aload_0
    //   44: getfield Zy : Ljava/util/concurrent/atomic/AtomicReference;
    //   47: invokevirtual get : ()Ljava/lang/Object;
    //   50: checkcast burp/Zxym
    //   53: astore #4
    //   55: aload #4
    //   57: ifnull -> 109
    //   60: aload_0
    //   61: getfield ZG : Ljava/util/function/Consumer;
    //   64: aload_0
    //   65: getfield ZV : Lburp/Zml3;
    //   68: invokeinterface Zi : ()Lburp/Zz1p;
    //   73: getfield Zo : Lburp/Zlit;
    //   76: invokeinterface Zdw : ()Ljava/lang/String;
    //   81: invokeinterface accept : (Ljava/lang/Object;)V
    //   86: aload_2
    //   87: iload_3
    //   88: invokevirtual setSoTimeout : (I)V
    //   91: aload #4
    //   93: invokeinterface Zt : ()V
    //   98: aload_1
    //   99: ifnull -> 120
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   108: athrow
    //   109: aload_2
    //   110: invokestatic ZW : (Ljava/net/Socket;)V
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: invokestatic Zwu : ()[Lburp/Zbqc;
    //   123: ifnonnull -> 138
    //   126: ldc 'okMSlc'
    //   128: invokestatic Za : (Ljava/lang/String;)V
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: return
    // Exception table:
    //   from	to	target	type
    //   55	102	105	java/io/IOException
    //   60	113	116	java/io/IOException
    //   120	131	134	java/io/IOException
  }
  
  private void ZG(Socket paramSocket, OutputStream paramOutputStream, Zmzk paramZmzk) throws IOException {
    // Byte code:
    //   0: invokestatic Ze : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield ZM : Lburp/Zz2j;
    //   9: invokevirtual Zt : ()[B
    //   12: astore #5
    //   14: aload_0
    //   15: aload_1
    //   16: aload_3
    //   17: aload #5
    //   19: invokevirtual ZT : (Ljava/net/Socket;Lburp/Zmzk;[B)Z
    //   22: ifeq -> 62
    //   25: aload_2
    //   26: getstatic net/portswigger/Zdo.Zc : [B
    //   29: invokevirtual write : ([B)V
    //   32: aload_2
    //   33: aload #5
    //   35: getstatic net/portswigger/Zdo.Z_ : [B
    //   38: arraylength
    //   39: aload #5
    //   41: arraylength
    //   42: getstatic net/portswigger/Zdo.Z_ : [B
    //   45: arraylength
    //   46: isub
    //   47: invokevirtual write : ([BII)V
    //   50: aload #4
    //   52: ifnull -> 75
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_2
    //   63: aload #5
    //   65: invokevirtual write : ([B)V
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: aload_2
    //   76: invokevirtual flush : ()V
    //   79: return
    // Exception table:
    //   from	to	target	type
    //   14	55	58	java/io/IOException
    //   25	68	71	java/io/IOException
  }
  
  private boolean ZT(Socket paramSocket, Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    boolean bool = paramSocket instanceof SSLSocket;
    if (bool) {
      SSLSocket sSLSocket = (SSLSocket)paramSocket;
      return ZM(sSLSocket, paramZmzk, paramArrayOfbyte);
    } 
    return Zli.ZB(paramArrayOfbyte, Zdo.Z_, 0);
  }
  
  private boolean ZM(SSLSocket paramSSLSocket, Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    return (ZQ(paramZmzk) && !ZE(paramSSLSocket)) ? Zli.ZB(paramArrayOfbyte, Zdo.Z_, 0) : false;
  }
  
  private boolean ZQ(Zmzk paramZmzk) {
    return (this.ZZ.ZP(paramZmzk).equals(Zxk3.HTTP_V2) && paramZmzk.ZJZ());
  }
  
  private static boolean ZE(SSLSocket paramSSLSocket) {
    return a.equals(paramSSLSocket.getApplicationProtocol());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #57
    //   2: ldc 'r#'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsgk.a : Ljava/lang/String;
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
    //   80: bipush #35
    //   82: goto -> 112
    //   85: bipush #40
    //   87: goto -> 112
    //   90: bipush #105
    //   92: goto -> 112
    //   95: bipush #92
    //   97: goto -> 112
    //   100: bipush #95
    //   102: goto -> 112
    //   105: bipush #73
    //   107: goto -> 112
    //   110: bipush #54
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsgk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */