package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.intruder.PayloadProcessingAction;
import burp.api.montoya.intruder.PayloadProcessingResult;

class Zm09 implements PayloadProcessingResult {
  final byte[] Zk;
  
  final Zgdg Zw;
  
  Zm09(Zgdg paramZgdg, byte[] paramArrayOfbyte) {}
  
  public ByteArray processedPayload() {
    return this.Zw.ZW.ZI(this.Zk);
  }
  
  public PayloadProcessingAction action() {
    return (this.Zk == null) ? PayloadProcessingAction.SKIP_PAYLOAD : PayloadProcessingAction.USE_PAYLOAD;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm09.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */