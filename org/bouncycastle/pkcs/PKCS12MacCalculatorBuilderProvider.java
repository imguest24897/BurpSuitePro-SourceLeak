package org.bouncycastle.pkcs;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public interface PKCS12MacCalculatorBuilderProvider {
  PKCS12MacCalculatorBuilder get(AlgorithmIdentifier paramAlgorithmIdentifier);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkcs\PKCS12MacCalculatorBuilderProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */