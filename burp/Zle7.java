package burp;

import java.io.IOException;
import java.net.Socket;

class Zle7 {
  private final Zb_d ZO;
  
  private static final String a;
  
  Zle7(Zb_d paramZb_d) {
    this.ZO = paramZb_d;
  }
  
  Zgke ZA(Socket paramSocket, Zmu8 paramZmu8, Zmzk paramZmzk, long paramLong) throws IOException {
    return this.ZO.Ze(paramSocket, paramZmzk, paramZmu8, paramLong);
  }
  
  <T> Zgke Zh(Socket paramSocket, Zmzk paramZmzk, Zxgx<T> paramZxgx, T paramT, long paramLong) throws IOException {
    // Byte code:
    //   0: aload_3
    //   1: aload #4
    //   3: aload_0
    //   4: aload_3
    //   5: aload #4
    //   7: aload_1
    //   8: aload_2
    //   9: lload #5
    //   11: <illegal opcode> ZC : (Lburp/Zle7;Lburp/Zxgx;Ljava/lang/Object;Ljava/net/Socket;Lburp/Zmzk;J)Lburp/Zs4i;
    //   16: invokeinterface ZJ : (Ljava/lang/Object;Lburp/Zs4i;)Lburp/Zgke;
    //   21: astore #7
    //   23: aload #7
    //   25: ifnonnull -> 43
    //   28: new java/io/IOException
    //   31: dup
    //   32: getstatic burp/Zle7.a : Ljava/lang/String;
    //   35: invokespecial <init> : (Ljava/lang/String;)V
    //   38: athrow
    //   39: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   42: athrow
    //   43: aload #7
    //   45: areturn
    // Exception table:
    //   from	to	target	type
    //   23	39	39	java/io/IOException
  }
  
  private Zgke lambda$createPooledConnectionUsingRealSocket$0(Zxgx paramZxgx, Object paramObject, Socket paramSocket, Zmzk paramZmzk, long paramLong) throws IOException {
    Zs3o zs3o = new Zs3o(this, paramZxgx, paramObject, paramSocket);
    return ZA(paramSocket, zs3o, paramZmzk, paramLong);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #107
    //   2: ldc 'Jld.EG:fw1!S5}f1,DtAWEUtjl,D `l'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zle7.a : Ljava/lang/String;
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
    //   80: bipush #98
    //   82: goto -> 112
    //   85: bipush #104
    //   87: goto -> 112
    //   90: bipush #122
    //   92: goto -> 112
    //   95: bipush #41
    //   97: goto -> 112
    //   100: bipush #74
    //   102: goto -> 112
    //   105: bipush #12
    //   107: goto -> 112
    //   110: bipush #63
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zle7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */