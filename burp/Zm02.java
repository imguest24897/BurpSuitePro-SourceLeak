package burp;

import java.net.InetAddress;
import java.net.UnknownHostException;

class Zm02 {
  private final Zgb6 ZK;
  
  private final Zrgd ZP;
  
  private final Zr1j ZH;
  
  private final Zkh7 ZT;
  
  private final String ZR;
  
  private final long Zc;
  
  private InetAddress Z_;
  
  private boolean Zb;
  
  Zm02(Zgb6 paramZgb6, Zrgd paramZrgd, Zr1j paramZr1j, Zkh7 paramZkh7, String paramString, long paramLong, InetAddress paramInetAddress) {
    this.ZK = paramZgb6;
    this.ZP = paramZrgd;
    this.ZH = paramZr1j;
    this.ZT = paramZkh7;
    this.ZR = paramString;
    this.Zc = paramLong;
    this.Z_ = paramInetAddress;
  }
  
  void Zo() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZK : Lburp/Zgb6;
    //   4: invokeinterface ZfU : ()Z
    //   9: ifeq -> 36
    //   12: aload_0
    //   13: getfield ZK : Lburp/Zgb6;
    //   16: invokeinterface ZfS : ()Z
    //   21: ifeq -> 36
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
    //   30: athrow
    //   31: return
    //   32: invokestatic a : (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
    //   35: athrow
    //   36: aload_0
    //   37: getfield ZT : Lburp/Zkh7;
    //   40: aload_0
    //   41: getfield ZR : Ljava/lang/String;
    //   44: invokevirtual ZV : (Ljava/lang/String;)Ljava/net/InetAddress;
    //   47: astore_1
    //   48: aload_1
    //   49: ifnull -> 62
    //   52: aload_0
    //   53: aload_1
    //   54: putfield Z_ : Ljava/net/InetAddress;
    //   57: return
    //   58: invokestatic a : (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
    //   61: athrow
    //   62: aload_0
    //   63: getfield ZK : Lburp/Zgb6;
    //   66: invokeinterface Zfl : ()I
    //   71: istore_2
    //   72: aload_0
    //   73: getfield ZK : Lburp/Zgb6;
    //   76: invokeinterface Zfv : ()I
    //   81: istore_3
    //   82: aload_0
    //   83: getfield Zc : J
    //   86: lconst_0
    //   87: lcmp
    //   88: ifeq -> 191
    //   91: aload_0
    //   92: getfield Z_ : Ljava/net/InetAddress;
    //   95: ifnull -> 141
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
    //   104: athrow
    //   105: iload_2
    //   106: ifle -> 141
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
    //   115: athrow
    //   116: aload_0
    //   117: getfield ZP : Lburp/Zrgd;
    //   120: invokevirtual ZX : ()J
    //   123: iload_2
    //   124: i2l
    //   125: lsub
    //   126: aload_0
    //   127: getfield Zc : J
    //   130: lcmp
    //   131: ifgt -> 191
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
    //   140: athrow
    //   141: aload_0
    //   142: getfield Z_ : Ljava/net/InetAddress;
    //   145: ifnonnull -> 231
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
    //   154: athrow
    //   155: iload_3
    //   156: ifle -> 231
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
    //   165: athrow
    //   166: aload_0
    //   167: getfield ZP : Lburp/Zrgd;
    //   170: invokevirtual ZX : ()J
    //   173: iload_3
    //   174: i2l
    //   175: lsub
    //   176: aload_0
    //   177: getfield Zc : J
    //   180: lcmp
    //   181: ifle -> 231
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/net/UnknownHostException;)Ljava/net/UnknownHostException;
    //   190: athrow
    //   191: aload_0
    //   192: aload_0
    //   193: getfield ZH : Lburp/Zr1j;
    //   196: aload_0
    //   197: getfield ZR : Ljava/lang/String;
    //   200: invokeinterface Zt : (Ljava/lang/String;)Ljava/net/InetAddress;
    //   205: putfield Z_ : Ljava/net/InetAddress;
    //   208: goto -> 226
    //   211: astore #4
    //   213: aload #4
    //   215: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   218: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   221: aload_0
    //   222: aconst_null
    //   223: putfield Z_ : Ljava/net/InetAddress;
    //   226: aload_0
    //   227: iconst_1
    //   228: putfield Zb : Z
    //   231: return
    // Exception table:
    //   from	to	target	type
    //   0	24	27	java/net/UnknownHostException
    //   12	32	32	java/net/UnknownHostException
    //   48	58	58	java/net/UnknownHostException
    //   82	98	101	java/net/UnknownHostException
    //   91	109	112	java/net/UnknownHostException
    //   105	134	137	java/net/UnknownHostException
    //   116	148	151	java/net/UnknownHostException
    //   141	159	162	java/net/UnknownHostException
    //   155	184	187	java/net/UnknownHostException
    //   191	208	211	java/net/UnknownHostException
  }
  
  InetAddress ZK() {
    return this.Z_;
  }
  
  boolean ZR() {
    return this.Zb;
  }
  
  private static UnknownHostException a(UnknownHostException paramUnknownHostException) {
    return paramUnknownHostException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm02.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */