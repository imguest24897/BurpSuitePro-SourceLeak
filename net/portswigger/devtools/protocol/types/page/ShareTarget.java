package net.portswigger.devtools.protocol.types.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.ShareTarget")
public class ShareTarget {
  @Zvd(Zp = "action")
  public final String action;
  
  @Zvd(Zp = "method")
  public final String method;
  
  @Zvd(Zp = "enctype")
  public final String enctype;
  
  @Zvd(Zp = "title")
  @Zj
  public final String title;
  
  @Zvd(Zp = "text")
  @Zj
  public final String text;
  
  @Zvd(Zp = "url")
  @Zj
  public final String url;
  
  @Zvd(Zp = "files")
  @Zj
  public final List<FileFilter> files;
  
  @Zox
  public ShareTarget(@Zc5(Ze = "action") String paramString1, @Zc5(Ze = "method") String paramString2, @Zc5(Ze = "enctype") String paramString3, @Zc5(Ze = "title", ZS = "null") String paramString4, @Zc5(Ze = "text", ZS = "null") String paramString5, @Zc5(Ze = "url", ZS = "null") String paramString6, @Zc5(Ze = "files", ZS = "null") List<FileFilter> paramList) {
    this.action = paramString1;
    this.method = paramString2;
    this.enctype = paramString3;
    this.title = paramString4;
    this.text = paramString5;
    this.url = paramString6;
    this.files = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\ShareTarget.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */