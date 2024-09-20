package org.bouncycastle.oer.its.template.etsi102941;

import java.math.BigInteger;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.etsi102941.basetypes.EtsiTs102941BaseTypes;
import org.bouncycastle.oer.its.template.etsi103097.EtsiTs103097Module;
import org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes;

public class EtsiTs102941TypesAuthorization {
  public static final OERDefinition.Builder AuthorizationResponseCode = OERDefinition.enumeration(new Object[] { 
        OERDefinition.enumItem("ok", BigInteger.ZERO), "its-aa-cantparse", "its-aa-badcontenttype", "its-aa-imnottherecipient", "its-aa-unknownencryptionalgorithm", "its-aa-decryptionfailed", "its-aa-keysdontmatch", "its-aa-incompleterequest", "its-aa-invalidencryptionkey", "its-aa-outofsyncrequest", 
        "its-aa-unknownea", "its-aa-invalidea", "its-aa-deniedpermissions", "aa-ea-cantreachea", "ea-aa-cantparse", "ea-aa-badcontenttype", "ea-aa-imnottherecipient", "ea-aa-unknownencryptionalgorithm", "ea-aa-decryptionfailed", "invalidaa", 
        "invalidaasignature", "wrongea", "unknownits", "invalidsignature", "invalidencryptionkey", "deniedpermissions", "deniedtoomanycerts" }).typeName("AuthorizationResponseCode");
  
  public static final OERDefinition.Builder InnerAtResponse = OERDefinition.seq(new Object[] { OERDefinition.octets(16).label("requestHash"), AuthorizationResponseCode.label("responseCode"), OERDefinition.optional(new Object[] { EtsiTs103097Module.EtsiTs103097Certificate.label("certificate") }), OERDefinition.extension(new Object[0]) }).typeName("InnerAtResponse");
  
  public static final OERDefinition.Builder SharedAtRequest = OERDefinition.seq(new Object[] { Ieee1609Dot2BaseTypes.HashedId8.label("eaId"), OERDefinition.octets(16).label("keyTag"), EtsiTs102941BaseTypes.CertificateFormat.label("certificateFormat"), EtsiTs102941BaseTypes.CertificateSubjectAttributes.label("requestedSubjectAttributes"), OERDefinition.extension(new Object[0]) }).typeName("SharedAtRequest");
  
  public static final OERDefinition.Builder InnerAtRequest = OERDefinition.seq(new Object[] { EtsiTs102941BaseTypes.PublicKeys.label("publicKeys"), OERDefinition.octets(32).label("hmacKey"), SharedAtRequest.label("sharedAtRequest"), EtsiTs102941BaseTypes.EcSignature.label("ecSignature") }).typeName("InnerAtRequest");
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\template\etsi102941\EtsiTs102941TypesAuthorization.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */