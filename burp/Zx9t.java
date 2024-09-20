package burp;

import java.nio.LongBuffer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx9t extends Zxsr implements Zg60 {
  private final int Ze;
  
  private final LongBuffer ZY;
  
  Zx9t(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.Ze = paramInt;
    this.ZY = paramZso4.Z_();
  }
  
  public int Zpu() {
    return this.Ze;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.Zi(this);
  }
  
  public void ZG(Zg60 paramZg60) {
    String[] arrayOfString = Zrh9.Zs();
    try {
      if (paramZg60.Zpu() < Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZg60 instanceof Zx9t)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx9t zx9t = (Zx9t)paramZg60;
    try {
      if (this.Za != zx9t.ZPz()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    LongBuffer longBuffer = zx9t.ZY;
    try {
      longBuffer.duplicate().put(this.ZY.duplicate());
      if (arrayOfString != null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public Zrh9 ZW(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Ze) {
            int i = paramInt * 2;
            return new Zrh9(this.ZY.get(i), this.ZY.get(i + 1));
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
  
  public void ZE(int paramInt, Zrh9 paramZrh9) {
    String[] arrayOfString = Zrh9.Zs();
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Ze) {
            int i = paramInt * 2;
            try {
              this.ZY.put(i, paramZrh9.ZC());
              this.ZY.put(i + 1, paramZrh9.ZS());
              if (Zbqc.Zwu() == null)
                Zrh9.ZS(new String[2]); 
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
  
  public Zeu4<Zg60> ZF() {
    return ZT;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx9t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */