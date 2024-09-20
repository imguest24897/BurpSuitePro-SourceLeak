package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.page.JavascriptDialogClosed")
public class JavascriptDialogClosed implements Zl {
  @Zvd(Zp = "result")
  public final Boolean result;
  
  @Zvd(Zp = "userInput")
  public final String userInput;
  
  @Zox
  public JavascriptDialogClosed(@Zc5(Ze = "result") Boolean paramBoolean, @Zc5(Ze = "userInput") String paramString) {
    this.result = paramBoolean;
    this.userInput = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\JavascriptDialogClosed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */