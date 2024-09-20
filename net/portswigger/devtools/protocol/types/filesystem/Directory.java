package net.portswigger.devtools.protocol.types.filesystem;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.filesystem.Directory")
public class Directory {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "nestedDirectories")
  public final List<String> nestedDirectories;
  
  @Zvd(Zp = "nestedFiles")
  public final List<File> nestedFiles;
  
  @Zox
  public Directory(@Zc5(Ze = "name") String paramString, @Zc5(Ze = "nestedDirectories") List<String> paramList, @Zc5(Ze = "nestedFiles") List<File> paramList1) {
    this.name = paramString;
    this.nestedDirectories = paramList;
    boolean bool = File.Zy();
    this.nestedFiles = paramList1;
    if (Zbqc.Zwu() == null)
      File.ZI(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\filesystem\Directory.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */