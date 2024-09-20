package burp;

import net.portswigger.Zqf;
import net.portswigger.Zs1;
import net.portswigger.Zt5;
import net.portswigger.Zuh;
import net.portswigger.Zvh;

class Zkdg {
  private final Zs1 ZG;
  
  private final String ZO;
  
  private final Zxei ZK;
  
  Zkdg(Zs1 paramZs1, String paramString, Zxei paramZxei) {
    this.ZG = paramZs1;
    this.ZO = paramString;
    this.ZK = paramZxei;
  }
  
  boolean ZV(Zvh paramZvh) {
    if (this.ZG == null)
      return false; 
    switch (Zbxy.ZG[this.ZG.Za.ordinal()]) {
      case 1:
      
      case 2:
      case 3:
      
      case 4:
      case 5:
        return (paramZvh.ZE() && !paramZvh.ZM());
      case 6:
      case 7:
      
    } 
    Zuh.ZT(false, Zqf.Zk, this.ZG.Za.toString());
    return false;
  }
  
  boolean Zr() {
    return (this.ZG.Za == Zt5.PLAIN_JAR_FILE) ? (new Zzli(this.ZO, this.ZK)).ZU() : (new Zmoq(this.ZG, this.ZO)).ZC();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkdg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */