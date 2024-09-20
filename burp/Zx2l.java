package burp;

import java.nio.LongBuffer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zx2l extends Zxsr implements Zrap {
  private final int Zx;
  
  private final LongBuffer ZE;
  
  Zx2l(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.Zx = paramInt;
    this.ZE = paramZso4.Z_();
  }
  
  public int Zpu() {
    return this.Zx;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZO(this);
  }
  
  public long ZEn(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zx)
            return this.ZE.get(paramInt); 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void Zo(int paramInt, long paramLong) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zx) {
            this.ZE.put(paramInt, paramLong);
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
  
  public void Za(Zrap paramZrap) {
    boolean bool = Zy4.ZHP();
    try {
      if (paramZrap.Zpu() < Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZrap instanceof Zx2l)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx2l zx2l = (Zx2l)paramZrap;
    try {
      if (this.Za != zx2l.ZPz()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      zx2l.ZE.duplicate().put(this.ZE.duplicate());
      if (!bool)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public Zeu4<Zrap> ZF() {
    return Zrap.ZU;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx2l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */