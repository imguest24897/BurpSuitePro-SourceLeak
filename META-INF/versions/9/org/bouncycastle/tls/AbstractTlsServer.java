package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.AbstractTlsPeer;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.CertificateRequest;
import org.bouncycastle.tls.CertificateStatus;
import org.bouncycastle.tls.CertificateStatusRequest;
import org.bouncycastle.tls.MaxFragmentLength;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.NewSessionTicket;
import org.bouncycastle.tls.ProtocolName;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsDHUtils;
import org.bouncycastle.tls.TlsECCUtils;
import org.bouncycastle.tls.TlsExtensionsUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsPSKExternal;
import org.bouncycastle.tls.TlsPSKIdentityManager;
import org.bouncycastle.tls.TlsSRPLoginParameters;
import org.bouncycastle.tls.TlsServer;
import org.bouncycastle.tls.TlsServerContext;
import org.bouncycastle.tls.TlsSession;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;
import org.bouncycastle.util.Integers;

public abstract class AbstractTlsServer extends AbstractTlsPeer implements TlsServer {
  protected TlsServerContext context;
  
  protected ProtocolVersion[] protocolVersions;
  
  protected int[] cipherSuites;
  
  protected int[] offeredCipherSuites;
  
  protected Hashtable clientExtensions;
  
  protected boolean encryptThenMACOffered;
  
  protected short maxFragmentLengthOffered;
  
  protected boolean truncatedHMacOffered;
  
  protected boolean clientSentECPointFormats;
  
  protected CertificateStatusRequest certificateStatusRequest;
  
  protected Vector statusRequestV2;
  
  protected Vector trustedCAKeys;
  
  protected int selectedCipherSuite;
  
  protected Vector clientProtocolNames;
  
  protected ProtocolName selectedProtocolName;
  
  protected final Hashtable serverExtensions = new Hashtable<>();
  
  public AbstractTlsServer(TlsCrypto paramTlsCrypto) {
    super(paramTlsCrypto);
  }
  
  protected boolean allowCertificateStatus() {
    return true;
  }
  
  protected boolean allowEncryptThenMAC() {
    return true;
  }
  
  protected boolean allowMultiCertStatus() {
    return false;
  }
  
  protected boolean allowTruncatedHMac() {
    return false;
  }
  
  protected boolean allowTrustedCAIndication() {
    return false;
  }
  
  protected Hashtable checkServerExtensions() {
    return this.serverExtensions;
  }
  
  protected String getDetailMessageNoCipherSuite() {
    return "No selectable cipher suite";
  }
  
  protected int getMaximumNegotiableCurveBits() {
    int i = 0;
    int[] arrayOfInt = this.context.getSecurityParametersHandshake().getClientSupportedGroups();
    if (arrayOfInt != null) {
      for (byte b = 0; b < arrayOfInt.length; b++)
        i = Math.max(i, NamedGroup.getCurveBits(arrayOfInt[b])); 
    } else {
      i = NamedGroup.getMaximumCurveBits();
    } 
    return i;
  }
  
  protected int getMaximumNegotiableFiniteFieldBits() {
    int i = 0;
    boolean bool = false;
    int[] arrayOfInt = this.context.getSecurityParametersHandshake().getClientSupportedGroups();
    if (arrayOfInt != null)
      for (byte b = 0; b < arrayOfInt.length; b++) {
        bool |= NamedGroup.isFiniteField(arrayOfInt[b]);
        i = Math.max(i, NamedGroup.getFiniteFieldBits(arrayOfInt[b]));
      }  
    if (!bool)
      i = NamedGroup.getMaximumFiniteFieldBits(); 
    return i;
  }
  
  protected Vector getProtocolNames() {
    return null;
  }
  
  protected boolean isSelectableCipherSuite(int paramInt1, int paramInt2, int paramInt3, Vector paramVector) {
    return (TlsUtils.isValidVersionForCipherSuite(paramInt1, this.context.getServerVersion()) && paramInt2 >= TlsECCUtils.getMinimumCurveBits(paramInt1) && paramInt3 >= TlsDHUtils.getMinimumFiniteFieldBits(paramInt1) && TlsUtils.isValidCipherSuiteForSignatureAlgorithms(paramInt1, paramVector));
  }
  
  protected boolean preferLocalCipherSuites() {
    return false;
  }
  
  protected boolean selectCipherSuite(int paramInt) throws IOException {
    this.selectedCipherSuite = paramInt;
    return true;
  }
  
  protected int selectDH(int paramInt) {
    int[] arrayOfInt = this.context.getSecurityParametersHandshake().getClientSupportedGroups();
    if (arrayOfInt == null)
      return selectDHDefault(paramInt); 
    for (byte b = 0; b < arrayOfInt.length; b++) {
      int i = arrayOfInt[b];
      if (NamedGroup.getFiniteFieldBits(i) >= paramInt)
        return i; 
    } 
    return -1;
  }
  
  protected int selectDHDefault(int paramInt) {
    return (paramInt <= 2048) ? 256 : ((paramInt <= 3072) ? 257 : ((paramInt <= 4096) ? 258 : ((paramInt <= 6144) ? 259 : ((paramInt <= 8192) ? 260 : -1))));
  }
  
  protected int selectECDH(int paramInt) {
    int[] arrayOfInt = this.context.getSecurityParametersHandshake().getClientSupportedGroups();
    if (arrayOfInt == null)
      return selectECDHDefault(paramInt); 
    for (byte b = 0; b < arrayOfInt.length; b++) {
      int i = arrayOfInt[b];
      if (NamedGroup.getCurveBits(i) >= paramInt)
        return i; 
    } 
    return -1;
  }
  
  protected int selectECDHDefault(int paramInt) {
    return (paramInt <= 256) ? 23 : ((paramInt <= 384) ? 24 : ((paramInt <= 521) ? 25 : -1));
  }
  
  protected ProtocolName selectProtocolName() throws IOException {
    Vector vector = getProtocolNames();
    if (null == vector || vector.isEmpty())
      return null; 
    ProtocolName protocolName = selectProtocolName(this.clientProtocolNames, vector);
    if (null == protocolName)
      throw new TlsFatalAlert((short)120); 
    return protocolName;
  }
  
  protected ProtocolName selectProtocolName(Vector paramVector1, Vector<ProtocolName> paramVector2) {
    for (byte b = 0; b < paramVector2.size(); b++) {
      ProtocolName protocolName = paramVector2.elementAt(b);
      if (paramVector1.contains(protocolName))
        return protocolName; 
    } 
    return null;
  }
  
  protected boolean shouldSelectProtocolNameEarly() {
    return true;
  }
  
  protected boolean preferLocalClientCertificateTypes() {
    return false;
  }
  
  protected short[] getAllowedClientCertificateTypes() {
    return null;
  }
  
  protected byte[] getNewConnectionID() {
    return null;
  }
  
  public void init(TlsServerContext paramTlsServerContext) {
    this.context = paramTlsServerContext;
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
    this.offeredCipherSuites = null;
    this.clientExtensions = null;
    this.encryptThenMACOffered = false;
    this.maxFragmentLengthOffered = 0;
    this.truncatedHMacOffered = false;
    this.clientSentECPointFormats = false;
    this.certificateStatusRequest = null;
    this.selectedCipherSuite = -1;
    this.selectedProtocolName = null;
    this.serverExtensions.clear();
  }
  
  public TlsSession getSessionToResume(byte[] paramArrayOfbyte) {
    return null;
  }
  
  public byte[] getNewSessionID() {
    return null;
  }
  
  public TlsPSKExternal getExternalPSK(Vector paramVector) {
    return null;
  }
  
  public void notifySession(TlsSession paramTlsSession) {}
  
  public void notifyClientVersion(ProtocolVersion paramProtocolVersion) throws IOException {}
  
  public void notifyFallback(boolean paramBoolean) throws IOException {
    if (paramBoolean) {
      ProtocolVersion protocolVersion2;
      ProtocolVersion[] arrayOfProtocolVersion = getProtocolVersions();
      ProtocolVersion protocolVersion1 = this.context.getClientVersion();
      if (protocolVersion1.isTLS()) {
        protocolVersion2 = ProtocolVersion.getLatestTLS(arrayOfProtocolVersion);
      } else if (protocolVersion1.isDTLS()) {
        protocolVersion2 = ProtocolVersion.getLatestDTLS(arrayOfProtocolVersion);
      } else {
        throw new TlsFatalAlert((short)80);
      } 
      if (null != protocolVersion2 && protocolVersion2.isLaterVersionOf(protocolVersion1))
        throw new TlsFatalAlert((short)86); 
    } 
  }
  
  public void notifyOfferedCipherSuites(int[] paramArrayOfint) throws IOException {
    this.offeredCipherSuites = paramArrayOfint;
  }
  
  public void processClientExtensions(Hashtable paramHashtable) throws IOException {
    this.clientExtensions = paramHashtable;
    if (null != paramHashtable) {
      this.clientProtocolNames = TlsExtensionsUtils.getALPNExtensionClient(paramHashtable);
      if (shouldSelectProtocolNameEarly() && null != this.clientProtocolNames && !this.clientProtocolNames.isEmpty())
        this.selectedProtocolName = selectProtocolName(); 
      this.encryptThenMACOffered = TlsExtensionsUtils.hasEncryptThenMACExtension(paramHashtable);
      this.truncatedHMacOffered = TlsExtensionsUtils.hasTruncatedHMacExtension(paramHashtable);
      this.statusRequestV2 = TlsExtensionsUtils.getStatusRequestV2Extension(paramHashtable);
      this.trustedCAKeys = TlsExtensionsUtils.getTrustedCAKeysExtensionClient(paramHashtable);
      this.clientSentECPointFormats = (null != TlsExtensionsUtils.getSupportedPointFormatsExtension(paramHashtable));
      this.certificateStatusRequest = TlsExtensionsUtils.getStatusRequestExtension(paramHashtable);
      this.maxFragmentLengthOffered = TlsExtensionsUtils.getMaxFragmentLengthExtension(paramHashtable);
      if (this.maxFragmentLengthOffered >= 0 && !MaxFragmentLength.isValid(this.maxFragmentLengthOffered))
        throw new TlsFatalAlert((short)47); 
    } 
  }
  
  public ProtocolVersion getServerVersion() throws IOException {
    ProtocolVersion[] arrayOfProtocolVersion1 = getProtocolVersions();
    ProtocolVersion[] arrayOfProtocolVersion2 = this.context.getClientSupportedVersions();
    for (byte b = 0; b < arrayOfProtocolVersion2.length; b++) {
      ProtocolVersion protocolVersion = arrayOfProtocolVersion2[b];
      if (ProtocolVersion.contains(arrayOfProtocolVersion1, protocolVersion))
        return protocolVersion; 
    } 
    throw new TlsFatalAlert((short)70);
  }
  
  public int[] getSupportedGroups() throws IOException {
    return new int[] { 29, 30, 23, 24, 256, 257, 258 };
  }
  
  public int getSelectedCipherSuite() throws IOException {
    SecurityParameters securityParameters = this.context.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
    if (TlsUtils.isTLSv13(protocolVersion)) {
      int i = TlsUtils.getCommonCipherSuite13(protocolVersion, this.offeredCipherSuites, getCipherSuites(), preferLocalCipherSuites());
      if (i >= 0 && selectCipherSuite(i))
        return i; 
    } else {
      Vector vector = TlsUtils.getUsableSignatureAlgorithms(securityParameters.getClientSigAlgs());
      int i = getMaximumNegotiableCurveBits();
      int j = getMaximumNegotiableFiniteFieldBits();
      int[] arrayOfInt = TlsUtils.getCommonCipherSuites(this.offeredCipherSuites, getCipherSuites(), preferLocalCipherSuites());
      for (byte b = 0; b < arrayOfInt.length; b++) {
        int k = arrayOfInt[b];
        if (isSelectableCipherSuite(k, i, j, vector) && selectCipherSuite(k))
          return k; 
      } 
    } 
    throw new TlsFatalAlert((short)40, getDetailMessageNoCipherSuite());
  }
  
  public Hashtable getServerExtensions() throws IOException {
    boolean bool = TlsUtils.isTLSv13((TlsContext)this.context);
    if (bool) {
      if (null == this.certificateStatusRequest || allowCertificateStatus());
    } else {
      if (this.encryptThenMACOffered && allowEncryptThenMAC() && TlsUtils.isBlockCipherSuite(this.selectedCipherSuite))
        TlsExtensionsUtils.addEncryptThenMACExtension(this.serverExtensions); 
      if (this.truncatedHMacOffered && allowTruncatedHMac())
        TlsExtensionsUtils.addTruncatedHMacExtension(this.serverExtensions); 
      if (this.clientSentECPointFormats && TlsECCUtils.isECCCipherSuite(this.selectedCipherSuite))
        TlsExtensionsUtils.addSupportedPointFormatsExtension(this.serverExtensions, new short[] { 0 }); 
      if (null != this.statusRequestV2 && allowMultiCertStatus()) {
        TlsExtensionsUtils.addEmptyExtensionData(this.serverExtensions, TlsExtensionsUtils.EXT_status_request_v2);
      } else if (null != this.certificateStatusRequest && allowCertificateStatus()) {
        TlsExtensionsUtils.addEmptyExtensionData(this.serverExtensions, TlsExtensionsUtils.EXT_status_request);
      } 
      if (null != this.trustedCAKeys && allowTrustedCAIndication())
        TlsExtensionsUtils.addTrustedCAKeysExtensionServer(this.serverExtensions); 
    } 
    if (this.maxFragmentLengthOffered >= 0 && MaxFragmentLength.isValid(this.maxFragmentLengthOffered))
      TlsExtensionsUtils.addMaxFragmentLengthExtension(this.serverExtensions, this.maxFragmentLengthOffered); 
    short[] arrayOfShort1 = TlsExtensionsUtils.getServerCertificateTypeExtensionClient(this.clientExtensions);
    if (arrayOfShort1 != null) {
      TlsCredentials tlsCredentials = getCredentials();
      if (tlsCredentials != null) {
        short s = tlsCredentials.getCertificate().getCertificateType();
        if (1 == s && bool)
          throw new TlsFatalAlert((short)80, "The OpenPGP certificate type MUST NOT be used with TLS 1.3"); 
        if (!TlsUtils.contains(arrayOfShort1, 0, arrayOfShort1.length, s))
          throw new TlsFatalAlert((short)43); 
        TlsExtensionsUtils.addServerCertificateTypeExtensionServer(this.serverExtensions, s);
      } 
    } 
    short[] arrayOfShort2 = TlsExtensionsUtils.getClientCertificateTypeExtensionClient(this.clientExtensions);
    if (arrayOfShort2 != null) {
      short[] arrayOfShort = getAllowedClientCertificateTypes();
      if (arrayOfShort != null) {
        short[] arrayOfShort3;
        short[] arrayOfShort4;
        if (preferLocalClientCertificateTypes()) {
          arrayOfShort3 = arrayOfShort;
          arrayOfShort4 = arrayOfShort2;
        } else {
          arrayOfShort3 = arrayOfShort2;
          arrayOfShort4 = arrayOfShort;
        } 
        short s = -1;
        for (byte b = 0; b < arrayOfShort3.length; b++) {
          short s1 = arrayOfShort3[b];
          if ((1 != s1 || !bool) && TlsUtils.contains(arrayOfShort4, 0, arrayOfShort4.length, s1)) {
            s = s1;
            break;
          } 
        } 
        if (s == -1)
          throw new TlsFatalAlert((short)43); 
        TlsExtensionsUtils.addClientCertificateTypeExtensionServer(this.serverExtensions, s);
      } 
    } 
    return this.serverExtensions;
  }
  
  public void getServerExtensionsForConnection(Hashtable paramHashtable) throws IOException {
    if (!shouldSelectProtocolNameEarly() && null != this.clientProtocolNames && !this.clientProtocolNames.isEmpty())
      this.selectedProtocolName = selectProtocolName(); 
    if (null == this.selectedProtocolName) {
      paramHashtable.remove(TlsExtensionsUtils.EXT_application_layer_protocol_negotiation);
    } else {
      TlsExtensionsUtils.addALPNExtensionServer(paramHashtable, this.selectedProtocolName);
    } 
    if (ProtocolVersion.DTLSv12.equals(this.context.getServerVersion()) && this.clientExtensions != null && this.clientExtensions.containsKey(Integers.valueOf(54))) {
      byte[] arrayOfByte = getNewConnectionID();
      if (arrayOfByte != null)
        TlsExtensionsUtils.addConnectionIDExtension(paramHashtable, arrayOfByte); 
    } 
  }
  
  public Vector getServerSupplementalData() throws IOException {
    return null;
  }
  
  public CertificateStatus getCertificateStatus() throws IOException {
    return null;
  }
  
  public CertificateRequest getCertificateRequest() throws IOException {
    return null;
  }
  
  public TlsPSKIdentityManager getPSKIdentityManager() throws IOException {
    return null;
  }
  
  public TlsSRPLoginParameters getSRPLoginParameters() throws IOException {
    return null;
  }
  
  public TlsDHConfig getDHConfig() throws IOException {
    int i = TlsDHUtils.getMinimumFiniteFieldBits(this.selectedCipherSuite);
    int j = selectDH(i);
    return TlsDHUtils.createNamedDHConfig((TlsContext)this.context, j);
  }
  
  public TlsECConfig getECDHConfig() throws IOException {
    int i = TlsECCUtils.getMinimumCurveBits(this.selectedCipherSuite);
    int j = selectECDH(i);
    return TlsECCUtils.createNamedECConfig((TlsContext)this.context, j);
  }
  
  public void processClientSupplementalData(Vector paramVector) throws IOException {
    if (paramVector != null)
      throw new TlsFatalAlert((short)10); 
  }
  
  public void notifyClientCertificate(Certificate paramCertificate) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public NewSessionTicket getNewSessionTicket() throws IOException {
    return new NewSessionTicket(0L, TlsUtils.EMPTY_BYTES);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\AbstractTlsServer.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */