package net.portswigger.devtools.protocol.events.audits;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.audits.InspectorIssue;

@Zsi("net.portswigger.devtools.protocol.events.audits.IssueAdded")
public class IssueAdded implements Zl {
  @Zvd(Zp = "issue")
  public final InspectorIssue issue;
  
  private static int ZQ;
  
  @Zox
  public IssueAdded(@Zc5(Ze = "issue") InspectorIssue paramInspectorIssue) {
    int i = ZE();
    this.issue = paramInspectorIssue;
    if (i == 0)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public static void Zy(int paramInt) {
    ZQ = paramInt;
  }
  
  public static int ZE() {
    return ZQ;
  }
  
  public static int ZJ() {
    int i = ZE();
    return (i == 0) ? 58 : 0;
  }
  
  static {
    if (ZE() == 0)
      Zy(72); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\audits\IssueAdded.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */