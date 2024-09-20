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
import org.bouncycastle.its.ITSPublicEncryptionKey;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.BasePublicEncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccCurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP256CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SymmAlgorithm;

public class JceITSPublicEncryptionKey extends ITSPublicEncryptionKey {
  private final JcaJceHelper helper;
  
  JceITSPublicEncryptionKey(PublicEncryptionKey paramPublicEncryptionKey, JcaJceHelper paramJcaJceHelper) {
    super(paramPublicEncryptionKey);
    this.helper = paramJcaJceHelper;
  }
  
  JceITSPublicEncryptionKey(PublicKey paramPublicKey, JcaJceHelper paramJcaJceHelper) {
    super(fromPublicKey(paramPublicKey));
    this.helper = paramJcaJceHelper;
  }
  
  static PublicEncryptionKey fromPublicKey(PublicKey paramPublicKey) {
    if (!(paramPublicKey instanceof ECPublicKey))
      throw new IllegalArgumentException("must be ECPublicKey instance"); 
    ECPublicKey eCPublicKey = (ECPublicKey)paramPublicKey;
    ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()).getAlgorithm().getParameters());
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)SECObjectIdentifiers.secp256r1))
      return new PublicEncryptionKey(SymmAlgorithm.aes128Ccm, (new BasePublicEncryptionKey.Builder()).setChoice(0).setValue((EccCurvePoint)EccP256CurvePoint.uncompressedP256(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY())).createBasePublicEncryptionKey()); 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)TeleTrusTObjectIdentifiers.brainpoolP256r1))
      return new PublicEncryptionKey(SymmAlgorithm.aes128Ccm, (new BasePublicEncryptionKey.Builder()).setChoice(1).setValue((EccCurvePoint)EccP256CurvePoint.uncompressedP256(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY())).createBasePublicEncryptionKey()); 
    throw new IllegalArgumentException("unknown curve in public encryption key");
  }
  
  public PublicKey getKey() {
    X9ECParameters x9ECParameters;
    EccCurvePoint eccCurvePoint;
    byte[] arrayOfByte;
    BasePublicEncryptionKey basePublicEncryptionKey = this.encryptionKey.getPublicKey();
    switch (basePublicEncryptionKey.getChoice()) {
      case 0:
        x9ECParameters = NISTNamedCurves.getByOID(SECObjectIdentifiers.secp256r1);
        break;
      case 1:
        x9ECParameters = TeleTrusTNamedCurves.getByOID(TeleTrusTObjectIdentifiers.brainpoolP256r1);
        break;
      default:
        throw new IllegalStateException("unknown key type");
    } 
    ASN1Encodable aSN1Encodable = this.encryptionKey.getPublicKey().getBasePublicEncryptionKey();
    if (aSN1Encodable instanceof EccCurvePoint) {
      eccCurvePoint = (EccCurvePoint)basePublicEncryptionKey.getBasePublicEncryptionKey();
    } else {
      throw new IllegalStateException("extension to public verification key not supported");
    } 
    ECCurve eCCurve = x9ECParameters.getCurve();
    if (eccCurvePoint instanceof EccP256CurvePoint) {
      arrayOfByte = eccCurvePoint.getEncodedPoint();
    } else if (eccCurvePoint instanceof org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP384CurvePoint) {
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
    
    public JceITSPublicEncryptionKey build(PublicEncryptionKey param1PublicEncryptionKey) {
      return new JceITSPublicEncryptionKey(param1PublicEncryptionKey, this.helper);
    }
    
    public JceITSPublicEncryptionKey build(PublicKey param1PublicKey) {
      return new JceITSPublicEncryptionKey(param1PublicKey, this.helper);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\jcajce\JceITSPublicEncryptionKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */