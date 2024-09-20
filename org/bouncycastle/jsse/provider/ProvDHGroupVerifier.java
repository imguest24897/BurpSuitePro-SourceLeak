package org.bouncycastle.jsse.provider;

import org.bouncycastle.tls.DefaultTlsDHGroupVerifier;
import org.bouncycastle.tls.crypto.DHGroup;

class ProvDHGroupVerifier extends DefaultTlsDHGroupVerifier {
  private static final int provMinimumPrimeBits = PropertyUtils.getIntegerSystemProperty("org.bouncycastle.jsse.client.dh.minimumPrimeBits", 2048, 1024, 16384);
  
  private static final boolean provUnrestrictedGroups = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.client.dh.unrestrictedGroups", false);
  
  ProvDHGroupVerifier() {
    super(provMinimumPrimeBits);
  }
  
  protected boolean checkGroup(DHGroup paramDHGroup) {
    return (provUnrestrictedGroups || super.checkGroup(paramDHGroup));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvDHGroupVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */