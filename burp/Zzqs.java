package burp;

import net.portswigger.Zkb;

public class Zzqs extends Zzqx {
  String Zc;
  
  public Zzqs(String paramString) {
    this.Zc = paramString;
  }
  
  public boolean Zi() {
    return true;
  }
  
  public String ZG() {
    return this.Zc;
  }
  
  public boolean ZF() {
    return true;
  }
  
  public byte[] Za() {
    return Zkb.Zy(this.Zc);
  }
  
  public String toString() {
    return "\"" + this.Zc + "\"";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzqs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */