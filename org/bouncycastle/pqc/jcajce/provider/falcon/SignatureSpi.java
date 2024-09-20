package org.bouncycastle.pqc.jcajce.provider.falcon;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconSigner;
import org.bouncycastle.util.Strings;

public class SignatureSpi extends Signature {
  private ByteArrayOutputStream bOut;
  
  private FalconSigner signer;
  
  private SecureRandom random;
  
  private FalconParameters parameters;
  
  protected SignatureSpi(FalconSigner paramFalconSigner) {
    super("FALCON");
    this.bOut = new ByteArrayOutputStream();
    this.signer = paramFalconSigner;
    this.parameters = null;
  }
  
  protected SignatureSpi(FalconSigner paramFalconSigner, FalconParameters paramFalconParameters) {
    super(Strings.toUpperCase(paramFalconParameters.getName()));
    this.parameters = paramFalconParameters;
    this.bOut = new ByteArrayOutputStream();
    this.signer = paramFalconSigner;
  }
  
  protected void engineInitVerify(PublicKey paramPublicKey) throws InvalidKeyException {
    BCFalconPublicKey bCFalconPublicKey1;
    if (!(paramPublicKey instanceof BCFalconPublicKey))
      try {
        bCFalconPublicKey1 = new BCFalconPublicKey(SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()));
      } catch (Exception exception) {
        throw new InvalidKeyException("unknown public key passed to Falcon: " + exception.getMessage(), exception);
      }  
    BCFalconPublicKey bCFalconPublicKey2 = bCFalconPublicKey1;
    if (this.parameters != null) {
      String str = Strings.toUpperCase(this.parameters.getName());
      if (!str.equals(bCFalconPublicKey2.getAlgorithm()))
        throw new InvalidKeyException("signature configured for " + str); 
    } 
    this.signer.init(false, (CipherParameters)bCFalconPublicKey2.getKeyParams());
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey, SecureRandom paramSecureRandom) throws InvalidKeyException {
    this.random = paramSecureRandom;
    engineInitSign(paramPrivateKey);
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey) throws InvalidKeyException {
    if (paramPrivateKey instanceof BCFalconPrivateKey) {
      BCFalconPrivateKey bCFalconPrivateKey = (BCFalconPrivateKey)paramPrivateKey;
      FalconPrivateKeyParameters falconPrivateKeyParameters = bCFalconPrivateKey.getKeyParams();
      if (this.parameters != null) {
        String str = Strings.toUpperCase(this.parameters.getName());
        if (!str.equals(bCFalconPrivateKey.getAlgorithm()))
          throw new InvalidKeyException("signature configured for " + str); 
      } 
      if (this.random != null) {
        this.signer.init(true, (CipherParameters)new ParametersWithRandom((CipherParameters)falconPrivateKeyParameters, this.random));
      } else {
        this.signer.init(true, (CipherParameters)falconPrivateKeyParameters);
      } 
    } else {
      throw new InvalidKeyException("unknown private key passed to Falcon");
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
      super(new FalconSigner());
    }
  }
  
  public static class Falcon1024 extends SignatureSpi {
    public Falcon1024() {
      super(new FalconSigner(), FalconParameters.falcon_1024);
    }
  }
  
  public static class Falcon512 extends SignatureSpi {
    public Falcon512() {
      super(new FalconSigner(), FalconParameters.falcon_512);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\falcon\SignatureSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */