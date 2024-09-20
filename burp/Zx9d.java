package burp;

import java.nio.ByteBuffer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zx9d extends Zxsr implements Zsqo {
  private final int ZZ;
  
  private final ByteBuffer ZB;
  
  private final int Zx;
  
  Zx9d(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.ZZ = paramInt;
    this.ZB = paramZso4.ZR();
    this.Zx = this.ZB.position();
  }
  
  public Zeu4<Zsqo> ZF() {
    return Zsqo.ZR;
  }
  
  public int Zpu() {
    return this.ZZ;
  }
  
  public boolean[] ZK4() {
    boolean[] arrayOfBoolean = new boolean[this.ZZ];
    byte b = 0;
    int i = Zy8.Zsf();
    while (b < this.ZZ) {
      arrayOfBoolean[b] = ZV(b);
      b++;
      if (i == 0)
        break; 
    } 
    return arrayOfBoolean;
  }
  
  public Zsqo ZU(boolean[] paramArrayOfboolean) {
    int i = Zy8.Zsf();
    try {
      if (paramArrayOfboolean.length != this.ZZ)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b = 0;
    while (b < this.ZZ) {
      ZC(b, paramArrayOfboolean[b]);
      b++;
      if (i == 0)
        break; 
    } 
    return this;
  }
  
  public boolean ZV(int paramInt) {
    int i = Zy8.Zsb();
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZZ) {
            int j = paramInt / 8;
            int k = paramInt % 8;
            byte b = this.ZB.get(this.Zx + j);
            int m = 1 << k;
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (Zbqc.Zwu() == null)
                Zy8.ZN(++i); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return ((b & m) == m);
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
  
  public void ZC(int paramInt, boolean paramBoolean) {
    int i = Zy8.Zsf();
    try {
      if (paramInt >= 0) {
        try {
          if (paramInt >= this.ZZ)
            throw new ArrayIndexOutOfBoundsException(); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        throw new ArrayIndexOutOfBoundsException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int j = paramInt / 8;
    int k = paramInt % 8;
    byte b = this.ZB.get(this.Zx + j);
    int m = 1 << k;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = ((b & m) == m);
    try {
      if (bool == paramBoolean)
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramBoolean)
        try {
          this.ZB.put(this.Zx + j, (byte)(b | m));
          if (i == 0) {
            Zbqc.Zr(new Zbqc[3]);
          } else {
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZB.put(this.Zx + j, (byte)(b & (m ^ 0xFFFFFFFF)));
  }
  
  public void Zq(Zsqo paramZsqo) {
    try {
      if (paramZsqo.Zpu() < Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZsqo instanceof Zx9d)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx9d zx9d = (Zx9d)paramZsqo;
    try {
      if (this.Za != zx9d.ZPz()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    zx9d.ZB.duplicate().put(this.ZB.duplicate());
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZV(this);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx9d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */