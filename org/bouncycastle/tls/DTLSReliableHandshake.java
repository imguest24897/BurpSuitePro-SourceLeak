package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.util.Integers;

class DTLSReliableHandshake {
  static final int MESSAGE_HEADER_LENGTH = 12;
  
  private static final int MAX_RECEIVE_AHEAD = 16;
  
  private static final int MAX_RESEND_MILLIS = 60000;
  
  private DTLSRecordLayer recordLayer;
  
  private Timeout handshakeTimeout;
  
  private TlsHandshakeHash handshakeHash;
  
  private Hashtable currentInboundFlight = new Hashtable<>();
  
  private Hashtable previousInboundFlight = null;
  
  private Vector outboundFlight = new Vector();
  
  private int initialResendMillis;
  
  private int resendMillis = -1;
  
  private Timeout resendTimeout = null;
  
  private int next_send_seq = 0;
  
  private int next_receive_seq = 0;
  
  static ByteArrayInputStream receiveClientHelloMessage(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (paramInt2 < 12)
      return null; 
    short s = TlsUtils.readUint8(paramArrayOfbyte, paramInt1);
    if (1 != s)
      return null; 
    int i = TlsUtils.readUint24(paramArrayOfbyte, paramInt1 + 1);
    if (paramInt2 != 12 + i)
      return null; 
    int j = TlsUtils.readUint24(paramArrayOfbyte, paramInt1 + 6);
    if (0 != j)
      return null; 
    int k = TlsUtils.readUint24(paramArrayOfbyte, paramInt1 + 9);
    return (i != k) ? null : new ByteArrayInputStream(paramArrayOfbyte, paramInt1 + 12, i);
  }
  
  static void sendHelloVerifyRequest(DatagramSender paramDatagramSender, long paramLong, byte[] paramArrayOfbyte) throws IOException {
    TlsUtils.checkUint8(paramArrayOfbyte.length);
    int i = 3 + paramArrayOfbyte.length;
    byte[] arrayOfByte = new byte[12 + i];
    TlsUtils.writeUint8((short)3, arrayOfByte, 0);
    TlsUtils.writeUint24(i, arrayOfByte, 1);
    TlsUtils.writeUint24(i, arrayOfByte, 9);
    TlsUtils.writeVersion(ProtocolVersion.DTLSv10, arrayOfByte, 12);
    TlsUtils.writeOpaque8(paramArrayOfbyte, arrayOfByte, 14);
    DTLSRecordLayer.sendHelloVerifyRequestRecord(paramDatagramSender, paramLong, arrayOfByte);
  }
  
  DTLSReliableHandshake(TlsContext paramTlsContext, DTLSRecordLayer paramDTLSRecordLayer, int paramInt1, int paramInt2, DTLSRequest paramDTLSRequest) {
    this.recordLayer = paramDTLSRecordLayer;
    this.handshakeHash = new DeferredHash(paramTlsContext);
    this.handshakeTimeout = Timeout.forWaitMillis(paramInt1);
    this.initialResendMillis = paramInt2;
    if (null != paramDTLSRequest) {
      this.resendMillis = paramInt2;
      this.resendTimeout = new Timeout(this.resendMillis);
      long l = paramDTLSRequest.getRecordSeq();
      int i = paramDTLSRequest.getMessageSeq();
      byte[] arrayOfByte = paramDTLSRequest.getMessage();
      this.recordLayer.resetAfterHelloVerifyRequestServer(l);
      DTLSReassembler dTLSReassembler = new DTLSReassembler((short)1, arrayOfByte.length - 12);
      this.currentInboundFlight.put(Integers.valueOf(i), dTLSReassembler);
      this.next_send_seq = 1;
      this.next_receive_seq = i + 1;
      this.handshakeHash.update(arrayOfByte, 0, arrayOfByte.length);
    } 
  }
  
  void resetAfterHelloVerifyRequestClient() {
    this.currentInboundFlight = new Hashtable<>();
    this.previousInboundFlight = null;
    this.outboundFlight = new Vector();
    this.resendMillis = -1;
    this.resendTimeout = null;
    this.next_receive_seq = 1;
    this.handshakeHash.reset();
  }
  
  TlsHandshakeHash getHandshakeHash() {
    return this.handshakeHash;
  }
  
  void prepareToFinish() {
    this.handshakeHash.stopTracking();
  }
  
  void sendMessage(short paramShort, byte[] paramArrayOfbyte) throws IOException {
    TlsUtils.checkUint24(paramArrayOfbyte.length);
    if (null != this.resendTimeout) {
      checkInboundFlight();
      this.resendMillis = -1;
      this.resendTimeout = null;
      this.outboundFlight.removeAllElements();
    } 
    Message message = new Message(this.next_send_seq++, paramShort, paramArrayOfbyte);
    this.outboundFlight.addElement(message);
    writeMessage(message);
    updateHandshakeMessagesDigest(message);
  }
  
  Message receiveMessage() throws IOException {
    Message message = implReceiveMessage();
    updateHandshakeMessagesDigest(message);
    return message;
  }
  
  byte[] receiveMessageBody(short paramShort) throws IOException {
    Message message = implReceiveMessage();
    if (message.getType() != paramShort)
      throw new TlsFatalAlert((short)10); 
    updateHandshakeMessagesDigest(message);
    return message.getBody();
  }
  
  Message receiveMessageDelayedDigest(short paramShort) throws IOException {
    Message message = implReceiveMessage();
    if (message.getType() != paramShort)
      throw new TlsFatalAlert((short)10); 
    return message;
  }
  
  void updateHandshakeMessagesDigest(Message paramMessage) throws IOException {
    short s = paramMessage.getType();
    switch (s) {
      case 0:
      case 3:
      case 24:
        return;
    } 
    byte[] arrayOfByte1 = paramMessage.getBody();
    byte[] arrayOfByte2 = new byte[12];
    TlsUtils.writeUint8(s, arrayOfByte2, 0);
    TlsUtils.writeUint24(arrayOfByte1.length, arrayOfByte2, 1);
    TlsUtils.writeUint16(paramMessage.getSeq(), arrayOfByte2, 4);
    TlsUtils.writeUint24(0, arrayOfByte2, 6);
    TlsUtils.writeUint24(arrayOfByte1.length, arrayOfByte2, 9);
    this.handshakeHash.update(arrayOfByte2, 0, arrayOfByte2.length);
    this.handshakeHash.update(arrayOfByte1, 0, arrayOfByte1.length);
  }
  
  void finish() {
    DTLSHandshakeRetransmit dTLSHandshakeRetransmit = null;
    if (null != this.resendTimeout) {
      checkInboundFlight();
    } else {
      prepareInboundFlight(null);
      if (this.previousInboundFlight != null)
        dTLSHandshakeRetransmit = new DTLSHandshakeRetransmit() {
            public void receivedHandshakeRecord(int param1Int1, byte[] param1ArrayOfbyte, int param1Int2, int param1Int3) throws IOException {
              DTLSReliableHandshake.this.processRecord(0, param1Int1, param1ArrayOfbyte, param1Int2, param1Int3);
            }
          }; 
    } 
    this.recordLayer.handshakeSuccessful(dTLSHandshakeRetransmit);
  }
  
  static int backOff(int paramInt) {
    return Math.min(paramInt * 2, 60000);
  }
  
  private void checkInboundFlight() {
    Enumeration<Integer> enumeration = this.currentInboundFlight.keys();
    while (enumeration.hasMoreElements()) {
      Integer integer = enumeration.nextElement();
      if (integer.intValue() >= this.next_receive_seq);
    } 
  }
  
  private Message getPendingMessage() throws IOException {
    DTLSReassembler dTLSReassembler = (DTLSReassembler)this.currentInboundFlight.get(Integers.valueOf(this.next_receive_seq));
    if (dTLSReassembler != null) {
      byte[] arrayOfByte = dTLSReassembler.getBodyIfComplete();
      if (arrayOfByte != null) {
        this.previousInboundFlight = null;
        return new Message(this.next_receive_seq++, dTLSReassembler.getMsgType(), arrayOfByte);
      } 
    } 
    return null;
  }
  
  private Message implReceiveMessage() throws IOException {
    long l = System.currentTimeMillis();
    if (null == this.resendTimeout) {
      this.resendMillis = this.initialResendMillis;
      this.resendTimeout = new Timeout(this.resendMillis, l);
      prepareInboundFlight(new Hashtable<>());
    } 
    byte[] arrayOfByte = null;
    while (true) {
      if (this.recordLayer.isClosed())
        throw new TlsFatalAlert((short)90); 
      Message message = getPendingMessage();
      if (message != null)
        return message; 
      if (Timeout.hasExpired(this.handshakeTimeout, l))
        throw new TlsTimeoutException("Handshake timed out"); 
      int i = Timeout.getWaitMillis(this.handshakeTimeout, l);
      i = Timeout.constrainWaitMillis(i, this.resendTimeout, l);
      if (i < 1)
        i = 1; 
      int j = this.recordLayer.getReceiveLimit();
      if (arrayOfByte == null || arrayOfByte.length < j)
        arrayOfByte = new byte[j]; 
      int k = this.recordLayer.receive(arrayOfByte, 0, j, i);
      if (k < 0) {
        resendOutboundFlight();
      } else {
        processRecord(16, this.recordLayer.getReadEpoch(), arrayOfByte, 0, k);
      } 
      l = System.currentTimeMillis();
    } 
  }
  
  private void prepareInboundFlight(Hashtable paramHashtable) {
    resetAll(this.currentInboundFlight);
    this.previousInboundFlight = this.currentInboundFlight;
    this.currentInboundFlight = paramHashtable;
  }
  
  private void processRecord(int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3, int paramInt4) throws IOException {
    boolean bool = false;
    while (paramInt4 >= 12) {
      int i = TlsUtils.readUint24(paramArrayOfbyte, paramInt3 + 9);
      int j = i + 12;
      if (paramInt4 < j)
        break; 
      int k = TlsUtils.readUint24(paramArrayOfbyte, paramInt3 + 1);
      int m = TlsUtils.readUint24(paramArrayOfbyte, paramInt3 + 6);
      if (m + i > k)
        break; 
      short s = TlsUtils.readUint8(paramArrayOfbyte, paramInt3 + 0);
      byte b = (s == 20) ? 1 : 0;
      if (paramInt2 != b)
        break; 
      int n = TlsUtils.readUint16(paramArrayOfbyte, paramInt3 + 4);
      if (n < this.next_receive_seq + paramInt1)
        if (n >= this.next_receive_seq) {
          DTLSReassembler dTLSReassembler = (DTLSReassembler)this.currentInboundFlight.get(Integers.valueOf(n));
          if (dTLSReassembler == null) {
            dTLSReassembler = new DTLSReassembler(s, k);
            this.currentInboundFlight.put(Integers.valueOf(n), dTLSReassembler);
          } 
          dTLSReassembler.contributeFragment(s, k, paramArrayOfbyte, paramInt3 + 12, m, i);
        } else if (this.previousInboundFlight != null) {
          DTLSReassembler dTLSReassembler = (DTLSReassembler)this.previousInboundFlight.get(Integers.valueOf(n));
          if (dTLSReassembler != null) {
            dTLSReassembler.contributeFragment(s, k, paramArrayOfbyte, paramInt3 + 12, m, i);
            bool = true;
          } 
        }  
      paramInt3 += j;
      paramInt4 -= j;
    } 
    if (bool && checkAll(this.previousInboundFlight)) {
      resendOutboundFlight();
      resetAll(this.previousInboundFlight);
    } 
  }
  
  private void resendOutboundFlight() throws IOException {
    this.recordLayer.resetWriteEpoch();
    for (byte b = 0; b < this.outboundFlight.size(); b++)
      writeMessage(this.outboundFlight.elementAt(b)); 
    this.resendMillis = backOff(this.resendMillis);
    this.resendTimeout = new Timeout(this.resendMillis);
  }
  
  private void writeMessage(Message paramMessage) throws IOException {
    int i = this.recordLayer.getSendLimit();
    int j = i - 12;
    if (j < 1)
      throw new TlsFatalAlert((short)80); 
    int k = (paramMessage.getBody()).length;
    int m = 0;
    do {
      int n = Math.min(k - m, j);
      writeHandshakeFragment(paramMessage, m, n);
      m += n;
    } while (m < k);
  }
  
  private void writeHandshakeFragment(Message paramMessage, int paramInt1, int paramInt2) throws IOException {
    RecordLayerBuffer recordLayerBuffer = new RecordLayerBuffer(12 + paramInt2);
    TlsUtils.writeUint8(paramMessage.getType(), recordLayerBuffer);
    TlsUtils.writeUint24((paramMessage.getBody()).length, recordLayerBuffer);
    TlsUtils.writeUint16(paramMessage.getSeq(), recordLayerBuffer);
    TlsUtils.writeUint24(paramInt1, recordLayerBuffer);
    TlsUtils.writeUint24(paramInt2, recordLayerBuffer);
    recordLayerBuffer.write(paramMessage.getBody(), paramInt1, paramInt2);
    recordLayerBuffer.sendToRecordLayer(this.recordLayer);
  }
  
  private static boolean checkAll(Hashtable paramHashtable) {
    Enumeration<DTLSReassembler> enumeration = paramHashtable.elements();
    while (enumeration.hasMoreElements()) {
      if (((DTLSReassembler)enumeration.nextElement()).getBodyIfComplete() == null)
        return false; 
    } 
    return true;
  }
  
  private static void resetAll(Hashtable paramHashtable) {
    Enumeration<DTLSReassembler> enumeration = paramHashtable.elements();
    while (enumeration.hasMoreElements())
      ((DTLSReassembler)enumeration.nextElement()).reset(); 
  }
  
  static class Message {
    private final int message_seq;
    
    private final short msg_type;
    
    private final byte[] body;
    
    private Message(int param1Int, short param1Short, byte[] param1ArrayOfbyte) {
      this.message_seq = param1Int;
      this.msg_type = param1Short;
      this.body = param1ArrayOfbyte;
    }
    
    public int getSeq() {
      return this.message_seq;
    }
    
    public short getType() {
      return this.msg_type;
    }
    
    public byte[] getBody() {
      return this.body;
    }
  }
  
  static class RecordLayerBuffer extends ByteArrayOutputStream {
    RecordLayerBuffer(int param1Int) {
      super(param1Int);
    }
    
    void sendToRecordLayer(DTLSRecordLayer param1DTLSRecordLayer) throws IOException {
      param1DTLSRecordLayer.send(this.buf, 0, this.count);
      this.buf = null;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DTLSReliableHandshake.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */