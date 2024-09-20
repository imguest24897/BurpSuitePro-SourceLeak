package burp;

import java.nio.ByteBuffer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx2x extends Zxsr implements Zm5a {
  private final int ZH;
  
  private final ByteBuffer ZT;
  
  Zx2x(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.ZH = paramInt;
    this.ZT = paramZso4.ZR();
  }
  
  public int Zpu() {
    return this.ZH;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZX(this);
  }
  
  public void ZJ(Zm5a paramZm5a) {
    try {
      if (paramZm5a.Zpu() < Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZm5a instanceof Zx2x)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx2x zx2x = (Zx2x)paramZm5a;
    try {
      if (this.Za != zx2x.ZPz()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    zx2x.ZT.duplicate().put(this.ZT.duplicate());
  }
  
  public Zzwr Zgd(int paramInt) {
    Zbqc[] arrayOfZbqc = Zzwr.ZW();
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZH) {
            ByteBuffer byteBuffer = this.ZT.duplicate();
            int i = byteBuffer.position() + paramInt * 10;
            try {
              if (Zbqc.Zwu() == null)
                Zzwr.ZJ(new Zbqc[4]); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return new Zzwr(byteBuffer.getShort(i), byteBuffer.getLong(i + 2));
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
  
  public void ZP(int paramInt, Zzwr paramZzwr) {
    Zbqc[] arrayOfZbqc = Zzwr.ZW();
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZH) {
            ByteBuffer byteBuffer = this.ZT.duplicate();
            int i = byteBuffer.position() + paramInt * 10;
            try {
              byteBuffer.putShort(i, paramZzwr.Zw());
              byteBuffer.putLong(i + 2, paramZzwr.ZN());
              if (arrayOfZbqc != null)
                Zbqc.Zr(new Zbqc[1]); 
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
  
  public Zeu4<Zm5a> ZF() {
    return ZC;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx2x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */