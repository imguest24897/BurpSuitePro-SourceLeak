package org.bouncycastle.tsp.ers;

import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.operator.DigestCalculator;

public interface ERSRootNodeCalculator {
  byte[] computeRootHash(DigestCalculator paramDigestCalculator, PartialHashtree[] paramArrayOfPartialHashtree);
  
  PartialHashtree[] computePathToRoot(DigestCalculator paramDigestCalculator, PartialHashtree paramPartialHashtree, int paramInt);
  
  byte[] recoverRootHash(DigestCalculator paramDigestCalculator, PartialHashtree[] paramArrayOfPartialHashtree);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSRootNodeCalculator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */