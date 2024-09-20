package org.bouncycastle.operator.bc;

import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.bouncycastle.operator.OperatorCreationException;

public class BcEdECContentSignerBuilder extends BcContentSignerBuilder {
  public BcEdECContentSignerBuilder(AlgorithmIdentifier paramAlgorithmIdentifier) {
    super(paramAlgorithmIdentifier, new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512));
  }
  
  protected Signer createSigner(AlgorithmIdentifier paramAlgorithmIdentifier1, AlgorithmIdentifier paramAlgorithmIdentifier2) throws OperatorCreationException {
    if (paramAlgorithmIdentifier1.getAlgorithm().equals((ASN1Primitive)EdECObjectIdentifiers.id_Ed25519))
      return (Signer)new Ed25519Signer(); 
    throw new IllegalStateException("unknown signature type");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\operator\bc\BcEdECContentSignerBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */