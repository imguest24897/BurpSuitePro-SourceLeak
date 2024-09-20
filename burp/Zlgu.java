package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.proxy.MessageToBeSentAction;
import burp.api.montoya.proxy.websocket.BinaryMessageToBeSentAction;

public class Zlgu implements BinaryMessageToBeSentAction {
  private final MessageToBeSentAction ZT;
  
  private final ByteArray Zd;
  
  private Zlgu(MessageToBeSentAction paramMessageToBeSentAction, ByteArray paramByteArray) {
    this.ZT = paramMessageToBeSentAction;
    this.Zd = paramByteArray;
  }
  
  public MessageToBeSentAction action() {
    return this.ZT;
  }
  
  public ByteArray payload() {
    return this.Zd;
  }
  
  static BinaryMessageToBeSentAction ZL(ByteArray paramByteArray) {
    return new Zlgu(MessageToBeSentAction.CONTINUE, paramByteArray);
  }
  
  static BinaryMessageToBeSentAction ZD() {
    return new Zlgu(MessageToBeSentAction.DROP, null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlgu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */