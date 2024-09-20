package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

public class ECVKOAgreement {
  private final Digest digest;
  
  private ECPrivateKeyParameters key;
  
  private BigInteger ukm;
  
  public ECVKOAgreement(Digest paramDigest) {
    this.digest = paramDigest;
  }
  
  public void init(CipherParameters paramCipherParameters) {
    ParametersWithUKM parametersWithUKM = (ParametersWithUKM)paramCipherParameters;
    this.key = (ECPrivateKeyParameters)parametersWithUKM.getParameters();
    this.ukm = new BigInteger(1, Arrays.reverse(parametersWithUKM.getUKM()));
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("ECVKO", (ECKeyParameters)this.key));
  }
  
  public int getAgreementSize() {
    return this.digest.getDigestSize();
  }
  
  public int getFieldSize() {
    return (this.key.getParameters().getCurve().getFieldSize() + 7) / 8;
  }
  
  public byte[] calculateAgreement(CipherParameters paramCipherParameters) {
    ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters)paramCipherParameters;
    ECDomainParameters eCDomainParameters = this.key.getParameters();
    if (!eCDomainParameters.equals(eCPublicKeyParameters.getParameters()))
      throw new IllegalStateException("ECVKO public key has wrong domain parameters"); 
    BigInteger bigInteger = eCDomainParameters.getH().multiply(this.ukm).multiply(this.key.getD()).mod(eCDomainParameters.getN());
    ECPoint eCPoint1 = ECAlgorithms.cleanPoint(eCDomainParameters.getCurve(), eCPublicKeyParameters.getQ());
    if (eCPoint1.isInfinity())
      throw new IllegalStateException("Infinity is not a valid public key for ECVKO"); 
    ECPoint eCPoint2 = eCPoint1.multiply(bigInteger).normalize();
    if (eCPoint2.isInfinity())
      throw new IllegalStateException("Infinity is not a valid agreement value for ECVKO"); 
    byte[] arrayOfByte1 = eCPoint2.getEncoded(false);
    int i = arrayOfByte1.length;
    int j = i / 2;
    Arrays.reverseInPlace(arrayOfByte1, i - j * 2, j);
    Arrays.reverseInPlace(arrayOfByte1, i - j, j);
    byte[] arrayOfByte2 = new byte[this.digest.getDigestSize()];
    this.digest.update(arrayOfByte1, i - j * 2, j * 2);
    this.digest.doFinal(arrayOfByte2, 0);
    return arrayOfByte2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\agreement\ECVKOAgreement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */