package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.page.Frame;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.page.DocumentOpened")
public class DocumentOpened implements Zl {
  @Zvd(Zp = "frame")
  public final Frame frame;
  
  @Zox
  public DocumentOpened(@Zc5(Ze = "frame") Frame paramFrame) {
    this.frame = paramFrame;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\DocumentOpened.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */