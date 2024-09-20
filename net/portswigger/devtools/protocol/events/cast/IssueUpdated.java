package net.portswigger.devtools.protocol.events.cast;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.cast.IssueUpdated")
public class IssueUpdated implements Zl {
  @Zvd(Zp = "issueMessage")
  public final String issueMessage;
  
  @Zox
  public IssueUpdated(@Zc5(Ze = "issueMessage") String paramString) {
    this.issueMessage = paramString;
    Zbqc[] arrayOfZbqc = SinksUpdated.ZW();
    if (Zbqc.Zwu() == null)
      SinksUpdated.Za(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\cast\IssueUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */