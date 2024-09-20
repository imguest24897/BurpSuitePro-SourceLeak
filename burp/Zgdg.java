package burp;

import burp.api.montoya.intruder.PayloadData;
import burp.api.montoya.intruder.PayloadProcessingResult;
import burp.api.montoya.intruder.PayloadProcessor;

public class Zgdg implements PayloadProcessor {
  private final String ZH;
  
  private final IIntruderPayloadProcessor ZU;
  
  private final Zzqf ZW;
  
  public Zgdg(Zeu1 paramZeu1, IIntruderPayloadProcessor paramIIntruderPayloadProcessor, Zzqf paramZzqf) {
    this.ZU = paramIIntruderPayloadProcessor;
    this.ZW = paramZzqf;
    this.ZH = (paramIIntruderPayloadProcessor.getProcessorName() == null) ? paramZeu1.ZN() : paramIIntruderPayloadProcessor.getProcessorName();
  }
  
  public String displayName() {
    return this.ZH;
  }
  
  public PayloadProcessingResult processPayload(PayloadData paramPayloadData) {
    byte[] arrayOfByte = this.ZU.processPayload(paramPayloadData.currentPayload().getBytes(), paramPayloadData.originalPayload().getBytes(), paramPayloadData.insertionPoint().baseValue().getBytes());
    return new Zm09(this, arrayOfByte);
  }
  
  public boolean equals(Object paramObject) {
    String[] arrayOfString = Zlel.Zs();
    if (paramObject instanceof Zgdg) {
      Zgdg zgdg = (Zgdg)paramObject;
      if (arrayOfString != null)
        return (zgdg.ZU == this.ZU); 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgdg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */