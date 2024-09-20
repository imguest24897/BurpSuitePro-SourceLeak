package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;

interface SignatureCreator {
  Signature createSignature(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\x509\SignatureCreator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */