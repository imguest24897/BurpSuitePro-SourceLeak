package net.portswigger.devtools.protocol.types.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.FileFilter")
public class FileFilter {
  @Zvd(Zp = "name")
  @Zj
  public final String name;
  
  @Zvd(Zp = "accepts")
  @Zj
  public final List<String> accepts;
  
  @Zox
  public FileFilter(@Zc5(Ze = "name", ZS = "null") String paramString, @Zc5(Ze = "accepts", ZS = "null") List<String> paramList) {
    this.name = paramString;
    this.accepts = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\FileFilter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */