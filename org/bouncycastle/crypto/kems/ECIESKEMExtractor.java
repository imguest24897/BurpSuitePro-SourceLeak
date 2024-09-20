package org.bouncycastle.crypto.kems;

import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class ECIESKEMExtractor implements EncapsulatedSecretExtractor {
  private final ECPrivateKeyParameters decKey;
  
  private int keyLen;
  
  private DerivationFunction kdf;
  
  private boolean CofactorMode;
  
  private boolean OldCofactorMode;
  
  private boolean SingleHashMode;
  
  public ECIESKEMExtractor(ECPrivateKeyParameters paramECPrivateKeyParameters, int paramInt, DerivationFunction paramDerivationFunction) {
    this.decKey = paramECPrivateKeyParameters;
    this.keyLen = paramInt;
    this.kdf = paramDerivationFunction;
    this.CofactorMode = false;
    this.OldCofactorMode = false;
    this.SingleHashMode = false;
  }
  
  public ECIESKEMExtractor(ECPrivateKeyParameters paramECPrivateKeyParameters, int paramInt, DerivationFunction paramDerivationFunction, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.decKey = paramECPrivateKeyParameters;
    this.keyLen = paramInt;
    this.kdf = paramDerivationFunction;
    this.CofactorMode = paramBoolean1;
    if (paramBoolean1) {
      this.OldCofactorMode = false;
    } else {
      this.OldCofactorMode = paramBoolean2;
    } 
    this.SingleHashMode = paramBoolean3;
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("ECIESKem", ConstraintUtils.bitsOfSecurityFor(this.decKey.getParameters().getCurve()), paramECPrivateKeyParameters, CryptoServicePurpose.DECRYPTION));
  }
  
  public byte[] extractSecret(byte[] paramArrayOfbyte) {
    ECPrivateKeyParameters eCPrivateKeyParameters = this.decKey;
    ECDomainParameters eCDomainParameters = eCPrivateKeyParameters.getParameters();
    ECCurve eCCurve = eCDomainParameters.getCurve();
    BigInteger bigInteger1 = eCDomainParameters.getN();
    BigInteger bigInteger2 = eCDomainParameters.getH();
    ECPoint eCPoint1 = eCCurve.decodePoint(paramArrayOfbyte);
    if (this.CofactorMode || this.OldCofactorMode)
      eCPoint1 = eCPoint1.multiply(bigInteger2); 
    BigInteger bigInteger3 = eCPrivateKeyParameters.getD();
    if (this.CofactorMode)
      bigInteger3 = bigInteger3.multiply(eCDomainParameters.getHInv()).mod(bigInteger1); 
    ECPoint eCPoint2 = eCPoint1.multiply(bigInteger3).normalize();
    byte[] arrayOfByte = eCPoint2.getAffineXCoord().getEncoded();
    return ECIESKEMGenerator.deriveKey(this.SingleHashMode, this.kdf, this.keyLen, paramArrayOfbyte, arrayOfByte);
  }
  
  public int getEncapsulationLength() {
    return this.decKey.getParameters().getCurve().getFieldSize() / 8 * 2 + 1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\kems\ECIESKEMExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */