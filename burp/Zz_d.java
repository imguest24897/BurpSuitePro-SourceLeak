package burp;

import java.io.ByteArrayOutputStream;

public class Zz_d extends ByteArrayOutputStream {
  private final long ZK;
  
  private static Zbqc[] Zc;
  
  private static final String a;
  
  public Zz_d(long paramLong) {
    this.ZK = paramLong;
  }
  
  public synchronized void write(int paramInt) {
    throw new UnsupportedOperationException(a);
  }
  
  public synchronized void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = size();
    try {
      if (i >= this.ZK)
        return; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    int j = ((i + paramInt2) > this.ZK) ? (int)(this.ZK - i) : paramInt2;
    super.write(paramArrayOfbyte, paramInt1, j);
  }
  
  public void write(byte[] paramArrayOfbyte) {
    write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public Zet7 ZK() {
    return new Zet7(toByteArray());
  }
  
  public static void ZL(Zbqc[] paramArrayOfZbqc) {
    Zc = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZV() {
    return Zc;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: ifnonnull -> 13
    //   6: iconst_2
    //   7: anewarray burp/Zbqc
    //   10: invokestatic ZL : ([Lburp/Zbqc;)V
    //   13: bipush #100
    //   15: ldc 'U,.Ux'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zz_d.a : Ljava/lang/String;
    //   24: goto -> 164
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 138
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 120, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 106, 4 -> 111, 5 -> 116
    //   92: bipush #58
    //   94: goto -> 122
    //   97: bipush #94
    //   99: goto -> 122
    //   102: iconst_5
    //   103: goto -> 122
    //   106: bipush #104
    //   108: goto -> 122
    //   111: bipush #21
    //   113: goto -> 122
    //   116: iconst_3
    //   117: goto -> 122
    //   120: bipush #18
    //   122: ixor
    //   123: ixor
    //   124: i2c
    //   125: castore
    //   126: iinc #0, 1
    //   129: dup
    //   130: ifne -> 138
    //   133: dup2
    //   134: dup_x1
    //   135: goto -> 48
    //   138: dup2_x1
    //   139: pop2
    //   140: dup_x2
    //   141: iload_0
    //   142: if_icmpgt -> 45
    //   145: pop
    //   146: new java/lang/String
    //   149: dup_x1
    //   150: swap
    //   151: invokespecial <init> : ([C)V
    //   154: invokevirtual intern : ()Ljava/lang/String;
    //   157: swap
    //   158: pop
    //   159: swap
    //   160: pop
    //   161: goto -> 21
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz_d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */