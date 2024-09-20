package net.portswigger.devtools.protocol.types.domsnapshot;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.domsnapshot.CaptureSnapshot")
public class CaptureSnapshot {
  @Zvd(Zp = "documents")
  public final List<DocumentSnapshot> documents;
  
  @Zvd(Zp = "strings")
  public final List<String> strings;
  
  @Zox
  public CaptureSnapshot(@Zc5(Ze = "documents") List<DocumentSnapshot> paramList, @Zc5(Ze = "strings") List<String> paramList1) {
    this.documents = paramList;
    this.strings = paramList1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domsnapshot\CaptureSnapshot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */