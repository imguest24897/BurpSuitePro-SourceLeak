package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.GOST3411_2012_512Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.ECGOST3410Signer;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class ECGOST2012SignatureSpi512 extends SignatureSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers {
  private Digest digest = (Digest)new GOST3411_2012_512Digest();
  
  private DSAExt signer = (DSAExt)new ECGOST3410Signer();
  
  private int size = 128;
  
  private int halfSize = 64;
  
  protected void engineInitVerify(PublicKey paramPublicKey) throws InvalidKeyException {
    ECKeyParameters eCKeyParameters;
    if (paramPublicKey instanceof org.bouncycastle.jce.interfaces.ECPublicKey) {
      eCKeyParameters = (ECKeyParameters)generatePublicKeyParameter(paramPublicKey);
    } else {
      try {
        byte[] arrayOfByte = paramPublicKey.getEncoded();
        paramPublicKey = BouncyCastleProvider.getPublicKey(SubjectPublicKeyInfo.getInstance(arrayOfByte));
        eCKeyParameters = (ECKeyParameters)ECUtil.generatePublicKeyParameter(paramPublicKey);
      } catch (Exception exception) {
        throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-512 signer");
      } 
    } 
    if (eCKeyParameters.getParameters().getN().bitLength() < 505)
      throw new InvalidKeyException("key too weak for ECGOST-2012-512"); 
    this.digest.reset();
    this.signer.init(false, (CipherParameters)eCKeyParameters);
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey) throws InvalidKeyException {
    ECKeyParameters eCKeyParameters;
    if (paramPrivateKey instanceof org.bouncycastle.jce.interfaces.ECKey) {
      eCKeyParameters = (ECKeyParameters)ECUtil.generatePrivateKeyParameter(paramPrivateKey);
    } else {
      throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-512 signer");
    } 
    if (eCKeyParameters.getParameters().getN().bitLength() < 505)
      throw new InvalidKeyException("key too weak for ECGOST-2012-512"); 
    this.digest.reset();
    if (this.appRandom != null) {
      this.signer.init(true, (CipherParameters)new ParametersWithRandom((CipherParameters)eCKeyParameters, this.appRandom));
    } else {
      this.signer.init(true, (CipherParameters)eCKeyParameters);
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
      byte[] arrayOfByte1 = new byte[this.size];
      BigInteger[] arrayOfBigInteger = this.signer.generateSignature(arrayOfByte);
      byte[] arrayOfByte2 = arrayOfBigInteger[0].toByteArray();
      byte[] arrayOfByte3 = arrayOfBigInteger[1].toByteArray();
      if (arrayOfByte3[0] != 0) {
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, this.halfSize - arrayOfByte3.length, arrayOfByte3.length);
      } else {
        System.arraycopy(arrayOfByte3, 1, arrayOfByte1, this.halfSize - arrayOfByte3.length - 1, arrayOfByte3.length - 1);
      } 
      if (arrayOfByte2[0] != 0) {
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, this.size - arrayOfByte2.length, arrayOfByte2.length);
      } else {
        System.arraycopy(arrayOfByte2, 1, arrayOfByte1, this.size - arrayOfByte2.length - 1, arrayOfByte2.length - 1);
      } 
      return arrayOfByte1;
    } catch (Exception exception) {
      throw new SignatureException(exception.toString());
    } 
  }
  
  protected boolean engineVerify(byte[] paramArrayOfbyte) throws SignatureException {
    BigInteger[] arrayOfBigInteger;
    byte[] arrayOfByte = new byte[this.digest.getDigestSize()];
    this.digest.doFinal(arrayOfByte, 0);
    try {
      byte[] arrayOfByte1 = new byte[this.halfSize];
      byte[] arrayOfByte2 = new byte[this.halfSize];
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte2, 0, this.halfSize);
      System.arraycopy(paramArrayOfbyte, this.halfSize, arrayOfByte1, 0, this.halfSize);
      arrayOfBigInteger = new BigInteger[2];
      arrayOfBigInteger[0] = new BigInteger(1, arrayOfByte1);
      arrayOfBigInteger[1] = new BigInteger(1, arrayOfByte2);
    } catch (Exception exception) {
      throw new SignatureException("error decoding signature bytes.");
    } 
    return this.signer.verifySignature(arrayOfByte, arrayOfBigInteger[0], arrayOfBigInteger[1]);
  }
  
  protected void engineSetParameter(AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    throw new UnsupportedOperationException("engineSetParameter unsupported");
  }
  
  protected AlgorithmParameters engineGetParameters() {
    return null;
  }
  
  protected void engineSetParameter(String paramString, Object paramObject) {
    throw new UnsupportedOperationException("engineSetParameter unsupported");
  }
  
  protected Object engineGetParameter(String paramString) {
    throw new UnsupportedOperationException("engineSetParameter unsupported");
  }
  
  static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey paramPublicKey) throws InvalidKeyException {
    return (paramPublicKey instanceof BCECGOST3410_2012PublicKey) ? (AsymmetricKeyParameter)((BCECGOST3410_2012PublicKey)paramPublicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(paramPublicKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\ecgost12\ECGOST2012SignatureSpi512.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */