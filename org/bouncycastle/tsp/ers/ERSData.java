package org.bouncycastle.tsp.ers;

import org.bouncycastle.operator.DigestCalculator;

public interface ERSData {
  byte[] getHash(DigestCalculator paramDigestCalculator, byte[] paramArrayOfbyte);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */