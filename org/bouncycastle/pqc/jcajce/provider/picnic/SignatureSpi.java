package org.bouncycastle.pqc.jcajce.provider.picnic;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.picnic.PicnicPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicPublicKeyParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicSigner;

public class SignatureSpi extends Signature {
  private SecureRandom random;
  
  private Digest digest;
  
  private PicnicSigner signer;
  
  protected SignatureSpi(Digest paramDigest, PicnicSigner paramPicnicSigner) {
    super("Picnic");
    this.digest = paramDigest;
    this.signer = paramPicnicSigner;
  }
  
  protected void engineInitVerify(PublicKey paramPublicKey) throws InvalidKeyException {
    if (paramPublicKey instanceof BCPicnicPublicKey) {
      BCPicnicPublicKey bCPicnicPublicKey = (BCPicnicPublicKey)paramPublicKey;
      PicnicPublicKeyParameters picnicPublicKeyParameters = bCPicnicPublicKey.getKeyParams();
      this.digest.reset();
      this.signer.init(false, (CipherParameters)picnicPublicKeyParameters);
    } else {
      throw new InvalidKeyException("unknown public key passed to Picnic");
    } 
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey, SecureRandom paramSecureRandom) throws InvalidKeyException {
    this.random = paramSecureRandom;
    engineInitSign(paramPrivateKey);
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey) throws InvalidKeyException {
    if (paramPrivateKey instanceof BCPicnicPrivateKey) {
      BCPicnicPrivateKey bCPicnicPrivateKey = (BCPicnicPrivateKey)paramPrivateKey;
      PicnicPrivateKeyParameters picnicPrivateKeyParameters = bCPicnicPrivateKey.getKeyParams();
      this.digest.reset();
      this.signer.init(true, (CipherParameters)picnicPrivateKeyParameters);
    } else {
      throw new InvalidKeyException("unknown private key passed to Picnic");
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
  
  public static class Base extends SignatureSpi {
    public Base() {
      super((Digest)new NullDigest(), new PicnicSigner());
    }
  }
  
  public static class withSha3512 extends SignatureSpi {
    public withSha3512() {
      super((Digest)new SHA3Digest(512), new PicnicSigner());
    }
  }
  
  public static class withSha512 extends SignatureSpi {
    public withSha512() {
      super((Digest)new SHA512Digest(), new PicnicSigner());
    }
  }
  
  public static class withShake256 extends SignatureSpi {
    public withShake256() {
      super((Digest)new SHAKEDigest(256), new PicnicSigner());
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\picnic\SignatureSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */