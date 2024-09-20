package burp;

import burp.api.montoya.proxy.MessageToBeSentAction;
import burp.api.montoya.proxy.websocket.TextMessageToBeSentAction;

public class Zxa5 implements TextMessageToBeSentAction {
  private final MessageToBeSentAction Zs;
  
  private final String Zt;
  
  private Zxa5(MessageToBeSentAction paramMessageToBeSentAction, String paramString) {
    this.Zs = paramMessageToBeSentAction;
    this.Zt = paramString;
  }
  
  public MessageToBeSentAction action() {
    return this.Zs;
  }
  
  public String payload() {
    return this.Zt;
  }
  
  static TextMessageToBeSentAction Zu(String paramString) {
    return new Zxa5(MessageToBeSentAction.CONTINUE, paramString);
  }
  
  static TextMessageToBeSentAction Zr() {
    return new Zxa5(MessageToBeSentAction.DROP, null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxa5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */