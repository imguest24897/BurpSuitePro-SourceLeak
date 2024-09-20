package burp;

import java.util.HashMap;
import java.util.Map;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zrc5 {
  private final Map<Object, Zg7i> ZB;
  
  private Zg7i Ze;
  
  private final Zs9m ZG;
  
  private final Zt5f ZF;
  
  Zrc5(Zxz1 paramZxz1, Zbnt paramZbnt, Zkl6 paramZkl6) {
    this.ZG = new Zs9m(paramZxz1, paramZbnt, paramZkl6);
    this.ZF = new Zt5f(paramZxz1, this.ZG, paramZbnt, paramZkl6);
    this.ZB = new HashMap<>();
  }
  
  byte ZI(byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, Zlit paramZlit, Zs68 paramZs68, Zstu paramZstu) {
    try {
      if (paramZs68.Zb == 404)
        return 2; 
      Zg7i zg7i = null;
      switch (paramByte) {
        case 0:
          synchronized (this.ZB) {
            String str = (paramArrayOfbyte3 == null) ? "" : Zkb.ZG(paramArrayOfbyte3);
            zg7i = this.ZB.get(str);
            if (zg7i == null) {
              zg7i = this.ZG.Zm(paramZlit.Zdz(), ZX(paramByte, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3), new Zs6y[0]);
              try {
                if (zg7i != null)
                  this.ZB.put(str, zg7i); 
              } catch (Exception exception) {
                throw a(null);
              } 
            } 
          } 
          break;
        case 1:
          try {
            if (this.Ze == null)
              this.Ze = this.ZG.Zm(paramZlit.Zdz(), ZX(paramByte, paramArrayOfbyte1, paramArrayOfbyte2, null), new Zs6y[0]); 
          } catch (Exception exception) {
            throw a(null);
          } 
          zg7i = this.Ze;
          break;
        default:
          Zuh.Zv(false, Zqf.Zk, paramByte);
          break;
      } 
      return (zg7i == null) ? 3 : this.ZF.Zp(paramZlit, paramZstu, paramZs68, zg7i);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return 1;
    } 
  }
  
  private byte[][] ZX(byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    return new byte[][] { ZZ(paramByte, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, 6), ZZ(paramByte, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, 9), ZZ(paramByte, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, 12) };
  }
  
  private byte[] ZZ(byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt) {
    return Zlft.Zv(paramByte, paramArrayOfbyte1, paramArrayOfbyte2, Zkb.Zy(Zl26.ZY(paramInt)), paramArrayOfbyte3);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrc5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */