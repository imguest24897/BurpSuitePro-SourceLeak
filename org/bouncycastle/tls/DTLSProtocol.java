package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.util.Arrays;

public abstract class DTLSProtocol {
  protected void processFinished(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte1);
    byte[] arrayOfByte = TlsUtils.readFully(paramArrayOfbyte2.length, byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
    if (!Arrays.constantTimeAreEqual(paramArrayOfbyte2, arrayOfByte))
      throw new TlsFatalAlert((short)40); 
  }
  
  protected static void applyMaxFragmentLengthExtension(DTLSRecordLayer paramDTLSRecordLayer, short paramShort) throws IOException {
    if (paramShort >= 0) {
      if (!MaxFragmentLength.isValid(paramShort))
        throw new TlsFatalAlert((short)80); 
      int i = 1 << 8 + paramShort;
      paramDTLSRecordLayer.setPlaintextLimit(i);
    } 
  }
  
  protected static short evaluateMaxFragmentLengthExtension(boolean paramBoolean, Hashtable paramHashtable1, Hashtable paramHashtable2, short paramShort) throws IOException {
    return TlsUtils.processMaxFragmentLengthExtension(paramBoolean ? null : paramHashtable1, paramHashtable2, paramShort);
  }
  
  protected static byte[] generateCertificate(TlsContext paramTlsContext, Certificate paramCertificate, OutputStream paramOutputStream) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramCertificate.encode(paramTlsContext, byteArrayOutputStream, paramOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  protected static byte[] generateSupplementalData(Vector paramVector) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    TlsProtocol.writeSupplementalData(byteArrayOutputStream, paramVector);
    return byteArrayOutputStream.toByteArray();
  }
  
  protected static void sendCertificateMessage(TlsContext paramTlsContext, DTLSReliableHandshake paramDTLSReliableHandshake, Certificate paramCertificate, OutputStream paramOutputStream) throws IOException {
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    if (null != securityParameters.getLocalCertificate())
      throw new TlsFatalAlert((short)80); 
    if (null == paramCertificate)
      paramCertificate = Certificate.EMPTY_CHAIN; 
    byte[] arrayOfByte = generateCertificate(paramTlsContext, paramCertificate, paramOutputStream);
    paramDTLSReliableHandshake.sendMessage((short)11, arrayOfByte);
    securityParameters.localCertificate = paramCertificate;
  }
  
  protected static int validateSelectedCipherSuite(int paramInt, short paramShort) throws IOException {
    int i = TlsUtils.getEncryptionAlgorithm(paramInt);
    if (0 != i) {
      int j = TlsUtils.getEncryptionAlgorithmType(i);
      if (j < 0 || 0 == j)
        throw new TlsFatalAlert(paramShort); 
    } 
    return paramInt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DTLSProtocol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */