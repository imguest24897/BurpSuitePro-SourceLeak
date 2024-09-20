package org.bouncycastle.tls;

import java.io.EOFException;

public class TlsNoCloseNotifyException extends EOFException {
  public TlsNoCloseNotifyException() {
    super("No close_notify alert received before connection closed");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsNoCloseNotifyException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */