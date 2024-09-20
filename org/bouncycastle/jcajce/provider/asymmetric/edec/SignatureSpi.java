package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.bouncycastle.crypto.signers.Ed448Signer;

public class SignatureSpi extends SignatureSpi {
  private static final byte[] EMPTY_CONTEXT = new byte[0];
  
  private final String algorithm;
  
  private Signer signer;
  
  SignatureSpi(String paramString) {
    this.algorithm = paramString;
  }
  
  protected void engineInitVerify(PublicKey paramPublicKey) throws InvalidKeyException {
    AsymmetricKeyParameter asymmetricKeyParameter = getLwEdDSAKeyPublic(paramPublicKey);
    if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed25519PublicKeyParameters) {
      this.signer = getSigner("Ed25519");
    } else if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed448PublicKeyParameters) {
      this.signer = getSigner("Ed448");
    } else {
      throw new InvalidKeyException("unsupported public key type");
    } 
    this.signer.init(false, (CipherParameters)asymmetricKeyParameter);
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey) throws InvalidKeyException {
    AsymmetricKeyParameter asymmetricKeyParameter = getLwEdDSAKeyPrivate(paramPrivateKey);
    if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters) {
      this.signer = getSigner("Ed25519");
    } else if (asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed448PrivateKeyParameters) {
      this.signer = getSigner("Ed448");
    } else {
      throw new InvalidKeyException("unsupported private key type");
    } 
    this.signer.init(true, (CipherParameters)asymmetricKeyParameter);
  }
  
  private static AsymmetricKeyParameter getLwEdDSAKeyPrivate(PrivateKey paramPrivateKey) throws InvalidKeyException {
    return EdECUtil.generatePrivateKeyParameter(paramPrivateKey);
  }
  
  private static AsymmetricKeyParameter getLwEdDSAKeyPublic(PublicKey paramPublicKey) throws InvalidKeyException {
    return EdECUtil.generatePublicKeyParameter(paramPublicKey);
  }
  
  private Signer getSigner(String paramString) throws InvalidKeyException {
    if (this.algorithm != null && !paramString.equals(this.algorithm))
      throw new InvalidKeyException("inappropriate key for " + this.algorithm); 
    return (Signer)(paramString.equals("Ed448") ? new Ed448Signer(EMPTY_CONTEXT) : new Ed25519Signer());
  }
  
  protected void engineUpdate(byte paramByte) throws SignatureException {
    this.signer.update(paramByte);
  }
  
  protected void engineUpdate(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws SignatureException {
    this.signer.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  protected byte[] engineSign() throws SignatureException {
    try {
      return this.signer.generateSignature();
    } catch (CryptoException cryptoException) {
      throw new SignatureException(cryptoException.getMessage());
    } 
  }
  
  protected boolean engineVerify(byte[] paramArrayOfbyte) throws SignatureException {
    return this.signer.verifySignature(paramArrayOfbyte);
  }
  
  protected void engineSetParameter(String paramString, Object paramObject) throws InvalidParameterException {
    throw new UnsupportedOperationException("engineSetParameter unsupported");
  }
  
  protected Object engineGetParameter(String paramString) throws InvalidParameterException {
    throw new UnsupportedOperationException("engineGetParameter unsupported");
  }
  
  protected AlgorithmParameters engineGetParameters() {
    return null;
  }
  
  public static final class Ed25519 extends SignatureSpi {
    public Ed25519() {
      super("Ed25519");
    }
  }
  
  public static final class Ed448 extends SignatureSpi {
    public Ed448() {
      super("Ed448");
    }
  }
  
  public static final class EdDSA extends SignatureSpi {
    public EdDSA() {
      super(null);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\edec\SignatureSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */