package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.websocket.BinaryMessageAction;
import burp.api.montoya.websocket.Direction;
import burp.api.montoya.websocket.MessageAction;
import burp.api.montoya.websocket.MessageHandler;
import burp.api.montoya.websocket.TextMessageAction;
import java.util.List;
import net.portswigger.Zkb;

final class Ztf2 extends Record {
  private final Zskl Zu;
  
  private final List<MessageHandler> ZR;
  
  private Ztf2(Zskl paramZskl, List<MessageHandler> paramList) {
    this.Zu = paramZskl;
    this.ZR = paramList;
  }
  
  Zl36 ZL(Zl36 paramZl36, Direction paramDirection) {
    String str = Zrvt.ZJ();
    switch (Zlqh.ZZ[paramZl36.ZY().ordinal()]) {
      case 1:
        for (MessageHandler messageHandler : this.ZR) {
          String str1 = Zkb.ZG(paramZl36.ZH());
          TextMessageAction textMessageAction = messageHandler.handleTextMessage(new Zg3c(str1, paramDirection));
          if (textMessageAction.action() == MessageAction.DROP)
            return null; 
          paramZl36 = paramZl36.ZV(textMessageAction.payload().getBytes());
          if (str == null)
            break; 
        } 
        return paramZl36;
      case 2:
        for (MessageHandler messageHandler : this.ZR) {
          ByteArray byteArray = this.Zu.ZI(paramZl36.ZH());
          BinaryMessageAction binaryMessageAction = messageHandler.handleBinaryMessage(new Zgq3(byteArray, paramDirection));
          if (binaryMessageAction.action() == MessageAction.DROP)
            return null; 
          paramZl36 = paramZl36.ZV(binaryMessageAction.payload().getBytes());
          if (str == null)
            break; 
        } 
        return paramZl36;
    } 
    return paramZl36;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztf2;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztf2;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztf2;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztf2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */