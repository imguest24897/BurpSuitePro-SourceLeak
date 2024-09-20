package burp;

import java.io.IOException;
import java.net.Socket;

public class Zrev implements Zln {
  private final Zzxn Zx;
  
  private final Zsxe ZE;
  
  private final Ztwv ZV;
  
  private final Zlhd ZX;
  
  private final Zrgd ZG;
  
  private final Zrps ZZ;
  
  private final Zst5 Zu;
  
  private final Zgzx Zv;
  
  private static final String a;
  
  public Zrev(Zzxn paramZzxn, Zsxe paramZsxe, Ztwv paramZtwv, Zlhd paramZlhd, Zrgd paramZrgd, Zrps paramZrps, Zst5 paramZst5, Zgzx paramZgzx) {
    this.Zx = paramZzxn;
    this.ZE = paramZsxe;
    this.ZV = paramZtwv;
    this.ZX = paramZlhd;
    this.ZG = paramZrgd;
    this.ZZ = paramZrps;
    this.Zu = paramZst5;
    this.Zv = paramZgzx;
  }
  
  public Zlom Zr(int paramInt, Zefx paramZefx, Zlhj paramZlhj, Socket paramSocket, Zseo paramZseo) throws IOException {
    // Byte code:
    //   0: getstatic burp/Zrev.a : Ljava/lang/String;
    //   3: aload_2
    //   4: invokeinterface Zr : ()Ljava/lang/String;
    //   9: invokevirtual equals : (Ljava/lang/Object;)Z
    //   12: ifeq -> 42
    //   15: aload_0
    //   16: getfield Zu : Lburp/Zst5;
    //   19: invokeinterface ZP : ()Z
    //   24: ifeq -> 42
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   33: athrow
    //   34: iconst_1
    //   35: goto -> 43
    //   38: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   41: athrow
    //   42: iconst_0
    //   43: istore #6
    //   45: new burp/Zlom
    //   48: dup
    //   49: iload_1
    //   50: aload_0
    //   51: getfield Zx : Lburp/Zzxn;
    //   54: aload_2
    //   55: aload_3
    //   56: aload #4
    //   58: aload_0
    //   59: getfield ZZ : Lburp/Zrps;
    //   62: invokeinterface Zb : ()I
    //   67: aload_0
    //   68: getfield ZZ : Lburp/Zrps;
    //   71: invokeinterface ZG : ()I
    //   76: iload #6
    //   78: aload_0
    //   79: getfield ZE : Lburp/Zsxe;
    //   82: aload_0
    //   83: getfield ZG : Lburp/Zrgd;
    //   86: aload #5
    //   88: aconst_null
    //   89: aconst_null
    //   90: aload_0
    //   91: getfield Zv : Lburp/Zgzx;
    //   94: invokeinterface Zi : ()Z
    //   99: ifne -> 110
    //   102: iconst_1
    //   103: goto -> 111
    //   106: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   109: athrow
    //   110: iconst_0
    //   111: invokespecial <init> : (ILburp/Zzxn;Lburp/Zefx;Lburp/Zlhj;Ljava/net/Socket;IIZLburp/Zsxe;Lburp/Zrgd;Lburp/Zseo;Lburp/Zlc8;Ljava/io/OutputStream;Z)V
    //   114: areturn
    // Exception table:
    //   from	to	target	type
    //   0	27	30	java/io/IOException
    //   15	38	38	java/io/IOException
    //   45	106	106	java/io/IOException
  }
  
  public Zloe Zc(Socket paramSocket) throws IOException {
    Zloe zloe = new Zloe(paramSocket, this.ZX.ZB(), this.Zu.Zd(), this.ZE, this.ZV, this.ZG);
    this.ZV.Zx(zloe);
    return zloe;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #57
    //   2: ldc '_yF'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrev.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #98
    //   82: goto -> 111
    //   85: bipush #35
    //   87: goto -> 111
    //   90: iconst_1
    //   91: goto -> 111
    //   94: bipush #59
    //   96: goto -> 111
    //   99: bipush #17
    //   101: goto -> 111
    //   104: bipush #117
    //   106: goto -> 111
    //   109: bipush #60
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrev.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */