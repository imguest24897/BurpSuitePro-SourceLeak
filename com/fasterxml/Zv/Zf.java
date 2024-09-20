package com.fasterxml.Zv;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zm;
import com.fasterxml.Zb.Zm0;
import com.fasterxml.Zb.Zma;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zb.Zmi;
import com.fasterxml.Zb.Zmk;
import com.fasterxml.Zoi.Zm;
import com.fasterxml.Zoi.Zp;
import com.fasterxml.Zr.Za;
import com.fasterxml.Zr.Zm;
import com.fasterxml.Zv9;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import org.yaml.Z_k;
import org.yaml.Zjv;
import org.yaml.Ztw;

public class Zf extends Zmi {
  private static final long serialVersionUID = 1L;
  
  protected static final int ZW;
  
  protected static final int Zx;
  
  protected int ZQ = Zx;
  
  protected int ZX = ZW;
  
  protected final Zjv Zv;
  
  protected final Zp ZH;
  
  protected final Ztw Zw;
  
  protected final Z_k ZP;
  
  private static final String d;
  
  public Zf() {
    this((Zmd)null);
  }
  
  public Zf(Zmd paramZmd) {
    super(paramZmd);
    this.ZQ = Zx;
    this.ZX = ZW;
    this.Zv = null;
    this.ZH = (Zp)Zm.Zh();
    this.Zw = null;
    this.ZP = null;
  }
  
  public Zf(Zf paramZf, Zmd paramZmd) {
    super(paramZf, paramZmd);
    this.ZQ = paramZf.ZQ;
    this.ZX = paramZf.ZX;
    this.Zv = paramZf.Zv;
    this.ZH = paramZf.ZH;
    this.Zw = paramZf.Zw;
    this.ZP = paramZf.ZP;
  }
  
  protected Zf(Zb paramZb) {
    super(paramZb, false);
    this.ZQ = paramZb.ZJ();
    this.ZX = paramZb.ZM();
    this.Zv = paramZb.Z_();
    this.ZH = paramZb.Zl();
    this.Zw = paramZb.Zt();
    this.ZP = paramZb.Zc();
  }
  
  public static Zb Zx() {
    return new Zb();
  }
  
  protected Object readResolve() {
    return new Zf(this, this.Ze);
  }
  
  public Zmk version() {
    return Zk.Zr;
  }
  
  public boolean ZK() {
    return false;
  }
  
  public String Zp() {
    return d;
  }
  
  public Zm ZT(Za paramZa) throws IOException {
    try {
      if (!paramZa.Zh())
        return Zm.INCONCLUSIVE; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = paramZa.Zn();
    try {
      if (b == -17) {
        try {
          if (!paramZa.Zh())
            return Zm.INCONCLUSIVE; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (paramZa.Zn() != -69)
            return Zm.NO_MATCH; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (!paramZa.Zh())
            return Zm.INCONCLUSIVE; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (paramZa.Zn() != -65)
            return Zm.NO_MATCH; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (!paramZa.Zh())
            return Zm.INCONCLUSIVE; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        b = paramZa.Zn();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (b == 45)
        try {
          if (paramZa.Zh())
            try {
              if (paramZa.Zn() == 45)
                try {
                  if (paramZa.Zh())
                    try {
                      if (paramZa.Zn() == 45)
                        return Zm.FULL_MATCH; 
                    } catch (IOException iOException) {
                      throw a(null);
                    }  
                } catch (IOException iOException) {
                  throw a(null);
                }  
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zm.INCONCLUSIVE;
  }
  
  public Zf Zz(Zu paramZu) {
    this.ZQ |= paramZu.ZV();
    return this;
  }
  
  public Zf ZC(Zu paramZu) {
    this.ZQ &= paramZu.ZV() ^ 0xFFFFFFFF;
    return this;
  }
  
  public Zz Zz(String paramString) throws IOException {
    return Zl(new StringReader(paramString));
  }
  
  public Zz Zh(InputStream paramInputStream) throws IOException {
    Zv9 zv9 = Zc(ZA(paramInputStream), false);
    return ZX(Zk(paramInputStream, zv9), zv9);
  }
  
  public Zz Zl(Reader paramReader) throws IOException {
    Zv9 zv9 = Zc(ZA(paramReader), false);
    return Zk(Zy(paramReader, zv9), zv9);
  }
  
  public Zz Za(byte[] paramArrayOfbyte) throws IOException {
    Zv9 zv9 = Zc(ZA(paramArrayOfbyte), true);
    if (this.Zy != null) {
      InputStream inputStream = this.Zy.Z_(zv9, paramArrayOfbyte, 0, paramArrayOfbyte.length);
      try {
        if (inputStream != null)
          return ZX(inputStream, zv9); 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return Zr(paramArrayOfbyte, 0, paramArrayOfbyte.length, zv9);
  }
  
  public Zz Z_(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    Zv9 zv9 = Zc(Zf(paramArrayOfbyte, paramInt1, paramInt2), true);
    if (this.Zy != null) {
      InputStream inputStream = this.Zy.Z_(zv9, paramArrayOfbyte, paramInt1, paramInt2);
      try {
        if (inputStream != null)
          return ZX(inputStream, zv9); 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return Zr(paramArrayOfbyte, paramInt1, paramInt2, zv9);
  }
  
  public Zo Zr(OutputStream paramOutputStream, Zma paramZma) throws IOException {
    Zv9 zv9 = Zc(ZA(paramOutputStream), false);
    zv9.Zs(paramZma);
    return ZZ(Zz(Zq(paramOutputStream, zv9), paramZma, zv9), zv9);
  }
  
  public Zo ZT(Writer paramWriter) throws IOException {
    Zv9 zv9 = Zc(ZA(paramWriter), false);
    return ZZ(ZL(paramWriter, zv9), zv9);
  }
  
  protected Zz ZX(InputStream paramInputStream, Zv9 paramZv9) throws IOException {
    return new Zz(paramZv9, this.ZT, this.ZX, this.Zw, this.Ze, Zl(paramInputStream, (Zma)null, paramZv9));
  }
  
  protected Zz Zk(Reader paramReader, Zv9 paramZv9) throws IOException {
    return new Zz(paramZv9, this.ZT, this.ZX, this.Zw, this.Ze, paramReader);
  }
  
  protected Zz ZX(char[] paramArrayOfchar, int paramInt1, int paramInt2, Zv9 paramZv9, boolean paramBoolean) throws IOException {
    return new Zz(paramZv9, this.ZT, this.ZX, this.Zw, this.Ze, new CharArrayReader(paramArrayOfchar, paramInt1, paramInt2));
  }
  
  protected Zz Zr(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, Zv9 paramZv9) throws IOException {
    return new Zz(paramZv9, this.ZT, this.ZX, this.Zw, this.Ze, Zk(paramArrayOfbyte, paramInt1, paramInt2, (Zma)null, paramZv9));
  }
  
  protected Zo ZZ(Writer paramWriter, Zv9 paramZv9) throws IOException {
    int i = this.ZQ;
    try {
      if (this.ZP == null)
        return new Zo(paramZv9, this.Zo, i, this.ZH, this.Ze, paramWriter, this.Zv); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return new Zo(paramZv9, this.Zo, i, this.ZH, this.Ze, paramWriter, this.ZP);
  }
  
  protected Zo ZN(OutputStream paramOutputStream, Zv9 paramZv9) throws IOException {
    throw new IllegalStateException();
  }
  
  protected Writer Zz(OutputStream paramOutputStream, Zma paramZma, Zv9 paramZv9) throws IOException {
    try {
      if (paramZma == Zma.UTF8)
        return new Zg(paramOutputStream); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return new OutputStreamWriter(paramOutputStream, paramZma.Zz());
  }
  
  protected Reader Zl(InputStream paramInputStream, Zma paramZma, Zv9 paramZv9) throws IOException {
    if (paramZma == null)
      paramZma = Zma.UTF8; 
    try {
      if (paramZma == Zma.UTF8) {
        try {
          if (!paramZv9.Z_()) {
            try {
              if (ZN(Zm.AUTO_CLOSE_SOURCE));
            } catch (IOException iOException) {
              throw a(null);
            } 
            boolean bool = false;
            return new Zd(paramInputStream, bool);
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } else {
        return new InputStreamReader(paramInputStream, paramZma.Zz());
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected Reader Zk(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, Zma paramZma, Zv9 paramZv9) throws IOException {
    if (paramZma == null)
      paramZma = Zma.UTF8; 
    try {
      if (paramZma != null)
        try {
          if (paramZma != Zma.UTF8) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte, paramInt1, paramInt2);
            return new InputStreamReader(byteArrayInputStream, paramZma.Zz());
          } 
          return new Zd(paramArrayOfbyte, paramInt1, paramInt2, true);
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return new Zd(paramArrayOfbyte, paramInt1, paramInt2, true);
  }
  
  static {
    // Byte code:
    //   0: bipush #80
    //   2: ldc 'MXN'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zv/Zf.d : Ljava/lang/String;
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
    //   80: bipush #68
    //   82: goto -> 112
    //   85: bipush #110
    //   87: goto -> 112
    //   90: bipush #69
    //   92: goto -> 112
    //   95: bipush #82
    //   97: goto -> 112
    //   100: bipush #24
    //   102: goto -> 112
    //   105: bipush #71
    //   107: goto -> 112
    //   110: bipush #64
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
    //   154: invokestatic Zi : ()I
    //   157: putstatic com/fasterxml/Zv/Zf.ZW : I
    //   160: invokestatic ZX : ()I
    //   163: putstatic com/fasterxml/Zv/Zf.Zx : I
    //   166: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zv\Zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */