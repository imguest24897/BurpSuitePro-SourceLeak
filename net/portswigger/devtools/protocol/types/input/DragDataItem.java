package net.portswigger.devtools.protocol.types.input;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.input.DragDataItem")
public class DragDataItem {
  @Zvd(Zp = "mimeType")
  public final String mimeType;
  
  @Zvd(Zp = "data")
  public final String data;
  
  @Zvd(Zp = "title")
  @Zj
  public final String title;
  
  @Zvd(Zp = "baseURL")
  @Zj
  public final String baseURL;
  
  @Zox
  public DragDataItem(@Zc5(Ze = "mimeType") String paramString1, @Zc5(Ze = "data") String paramString2, @Zc5(Ze = "title", ZS = "null") String paramString3, @Zc5(Ze = "baseURL", ZS = "null") String paramString4) {
    this.mimeType = paramString1;
    this.data = paramString2;
    int i = MouseButton.ZE();
    this.title = paramString3;
    this.baseURL = paramString4;
    if (Zbqc.Zwu() == null)
      MouseButton.ZY(++i); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\input\DragDataItem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */