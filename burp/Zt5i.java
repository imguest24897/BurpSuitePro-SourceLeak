package burp;

import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zt5i implements Zrkn {
  private final Zer0 Zb;
  
  private byte ZG = -1;
  
  public Zt5i(Zer0 paramZer0, List<Zer0> paramList) {
    String str = Zmit.ZH();
    this.Zb = paramZer0;
    for (Zer0 zer0 : paramList) {
      zer0.ZQ(this);
      if (str != null)
        break; 
    } 
  }
  
  public void ZJ(Zxyr paramZxyr) {
    if (this.ZG == -1)
      this.ZG = 0; 
  }
  
  public void ZK(Zxyt paramZxyt) {
    // Byte code:
    //   0: invokestatic ZH : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zb : Lburp/Zer0;
    //   8: invokeinterface ZA : ()Lburp/Zb25;
    //   13: getstatic burp/Zb25.DNS : Lburp/Zb25;
    //   16: if_acmpne -> 20
    //   19: return
    //   20: getstatic burp/Zke1.Zx : [I
    //   23: aload_1
    //   24: invokevirtual ZA : ()Lburp/Zb25;
    //   27: invokevirtual ordinal : ()I
    //   30: iaload
    //   31: lookupswitch default -> 68, 1 -> 56, 2 -> 64
    //   56: aload_0
    //   57: invokevirtual Zp : ()V
    //   60: aload_2
    //   61: ifnull -> 68
    //   64: aload_0
    //   65: invokevirtual Zo : ()V
    //   68: return
  }
  
  public void ZR(Zxyy paramZxyy) {}
  
  public byte ZE() {
    return this.ZG;
  }
  
  public Zvs ZG() {
    switch (this.ZG) {
      case 1:
      case 2:
      case 3:
        return Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP;
      default:
        Zuh.Zv(false, Zqf.Zk, this.ZG);
        break;
      case 0:
        break;
    } 
    return Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS;
  }
  
  private void Zp() {
    String str = Zmit.ZH();
    switch (this.ZG) {
      case 2:
        this.ZG = 3;
        if (str != null);
        return;
      case 3:
        if (str != null)
          break; 
        return;
    } 
    this.ZG = 1;
  }
  
  private void Zo() {
    String str = Zmit.ZH();
    switch (this.ZG) {
      case 1:
        this.ZG = 3;
        if (str != null);
        return;
      case 3:
        if (str != null)
          break; 
        return;
    } 
    this.ZG = 2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt5i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */