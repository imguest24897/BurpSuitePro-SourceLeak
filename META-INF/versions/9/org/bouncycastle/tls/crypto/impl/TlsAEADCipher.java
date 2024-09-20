package META-INF.versions.9.org.bouncycastle.tls.crypto.impl;

import java.io.IOException;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsCryptoUtils;
import org.bouncycastle.tls.crypto.TlsDecodeResult;
import org.bouncycastle.tls.crypto.TlsEncodeResult;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl;
import org.bouncycastle.tls.crypto.impl.TlsImplUtils;
import org.bouncycastle.util.Arrays;

public final class TlsAEADCipher implements TlsCipher {
  public static final int AEAD_CCM = 1;
  
  public static final int AEAD_CHACHA20_POLY1305 = 2;
  
  public static final int AEAD_GCM = 3;
  
  private static final int NONCE_RFC5288 = 1;
  
  private static final int NONCE_RFC7905 = 2;
  
  private static final long SEQUENCE_NUMBER_PLACEHOLDER = -1L;
  
  private final TlsCryptoParameters cryptoParams;
  
  private final int keySize;
  
  private final int macSize;
  
  private final int fixed_iv_length;
  
  private final int record_iv_length;
  
  private final TlsAEADCipherImpl decryptCipher;
  
  private final TlsAEADCipherImpl encryptCipher;
  
  private final byte[] decryptNonce;
  
  private final byte[] encryptNonce;
  
  private final byte[] decryptConnectionID;
  
  private final byte[] encryptConnectionID;
  
  private final boolean decryptUseInnerPlaintext;
  
  private final boolean encryptUseInnerPlaintext;
  
  private final boolean isTLSv13;
  
  private final int nonceMode;
  
  public TlsAEADCipher(TlsCryptoParameters paramTlsCryptoParameters, TlsAEADCipherImpl paramTlsAEADCipherImpl1, TlsAEADCipherImpl paramTlsAEADCipherImpl2, int paramInt1, int paramInt2, int paramInt3) throws IOException {
    SecurityParameters securityParameters = paramTlsCryptoParameters.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
    if (!TlsImplUtils.isTLSv12(protocolVersion))
      throw new TlsFatalAlert((short)80); 
    this.isTLSv13 = TlsImplUtils.isTLSv13(protocolVersion);
    this.nonceMode = getNonceMode(this.isTLSv13, paramInt3);
    this.decryptConnectionID = securityParameters.getConnectionIDPeer();
    this.encryptConnectionID = securityParameters.getConnectionIDLocal();
    this.decryptUseInnerPlaintext = (this.isTLSv13 || !Arrays.isNullOrEmpty(this.decryptConnectionID));
    this.encryptUseInnerPlaintext = (this.isTLSv13 || !Arrays.isNullOrEmpty(this.encryptConnectionID));
    switch (this.nonceMode) {
      case 1:
        this.fixed_iv_length = 4;
        this.record_iv_length = 8;
        break;
      case 2:
        this.fixed_iv_length = 12;
        this.record_iv_length = 0;
        break;
      default:
        throw new TlsFatalAlert((short)80);
    } 
    this.cryptoParams = paramTlsCryptoParameters;
    this.keySize = paramInt1;
    this.macSize = paramInt2;
    this.decryptCipher = paramTlsAEADCipherImpl2;
    this.encryptCipher = paramTlsAEADCipherImpl1;
    this.decryptNonce = new byte[this.fixed_iv_length];
    this.encryptNonce = new byte[this.fixed_iv_length];
    boolean bool = paramTlsCryptoParameters.isServer();
    if (this.isTLSv13) {
      rekeyCipher(securityParameters, paramTlsAEADCipherImpl2, this.decryptNonce, !bool);
      rekeyCipher(securityParameters, paramTlsAEADCipherImpl1, this.encryptNonce, bool);
      return;
    } 
    int i = 2 * paramInt1 + 2 * this.fixed_iv_length;
    byte[] arrayOfByte = TlsImplUtils.calculateKeyBlock(paramTlsCryptoParameters, i);
    int j = 0;
    if (bool) {
      paramTlsAEADCipherImpl2.setKey(arrayOfByte, j, paramInt1);
      j += paramInt1;
      paramTlsAEADCipherImpl1.setKey(arrayOfByte, j, paramInt1);
      j += paramInt1;
      System.arraycopy(arrayOfByte, j, this.decryptNonce, 0, this.fixed_iv_length);
      j += this.fixed_iv_length;
      System.arraycopy(arrayOfByte, j, this.encryptNonce, 0, this.fixed_iv_length);
      j += this.fixed_iv_length;
    } else {
      paramTlsAEADCipherImpl1.setKey(arrayOfByte, j, paramInt1);
      j += paramInt1;
      paramTlsAEADCipherImpl2.setKey(arrayOfByte, j, paramInt1);
      j += paramInt1;
      System.arraycopy(arrayOfByte, j, this.encryptNonce, 0, this.fixed_iv_length);
      j += this.fixed_iv_length;
      System.arraycopy(arrayOfByte, j, this.decryptNonce, 0, this.fixed_iv_length);
      j += this.fixed_iv_length;
    } 
    if (i != j)
      throw new TlsFatalAlert((short)80); 
  }
  
  public int getCiphertextDecodeLimit(int paramInt) {
    int i = paramInt + (this.decryptUseInnerPlaintext ? 1 : 0);
    return i + this.macSize + this.record_iv_length;
  }
  
  public int getCiphertextEncodeLimit(int paramInt) {
    int i = paramInt + (this.encryptUseInnerPlaintext ? 1 : 0);
    return i + this.macSize + this.record_iv_length;
  }
  
  public int getPlaintextDecodeLimit(int paramInt) {
    int i = paramInt - this.macSize - this.record_iv_length;
    return i - (this.decryptUseInnerPlaintext ? 1 : 0);
  }
  
  public int getPlaintextEncodeLimit(int paramInt) {
    int i = paramInt - this.macSize - this.record_iv_length;
    return i - (this.encryptUseInnerPlaintext ? 1 : 0);
  }
  
  public TlsEncodeResult encodePlaintext(long paramLong, short paramShort, ProtocolVersion paramProtocolVersion, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) throws IOException {
    byte[] arrayOfByte1 = new byte[this.encryptNonce.length + this.record_iv_length];
    switch (this.nonceMode) {
      case 1:
        System.arraycopy(this.encryptNonce, 0, arrayOfByte1, 0, this.encryptNonce.length);
        TlsUtils.writeUint64(paramLong, arrayOfByte1, this.encryptNonce.length);
        break;
      case 2:
        TlsUtils.writeUint64(paramLong, arrayOfByte1, arrayOfByte1.length - 8);
        for (i = 0; i < this.encryptNonce.length; i++)
          arrayOfByte1[i] = (byte)(arrayOfByte1[i] ^ this.encryptNonce[i]); 
        break;
      default:
        throw new TlsFatalAlert((short)80);
    } 
    int i = paramInt3 + (this.encryptUseInnerPlaintext ? 1 : 0);
    this.encryptCipher.init(arrayOfByte1, this.macSize);
    int j = this.encryptCipher.getOutputSize(i);
    int k = this.record_iv_length + j;
    byte[] arrayOfByte2 = new byte[paramInt1 + k];
    int m = paramInt1;
    if (this.record_iv_length != 0) {
      System.arraycopy(arrayOfByte1, arrayOfByte1.length - this.record_iv_length, arrayOfByte2, m, this.record_iv_length);
      m += this.record_iv_length;
    } 
    short s = paramShort;
    if (this.encryptUseInnerPlaintext)
      s = this.isTLSv13 ? 23 : 25; 
    byte[] arrayOfByte3 = getAdditionalData(paramLong, s, paramProtocolVersion, k, i, this.encryptConnectionID);
    try {
      System.arraycopy(paramArrayOfbyte, paramInt2, arrayOfByte2, m, paramInt3);
      if (this.encryptUseInnerPlaintext)
        arrayOfByte2[m + paramInt3] = (byte)paramShort; 
      m += this.encryptCipher.doFinal(arrayOfByte3, arrayOfByte2, m, i, arrayOfByte2, m);
    } catch (RuntimeException runtimeException) {
      throw new TlsFatalAlert((short)80, runtimeException);
    } 
    if (m != arrayOfByte2.length)
      throw new TlsFatalAlert((short)80); 
    return new TlsEncodeResult(arrayOfByte2, 0, arrayOfByte2.length, s);
  }
  
  public TlsDecodeResult decodeCiphertext(long paramLong, short paramShort, ProtocolVersion paramProtocolVersion, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    int m;
    if (getPlaintextDecodeLimit(paramInt2) < 0)
      throw new TlsFatalAlert((short)50); 
    byte[] arrayOfByte1 = new byte[this.decryptNonce.length + this.record_iv_length];
    switch (this.nonceMode) {
      case 1:
        System.arraycopy(this.decryptNonce, 0, arrayOfByte1, 0, this.decryptNonce.length);
        System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte1, arrayOfByte1.length - this.record_iv_length, this.record_iv_length);
        break;
      case 2:
        TlsUtils.writeUint64(paramLong, arrayOfByte1, arrayOfByte1.length - 8);
        for (i = 0; i < this.decryptNonce.length; i++)
          arrayOfByte1[i] = (byte)(arrayOfByte1[i] ^ this.decryptNonce[i]); 
        break;
      default:
        throw new TlsFatalAlert((short)80);
    } 
    this.decryptCipher.init(arrayOfByte1, this.macSize);
    int i = paramInt1 + this.record_iv_length;
    int j = paramInt2 - this.record_iv_length;
    int k = this.decryptCipher.getOutputSize(j);
    byte[] arrayOfByte2 = getAdditionalData(paramLong, paramShort, paramProtocolVersion, paramInt2, k, this.decryptConnectionID);
    try {
      m = this.decryptCipher.doFinal(arrayOfByte2, paramArrayOfbyte, i, j, paramArrayOfbyte, i);
    } catch (RuntimeException runtimeException) {
      throw new TlsFatalAlert((short)20, runtimeException);
    } 
    if (m != k)
      throw new TlsFatalAlert((short)80); 
    short s = paramShort;
    int n = k;
    if (this.decryptUseInnerPlaintext)
      while (true) {
        if (--n < 0)
          throw new TlsFatalAlert((short)10); 
        byte b = paramArrayOfbyte[i + n];
        if (0 != b) {
          s = (short)(b & 0xFF);
          break;
        } 
      }  
    return new TlsDecodeResult(paramArrayOfbyte, i, n, s);
  }
  
  public void rekeyDecoder() throws IOException {
    rekeyCipher(this.cryptoParams.getSecurityParametersConnection(), this.decryptCipher, this.decryptNonce, !this.cryptoParams.isServer());
  }
  
  public void rekeyEncoder() throws IOException {
    rekeyCipher(this.cryptoParams.getSecurityParametersConnection(), this.encryptCipher, this.encryptNonce, this.cryptoParams.isServer());
  }
  
  public boolean usesOpaqueRecordTypeDecode() {
    return this.decryptUseInnerPlaintext;
  }
  
  public boolean usesOpaqueRecordTypeEncode() {
    return this.encryptUseInnerPlaintext;
  }
  
  private byte[] getAdditionalData(long paramLong, short paramShort, ProtocolVersion paramProtocolVersion, int paramInt1, int paramInt2, byte[] paramArrayOfbyte) throws IOException {
    if (!Arrays.isNullOrEmpty(paramArrayOfbyte)) {
      int i = paramArrayOfbyte.length;
      byte[] arrayOfByte1 = new byte[23 + i];
      TlsUtils.writeUint64(-1L, arrayOfByte1, 0);
      TlsUtils.writeUint8((short)25, arrayOfByte1, 8);
      TlsUtils.writeUint8(i, arrayOfByte1, 9);
      TlsUtils.writeUint8((short)25, arrayOfByte1, 10);
      TlsUtils.writeVersion(paramProtocolVersion, arrayOfByte1, 11);
      TlsUtils.writeUint64(paramLong, arrayOfByte1, 13);
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte1, 21, i);
      TlsUtils.writeUint16(paramInt2, arrayOfByte1, 21 + i);
      return arrayOfByte1;
    } 
    if (this.isTLSv13) {
      byte[] arrayOfByte1 = new byte[5];
      TlsUtils.writeUint8(paramShort, arrayOfByte1, 0);
      TlsUtils.writeVersion(paramProtocolVersion, arrayOfByte1, 1);
      TlsUtils.writeUint16(paramInt1, arrayOfByte1, 3);
      return arrayOfByte1;
    } 
    byte[] arrayOfByte = new byte[13];
    TlsUtils.writeUint64(paramLong, arrayOfByte, 0);
    TlsUtils.writeUint8(paramShort, arrayOfByte, 8);
    TlsUtils.writeVersion(paramProtocolVersion, arrayOfByte, 9);
    TlsUtils.writeUint16(paramInt2, arrayOfByte, 11);
    return arrayOfByte;
  }
  
  private void rekeyCipher(SecurityParameters paramSecurityParameters, TlsAEADCipherImpl paramTlsAEADCipherImpl, byte[] paramArrayOfbyte, boolean paramBoolean) throws IOException {
    if (!this.isTLSv13)
      throw new TlsFatalAlert((short)80); 
    TlsSecret tlsSecret = paramBoolean ? paramSecurityParameters.getTrafficSecretServer() : paramSecurityParameters.getTrafficSecretClient();
    if (null == tlsSecret)
      throw new TlsFatalAlert((short)80); 
    setup13Cipher(paramTlsAEADCipherImpl, paramArrayOfbyte, tlsSecret, paramSecurityParameters.getPRFCryptoHashAlgorithm());
  }
  
  private void setup13Cipher(TlsAEADCipherImpl paramTlsAEADCipherImpl, byte[] paramArrayOfbyte, TlsSecret paramTlsSecret, int paramInt) throws IOException {
    byte[] arrayOfByte1 = TlsCryptoUtils.hkdfExpandLabel(paramTlsSecret, paramInt, "key", TlsUtils.EMPTY_BYTES, this.keySize).extract();
    byte[] arrayOfByte2 = TlsCryptoUtils.hkdfExpandLabel(paramTlsSecret, paramInt, "iv", TlsUtils.EMPTY_BYTES, this.fixed_iv_length).extract();
    paramTlsAEADCipherImpl.setKey(arrayOfByte1, 0, this.keySize);
    System.arraycopy(arrayOfByte2, 0, paramArrayOfbyte, 0, this.fixed_iv_length);
  }
  
  private static int getNonceMode(boolean paramBoolean, int paramInt) throws IOException {
    switch (paramInt) {
      case 1:
      case 3:
        return paramBoolean ? 2 : 1;
      case 2:
        return 2;
    } 
    throw new TlsFatalAlert((short)80);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\TlsAEADCipher.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */