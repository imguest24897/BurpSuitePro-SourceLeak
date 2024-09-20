package org.bouncycastle.pqc.jcajce.provider.rainbow;

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
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowSigner;
import org.bouncycastle.util.Strings;

public class SignatureSpi extends Signature {
  private ByteArrayOutputStream bOut;
  
  private RainbowSigner signer;
  
  private SecureRandom random;
  
  private RainbowParameters parameters;
  
  protected SignatureSpi(RainbowSigner paramRainbowSigner) {
    super("RAINBOW");
    this.bOut = new ByteArrayOutputStream();
    this.signer = paramRainbowSigner;
    this.parameters = null;
  }
  
  protected SignatureSpi(RainbowSigner paramRainbowSigner, RainbowParameters paramRainbowParameters) {
    super(Strings.toUpperCase(paramRainbowParameters.getName()));
    this.parameters = paramRainbowParameters;
    this.bOut = new ByteArrayOutputStream();
    this.signer = paramRainbowSigner;
  }
  
  protected void engineInitVerify(PublicKey paramPublicKey) throws InvalidKeyException {
    BCRainbowPublicKey bCRainbowPublicKey1;
    if (!(paramPublicKey instanceof BCRainbowPublicKey))
      try {
        bCRainbowPublicKey1 = new BCRainbowPublicKey(SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()));
      } catch (Exception exception) {
        throw new InvalidKeyException("unknown public key passed to Rainbow: " + exception.getMessage(), exception);
      }  
    BCRainbowPublicKey bCRainbowPublicKey2 = bCRainbowPublicKey1;
    if (this.parameters != null) {
      String str = Strings.toUpperCase(this.parameters.getName());
      if (!str.equals(bCRainbowPublicKey2.getAlgorithm()))
        throw new InvalidKeyException("signature configured for " + str); 
    } 
    this.signer.init(false, (CipherParameters)bCRainbowPublicKey2.getKeyParams());
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey, SecureRandom paramSecureRandom) throws InvalidKeyException {
    this.random = paramSecureRandom;
    engineInitSign(paramPrivateKey);
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey) throws InvalidKeyException {
    if (paramPrivateKey instanceof BCRainbowPrivateKey) {
      BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey)paramPrivateKey;
      RainbowPrivateKeyParameters rainbowPrivateKeyParameters = bCRainbowPrivateKey.getKeyParams();
      if (this.parameters != null) {
        String str = Strings.toUpperCase(this.parameters.getName());
        if (!str.equals(bCRainbowPrivateKey.getAlgorithm()))
          throw new InvalidKeyException("signature configured for " + str); 
      } 
      if (this.random != null) {
        this.signer.init(true, (CipherParameters)new ParametersWithRandom((CipherParameters)rainbowPrivateKeyParameters, this.random));
      } else {
        this.signer.init(true, (CipherParameters)rainbowPrivateKeyParameters);
      } 
    } else {
      throw new InvalidKeyException("unknown private key passed to Rainbow");
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
      super(new RainbowSigner());
    }
  }
  
  public static class RainbowIIIcircum extends SignatureSpi {
    public RainbowIIIcircum() {
      super(new RainbowSigner(), RainbowParameters.rainbowIIIcircumzenithal);
    }
  }
  
  public static class RainbowIIIclassic extends SignatureSpi {
    public RainbowIIIclassic() {
      super(new RainbowSigner(), RainbowParameters.rainbowIIIclassic);
    }
  }
  
  public static class RainbowIIIcomp extends SignatureSpi {
    public RainbowIIIcomp() {
      super(new RainbowSigner(), RainbowParameters.rainbowIIIcompressed);
    }
  }
  
  public static class RainbowVcircum extends SignatureSpi {
    public RainbowVcircum() {
      super(new RainbowSigner(), RainbowParameters.rainbowVcircumzenithal);
    }
  }
  
  public static class RainbowVclassic extends SignatureSpi {
    public RainbowVclassic() {
      super(new RainbowSigner(), RainbowParameters.rainbowVclassic);
    }
  }
  
  public static class RainbowVcomp extends SignatureSpi {
    public RainbowVcomp() {
      super(new RainbowSigner(), RainbowParameters.rainbowVcompressed);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\rainbow\SignatureSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */