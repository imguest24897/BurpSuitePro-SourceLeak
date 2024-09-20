package burp;

public interface IIntruderPayloadGenerator {
  boolean hasMorePayloads();
  
  byte[] getNextPayload(byte[] paramArrayOfbyte);
  
  void reset();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IIntruderPayloadGenerator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */