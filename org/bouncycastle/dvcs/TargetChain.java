package org.bouncycastle.dvcs;

import org.bouncycastle.asn1.dvcs.TargetEtcChain;

public class TargetChain {
  private final TargetEtcChain certs;
  
  public TargetChain(TargetEtcChain paramTargetEtcChain) {
    this.certs = paramTargetEtcChain;
  }
  
  public TargetEtcChain toASN1Structure() {
    return this.certs;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\dvcs\TargetChain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */