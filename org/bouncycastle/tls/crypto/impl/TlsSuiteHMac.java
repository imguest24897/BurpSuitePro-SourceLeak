package org.bouncycastle.tls.crypto.impl;

import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.tls.crypto.TlsMAC;
import org.bouncycastle.util.Arrays;

public final class TlsSuiteHMac implements TlsSuiteMac {
  private static final long SEQUENCE_NUMBER_PLACEHOLDER = -1L;
  
  private final TlsCryptoParameters cryptoParams;
  
  private final TlsHMAC mac;
  
  private final int digestBlockSize;
  
  private final int digestOverhead;
  
  private final int macSize;
  
  private static int getMacSize(TlsCryptoParameters paramTlsCryptoParameters, TlsMAC paramTlsMAC) {
    int i = paramTlsMAC.getMacLength();
    if (paramTlsCryptoParameters.getSecurityParametersHandshake().isTruncatedHMac())
      i = Math.min(i, 10); 
    return i;
  }
  
  public TlsSuiteHMac(TlsCryptoParameters paramTlsCryptoParameters, TlsHMAC paramTlsHMAC) {
    this.cryptoParams = paramTlsCryptoParameters;
    this.mac = paramTlsHMAC;
    this.macSize = getMacSize(paramTlsCryptoParameters, (TlsMAC)paramTlsHMAC);
    this.digestBlockSize = paramTlsHMAC.getInternalBlockSize();
    if (TlsImplUtils.isSSL(paramTlsCryptoParameters) && paramTlsHMAC.getMacLength() == 20) {
      this.digestOverhead = 4;
    } else {
      this.digestOverhead = this.digestBlockSize / 8;
    } 
  }
  
  public int getSize() {
    return this.macSize;
  }
  
  public byte[] calculateMac(long paramLong, short paramShort, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    ProtocolVersion protocolVersion = this.cryptoParams.getServerVersion();
    if (!Arrays.isNullOrEmpty(paramArrayOfbyte1)) {
      int i = paramArrayOfbyte1.length;
      byte[] arrayOfByte = new byte[23 + i];
      TlsUtils.writeUint64(-1L, arrayOfByte, 0);
      TlsUtils.writeUint8((short)25, arrayOfByte, 8);
      TlsUtils.writeUint8(i, arrayOfByte, 9);
      TlsUtils.writeUint8((short)25, arrayOfByte, 10);
      TlsUtils.writeVersion(protocolVersion, arrayOfByte, 11);
      TlsUtils.writeUint64(paramLong, arrayOfByte, 13);
      System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 21, i);
      TlsUtils.writeUint16(paramInt2, arrayOfByte, 21 + i);
      this.mac.update(arrayOfByte, 0, arrayOfByte.length);
    } else {
      byte[] arrayOfByte = new byte[13];
      TlsUtils.writeUint64(paramLong, arrayOfByte, 0);
      TlsUtils.writeUint8(paramShort, arrayOfByte, 8);
      TlsUtils.writeVersion(protocolVersion, arrayOfByte, 9);
      TlsUtils.writeUint16(paramInt2, arrayOfByte, 11);
      this.mac.update(arrayOfByte, 0, arrayOfByte.length);
    } 
    this.mac.update(paramArrayOfbyte2, paramInt1, paramInt2);
    return truncate(this.mac.calculateMAC());
  }
  
  public byte[] calculateMacConstantTime(long paramLong, short paramShort, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte3) {
    byte[] arrayOfByte = calculateMac(paramLong, paramShort, paramArrayOfbyte1, paramArrayOfbyte2, paramInt1, paramInt2);
    int i = getHeaderLength(paramArrayOfbyte1);
    int j = getDigestBlockCount(i + paramInt3) - getDigestBlockCount(i + paramInt2);
    while (--j >= 0)
      this.mac.update(paramArrayOfbyte3, 0, this.digestBlockSize); 
    this.mac.update(paramArrayOfbyte3, 0, 1);
    this.mac.reset();
    return arrayOfByte;
  }
  
  private int getDigestBlockCount(int paramInt) {
    return (paramInt + this.digestOverhead) / this.digestBlockSize;
  }
  
  private int getHeaderLength(byte[] paramArrayOfbyte) {
    return TlsImplUtils.isSSL(this.cryptoParams) ? 11 : (!Arrays.isNullOrEmpty(paramArrayOfbyte) ? (23 + paramArrayOfbyte.length) : 13);
  }
  
  private byte[] truncate(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte.length <= this.macSize) ? paramArrayOfbyte : Arrays.copyOf(paramArrayOfbyte, this.macSize);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\TlsSuiteHMac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */