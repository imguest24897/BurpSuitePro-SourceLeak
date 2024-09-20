package burp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Zxqz extends Zxsr implements Zmrq {
  Zxqz(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zeu4<Zmrq> ZF() {
    return Zv;
  }
  
  public int Zpu() {
    return this.Za.Zx(this, Zk_o.Zx);
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZR(this);
  }
  
  public byte[] ZiD() {
    int i = Zpu();
    byte[] arrayOfByte = new byte[i];
    byte b = 0;
    int[] arrayOfInt = Zr3b.Zi();
    while (b < i) {
      arrayOfByte[b] = Zp(b);
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return arrayOfByte;
  }
  
  public String Zis() {
    return Zruv.Zl(this);
  }
  
  public Zstu Zt(byte[] paramArrayOfbyte) {
    int[] arrayOfInt = Zr3b.Zi();
    try {
      if (paramArrayOfbyte.length != Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b = 0;
    while (b < paramArrayOfbyte.length) {
      Zs(b, paramArrayOfbyte[b]);
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return this;
  }
  
  public byte Zp(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < Zpu()) {
            int i = ZSu();
            int j = paramInt / i;
            int k = paramInt % i;
            Zstu zstu = ZSD().get(j);
            return zstu.Zp(k);
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
  
  public void Zs(int paramInt, byte paramByte) {
    int[] arrayOfInt = Zr3b.Zi();
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < Zpu()) {
            int i = ZSu();
            int j = paramInt / i;
            int k = paramInt % i;
            Zstu zstu = ZSD().get(j);
            try {
              zstu.Zs(k, paramByte);
              if (arrayOfInt != null)
                Zbqc.Zr(new Zbqc[2]); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
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
    int[] arrayOfInt = Zr3b.Zi();
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt2 >= paramInt1)
            try {
              if (paramInt2 <= Zpu()) {
                byte[] arrayOfByte = new byte[i];
                byte b = 0;
                while (b < i) {
                  arrayOfByte[b] = Zp(paramInt1 + b);
                  b++;
                  if (arrayOfInt != null)
                    break; 
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
    int[] arrayOfInt = Zr3b.Zi();
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
                  if (arrayOfInt != null)
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
    Zmrq zmrq = paramZr_4.Zc(ZSu());
    zmrq.Zj(ZiD(), 0, Zpu());
    return zmrq;
  }
  
  public InputStream Zi1() {
    return new Zx6s(this);
  }
  
  public Zstu ZU(InputStream paramInputStream, int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public void Zj(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = Zpu();
    Zo(i + paramInt2);
    this.Za.ZM(this, Zk_o.Zx, i + paramInt2);
    byte b = 0;
    int[] arrayOfInt = Zr3b.Zi();
    while (b < paramInt2) {
      Zs(i + b, paramArrayOfbyte[paramInt1 + b]);
      b++;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private void Zo(int paramInt) {
    Zefg<Zstu> zefg = ZSD();
    int i = ZSu();
    int[] arrayOfInt = Zr3b.Zi();
    while (zefg.size() * i < paramInt) {
      Zstu zstu = this.Za.<Zstu>Zv(Zstu.Zc, i);
      zefg.add(zstu);
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private int ZSu() {
    return this.Za.Zx(this, Zk_o.ZN);
  }
  
  private Zefg<Zstu> ZSD() {
    return (Zefg<Zstu>)this.Za.ZJ(this, Zk_o.Zn);
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (super.equals(paramObject))
        return true; 
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
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxqz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */