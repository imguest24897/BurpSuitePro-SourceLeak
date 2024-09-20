package net.portswigger.devtools.protocol.events.page;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.page.DialogType;

@Zsi("net.portswigger.devtools.protocol.events.page.JavascriptDialogOpening")
public class JavascriptDialogOpening implements Zl {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "message")
  public final String message;
  
  @Zvd(Zp = "type")
  public final DialogType type;
  
  @Zvd(Zp = "hasBrowserHandler")
  public final Boolean hasBrowserHandler;
  
  @Zvd(Zp = "defaultPrompt")
  @Zj
  public final String defaultPrompt;
  
  @Zox
  public JavascriptDialogOpening(@Zc5(Ze = "url") String paramString1, @Zc5(Ze = "message") String paramString2, @Zc5(Ze = "type") DialogType paramDialogType, @Zc5(Ze = "hasBrowserHandler") Boolean paramBoolean, @Zc5(Ze = "defaultPrompt", ZS = "null") String paramString3) {
    this.url = paramString1;
    this.message = paramString2;
    Zbqc[] arrayOfZbqc = ScreencastFrame.Zu();
    this.type = paramDialogType;
    this.hasBrowserHandler = paramBoolean;
    this.defaultPrompt = paramString3;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\JavascriptDialogOpening.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */