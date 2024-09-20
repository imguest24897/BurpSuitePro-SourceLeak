package burp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zkvz extends OutputStream {
  public static final String[] ZQ;
  
  private final boolean Zw;
  
  private byte ZD;
  
  private Object ZN;
  
  private final List<Ztf1> Zy;
  
  private OutputStream Zn;
  
  Zkvz(boolean paramBoolean) {
    this.Zw = paramBoolean;
    this.Zy = new ArrayList<>();
    try {
      ZI((byte)2, null);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void Zq(byte paramByte) {
    try {
      ZI(paramByte, null);
    } catch (FileNotFoundException fileNotFoundException) {
      Zah.Zl(fileNotFoundException, Zk_.IMPOSSIBLE);
    } 
  }
  
  public void ZI(byte paramByte, Object paramObject) throws FileNotFoundException {
    // Byte code:
    //   0: invokestatic ZT : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZD : B
    //   8: ifeq -> 52
    //   11: aload_0
    //   12: getfield Zn : Ljava/io/OutputStream;
    //   15: ifnull -> 52
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   24: athrow
    //   25: aload_0
    //   26: getfield Zn : Ljava/io/OutputStream;
    //   29: invokevirtual flush : ()V
    //   32: aload_0
    //   33: getfield Zn : Ljava/io/OutputStream;
    //   36: invokevirtual close : ()V
    //   39: goto -> 52
    //   42: astore #4
    //   44: aload #4
    //   46: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   49: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   52: aload_0
    //   53: iload_1
    //   54: putfield ZD : B
    //   57: aload_0
    //   58: aload_2
    //   59: putfield ZN : Ljava/lang/Object;
    //   62: iload_1
    //   63: tableswitch default -> 168, 0 -> 88, 1 -> 123, 2 -> 150
    //   88: aload_0
    //   89: aload_0
    //   90: getfield Zw : Z
    //   93: ifeq -> 113
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   102: athrow
    //   103: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   106: goto -> 116
    //   109: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   112: athrow
    //   113: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   116: putfield Zn : Ljava/io/OutputStream;
    //   119: aload_3
    //   120: ifnull -> 168
    //   123: aload_0
    //   124: new java/io/FileOutputStream
    //   127: dup
    //   128: aload_2
    //   129: checkcast java/io/File
    //   132: iconst_1
    //   133: invokespecial <init> : (Ljava/io/File;Z)V
    //   136: putfield Zn : Ljava/io/OutputStream;
    //   139: aload_3
    //   140: ifnull -> 168
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   149: athrow
    //   150: aload_0
    //   151: new burp/Zevn
    //   154: dup
    //   155: invokespecial <init> : ()V
    //   158: putfield Zn : Ljava/io/OutputStream;
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   167: athrow
    //   168: return
    // Exception table:
    //   from	to	target	type
    //   4	18	21	java/io/IOException
    //   25	39	42	java/io/IOException
    //   52	96	99	java/io/IOException
    //   88	109	109	java/io/IOException
    //   116	143	146	java/io/IOException
    //   123	161	164	java/io/IOException
  }
  
  public byte Zj() {
    return this.ZD;
  }
  
  public Object ZT() {
    return this.ZN;
  }
  
  public byte[] ZK() {
    return (this.ZD == 2) ? ((Zevn)this.Zn).toByteArray() : new byte[0];
  }
  
  public void Zy(Ztf1 paramZtf1) {
    synchronized (this.Zy) {
      this.Zy.add(paramZtf1);
    } 
  }
  
  public void Zi(Ztf1 paramZtf1) {
    synchronized (this.Zy) {
      this.Zy.remove(paramZtf1);
    } 
  }
  
  public void write(int paramInt) throws IOException {
    write(new byte[] { (byte)paramInt }, 0, 1);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZT : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield Zn : Ljava/io/OutputStream;
    //   9: aload_1
    //   10: iload_2
    //   11: iload_3
    //   12: invokevirtual write : ([BII)V
    //   15: aload_0
    //   16: getfield Zn : Ljava/io/OutputStream;
    //   19: instanceof java/io/FileOutputStream
    //   22: ifeq -> 52
    //   25: aload_0
    //   26: getfield Zn : Ljava/io/OutputStream;
    //   29: invokevirtual flush : ()V
    //   32: aload_0
    //   33: getfield Zn : Ljava/io/OutputStream;
    //   36: checkcast java/io/FileOutputStream
    //   39: invokevirtual getFD : ()Ljava/io/FileDescriptor;
    //   42: invokevirtual sync : ()V
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   51: athrow
    //   52: aload_0
    //   53: getfield Zy : Ljava/util/List;
    //   56: invokeinterface isEmpty : ()Z
    //   61: ifne -> 121
    //   64: invokestatic isEventDispatchThread : ()Z
    //   67: ifeq -> 96
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   76: athrow
    //   77: aload_0
    //   78: aload_1
    //   79: iload_2
    //   80: iload_3
    //   81: invokevirtual Zz : ([BII)V
    //   84: aload #4
    //   86: ifnull -> 121
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   95: athrow
    //   96: iload_3
    //   97: newarray byte
    //   99: astore #5
    //   101: aload_1
    //   102: iload_2
    //   103: aload #5
    //   105: iconst_0
    //   106: iload_3
    //   107: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   110: aload_0
    //   111: aload #5
    //   113: <illegal opcode> run : (Lburp/Zkvz;[B)Ljava/lang/Runnable;
    //   118: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   121: return
    // Exception table:
    //   from	to	target	type
    //   5	45	48	java/io/IOException
    //   52	70	73	java/io/IOException
    //   64	89	92	java/io/IOException
  }
  
  private void Zz(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    List<Ztf1> list = Zepo.Zj(this.Zy);
    Iterator<Ztf1> iterator = list.iterator();
    String str = Zeu1.ZT();
    while (iterator.hasNext()) {
      Ztf1 ztf1 = iterator.next();
      ztf1.Zc(paramArrayOfbyte, paramInt1, paramInt2);
      if (str != null)
        break; 
    } 
  }
  
  public void ZB() {
    String str = Zeu1.ZT();
    if (this.Zn instanceof Zevn)
      ((Zevn)this.Zn).reset(); 
    if (!this.Zy.isEmpty()) {
      if (SwingUtilities.isEventDispatchThread()) {
        Zb();
        if (str != null) {
          SwingUtilities.invokeLater(this::Zb);
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    SwingUtilities.invokeLater(this::Zb);
  }
  
  private void Zb() {
    List<Ztf1> list = Zepo.Zj(this.Zy);
    Iterator<Ztf1> iterator = list.iterator();
    String str = Zeu1.ZT();
    while (iterator.hasNext()) {
      Ztf1 ztf1 = iterator.next();
      ztf1.Z_();
      if (str != null)
        break; 
    } 
  }
  
  public void flush() {
    try {
      this.Zn.flush();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void close() {
    try {
      if (this.ZD == 1)
        this.Zn.close(); 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void lambda$write$0(byte[] paramArrayOfbyte) {
    Zz(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'BXT^ n4yQXx'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: iconst_2
    //   18: istore_2
    //   19: iconst_m1
    //   20: istore_1
    //   21: bipush #126
    //   23: iinc #1, 1
    //   26: aload_3
    //   27: iload_1
    //   28: dup
    //   29: iload_2
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 69
    //   38: aload_0
    //   39: swap
    //   40: iload #4
    //   42: iinc #4, 1
    //   45: swap
    //   46: aastore
    //   47: iload_1
    //   48: iload_2
    //   49: iadd
    //   50: dup
    //   51: istore_1
    //   52: iload #5
    //   54: if_icmpge -> 66
    //   57: aload_3
    //   58: iload_1
    //   59: invokevirtual charAt : (I)C
    //   62: istore_2
    //   63: goto -> 21
    //   66: goto -> 215
    //   69: dup_x2
    //   70: pop
    //   71: invokevirtual toCharArray : ()[C
    //   74: dup_x1
    //   75: arraylength
    //   76: dup_x2
    //   77: pop
    //   78: iconst_0
    //   79: istore #6
    //   81: dup2_x1
    //   82: pop2
    //   83: dup_x2
    //   84: iconst_1
    //   85: if_icmpgt -> 188
    //   88: dup2
    //   89: swap
    //   90: iload #6
    //   92: dup2_x1
    //   93: caload
    //   94: swap
    //   95: iload #6
    //   97: bipush #7
    //   99: irem
    //   100: tableswitch default -> 170, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #73
    //   142: goto -> 172
    //   145: bipush #79
    //   147: goto -> 172
    //   150: bipush #16
    //   152: goto -> 172
    //   155: bipush #99
    //   157: goto -> 172
    //   160: bipush #6
    //   162: goto -> 172
    //   165: bipush #38
    //   167: goto -> 172
    //   170: bipush #98
    //   172: ixor
    //   173: ixor
    //   174: i2c
    //   175: castore
    //   176: iinc #6, 1
    //   179: dup
    //   180: ifne -> 188
    //   183: dup2
    //   184: dup_x1
    //   185: goto -> 92
    //   188: dup2_x1
    //   189: pop2
    //   190: dup_x2
    //   191: iload #6
    //   193: if_icmpgt -> 88
    //   196: pop
    //   197: new java/lang/String
    //   200: dup_x1
    //   201: swap
    //   202: invokespecial <init> : ([C)V
    //   205: invokevirtual intern : ()Ljava/lang/String;
    //   208: swap
    //   209: pop
    //   210: swap
    //   211: pop
    //   212: goto -> 38
    //   215: iconst_3
    //   216: anewarray java/lang/String
    //   219: dup
    //   220: iconst_0
    //   221: aload_0
    //   222: iconst_1
    //   223: aaload
    //   224: aastore
    //   225: dup
    //   226: iconst_1
    //   227: aload_0
    //   228: iconst_2
    //   229: aaload
    //   230: aastore
    //   231: dup
    //   232: iconst_2
    //   233: aload_0
    //   234: iconst_0
    //   235: aaload
    //   236: aastore
    //   237: putstatic burp/Zkvz.ZQ : [Ljava/lang/String;
    //   240: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkvz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */