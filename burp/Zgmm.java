package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zny;

public class Zgmm<T> {
  private static final Zlsr ZP = new Zlsr();
  
  private final short ZQ;
  
  private final String ZE;
  
  private final byte[] Zl;
  
  private final Zz48<String, T> ZU;
  
  public Zgmm(short paramShort, String paramString, byte[] paramArrayOfbyte, Zz48<String, T> paramZz48) {
    this.ZQ = paramShort;
    this.ZE = paramString;
    this.Zl = paramArrayOfbyte;
    this.ZU = paramZz48;
  }
  
  public short Zv() {
    return this.ZQ;
  }
  
  public Zmch Za() {
    return ZP.ZM(this.ZE);
  }
  
  public T ZM() {
    String str = Zny.ZL(this.Zl);
    try {
      return this.ZU.Ze(str);
    } catch (RuntimeException runtimeException) {
      Zah.Zl(runtimeException, Zk_.RETHROWN);
      throw new RuntimeException(str, runtimeException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgmm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */