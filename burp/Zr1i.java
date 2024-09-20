package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zr1i {
  private final byte[] Zu;
  
  private int ZF = -1;
  
  private int ZM = -1;
  
  public Zr1i(byte... paramVarArgs) {
    this.Zu = paramVarArgs;
  }
  
  public boolean Zk(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    String str = Zs2k.ZL();
    Zuh.Zb((this.ZF == -1 && this.ZM == -1), Zqf.Zs);
    byte b1 = 0;
    byte b2 = 0;
    while (b2 < paramArrayOfbyte1.length) {
      byte b = paramArrayOfbyte1[b2];
      if (paramArrayOfbyte2[b1] == b) {
        if (!b1)
          this.ZF = b2; 
        if (++b1 == paramArrayOfbyte2.length) {
          this.ZM = b2;
          return true;
        } 
      } else if (b1 <= 0 || !Zt(b)) {
        b1 = 0;
        this.ZF = -2;
      } 
      b2++;
      if (str == null) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
    this.ZF = this.ZM = -2;
    return false;
  }
  
  private boolean Zt(byte paramByte) {
    byte[] arrayOfByte = this.Zu;
    int i = arrayOfByte.length;
    byte b = 0;
    String str = Zs2k.ZL();
    while (b < i) {
      byte b1 = arrayOfByte[b];
      if (paramByte == b1)
        return true; 
      b++;
      if (str == null)
        break; 
    } 
    return false;
  }
  
  public int ZB() {
    Zuh.Zb((this.ZF >= 0), Zqf.Zr);
    return this.ZF;
  }
  
  public int Zk() {
    Zuh.Zb((this.ZM >= 0), Zqf.Zr);
    return this.ZM;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr1i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */