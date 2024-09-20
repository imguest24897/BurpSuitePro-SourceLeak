package META-INF.versions.9.org.bouncycastle.tls;

import java.util.Vector;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.util.Strings;

public final class ProtocolVersion {
  public static final org.bouncycastle.tls.ProtocolVersion SSLv3 = new org.bouncycastle.tls.ProtocolVersion(768, "SSL 3.0");
  
  public static final org.bouncycastle.tls.ProtocolVersion TLSv10 = new org.bouncycastle.tls.ProtocolVersion(769, "TLS 1.0");
  
  public static final org.bouncycastle.tls.ProtocolVersion TLSv11 = new org.bouncycastle.tls.ProtocolVersion(770, "TLS 1.1");
  
  public static final org.bouncycastle.tls.ProtocolVersion TLSv12 = new org.bouncycastle.tls.ProtocolVersion(771, "TLS 1.2");
  
  public static final org.bouncycastle.tls.ProtocolVersion TLSv13 = new org.bouncycastle.tls.ProtocolVersion(772, "TLS 1.3");
  
  public static final org.bouncycastle.tls.ProtocolVersion DTLSv10 = new org.bouncycastle.tls.ProtocolVersion(65279, "DTLS 1.0");
  
  public static final org.bouncycastle.tls.ProtocolVersion DTLSv12 = new org.bouncycastle.tls.ProtocolVersion(65277, "DTLS 1.2");
  
  public static final org.bouncycastle.tls.ProtocolVersion DTLSv13 = new org.bouncycastle.tls.ProtocolVersion(65276, "DTLS 1.3");
  
  static final org.bouncycastle.tls.ProtocolVersion CLIENT_EARLIEST_SUPPORTED_DTLS = DTLSv10;
  
  static final org.bouncycastle.tls.ProtocolVersion CLIENT_EARLIEST_SUPPORTED_TLS = SSLv3;
  
  static final org.bouncycastle.tls.ProtocolVersion CLIENT_LATEST_SUPPORTED_DTLS = DTLSv12;
  
  static final org.bouncycastle.tls.ProtocolVersion CLIENT_LATEST_SUPPORTED_TLS = TLSv13;
  
  static final org.bouncycastle.tls.ProtocolVersion SERVER_EARLIEST_SUPPORTED_DTLS = DTLSv10;
  
  static final org.bouncycastle.tls.ProtocolVersion SERVER_EARLIEST_SUPPORTED_TLS = SSLv3;
  
  static final org.bouncycastle.tls.ProtocolVersion SERVER_LATEST_SUPPORTED_DTLS = DTLSv12;
  
  static final org.bouncycastle.tls.ProtocolVersion SERVER_LATEST_SUPPORTED_TLS = TLSv13;
  
  private int version;
  
  private String name;
  
  public static boolean contains(org.bouncycastle.tls.ProtocolVersion[] paramArrayOfProtocolVersion, org.bouncycastle.tls.ProtocolVersion paramProtocolVersion) {
    if (paramArrayOfProtocolVersion != null && paramProtocolVersion != null)
      for (byte b = 0; b < paramArrayOfProtocolVersion.length; b++) {
        if (paramProtocolVersion.equals(paramArrayOfProtocolVersion[b]))
          return true; 
      }  
    return false;
  }
  
  public static org.bouncycastle.tls.ProtocolVersion getEarliestDTLS(org.bouncycastle.tls.ProtocolVersion[] paramArrayOfProtocolVersion) {
    org.bouncycastle.tls.ProtocolVersion protocolVersion = null;
    if (null != paramArrayOfProtocolVersion)
      for (byte b = 0; b < paramArrayOfProtocolVersion.length; b++) {
        org.bouncycastle.tls.ProtocolVersion protocolVersion1 = paramArrayOfProtocolVersion[b];
        if (null != protocolVersion1 && protocolVersion1.isDTLS() && (null == protocolVersion || protocolVersion1.getMinorVersion() > protocolVersion.getMinorVersion()))
          protocolVersion = protocolVersion1; 
      }  
    return protocolVersion;
  }
  
  public static org.bouncycastle.tls.ProtocolVersion getEarliestTLS(org.bouncycastle.tls.ProtocolVersion[] paramArrayOfProtocolVersion) {
    org.bouncycastle.tls.ProtocolVersion protocolVersion = null;
    if (null != paramArrayOfProtocolVersion)
      for (byte b = 0; b < paramArrayOfProtocolVersion.length; b++) {
        org.bouncycastle.tls.ProtocolVersion protocolVersion1 = paramArrayOfProtocolVersion[b];
        if (null != protocolVersion1 && protocolVersion1.isTLS() && (null == protocolVersion || protocolVersion1.getMinorVersion() < protocolVersion.getMinorVersion()))
          protocolVersion = protocolVersion1; 
      }  
    return protocolVersion;
  }
  
  public static org.bouncycastle.tls.ProtocolVersion getLatestDTLS(org.bouncycastle.tls.ProtocolVersion[] paramArrayOfProtocolVersion) {
    org.bouncycastle.tls.ProtocolVersion protocolVersion = null;
    if (null != paramArrayOfProtocolVersion)
      for (byte b = 0; b < paramArrayOfProtocolVersion.length; b++) {
        org.bouncycastle.tls.ProtocolVersion protocolVersion1 = paramArrayOfProtocolVersion[b];
        if (null != protocolVersion1 && protocolVersion1.isDTLS() && (null == protocolVersion || protocolVersion1.getMinorVersion() < protocolVersion.getMinorVersion()))
          protocolVersion = protocolVersion1; 
      }  
    return protocolVersion;
  }
  
  public static org.bouncycastle.tls.ProtocolVersion getLatestTLS(org.bouncycastle.tls.ProtocolVersion[] paramArrayOfProtocolVersion) {
    org.bouncycastle.tls.ProtocolVersion protocolVersion = null;
    if (null != paramArrayOfProtocolVersion)
      for (byte b = 0; b < paramArrayOfProtocolVersion.length; b++) {
        org.bouncycastle.tls.ProtocolVersion protocolVersion1 = paramArrayOfProtocolVersion[b];
        if (null != protocolVersion1 && protocolVersion1.isTLS() && (null == protocolVersion || protocolVersion1.getMinorVersion() > protocolVersion.getMinorVersion()))
          protocolVersion = protocolVersion1; 
      }  
    return protocolVersion;
  }
  
  static boolean isSupportedDTLSVersionClient(org.bouncycastle.tls.ProtocolVersion paramProtocolVersion) {
    return (null != paramProtocolVersion && paramProtocolVersion.isEqualOrLaterVersionOf(CLIENT_EARLIEST_SUPPORTED_DTLS) && paramProtocolVersion.isEqualOrEarlierVersionOf(CLIENT_LATEST_SUPPORTED_DTLS));
  }
  
  static boolean isSupportedDTLSVersionServer(org.bouncycastle.tls.ProtocolVersion paramProtocolVersion) {
    return (null != paramProtocolVersion && paramProtocolVersion.isEqualOrLaterVersionOf(SERVER_EARLIEST_SUPPORTED_DTLS) && paramProtocolVersion.isEqualOrEarlierVersionOf(SERVER_LATEST_SUPPORTED_DTLS));
  }
  
  static boolean isSupportedTLSVersionClient(org.bouncycastle.tls.ProtocolVersion paramProtocolVersion) {
    if (null == paramProtocolVersion)
      return false; 
    int i = paramProtocolVersion.getFullVersion();
    return (i >= CLIENT_EARLIEST_SUPPORTED_TLS.getFullVersion() && i <= CLIENT_LATEST_SUPPORTED_TLS.getFullVersion());
  }
  
  static boolean isSupportedTLSVersionServer(org.bouncycastle.tls.ProtocolVersion paramProtocolVersion) {
    if (null == paramProtocolVersion)
      return false; 
    int i = paramProtocolVersion.getFullVersion();
    return (i >= SERVER_EARLIEST_SUPPORTED_TLS.getFullVersion() && i <= SERVER_LATEST_SUPPORTED_TLS.getFullVersion());
  }
  
  private ProtocolVersion(int paramInt, String paramString) {
    this.version = paramInt & 0xFFFF;
    this.name = paramString;
  }
  
  public org.bouncycastle.tls.ProtocolVersion[] downTo(org.bouncycastle.tls.ProtocolVersion paramProtocolVersion) {
    if (!isEqualOrLaterVersionOf(paramProtocolVersion))
      throw new IllegalArgumentException("'min' must be an equal or earlier version of this one"); 
    Vector<org.bouncycastle.tls.ProtocolVersion> vector = new Vector();
    vector.addElement(this);
    org.bouncycastle.tls.ProtocolVersion protocolVersion = this;
    while (!protocolVersion.equals(paramProtocolVersion)) {
      protocolVersion = protocolVersion.getPreviousVersion();
      vector.addElement(protocolVersion);
    } 
    org.bouncycastle.tls.ProtocolVersion[] arrayOfProtocolVersion = new org.bouncycastle.tls.ProtocolVersion[vector.size()];
    for (byte b = 0; b < vector.size(); b++)
      arrayOfProtocolVersion[b] = vector.elementAt(b); 
    return arrayOfProtocolVersion;
  }
  
  public int getFullVersion() {
    return this.version;
  }
  
  public int getMajorVersion() {
    return this.version >> 8;
  }
  
  public int getMinorVersion() {
    return this.version & 0xFF;
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean isDTLS() {
    return (getMajorVersion() == 254);
  }
  
  public boolean isSSL() {
    return (this == SSLv3);
  }
  
  public boolean isTLS() {
    return (getMajorVersion() == 3);
  }
  
  public org.bouncycastle.tls.ProtocolVersion getEquivalentTLSVersion() {
    switch (getMajorVersion()) {
      case 3:
        return this;
      case 254:
        switch (getMinorVersion()) {
          case 255:
            return TLSv11;
          case 253:
            return TLSv12;
          case 252:
            return TLSv13;
        } 
        return null;
    } 
    return null;
  }
  
  public org.bouncycastle.tls.ProtocolVersion getNextVersion() {
    int i = getMajorVersion();
    int j = getMinorVersion();
    switch (i) {
      case 3:
        switch (j) {
          case 255:
            return null;
        } 
        return get(i, j + 1);
      case 254:
        switch (j) {
          case 0:
            return null;
          case 255:
            return DTLSv12;
        } 
        return get(i, j - 1);
    } 
    return null;
  }
  
  public org.bouncycastle.tls.ProtocolVersion getPreviousVersion() {
    int i = getMajorVersion();
    int j = getMinorVersion();
    switch (i) {
      case 3:
        switch (j) {
          case 0:
            return null;
        } 
        return get(i, j - 1);
      case 254:
        switch (j) {
          case 255:
            return null;
          case 253:
            return DTLSv10;
        } 
        return get(i, j + 1);
    } 
    return null;
  }
  
  public boolean isEarlierVersionOf(org.bouncycastle.tls.ProtocolVersion paramProtocolVersion) {
    if (null == paramProtocolVersion || getMajorVersion() != paramProtocolVersion.getMajorVersion())
      return false; 
    int i = getMinorVersion() - paramProtocolVersion.getMinorVersion();
    return isDTLS() ? ((i > 0)) : ((i < 0));
  }
  
  public boolean isEqualOrEarlierVersionOf(org.bouncycastle.tls.ProtocolVersion paramProtocolVersion) {
    if (null == paramProtocolVersion || getMajorVersion() != paramProtocolVersion.getMajorVersion())
      return false; 
    int i = getMinorVersion() - paramProtocolVersion.getMinorVersion();
    return isDTLS() ? ((i >= 0)) : ((i <= 0));
  }
  
  public boolean isEqualOrLaterVersionOf(org.bouncycastle.tls.ProtocolVersion paramProtocolVersion) {
    if (null == paramProtocolVersion || getMajorVersion() != paramProtocolVersion.getMajorVersion())
      return false; 
    int i = getMinorVersion() - paramProtocolVersion.getMinorVersion();
    return isDTLS() ? ((i <= 0)) : ((i >= 0));
  }
  
  public boolean isLaterVersionOf(org.bouncycastle.tls.ProtocolVersion paramProtocolVersion) {
    if (null == paramProtocolVersion || getMajorVersion() != paramProtocolVersion.getMajorVersion())
      return false; 
    int i = getMinorVersion() - paramProtocolVersion.getMinorVersion();
    return isDTLS() ? ((i < 0)) : ((i > 0));
  }
  
  public boolean equals(Object paramObject) {
    return (this == paramObject || (paramObject instanceof org.bouncycastle.tls.ProtocolVersion && equals((org.bouncycastle.tls.ProtocolVersion)paramObject)));
  }
  
  public boolean equals(org.bouncycastle.tls.ProtocolVersion paramProtocolVersion) {
    return (paramProtocolVersion != null && this.version == paramProtocolVersion.version);
  }
  
  public int hashCode() {
    return this.version;
  }
  
  public static org.bouncycastle.tls.ProtocolVersion get(int paramInt1, int paramInt2) {
    switch (paramInt1) {
      case 3:
        switch (paramInt2) {
          case 0:
            return SSLv3;
          case 1:
            return TLSv10;
          case 2:
            return TLSv11;
          case 3:
            return TLSv12;
          case 4:
            return TLSv13;
        } 
        return getUnknownVersion(paramInt1, paramInt2, "TLS");
      case 254:
        switch (paramInt2) {
          case 255:
            return DTLSv10;
          case 254:
            throw new IllegalArgumentException("{0xFE, 0xFE} is a reserved protocol version");
          case 253:
            return DTLSv12;
          case 252:
            return DTLSv13;
        } 
        return getUnknownVersion(paramInt1, paramInt2, "DTLS");
    } 
    return getUnknownVersion(paramInt1, paramInt2, "UNKNOWN");
  }
  
  public org.bouncycastle.tls.ProtocolVersion[] only() {
    return new org.bouncycastle.tls.ProtocolVersion[] { this };
  }
  
  public String toString() {
    return this.name;
  }
  
  private static void checkUint8(int paramInt) {
    if (!TlsUtils.isValidUint8(paramInt))
      throw new IllegalArgumentException("'versionOctet' is not a valid octet"); 
  }
  
  private static org.bouncycastle.tls.ProtocolVersion getUnknownVersion(int paramInt1, int paramInt2, String paramString) {
    checkUint8(paramInt1);
    checkUint8(paramInt2);
    int i = paramInt1 << 8 | paramInt2;
    String str = Strings.toUpperCase(Integer.toHexString(0x10000 | i).substring(1));
    return new org.bouncycastle.tls.ProtocolVersion(i, paramString + " 0x" + paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\ProtocolVersion.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */