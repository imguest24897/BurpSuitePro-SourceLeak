package net.portswigger.devtools.protocol.types.console;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.console.ConsoleMessage")
public class ConsoleMessage {
  @Zvd(Zp = "source")
  public final ConsoleMessageSource source;
  
  @Zvd(Zp = "level")
  public final ConsoleMessageLevel level;
  
  @Zvd(Zp = "text")
  public final String text;
  
  @Zvd(Zp = "url")
  @Zj
  public final String url;
  
  @Zvd(Zp = "line")
  @Zj
  public final Integer line;
  
  @Zvd(Zp = "column")
  @Zj
  public final Integer column;
  
  @Zox
  public ConsoleMessage(@Zc5(Ze = "source") ConsoleMessageSource paramConsoleMessageSource, @Zc5(Ze = "level") ConsoleMessageLevel paramConsoleMessageLevel, @Zc5(Ze = "text") String paramString1, @Zc5(Ze = "url", ZS = "null") String paramString2, @Zc5(Ze = "line", ZS = "null") Integer paramInteger1, @Zc5(Ze = "column", ZS = "null") Integer paramInteger2) {
    this.source = paramConsoleMessageSource;
    this.level = paramConsoleMessageLevel;
    String[] arrayOfString = ConsoleMessageSource.ZW();
    this.text = paramString1;
    this.url = paramString2;
    this.line = paramInteger1;
    this.column = paramInteger2;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\console\ConsoleMessage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */