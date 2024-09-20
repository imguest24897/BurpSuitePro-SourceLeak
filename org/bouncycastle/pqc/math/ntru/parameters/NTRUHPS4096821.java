package org.bouncycastle.pqc.math.ntru.parameters;

import org.bouncycastle.pqc.math.ntru.HPS4096Polynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;

public class NTRUHPS4096821 extends NTRUHPSParameterSet {
  public NTRUHPS4096821() {
    super(821, 12, 32, 32, 32);
  }
  
  public Polynomial createPolynomial() {
    return (Polynomial)new HPS4096Polynomial(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\math\ntru\parameters\NTRUHPS4096821.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */