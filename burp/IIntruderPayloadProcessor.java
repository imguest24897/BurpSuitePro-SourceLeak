package burp;

public interface IIntruderPayloadProcessor {
  String getProcessorName();
  
  byte[] processPayload(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IIntruderPayloadProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */