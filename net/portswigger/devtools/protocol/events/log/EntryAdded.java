package net.portswigger.devtools.protocol.events.log;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.log.LogEntry;

@Zsi("net.portswigger.devtools.protocol.events.log.EntryAdded")
public class EntryAdded implements Zl {
  @Zvd(Zp = "entry")
  public final LogEntry entry;
  
  private static String[] Zp;
  
  @Zox
  public EntryAdded(@Zc5(Ze = "entry") LogEntry paramLogEntry) {
    this.entry = paramLogEntry;
    String[] arrayOfString = ZP();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public static void ZM(String[] paramArrayOfString) {
    Zp = paramArrayOfString;
  }
  
  public static String[] ZP() {
    return Zp;
  }
  
  static {
    if (ZP() == null)
      ZM(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\log\EntryAdded.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */