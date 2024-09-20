package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.AbstractTlsPeer;
import org.bouncycastle.tls.CertificateStatusRequest;
import org.bouncycastle.tls.DefaultTlsDHGroupVerifier;
import org.bouncycastle.tls.DefaultTlsSRPConfigVerifier;
import org.bouncycastle.tls.NewSessionTicket;
import org.bouncycastle.tls.OCSPStatusRequest;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.TlsClient;
import org.bouncycastle.tls.TlsClientContext;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsDHGroupVerifier;
import org.bouncycastle.tls.TlsECCUtils;
import org.bouncycastle.tls.TlsExtensionsUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsPSK;
import org.bouncycastle.tls.TlsPSKIdentity;
import org.bouncycastle.tls.TlsSRPConfigVerifier;
import org.bouncycastle.tls.TlsSRPIdentity;
import org.bouncycastle.tls.TlsSession;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.util.Integers;

public abstract class AbstractTlsClient extends AbstractTlsPeer implements TlsClient {
  protected TlsClientContext context;
  
  protected ProtocolVersion[] protocolVersions;
  
  protected int[] cipherSuites;
  
  protected Vector supportedGroups;
  
  protected Vector supportedSignatureAlgorithms;
  
  protected Vector supportedSignatureAlgorithmsCert;
  
  public AbstractTlsClient(TlsCrypto paramTlsCrypto) {
    super(paramTlsCrypto);
  }
  
  protected boolean allowUnexpectedServerExtension(Integer paramInteger, byte[] paramArrayOfbyte) throws IOException {
    switch (paramInteger.intValue()) {
      case 10:
        TlsExtensionsUtils.readSupportedGroupsExtension(paramArrayOfbyte);
        return true;
      case 11:
        TlsExtensionsUtils.readSupportedPointFormatsExtension(paramArrayOfbyte);
        return true;
    } 
    return false;
  }
  
  protected Vector getNamedGroupRoles() {
    Vector vector1 = TlsUtils.getNamedGroupRoles(getCipherSuites());
    Vector vector2 = this.supportedSignatureAlgorithms;
    Vector vector3 = this.supportedSignatureAlgorithmsCert;
    if (null == vector2 || TlsUtils.containsAnySignatureAlgorithm(vector2, (short)3) || (null != vector3 && TlsUtils.containsAnySignatureAlgorithm(vector3, (short)3)))
      TlsUtils.addToSet(vector1, 3); 
    return vector1;
  }
  
  protected void checkForUnexpectedServerExtension(Hashtable paramHashtable, Integer paramInteger) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, paramInteger);
    if (arrayOfByte != null && !allowUnexpectedServerExtension(paramInteger, arrayOfByte))
      throw new TlsFatalAlert((short)47); 
  }
  
  protected byte[] getNewConnectionID() {
    return null;
  }
  
  public TlsPSKIdentity getPSKIdentity() throws IOException {
    return null;
  }
  
  public TlsSRPIdentity getSRPIdentity() throws IOException {
    return null;
  }
  
  public TlsDHGroupVerifier getDHGroupVerifier() {
    return (TlsDHGroupVerifier)new DefaultTlsDHGroupVerifier();
  }
  
  public TlsSRPConfigVerifier getSRPConfigVerifier() {
    return (TlsSRPConfigVerifier)new DefaultTlsSRPConfigVerifier();
  }
  
  protected Vector getCertificateAuthorities() {
    return null;
  }
  
  protected Vector getProtocolNames() {
    return null;
  }
  
  protected CertificateStatusRequest getCertificateStatusRequest() {
    return new CertificateStatusRequest((short)1, new OCSPStatusRequest(null, null));
  }
  
  protected Vector getMultiCertStatusRequest() {
    return null;
  }
  
  protected Vector getSNIServerNames() {
    return null;
  }
  
  protected Vector getSupportedGroups(Vector paramVector) {
    TlsCrypto tlsCrypto = getCrypto();
    Vector vector = new Vector();
    if (paramVector.contains(Integers.valueOf(2)))
      TlsUtils.addIfSupported(vector, tlsCrypto, new int[] { 29, 30 }); 
    if (paramVector.contains(Integers.valueOf(2)) || paramVector.contains(Integers.valueOf(3)))
      TlsUtils.addIfSupported(vector, tlsCrypto, new int[] { 23, 24 }); 
    if (paramVector.contains(Integers.valueOf(1)))
      TlsUtils.addIfSupported(vector, tlsCrypto, new int[] { 256, 257, 258 }); 
    return vector;
  }
  
  protected Vector getSupportedSignatureAlgorithms() {
    return TlsUtils.getDefaultSupportedSignatureAlgorithms((TlsContext)this.context);
  }
  
  protected Vector getSupportedSignatureAlgorithmsCert() {
    return null;
  }
  
  protected Vector getTrustedCAIndication() {
    return null;
  }
  
  protected short[] getAllowedClientCertificateTypes() {
    return null;
  }
  
  protected short[] getAllowedServerCertificateTypes() {
    return null;
  }
  
  public void init(TlsClientContext paramTlsClientContext) {
    this.context = paramTlsClientContext;
    this.protocolVersions = getSupportedVersions();
    this.cipherSuites = getSupportedCipherSuites();
  }
  
  public ProtocolVersion[] getProtocolVersions() {
    return this.protocolVersions;
  }
  
  public int[] getCipherSuites() {
    return this.cipherSuites;
  }
  
  public void notifyHandshakeBeginning() throws IOException {
    super.notifyHandshakeBeginning();
    this.supportedGroups = null;
    this.supportedSignatureAlgorithms = null;
    this.supportedSignatureAlgorithmsCert = null;
  }
  
  public TlsSession getSessionToResume() {
    return null;
  }
  
  public Vector getExternalPSKs() {
    return null;
  }
  
  public boolean isFallback() {
    return false;
  }
  
  public Hashtable getClientExtensions() throws IOException {
    Hashtable<Object, Object> hashtable = new Hashtable<>();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool = false;
    ProtocolVersion[] arrayOfProtocolVersion = getProtocolVersions();
    for (byte b = 0; b < arrayOfProtocolVersion.length; b++) {
      ProtocolVersion protocolVersion1 = arrayOfProtocolVersion[b];
      if (TlsUtils.isTLSv13(protocolVersion1)) {
        bool1 = true;
      } else {
        bool2 = true;
      } 
      bool |= ProtocolVersion.DTLSv12.equals(protocolVersion1);
    } 
    Vector vector1 = getProtocolNames();
    if (vector1 != null)
      TlsExtensionsUtils.addALPNExtensionClient(hashtable, vector1); 
    Vector vector2 = getSNIServerNames();
    if (vector2 != null)
      TlsExtensionsUtils.addServerNameExtensionClient(hashtable, vector2); 
    CertificateStatusRequest certificateStatusRequest = getCertificateStatusRequest();
    if (certificateStatusRequest != null)
      TlsExtensionsUtils.addStatusRequestExtension(hashtable, certificateStatusRequest); 
    if (bool1) {
      Vector vector = getCertificateAuthorities();
      if (vector != null)
        TlsExtensionsUtils.addCertificateAuthoritiesExtension(hashtable, vector); 
    } 
    if (bool2) {
      TlsExtensionsUtils.addEncryptThenMACExtension(hashtable);
      Vector vector5 = getMultiCertStatusRequest();
      if (vector5 != null)
        TlsExtensionsUtils.addStatusRequestV2Extension(hashtable, vector5); 
      Vector vector6 = getTrustedCAIndication();
      if (vector6 != null)
        TlsExtensionsUtils.addTrustedCAKeysExtensionClient(hashtable, vector6); 
    } 
    ProtocolVersion protocolVersion = this.context.getClientVersion();
    if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(protocolVersion)) {
      Vector vector5 = getSupportedSignatureAlgorithms();
      if (null != vector5 && !vector5.isEmpty()) {
        this.supportedSignatureAlgorithms = vector5;
        TlsExtensionsUtils.addSignatureAlgorithmsExtension(hashtable, vector5);
      } 
      Vector vector6 = getSupportedSignatureAlgorithmsCert();
      if (null != vector6 && !vector6.isEmpty()) {
        this.supportedSignatureAlgorithmsCert = vector6;
        TlsExtensionsUtils.addSignatureAlgorithmsCertExtension(hashtable, vector6);
      } 
    } 
    Vector vector3 = getNamedGroupRoles();
    Vector vector4 = getSupportedGroups(vector3);
    if (vector4 != null && !vector4.isEmpty()) {
      this.supportedGroups = vector4;
      TlsExtensionsUtils.addSupportedGroupsExtension(hashtable, vector4);
    } 
    if (bool2 && (vector3.contains(Integers.valueOf(2)) || vector3.contains(Integers.valueOf(3))))
      TlsExtensionsUtils.addSupportedPointFormatsExtension(hashtable, new short[] { 0 }); 
    short[] arrayOfShort = getAllowedClientCertificateTypes();
    if (arrayOfShort != null && TlsUtils.containsNot(arrayOfShort, 0, arrayOfShort.length, (short)0))
      TlsExtensionsUtils.addClientCertificateTypeExtensionClient(hashtable, arrayOfShort); 
    arrayOfShort = getAllowedServerCertificateTypes();
    if (arrayOfShort != null && TlsUtils.containsNot(arrayOfShort, 0, arrayOfShort.length, (short)0))
      TlsExtensionsUtils.addServerCertificateTypeExtensionClient(hashtable, arrayOfShort); 
    if (bool) {
      byte[] arrayOfByte = getNewConnectionID();
      if (arrayOfByte != null)
        TlsExtensionsUtils.addConnectionIDExtension(hashtable, arrayOfByte); 
    } 
    return hashtable;
  }
  
  public Vector getEarlyKeyShareGroups() {
    return (null == this.supportedGroups || this.supportedGroups.isEmpty()) ? null : (this.supportedGroups.contains(Integers.valueOf(29)) ? TlsUtils.vectorOfOne(Integers.valueOf(29)) : (this.supportedGroups.contains(Integers.valueOf(23)) ? TlsUtils.vectorOfOne(Integers.valueOf(23)) : TlsUtils.vectorOfOne(this.supportedGroups.elementAt(0))));
  }
  
  public boolean shouldUseCompatibilityMode() {
    return true;
  }
  
  public void notifyServerVersion(ProtocolVersion paramProtocolVersion) throws IOException {}
  
  public void notifySessionToResume(TlsSession paramTlsSession) {}
  
  public void notifySessionID(byte[] paramArrayOfbyte) {}
  
  public void notifySelectedCipherSuite(int paramInt) {}
  
  public void notifySelectedPSK(TlsPSK paramTlsPSK) throws IOException {}
  
  public void processServerExtensions(Hashtable paramHashtable) throws IOException {
    if (null == paramHashtable)
      return; 
    SecurityParameters securityParameters = this.context.getSecurityParametersHandshake();
    boolean bool = TlsUtils.isTLSv13(securityParameters.getNegotiatedVersion());
    if (!bool) {
      checkForUnexpectedServerExtension(paramHashtable, TlsExtensionsUtils.EXT_signature_algorithms);
      checkForUnexpectedServerExtension(paramHashtable, TlsExtensionsUtils.EXT_signature_algorithms_cert);
      checkForUnexpectedServerExtension(paramHashtable, TlsExtensionsUtils.EXT_supported_groups);
      int i = securityParameters.getCipherSuite();
      if (TlsECCUtils.isECCCipherSuite(i)) {
        TlsExtensionsUtils.getSupportedPointFormatsExtension(paramHashtable);
      } else {
        checkForUnexpectedServerExtension(paramHashtable, TlsExtensionsUtils.EXT_ec_point_formats);
      } 
      checkForUnexpectedServerExtension(paramHashtable, TlsExtensionsUtils.EXT_padding);
    } 
  }
  
  public void processServerSupplementalData(Vector paramVector) throws IOException {
    if (paramVector != null)
      throw new TlsFatalAlert((short)10); 
  }
  
  public Vector getClientSupplementalData() throws IOException {
    return null;
  }
  
  public void notifyNewSessionTicket(NewSessionTicket paramNewSessionTicket) throws IOException {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\AbstractTlsClient.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */