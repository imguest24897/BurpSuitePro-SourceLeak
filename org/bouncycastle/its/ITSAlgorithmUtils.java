package org.bouncycastle.its;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashAlgorithm;

public class ITSAlgorithmUtils {
  private static final Map<Object, HashAlgorithm> algoMap = new HashMap<>();
  
  public static HashAlgorithm getHashAlgorithm(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return algoMap.get(paramASN1ObjectIdentifier);
  }
  
  static {
    algoMap.put(NISTObjectIdentifiers.id_sha256, HashAlgorithm.sha256);
    algoMap.put(NISTObjectIdentifiers.id_sha384, HashAlgorithm.sha384);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ITSAlgorithmUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */