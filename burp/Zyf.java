package burp;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import net.portswigger.Zkb;
import net.portswigger.Zmw;

public class Zyf extends Zni implements Zstu {
  private final byte[] Zk;
  
  private static Zbqc[] ZB;
  
  public Zyf(int paramInt) {
    this(new byte[paramInt]);
  }
  
  private Zyf(byte[] paramArrayOfbyte) {
    this.Zk = paramArrayOfbyte;
  }
  
  public static Zyf Zy(byte[] paramArrayOfbyte) {
    try {
      if (paramArrayOfbyte == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zyf(paramArrayOfbyte);
  }
  
  public static Zyf Za(String paramString) {
    try {
      if (paramString == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zyf(Zkb.Zy(paramString));
  }
  
  public static Zyf ZQm() {
    return new Zyf(new byte[0]);
  }
  
  public byte[] ZiD() {
    return this.Zk;
  }
  
  public String Zis() {
    return Zkb.ZG(this.Zk);
  }
  
  public Zstu Zt(byte[] paramArrayOfbyte) {
    try {
      if (paramArrayOfbyte.length != this.Zk.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    System.arraycopy(paramArrayOfbyte, 0, this.Zk, 0, paramArrayOfbyte.length);
    return this;
  }
  
  public byte Zp(int paramInt) {
    return this.Zk[paramInt];
  }
  
  public void Zs(int paramInt, byte paramByte) {
    this.Zk[paramInt] = paramByte;
  }
  
  public Zstu Zb(int paramInt1, int paramInt2) {
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt2 >= paramInt1)
            try {
              if (paramInt2 <= this.Zk.length)
                return Zy(Zmw.Zz(this.Zk, paramInt1, paramInt2)); 
              throw new ArrayIndexOutOfBoundsException();
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void Zo(OutputStream paramOutputStream, int paramInt1, int paramInt2) throws IOException {
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt2 >= 0)
            try {
              if (paramInt1 + paramInt2 <= Zpu()) {
                paramOutputStream.write(this.Zk, paramInt1, paramInt2);
                return;
              } 
              throw new ArrayIndexOutOfBoundsException();
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public Zstu Zp(Zr_4 paramZr_4) {
    return paramZr_4.ZZ(this.Zk);
  }
  
  public int Zpu() {
    return this.Zk.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.Zz(this);
  }
  
  public Zllg<Zstu> ZF() {
    return Zstu.Zc;
  }
  
  public InputStream Zi1() {
    return new ByteArrayInputStream(this.Zk);
  }
  
  public Zstu ZU(InputStream paramInputStream, int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZQN : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: iload_2
    //   5: aload_0
    //   6: getfield Zk : [B
    //   9: arraylength
    //   10: if_icmpeq -> 25
    //   13: new java/lang/IllegalArgumentException
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: athrow
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: iload_2
    //   26: istore #4
    //   28: iconst_0
    //   29: istore #5
    //   31: aload_1
    //   32: aload_0
    //   33: getfield Zk : [B
    //   36: iload #5
    //   38: iload #4
    //   40: invokevirtual read : ([BII)I
    //   43: istore #6
    //   45: iload #4
    //   47: iload #6
    //   49: isub
    //   50: istore #4
    //   52: iload #5
    //   54: iload #6
    //   56: iadd
    //   57: istore #5
    //   59: iload #4
    //   61: ifgt -> 31
    //   64: aload_0
    //   65: invokestatic Zwu : ()[Lburp/Zbqc;
    //   68: ifnonnull -> 92
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: iconst_1
    //   79: anewarray burp/Zbqc
    //   82: invokestatic Zq : ([Lburp/Zbqc;)V
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: areturn
    // Exception table:
    //   from	to	target	type
    //   4	21	21	java/io/IOException
    //   59	71	74	java/io/IOException
    //   64	85	88	java/io/IOException
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (ZF(paramObject))
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (paramObject instanceof Zyf) {
      Zyf zyf = (Zyf)paramObject;
      return Arrays.equals(this.Zk, zyf.Zk);
    } 
    try {
      if (paramObject instanceof Zstu)
        return Zxrp.Zk(this, (Zstu)paramObject); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return Zxrp.ZJ(this);
  }
  
  public static void Zq(Zbqc[] paramArrayOfZbqc) {
    ZB = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZQN() {
    return ZB;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    if (ZQN() == null)
      Zq(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zyf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */