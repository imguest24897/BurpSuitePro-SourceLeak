package burp;

import java.io.IOException;
import java.net.Socket;

class Zxfx extends Zxfj {
  private final Ztwv ZN;
  
  private final Ze2b ZU;
  
  private final Zlit ZC;
  
  private Socket ZR;
  
  private Zxfx(Ztwv paramZtwv, Ze2b paramZe2b, Zlit paramZlit) {
    this.ZN = paramZtwv;
    this.ZU = paramZe2b;
    this.ZC = paramZlit;
  }
  
  public Zm5u ZQ() {
    return this::lambda$switchingProtocolsBehaviour$0;
  }
  
  public Zma9 ZU(Zb6q paramZb6q) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZR : Ljava/net/Socket;
    //   4: ifnull -> 43
    //   7: aload_1
    //   8: ifnull -> 43
    //   11: goto -> 18
    //   14: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   17: athrow
    //   18: aload_1
    //   19: invokeinterface Ze : ()S
    //   24: aload_1
    //   25: invokeinterface Zm : ()Ljava/util/List;
    //   30: invokestatic ZV : (SLjava/util/List;)Z
    //   33: ifne -> 90
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   42: athrow
    //   43: aload_1
    //   44: ifnonnull -> 62
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   53: athrow
    //   54: aconst_null
    //   55: goto -> 73
    //   58: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   61: athrow
    //   62: aload_1
    //   63: invokeinterface Za : ()Lburp/Zstu;
    //   68: invokeinterface ZiD : ()[B
    //   73: astore_2
    //   74: new burp/Zma9
    //   77: dup
    //   78: getstatic burp/Zr42.NON_WEBSOCKET_RESPONSE : Lburp/Zr42;
    //   81: aload_2
    //   82: aload_0
    //   83: getfield ZC : Lburp/Zlit;
    //   86: invokespecial <init> : (Lburp/Zr42;[BLburp/Zlit;)V
    //   89: areturn
    //   90: aload_0
    //   91: getfield ZR : Ljava/net/Socket;
    //   94: iconst_1
    //   95: invokevirtual setKeepAlive : (Z)V
    //   98: aload_0
    //   99: getfield ZR : Ljava/net/Socket;
    //   102: iconst_0
    //   103: invokevirtual setSoTimeout : (I)V
    //   106: new burp/Zma9
    //   109: dup
    //   110: getstatic burp/Zr42.CONNECTED : Lburp/Zr42;
    //   113: aload_0
    //   114: getfield ZR : Ljava/net/Socket;
    //   117: aload_0
    //   118: getfield ZN : Lburp/Ztwv;
    //   121: aload_0
    //   122: getfield ZU : Lburp/Ze2b;
    //   125: invokestatic Zs : (Ljava/net/Socket;Lburp/Ztwv;Lburp/Ze2b;)Lburp/Zxym;
    //   128: aload_1
    //   129: invokeinterface Za : ()Lburp/Zstu;
    //   134: invokeinterface ZiD : ()[B
    //   139: aload_0
    //   140: getfield ZC : Lburp/Zlit;
    //   143: invokespecial <init> : (Lburp/Zr42;Lburp/Zxym;[BLburp/Zlit;)V
    //   146: areturn
    // Exception table:
    //   from	to	target	type
    //   0	11	14	java/io/IOException
    //   7	36	39	java/io/IOException
    //   18	47	50	java/io/IOException
    //   43	58	58	java/io/IOException
  }
  
  private void lambda$switchingProtocolsBehaviour$0(Socket paramSocket, Zb6q paramZb6q) {
    this.ZR = paramSocket;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxfx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */