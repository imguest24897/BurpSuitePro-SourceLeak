package burp;

import java.io.IOException;
import net.portswigger.Zkb;
import net.portswigger.Zmw;

public class Zktg extends Zkte {
  private final Zzcx Zr;
  
  public Zktg(Zr_4 paramZr_4, Zzcx paramZzcx) {
    super(paramZr_4, paramZzcx);
    this.Zr = paramZzcx;
  }
  
  public void Zy4() {
    this.Zr.Zy4();
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.Zr.ZS(paramZs4f);
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    String[] arrayOfString = Ze7r.Zj();
    if (this.Zr.Zk_() == null) {
      if (this.Zr.Zks() >= paramArrayOfbyte.length)
        return null; 
      this.Zr.ZvH(paramArrayOfbyte.length);
      if (arrayOfString != null) {
        if (this.Zr.Zks() >= this.Zr.Zk_().length())
          return null; 
        paramArrayOfbyte = Zkb.Zy(this.Zr.Zk_());
        byte[] arrayOfByte2 = Zmw.Zm(paramArrayOfbyte);
        arrayOfByte2[this.Zr.Zks()] = (byte)(arrayOfByte2[this.Zr.Zks()] + 1);
        this.Zr.ZP8(this.Zr.Zks() + 1);
        return this.Zr.Zyn().ZL(new Zr1f(paramZzlx), paramArrayOfbyte, new byte[][] { arrayOfByte2, null, null });
      } 
      byte[] arrayOfByte1 = Zmw.Zm(paramArrayOfbyte);
      arrayOfByte1[this.Zr.Zks()] = (byte)(arrayOfByte1[this.Zr.Zks()] + 1);
      this.Zr.ZP8(this.Zr.Zks() + 1);
      return this.Zr.Zyn().ZL(new Zr1f(paramZzlx), paramArrayOfbyte, new byte[][] { arrayOfByte1, null, null });
    } 
    if (this.Zr.Zks() >= this.Zr.Zk_().length())
      return null; 
    paramArrayOfbyte = Zkb.Zy(this.Zr.Zk_());
    byte[] arrayOfByte = Zmw.Zm(paramArrayOfbyte);
    arrayOfByte[this.Zr.Zks()] = (byte)(arrayOfByte[this.Zr.Zks()] + 1);
    this.Zr.ZP8(this.Zr.Zks() + 1);
    return this.Zr.Zyn().ZL(new Zr1f(paramZzlx), paramArrayOfbyte, new byte[][] { arrayOfByte, null, null });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zktg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */