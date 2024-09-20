package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.events.page.FileChooserOpened")
public class FileChooserOpened implements Zl {
  @Zvd(Zp = "frameId")
  @Zy
  public final String frameId;
  
  @Zvd(Zp = "mode")
  public final FileChooserOpenedMode mode;
  
  @Zvd(Zp = "backendNodeId")
  @Zy
  @Zj
  public final Integer backendNodeId;
  
  @Zox
  public FileChooserOpened(@Zc5(Ze = "frameId") String paramString, @Zc5(Ze = "mode") FileChooserOpenedMode paramFileChooserOpenedMode, @Zc5(Ze = "backendNodeId", ZS = "null") Integer paramInteger) {
    this.frameId = paramString;
    this.mode = paramFileChooserOpenedMode;
    this.backendNodeId = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\FileChooserOpened.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */