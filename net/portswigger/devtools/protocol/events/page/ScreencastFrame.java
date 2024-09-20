package net.portswigger.devtools.protocol.events.page;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.page.ScreencastFrameMetadata;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.page.ScreencastFrame")
public class ScreencastFrame implements Zl {
  @Zvd(Zp = "data")
  public final String data;
  
  @Zvd(Zp = "metadata")
  public final ScreencastFrameMetadata metadata;
  
  @Zvd(Zp = "sessionId")
  public final Integer sessionId;
  
  private static Zbqc[] ZI;
  
  @Zox
  public ScreencastFrame(@Zc5(Ze = "data") String paramString, @Zc5(Ze = "metadata") ScreencastFrameMetadata paramScreencastFrameMetadata, @Zc5(Ze = "sessionId") Integer paramInteger) {
    this.data = paramString;
    this.metadata = paramScreencastFrameMetadata;
    this.sessionId = paramInteger;
  }
  
  public static void Z_(Zbqc[] paramArrayOfZbqc) {
    ZI = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zu() {
    return ZI;
  }
  
  static {
    if (Zu() != null)
      Z_(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\ScreencastFrame.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */