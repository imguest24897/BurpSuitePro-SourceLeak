package org.bouncycastle.crypto.agreement;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.DHKeyParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;

class Utils {
  static CryptoServiceProperties getDefaultProperties(String paramString, ECKeyParameters paramECKeyParameters) {
    return (CryptoServiceProperties)new DefaultServiceProperties(paramString, ConstraintUtils.bitsOfSecurityFor(paramECKeyParameters.getParameters().getCurve()), paramECKeyParameters, CryptoServicePurpose.AGREEMENT);
  }
  
  static CryptoServiceProperties getDefaultProperties(String paramString, DHKeyParameters paramDHKeyParameters) {
    return (CryptoServiceProperties)new DefaultServiceProperties(paramString, ConstraintUtils.bitsOfSecurityFor(paramDHKeyParameters.getParameters().getP()), paramDHKeyParameters, CryptoServicePurpose.AGREEMENT);
  }
  
  static CryptoServiceProperties getDefaultProperties(String paramString, X448PrivateKeyParameters paramX448PrivateKeyParameters) {
    return (CryptoServiceProperties)new DefaultServiceProperties(paramString, 224, paramX448PrivateKeyParameters, CryptoServicePurpose.AGREEMENT);
  }
  
  static CryptoServiceProperties getDefaultProperties(String paramString, X25519PrivateKeyParameters paramX25519PrivateKeyParameters) {
    return (CryptoServiceProperties)new DefaultServiceProperties(paramString, 128, paramX25519PrivateKeyParameters, CryptoServicePurpose.AGREEMENT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\agreement\Utils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */