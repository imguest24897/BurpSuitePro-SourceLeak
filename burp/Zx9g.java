package burp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class Zx9g extends Zxsr implements Zstu {
  private final int Zp;
  
  private final ByteBuffer ZI;
  
  private final int ZP;
  
  private static final String a;
  
  Zx9g(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.Zp = paramInt;
    this.ZI = paramZso4.ZR();
    this.ZP = this.ZI.position();
  }
  
  public Zeu4<Zstu> ZF() {
    return Zstu.Zc;
  }
  
  public int Zpu() {
    return this.Zp;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.Zz(this);
  }
  
  public byte[] ZiD() {
    byte[] arrayOfByte = new byte[this.Zp];
    this.ZI.duplicate().get(arrayOfByte);
    return arrayOfByte;
  }
  
  public String Zis() {
    return Zruv.Zl(this);
  }
  
  public Zstu Zt(byte[] paramArrayOfbyte) {
    try {
      if (paramArrayOfbyte.length != this.Zp)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZI.duplicate().put(paramArrayOfbyte);
    return this;
  }
  
  public byte Zp(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zp)
            return this.ZI.get(this.ZP + paramInt); 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void Zs(int paramInt, byte paramByte) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zp) {
            this.ZI.put(this.ZP + paramInt, paramByte);
            return;
          } 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public Zstu Zb(int paramInt1, int paramInt2) {
    int i = paramInt2 - paramInt1;
    Zbqc[] arrayOfZbqc = Zyf.ZQN();
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt2 >= paramInt1)
            try {
              if (paramInt2 <= this.Zp) {
                byte[] arrayOfByte = new byte[i];
                ByteBuffer byteBuffer = this.ZI.duplicate();
                try {
                  byteBuffer.position(this.ZP + paramInt1);
                  byteBuffer.get(arrayOfByte, 0, i);
                  if (arrayOfZbqc == null)
                    Zbqc.Zr(new Zbqc[5]); 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                return Zyf.Zy(arrayOfByte);
              } 
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
    Zbqc[] arrayOfZbqc = Zyf.ZQN();
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt2 >= 0)
            try {
              if (paramInt1 + paramInt2 <= Zpu()) {
                byte b = 0;
                while (b < paramInt2) {
                  paramOutputStream.write(Zp(paramInt1 + b));
                  b++;
                  if (arrayOfZbqc == null)
                    break; 
                } 
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
    try {
      if (paramZr_4.ZV(this))
        return this; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramZr_4.ZZ(ZiD());
  }
  
  public InputStream Zi1() {
    return new Zx6s(this);
  }
  
  public Zstu ZU(InputStream paramInputStream, int paramInt) throws IOException {
    Zbqc[] arrayOfZbqc = Zyf.ZQN();
    try {
      if (paramInt != this.Zp)
        throw new IllegalArgumentException(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ByteBuffer byteBuffer = this.ZI.duplicate();
    int i = 0;
    byte[] arrayOfByte = new byte[Math.min(paramInt, 1024)];
    while (i < paramInt) {
      int j = paramInputStream.read(arrayOfByte, 0, Math.min(1024, paramInt - i));
      try {
        if (j < 0)
          throw new IOException(a); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      byteBuffer.put(arrayOfByte, 0, j);
      i += j;
      if (arrayOfZbqc == null)
        break; 
    } 
    return this;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (super.equals(paramObject))
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof Zx9g)
        try {
          if (this.ZI.equals(((Zx9g)paramObject).ZI))
            return true; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
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
  
  public void Zo(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    this.ZI.get(paramInt1, paramArrayOfbyte, 0, paramInt2);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #117
    //   2: ldc '%dGYLjOG\\\bCcOc\\t\\rP'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zx9g.a : Ljava/lang/String;
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
    //   80: bipush #22
    //   82: goto -> 112
    //   85: bipush #112
    //   87: goto -> 112
    //   90: bipush #26
    //   92: goto -> 112
    //   95: bipush #29
    //   97: goto -> 112
    //   100: bipush #87
    //   102: goto -> 112
    //   105: bipush #72
    //   107: goto -> 112
    //   110: bipush #25
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx9g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */