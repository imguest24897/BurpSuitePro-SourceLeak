package org.bouncycastle.its.jcajce;

import java.security.KeyFactory;
import java.security.Provider;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.its.ITSPublicVerificationKey;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccCurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP256CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP384CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Point256;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Point384;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;

public class JcaITSPublicVerificationKey extends ITSPublicVerificationKey {
  private final JcaJceHelper helper;
  
  JcaITSPublicVerificationKey(PublicVerificationKey paramPublicVerificationKey, JcaJceHelper paramJcaJceHelper) {
    super(paramPublicVerificationKey);
    this.helper = paramJcaJceHelper;
  }
  
  JcaITSPublicVerificationKey(PublicKey paramPublicKey, JcaJceHelper paramJcaJceHelper) {
    super(fromKeyParameters((ECPublicKey)paramPublicKey));
    this.helper = paramJcaJceHelper;
  }
  
  static PublicVerificationKey fromKeyParameters(ECPublicKey paramECPublicKey) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(SubjectPublicKeyInfo.getInstance(paramECPublicKey.getEncoded()).getAlgorithm().getParameters());
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)SECObjectIdentifiers.secp256r1))
      return new PublicVerificationKey(0, (ASN1Encodable)EccP256CurvePoint.uncompressedP256(Point256.builder().setX(paramECPublicKey.getW().getAffineX()).setY(paramECPublicKey.getW().getAffineY()).createPoint256())); 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)TeleTrusTObjectIdentifiers.brainpoolP256r1))
      return new PublicVerificationKey(1, (ASN1Encodable)EccP256CurvePoint.uncompressedP256(Point256.builder().setX(paramECPublicKey.getW().getAffineX()).setY(paramECPublicKey.getW().getAffineY()).createPoint256())); 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)TeleTrusTObjectIdentifiers.brainpoolP384r1))
      return new PublicVerificationKey(2, (ASN1Encodable)EccP384CurvePoint.uncompressedP384(Point384.builder().setX(paramECPublicKey.getW().getAffineX()).setY(paramECPublicKey.getW().getAffineY()).createPoint384())); 
    throw new IllegalArgumentException("unknown curve in public encryption key");
  }
  
  public PublicKey getKey() {
    X9ECParameters x9ECParameters;
    EccCurvePoint eccCurvePoint;
    byte[] arrayOfByte;
    switch (this.verificationKey.getChoice()) {
      case 0:
        x9ECParameters = NISTNamedCurves.getByOID(SECObjectIdentifiers.secp256r1);
        break;
      case 1:
        x9ECParameters = TeleTrusTNamedCurves.getByOID(TeleTrusTObjectIdentifiers.brainpoolP256r1);
        break;
      case 2:
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
    try {
      KeyFactory keyFactory = this.helper.createKeyFactory("EC");
      ECParameterSpec eCParameterSpec = ECUtil.convertToSpec(x9ECParameters);
      ECPoint eCPoint1 = ECUtil.convertPoint(eCPoint);
      return keyFactory.generatePublic(new ECPublicKeySpec(eCPoint1, eCParameterSpec));
    } catch (Exception exception) {
      throw new IllegalStateException(exception.getMessage(), exception);
    } 
  }
  
  public static class Builder {
    private JcaJceHelper helper = (JcaJceHelper)new DefaultJcaJceHelper();
    
    public Builder setProvider(Provider param1Provider) {
      this.helper = (JcaJceHelper)new ProviderJcaJceHelper(param1Provider);
      return this;
    }
    
    public Builder setProvider(String param1String) {
      this.helper = (JcaJceHelper)new NamedJcaJceHelper(param1String);
      return this;
    }
    
    public JcaITSPublicVerificationKey build(PublicVerificationKey param1PublicVerificationKey) {
      return new JcaITSPublicVerificationKey(param1PublicVerificationKey, this.helper);
    }
    
    public JcaITSPublicVerificationKey build(PublicKey param1PublicKey) {
      return new JcaITSPublicVerificationKey(param1PublicKey, this.helper);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\jcajce\JcaITSPublicVerificationKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */