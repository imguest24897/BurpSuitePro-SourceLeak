package org.bouncycastle.oer.its.template.etsi103097.extension;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.oer.Element;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.Switch;
import org.bouncycastle.oer.SwitchIndexer;
import org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes;

public class EtsiTs103097ExtensionModule {
  public static final ASN1Integer etsiTs102941CrlRequestId = new ASN1Integer(1L);
  
  public static final ASN1Integer etsiTs102941DeltaCtlRequestId = new ASN1Integer(2L);
  
  private static final ASN1Encodable[] extensionKeys = new ASN1Encodable[] { (ASN1Encodable)etsiTs102941CrlRequestId, (ASN1Encodable)etsiTs102941DeltaCtlRequestId };
  
  public static final OERDefinition.Builder ExtId = OERDefinition.integer(0L, 255L).validSwitchValue(new ASN1Encodable[] { (ASN1Encodable)etsiTs102941CrlRequestId, (ASN1Encodable)etsiTs102941DeltaCtlRequestId }).typeName("ExtId");
  
  public static final OERDefinition.Builder EtsiTs102941CrlRequest = OERDefinition.seq(new Object[] { Ieee1609Dot2BaseTypes.HashedId8.label("issuerId"), OERDefinition.optional(new Object[] { Ieee1609Dot2BaseTypes.Time32.label("lastKnownUpdate") }) }).typeName("EtsiTs102941CrlRequest");
  
  public static final OERDefinition.Builder EtsiTs102941CtlRequest = OERDefinition.seq(new Object[] { Ieee1609Dot2BaseTypes.HashedId8.label("issuerId"), OERDefinition.optional(new Object[] { OERDefinition.integer(0L, 255L).label("lastKnownCtlSequence") }) }).typeName("EtsiTs102941CtlRequest");
  
  public static final OERDefinition.Builder EtsiTs102941DeltaCtlRequest = EtsiTs102941CtlRequest.typeName("EtsiTs102941DeltaCtlRequest");
  
  public static final OERDefinition.Builder Extension = OERDefinition.seq(new Object[] { ExtId.label("id"), OERDefinition.aSwitch(new Switch() {
            private final Element etsiTs102941CrlRequestIdDef = EtsiTs103097ExtensionModule.EtsiTs102941CrlRequest.label("content").build();
            
            private final Element etsiTs102941DeltaCtlRequestIdDef = EtsiTs103097ExtensionModule.EtsiTs102941DeltaCtlRequest.label("content").build();
            
            public Element result(SwitchIndexer param1SwitchIndexer) {
              ASN1Integer aSN1Integer = ASN1Integer.getInstance(param1SwitchIndexer.get(0).toASN1Primitive());
              if (aSN1Integer.equals((ASN1Primitive)EtsiTs103097ExtensionModule.etsiTs102941CrlRequestId))
                return this.etsiTs102941CrlRequestIdDef; 
              if (aSN1Integer.equals((ASN1Primitive)EtsiTs103097ExtensionModule.etsiTs102941DeltaCtlRequestId))
                return this.etsiTs102941DeltaCtlRequestIdDef; 
              throw new IllegalStateException("unknown extension type " + aSN1Integer);
            }
            
            public ASN1Encodable[] keys() {
              return EtsiTs103097ExtensionModule.extensionKeys;
            }
          }).label("content") }).typeName("Extension");
  
  public static final OERDefinition.Builder EtsiOriginatingHeaderInfoExtension = Extension.typeName("EtsiOriginatingHeaderInfoExtension");
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\template\etsi103097\extension\EtsiTs103097ExtensionModule.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */