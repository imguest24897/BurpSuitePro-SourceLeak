package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.intruder.AttackConfiguration;
import burp.api.montoya.intruder.GeneratedPayload;
import burp.api.montoya.intruder.IntruderInsertionPoint;
import burp.api.montoya.intruder.PayloadGenerator;
import burp.api.montoya.intruder.PayloadGeneratorProvider;

public class Zrt7 implements PayloadGeneratorProvider {
  private final String ZR;
  
  private final IIntruderPayloadGeneratorFactory ZC;
  
  private final Zzqf Zh;
  
  public Zrt7(Zeu1 paramZeu1, IIntruderPayloadGeneratorFactory paramIIntruderPayloadGeneratorFactory, Zzqf paramZzqf) {
    this.ZC = paramIIntruderPayloadGeneratorFactory;
    this.Zh = paramZzqf;
    this.ZR = (paramIIntruderPayloadGeneratorFactory.getGeneratorName() == null) ? paramZeu1.ZN() : paramIIntruderPayloadGeneratorFactory.getGeneratorName();
  }
  
  public String displayName() {
    return this.ZR;
  }
  
  public PayloadGenerator providePayloadGenerator(AttackConfiguration paramAttackConfiguration) {
    return ZT(this.ZC.createNewInstance(ZY(paramAttackConfiguration)));
  }
  
  public boolean equals(Object paramObject) {
    String[] arrayOfString = Zlel.Zs();
    if (paramObject instanceof Zrt7) {
      Zrt7 zrt7 = (Zrt7)paramObject;
      if (arrayOfString != null)
        return (zrt7.ZC == this.ZC); 
    } 
    return false;
  }
  
  private PayloadGenerator ZT(IIntruderPayloadGenerator paramIIntruderPayloadGenerator) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> generatePayloadFor : (Lburp/Zrt7;Lburp/IIntruderPayloadGenerator;)Lburp/api/montoya/intruder/PayloadGenerator;
    //   7: areturn
  }
  
  private GeneratedPayload ZP(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> value : (Lburp/Zrt7;[B)Lburp/api/montoya/intruder/GeneratedPayload;
    //   7: areturn
  }
  
  private static IIntruderAttack ZY(AttackConfiguration paramAttackConfiguration) {
    return new Zm1a(paramAttackConfiguration);
  }
  
  private static IHttpService ZH(HttpService paramHttpService) {
    return new Zgas(paramHttpService);
  }
  
  private ByteArray lambda$payload$1(byte[] paramArrayOfbyte) {
    return this.Zh.ZI(paramArrayOfbyte);
  }
  
  private GeneratedPayload lambda$generator$0(IIntruderPayloadGenerator paramIIntruderPayloadGenerator, IntruderInsertionPoint paramIntruderInsertionPoint) {
    return paramIIntruderPayloadGenerator.hasMorePayloads() ? ZP(paramIIntruderPayloadGenerator.getNextPayload(paramIntruderInsertionPoint.baseValue().getBytes())) : null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrt7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */