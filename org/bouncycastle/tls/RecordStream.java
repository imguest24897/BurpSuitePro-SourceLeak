package org.bouncycastle.tls;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsDecodeResult;
import org.bouncycastle.tls.crypto.TlsEncodeResult;
import org.bouncycastle.tls.crypto.TlsNullNullCipher;

class RecordStream {
  private static int DEFAULT_PLAINTEXT_LIMIT = 16384;
  
  private final Record inputRecord = new Record();
  
  private final SequenceNumber readSeqNo = new SequenceNumber();
  
  private final SequenceNumber writeSeqNo = new SequenceNumber();
  
  private TlsProtocol handler;
  
  private InputStream input;
  
  private OutputStream output;
  
  private TlsCipher pendingCipher = null;
  
  private TlsCipher readCipher = (TlsCipher)TlsNullNullCipher.INSTANCE;
  
  private TlsCipher readCipherDeferred = null;
  
  private TlsCipher writeCipher = (TlsCipher)TlsNullNullCipher.INSTANCE;
  
  private ProtocolVersion writeVersion = null;
  
  private int plaintextLimit = DEFAULT_PLAINTEXT_LIMIT;
  
  private int ciphertextLimit = DEFAULT_PLAINTEXT_LIMIT;
  
  private boolean ignoreChangeCipherSpec = false;
  
  RecordStream(TlsProtocol paramTlsProtocol, InputStream paramInputStream, OutputStream paramOutputStream) {
    this.handler = paramTlsProtocol;
    this.input = paramInputStream;
    this.output = paramOutputStream;
  }
  
  int getPlaintextLimit() {
    return this.plaintextLimit;
  }
  
  void setPlaintextLimit(int paramInt) {
    this.plaintextLimit = paramInt;
    this.ciphertextLimit = this.readCipher.getCiphertextDecodeLimit(paramInt);
  }
  
  void setWriteVersion(ProtocolVersion paramProtocolVersion) {
    this.writeVersion = paramProtocolVersion;
  }
  
  void setIgnoreChangeCipherSpec(boolean paramBoolean) {
    this.ignoreChangeCipherSpec = paramBoolean;
  }
  
  void setPendingCipher(TlsCipher paramTlsCipher) {
    this.pendingCipher = paramTlsCipher;
  }
  
  void notifyChangeCipherSpecReceived() throws IOException {
    if (this.pendingCipher == null)
      throw new TlsFatalAlert((short)10, "No pending cipher"); 
    enablePendingCipherRead(false);
  }
  
  void enablePendingCipherRead(boolean paramBoolean) throws IOException {
    if (this.pendingCipher == null)
      throw new TlsFatalAlert((short)80); 
    if (this.readCipherDeferred != null)
      throw new TlsFatalAlert((short)80); 
    if (paramBoolean) {
      this.readCipherDeferred = this.pendingCipher;
    } else {
      this.readCipher = this.pendingCipher;
      this.ciphertextLimit = this.readCipher.getCiphertextDecodeLimit(this.plaintextLimit);
      this.readSeqNo.reset();
    } 
  }
  
  void enablePendingCipherWrite() throws IOException {
    if (this.pendingCipher == null)
      throw new TlsFatalAlert((short)80); 
    this.writeCipher = this.pendingCipher;
    this.writeSeqNo.reset();
  }
  
  void finaliseHandshake() throws IOException {
    if (this.readCipher != this.pendingCipher || this.writeCipher != this.pendingCipher)
      throw new TlsFatalAlert((short)40); 
    this.pendingCipher = null;
  }
  
  boolean needsKeyUpdate() {
    return (this.writeSeqNo.currentValue() >= 1048576L);
  }
  
  void notifyKeyUpdateReceived() throws IOException {
    this.readCipher.rekeyDecoder();
    this.readSeqNo.reset();
  }
  
  void notifyKeyUpdateSent() throws IOException {
    this.writeCipher.rekeyEncoder();
    this.writeSeqNo.reset();
  }
  
  RecordPreview previewRecordHeader(byte[] paramArrayOfbyte) throws IOException {
    short s = checkRecordType(paramArrayOfbyte, 0);
    int i = TlsUtils.readUint16(paramArrayOfbyte, 3);
    checkLength(i, this.ciphertextLimit, (short)22);
    int j = 5 + i;
    int k = 0;
    if (23 == s && this.handler.isApplicationDataReady()) {
      int m = this.readCipher.getPlaintextDecodeLimit(i);
      k = Math.max(0, Math.min(this.plaintextLimit, m));
    } 
    return new RecordPreview(j, k);
  }
  
  RecordPreview previewOutputRecord(int paramInt) {
    int i = Math.max(0, Math.min(this.plaintextLimit, paramInt));
    int j = previewOutputRecordSize(i);
    return new RecordPreview(j, i);
  }
  
  int previewOutputRecordSize(int paramInt) {
    return 5 + this.writeCipher.getCiphertextEncodeLimit(paramInt);
  }
  
  boolean readFullRecord(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (paramInt2 < 5)
      return false; 
    int i = TlsUtils.readUint16(paramArrayOfbyte, paramInt1 + 3);
    if (paramInt2 != 5 + i)
      return false; 
    short s = checkRecordType(paramArrayOfbyte, paramInt1 + 0);
    ProtocolVersion protocolVersion = TlsUtils.readVersion(paramArrayOfbyte, paramInt1 + 1);
    checkLength(i, this.ciphertextLimit, (short)22);
    if (this.ignoreChangeCipherSpec && 20 == s) {
      checkChangeCipherSpec(paramArrayOfbyte, paramInt1 + 5, i);
      return true;
    } 
    TlsDecodeResult tlsDecodeResult = decodeAndVerify(s, protocolVersion, paramArrayOfbyte, paramInt1 + 5, i);
    this.handler.processRecord(tlsDecodeResult.contentType, tlsDecodeResult.buf, tlsDecodeResult.off, tlsDecodeResult.len);
    return true;
  }
  
  boolean readRecord() throws IOException {
    TlsDecodeResult tlsDecodeResult;
    if (!this.inputRecord.readHeader(this.input))
      return false; 
    short s = checkRecordType(this.inputRecord.buf, 0);
    ProtocolVersion protocolVersion = TlsUtils.readVersion(this.inputRecord.buf, 1);
    int i = TlsUtils.readUint16(this.inputRecord.buf, 3);
    checkLength(i, this.ciphertextLimit, (short)22);
    this.inputRecord.readFragment(this.input, i);
    try {
      if (this.ignoreChangeCipherSpec && 20 == s) {
        checkChangeCipherSpec(this.inputRecord.buf, 5, i);
        return true;
      } 
      tlsDecodeResult = decodeAndVerify(s, protocolVersion, this.inputRecord.buf, 5, i);
    } finally {
      this.inputRecord.reset();
    } 
    this.handler.processRecord(tlsDecodeResult.contentType, tlsDecodeResult.buf, tlsDecodeResult.off, tlsDecodeResult.len);
    return true;
  }
  
  TlsDecodeResult decodeAndVerify(short paramShort, ProtocolVersion paramProtocolVersion, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    long l = this.readSeqNo.nextValue((short)10);
    TlsDecodeResult tlsDecodeResult = this.readCipher.decodeCiphertext(l, paramShort, paramProtocolVersion, paramArrayOfbyte, paramInt1, paramInt2);
    checkLength(tlsDecodeResult.len, this.plaintextLimit, (short)22);
    if (tlsDecodeResult.len < 1 && tlsDecodeResult.contentType != 23)
      throw new TlsFatalAlert((short)47); 
    return tlsDecodeResult;
  }
  
  void writeRecord(short paramShort, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (this.writeVersion == null)
      return; 
    checkLength(paramInt2, this.plaintextLimit, (short)80);
    if (paramInt2 < 1 && paramShort != 23)
      throw new TlsFatalAlert((short)80); 
    long l = this.writeSeqNo.nextValue((short)80);
    ProtocolVersion protocolVersion = this.writeVersion;
    TlsEncodeResult tlsEncodeResult = this.writeCipher.encodePlaintext(l, paramShort, protocolVersion, 5, paramArrayOfbyte, paramInt1, paramInt2);
    int i = tlsEncodeResult.len - 5;
    TlsUtils.checkUint16(i);
    TlsUtils.writeUint8(tlsEncodeResult.recordType, tlsEncodeResult.buf, tlsEncodeResult.off + 0);
    TlsUtils.writeVersion(protocolVersion, tlsEncodeResult.buf, tlsEncodeResult.off + 1);
    TlsUtils.writeUint16(i, tlsEncodeResult.buf, tlsEncodeResult.off + 3);
    try {
      this.output.write(tlsEncodeResult.buf, tlsEncodeResult.off, tlsEncodeResult.len);
    } catch (InterruptedIOException interruptedIOException) {
      throw new TlsFatalAlert((short)80, interruptedIOException);
    } 
    this.output.flush();
  }
  
  void close() throws IOException {
    this.inputRecord.reset();
    IOException iOException = null;
    try {
      this.input.close();
    } catch (IOException iOException1) {
      iOException = iOException1;
    } 
    try {
      this.output.close();
    } catch (IOException iOException1) {
      if (iOException == null)
        iOException = iOException1; 
    } 
    if (iOException != null)
      throw iOException; 
  }
  
  private void checkChangeCipherSpec(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (1 != paramInt2 || 1 != paramArrayOfbyte[paramInt1])
      throw new TlsFatalAlert((short)10, "Malformed " + ContentType.getText((short)20)); 
  }
  
  private short checkRecordType(byte[] paramArrayOfbyte, int paramInt) throws IOException {
    short s = TlsUtils.readUint8(paramArrayOfbyte, paramInt);
    if (null != this.readCipherDeferred && s == 23) {
      this.readCipher = this.readCipherDeferred;
      this.readCipherDeferred = null;
      this.ciphertextLimit = this.readCipher.getCiphertextDecodeLimit(this.plaintextLimit);
      this.readSeqNo.reset();
    } 
    if (this.readCipher.usesOpaqueRecordTypeDecode())
      if (23 != s && (!this.ignoreChangeCipherSpec || 20 != s))
        throw new TlsFatalAlert((short)10, "Opaque " + ContentType.getText(s));  
    switch (s) {
      case 23:
        if (!this.handler.isApplicationDataReady())
          throw new TlsFatalAlert((short)10, "Not ready for " + ContentType.getText((short)23)); 
      case 20:
      case 21:
      case 22:
        return s;
    } 
    throw new TlsFatalAlert((short)10, "Unsupported " + ContentType.getText(s));
  }
  
  private static void checkLength(int paramInt1, int paramInt2, short paramShort) throws IOException {
    if (paramInt1 > paramInt2)
      throw new TlsFatalAlert(paramShort); 
  }
  
  private static class Record {
    private final byte[] header = new byte[5];
    
    volatile byte[] buf = this.header;
    
    volatile int pos = 0;
    
    private Record() {}
    
    void fillTo(InputStream param1InputStream, int param1Int) throws IOException {
      while (this.pos < param1Int) {
        try {
          int i = param1InputStream.read(this.buf, this.pos, param1Int - this.pos);
          if (i < 0)
            break; 
          this.pos += i;
        } catch (InterruptedIOException interruptedIOException) {
          this.pos += interruptedIOException.bytesTransferred;
          interruptedIOException.bytesTransferred = 0;
          throw interruptedIOException;
        } 
      } 
    }
    
    void readFragment(InputStream param1InputStream, int param1Int) throws IOException {
      int i = 5 + param1Int;
      resize(i);
      fillTo(param1InputStream, i);
      if (this.pos < i)
        throw new EOFException(); 
    }
    
    boolean readHeader(InputStream param1InputStream) throws IOException {
      fillTo(param1InputStream, 5);
      if (this.pos == 0)
        return false; 
      if (this.pos < 5)
        throw new EOFException(); 
      return true;
    }
    
    void reset() {
      this.buf = this.header;
      this.pos = 0;
    }
    
    private void resize(int param1Int) {
      if (this.buf.length < param1Int) {
        byte[] arrayOfByte = new byte[param1Int];
        System.arraycopy(this.buf, 0, arrayOfByte, 0, this.pos);
        this.buf = arrayOfByte;
      } 
    }
  }
  
  private static class SequenceNumber {
    private long value = 0L;
    
    private boolean exhausted = false;
    
    private SequenceNumber() {}
    
    synchronized long currentValue() {
      return this.value;
    }
    
    synchronized long nextValue(short param1Short) throws TlsFatalAlert {
      if (this.exhausted)
        throw new TlsFatalAlert(param1Short, "Sequence numbers exhausted"); 
      long l = this.value;
      if (++this.value == 0L)
        this.exhausted = true; 
      return l;
    }
    
    synchronized void reset() {
      this.value = 0L;
      this.exhausted = false;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\RecordStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */