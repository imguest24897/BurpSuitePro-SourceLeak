package burp;

import java.nio.ByteBuffer;

public class Zsen {
  private final Zxcv Zs = new Zxcv();
  
  private final Zlf3 Ze;
  
  public Zsen(Ze55 paramZe55) {
    this.Ze = new Zlf3(paramZe55);
  }
  
  public Zsp ZH(ByteBuffer paramByteBuffer) throws Zzt7, Zmfz {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zs : Lburp/Zxcv;
    //   4: aload_1
    //   5: invokevirtual ZK : (Ljava/nio/ByteBuffer;)Lburp/Zl3f;
    //   8: astore_3
    //   9: invokestatic ZW : ()[Lburp/Zbqc;
    //   12: aload_3
    //   13: getfield ZU : Lburp/Zz0x;
    //   16: iconst_1
    //   17: newarray int
    //   19: dup
    //   20: iconst_0
    //   21: bipush #8
    //   23: iastore
    //   24: invokevirtual ZL : ([I)Z
    //   27: istore #4
    //   29: astore_2
    //   30: iconst_0
    //   31: istore #6
    //   33: iload #4
    //   35: ifeq -> 93
    //   38: sipush #255
    //   41: aload_1
    //   42: invokevirtual get : ()B
    //   45: iand
    //   46: istore #6
    //   48: iload #6
    //   50: aload_3
    //   51: getfield Zf : I
    //   54: if_icmplt -> 72
    //   57: new burp/Zzt7
    //   60: dup
    //   61: getstatic burp/Zlxi.PROTOCOL_ERROR : Lburp/Zlxi;
    //   64: invokespecial <init> : (Lburp/Zlxi;)V
    //   67: athrow
    //   68: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   71: athrow
    //   72: aload_3
    //   73: getfield Zf : I
    //   76: iload #6
    //   78: isub
    //   79: iconst_1
    //   80: isub
    //   81: istore #7
    //   83: iload #7
    //   85: newarray byte
    //   87: astore #5
    //   89: aload_2
    //   90: ifnonnull -> 101
    //   93: aload_3
    //   94: getfield Zf : I
    //   97: newarray byte
    //   99: astore #5
    //   101: aload_1
    //   102: invokevirtual limit : ()I
    //   105: aload_1
    //   106: invokevirtual position : ()I
    //   109: isub
    //   110: istore #7
    //   112: iload #7
    //   114: aload #5
    //   116: arraylength
    //   117: if_icmpge -> 135
    //   120: new burp/Zzt7
    //   123: dup
    //   124: getstatic burp/Zlxi.FRAME_SIZE_ERROR : Lburp/Zlxi;
    //   127: invokespecial <init> : (Lburp/Zlxi;)V
    //   130: athrow
    //   131: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   134: athrow
    //   135: aload_1
    //   136: aload #5
    //   138: invokevirtual get : ([B)Ljava/nio/ByteBuffer;
    //   141: pop
    //   142: iload #6
    //   144: ifle -> 166
    //   147: aload_1
    //   148: aload_1
    //   149: invokevirtual position : ()I
    //   152: iload #6
    //   154: iadd
    //   155: invokevirtual position : (I)Ljava/nio/ByteBuffer;
    //   158: pop
    //   159: goto -> 166
    //   162: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   165: athrow
    //   166: aload_3
    //   167: getfield Zm : Lburp/Zmcm;
    //   170: ifnonnull -> 181
    //   173: aconst_null
    //   174: goto -> 200
    //   177: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   180: athrow
    //   181: aload_0
    //   182: getfield Ze : Lburp/Zlf3;
    //   185: aload_3
    //   186: getfield Zm : Lburp/Zmcm;
    //   189: invokevirtual ZC : (Lburp/Zmcm;)Lburp/Zg47;
    //   192: aload_3
    //   193: aload #5
    //   195: invokeinterface Zp : (Lburp/Zl3f;[B)Lburp/Zsp;
    //   200: invokestatic Zwu : ()[Lburp/Zbqc;
    //   203: ifnonnull -> 220
    //   206: iconst_3
    //   207: anewarray burp/Zbqc
    //   210: invokestatic ZM : ([Lburp/Zbqc;)V
    //   213: goto -> 220
    //   216: invokestatic a : (Lburp/Zzt7;)Lburp/Zzt7;
    //   219: athrow
    //   220: areturn
    // Exception table:
    //   from	to	target	type
    //   48	68	68	burp/Zzt7
    //   112	131	131	burp/Zzt7
    //   135	159	162	burp/Zzt7
    //   166	177	177	burp/Zzt7
    //   200	213	216	burp/Zzt7
  }
  
  private static Zzt7 a(Zzt7 paramZzt7) {
    return paramZzt7;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsen.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */