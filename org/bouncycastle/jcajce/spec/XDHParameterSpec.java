package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;

public class XDHParameterSpec implements AlgorithmParameterSpec {
  public static final String X25519 = "X25519";
  
  public static final String X448 = "X448";
  
  private final String curveName;
  
  public XDHParameterSpec(String paramString) {
    if (paramString.equalsIgnoreCase("X25519")) {
      this.curveName = "X25519";
    } else if (paramString.equalsIgnoreCase("X448")) {
      this.curveName = "X448";
    } else if (paramString.equals(EdECObjectIdentifiers.id_X25519.getId())) {
      this.curveName = "X25519";
    } else if (paramString.equals(EdECObjectIdentifiers.id_X448.getId())) {
      this.curveName = "X448";
    } else {
      throw new IllegalArgumentException("unrecognized curve name: " + paramString);
    } 
  }
  
  public String getCurveName() {
    return this.curveName;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\spec\XDHParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */