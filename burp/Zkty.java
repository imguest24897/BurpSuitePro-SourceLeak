package burp;

import java.io.IOException;

public class Zkty extends Zkte {
  private final Zkj8 ZS;
  
  public Zkty(Zr_4 paramZr_4, Zkj8 paramZkj8) {
    super(paramZr_4, paramZkj8);
    this.ZS = paramZkj8;
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.ZS.ZS(paramZs4f);
  }
  
  public void Zy4() {
    this.ZS.Zy4();
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    return new byte[][] { {}, {}, {} };
  }
  
  public byte[][] ZK(Zzlx paramZzlx, byte[] paramArrayOfbyte, byte[][][] paramArrayOfbyte1) {
    boolean bool = Zg_t.ZC();
    byte[][] arrayOfByte = paramArrayOfbyte1[this.ZS.Zhd() - 1];
    if (Zbqc.Zwu() == null)
      Zg_t.Zs(!bool); 
    return this.ZS.Zyn().Zm(new Zr1f(paramZzlx), paramArrayOfbyte, arrayOfByte[0]);
  }
  
  public boolean Zgx() {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkty.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */