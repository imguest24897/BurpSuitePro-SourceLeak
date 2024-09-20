package org.bouncycastle.its.bc;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.its.ITSPublicEncryptionKey;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.BasePublicEncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccCurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP256CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SymmAlgorithm;

public class BcITSPublicEncryptionKey extends ITSPublicEncryptionKey {
  public BcITSPublicEncryptionKey(PublicEncryptionKey paramPublicEncryptionKey) {
    super(paramPublicEncryptionKey);
  }
  
  static PublicEncryptionKey fromKeyParameters(ECPublicKeyParameters paramECPublicKeyParameters) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = ((ECNamedDomainParameters)paramECPublicKeyParameters.getParameters()).getName();
    ECPoint eCPoint = paramECPublicKeyParameters.getQ();
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)SECObjectIdentifiers.secp256r1))
      return new PublicEncryptionKey(SymmAlgorithm.aes128Ccm, (new BasePublicEncryptionKey.Builder()).setChoice(0).setValue((EccCurvePoint)EccP256CurvePoint.uncompressedP256(eCPoint.getAffineXCoord().toBigInteger(), eCPoint.getAffineYCoord().toBigInteger())).createBasePublicEncryptionKey()); 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)TeleTrusTObjectIdentifiers.brainpoolP256r1))
      return new PublicEncryptionKey(SymmAlgorithm.aes128Ccm, (new BasePublicEncryptionKey.Builder()).setChoice(1).setValue((EccCurvePoint)EccP256CurvePoint.uncompressedP256(eCPoint.getAffineXCoord().toBigInteger(), eCPoint.getAffineYCoord().toBigInteger())).createBasePublicEncryptionKey()); 
    throw new IllegalArgumentException("unknown curve in public encryption key");
  }
  
  public BcITSPublicEncryptionKey(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    super(fromKeyParameters((ECPublicKeyParameters)paramAsymmetricKeyParameter));
  }
  
  public AsymmetricKeyParameter getKey() {
    X9ECParameters x9ECParameters;
    ASN1ObjectIdentifier aSN1ObjectIdentifier;
    EccCurvePoint eccCurvePoint;
    byte[] arrayOfByte;
    BasePublicEncryptionKey basePublicEncryptionKey = this.encryptionKey.getPublicKey();
    switch (basePublicEncryptionKey.getChoice()) {
      case 0:
        aSN1ObjectIdentifier = SECObjectIdentifiers.secp256r1;
        x9ECParameters = NISTNamedCurves.getByOID(SECObjectIdentifiers.secp256r1);
        break;
      case 1:
        aSN1ObjectIdentifier = TeleTrusTObjectIdentifiers.brainpoolP256r1;
        x9ECParameters = TeleTrusTNamedCurves.getByOID(TeleTrusTObjectIdentifiers.brainpoolP256r1);
        break;
      default:
        throw new IllegalStateException("unknown key type");
    } 
    ECCurve eCCurve = x9ECParameters.getCurve();
    ASN1Encodable aSN1Encodable = this.encryptionKey.getPublicKey().getBasePublicEncryptionKey();
    if (aSN1Encodable instanceof EccCurvePoint) {
      eccCurvePoint = (EccCurvePoint)basePublicEncryptionKey.getBasePublicEncryptionKey();
    } else {
      throw new IllegalStateException("extension to public verification key not supported");
    } 
    if (eccCurvePoint instanceof EccP256CurvePoint) {
      arrayOfByte = eccCurvePoint.getEncodedPoint();
    } else if (eccCurvePoint instanceof org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP384CurvePoint) {
      arrayOfByte = eccCurvePoint.getEncodedPoint();
    } else {
      throw new IllegalStateException("unknown key type");
    } 
    ECPoint eCPoint = eCCurve.decodePoint(arrayOfByte).normalize();
    return (AsymmetricKeyParameter)new ECPublicKeyParameters(eCPoint, (ECDomainParameters)new ECNamedDomainParameters(aSN1ObjectIdentifier, x9ECParameters));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\bc\BcITSPublicEncryptionKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */