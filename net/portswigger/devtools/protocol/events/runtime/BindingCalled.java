package net.portswigger.devtools.protocol.events.runtime;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.runtime.BindingCalled")
public class BindingCalled implements Zl {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "payload")
  public final String payload;
  
  @Zvd(Zp = "executionContextId")
  public final Integer executionContextId;
  
  @Zox
  public BindingCalled(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "payload") String paramString2, @Zc5(Ze = "executionContextId") Integer paramInteger) {
    int i = InspectRequested.ZC();
    this.name = paramString1;
    this.payload = paramString2;
    this.executionContextId = paramInteger;
    if (Zbqc.Zwu() == null)
      InspectRequested.Zi(++i); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\runtime\BindingCalled.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */