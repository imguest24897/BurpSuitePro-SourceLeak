package burp;

import net.portswigger.Zkb;

public class Zbsp {
  byte[] Zc;
  
  byte ZM;
  
  byte[] Zw;
  
  byte[] ZN = null;
  
  boolean ZV = true;
  
  public Zbsp(byte paramByte) {
    this.ZM = paramByte;
  }
  
  public Zbsp Zq(String paramString) {
    this.Zw = Zkb.Zy(paramString);
    return this;
  }
  
  public Zbsp Zl(String paramString) {
    this.ZN = Zkb.Zy(paramString);
    return this;
  }
  
  public Zbsp ZE(byte[] paramArrayOfbyte) {
    this.Zc = paramArrayOfbyte;
    return this;
  }
  
  public Zbsp Zg(boolean paramBoolean) {
    this.ZV = paramBoolean;
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbsp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */