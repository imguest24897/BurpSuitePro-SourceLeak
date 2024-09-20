package net.portswigger.devtools.protocol.events.backgroundservice;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.backgroundservice.BackgroundServiceEvent;

@Zsi("net.portswigger.devtools.protocol.events.backgroundservice.BackgroundServiceEventReceived")
public class BackgroundServiceEventReceived implements Zl {
  @Zvd(Zp = "backgroundServiceEvent")
  public final BackgroundServiceEvent backgroundServiceEvent;
  
  @Zox
  public BackgroundServiceEventReceived(@Zc5(Ze = "backgroundServiceEvent") BackgroundServiceEvent paramBackgroundServiceEvent) {
    int[] arrayOfInt = RecordingStateChanged.ZC();
    this.backgroundServiceEvent = paramBackgroundServiceEvent;
    if (Zbqc.Zwu() == null)
      RecordingStateChanged.Zx(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\backgroundservice\BackgroundServiceEventReceived.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */