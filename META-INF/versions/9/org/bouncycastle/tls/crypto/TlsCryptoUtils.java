package META-INF.versions.9.org.bouncycastle.tls.crypto;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.tls.HashAlgorithm;
import org.bouncycastle.tls.MACAlgorithm;
import org.bouncycastle.tls.PRFAlgorithm;
import org.bouncycastle.tls.SignatureAlgorithm;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsSecret;

public abstract class TlsCryptoUtils {
  private static final byte[] TLS13_PREFIX = new byte[] { 116, 108, 115, 49, 51, 32 };
  
  public static int getHash(short paramShort) {
    switch (paramShort) {
      case 1:
        return 1;
      case 2:
        return 2;
      case 3:
        return 3;
      case 4:
        return 4;
      case 5:
        return 5;
      case 6:
        return 6;
    } 
    throw new IllegalArgumentException("specified HashAlgorithm invalid: " + HashAlgorithm.getText(paramShort));
  }
  
  public static int getHashForHMAC(int paramInt) {
    switch (paramInt) {
      case 1:
        return 1;
      case 2:
        return 2;
      case 3:
        return 4;
      case 4:
        return 5;
      case 5:
        return 6;
    } 
    throw new IllegalArgumentException("specified MACAlgorithm not an HMAC: " + MACAlgorithm.getText(paramInt));
  }
  
  public static int getHashForPRF(int paramInt) {
    switch (paramInt) {
      case 0:
      case 1:
        throw new IllegalArgumentException("legacy PRF not a valid algorithm");
      case 2:
      case 4:
        return 4;
      case 3:
      case 5:
        return 5;
      case 7:
        return 7;
    } 
    throw new IllegalArgumentException("unknown PRFAlgorithm: " + PRFAlgorithm.getText(paramInt));
  }
  
  public static int getHashInternalSize(int paramInt) {
    switch (paramInt) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 7:
        return 64;
      case 5:
      case 6:
        return 128;
    } 
    throw new IllegalArgumentException();
  }
  
  public static int getHashOutputSize(int paramInt) {
    switch (paramInt) {
      case 1:
        return 16;
      case 2:
        return 20;
      case 3:
        return 28;
      case 4:
      case 7:
        return 32;
      case 5:
        return 48;
      case 6:
        return 64;
    } 
    throw new IllegalArgumentException();
  }
  
  public static ASN1ObjectIdentifier getOIDForHash(int paramInt) {
    switch (paramInt) {
      case 1:
        return PKCSObjectIdentifiers.md5;
      case 2:
        return X509ObjectIdentifiers.id_SHA1;
      case 3:
        return NISTObjectIdentifiers.id_sha224;
      case 4:
        return NISTObjectIdentifiers.id_sha256;
      case 5:
        return NISTObjectIdentifiers.id_sha384;
      case 6:
        return NISTObjectIdentifiers.id_sha512;
    } 
    throw new IllegalArgumentException();
  }
  
  public static int getSignature(short paramShort) {
    switch (paramShort) {
      case 1:
        return 1;
      case 2:
        return 2;
      case 3:
        return 3;
      case 4:
        return 4;
      case 5:
        return 5;
      case 6:
        return 6;
      case 7:
        return 7;
      case 8:
        return 8;
      case 9:
        return 9;
      case 10:
        return 10;
      case 11:
        return 11;
      case 26:
        return 26;
      case 27:
        return 27;
      case 28:
        return 28;
      case 64:
        return 64;
      case 65:
        return 65;
    } 
    throw new IllegalArgumentException("specified SignatureAlgorithm invalid: " + SignatureAlgorithm.getText(paramShort));
  }
  
  public static TlsSecret hkdfExpandLabel(TlsSecret paramTlsSecret, int paramInt1, String paramString, byte[] paramArrayOfbyte, int paramInt2) throws IOException {
    int i = paramString.length();
    if (i < 1)
      throw new TlsFatalAlert((short)80); 
    int j = paramArrayOfbyte.length;
    int k = TLS13_PREFIX.length + i;
    byte[] arrayOfByte = new byte[2 + 1 + k + 1 + j];
    TlsUtils.checkUint16(paramInt2);
    TlsUtils.writeUint16(paramInt2, arrayOfByte, 0);
    TlsUtils.checkUint8(k);
    TlsUtils.writeUint8(k, arrayOfByte, 2);
    System.arraycopy(TLS13_PREFIX, 0, arrayOfByte, 3, TLS13_PREFIX.length);
    int m = 2 + 1 + TLS13_PREFIX.length;
    for (byte b = 0; b < i; b++) {
      char c = paramString.charAt(b);
      arrayOfByte[m + b] = (byte)c;
    } 
    TlsUtils.writeOpaque8(paramArrayOfbyte, arrayOfByte, 2 + 1 + k);
    return paramTlsSecret.hkdfExpand(paramInt1, arrayOfByte, paramInt2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\TlsCryptoUtils.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */