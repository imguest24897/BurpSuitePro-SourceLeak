package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.util.PrivateKeyFactory;
import org.bouncycastle.crypto.util.PublicKeyFactory;

class EdECUtil {
  public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey paramPublicKey) throws InvalidKeyException {
    if (paramPublicKey instanceof BCXDHPublicKey)
      return ((BCXDHPublicKey)paramPublicKey).engineGetKeyParameters(); 
    if (paramPublicKey instanceof BCEdDSAPublicKey)
      return ((BCEdDSAPublicKey)paramPublicKey).engineGetKeyParameters(); 
    try {
      byte[] arrayOfByte = paramPublicKey.getEncoded();
      if (arrayOfByte == null)
        throw new InvalidKeyException("no encoding for EdEC/XDH public key"); 
      return PublicKeyFactory.createKey(arrayOfByte);
    } catch (Exception exception) {
      throw new InvalidKeyException("cannot identify EdEC/XDH public key: " + exception.getMessage());
    } 
  }
  
  public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey paramPrivateKey) throws InvalidKeyException {
    if (paramPrivateKey instanceof BCXDHPrivateKey)
      return ((BCXDHPrivateKey)paramPrivateKey).engineGetKeyParameters(); 
    if (paramPrivateKey instanceof BCEdDSAPrivateKey)
      return ((BCEdDSAPrivateKey)paramPrivateKey).engineGetKeyParameters(); 
    try {
      byte[] arrayOfByte = paramPrivateKey.getEncoded();
      if (arrayOfByte == null)
        throw new InvalidKeyException("no encoding for EdEC/XDH private key"); 
      return PrivateKeyFactory.createKey(arrayOfByte);
    } catch (Exception exception) {
      throw new InvalidKeyException("cannot identify EdEC/XDH private key: " + exception.getMessage());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\edec\EdECUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */