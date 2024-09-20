package burp;

import java.nio.LongBuffer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx2w extends Zxsr implements Zb0w {
  private final int ZV;
  
  private final LongBuffer Zw;
  
  Zx2w(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.ZV = paramInt;
    this.Zw = paramZso4.Z_();
  }
  
  public int Zpu() {
    return this.ZV;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZT(this);
  }
  
  public void ZB(Zb0w paramZb0w) {
    try {
      if (paramZb0w.Zpu() < Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZb0w instanceof Zx2w)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx2w zx2w = (Zx2w)paramZb0w;
    try {
      if (this.Za != zx2w.ZPz()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    zx2w.Zw.duplicate().put(this.Zw.duplicate());
  }
  
  public Zlva Zuk(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZV) {
            int i = paramInt * 3;
            return new Zlva(this.Zw.get(i), this.Zw.get(i + 1), this.Zw.get(i + 2));
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
  
  public void ZD(int paramInt, Zlva paramZlva) {
    int i = Zlva.Zw();
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZV) {
            int j = paramInt * 3;
            try {
              this.Zw.put(j, paramZlva.ZS());
              this.Zw.put(j + 1, paramZlva.Za());
              this.Zw.put(j + 2, paramZlva.Zx());
              if (i != 0)
                Zbqc.Zr(new Zbqc[3]); 
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
  
  public Zeu4<Zb0w> ZF() {
    return Ze;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx2w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */