package org.bouncycastle.operator;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public interface PBEMacCalculatorProvider {
  MacCalculator get(AlgorithmIdentifier paramAlgorithmIdentifier, char[] paramArrayOfchar) throws OperatorCreationException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\operator\PBEMacCalculatorProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */