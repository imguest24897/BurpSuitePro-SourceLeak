package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.proxy.MessageReceivedAction;
import burp.api.montoya.proxy.websocket.BinaryMessageReceivedAction;

public class Zsl7 implements BinaryMessageReceivedAction {
  private final MessageReceivedAction Zq;
  
  private final ByteArray ZY;
  
  private Zsl7(MessageReceivedAction paramMessageReceivedAction, ByteArray paramByteArray) {
    this.Zq = paramMessageReceivedAction;
    this.ZY = paramByteArray;
  }
  
  public MessageReceivedAction action() {
    return this.Zq;
  }
  
  public ByteArray payload() {
    return this.ZY;
  }
  
  static BinaryMessageReceivedAction Zr(ByteArray paramByteArray) {
    return new Zsl7(MessageReceivedAction.CONTINUE, paramByteArray);
  }
  
  static BinaryMessageReceivedAction ZZ(ByteArray paramByteArray) {
    return new Zsl7(MessageReceivedAction.DO_NOT_INTERCEPT, paramByteArray);
  }
  
  static BinaryMessageReceivedAction ZG(ByteArray paramByteArray) {
    return new Zsl7(MessageReceivedAction.INTERCEPT, paramByteArray);
  }
  
  static BinaryMessageReceivedAction Zo() {
    return new Zsl7(MessageReceivedAction.DROP, null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsl7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */