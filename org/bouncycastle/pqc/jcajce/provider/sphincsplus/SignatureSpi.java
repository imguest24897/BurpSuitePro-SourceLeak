package org.bouncycastle.pqc.jcajce.provider.sphincsplus;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusSigner;

public class SignatureSpi extends SignatureSpi {
  private final Digest digest;
  
  private final SPHINCSPlusSigner signer;
  
  protected SignatureSpi(Digest paramDigest, SPHINCSPlusSigner paramSPHINCSPlusSigner) {
    this.digest = paramDigest;
    this.signer = paramSPHINCSPlusSigner;
  }
  
  protected void engineInitVerify(PublicKey paramPublicKey) throws InvalidKeyException {
    if (paramPublicKey instanceof BCSPHINCSPlusPublicKey) {
      BCSPHINCSPlusPublicKey bCSPHINCSPlusPublicKey = (BCSPHINCSPlusPublicKey)paramPublicKey;
      CipherParameters cipherParameters = bCSPHINCSPlusPublicKey.getKeyParams();
      this.signer.init(false, cipherParameters);
    } else {
      throw new InvalidKeyException("unknown public key passed to SPHINCS+");
    } 
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey, SecureRandom paramSecureRandom) throws InvalidKeyException {
    this.appRandom = paramSecureRandom;
    engineInitSign(paramPrivateKey);
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey) throws InvalidKeyException {
    if (paramPrivateKey instanceof BCSPHINCSPlusPrivateKey) {
      BCSPHINCSPlusPrivateKey bCSPHINCSPlusPrivateKey = (BCSPHINCSPlusPrivateKey)paramPrivateKey;
      SPHINCSPlusPrivateKeyParameters sPHINCSPlusPrivateKeyParameters = bCSPHINCSPlusPrivateKey.getKeyParams();
      if (this.appRandom != null) {
        this.signer.init(true, (CipherParameters)new ParametersWithRandom((CipherParameters)sPHINCSPlusPrivateKeyParameters, this.appRandom));
      } else {
        this.signer.init(true, (CipherParameters)sPHINCSPlusPrivateKeyParameters);
      } 
    } else {
      throw new InvalidKeyException("unknown private key passed to SPHINCS+");
    } 
  }
  
  protected void engineUpdate(byte paramByte) throws SignatureException {
    this.digest.update(paramByte);
  }
  
  protected void engineUpdate(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws SignatureException {
    this.digest.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  protected byte[] engineSign() throws SignatureException {
    byte[] arrayOfByte = new byte[this.digest.getDigestSize()];
    this.digest.doFinal(arrayOfByte, 0);
    try {
      return this.signer.generateSignature(arrayOfByte);
    } catch (Exception exception) {
      throw new SignatureException(exception.toString());
    } 
  }
  
  protected boolean engineVerify(byte[] paramArrayOfbyte) throws SignatureException {
    byte[] arrayOfByte = new byte[this.digest.getDigestSize()];
    this.digest.doFinal(arrayOfByte, 0);
    return this.signer.verifySignature(arrayOfByte, paramArrayOfbyte);
  }
  
  protected void engineSetParameter(AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    throw new UnsupportedOperationException("engineSetParameter unsupported");
  }
  
  protected void engineSetParameter(String paramString, Object paramObject) {
    throw new UnsupportedOperationException("engineSetParameter unsupported");
  }
  
  protected Object engineGetParameter(String paramString) {
    throw new UnsupportedOperationException("engineSetParameter unsupported");
  }
  
  public static class Direct extends SignatureSpi {
    public Direct() {
      super((Digest)new NullDigest(), new SPHINCSPlusSigner());
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\sphincsplus\SignatureSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */