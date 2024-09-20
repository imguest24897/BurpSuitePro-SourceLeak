package net.portswigger.devtools.protocol.events.backgroundservice;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.backgroundservice.ServiceName;

@Zsi("net.portswigger.devtools.protocol.events.backgroundservice.RecordingStateChanged")
public class RecordingStateChanged implements Zl {
  @Zvd(Zp = "isRecording")
  public final Boolean isRecording;
  
  @Zvd(Zp = "service")
  public final ServiceName service;
  
  private static int[] ZV;
  
  @Zox
  public RecordingStateChanged(@Zc5(Ze = "isRecording") Boolean paramBoolean, @Zc5(Ze = "service") ServiceName paramServiceName) {
    int[] arrayOfInt = ZC();
    this.isRecording = paramBoolean;
    this.service = paramServiceName;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public static void Zx(int[] paramArrayOfint) {
    ZV = paramArrayOfint;
  }
  
  public static int[] ZC() {
    return ZV;
  }
  
  static {
    if (ZC() == null)
      Zx(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\backgroundservice\RecordingStateChanged.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */