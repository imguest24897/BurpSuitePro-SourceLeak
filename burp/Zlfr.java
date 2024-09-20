package burp;

import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

abstract class Zlfr implements Ztvb {
  protected byte Zd;
  
  protected byte[] ZD;
  
  private String Zh;
  
  protected boolean ZR = false;
  
  protected boolean Zg = false;
  
  Zlfr(byte paramByte, byte[] paramArrayOfbyte) {
    this.Zd = paramByte;
    this.ZD = paramArrayOfbyte;
    this.Zh = Zkb.ZG(paramArrayOfbyte);
  }
  
  public byte Zr() {
    return this.Zd;
  }
  
  public String Zv() {
    return this.Zh;
  }
  
  public boolean Zm() {
    return this.ZR;
  }
  
  public boolean ZR() {
    return this.Zg;
  }
  
  protected void Zn() {
    synchronized (this) {
      if (this.Zg)
        return; 
      this.Zg = true;
    } 
  }
  
  protected void Zw() {
    synchronized (this) {
      Zuh.Zb(this.Zg, Zqf.Zr);
      this.Zg = false;
    } 
  }
  
  public abstract void Zz(Zm82 paramZm82, Zzv5 paramZzv5);
  
  public boolean equals(Object paramObject) {
    return (this == paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlfr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */