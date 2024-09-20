package org.bouncycastle.operator;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public interface DigestAlgorithmIdentifierFinder {
  AlgorithmIdentifier find(AlgorithmIdentifier paramAlgorithmIdentifier);
  
  AlgorithmIdentifier find(ASN1ObjectIdentifier paramASN1ObjectIdentifier);
  
  AlgorithmIdentifier find(String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\operator\DigestAlgorithmIdentifierFinder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */