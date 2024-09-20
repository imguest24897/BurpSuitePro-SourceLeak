package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLASecurityCategory;

public class QTESLAParameterSpec implements AlgorithmParameterSpec {
  public static final String PROVABLY_SECURE_I = QTESLASecurityCategory.getName(5);
  
  public static final String PROVABLY_SECURE_III = QTESLASecurityCategory.getName(6);
  
  private String securityCategory;
  
  public QTESLAParameterSpec(String paramString) {
    this.securityCategory = paramString;
  }
  
  public String getSecurityCategory() {
    return this.securityCategory;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\spec\QTESLAParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */