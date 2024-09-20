package net.portswigger.devtools.protocol.events.layertree;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.dom.Rect;

@Zsi("net.portswigger.devtools.protocol.events.layertree.LayerPainted")
public class LayerPainted implements Zl {
  @Zvd(Zp = "layerId")
  public final String layerId;
  
  @Zvd(Zp = "clip")
  public final Rect clip;
  
  @Zox
  public LayerPainted(@Zc5(Ze = "layerId") String paramString, @Zc5(Ze = "clip") Rect paramRect) {
    String[] arrayOfString = LayerTreeDidChange.Zr();
    this.layerId = paramString;
    this.clip = paramRect;
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\layertree\LayerPainted.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */