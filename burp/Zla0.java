package burp;

import java.io.IOException;

class Zla0 {
  private final byte[][] Zs;
  
  private final int ZE;
  
  private final boolean ZP;
  
  private Zla0(Zstu paramZstu, boolean paramBoolean) {
    this((paramZstu == null) ? new byte[0] : paramZstu.ZiD(), paramBoolean);
  }
  
  private Zla0(byte[] paramArrayOfbyte, boolean paramBoolean) {
    this.Zs = Zz96.Zd(paramArrayOfbyte);
    this.ZP = paramBoolean;
    this.ZE = Zz96.Zl(this.Zs.length);
  }
  
  private boolean ZB() {
    return (this.ZE > 0);
  }
  
  private byte[] ZE(Zxph paramZxph, int paramInt) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore #4
    //   13: iconst_0
    //   14: istore #5
    //   16: iload #5
    //   18: aload_0
    //   19: getfield Zs : [[B
    //   22: arraylength
    //   23: if_icmpge -> 190
    //   26: iload #5
    //   28: iconst_2
    //   29: irem
    //   30: ifne -> 56
    //   33: aload #4
    //   35: aload_0
    //   36: getfield Zs : [[B
    //   39: iload #5
    //   41: aaload
    //   42: invokevirtual write : ([B)V
    //   45: aload_3
    //   46: ifnonnull -> 183
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   55: athrow
    //   56: iload #5
    //   58: iconst_1
    //   59: isub
    //   60: iconst_2
    //   61: idiv
    //   62: iload_2
    //   63: iadd
    //   64: istore #6
    //   66: aload_1
    //   67: iload #6
    //   69: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   72: invokeinterface Zo : (Ljava/lang/Number;)Lburp/Zm8f;
    //   77: astore #7
    //   79: aload #7
    //   81: ifnull -> 101
    //   84: aload #7
    //   86: invokeinterface ZoJ : ()Z
    //   91: ifeq -> 124
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   100: athrow
    //   101: aload #4
    //   103: aload_0
    //   104: getfield Zs : [[B
    //   107: iload #5
    //   109: aaload
    //   110: invokevirtual write : ([B)V
    //   113: aload_3
    //   114: ifnonnull -> 183
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   123: athrow
    //   124: aload_0
    //   125: getfield ZP : Z
    //   128: ifeq -> 152
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   137: athrow
    //   138: aload #7
    //   140: invokeinterface Zo5 : ()[B
    //   145: goto -> 159
    //   148: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   151: athrow
    //   152: aload #7
    //   154: invokeinterface ZoI : ()[B
    //   159: astore #8
    //   161: aload #4
    //   163: aload #8
    //   165: ifnonnull -> 178
    //   168: getstatic net/portswigger/Zdo.ZQ : [B
    //   171: goto -> 180
    //   174: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   177: athrow
    //   178: aload #8
    //   180: invokevirtual write : ([B)V
    //   183: iinc #5, 1
    //   186: aload_3
    //   187: ifnonnull -> 16
    //   190: goto -> 203
    //   193: astore #5
    //   195: aload #5
    //   197: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   200: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   203: aload #4
    //   205: invokevirtual toByteArray : ()[B
    //   208: areturn
    // Exception table:
    //   from	to	target	type
    //   13	190	193	java/io/IOException
    //   26	49	52	java/io/IOException
    //   79	94	97	java/io/IOException
    //   84	117	120	java/io/IOException
    //   101	131	134	java/io/IOException
    //   124	148	148	java/io/IOException
    //   161	174	174	java/io/IOException
  }
  
  public byte[] ZK(int paramInt) {
    return this.Zs[paramInt * 2 + 1];
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zla0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */