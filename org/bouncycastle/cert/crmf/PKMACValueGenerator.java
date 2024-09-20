package org.bouncycastle.cert.crmf;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.crmf.PKMACValue;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.MacCalculator;

abstract class PKMACValueGenerator {
  public static PKMACValue generate(PKMACBuilder paramPKMACBuilder, char[] paramArrayOfchar, SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws CRMFException {
    MacCalculator macCalculator = paramPKMACBuilder.build(paramArrayOfchar);
    OutputStream outputStream = macCalculator.getOutputStream();
    try {
      outputStream.write(paramSubjectPublicKeyInfo.getEncoded("DER"));
      outputStream.close();
    } catch (IOException iOException) {
      throw new CRMFException("exception encoding mac input: " + iOException.getMessage(), iOException);
    } 
    return new PKMACValue(macCalculator.getAlgorithmIdentifier(), new DERBitString(macCalculator.getMac()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\PKMACValueGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */