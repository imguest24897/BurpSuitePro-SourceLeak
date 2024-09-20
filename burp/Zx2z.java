package burp;

import java.nio.ShortBuffer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zx2z extends Zxsr implements Zghu {
  private final int Ze;
  
  private final ShortBuffer ZX;
  
  Zx2z(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.Ze = paramInt;
    this.ZX = paramZso4.ZA();
  }
  
  public Zeu4<Zghu> ZF() {
    return Zghu.Zw;
  }
  
  public int Zpu() {
    return this.Ze;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZE(this);
  }
  
  public short ZCO(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Ze)
            return this.ZX.get(paramInt); 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void ZU(int paramInt, short paramShort) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Ze) {
            this.ZX.put(paramInt, paramShort);
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
  
  public void Zm(Zghu paramZghu) {
    String str = Zys.ZDS();
    try {
      if (paramZghu.Zpu() < Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZghu instanceof Zx2z)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx2z zx2z = (Zx2z)paramZghu;
    try {
      if (this.Za != zx2z.ZPz()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      zx2z.ZX.duplicate().put(this.ZX.duplicate());
      if (str == null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx2z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */