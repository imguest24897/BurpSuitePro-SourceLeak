package burp;

import java.nio.ByteBuffer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx2j extends Zxsr implements Zmxo {
  private final int Zv;
  
  private final ByteBuffer Zg;
  
  Zx2j(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.Zv = paramInt;
    this.Zg = paramZso4.ZR();
  }
  
  public int Zpu() {
    return this.Zv;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZO(this);
  }
  
  public void Zr(Zmxo paramZmxo) {
    try {
      if (paramZmxo.Zpu() < Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZmxo instanceof Zx2j)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx2j zx2j = (Zx2j)paramZmxo;
    try {
      if (this.Za != zx2j.ZPz()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    zx2j.Zg.duplicate().put(this.Zg.duplicate());
  }
  
  public Zgn1 ZsV(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zv)
            return Zgn1.Zk(this.Zg, paramInt); 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void ZN(int paramInt, Zgn1 paramZgn1) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zv) {
            paramZgn1.ZD(this.Zg, paramInt);
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
  
  public Zeu4<Zmxo> ZF() {
    return ZK;
  }
  
  private void lambda$copyFromRawArray$2(Zgn1[] paramArrayOfZgn1, int paramInt) {
    paramArrayOfZgn1[paramInt].ZD(this.Zg, paramInt);
  }
  
  private static Zgn1[] lambda$copyToRawArray$1(int paramInt) {
    return new Zgn1[paramInt];
  }
  
  private Zgn1 lambda$copyToRawArray$0(int paramInt) {
    return Zgn1.Zk(this.Zg, paramInt);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx2j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */