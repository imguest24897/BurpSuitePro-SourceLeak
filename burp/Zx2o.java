package burp;

import java.nio.ByteBuffer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx2o extends Zxsr implements Zzxh {
  private final int Zk;
  
  private final ByteBuffer Zy;
  
  Zx2o(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.Zk = paramInt;
    this.Zy = paramZso4.ZR();
  }
  
  public int Zpu() {
    return this.Zk;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZK(this);
  }
  
  public void Zh(Zzxh paramZzxh) {
    try {
      if (paramZzxh.Zpu() < Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZzxh instanceof Zx2o)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx2o zx2o = (Zx2o)paramZzxh;
    try {
      if (this.Za != zx2o.ZPz()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    zx2o.Zy.duplicate().put(this.Zy.duplicate());
  }
  
  public Ztp0 ZlT(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zk)
            return Ztp0.ZX(this.Zy, paramInt); 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void Zh(int paramInt, Ztp0 paramZtp0) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zk) {
            paramZtp0.ZE(this.Zy, paramInt);
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
  
  public Zeu4<Zzxh> ZF() {
    return ZA;
  }
  
  private void lambda$copyFromRawArray$2(Ztp0[] paramArrayOfZtp0, int paramInt) {
    paramArrayOfZtp0[paramInt].ZE(this.Zy, paramInt);
  }
  
  private static Ztp0[] lambda$copyToRawArray$1(int paramInt) {
    return new Ztp0[paramInt];
  }
  
  private Ztp0 lambda$copyToRawArray$0(int paramInt) {
    return Ztp0.ZX(this.Zy, paramInt);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx2o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */