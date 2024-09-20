package net.portswigger.devtools.protocol.types.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.FileHandler")
public class FileHandler {
  @Zvd(Zp = "action")
  public final String action;
  
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "icons")
  @Zj
  public final List<ImageResource> icons;
  
  @Zvd(Zp = "accepts")
  @Zj
  public final List<FileFilter> accepts;
  
  @Zvd(Zp = "launchType")
  public final String launchType;
  
  @Zox
  public FileHandler(@Zc5(Ze = "action") String paramString1, @Zc5(Ze = "name") String paramString2, @Zc5(Ze = "icons", ZS = "null") List<ImageResource> paramList, @Zc5(Ze = "accepts", ZS = "null") List<FileFilter> paramList1, @Zc5(Ze = "launchType") String paramString3) {
    this.action = paramString1;
    this.name = paramString2;
    this.icons = paramList;
    this.accepts = paramList1;
    this.launchType = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\FileHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */