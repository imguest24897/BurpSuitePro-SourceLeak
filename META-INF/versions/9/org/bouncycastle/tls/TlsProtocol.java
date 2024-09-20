package META-INF.versions.9.org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.AbstractTlsContext;
import org.bouncycastle.tls.ByteQueue;
import org.bouncycastle.tls.ByteQueueInputStream;
import org.bouncycastle.tls.ByteQueueOutputStream;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.DeferredHash;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.ExtensionType;
import org.bouncycastle.tls.HandshakeMessageInput;
import org.bouncycastle.tls.HandshakeMessageOutput;
import org.bouncycastle.tls.HandshakeType;
import org.bouncycastle.tls.KeyUpdateRequest;
import org.bouncycastle.tls.MaxFragmentLength;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.RecordPreview;
import org.bouncycastle.tls.RecordStream;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.SessionParameters;
import org.bouncycastle.tls.SupplementalDataEntry;
import org.bouncycastle.tls.TlsCloseable;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsExtensionsUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsFatalAlertReceived;
import org.bouncycastle.tls.TlsHandshakeHash;
import org.bouncycastle.tls.TlsInputStream;
import org.bouncycastle.tls.TlsKeyExchange;
import org.bouncycastle.tls.TlsNoCloseNotifyException;
import org.bouncycastle.tls.TlsOutputStream;
import org.bouncycastle.tls.TlsPeer;
import org.bouncycastle.tls.TlsSession;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

public abstract class TlsProtocol implements TlsCloseable {
  protected static final Integer EXT_RenegotiationInfo = Integers.valueOf(65281);
  
  protected static final Integer EXT_SessionTicket = Integers.valueOf(35);
  
  protected static final short CS_START = 0;
  
  protected static final short CS_CLIENT_HELLO = 1;
  
  protected static final short CS_SERVER_HELLO_RETRY_REQUEST = 2;
  
  protected static final short CS_CLIENT_HELLO_RETRY = 3;
  
  protected static final short CS_SERVER_HELLO = 4;
  
  protected static final short CS_SERVER_ENCRYPTED_EXTENSIONS = 5;
  
  protected static final short CS_SERVER_SUPPLEMENTAL_DATA = 6;
  
  protected static final short CS_SERVER_CERTIFICATE = 7;
  
  protected static final short CS_SERVER_CERTIFICATE_STATUS = 8;
  
  protected static final short CS_SERVER_CERTIFICATE_VERIFY = 9;
  
  protected static final short CS_SERVER_KEY_EXCHANGE = 10;
  
  protected static final short CS_SERVER_CERTIFICATE_REQUEST = 11;
  
  protected static final short CS_SERVER_HELLO_DONE = 12;
  
  protected static final short CS_CLIENT_END_OF_EARLY_DATA = 13;
  
  protected static final short CS_CLIENT_SUPPLEMENTAL_DATA = 14;
  
  protected static final short CS_CLIENT_CERTIFICATE = 15;
  
  protected static final short CS_CLIENT_KEY_EXCHANGE = 16;
  
  protected static final short CS_CLIENT_CERTIFICATE_VERIFY = 17;
  
  protected static final short CS_CLIENT_FINISHED = 18;
  
  protected static final short CS_SERVER_SESSION_TICKET = 19;
  
  protected static final short CS_SERVER_FINISHED = 20;
  
  protected static final short CS_END = 21;
  
  protected static final short ADS_MODE_1_Nsub1 = 0;
  
  protected static final short ADS_MODE_0_N = 1;
  
  protected static final short ADS_MODE_0_N_FIRSTONLY = 2;
  
  private ByteQueue applicationDataQueue = new ByteQueue(0);
  
  private ByteQueue alertQueue = new ByteQueue(2);
  
  private ByteQueue handshakeQueue = new ByteQueue(0);
  
  final RecordStream recordStream;
  
  final Object recordWriteLock = new Object();
  
  private int maxHandshakeMessageSize = -1;
  
  TlsHandshakeHash handshakeHash;
  
  private TlsInputStream tlsInputStream = null;
  
  private TlsOutputStream tlsOutputStream = null;
  
  private volatile boolean closed = false;
  
  private volatile boolean failedWithError = false;
  
  private volatile boolean appDataReady = false;
  
  private volatile boolean appDataSplitEnabled = true;
  
  private volatile boolean keyUpdateEnabled = false;
  
  private volatile boolean keyUpdatePendingSend = false;
  
  private volatile boolean resumableHandshake = false;
  
  private volatile int appDataSplitMode = 0;
  
  protected TlsSession tlsSession = null;
  
  protected SessionParameters sessionParameters = null;
  
  protected TlsSecret sessionMasterSecret = null;
  
  protected byte[] retryCookie = null;
  
  protected int retryGroup = -1;
  
  protected Hashtable clientExtensions = null;
  
  protected Hashtable serverExtensions = null;
  
  protected short connection_state = 0;
  
  protected boolean selectedPSK13 = false;
  
  protected boolean receivedChangeCipherSpec = false;
  
  protected boolean expectSessionTicket = false;
  
  protected boolean blocking = false;
  
  protected ByteQueueInputStream inputBuffers;
  
  protected ByteQueueOutputStream outputBuffer;
  
  protected boolean isLegacyConnectionState() {
    switch (this.connection_state) {
      case 0:
      case 1:
      case 4:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
      case 12:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
        return true;
    } 
    return false;
  }
  
  protected boolean isTLSv13ConnectionState() {
    switch (this.connection_state) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 7:
      case 9:
      case 11:
      case 13:
      case 15:
      case 17:
      case 18:
      case 20:
      case 21:
        return true;
    } 
    return false;
  }
  
  protected TlsProtocol() {
    this.inputBuffers = new ByteQueueInputStream();
    this.outputBuffer = new ByteQueueOutputStream();
    this.recordStream = new RecordStream(this, (InputStream)this.inputBuffers, (OutputStream)this.outputBuffer);
  }
  
  protected TlsProtocol(InputStream paramInputStream, OutputStream paramOutputStream) {
    this.recordStream = new RecordStream(this, paramInputStream, paramOutputStream);
  }
  
  public void resumeHandshake() throws IOException {
    if (!this.blocking)
      throw new IllegalStateException("Cannot use resumeHandshake() in non-blocking mode!"); 
    if (!isHandshaking())
      throw new IllegalStateException("No handshake in progress"); 
    blockForHandshake();
  }
  
  protected void closeConnection() throws IOException {
    this.recordStream.close();
  }
  
  protected abstract TlsContext getContext();
  
  abstract AbstractTlsContext getContextAdmin();
  
  protected abstract TlsPeer getPeer();
  
  protected int getRenegotiationPolicy() {
    return 0;
  }
  
  protected void handleAlertMessage(short paramShort1, short paramShort2) throws IOException {
    getPeer().notifyAlertReceived(paramShort1, paramShort2);
    if (paramShort1 == 1) {
      handleAlertWarningMessage(paramShort2);
    } else {
      handleFailure();
      throw new TlsFatalAlertReceived(paramShort2);
    } 
  }
  
  protected void handleAlertWarningMessage(short paramShort) throws IOException {
    switch (paramShort) {
      case 0:
        if (!this.appDataReady)
          throw new TlsFatalAlert((short)40); 
        handleClose(false);
        break;
      case 41:
        throw new TlsFatalAlert((short)10);
      case 100:
        throw new TlsFatalAlert((short)40);
    } 
  }
  
  protected void handleChangeCipherSpecMessage() throws IOException {}
  
  protected void handleClose(boolean paramBoolean) throws IOException {
    if (!this.closed) {
      this.closed = true;
      if (!this.appDataReady) {
        cleanupHandshake();
        if (paramBoolean)
          raiseAlertWarning((short)90, "User canceled handshake"); 
      } 
      raiseAlertWarning((short)0, "Connection closed");
      closeConnection();
      getPeer().notifyConnectionClosed();
    } 
  }
  
  protected void handleException(short paramShort, String paramString, Throwable paramThrowable) throws IOException {
    if ((this.appDataReady || isResumableHandshake()) && paramThrowable instanceof java.io.InterruptedIOException)
      return; 
    if (!this.closed) {
      raiseAlertFatal(paramShort, paramString, paramThrowable);
      handleFailure();
    } 
  }
  
  protected void handleFailure() throws IOException {
    this.closed = true;
    this.failedWithError = true;
    invalidateSession();
    if (!this.appDataReady)
      cleanupHandshake(); 
    closeConnection();
    getPeer().notifyConnectionClosed();
  }
  
  protected abstract void handleHandshakeMessage(short paramShort, HandshakeMessageInput paramHandshakeMessageInput) throws IOException;
  
  protected boolean handleRenegotiation() throws IOException {
    int i = 0;
    SecurityParameters securityParameters = getContext().getSecurityParametersConnection();
    if (null != securityParameters && securityParameters.isSecureRenegotiation() && (!securityParameters.isResumedSession() || securityParameters.isExtendedMasterSecret())) {
      Certificate certificate = (0 == securityParameters.getEntity()) ? securityParameters.getLocalCertificate() : securityParameters.getPeerCertificate();
      if (null != certificate && !certificate.isEmpty())
        i = getRenegotiationPolicy(); 
    } 
    switch (i) {
      case 2:
        beginHandshake(true);
        return true;
      case 1:
        return false;
    } 
    refuseRenegotiation();
    return false;
  }
  
  protected void applyMaxFragmentLengthExtension(short paramShort) throws IOException {
    if (paramShort >= 0) {
      if (!MaxFragmentLength.isValid(paramShort))
        throw new TlsFatalAlert((short)80); 
      int i = 1 << 8 + paramShort;
      this.recordStream.setPlaintextLimit(i);
    } 
  }
  
  protected void checkReceivedChangeCipherSpec(boolean paramBoolean) throws IOException {
    if (paramBoolean != this.receivedChangeCipherSpec)
      throw new TlsFatalAlert((short)10); 
  }
  
  protected void blockForHandshake() throws IOException {
    while (this.connection_state != 21) {
      if (isClosed())
        throw new TlsFatalAlert((short)80); 
      safeReadRecord();
    } 
  }
  
  protected void beginHandshake(boolean paramBoolean) throws IOException {
    AbstractTlsContext abstractTlsContext = getContextAdmin();
    TlsPeer tlsPeer = getPeer();
    this.maxHandshakeMessageSize = Math.max(1024, tlsPeer.getMaxHandshakeMessageSize());
    this.handshakeHash = (TlsHandshakeHash)new DeferredHash((TlsContext)abstractTlsContext);
    this.connection_state = 0;
    this.selectedPSK13 = false;
    abstractTlsContext.handshakeBeginning(tlsPeer);
    SecurityParameters securityParameters = abstractTlsContext.getSecurityParametersHandshake();
    if (paramBoolean != securityParameters.isRenegotiating())
      throw new TlsFatalAlert((short)80); 
    securityParameters.extendedPadding = tlsPeer.shouldUseExtendedPadding();
  }
  
  protected void cleanupHandshake() {
    TlsContext tlsContext = getContext();
    if (null != tlsContext) {
      SecurityParameters securityParameters = tlsContext.getSecurityParameters();
      if (null != securityParameters)
        securityParameters.clear(); 
    } 
    this.tlsSession = null;
    this.sessionParameters = null;
    this.sessionMasterSecret = null;
    this.retryCookie = null;
    this.retryGroup = -1;
    this.clientExtensions = null;
    this.serverExtensions = null;
    this.selectedPSK13 = false;
    this.receivedChangeCipherSpec = false;
    this.expectSessionTicket = false;
  }
  
  protected void completeHandshake() throws IOException {
    try {
      AbstractTlsContext abstractTlsContext = getContextAdmin();
      SecurityParameters securityParameters = abstractTlsContext.getSecurityParametersHandshake();
      if (!abstractTlsContext.isHandshaking() || null == securityParameters.getLocalVerifyData() || null == securityParameters.getPeerVerifyData())
        throw new TlsFatalAlert((short)80); 
      this.recordStream.finaliseHandshake();
      this.connection_state = 21;
      this.handshakeHash = (TlsHandshakeHash)new DeferredHash((TlsContext)abstractTlsContext);
      this.alertQueue.shrink();
      this.handshakeQueue.shrink();
      ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
      this.appDataSplitEnabled = !TlsUtils.isTLSv11(protocolVersion);
      this.appDataReady = true;
      this.keyUpdateEnabled = TlsUtils.isTLSv13(protocolVersion);
      if (this.blocking) {
        this.tlsInputStream = new TlsInputStream(this);
        this.tlsOutputStream = new TlsOutputStream(this);
      } 
      if (this.sessionParameters == null) {
        this.sessionMasterSecret = securityParameters.getMasterSecret();
        this.sessionParameters = (new SessionParameters.Builder()).setCipherSuite(securityParameters.getCipherSuite()).setExtendedMasterSecret(securityParameters.isExtendedMasterSecret()).setLocalCertificate(securityParameters.getLocalCertificate()).setMasterSecret(abstractTlsContext.getCrypto().adoptSecret(this.sessionMasterSecret)).setNegotiatedVersion(securityParameters.getNegotiatedVersion()).setPeerCertificate(securityParameters.getPeerCertificate()).setPSKIdentity(securityParameters.getPSKIdentity()).setSRPIdentity(securityParameters.getSRPIdentity()).setServerExtensions(this.serverExtensions).build();
        this.tlsSession = TlsUtils.importSession(securityParameters.getSessionID(), this.sessionParameters);
      } else {
        securityParameters.localCertificate = this.sessionParameters.getLocalCertificate();
        securityParameters.peerCertificate = this.sessionParameters.getPeerCertificate();
        securityParameters.pskIdentity = this.sessionParameters.getPSKIdentity();
        securityParameters.srpIdentity = this.sessionParameters.getSRPIdentity();
      } 
      abstractTlsContext.handshakeComplete(getPeer(), this.tlsSession);
    } finally {
      cleanupHandshake();
    } 
  }
  
  protected void processRecord(short paramShort, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    switch (paramShort) {
      case 21:
        this.alertQueue.addData(paramArrayOfbyte, paramInt1, paramInt2);
        processAlertQueue();
        return;
      case 23:
        if (!this.appDataReady)
          throw new TlsFatalAlert((short)10); 
        this.applicationDataQueue.addData(paramArrayOfbyte, paramInt1, paramInt2);
        processApplicationDataQueue();
        return;
      case 20:
        processChangeCipherSpec(paramArrayOfbyte, paramInt1, paramInt2);
        return;
      case 22:
        if (this.handshakeQueue.available() > 0) {
          this.handshakeQueue.addData(paramArrayOfbyte, paramInt1, paramInt2);
          processHandshakeQueue(this.handshakeQueue);
        } else {
          ByteQueue byteQueue = new ByteQueue(paramArrayOfbyte, paramInt1, paramInt2);
          processHandshakeQueue(byteQueue);
          int i = byteQueue.available();
          if (i > 0)
            this.handshakeQueue.addData(paramArrayOfbyte, paramInt1 + paramInt2 - i, i); 
        } 
        return;
    } 
    throw new TlsFatalAlert((short)10);
  }
  
  private void processHandshakeQueue(ByteQueue paramByteQueue) throws IOException {
    while (paramByteQueue.available() >= 4) {
      ProtocolVersion protocolVersion1;
      ProtocolVersion protocolVersion2;
      int i = paramByteQueue.readInt32();
      short s = (short)(i >>> 24);
      if (!HandshakeType.isRecognized(s))
        throw new TlsFatalAlert((short)10, "Handshake message of unrecognized type: " + s); 
      int j = i & 0xFFFFFF;
      if (j > this.maxHandshakeMessageSize)
        throw new TlsFatalAlert((short)80, "Handshake message length exceeds the maximum: " + HandshakeType.getText(s) + ", " + j + " > " + this.maxHandshakeMessageSize); 
      int k = 4 + j;
      if (paramByteQueue.available() < k)
        break; 
      switch (s) {
        case 0:
          break;
        default:
          protocolVersion1 = getContext().getServerVersion();
          if (null != protocolVersion1 && TlsUtils.isTLSv13(protocolVersion1))
            break; 
          checkReceivedChangeCipherSpec((20 == s));
          break;
      } 
      HandshakeMessageInput handshakeMessageInput = paramByteQueue.readHandshakeMessage(k);
      switch (s) {
        case 0:
        case 24:
          break;
        case 4:
          protocolVersion2 = getContext().getServerVersion();
          if (null != protocolVersion2 && !TlsUtils.isTLSv13(protocolVersion2))
            handshakeMessageInput.updateHash((TlsHash)this.handshakeHash); 
          break;
        case 1:
        case 2:
        case 15:
        case 20:
          break;
        default:
          handshakeMessageInput.updateHash((TlsHash)this.handshakeHash);
          break;
      } 
      handshakeMessageInput.skip(4L);
      handleHandshakeMessage(s, handshakeMessageInput);
    } 
  }
  
  private void processApplicationDataQueue() {}
  
  private void processAlertQueue() throws IOException {
    while (this.alertQueue.available() >= 2) {
      byte[] arrayOfByte = this.alertQueue.removeData(2, 0);
      short s1 = (short)arrayOfByte[0];
      short s2 = (short)arrayOfByte[1];
      handleAlertMessage(s1, s2);
    } 
  }
  
  private void processChangeCipherSpec(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    ProtocolVersion protocolVersion = getContext().getServerVersion();
    if (null == protocolVersion || TlsUtils.isTLSv13(protocolVersion))
      throw new TlsFatalAlert((short)10); 
    for (byte b = 0; b < paramInt2; b++) {
      short s = TlsUtils.readUint8(paramArrayOfbyte, paramInt1 + b);
      if (s != 1)
        throw new TlsFatalAlert((short)50); 
      if (this.receivedChangeCipherSpec || this.alertQueue.available() > 0 || this.handshakeQueue.available() > 0)
        throw new TlsFatalAlert((short)10); 
      this.recordStream.notifyChangeCipherSpecReceived();
      this.receivedChangeCipherSpec = true;
      handleChangeCipherSpecMessage();
    } 
  }
  
  public int applicationDataAvailable() {
    return this.applicationDataQueue.available();
  }
  
  public int readApplicationData(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (paramArrayOfbyte == null)
      throw new NullPointerException(); 
    int i = paramArrayOfbyte.length - paramInt1;
    int j = i - paramInt2;
    if ((paramInt1 | paramInt2 | i | j) < 0)
      throw new IndexOutOfBoundsException(); 
    if (!this.appDataReady)
      throw new IllegalStateException("Cannot read application data until initial handshake completed."); 
    if (paramInt2 < 1)
      return 0; 
    while (this.applicationDataQueue.available() < 1) {
      if (this.closed) {
        if (this.failedWithError)
          throw new IOException("Cannot read application data on failed TLS connection"); 
        return -1;
      } 
      safeReadRecord();
    } 
    paramInt2 = Math.min(paramInt2, this.applicationDataQueue.available());
    this.applicationDataQueue.removeData(paramArrayOfbyte, paramInt1, paramInt2, 0);
    return paramInt2;
  }
  
  protected RecordPreview safePreviewRecordHeader(byte[] paramArrayOfbyte) throws IOException {
    try {
      return this.recordStream.previewRecordHeader(paramArrayOfbyte);
    } catch (TlsFatalAlert tlsFatalAlert) {
      handleException(tlsFatalAlert.getAlertDescription(), "Failed to read record", (Throwable)tlsFatalAlert);
      throw tlsFatalAlert;
    } catch (IOException iOException) {
      handleException((short)80, "Failed to read record", iOException);
      throw iOException;
    } catch (RuntimeException runtimeException) {
      handleException((short)80, "Failed to read record", runtimeException);
      throw new TlsFatalAlert((short)80, runtimeException);
    } 
  }
  
  protected void safeReadRecord() throws IOException {
    try {
      if (this.recordStream.readRecord())
        return; 
      if (!this.appDataReady)
        throw new TlsFatalAlert((short)40); 
      if (!getPeer().requiresCloseNotify()) {
        handleClose(false);
        return;
      } 
    } catch (TlsFatalAlertReceived tlsFatalAlertReceived) {
      throw tlsFatalAlertReceived;
    } catch (TlsFatalAlert tlsFatalAlert) {
      handleException(tlsFatalAlert.getAlertDescription(), "Failed to read record", (Throwable)tlsFatalAlert);
      throw tlsFatalAlert;
    } catch (IOException iOException) {
      handleException((short)80, "Failed to read record", iOException);
      throw iOException;
    } catch (RuntimeException runtimeException) {
      handleException((short)80, "Failed to read record", runtimeException);
      throw new TlsFatalAlert((short)80, runtimeException);
    } 
    handleFailure();
    throw new TlsNoCloseNotifyException();
  }
  
  protected boolean safeReadFullRecord(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    try {
      return this.recordStream.readFullRecord(paramArrayOfbyte, paramInt1, paramInt2);
    } catch (TlsFatalAlert tlsFatalAlert) {
      handleException(tlsFatalAlert.getAlertDescription(), "Failed to process record", (Throwable)tlsFatalAlert);
      throw tlsFatalAlert;
    } catch (IOException iOException) {
      handleException((short)80, "Failed to process record", iOException);
      throw iOException;
    } catch (RuntimeException runtimeException) {
      handleException((short)80, "Failed to process record", runtimeException);
      throw new TlsFatalAlert((short)80, runtimeException);
    } 
  }
  
  protected void safeWriteRecord(short paramShort, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    try {
      this.recordStream.writeRecord(paramShort, paramArrayOfbyte, paramInt1, paramInt2);
    } catch (TlsFatalAlert tlsFatalAlert) {
      handleException(tlsFatalAlert.getAlertDescription(), "Failed to write record", (Throwable)tlsFatalAlert);
      throw tlsFatalAlert;
    } catch (IOException iOException) {
      handleException((short)80, "Failed to write record", iOException);
      throw iOException;
    } catch (RuntimeException runtimeException) {
      handleException((short)80, "Failed to write record", runtimeException);
      throw new TlsFatalAlert((short)80, runtimeException);
    } 
  }
  
  public void writeApplicationData(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (paramArrayOfbyte == null)
      throw new NullPointerException(); 
    int i = paramArrayOfbyte.length - paramInt1;
    int j = i - paramInt2;
    if ((paramInt1 | paramInt2 | i | j) < 0)
      throw new IndexOutOfBoundsException(); 
    if (!this.appDataReady)
      throw new IllegalStateException("Cannot write application data until initial handshake completed."); 
    synchronized (this.recordWriteLock) {
      while (paramInt2 > 0) {
        if (this.closed)
          throw new IOException("Cannot write application data on closed/failed TLS connection"); 
        if (this.appDataSplitEnabled) {
          switch (this.appDataSplitMode) {
            case 2:
              this.appDataSplitEnabled = false;
            case 1:
              safeWriteRecord((short)23, TlsUtils.EMPTY_BYTES, 0, 0);
              break;
            default:
              if (paramInt2 > 1) {
                safeWriteRecord((short)23, paramArrayOfbyte, paramInt1, 1);
                paramInt1++;
                paramInt2--;
              } 
              break;
          } 
        } else if (this.keyUpdateEnabled) {
          if (this.keyUpdatePendingSend) {
            send13KeyUpdate(false);
          } else if (this.recordStream.needsKeyUpdate()) {
            send13KeyUpdate(true);
          } 
        } 
        j = Math.min(paramInt2, this.recordStream.getPlaintextLimit());
        safeWriteRecord((short)23, paramArrayOfbyte, paramInt1, j);
        paramInt1 += j;
        paramInt2 -= j;
      } 
    } 
  }
  
  public int getAppDataSplitMode() {
    return this.appDataSplitMode;
  }
  
  public void setAppDataSplitMode(int paramInt) {
    if (paramInt < 0 || paramInt > 2)
      throw new IllegalArgumentException("Illegal appDataSplitMode mode: " + paramInt); 
    this.appDataSplitMode = paramInt;
  }
  
  public boolean isResumableHandshake() {
    return this.resumableHandshake;
  }
  
  public void setResumableHandshake(boolean paramBoolean) {
    this.resumableHandshake = paramBoolean;
  }
  
  void writeHandshakeMessage(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    ProtocolVersion protocolVersion;
    if (paramInt2 < 4)
      throw new TlsFatalAlert((short)80); 
    short s = TlsUtils.readUint8(paramArrayOfbyte, paramInt1);
    switch (s) {
      case 0:
      case 24:
        break;
      case 4:
        protocolVersion = getContext().getServerVersion();
        if (null != protocolVersion && !TlsUtils.isTLSv13(protocolVersion))
          this.handshakeHash.update(paramArrayOfbyte, paramInt1, paramInt2); 
        break;
      case 1:
        break;
      default:
        this.handshakeHash.update(paramArrayOfbyte, paramInt1, paramInt2);
        break;
    } 
    int i = 0;
    do {
      int j = Math.min(paramInt2 - i, this.recordStream.getPlaintextLimit());
      safeWriteRecord((short)22, paramArrayOfbyte, paramInt1 + i, j);
      i += j;
    } while (i < paramInt2);
  }
  
  public OutputStream getOutputStream() {
    if (!this.blocking)
      throw new IllegalStateException("Cannot use OutputStream in non-blocking mode! Use offerOutput() instead."); 
    return (OutputStream)this.tlsOutputStream;
  }
  
  public InputStream getInputStream() {
    if (!this.blocking)
      throw new IllegalStateException("Cannot use InputStream in non-blocking mode! Use offerInput() instead."); 
    return (InputStream)this.tlsInputStream;
  }
  
  public void closeInput() throws IOException {
    if (this.blocking)
      throw new IllegalStateException("Cannot use closeInput() in blocking mode!"); 
    if (this.closed)
      return; 
    if (this.inputBuffers.available() > 0)
      throw new EOFException(); 
    if (!this.appDataReady)
      throw new TlsFatalAlert((short)40); 
    if (!getPeer().requiresCloseNotify()) {
      handleClose(false);
      return;
    } 
    handleFailure();
    throw new TlsNoCloseNotifyException();
  }
  
  public RecordPreview previewInputRecord(byte[] paramArrayOfbyte) throws IOException {
    if (this.blocking)
      throw new IllegalStateException("Cannot use previewInputRecord() in blocking mode!"); 
    if (this.inputBuffers.available() != 0)
      throw new IllegalStateException("Can only use previewInputRecord() for record-aligned input."); 
    if (this.closed)
      throw new IOException("Connection is closed, cannot accept any more input"); 
    return safePreviewRecordHeader(paramArrayOfbyte);
  }
  
  public int previewOutputRecord() {
    if (this.blocking)
      throw new IllegalStateException("Cannot use previewOutputRecord() in blocking mode!"); 
    ByteQueue byteQueue = this.outputBuffer.getBuffer();
    int i = byteQueue.available();
    if (i < 1)
      return 0; 
    if (i >= 5) {
      int j = byteQueue.readUint16(3);
      int k = 5 + j;
      if (i >= k)
        return k; 
    } 
    throw new IllegalStateException("Can only use previewOutputRecord() for record-aligned output.");
  }
  
  public RecordPreview previewOutputRecord(int paramInt) throws IOException {
    if (!this.appDataReady)
      throw new IllegalStateException("Cannot use previewOutputRecord() until initial handshake completed."); 
    if (this.blocking)
      throw new IllegalStateException("Cannot use previewOutputRecord() in blocking mode!"); 
    if (this.outputBuffer.getBuffer().available() != 0)
      throw new IllegalStateException("Can only use previewOutputRecord() for record-aligned output."); 
    if (this.closed)
      throw new IOException("Connection is closed, cannot produce any more output"); 
    if (paramInt < 1)
      return new RecordPreview(0, 0); 
    if (this.appDataSplitEnabled) {
      RecordPreview recordPreview2;
      switch (this.appDataSplitMode) {
        case 1:
        case 2:
          recordPreview1 = this.recordStream.previewOutputRecord(0);
          recordPreview2 = this.recordStream.previewOutputRecord(paramInt);
          return RecordPreview.combineAppData(recordPreview1, recordPreview2);
      } 
      RecordPreview recordPreview1 = this.recordStream.previewOutputRecord(1);
      if (paramInt > 1) {
        recordPreview2 = this.recordStream.previewOutputRecord(paramInt - 1);
        recordPreview1 = RecordPreview.combineAppData(recordPreview1, recordPreview2);
      } 
      return recordPreview1;
    } 
    RecordPreview recordPreview = this.recordStream.previewOutputRecord(paramInt);
    if (this.keyUpdateEnabled && (this.keyUpdatePendingSend || this.recordStream.needsKeyUpdate())) {
      int i = HandshakeMessageOutput.getLength(1);
      int j = this.recordStream.previewOutputRecordSize(i);
      recordPreview = RecordPreview.extendRecordSize(recordPreview, j);
    } 
    return recordPreview;
  }
  
  public void offerInput(byte[] paramArrayOfbyte) throws IOException {
    offerInput(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void offerInput(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (this.blocking)
      throw new IllegalStateException("Cannot use offerInput() in blocking mode! Use getInputStream() instead."); 
    if (this.closed)
      throw new IOException("Connection is closed, cannot accept any more input"); 
    if (this.inputBuffers.available() == 0 && safeReadFullRecord(paramArrayOfbyte, paramInt1, paramInt2)) {
      if (this.closed && !this.appDataReady)
        throw new TlsFatalAlert((short)80); 
      return;
    } 
    this.inputBuffers.addBytes(paramArrayOfbyte, paramInt1, paramInt2);
    while (this.inputBuffers.available() >= 5) {
      byte[] arrayOfByte = new byte[5];
      if (5 != this.inputBuffers.peek(arrayOfByte))
        throw new TlsFatalAlert((short)80); 
      RecordPreview recordPreview = safePreviewRecordHeader(arrayOfByte);
      if (this.inputBuffers.available() < recordPreview.getRecordSize())
        break; 
      safeReadRecord();
      if (this.closed) {
        if (!this.appDataReady)
          throw new TlsFatalAlert((short)80); 
        break;
      } 
    } 
  }
  
  public int getApplicationDataLimit() {
    return this.recordStream.getPlaintextLimit();
  }
  
  public int getAvailableInputBytes() {
    if (this.blocking)
      throw new IllegalStateException("Cannot use getAvailableInputBytes() in blocking mode! Use getInputStream().available() instead."); 
    return applicationDataAvailable();
  }
  
  public int readInput(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.blocking)
      throw new IllegalStateException("Cannot use readInput() in blocking mode! Use getInputStream() instead."); 
    paramInt2 = Math.min(paramInt2, this.applicationDataQueue.available());
    if (paramInt2 < 1)
      return 0; 
    this.applicationDataQueue.removeData(paramArrayOfbyte, paramInt1, paramInt2, 0);
    return paramInt2;
  }
  
  public int readInput(ByteBuffer paramByteBuffer, int paramInt) {
    if (this.blocking)
      throw new IllegalStateException("Cannot use readInput() in blocking mode! Use getInputStream() instead."); 
    paramInt = Math.min(paramInt, this.applicationDataQueue.available());
    if (paramInt < 1)
      return 0; 
    this.applicationDataQueue.removeData(paramByteBuffer, paramInt, 0);
    return paramInt;
  }
  
  public int getAvailableOutputBytes() {
    if (this.blocking)
      throw new IllegalStateException("Cannot use getAvailableOutputBytes() in blocking mode! Use getOutputStream() instead."); 
    return this.outputBuffer.getBuffer().available();
  }
  
  public int readOutput(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.blocking)
      throw new IllegalStateException("Cannot use readOutput() in blocking mode! Use getOutputStream() instead."); 
    int i = Math.min(getAvailableOutputBytes(), paramInt2);
    this.outputBuffer.getBuffer().removeData(paramArrayOfbyte, paramInt1, i, 0);
    return i;
  }
  
  public int readOutput(ByteBuffer paramByteBuffer, int paramInt) {
    if (this.blocking)
      throw new IllegalStateException("Cannot use readOutput() in blocking mode! Use getOutputStream() instead."); 
    int i = Math.min(getAvailableOutputBytes(), paramInt);
    this.outputBuffer.getBuffer().removeData(paramByteBuffer, i, 0);
    return i;
  }
  
  protected boolean establishSession(TlsSession paramTlsSession) {
    this.tlsSession = null;
    this.sessionParameters = null;
    this.sessionMasterSecret = null;
    if (null == paramTlsSession || !paramTlsSession.isResumable())
      return false; 
    SessionParameters sessionParameters = paramTlsSession.exportSessionParameters();
    if (null == sessionParameters)
      return false; 
    ProtocolVersion protocolVersion = sessionParameters.getNegotiatedVersion();
    if (null == protocolVersion || !protocolVersion.isTLS())
      return false; 
    boolean bool = sessionParameters.isExtendedMasterSecret();
    if (protocolVersion.isSSL()) {
      if (bool)
        return false; 
    } else if (!TlsUtils.isExtendedMasterSecretOptional(protocolVersion) && !bool) {
      return false;
    } 
    TlsCrypto tlsCrypto = getContext().getCrypto();
    TlsSecret tlsSecret = TlsUtils.getSessionMasterSecret(tlsCrypto, sessionParameters.getMasterSecret());
    if (null == tlsSecret)
      return false; 
    this.tlsSession = paramTlsSession;
    this.sessionParameters = sessionParameters;
    this.sessionMasterSecret = tlsSecret;
    return true;
  }
  
  protected void cancelSession() {
    if (this.sessionMasterSecret != null) {
      this.sessionMasterSecret.destroy();
      this.sessionMasterSecret = null;
    } 
    if (this.sessionParameters != null) {
      this.sessionParameters.clear();
      this.sessionParameters = null;
    } 
    this.tlsSession = null;
  }
  
  protected void invalidateSession() {
    if (this.tlsSession != null)
      this.tlsSession.invalidate(); 
    cancelSession();
  }
  
  protected void processFinishedMessage(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    TlsContext tlsContext = getContext();
    SecurityParameters securityParameters = tlsContext.getSecurityParametersHandshake();
    boolean bool = tlsContext.isServer();
    byte[] arrayOfByte1 = TlsUtils.readFully(securityParameters.getVerifyDataLength(), paramByteArrayInputStream);
    assertEmpty(paramByteArrayInputStream);
    byte[] arrayOfByte2 = TlsUtils.calculateVerifyData(tlsContext, this.handshakeHash, !bool);
    if (!Arrays.constantTimeAreEqual(arrayOfByte2, arrayOfByte1))
      throw new TlsFatalAlert((short)51); 
    securityParameters.peerVerifyData = arrayOfByte2;
    if ((!securityParameters.isResumedSession() || securityParameters.isExtendedMasterSecret()) && null == securityParameters.getLocalVerifyData())
      securityParameters.tlsUnique = arrayOfByte2; 
  }
  
  protected void process13FinishedMessage(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    TlsContext tlsContext = getContext();
    SecurityParameters securityParameters = tlsContext.getSecurityParametersHandshake();
    boolean bool = tlsContext.isServer();
    byte[] arrayOfByte1 = TlsUtils.readFully(securityParameters.getVerifyDataLength(), paramByteArrayInputStream);
    assertEmpty(paramByteArrayInputStream);
    byte[] arrayOfByte2 = TlsUtils.calculateVerifyData(tlsContext, this.handshakeHash, !bool);
    if (!Arrays.constantTimeAreEqual(arrayOfByte2, arrayOfByte1))
      throw new TlsFatalAlert((short)51); 
    securityParameters.peerVerifyData = arrayOfByte2;
    securityParameters.tlsUnique = null;
  }
  
  protected void raiseAlertFatal(short paramShort, String paramString, Throwable paramThrowable) throws IOException {
    getPeer().notifyAlertRaised((short)2, paramShort, paramString, paramThrowable);
    byte[] arrayOfByte = { 2, (byte)paramShort };
    try {
      this.recordStream.writeRecord((short)21, arrayOfByte, 0, 2);
    } catch (Exception exception) {}
  }
  
  protected void raiseAlertWarning(short paramShort, String paramString) throws IOException {
    getPeer().notifyAlertRaised((short)1, paramShort, paramString, null);
    byte[] arrayOfByte = { 1, (byte)paramShort };
    safeWriteRecord((short)21, arrayOfByte, 0, 2);
  }
  
  protected void receive13KeyUpdate(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    if (!this.appDataReady || !this.keyUpdateEnabled)
      throw new TlsFatalAlert((short)10); 
    short s = TlsUtils.readUint8(paramByteArrayInputStream);
    assertEmpty(paramByteArrayInputStream);
    if (!KeyUpdateRequest.isValid(s))
      throw new TlsFatalAlert((short)47); 
    boolean bool = (1 == s);
    TlsUtils.update13TrafficSecretPeer(getContext());
    this.recordStream.notifyKeyUpdateReceived();
    this.keyUpdatePendingSend |= bool;
  }
  
  protected void sendCertificateMessage(Certificate paramCertificate, OutputStream paramOutputStream) throws IOException {
    TlsContext tlsContext = getContext();
    SecurityParameters securityParameters = tlsContext.getSecurityParametersHandshake();
    if (null != securityParameters.getLocalCertificate())
      throw new TlsFatalAlert((short)80); 
    if (null == paramCertificate)
      paramCertificate = Certificate.EMPTY_CHAIN; 
    if (paramCertificate.isEmpty() && !tlsContext.isServer() && securityParameters.getNegotiatedVersion().isSSL()) {
      String str = "SSLv3 client didn't provide credentials";
      raiseAlertWarning((short)41, str);
    } else {
      HandshakeMessageOutput handshakeMessageOutput = new HandshakeMessageOutput((short)11);
      paramCertificate.encode(tlsContext, (OutputStream)handshakeMessageOutput, paramOutputStream);
      handshakeMessageOutput.send(this);
    } 
    securityParameters.localCertificate = paramCertificate;
  }
  
  protected void send13CertificateMessage(Certificate paramCertificate) throws IOException {
    if (null == paramCertificate)
      throw new TlsFatalAlert((short)80); 
    TlsContext tlsContext = getContext();
    SecurityParameters securityParameters = tlsContext.getSecurityParametersHandshake();
    if (null != securityParameters.getLocalCertificate())
      throw new TlsFatalAlert((short)80); 
    HandshakeMessageOutput handshakeMessageOutput = new HandshakeMessageOutput((short)11);
    paramCertificate.encode(tlsContext, (OutputStream)handshakeMessageOutput, null);
    handshakeMessageOutput.send(this);
    securityParameters.localCertificate = paramCertificate;
  }
  
  protected void send13CertificateVerifyMessage(DigitallySigned paramDigitallySigned) throws IOException {
    HandshakeMessageOutput handshakeMessageOutput = new HandshakeMessageOutput((short)15);
    paramDigitallySigned.encode((OutputStream)handshakeMessageOutput);
    handshakeMessageOutput.send(this);
  }
  
  protected void sendChangeCipherSpec() throws IOException {
    sendChangeCipherSpecMessage();
    this.recordStream.enablePendingCipherWrite();
  }
  
  protected void sendChangeCipherSpecMessage() throws IOException {
    byte[] arrayOfByte = { 1 };
    safeWriteRecord((short)20, arrayOfByte, 0, arrayOfByte.length);
  }
  
  protected void sendFinishedMessage() throws IOException {
    TlsContext tlsContext = getContext();
    SecurityParameters securityParameters = tlsContext.getSecurityParametersHandshake();
    boolean bool = tlsContext.isServer();
    byte[] arrayOfByte = TlsUtils.calculateVerifyData(tlsContext, this.handshakeHash, bool);
    securityParameters.localVerifyData = arrayOfByte;
    if ((!securityParameters.isResumedSession() || securityParameters.isExtendedMasterSecret()) && null == securityParameters.getPeerVerifyData())
      securityParameters.tlsUnique = arrayOfByte; 
    HandshakeMessageOutput.send(this, (short)20, arrayOfByte);
  }
  
  protected void send13FinishedMessage() throws IOException {
    TlsContext tlsContext = getContext();
    SecurityParameters securityParameters = tlsContext.getSecurityParametersHandshake();
    boolean bool = tlsContext.isServer();
    byte[] arrayOfByte = TlsUtils.calculateVerifyData(tlsContext, this.handshakeHash, bool);
    securityParameters.localVerifyData = arrayOfByte;
    securityParameters.tlsUnique = null;
    HandshakeMessageOutput.send(this, (short)20, arrayOfByte);
  }
  
  protected void send13KeyUpdate(boolean paramBoolean) throws IOException {
    if (!this.appDataReady || !this.keyUpdateEnabled)
      throw new TlsFatalAlert((short)80); 
    boolean bool = paramBoolean ? true : false;
    HandshakeMessageOutput.send(this, (short)24, TlsUtils.encodeUint8(bool));
    TlsUtils.update13TrafficSecretLocal(getContext());
    this.recordStream.notifyKeyUpdateSent();
    this.keyUpdatePendingSend &= paramBoolean;
  }
  
  protected void sendSupplementalDataMessage(Vector paramVector) throws IOException {
    HandshakeMessageOutput handshakeMessageOutput = new HandshakeMessageOutput((short)23);
    writeSupplementalData((OutputStream)handshakeMessageOutput, paramVector);
    handshakeMessageOutput.send(this);
  }
  
  public void close() throws IOException {
    handleClose(true);
  }
  
  public void flush() throws IOException {}
  
  boolean isApplicationDataReady() {
    return this.appDataReady;
  }
  
  public boolean isClosed() {
    return this.closed;
  }
  
  public boolean isConnected() {
    if (this.closed)
      return false; 
    AbstractTlsContext abstractTlsContext = getContextAdmin();
    return (null != abstractTlsContext && abstractTlsContext.isConnected());
  }
  
  public boolean isHandshaking() {
    if (this.closed)
      return false; 
    AbstractTlsContext abstractTlsContext = getContextAdmin();
    return (null != abstractTlsContext && abstractTlsContext.isHandshaking());
  }
  
  protected short processMaxFragmentLengthExtension(Hashtable paramHashtable1, Hashtable paramHashtable2, short paramShort) throws IOException {
    return TlsUtils.processMaxFragmentLengthExtension(paramHashtable1, paramHashtable2, paramShort);
  }
  
  protected void refuseRenegotiation() throws IOException {
    if (TlsUtils.isSSL(getContext()))
      throw new TlsFatalAlert((short)40); 
    raiseAlertWarning((short)100, "Renegotiation not supported");
  }
  
  protected static void assertEmpty(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    if (paramByteArrayInputStream.available() > 0)
      throw new TlsFatalAlert((short)50); 
  }
  
  protected static byte[] createRandomBlock(boolean paramBoolean, TlsContext paramTlsContext) {
    byte[] arrayOfByte = paramTlsContext.getNonceGenerator().generateNonce(32);
    if (paramBoolean)
      TlsUtils.writeGMTUnixTime(arrayOfByte, 0); 
    return arrayOfByte;
  }
  
  protected static byte[] createRenegotiationInfo(byte[] paramArrayOfbyte) throws IOException {
    return TlsUtils.encodeOpaque8(paramArrayOfbyte);
  }
  
  protected static void establishMasterSecret(TlsContext paramTlsContext, TlsKeyExchange paramTlsKeyExchange) throws IOException {
    TlsSecret tlsSecret = paramTlsKeyExchange.generatePreMasterSecret();
    if (tlsSecret == null)
      throw new TlsFatalAlert((short)80); 
    try {
      (paramTlsContext.getSecurityParametersHandshake()).masterSecret = TlsUtils.calculateMasterSecret(paramTlsContext, tlsSecret);
    } finally {
      tlsSecret.destroy();
    } 
  }
  
  protected static Hashtable readExtensions(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    if (paramByteArrayInputStream.available() < 1)
      return null; 
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramByteArrayInputStream);
    assertEmpty(paramByteArrayInputStream);
    return readExtensionsData(arrayOfByte);
  }
  
  protected static Hashtable readExtensionsData(byte[] paramArrayOfbyte) throws IOException {
    Hashtable<Object, Object> hashtable = new Hashtable<>();
    if (paramArrayOfbyte.length > 0) {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
      do {
        int i = TlsUtils.readUint16(byteArrayInputStream);
        byte[] arrayOfByte = TlsUtils.readOpaque16(byteArrayInputStream);
        if (null != hashtable.put(Integers.valueOf(i), arrayOfByte))
          throw new TlsFatalAlert((short)47, "Repeated extension: " + ExtensionType.getText(i)); 
      } while (byteArrayInputStream.available() > 0);
    } 
    return hashtable;
  }
  
  protected static Hashtable readExtensionsData13(int paramInt, byte[] paramArrayOfbyte) throws IOException {
    Hashtable<Object, Object> hashtable = new Hashtable<>();
    if (paramArrayOfbyte.length > 0) {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
      do {
        int i = TlsUtils.readUint16(byteArrayInputStream);
        if (!TlsUtils.isPermittedExtensionType13(paramInt, i))
          throw new TlsFatalAlert((short)47, "Invalid extension: " + ExtensionType.getText(i)); 
        byte[] arrayOfByte = TlsUtils.readOpaque16(byteArrayInputStream);
        if (null != hashtable.put(Integers.valueOf(i), arrayOfByte))
          throw new TlsFatalAlert((short)47, "Repeated extension: " + ExtensionType.getText(i)); 
      } while (byteArrayInputStream.available() > 0);
    } 
    return hashtable;
  }
  
  protected static Hashtable readExtensionsDataClientHello(byte[] paramArrayOfbyte) throws IOException {
    Hashtable<Object, Object> hashtable = new Hashtable<>();
    if (paramArrayOfbyte.length > 0) {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
      int i = -1;
      int j = 0;
      while (true) {
        i = TlsUtils.readUint16(byteArrayInputStream);
        byte[] arrayOfByte = TlsUtils.readOpaque16(byteArrayInputStream);
        if (null != hashtable.put(Integers.valueOf(i), arrayOfByte))
          throw new TlsFatalAlert((short)47, "Repeated extension: " + ExtensionType.getText(i)); 
        j |= (41 == i) ? 1 : 0;
        if (byteArrayInputStream.available() <= 0) {
          if (j != 0 && 41 != i)
            throw new TlsFatalAlert((short)47, "'pre_shared_key' MUST be last in ClientHello"); 
          break;
        } 
      } 
    } 
    return hashtable;
  }
  
  protected static Vector readSupplementalDataMessage(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    byte[] arrayOfByte = TlsUtils.readOpaque24(paramByteArrayInputStream, 1);
    assertEmpty(paramByteArrayInputStream);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    Vector<SupplementalDataEntry> vector = new Vector();
    while (byteArrayInputStream.available() > 0) {
      int i = TlsUtils.readUint16(byteArrayInputStream);
      byte[] arrayOfByte1 = TlsUtils.readOpaque16(byteArrayInputStream);
      vector.addElement(new SupplementalDataEntry(i, arrayOfByte1));
    } 
    return vector;
  }
  
  protected static void writeExtensions(OutputStream paramOutputStream, Hashtable paramHashtable) throws IOException {
    writeExtensions(paramOutputStream, paramHashtable, 0);
  }
  
  protected static void writeExtensions(OutputStream paramOutputStream, Hashtable paramHashtable, int paramInt) throws IOException {
    if (null == paramHashtable || paramHashtable.isEmpty())
      return; 
    byte[] arrayOfByte = writeExtensionsData(paramHashtable, paramInt);
    int i = arrayOfByte.length + paramInt;
    TlsUtils.checkUint16(i);
    TlsUtils.writeUint16(i, paramOutputStream);
    paramOutputStream.write(arrayOfByte);
  }
  
  protected static byte[] writeExtensionsData(Hashtable paramHashtable) throws IOException {
    return writeExtensionsData(paramHashtable, 0);
  }
  
  protected static byte[] writeExtensionsData(Hashtable paramHashtable, int paramInt) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    writeExtensionsData(paramHashtable, paramInt, byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  protected static void writeExtensionsData(Hashtable paramHashtable, int paramInt, ByteArrayOutputStream paramByteArrayOutputStream) throws IOException {
    writeSelectedExtensions(paramByteArrayOutputStream, paramHashtable, true);
    writeSelectedExtensions(paramByteArrayOutputStream, paramHashtable, false);
    writePreSharedKeyExtension(paramByteArrayOutputStream, paramHashtable, paramInt);
  }
  
  protected static void writePreSharedKeyExtension(OutputStream paramOutputStream, Hashtable paramHashtable, int paramInt) throws IOException {
    byte[] arrayOfByte = (byte[])paramHashtable.get(TlsExtensionsUtils.EXT_pre_shared_key);
    if (null != arrayOfByte) {
      TlsUtils.checkUint16(41);
      TlsUtils.writeUint16(41, paramOutputStream);
      int i = arrayOfByte.length + paramInt;
      TlsUtils.checkUint16(i);
      TlsUtils.writeUint16(i, paramOutputStream);
      paramOutputStream.write(arrayOfByte);
    } 
  }
  
  protected static void writeSelectedExtensions(OutputStream paramOutputStream, Hashtable paramHashtable, boolean paramBoolean) throws IOException {
    Enumeration<Integer> enumeration = paramHashtable.keys();
    while (enumeration.hasMoreElements()) {
      Integer integer = enumeration.nextElement();
      int i = integer.intValue();
      if (41 == i)
        continue; 
      byte[] arrayOfByte = (byte[])paramHashtable.get(integer);
      if (paramBoolean == ((arrayOfByte.length == 0))) {
        TlsUtils.checkUint16(i);
        TlsUtils.writeUint16(i, paramOutputStream);
        TlsUtils.writeOpaque16(arrayOfByte, paramOutputStream);
      } 
    } 
  }
  
  protected static void writeSupplementalData(OutputStream paramOutputStream, Vector<SupplementalDataEntry> paramVector) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    for (byte b = 0; b < paramVector.size(); b++) {
      SupplementalDataEntry supplementalDataEntry = paramVector.elementAt(b);
      int i = supplementalDataEntry.getDataType();
      TlsUtils.checkUint16(i);
      TlsUtils.writeUint16(i, byteArrayOutputStream);
      TlsUtils.writeOpaque16(supplementalDataEntry.getData(), byteArrayOutputStream);
    } 
    byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
    TlsUtils.writeOpaque24(arrayOfByte, paramOutputStream);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsProtocol.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */