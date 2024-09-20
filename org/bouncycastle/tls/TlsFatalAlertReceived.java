package org.bouncycastle.tls;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsFatalAlertReceived.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */