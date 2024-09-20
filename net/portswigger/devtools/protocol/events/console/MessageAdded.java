package net.portswigger.devtools.protocol.events.console;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.console.ConsoleMessage;

@Zsi("net.portswigger.devtools.protocol.events.console.MessageAdded")
public class MessageAdded implements Zl {
  @Zvd(Zp = "message")
  public final ConsoleMessage message;
  
  private static String[] Zk;
  
  @Zox
  public MessageAdded(@Zc5(Ze = "message") ConsoleMessage paramConsoleMessage) {
    this.message = paramConsoleMessage;
    String[] arrayOfString = Zx();
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public static void Zb(String[] paramArrayOfString) {
    Zk = paramArrayOfString;
  }
  
  public static String[] Zx() {
    return Zk;
  }
  
  static {
    if (Zx() != null)
      Zb(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\console\MessageAdded.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */