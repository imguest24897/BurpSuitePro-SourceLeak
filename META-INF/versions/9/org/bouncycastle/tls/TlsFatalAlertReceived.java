package META-INF.versions.9.org.bouncycastle.tls;

import org.bouncycastle.tls.AlertDescription;
import org.bouncycastle.tls.TlsException;

public class TlsFatalAlertReceived extends TlsException {
  protected short alertDescription;
  
  public TlsFatalAlertReceived(short paramShort) {
    super(AlertDescription.getText(paramShort));
    this.alertDescription = paramShort;
  }
  
  public short getAlertDescription() {
    return this.alertDescription;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsFatalAlertReceived.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */