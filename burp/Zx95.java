package burp;

import java.nio.ByteBuffer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx95 extends Zxsr implements Ztrj {
  private static final Long Zr = Long.valueOf(ByteBuffer.wrap(new byte[] { 0, 0, 0, 0, -1, -1, -1, -1 }).getLong());
  
  private final int Zv;
  
  private final ByteBuffer Zj;
  
  Zx95(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.Zv = paramInt;
    this.Zj = paramZso4.ZR();
  }
  
  public int Zpu() {
    return this.Zv;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.Zq(this);
  }
  
  public void ZM(Ztrj paramZtrj) {
    try {
      if (paramZtrj.Zpu() < Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZtrj instanceof Zx95)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx95 zx95 = (Zx95)paramZtrj;
    try {
      if (this.Za != zx95.ZPz()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    zx95.Zj.duplicate().put(this.Zj.duplicate());
  }
  
  public Zbq_ ZF(int paramInt) {
    boolean bool = Zbq_.ZY();
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zv) {
            ByteBuffer byteBuffer = this.Zj.duplicate();
            int i = byteBuffer.position() + paramInt * 12;
            try {
              if (Zbqc.Zwu() == null) {
                try {
                
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                Zbq_.ZE(!bool);
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return new Zbq_(byteBuffer.getInt(i), byteBuffer.getLong(i + 4));
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
  
  public void ZV(int paramInt, Zbq_ paramZbq_) {
    boolean bool = Zbq_.ZY();
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zv) {
            ByteBuffer byteBuffer = this.Zj.duplicate();
            int i = byteBuffer.position() + paramInt * 12;
            try {
              byteBuffer.putInt(i, paramZbq_.Zm());
              byteBuffer.putLong(i + 4, paramZbq_.ZB());
              if (!bool)
                Zbqc.Zr(new Zbqc[2]); 
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
  
  public Zeu4<Ztrj> ZF() {
    return ZS;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx95.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */