package burp;

import java.nio.ByteBuffer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx2f extends Zxsr implements Zmn2 {
  private final int ZN;
  
  private final ByteBuffer Zr;
  
  Zx2f(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.ZN = paramInt;
    this.Zr = paramZso4.ZR();
  }
  
  public int Zpu() {
    return this.ZN;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.Zv(this);
  }
  
  public void Z_(Zmn2 paramZmn2) {
    try {
      if (paramZmn2.Zpu() < Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZmn2 instanceof Zx2f)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx2f zx2f = (Zx2f)paramZmn2;
    try {
      if (this.Za != zx2f.ZPz()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    zx2f.Zr.duplicate().put(this.Zr.duplicate());
  }
  
  public Zgl_ ZbN(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZN)
            return Zgl_.Zo(this.Zr, paramInt); 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void ZN(int paramInt, Zgl_ paramZgl_) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZN) {
            paramZgl_.ZA(this.Zr, paramInt);
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
  
  public Zeu4<Zmn2> ZF() {
    return ZD;
  }
  
  private void lambda$copyFromRawArray$2(Zgl_[] paramArrayOfZgl_, int paramInt) {
    paramArrayOfZgl_[paramInt].ZA(this.Zr, paramInt);
  }
  
  private static Zgl_[] lambda$copyToRawArray$1(int paramInt) {
    return new Zgl_[paramInt];
  }
  
  private Zgl_ lambda$copyToRawArray$0(int paramInt) {
    return Zgl_.Zo(this.Zr, paramInt);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx2f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */