package org.bouncycastle.oer.its.template.ieee1609dot2dot1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;
import org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes;

public class Ieee1609Dot2Dot1EcaEeInterface {
  public static final OERDefinition.Builder EeEcaCertRequest = OERDefinition.seq(new Object[] { Ieee1609Dot2BaseTypes.UINT8.label("version").validSwitchValue(new ASN1Encodable[] { (ASN1Encodable)new ASN1Integer(2L) }), Ieee1609Dot2BaseTypes.Time32.label("generationTime"), IEEE1609dot2.CertificateType.label("type"), IEEE1609dot2.ToBeSignedCertificate.label("tbsCert"), OERDefinition.optional(new Object[] { OERDefinition.ia5String().label("canonicalId") }), OERDefinition.extension(new Object[0]) }).typeName("EeEcaCertRequest");
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\template\ieee1609dot2dot1\Ieee1609Dot2Dot1EcaEeInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */