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
import org.bouncycastle.its.ITSPublicVerificationKey;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccCurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP256CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP384CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Point256;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Point384;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;

public class BcITSPublicVerificationKey extends ITSPublicVerificationKey {
  public BcITSPublicVerificationKey(PublicVerificationKey paramPublicVerificationKey) {
    super(paramPublicVerificationKey);
  }
  
  static PublicVerificationKey fromKeyParameters(ECPublicKeyParameters paramECPublicKeyParameters) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = ((ECNamedDomainParameters)paramECPublicKeyParameters.getParameters()).getName();
    ECPoint eCPoint = paramECPublicKeyParameters.getQ();
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)SECObjectIdentifiers.secp256r1))
      return new PublicVerificationKey(0, (ASN1Encodable)EccP256CurvePoint.uncompressedP256(Point256.builder().setX(eCPoint.getAffineXCoord().toBigInteger()).setY(eCPoint.getAffineYCoord().toBigInteger()).createPoint256())); 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)TeleTrusTObjectIdentifiers.brainpoolP256r1))
      return new PublicVerificationKey(1, (ASN1Encodable)EccP256CurvePoint.uncompressedP256(Point256.builder().setX(eCPoint.getAffineXCoord().toBigInteger()).setY(eCPoint.getAffineYCoord().toBigInteger()).createPoint256())); 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)TeleTrusTObjectIdentifiers.brainpoolP384r1))
      return new PublicVerificationKey(2, (ASN1Encodable)EccP384CurvePoint.uncompressedP384(Point384.builder().setX(eCPoint.getAffineXCoord().toBigInteger()).setY(eCPoint.getAffineYCoord().toBigInteger()).createPoint384())); 
    throw new IllegalArgumentException("unknown curve in public encryption key");
  }
  
  public BcITSPublicVerificationKey(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    super(fromKeyParameters((ECPublicKeyParameters)paramAsymmetricKeyParameter));
  }
  
  public AsymmetricKeyParameter getKey() {
    X9ECParameters x9ECParameters;
    ASN1ObjectIdentifier aSN1ObjectIdentifier;
    EccCurvePoint eccCurvePoint;
    byte[] arrayOfByte;
    switch (this.verificationKey.getChoice()) {
      case 0:
        aSN1ObjectIdentifier = SECObjectIdentifiers.secp256r1;
        x9ECParameters = NISTNamedCurves.getByOID(SECObjectIdentifiers.secp256r1);
        break;
      case 1:
        aSN1ObjectIdentifier = TeleTrusTObjectIdentifiers.brainpoolP256r1;
        x9ECParameters = TeleTrusTNamedCurves.getByOID(TeleTrusTObjectIdentifiers.brainpoolP256r1);
        break;
      case 2:
        aSN1ObjectIdentifier = TeleTrusTObjectIdentifiers.brainpoolP384r1;
        x9ECParameters = TeleTrusTNamedCurves.getByOID(TeleTrusTObjectIdentifiers.brainpoolP384r1);
        break;
      default:
        throw new IllegalStateException("unknown key type");
    } 
    ECCurve eCCurve = x9ECParameters.getCurve();
    ASN1Encodable aSN1Encodable = this.verificationKey.getPublicVerificationKey();
    if (aSN1Encodable instanceof EccCurvePoint) {
      eccCurvePoint = (EccCurvePoint)this.verificationKey.getPublicVerificationKey();
    } else {
      throw new IllegalStateException("extension to public verification key not supported");
    } 
    if (eccCurvePoint instanceof EccP256CurvePoint) {
      arrayOfByte = eccCurvePoint.getEncodedPoint();
    } else if (eccCurvePoint instanceof EccP384CurvePoint) {
      arrayOfByte = eccCurvePoint.getEncodedPoint();
    } else {
      throw new IllegalStateException("unknown key type");
    } 
    ECPoint eCPoint = eCCurve.decodePoint(arrayOfByte).normalize();
    return (AsymmetricKeyParameter)new ECPublicKeyParameters(eCPoint, (ECDomainParameters)new ECNamedDomainParameters(aSN1ObjectIdentifier, x9ECParameters));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\bc\BcITSPublicVerificationKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */