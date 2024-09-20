package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsDecodeResult;
import org.bouncycastle.tls.crypto.TlsEncodeResult;
import org.bouncycastle.tls.crypto.TlsNullNullCipher;
import org.bouncycastle.util.Arrays;

class DTLSRecordLayer implements DatagramTransport {
  static final int RECORD_HEADER_LENGTH = 13;
  
  private static final int MAX_FRAGMENT_LENGTH = 16384;
  
  private static final long TCP_MSL = 120000L;
  
  private static final long RETRANSMIT_TIMEOUT = 240000L;
  
  private final TlsContext context;
  
  private final TlsPeer peer;
  
  private final DatagramTransport transport;
  
  private final ByteQueue recordQueue = new ByteQueue();
  
  private final Object writeLock = new Object();
  
  private volatile boolean closed = false;
  
  private volatile boolean failed = false;
  
  private volatile ProtocolVersion readVersion = null;
  
  private volatile ProtocolVersion writeVersion = null;
  
  private volatile boolean inConnection;
  
  private volatile boolean inHandshake;
  
  private volatile int plaintextLimit;
  
  private DTLSEpoch currentEpoch;
  
  private DTLSEpoch pendingEpoch;
  
  private DTLSEpoch readEpoch;
  
  private DTLSEpoch writeEpoch;
  
  private DTLSHandshakeRetransmit retransmit = null;
  
  private DTLSEpoch retransmitEpoch = null;
  
  private Timeout retransmitTimeout = null;
  
  private TlsHeartbeat heartbeat = null;
  
  private boolean heartBeatResponder = false;
  
  private HeartbeatMessage heartbeatInFlight = null;
  
  private Timeout heartbeatTimeout = null;
  
  private int heartbeatResendMillis = -1;
  
  private Timeout heartbeatResendTimeout = null;
  
  static int receiveClientHelloRecord(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (paramInt2 < 13)
      return -1; 
    short s1 = TlsUtils.readUint8(paramArrayOfbyte, paramInt1 + 0);
    if (22 != s1)
      return -1; 
    ProtocolVersion protocolVersion = TlsUtils.readVersion(paramArrayOfbyte, paramInt1 + 1);
    if (!ProtocolVersion.DTLSv10.isEqualOrEarlierVersionOf(protocolVersion))
      return -1; 
    int i = TlsUtils.readUint16(paramArrayOfbyte, paramInt1 + 3);
    if (0 != i)
      return -1; 
    int j = TlsUtils.readUint16(paramArrayOfbyte, paramInt1 + 11);
    if (j < 1 || j > 16384)
      return -1; 
    if (paramInt2 < 13 + j)
      return -1; 
    short s2 = TlsUtils.readUint8(paramArrayOfbyte, paramInt1 + 13);
    return (1 != s2) ? -1 : j;
  }
  
  static void sendHelloVerifyRequestRecord(DatagramSender paramDatagramSender, long paramLong, byte[] paramArrayOfbyte) throws IOException {
    TlsUtils.checkUint16(paramArrayOfbyte.length);
    byte[] arrayOfByte = new byte[13 + paramArrayOfbyte.length];
    TlsUtils.writeUint8((short)22, arrayOfByte, 0);
    TlsUtils.writeVersion(ProtocolVersion.DTLSv10, arrayOfByte, 1);
    TlsUtils.writeUint16(0, arrayOfByte, 3);
    TlsUtils.writeUint48(paramLong, arrayOfByte, 5);
    TlsUtils.writeUint16(paramArrayOfbyte.length, arrayOfByte, 11);
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 13, paramArrayOfbyte.length);
    sendDatagram(paramDatagramSender, arrayOfByte, 0, arrayOfByte.length);
  }
  
  private static void sendDatagram(DatagramSender paramDatagramSender, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    try {
      paramDatagramSender.send(paramArrayOfbyte, paramInt1, paramInt2);
    } catch (InterruptedIOException interruptedIOException) {
      interruptedIOException.bytesTransferred = 0;
      throw interruptedIOException;
    } 
  }
  
  DTLSRecordLayer(TlsContext paramTlsContext, TlsPeer paramTlsPeer, DatagramTransport paramDatagramTransport) {
    this.context = paramTlsContext;
    this.peer = paramTlsPeer;
    this.transport = paramDatagramTransport;
    this.inHandshake = true;
    this.currentEpoch = new DTLSEpoch(0, (TlsCipher)TlsNullNullCipher.INSTANCE, 13, 13);
    this.pendingEpoch = null;
    this.readEpoch = this.currentEpoch;
    this.writeEpoch = this.currentEpoch;
    setPlaintextLimit(16384);
  }
  
  boolean isClosed() {
    return this.closed;
  }
  
  void resetAfterHelloVerifyRequestServer(long paramLong) {
    this.inConnection = true;
    this.currentEpoch.setSequenceNumber(paramLong);
    this.currentEpoch.getReplayWindow().reset(paramLong);
  }
  
  void setPlaintextLimit(int paramInt) {
    this.plaintextLimit = paramInt;
  }
  
  int getReadEpoch() {
    return this.readEpoch.getEpoch();
  }
  
  ProtocolVersion getReadVersion() {
    return this.readVersion;
  }
  
  void setReadVersion(ProtocolVersion paramProtocolVersion) {
    this.readVersion = paramProtocolVersion;
  }
  
  void setWriteVersion(ProtocolVersion paramProtocolVersion) {
    this.writeVersion = paramProtocolVersion;
  }
  
  void initPendingEpoch(TlsCipher paramTlsCipher) {
    if (this.pendingEpoch != null)
      throw new IllegalStateException(); 
    SecurityParameters securityParameters = this.context.getSecurityParameters();
    byte[] arrayOfByte1 = securityParameters.getConnectionIDLocal();
    byte[] arrayOfByte2 = securityParameters.getConnectionIDPeer();
    int i = 13 + ((arrayOfByte2 != null) ? arrayOfByte2.length : 0);
    int j = 13 + ((arrayOfByte1 != null) ? arrayOfByte1.length : 0);
    this.pendingEpoch = new DTLSEpoch(this.writeEpoch.getEpoch() + 1, paramTlsCipher, i, j);
  }
  
  void handshakeSuccessful(DTLSHandshakeRetransmit paramDTLSHandshakeRetransmit) {
    if (this.readEpoch == this.currentEpoch || this.writeEpoch == this.currentEpoch)
      throw new IllegalStateException(); 
    if (null != paramDTLSHandshakeRetransmit) {
      this.retransmit = paramDTLSHandshakeRetransmit;
      this.retransmitEpoch = this.currentEpoch;
      this.retransmitTimeout = new Timeout(240000L);
    } 
    this.inHandshake = false;
    this.currentEpoch = this.pendingEpoch;
    this.pendingEpoch = null;
  }
  
  void initHeartbeat(TlsHeartbeat paramTlsHeartbeat, boolean paramBoolean) {
    if (this.inHandshake)
      throw new IllegalStateException(); 
    this.heartbeat = paramTlsHeartbeat;
    this.heartBeatResponder = paramBoolean;
    if (null != paramTlsHeartbeat)
      resetHeartbeat(); 
  }
  
  void resetWriteEpoch() {
    if (null != this.retransmitEpoch) {
      this.writeEpoch = this.retransmitEpoch;
    } else {
      this.writeEpoch = this.currentEpoch;
    } 
  }
  
  public int getReceiveLimit() throws IOException {
    int i = this.transport.getReceiveLimit() - this.readEpoch.getRecordHeaderLengthRead();
    TlsCipher tlsCipher = this.readEpoch.getCipher();
    int j = tlsCipher.getPlaintextDecodeLimit(i);
    return Math.min(this.plaintextLimit, j);
  }
  
  public int getSendLimit() throws IOException {
    TlsCipher tlsCipher = this.writeEpoch.getCipher();
    int i = this.transport.getSendLimit() - this.writeEpoch.getRecordHeaderLengthWrite();
    int j = tlsCipher.getPlaintextEncodeLimit(i);
    return Math.min(this.plaintextLimit, j);
  }
  
  public int receive(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) throws IOException {
    return receive(paramArrayOfbyte, paramInt1, paramInt2, paramInt3, null);
  }
  
  int receive(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, DTLSRecordCallback paramDTLSRecordCallback) throws IOException {
    long l = System.currentTimeMillis();
    Timeout timeout = Timeout.forWaitMillis(paramInt3, l);
    byte[] arrayOfByte = null;
    while (paramInt3 >= 0) {
      if (null != this.retransmitTimeout && this.retransmitTimeout.remainingMillis(l) < 1L) {
        this.retransmit = null;
        this.retransmitEpoch = null;
        this.retransmitTimeout = null;
      } 
      if (Timeout.hasExpired(this.heartbeatTimeout, l)) {
        if (null != this.heartbeatInFlight)
          throw new TlsTimeoutException("Heartbeat timed out"); 
        this.heartbeatInFlight = HeartbeatMessage.create(this.context, (short)1, this.heartbeat.generatePayload());
        this.heartbeatTimeout = new Timeout(this.heartbeat.getTimeoutMillis(), l);
        this.heartbeatResendMillis = this.peer.getHandshakeResendTimeMillis();
        this.heartbeatResendTimeout = new Timeout(this.heartbeatResendMillis, l);
        sendHeartbeatMessage(this.heartbeatInFlight);
      } else if (Timeout.hasExpired(this.heartbeatResendTimeout, l)) {
        this.heartbeatResendMillis = DTLSReliableHandshake.backOff(this.heartbeatResendMillis);
        this.heartbeatResendTimeout = new Timeout(this.heartbeatResendMillis, l);
        sendHeartbeatMessage(this.heartbeatInFlight);
      } 
      paramInt3 = Timeout.constrainWaitMillis(paramInt3, this.heartbeatTimeout, l);
      paramInt3 = Timeout.constrainWaitMillis(paramInt3, this.heartbeatResendTimeout, l);
      if (paramInt3 < 0)
        paramInt3 = 1; 
      int i = this.transport.getReceiveLimit();
      if (null == arrayOfByte || arrayOfByte.length < i)
        arrayOfByte = new byte[i]; 
      int j = receiveRecord(arrayOfByte, 0, i, paramInt3);
      int k = processRecord(j, arrayOfByte, paramArrayOfbyte, paramInt1, paramInt2, paramDTLSRecordCallback);
      if (k >= 0)
        return k; 
      l = System.currentTimeMillis();
      paramInt3 = Timeout.getWaitMillis(timeout, l);
    } 
    return -1;
  }
  
  int receivePending(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, DTLSRecordCallback paramDTLSRecordCallback) throws IOException {
    if (this.recordQueue.available() > 0) {
      int i = this.recordQueue.available();
      byte[] arrayOfByte = new byte[i];
      do {
        int j = receivePendingRecord(arrayOfByte, 0, i);
        int k = processRecord(j, arrayOfByte, paramArrayOfbyte, paramInt1, paramInt2, paramDTLSRecordCallback);
        if (k >= 0)
          return k; 
      } while (this.recordQueue.available() > 0);
    } 
    return -1;
  }
  
  public void send(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    byte b = 23;
    if (this.inHandshake || this.writeEpoch == this.retransmitEpoch) {
      b = 22;
      short s = TlsUtils.readUint8(paramArrayOfbyte, paramInt1);
      if (s == 20) {
        DTLSEpoch dTLSEpoch = null;
        if (this.inHandshake) {
          dTLSEpoch = this.pendingEpoch;
        } else if (this.writeEpoch == this.retransmitEpoch) {
          dTLSEpoch = this.currentEpoch;
        } 
        if (dTLSEpoch == null)
          throw new IllegalStateException(); 
        byte[] arrayOfByte = { 1 };
        sendRecord((short)20, arrayOfByte, 0, arrayOfByte.length);
        this.writeEpoch = dTLSEpoch;
      } 
    } 
    sendRecord(b, paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void close() throws IOException {
    if (!this.closed) {
      if (this.inHandshake && this.inConnection)
        warn((short)90, "User canceled handshake"); 
      closeTransport();
    } 
  }
  
  void fail(short paramShort) {
    if (!this.closed) {
      if (this.inConnection)
        try {
          raiseAlert((short)2, paramShort, null, null);
        } catch (Exception exception) {} 
      this.failed = true;
      closeTransport();
    } 
  }
  
  void failed() {
    if (!this.closed) {
      this.failed = true;
      closeTransport();
    } 
  }
  
  void warn(short paramShort, String paramString) throws IOException {
    raiseAlert((short)1, paramShort, paramString, null);
  }
  
  private void closeTransport() {
    if (!this.closed) {
      try {
        if (!this.failed)
          warn((short)0, null); 
        this.transport.close();
      } catch (Exception exception) {}
      this.closed = true;
    } 
  }
  
  private void raiseAlert(short paramShort1, short paramShort2, String paramString, Throwable paramThrowable) throws IOException {
    this.peer.notifyAlertRaised(paramShort1, paramShort2, paramString, paramThrowable);
    byte[] arrayOfByte = new byte[2];
    arrayOfByte[0] = (byte)paramShort1;
    arrayOfByte[1] = (byte)paramShort2;
    sendRecord((short)21, arrayOfByte, 0, 2);
  }
  
  private int receiveDatagram(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) throws IOException {
    try {
      int i = this.transport.receive(paramArrayOfbyte, paramInt1, paramInt2, paramInt3);
      if (i <= paramInt2)
        return i; 
    } catch (SocketTimeoutException socketTimeoutException) {
    
    } catch (InterruptedIOException interruptedIOException) {
      interruptedIOException.bytesTransferred = 0;
      throw interruptedIOException;
    } 
    return -1;
  }
  
  private int processRecord(int paramInt1, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3, DTLSRecordCallback paramDTLSRecordCallback) throws IOException {
    TlsDecodeResult tlsDecodeResult;
    byte b;
    if (paramInt1 < 13)
      return -1; 
    short s = TlsUtils.readUint8(paramArrayOfbyte1, 0);
    switch (s) {
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
        break;
      default:
        return -1;
    } 
    ProtocolVersion protocolVersion = TlsUtils.readVersion(paramArrayOfbyte1, 1);
    if (!protocolVersion.isDTLS())
      return -1; 
    int i = TlsUtils.readUint16(paramArrayOfbyte1, 3);
    DTLSEpoch dTLSEpoch = null;
    if (i == this.readEpoch.getEpoch()) {
      dTLSEpoch = this.readEpoch;
    } else if (null != this.retransmitEpoch && i == this.retransmitEpoch.getEpoch() && s == 22) {
      dTLSEpoch = this.retransmitEpoch;
    } 
    if (null == dTLSEpoch)
      return -1; 
    long l1 = TlsUtils.readUint48(paramArrayOfbyte1, 5);
    if (dTLSEpoch.getReplayWindow().shouldDiscard(l1))
      return -1; 
    int j = dTLSEpoch.getRecordHeaderLengthRead();
    if (j > 13) {
      if (25 != s)
        return -1; 
      if (paramInt1 < j)
        return -1; 
      byte[] arrayOfByte = this.context.getSecurityParameters().getConnectionIDPeer();
      if (!Arrays.constantTimeAreEqual(arrayOfByte.length, arrayOfByte, 0, paramArrayOfbyte1, 11))
        return -1; 
    } else if (25 == s) {
      return -1;
    } 
    int k = TlsUtils.readUint16(paramArrayOfbyte1, j - 2);
    if (paramInt1 != k + j)
      return -1; 
    if (null != this.readVersion && !this.readVersion.equals(protocolVersion)) {
      boolean bool1 = (getReadEpoch() == 0 && k > 0 && 22 == s && 1 == TlsUtils.readUint8(paramArrayOfbyte1, j)) ? true : false;
      if (!bool1)
        return -1; 
    } 
    long l2 = getMacSequenceNumber(dTLSEpoch.getEpoch(), l1);
    try {
      tlsDecodeResult = dTLSEpoch.getCipher().decodeCiphertext(l2, s, protocolVersion, paramArrayOfbyte1, j, k);
    } catch (TlsFatalAlert tlsFatalAlert) {
      if (20 == tlsFatalAlert.getAlertDescription())
        return -1; 
      throw tlsFatalAlert;
    } 
    if (tlsDecodeResult.len > this.plaintextLimit)
      return -1; 
    if (tlsDecodeResult.len < 1 && tlsDecodeResult.contentType != 23)
      return -1; 
    if (null == this.readVersion) {
      boolean bool1 = (getReadEpoch() == 0 && k > 0 && 22 == s && 3 == TlsUtils.readUint8(paramArrayOfbyte1, j)) ? true : false;
      if (bool1) {
        if (!ProtocolVersion.DTLSv12.isEqualOrLaterVersionOf(protocolVersion))
          return -1; 
      } else {
        this.readVersion = protocolVersion;
      } 
    } 
    boolean bool = dTLSEpoch.getReplayWindow().reportAuthenticated(l1);
    if (paramDTLSRecordCallback != null) {
      int m = 0;
      if (dTLSEpoch == this.readEpoch && bool)
        m |= 0x1; 
      if (25 == s)
        m |= 0x2; 
      paramDTLSRecordCallback.recordAccepted(m);
    } 
    switch (tlsDecodeResult.contentType) {
      case 21:
        if (tlsDecodeResult.len == 2) {
          short s1 = TlsUtils.readUint8(tlsDecodeResult.buf, tlsDecodeResult.off);
          short s2 = TlsUtils.readUint8(tlsDecodeResult.buf, tlsDecodeResult.off + 1);
          this.peer.notifyAlertReceived(s1, s2);
          if (s1 == 2) {
            failed();
            throw new TlsFatalAlert(s2);
          } 
          if (s2 == 0)
            closeTransport(); 
        } 
        return -1;
      case 23:
        if (this.inHandshake)
          return -1; 
        break;
      case 20:
        for (b = 0; b < tlsDecodeResult.len; b++) {
          short s1 = TlsUtils.readUint8(tlsDecodeResult.buf, tlsDecodeResult.off + b);
          if (s1 == 1 && this.pendingEpoch != null)
            this.readEpoch = this.pendingEpoch; 
        } 
        return -1;
      case 22:
        if (!this.inHandshake) {
          if (null != this.retransmit)
            this.retransmit.receivedHandshakeRecord(i, tlsDecodeResult.buf, tlsDecodeResult.off, tlsDecodeResult.len); 
          return -1;
        } 
        break;
      case 24:
        if (null != this.heartbeatInFlight || this.heartBeatResponder)
          try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(tlsDecodeResult.buf, tlsDecodeResult.off, tlsDecodeResult.len);
            HeartbeatMessage heartbeatMessage = HeartbeatMessage.parse(byteArrayInputStream);
            if (null != heartbeatMessage)
              switch (heartbeatMessage.getType()) {
                case 1:
                  if (this.heartBeatResponder) {
                    HeartbeatMessage heartbeatMessage1 = HeartbeatMessage.create(this.context, (short)2, heartbeatMessage.getPayload());
                    sendHeartbeatMessage(heartbeatMessage1);
                  } 
                  break;
                case 2:
                  if (null != this.heartbeatInFlight && Arrays.areEqual(heartbeatMessage.getPayload(), this.heartbeatInFlight.getPayload()))
                    resetHeartbeat(); 
                  break;
              }  
          } catch (Exception exception) {} 
        return -1;
      default:
        return -1;
    } 
    if (!this.inHandshake && null != this.retransmit) {
      this.retransmit = null;
      this.retransmitEpoch = null;
      this.retransmitTimeout = null;
    } 
    if (tlsDecodeResult.len > paramInt3)
      throw new TlsFatalAlert((short)80); 
    System.arraycopy(tlsDecodeResult.buf, tlsDecodeResult.off, paramArrayOfbyte2, paramInt2, tlsDecodeResult.len);
    return tlsDecodeResult.len;
  }
  
  private int receivePendingRecord(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    int i = 13;
    if (this.recordQueue.available() >= i) {
      int k = this.recordQueue.readUint16(3);
      DTLSEpoch dTLSEpoch = null;
      if (k == this.readEpoch.getEpoch()) {
        dTLSEpoch = this.readEpoch;
      } else if (null != this.retransmitEpoch && k == this.retransmitEpoch.getEpoch()) {
        dTLSEpoch = this.retransmitEpoch;
      } 
      if (null == dTLSEpoch) {
        this.recordQueue.removeData(this.recordQueue.available());
        return -1;
      } 
      i = dTLSEpoch.getRecordHeaderLengthRead();
      if (this.recordQueue.available() >= i) {
        int m = this.recordQueue.readUint16(i - 2);
        i += m;
      } 
    } 
    int j = Math.min(this.recordQueue.available(), i);
    this.recordQueue.removeData(paramArrayOfbyte, paramInt1, j, 0);
    return j;
  }
  
  private int receiveRecord(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) throws IOException {
    if (this.recordQueue.available() > 0)
      return receivePendingRecord(paramArrayOfbyte, paramInt1, paramInt2); 
    int i = receiveDatagram(paramArrayOfbyte, paramInt1, paramInt2, paramInt3);
    if (i >= 13) {
      this.inConnection = true;
      int j = TlsUtils.readUint16(paramArrayOfbyte, paramInt1 + 3);
      DTLSEpoch dTLSEpoch = null;
      if (j == this.readEpoch.getEpoch()) {
        dTLSEpoch = this.readEpoch;
      } else if (null != this.retransmitEpoch && j == this.retransmitEpoch.getEpoch()) {
        dTLSEpoch = this.retransmitEpoch;
      } 
      if (null == dTLSEpoch)
        return -1; 
      int k = dTLSEpoch.getRecordHeaderLengthRead();
      if (i >= k) {
        int m = TlsUtils.readUint16(paramArrayOfbyte, paramInt1 + k - 2);
        int n = k + m;
        if (i > n) {
          this.recordQueue.addData(paramArrayOfbyte, paramInt1 + n, i - n);
          i = n;
        } 
      } 
    } 
    return i;
  }
  
  private void resetHeartbeat() {
    this.heartbeatInFlight = null;
    this.heartbeatResendMillis = -1;
    this.heartbeatResendTimeout = null;
    this.heartbeatTimeout = new Timeout(this.heartbeat.getIdleMillis());
  }
  
  private void sendHeartbeatMessage(HeartbeatMessage paramHeartbeatMessage) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramHeartbeatMessage.encode(byteArrayOutputStream);
    byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
    sendRecord((short)24, arrayOfByte, 0, arrayOfByte.length);
  }
  
  private void sendRecord(short paramShort, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (this.writeVersion == null)
      return; 
    if (paramInt2 > this.plaintextLimit)
      throw new TlsFatalAlert((short)80); 
    if (paramInt2 < 1 && paramShort != 23)
      throw new TlsFatalAlert((short)80); 
    synchronized (this.writeLock) {
      int i = this.writeEpoch.getEpoch();
      long l1 = this.writeEpoch.allocateSequenceNumber();
      long l2 = getMacSequenceNumber(i, l1);
      ProtocolVersion protocolVersion = this.writeVersion;
      int j = this.writeEpoch.getRecordHeaderLengthWrite();
      TlsEncodeResult tlsEncodeResult = this.writeEpoch.getCipher().encodePlaintext(l2, paramShort, protocolVersion, j, paramArrayOfbyte, paramInt1, paramInt2);
      int k = tlsEncodeResult.len - j;
      TlsUtils.checkUint16(k);
      TlsUtils.writeUint8(tlsEncodeResult.recordType, tlsEncodeResult.buf, tlsEncodeResult.off + 0);
      TlsUtils.writeVersion(protocolVersion, tlsEncodeResult.buf, tlsEncodeResult.off + 1);
      TlsUtils.writeUint16(i, tlsEncodeResult.buf, tlsEncodeResult.off + 3);
      TlsUtils.writeUint48(l1, tlsEncodeResult.buf, tlsEncodeResult.off + 5);
      if (j > 13) {
        byte[] arrayOfByte = this.context.getSecurityParameters().getConnectionIDLocal();
        System.arraycopy(arrayOfByte, 0, tlsEncodeResult.buf, tlsEncodeResult.off + 11, arrayOfByte.length);
      } 
      TlsUtils.writeUint16(k, tlsEncodeResult.buf, tlsEncodeResult.off + j - 2);
      sendDatagram(this.transport, tlsEncodeResult.buf, tlsEncodeResult.off, tlsEncodeResult.len);
    } 
  }
  
  private static long getMacSequenceNumber(int paramInt, long paramLong) {
    return (paramInt & 0xFFFFFFFFL) << 48L | paramLong;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DTLSRecordLayer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */