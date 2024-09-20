package burp;

import java.nio.ByteBuffer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx28 extends Zxsr implements Zs62 {
  private final int Zf;
  
  private final ByteBuffer Zw;
  
  Zx28(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.Zf = paramInt;
    this.Zw = paramZso4.ZR();
  }
  
  public int Zpu() {
    return this.Zf;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZD(this);
  }
  
  public void ZA(Zs62 paramZs62) {
    try {
      if (paramZs62.Zpu() < Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZs62 instanceof Zx28)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx28 zx28 = (Zx28)paramZs62;
    try {
      if (this.Za != zx28.ZPz()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    zx28.Zw.duplicate().put(this.Zw.duplicate());
  }
  
  public Zs3e ZbE(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zf)
            return Zs3e.Zr(this.Zw, paramInt); 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void Zm(int paramInt, Zs3e paramZs3e) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zf) {
            paramZs3e.ZV(this.Zw, paramInt);
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
  
  public Zeu4<Zs62> ZF() {
    return Zh;
  }
  
  private void lambda$copyFromRawArray$2(Zs3e[] paramArrayOfZs3e, int paramInt) {
    paramArrayOfZs3e[paramInt].ZV(this.Zw, paramInt);
  }
  
  private static Zs3e[] lambda$copyToRawArray$1(int paramInt) {
    return new Zs3e[paramInt];
  }
  
  private Zs3e lambda$copyToRawArray$0(int paramInt) {
    return Zs3e.Zr(this.Zw, paramInt);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx28.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */