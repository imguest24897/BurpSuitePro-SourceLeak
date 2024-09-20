package org.bouncycastle.its.operator;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP256CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP384CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EcdsaP256Signature;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EcdsaP384Signature;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Signature;
import org.bouncycastle.util.BigIntegers;

public class ECDSAEncoder {
  public static byte[] toX962(Signature paramSignature) {
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    if (paramSignature.getChoice() == 0 || paramSignature.getChoice() == 1) {
      EcdsaP256Signature ecdsaP256Signature = EcdsaP256Signature.getInstance(paramSignature.getSignature());
      arrayOfByte1 = ASN1OctetString.getInstance(ecdsaP256Signature.getRSig().getEccp256CurvePoint()).getOctets();
      arrayOfByte2 = ecdsaP256Signature.getSSig().getOctets();
    } else {
      EcdsaP384Signature ecdsaP384Signature = EcdsaP384Signature.getInstance(paramSignature.getSignature());
      arrayOfByte1 = ASN1OctetString.getInstance(ecdsaP384Signature.getRSig().getEccP384CurvePoint()).getOctets();
      arrayOfByte2 = ecdsaP384Signature.getSSig().getOctets();
    } 
    try {
      return (new DERSequence(new ASN1Encodable[] { (ASN1Encodable)new ASN1Integer(BigIntegers.fromUnsignedByteArray(arrayOfByte1)), (ASN1Encodable)new ASN1Integer(BigIntegers.fromUnsignedByteArray(arrayOfByte2)) })).getEncoded();
    } catch (IOException iOException) {
      throw new RuntimeException("der encoding r & s");
    } 
  }
  
  public static Signature toITS(ASN1ObjectIdentifier paramASN1ObjectIdentifier, byte[] paramArrayOfbyte) {
    ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(paramArrayOfbyte);
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)SECObjectIdentifiers.secp256r1))
      return new Signature(0, (ASN1Encodable)new EcdsaP256Signature(new EccP256CurvePoint(0, (ASN1Encodable)new DEROctetString(BigIntegers.asUnsignedByteArray(32, ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue()))), (ASN1OctetString)new DEROctetString(BigIntegers.asUnsignedByteArray(32, ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue())))); 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)TeleTrusTObjectIdentifiers.brainpoolP256r1))
      return new Signature(1, (ASN1Encodable)new EcdsaP256Signature(new EccP256CurvePoint(0, (ASN1Encodable)new DEROctetString(BigIntegers.asUnsignedByteArray(32, ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue()))), (ASN1OctetString)new DEROctetString(BigIntegers.asUnsignedByteArray(32, ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue())))); 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)TeleTrusTObjectIdentifiers.brainpoolP384r1))
      return new Signature(2, (ASN1Encodable)new EcdsaP384Signature(new EccP384CurvePoint(0, (ASN1Encodable)new DEROctetString(BigIntegers.asUnsignedByteArray(48, ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue()))), (ASN1OctetString)new DEROctetString(BigIntegers.asUnsignedByteArray(48, ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue())))); 
    throw new IllegalArgumentException("unknown curveID");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\operator\ECDSAEncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */