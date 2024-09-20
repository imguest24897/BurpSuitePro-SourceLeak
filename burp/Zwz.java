package burp;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import net.portswigger.Zmw;

public class Zwz extends Zni implements Zmrq {
  private final Zsh5 ZI;
  
  Zwz(int paramInt) {
    this.ZI = new Zsh5(paramInt);
  }
  
  public byte[] ZiD() {
    return this.ZI.toByteArray();
  }
  
  public String Zis() {
    return Zruv.Zl(this);
  }
  
  public Zstu Zt(byte[] paramArrayOfbyte) {
    this.ZI.ZH(paramArrayOfbyte);
    return this;
  }
  
  public byte Zp(int paramInt) {
    return this.ZI.ZV(paramInt);
  }
  
  public void Zs(int paramInt, byte paramByte) {
    this.ZI.Zw(paramInt, paramByte);
  }
  
  public Zstu Zb(int paramInt1, int paramInt2) {
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt2 >= paramInt1)
            try {
              if (paramInt2 <= this.ZI.size())
                return Zyf.Zy(Zmw.Zz(this.ZI.toByteArray(), paramInt1, paramInt2)); 
              throw new ArrayIndexOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
              throw a(null);
            }  
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
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
                this.ZI.Zc(paramOutputStream, paramInt1, paramInt2);
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
    return paramZr_4.ZZ(ZiD());
  }
  
  public int Zpu() {
    return this.ZI.size();
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZR(this);
  }
  
  public Zeu4<Zmrq> ZF() {
    return Zv;
  }
  
  public InputStream Zi1() {
    return new ByteArrayInputStream(this.ZI.toByteArray());
  }
  
  public Zstu ZU(InputStream paramInputStream, int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public void Zj(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.ZI.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (ZF(paramObject))
        return true; 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    if (paramObject instanceof Zwz) {
      Zwz zwz = (Zwz)paramObject;
      return Arrays.equals(this.ZI.toByteArray(), zwz.ZI.toByteArray());
    } 
    try {
      if (paramObject instanceof Zstu)
        return Zxrp.Zk(this, (Zstu)paramObject); 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    return false;
  }
  
  public void Zo(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    this.ZI.Zl(paramInt1, paramArrayOfbyte, paramInt2);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */