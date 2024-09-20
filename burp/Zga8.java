package burp;

import java.io.File;

public class Zga8 {
  private final Zge8 ZG;
  
  private final File ZM;
  
  private final File Zc;
  
  Zga8(File paramFile1, File paramFile2, Zge8 paramZge8) {
    this.Zc = paramFile1;
    this.ZM = paramFile2;
    this.ZG = paramZge8;
    if (!paramFile2.exists())
      Zxeh.ZV(paramFile2, paramZge8); 
  }
  
  public File ZR() {
    return this.Zc;
  }
  
  public File Zk() {
    return this.ZM;
  }
  
  public String Zz() {
    return this.ZG.Zo;
  }
  
  public String ZN() {
    return this.ZG.Zt;
  }
  
  public String Zc() {
    return this.ZG.ZT;
  }
  
  public boolean ZO() {
    return (this.ZG.Zh == this.Zc.length() && this.Zc.length() > 0L);
  }
  
  public void Zf() {
    this.ZM.delete();
    this.Zc.delete();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zga8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */