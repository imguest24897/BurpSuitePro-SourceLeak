package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.intruder.IntruderInsertionPoint;
import burp.api.montoya.intruder.PayloadProcessingAction;
import burp.api.montoya.intruder.PayloadProcessingResult;
import burp.api.montoya.intruder.PayloadProcessor;

public class Zeem implements Zk1e {
  private final PayloadProcessor ZI;
  
  private final Zskl Ze;
  
  public Zeem(PayloadProcessor paramPayloadProcessor, Zskl paramZskl) {
    this.ZI = paramPayloadProcessor;
    this.Ze = paramZskl;
  }
  
  public byte[] Zl(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    ByteArray byteArray1 = this.Ze.ZI(paramArrayOfbyte1);
    ByteArray byteArray2 = this.Ze.ZI(paramArrayOfbyte2);
    IntruderInsertionPoint intruderInsertionPoint = Zk(paramArrayOfbyte3);
    PayloadProcessingResult payloadProcessingResult = this.ZI.processPayload(new Zsjj(byteArray1, byteArray2, intruderInsertionPoint));
    return (payloadProcessingResult.action() == PayloadProcessingAction.SKIP_PAYLOAD) ? null : payloadProcessingResult.processedPayload().getBytes();
  }
  
  public String Zi() {
    return this.ZI.displayName();
  }
  
  private IntruderInsertionPoint Zk(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> baseValue : (Lburp/Zeem;[B)Lburp/api/montoya/intruder/IntruderInsertionPoint;
    //   7: areturn
  }
  
  private ByteArray lambda$insertionPoint$0(byte[] paramArrayOfbyte) {
    return this.Ze.ZI(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */