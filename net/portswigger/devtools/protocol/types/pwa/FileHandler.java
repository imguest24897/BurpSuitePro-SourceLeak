package net.portswigger.devtools.protocol.types.pwa;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.pwa.FileHandler")
public class FileHandler {
  @Zvd(Zp = "action")
  public final String action;
  
  @Zvd(Zp = "accepts")
  public final List<FileHandlerAccept> accepts;
  
  @Zvd(Zp = "displayName")
  public final String displayName;
  
  @Zox
  public FileHandler(@Zc5(Ze = "action") String paramString1, @Zc5(Ze = "accepts") List<FileHandlerAccept> paramList, @Zc5(Ze = "displayName") String paramString2) {
    String[] arrayOfString = OsAppState.Zo();
    this.action = paramString1;
    this.accepts = paramList;
    this.displayName = paramString2;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\pwa\FileHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */