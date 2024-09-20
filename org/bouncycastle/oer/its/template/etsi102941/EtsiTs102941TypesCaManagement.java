package org.bouncycastle.oer.its.template.etsi102941;

import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.etsi102941.basetypes.EtsiTs102941BaseTypes;

public class EtsiTs102941TypesCaManagement {
  public static final OERDefinition.Builder CaCertificateRequest = OERDefinition.seq(new Object[] { EtsiTs102941BaseTypes.PublicKeys.label("publicKeys"), EtsiTs102941BaseTypes.CertificateSubjectAttributes.label("requestedSubjectAttributes") }).typeName("CaCertificateRequest");
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\template\etsi102941\EtsiTs102941TypesCaManagement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */