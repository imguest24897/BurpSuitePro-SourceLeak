package org.bouncycastle.pqc.jcajce.provider.dilithium;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumSigner;
import org.bouncycastle.util.Strings;

public class SignatureSpi extends Signature {
  private ByteArrayOutputStream bOut = new ByteArrayOutputStream();
  
  private DilithiumSigner signer;
  
  private SecureRandom random;
  
  private DilithiumParameters parameters;
  
  protected SignatureSpi(DilithiumSigner paramDilithiumSigner) {
    super("Dilithium");
    this.signer = paramDilithiumSigner;
    this.parameters = null;
  }
  
  protected SignatureSpi(DilithiumSigner paramDilithiumSigner, DilithiumParameters paramDilithiumParameters) {
    super(Strings.toUpperCase(paramDilithiumParameters.getName()));
    this.signer = paramDilithiumSigner;
    this.parameters = paramDilithiumParameters;
  }
  
  protected void engineInitVerify(PublicKey paramPublicKey) throws InvalidKeyException {
    BCDilithiumPublicKey bCDilithiumPublicKey1;
    if (!(paramPublicKey instanceof BCDilithiumPublicKey))
      try {
        bCDilithiumPublicKey1 = new BCDilithiumPublicKey(SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()));
      } catch (Exception exception) {
        throw new InvalidKeyException("unknown public key passed to Dilithium: " + exception.getMessage(), exception);
      }  
    BCDilithiumPublicKey bCDilithiumPublicKey2 = bCDilithiumPublicKey1;
    if (this.parameters != null) {
      String str = Strings.toUpperCase(this.parameters.getName());
      if (!str.equals(bCDilithiumPublicKey2.getAlgorithm()))
        throw new InvalidKeyException("signature configured for " + str); 
    } 
    this.signer.init(false, (CipherParameters)bCDilithiumPublicKey2.getKeyParams());
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey, SecureRandom paramSecureRandom) throws InvalidKeyException {
    this.random = paramSecureRandom;
    engineInitSign(paramPrivateKey);
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey) throws InvalidKeyException {
    if (paramPrivateKey instanceof BCDilithiumPrivateKey) {
      BCDilithiumPrivateKey bCDilithiumPrivateKey = (BCDilithiumPrivateKey)paramPrivateKey;
      DilithiumPrivateKeyParameters dilithiumPrivateKeyParameters = bCDilithiumPrivateKey.getKeyParams();
      if (this.parameters != null) {
        String str = Strings.toUpperCase(this.parameters.getName());
        if (!str.equals(bCDilithiumPrivateKey.getAlgorithm()))
          throw new InvalidKeyException("signature configured for " + str); 
      } 
      if (this.random != null) {
        this.signer.init(true, (CipherParameters)new ParametersWithRandom((CipherParameters)dilithiumPrivateKeyParameters, this.random));
      } else {
        this.signer.init(true, (CipherParameters)dilithiumPrivateKeyParameters);
      } 
    } else {
      throw new InvalidKeyException("unknown private key passed to Dilithium");
    } 
  }
  
  protected void engineUpdate(byte paramByte) throws SignatureException {
    this.bOut.write(paramByte);
  }
  
  protected void engineUpdate(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws SignatureException {
    this.bOut.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  protected byte[] engineSign() throws SignatureException {
    try {
      byte[] arrayOfByte = this.bOut.toByteArray();
      this.bOut.reset();
      return this.signer.generateSignature(arrayOfByte);
    } catch (Exception exception) {
      throw new SignatureException(exception.toString());
    } 
  }
  
  protected boolean engineVerify(byte[] paramArrayOfbyte) throws SignatureException {
    byte[] arrayOfByte = this.bOut.toByteArray();
    this.bOut.reset();
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
      super(new DilithiumSigner());
    }
  }
  
  public static class Base2 extends SignatureSpi {
    public Base2() {
      super(new DilithiumSigner(), DilithiumParameters.dilithium2);
    }
  }
  
  public static class Base3 extends SignatureSpi {
    public Base3() {
      super(new DilithiumSigner(), DilithiumParameters.dilithium3);
    }
  }
  
  public static class Base5 extends SignatureSpi {
    public Base5() throws NoSuchAlgorithmException {
      super(new DilithiumSigner(), DilithiumParameters.dilithium5);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\dilithium\SignatureSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */