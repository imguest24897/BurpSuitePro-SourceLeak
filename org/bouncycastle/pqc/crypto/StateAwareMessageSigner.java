package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public interface StateAwareMessageSigner extends MessageSigner {
  AsymmetricKeyParameter getUpdatedPrivateKey();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\StateAwareMessageSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */