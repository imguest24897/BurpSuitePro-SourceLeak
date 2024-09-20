package org.bouncycastle.crypto.signers;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.DSAKeyParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.GOST3410KeyParameters;

class Utils {
  static CryptoServiceProperties getDefaultProperties(String paramString, DSAKeyParameters paramDSAKeyParameters, boolean paramBoolean) {
    return (CryptoServiceProperties)new DefaultServiceProperties(paramString, ConstraintUtils.bitsOfSecurityFor(paramDSAKeyParameters.getParameters().getP()), paramDSAKeyParameters, getPurpose(paramBoolean));
  }
  
  static CryptoServiceProperties getDefaultProperties(String paramString, GOST3410KeyParameters paramGOST3410KeyParameters, boolean paramBoolean) {
    return (CryptoServiceProperties)new DefaultServiceProperties(paramString, ConstraintUtils.bitsOfSecurityFor(paramGOST3410KeyParameters.getParameters().getP()), paramGOST3410KeyParameters, getPurpose(paramBoolean));
  }
  
  static CryptoServiceProperties getDefaultProperties(String paramString, ECKeyParameters paramECKeyParameters, boolean paramBoolean) {
    return (CryptoServiceProperties)new DefaultServiceProperties(paramString, ConstraintUtils.bitsOfSecurityFor(paramECKeyParameters.getParameters().getCurve()), paramECKeyParameters, getPurpose(paramBoolean));
  }
  
  static CryptoServiceProperties getDefaultProperties(String paramString, int paramInt, CipherParameters paramCipherParameters, boolean paramBoolean) {
    return (CryptoServiceProperties)new DefaultServiceProperties(paramString, paramInt, paramCipherParameters, getPurpose(paramBoolean));
  }
  
  static CryptoServicePurpose getPurpose(boolean paramBoolean) {
    return paramBoolean ? CryptoServicePurpose.SIGNING : CryptoServicePurpose.VERIFYING;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\signers\Utils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */