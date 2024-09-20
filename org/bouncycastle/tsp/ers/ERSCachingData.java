package org.bouncycastle.tsp.ers;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Arrays;

public abstract class ERSCachingData implements ERSData {
  private Map<CacheIndex, byte[]> preCalcs = (Map)new HashMap<>();
  
  public byte[] getHash(DigestCalculator paramDigestCalculator, byte[] paramArrayOfbyte) {
    CacheIndex cacheIndex = new CacheIndex(paramDigestCalculator.getAlgorithmIdentifier(), paramArrayOfbyte);
    if (this.preCalcs.containsKey(cacheIndex))
      return this.preCalcs.get(cacheIndex); 
    byte[] arrayOfByte = calculateHash(paramDigestCalculator, paramArrayOfbyte);
    this.preCalcs.put(cacheIndex, arrayOfByte);
    return arrayOfByte;
  }
  
  protected abstract byte[] calculateHash(DigestCalculator paramDigestCalculator, byte[] paramArrayOfbyte);
  
  private static class CacheIndex {
    final AlgorithmIdentifier algId;
    
    final byte[] chainHash;
    
    private CacheIndex(AlgorithmIdentifier param1AlgorithmIdentifier, byte[] param1ArrayOfbyte) {
      this.algId = param1AlgorithmIdentifier;
      this.chainHash = param1ArrayOfbyte;
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof CacheIndex))
        return false; 
      CacheIndex cacheIndex = (CacheIndex)param1Object;
      return (this.algId.equals(cacheIndex.algId) && Arrays.areEqual(this.chainHash, cacheIndex.chainHash));
    }
    
    public int hashCode() {
      int i = this.algId.hashCode();
      return 31 * i + Arrays.hashCode(this.chainHash);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSCachingData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */