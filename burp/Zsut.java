package burp;

import burp.api.montoya.intruder.AttackConfiguration;
import burp.api.montoya.intruder.HttpRequestTemplate;
import burp.api.montoya.intruder.PayloadGenerator;
import burp.api.montoya.intruder.PayloadGeneratorProvider;

public class Zsut implements Zeph {
  private final Zzqf Zq;
  
  private final PayloadGeneratorProvider ZV;
  
  public Zsut(PayloadGeneratorProvider paramPayloadGeneratorProvider, Zzqf paramZzqf) {
    this.Zq = paramZzqf;
    this.ZV = paramPayloadGeneratorProvider;
  }
  
  public PayloadGenerator Zn(IIntruderAttack paramIIntruderAttack) {
    AttackConfiguration attackConfiguration = ZE(paramIIntruderAttack);
    return this.ZV.providePayloadGenerator(attackConfiguration);
  }
  
  public String Zj() {
    return this.ZV.displayName();
  }
  
  private AttackConfiguration ZE(IIntruderAttack paramIIntruderAttack) {
    return new Zrlq(this, paramIIntruderAttack);
  }
  
  private HttpRequestTemplate Ze(byte[] paramArrayOfbyte) {
    return new Zm8k(this, paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsut.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */