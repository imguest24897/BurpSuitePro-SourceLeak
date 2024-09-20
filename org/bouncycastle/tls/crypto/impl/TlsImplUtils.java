package org.bouncycastle.tls.crypto.impl;

import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;

public class TlsImplUtils {
  public static boolean isSSL(TlsCryptoParameters paramTlsCryptoParameters) {
    return paramTlsCryptoParameters.getServerVersion().isSSL();
  }
  
  public static boolean isTLSv10(ProtocolVersion paramProtocolVersion) {
    return ProtocolVersion.TLSv10.isEqualOrEarlierVersionOf(paramProtocolVersion.getEquivalentTLSVersion());
  }
  
  public static boolean isTLSv10(TlsCryptoParameters paramTlsCryptoParameters) {
    return isTLSv10(paramTlsCryptoParameters.getServerVersion());
  }
  
  public static boolean isTLSv11(ProtocolVersion paramProtocolVersion) {
    return ProtocolVersion.TLSv11.isEqualOrEarlierVersionOf(paramProtocolVersion.getEquivalentTLSVersion());
  }
  
  public static boolean isTLSv11(TlsCryptoParameters paramTlsCryptoParameters) {
    return isTLSv11(paramTlsCryptoParameters.getServerVersion());
  }
  
  public static boolean isTLSv12(ProtocolVersion paramProtocolVersion) {
    return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(paramProtocolVersion.getEquivalentTLSVersion());
  }
  
  public static boolean isTLSv12(TlsCryptoParameters paramTlsCryptoParameters) {
    return isTLSv12(paramTlsCryptoParameters.getServerVersion());
  }
  
  public static boolean isTLSv13(ProtocolVersion paramProtocolVersion) {
    return ProtocolVersion.TLSv13.isEqualOrEarlierVersionOf(paramProtocolVersion.getEquivalentTLSVersion());
  }
  
  public static boolean isTLSv13(TlsCryptoParameters paramTlsCryptoParameters) {
    return isTLSv13(paramTlsCryptoParameters.getServerVersion());
  }
  
  public static byte[] calculateKeyBlock(TlsCryptoParameters paramTlsCryptoParameters, int paramInt) {
    SecurityParameters securityParameters = paramTlsCryptoParameters.getSecurityParametersHandshake();
    TlsSecret tlsSecret = securityParameters.getMasterSecret();
    int i = securityParameters.getPRFAlgorithm();
    byte[] arrayOfByte = Arrays.concatenate(securityParameters.getServerRandom(), securityParameters.getClientRandom());
    return tlsSecret.deriveUsingPRF(i, "key expansion", arrayOfByte, paramInt).extract();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\TlsImplUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */