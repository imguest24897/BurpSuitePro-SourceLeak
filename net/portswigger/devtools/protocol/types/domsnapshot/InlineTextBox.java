package net.portswigger.devtools.protocol.types.domsnapshot;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.types.dom.Rect;

@Zsi("net.portswigger.devtools.protocol.types.domsnapshot.InlineTextBox")
public class InlineTextBox {
  @Zvd(Zp = "boundingBox")
  public final Rect boundingBox;
  
  @Zvd(Zp = "startCharacterIndex")
  public final Integer startCharacterIndex;
  
  @Zvd(Zp = "numCharacters")
  public final Integer numCharacters;
  
  @Zox
  public InlineTextBox(@Zc5(Ze = "boundingBox") Rect paramRect, @Zc5(Ze = "startCharacterIndex") Integer paramInteger1, @Zc5(Ze = "numCharacters") Integer paramInteger2) {
    this.boundingBox = paramRect;
    this.startCharacterIndex = paramInteger1;
    this.numCharacters = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domsnapshot\InlineTextBox.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */