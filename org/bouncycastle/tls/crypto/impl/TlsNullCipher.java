package org.bouncycastle.tls.crypto.impl;

import java.io.IOException;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsDecodeResult;
import org.bouncycastle.tls.crypto.TlsEncodeResult;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.util.Arrays;

public final class TlsNullCipher implements TlsCipher {
  private final TlsSuiteHMac readMac;
  
  private final TlsSuiteHMac writeMac;
  
  private final byte[] decryptConnectionID;
  
  private final byte[] encryptConnectionID;
  
  private final boolean decryptUseInnerPlaintext;
  
  private final boolean encryptUseInnerPlaintext;
  
  public TlsNullCipher(TlsCryptoParameters paramTlsCryptoParameters, TlsHMAC paramTlsHMAC1, TlsHMAC paramTlsHMAC2) throws IOException {
    SecurityParameters securityParameters = paramTlsCryptoParameters.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
    if (TlsImplUtils.isTLSv13(protocolVersion))
      throw new TlsFatalAlert((short)80); 
    this.decryptConnectionID = securityParameters.getConnectionIDPeer();
    this.encryptConnectionID = securityParameters.getConnectionIDLocal();
    this.decryptUseInnerPlaintext = !Arrays.isNullOrEmpty(this.decryptConnectionID);
    this.encryptUseInnerPlaintext = !Arrays.isNullOrEmpty(this.encryptConnectionID);
    int i = paramTlsHMAC1.getMacLength() + paramTlsHMAC2.getMacLength();
    byte[] arrayOfByte = TlsImplUtils.calculateKeyBlock(paramTlsCryptoParameters, i);
    int j = 0;
    paramTlsHMAC1.setKey(arrayOfByte, j, paramTlsHMAC1.getMacLength());
    j += paramTlsHMAC1.getMacLength();
    paramTlsHMAC2.setKey(arrayOfByte, j, paramTlsHMAC2.getMacLength());
    j += paramTlsHMAC2.getMacLength();
    if (j != i)
      throw new TlsFatalAlert((short)80); 
    if (paramTlsCryptoParameters.isServer()) {
      this.writeMac = new TlsSuiteHMac(paramTlsCryptoParameters, paramTlsHMAC2);
      this.readMac = new TlsSuiteHMac(paramTlsCryptoParameters, paramTlsHMAC1);
    } else {
      this.writeMac = new TlsSuiteHMac(paramTlsCryptoParameters, paramTlsHMAC1);
      this.readMac = new TlsSuiteHMac(paramTlsCryptoParameters, paramTlsHMAC2);
    } 
  }
  
  public int getCiphertextDecodeLimit(int paramInt) {
    int i = paramInt + (this.decryptUseInnerPlaintext ? 1 : 0);
    return i + this.readMac.getSize();
  }
  
  public int getCiphertextEncodeLimit(int paramInt) {
    int i = paramInt + (this.encryptUseInnerPlaintext ? 1 : 0);
    return i + this.writeMac.getSize();
  }
  
  public int getPlaintextDecodeLimit(int paramInt) {
    int i = paramInt - this.readMac.getSize();
    return i - (this.decryptUseInnerPlaintext ? 1 : 0);
  }
  
  public int getPlaintextEncodeLimit(int paramInt) {
    int i = paramInt - this.writeMac.getSize();
    return i - (this.encryptUseInnerPlaintext ? 1 : 0);
  }
  
  public TlsEncodeResult encodePlaintext(long paramLong, short paramShort, ProtocolVersion paramProtocolVersion, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) throws IOException {
    int i = this.writeMac.getSize();
    int j = paramInt3 + (this.encryptUseInnerPlaintext ? 1 : 0);
    byte[] arrayOfByte1 = new byte[paramInt1 + j + i];
    System.arraycopy(paramArrayOfbyte, paramInt2, arrayOfByte1, paramInt1, paramInt3);
    short s = paramShort;
    if (this.encryptUseInnerPlaintext) {
      arrayOfByte1[paramInt1 + paramInt3] = (byte)paramShort;
      s = 25;
    } 
    byte[] arrayOfByte2 = this.writeMac.calculateMac(paramLong, s, this.encryptConnectionID, arrayOfByte1, paramInt1, j);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, paramInt1 + j, arrayOfByte2.length);
    return new TlsEncodeResult(arrayOfByte1, 0, arrayOfByte1.length, s);
  }
  
  public TlsDecodeResult decodeCiphertext(long paramLong, short paramShort, ProtocolVersion paramProtocolVersion, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    int i = this.readMac.getSize();
    int j = paramInt2 - i;
    if (j < (this.decryptUseInnerPlaintext ? 1 : 0))
      throw new TlsFatalAlert((short)50); 
    byte[] arrayOfByte = this.readMac.calculateMac(paramLong, paramShort, this.decryptConnectionID, paramArrayOfbyte, paramInt1, j);
    boolean bool = !TlsUtils.constantTimeAreEqual(i, arrayOfByte, 0, paramArrayOfbyte, paramInt1 + j) ? true : false;
    if (bool)
      throw new TlsFatalAlert((short)20); 
    short s = paramShort;
    int k = j;
    if (this.decryptUseInnerPlaintext)
      while (true) {
        if (--k < 0)
          throw new TlsFatalAlert((short)10); 
        byte b = paramArrayOfbyte[paramInt1 + k];
        if (0 != b) {
          s = (short)(b & 0xFF);
          break;
        } 
      }  
    return new TlsDecodeResult(paramArrayOfbyte, paramInt1, k, s);
  }
  
  public void rekeyDecoder() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public void rekeyEncoder() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public boolean usesOpaqueRecordTypeDecode() {
    return this.decryptUseInnerPlaintext;
  }
  
  public boolean usesOpaqueRecordTypeEncode() {
    return this.encryptUseInnerPlaintext;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\TlsNullCipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */