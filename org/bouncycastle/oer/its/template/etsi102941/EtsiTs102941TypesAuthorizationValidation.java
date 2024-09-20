package org.bouncycastle.oer.its.template.etsi102941;

import java.math.BigInteger;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.etsi102941.basetypes.EtsiTs102941BaseTypes;

public class EtsiTs102941TypesAuthorizationValidation {
  public static final OERDefinition.Builder AuthorizationValidationResponseCode = OERDefinition.enumeration(new Object[] { 
        OERDefinition.enumItem("ok", BigInteger.ZERO), "cantparse", "badcontenttype", "imnottherecipient", "unknownencryptionalgorithm", "decryptionfailed", "invalidaa", "invalidaasignature", "wrongea", "unknownits", 
        "invalidsignature", "invalidencryptionkey", "deniedpermissions", "deniedtoomanycerts", "deniedrequest" }).typeName("AuthorizationValidationResponseCode");
  
  public static final OERDefinition.Builder AuthorizationValidationRequest = OERDefinition.seq(new Object[] { EtsiTs102941TypesAuthorization.SharedAtRequest.label("sharedAtRequest"), EtsiTs102941BaseTypes.EcSignature.label("ecSignature"), OERDefinition.extension(new Object[0]) }).typeName("AuthorizationValidationRequest");
  
  public static final OERDefinition.Builder AuthorizationValidationResponse = OERDefinition.seq(new Object[] { OERDefinition.octets(16).label("requestHash"), AuthorizationValidationResponseCode.label("responseCode"), OERDefinition.optional(new Object[] { EtsiTs102941BaseTypes.CertificateSubjectAttributes.label("confirmedSubjectAttributes") }), OERDefinition.extension(new Object[0]) }).typeName("AuthorizationValidationResponse");
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\template\etsi102941\EtsiTs102941TypesAuthorizationValidation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */