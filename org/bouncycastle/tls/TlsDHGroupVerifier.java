package org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.DHGroup;

public interface TlsDHGroupVerifier {
  boolean accept(DHGroup paramDHGroup);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsDHGroupVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */