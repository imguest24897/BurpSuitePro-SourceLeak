package burp;

import burp.api.montoya.proxy.MessageReceivedAction;
import burp.api.montoya.proxy.websocket.TextMessageReceivedAction;

public class Zk8j implements TextMessageReceivedAction {
  private final MessageReceivedAction ZG;
  
  private final String Zz;
  
  private Zk8j(MessageReceivedAction paramMessageReceivedAction, String paramString) {
    this.ZG = paramMessageReceivedAction;
    this.Zz = paramString;
  }
  
  public MessageReceivedAction action() {
    return this.ZG;
  }
  
  public String payload() {
    return this.Zz;
  }
  
  static TextMessageReceivedAction Zb(String paramString) {
    return new Zk8j(MessageReceivedAction.CONTINUE, paramString);
  }
  
  static TextMessageReceivedAction ZF(String paramString) {
    return new Zk8j(MessageReceivedAction.DO_NOT_INTERCEPT, paramString);
  }
  
  static TextMessageReceivedAction Zn(String paramString) {
    return new Zk8j(MessageReceivedAction.INTERCEPT, paramString);
  }
  
  static TextMessageReceivedAction Zl() {
    return new Zk8j(MessageReceivedAction.DROP, null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk8j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */