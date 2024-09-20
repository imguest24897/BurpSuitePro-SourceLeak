package META-INF.versions.9.org.bouncycastle.tls;

import org.bouncycastle.tls.AlertDescription;
import org.bouncycastle.tls.TlsException;

public class TlsFatalAlert extends TlsException {
  protected short alertDescription;
  
  private static String getMessage(short paramShort, String paramString) {
    String str = AlertDescription.getText(paramShort);
    if (null != paramString)
      str = str + "; " + str; 
    return str;
  }
  
  public TlsFatalAlert(short paramShort) {
    this(paramShort, (String)null);
  }
  
  public TlsFatalAlert(short paramShort, String paramString) {
    this(paramShort, paramString, null);
  }
  
  public TlsFatalAlert(short paramShort, Throwable paramThrowable) {
    this(paramShort, null, paramThrowable);
  }
  
  public TlsFatalAlert(short paramShort, String paramString, Throwable paramThrowable) {
    super(getMessage(paramShort, paramString), paramThrowable);
    this.alertDescription = paramShort;
  }
  
  public short getAlertDescription() {
    return this.alertDescription;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsFatalAlert.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */