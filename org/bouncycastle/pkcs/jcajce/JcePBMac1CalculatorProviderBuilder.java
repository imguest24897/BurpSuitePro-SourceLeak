package org.bouncycastle.pkcs.jcajce;

import java.security.Provider;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PBMAC1Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.PBEMacCalculatorProvider;

public class JcePBMac1CalculatorProviderBuilder {
  private JcaJceHelper helper = (JcaJceHelper)new DefaultJcaJceHelper();
  
  public JcePBMac1CalculatorProviderBuilder setProvider(Provider paramProvider) {
    this.helper = (JcaJceHelper)new ProviderJcaJceHelper(paramProvider);
    return this;
  }
  
  public JcePBMac1CalculatorProviderBuilder setProvider(String paramString) {
    this.helper = (JcaJceHelper)new NamedJcaJceHelper(paramString);
    return this;
  }
  
  public PBEMacCalculatorProvider build() {
    return new PBEMacCalculatorProvider() {
        public MacCalculator get(AlgorithmIdentifier param1AlgorithmIdentifier, char[] param1ArrayOfchar) throws OperatorCreationException {
          if (!PKCSObjectIdentifiers.id_PBMAC1.equals((ASN1Primitive)param1AlgorithmIdentifier.getAlgorithm()))
            throw new OperatorCreationException("protection algorithm not PB mac based"); 
          JcePBMac1CalculatorBuilder jcePBMac1CalculatorBuilder = (new JcePBMac1CalculatorBuilder(PBMAC1Params.getInstance(param1AlgorithmIdentifier.getParameters()))).setHelper(JcePBMac1CalculatorProviderBuilder.this.helper);
          return jcePBMac1CalculatorBuilder.build(param1ArrayOfchar);
        }
      };
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkcs\jcajce\JcePBMac1CalculatorProviderBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */