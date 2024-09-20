package burp;

import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkaj implements Zk1e {
  public final String Zy;
  
  private final Zeu1 Zx;
  
  private final Zk1e ZE;
  
  private final Zskh ZF;
  
  public Zkaj(Zeu1 paramZeu1, Zk1e paramZk1e, Zskh paramZskh) {
    this.Zx = paramZeu1;
    this.ZE = paramZk1e;
    this.ZF = paramZskh;
    this.Zy = paramZk1e.Zi();
  }
  
  public byte[] Zl(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    try {
    
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zuh.Zb(!SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    byte[] arrayOfByte = paramArrayOfbyte1;
    try {
      arrayOfByte = this.ZE.Zl(paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.Zx.ZN(throwable, this.ZF);
    } 
    try {
    
    } catch (Throwable throwable) {
      throw a(null);
    } 
    return (arrayOfByte == null) ? Zm41.ZI : arrayOfByte;
  }
  
  public String Zi() {
    return this.Zy;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkaj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */