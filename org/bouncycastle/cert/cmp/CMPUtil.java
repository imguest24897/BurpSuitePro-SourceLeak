package org.bouncycastle.cert.cmp;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;

class CMPUtil {
  static byte[] calculateCertHash(ASN1Object paramASN1Object, AlgorithmIdentifier paramAlgorithmIdentifier, DigestCalculatorProvider paramDigestCalculatorProvider, DigestAlgorithmIdentifierFinder paramDigestAlgorithmIdentifierFinder) throws CMPException {
    AlgorithmIdentifier algorithmIdentifier = paramDigestAlgorithmIdentifierFinder.find(paramAlgorithmIdentifier);
    if (algorithmIdentifier == null)
      throw new CMPException("cannot find digest algorithm from signature algorithm"); 
    return calculateDigest(paramASN1Object, algorithmIdentifier, paramDigestCalculatorProvider);
  }
  
  static byte[] calculateDigest(ASN1Object paramASN1Object, AlgorithmIdentifier paramAlgorithmIdentifier, DigestCalculatorProvider paramDigestCalculatorProvider) throws CMPException {
    DigestCalculator digestCalculator = getDigestCalculator(paramAlgorithmIdentifier, paramDigestCalculatorProvider);
    derEncodeToStream(paramASN1Object, digestCalculator.getOutputStream());
    return digestCalculator.getDigest();
  }
  
  static void derEncodeToStream(ASN1Object paramASN1Object, OutputStream paramOutputStream) {
    try {
      paramASN1Object.encodeTo(paramOutputStream, "DER");
      paramOutputStream.close();
    } catch (IOException iOException) {
      throw new CMPRuntimeException("unable to DER encode object: " + iOException.getMessage(), iOException);
    } 
  }
  
  static DigestCalculator getDigestCalculator(AlgorithmIdentifier paramAlgorithmIdentifier, DigestCalculatorProvider paramDigestCalculatorProvider) throws CMPException {
    try {
      return paramDigestCalculatorProvider.get(paramAlgorithmIdentifier);
    } catch (OperatorCreationException operatorCreationException) {
      throw new CMPException("unable to create digester: " + operatorCreationException.getMessage(), operatorCreationException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\cmp\CMPUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */