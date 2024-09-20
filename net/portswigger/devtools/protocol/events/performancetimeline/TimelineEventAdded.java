package net.portswigger.devtools.protocol.events.performancetimeline;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.performancetimeline.TimelineEvent;

@Zsi("net.portswigger.devtools.protocol.events.performancetimeline.TimelineEventAdded")
public class TimelineEventAdded implements Zl {
  @Zvd(Zp = "event")
  public final TimelineEvent event;
  
  private static String[] ZS;
  
  @Zox
  public TimelineEventAdded(@Zc5(Ze = "event") TimelineEvent paramTimelineEvent) {
    this.event = paramTimelineEvent;
    String[] arrayOfString = Zd();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public static void Zx(String[] paramArrayOfString) {
    ZS = paramArrayOfString;
  }
  
  public static String[] Zd() {
    return ZS;
  }
  
  static {
    if (Zd() == null)
      Zx(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\performancetimeline\TimelineEventAdded.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */