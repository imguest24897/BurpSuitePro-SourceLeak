package net.portswigger.devtools.protocol.types.pwa;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.pwa.FileHandlerAccept")
public class FileHandlerAccept {
  @Zvd(Zp = "mediaType")
  public final String mediaType;
  
  @Zvd(Zp = "fileExtensions")
  public final List<String> fileExtensions;
  
  @Zox
  public FileHandlerAccept(@Zc5(Ze = "mediaType") String paramString, @Zc5(Ze = "fileExtensions") List<String> paramList) {
    this.mediaType = paramString;
    String[] arrayOfString = OsAppState.Zo();
    this.fileExtensions = paramList;
    if (Zbqc.Zwu() == null)
      OsAppState.Zr(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\pwa\FileHandlerAccept.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */