package org.bouncycastle.oer.its.template.etsi102941;

import java.math.BigInteger;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.etsi102941.basetypes.EtsiTs102941BaseTypes;
import org.bouncycastle.oer.its.template.etsi103097.EtsiTs103097Module;

public class EtsiTs102941TypesEnrolment {
  public static final OERDefinition.Builder EnrolmentResponseCode = OERDefinition.enumeration(new Object[] { 
        OERDefinition.enumItem("ok", BigInteger.ZERO), "cantparse", "badcontenttype", "imnottherecipient", "unknownencryptionalgorithm", "decryptionfailed", "unknownits", "invalidsignature", "invalidencryptionkey", "baditsstatus", 
        "incompleterequest", "deniedpermissions", "invalidkeys", "deniedrequest", OERDefinition.extension(new Object[0]) }).typeName("EnrolmentResponseCode");
  
  public static final OERDefinition.Builder InnerEcResponse = OERDefinition.seq(new Object[] { OERDefinition.octets(16).label("requestHash"), EnrolmentResponseCode.label("responseCode"), OERDefinition.optional(new Object[] { EtsiTs103097Module.EtsiTs103097Certificate.label("certificate") }), OERDefinition.extension(new Object[0]) }).typeName("InnerEcResponse");
  
  public static final OERDefinition.Builder InnerEcRequest = OERDefinition.seq(new Object[] { OERDefinition.octets().label("itsId"), EtsiTs102941BaseTypes.CertificateFormat.label("certificateFormat"), EtsiTs102941BaseTypes.PublicKeys.label("publicKeys"), EtsiTs102941BaseTypes.CertificateSubjectAttributes.label("requestedSubjectAttributes"), OERDefinition.extension(new Object[0]) }).typeName("InnerEcRequest");
  
  public static final OERDefinition.Builder InnerEcRequestSignedForPop = EtsiTs103097Module.EtsiTs103097Data_Signed.typeName("InnerEcRequestSignedForPop");
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\template\etsi102941\EtsiTs102941TypesEnrolment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */