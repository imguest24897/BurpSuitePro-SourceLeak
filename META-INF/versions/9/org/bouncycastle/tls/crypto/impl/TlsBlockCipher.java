package META-INF.versions.9.org.bouncycastle.tls.crypto.impl;

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
import org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl;
import org.bouncycastle.tls.crypto.impl.TlsImplUtils;
import org.bouncycastle.tls.crypto.impl.TlsSuiteHMac;
import org.bouncycastle.tls.crypto.impl.TlsSuiteMac;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

public final class TlsBlockCipher implements TlsCipher {
  private final TlsCryptoParameters cryptoParams;
  
  private final byte[] randomData;
  
  private final boolean encryptThenMAC;
  
  private final boolean useExplicitIV;
  
  private final boolean acceptExtraPadding;
  
  private final boolean useExtraPadding;
  
  private final TlsBlockCipherImpl decryptCipher;
  
  private final TlsBlockCipherImpl encryptCipher;
  
  private final TlsSuiteMac readMac;
  
  private final TlsSuiteMac writeMac;
  
  private final byte[] decryptConnectionID;
  
  private final byte[] encryptConnectionID;
  
  private final boolean decryptUseInnerPlaintext;
  
  private final boolean encryptUseInnerPlaintext;
  
  public TlsBlockCipher(TlsCryptoParameters paramTlsCryptoParameters, TlsBlockCipherImpl paramTlsBlockCipherImpl1, TlsBlockCipherImpl paramTlsBlockCipherImpl2, TlsHMAC paramTlsHMAC1, TlsHMAC paramTlsHMAC2, int paramInt) throws IOException {
    TlsBlockCipherImpl tlsBlockCipherImpl1;
    TlsBlockCipherImpl tlsBlockCipherImpl2;
    SecurityParameters securityParameters = paramTlsCryptoParameters.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
    if (TlsImplUtils.isTLSv13(protocolVersion))
      throw new TlsFatalAlert((short)80); 
    this.decryptConnectionID = securityParameters.getConnectionIDPeer();
    this.encryptConnectionID = securityParameters.getConnectionIDLocal();
    this.decryptUseInnerPlaintext = !Arrays.isNullOrEmpty(this.decryptConnectionID);
    this.encryptUseInnerPlaintext = !Arrays.isNullOrEmpty(this.encryptConnectionID);
    this.cryptoParams = paramTlsCryptoParameters;
    this.randomData = paramTlsCryptoParameters.getNonceGenerator().generateNonce(256);
    this.encryptThenMAC = securityParameters.isEncryptThenMAC();
    this.useExplicitIV = TlsImplUtils.isTLSv11(protocolVersion);
    this.acceptExtraPadding = !protocolVersion.isSSL();
    this.useExtraPadding = (securityParameters.isExtendedPadding() && ProtocolVersion.TLSv10.isEqualOrEarlierVersionOf(protocolVersion) && (this.encryptThenMAC || !securityParameters.isTruncatedHMac()));
    this.encryptCipher = paramTlsBlockCipherImpl1;
    this.decryptCipher = paramTlsBlockCipherImpl2;
    if (paramTlsCryptoParameters.isServer()) {
      tlsBlockCipherImpl1 = paramTlsBlockCipherImpl2;
      tlsBlockCipherImpl2 = paramTlsBlockCipherImpl1;
    } else {
      tlsBlockCipherImpl1 = paramTlsBlockCipherImpl1;
      tlsBlockCipherImpl2 = paramTlsBlockCipherImpl2;
    } 
    int i = 2 * paramInt + paramTlsHMAC1.getMacLength() + paramTlsHMAC2.getMacLength();
    if (!this.useExplicitIV)
      i += tlsBlockCipherImpl1.getBlockSize() + tlsBlockCipherImpl2.getBlockSize(); 
    byte[] arrayOfByte = TlsImplUtils.calculateKeyBlock(paramTlsCryptoParameters, i);
    int j = 0;
    paramTlsHMAC1.setKey(arrayOfByte, j, paramTlsHMAC1.getMacLength());
    j += paramTlsHMAC1.getMacLength();
    paramTlsHMAC2.setKey(arrayOfByte, j, paramTlsHMAC2.getMacLength());
    j += paramTlsHMAC2.getMacLength();
    tlsBlockCipherImpl1.setKey(arrayOfByte, j, paramInt);
    j += paramInt;
    tlsBlockCipherImpl2.setKey(arrayOfByte, j, paramInt);
    j += paramInt;
    int k = tlsBlockCipherImpl1.getBlockSize();
    int m = tlsBlockCipherImpl2.getBlockSize();
    if (this.useExplicitIV) {
      tlsBlockCipherImpl1.init(new byte[k], 0, k);
      tlsBlockCipherImpl2.init(new byte[m], 0, m);
    } else {
      tlsBlockCipherImpl1.init(arrayOfByte, j, k);
      j += k;
      tlsBlockCipherImpl2.init(arrayOfByte, j, m);
      j += m;
    } 
    if (j != i)
      throw new TlsFatalAlert((short)80); 
    if (paramTlsCryptoParameters.isServer()) {
      this.writeMac = (TlsSuiteMac)new TlsSuiteHMac(paramTlsCryptoParameters, paramTlsHMAC2);
      this.readMac = (TlsSuiteMac)new TlsSuiteHMac(paramTlsCryptoParameters, paramTlsHMAC1);
    } else {
      this.writeMac = (TlsSuiteMac)new TlsSuiteHMac(paramTlsCryptoParameters, paramTlsHMAC1);
      this.readMac = (TlsSuiteMac)new TlsSuiteHMac(paramTlsCryptoParameters, paramTlsHMAC2);
    } 
  }
  
  public int getCiphertextDecodeLimit(int paramInt) {
    int i = this.decryptCipher.getBlockSize();
    int j = this.readMac.getSize();
    char c = 'Ā';
    int k = paramInt + (this.decryptUseInnerPlaintext ? 1 : 0);
    return getCiphertextLength(i, j, c, k);
  }
  
  public int getCiphertextEncodeLimit(int paramInt) {
    int i = this.encryptCipher.getBlockSize();
    int j = this.writeMac.getSize();
    boolean bool = this.useExtraPadding ? true : i;
    int k = paramInt + (this.encryptUseInnerPlaintext ? 1 : 0);
    return getCiphertextLength(i, j, bool, k);
  }
  
  public int getPlaintextDecodeLimit(int paramInt) {
    int i = this.decryptCipher.getBlockSize();
    int j = this.readMac.getSize();
    int k = getPlaintextLength(i, j, paramInt);
    return k - (this.decryptUseInnerPlaintext ? 1 : 0);
  }
  
  public int getPlaintextEncodeLimit(int paramInt) {
    int i = this.encryptCipher.getBlockSize();
    int j = this.writeMac.getSize();
    int k = getPlaintextLength(i, j, paramInt);
    return k - (this.encryptUseInnerPlaintext ? 1 : 0);
  }
  
  public TlsEncodeResult encodePlaintext(long paramLong, short paramShort, ProtocolVersion paramProtocolVersion, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) throws IOException {
    int i = this.encryptCipher.getBlockSize();
    int j = this.writeMac.getSize();
    int k = paramInt3 + (this.encryptUseInnerPlaintext ? 1 : 0);
    int m = k;
    if (!this.encryptThenMAC)
      m += j; 
    int n = i - m % i;
    if (this.useExtraPadding) {
      int i4 = (256 - n) / i;
      int i5 = chooseExtraPadBlocks(i4);
      n += i5 * i;
    } 
    int i1 = k + j + n;
    if (this.useExplicitIV)
      i1 += i; 
    byte[] arrayOfByte = new byte[paramInt1 + i1];
    int i2 = paramInt1;
    if (this.useExplicitIV) {
      byte[] arrayOfByte1 = this.cryptoParams.getNonceGenerator().generateNonce(i);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, i2, i);
      i2 += i;
    } 
    int i3 = i2;
    System.arraycopy(paramArrayOfbyte, paramInt2, arrayOfByte, i2, paramInt3);
    i2 += paramInt3;
    short s = paramShort;
    if (this.encryptUseInnerPlaintext) {
      arrayOfByte[i2++] = (byte)paramShort;
      s = 25;
    } 
    if (!this.encryptThenMAC) {
      byte[] arrayOfByte1 = this.writeMac.calculateMac(paramLong, s, this.encryptConnectionID, arrayOfByte, i3, k);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, i2, arrayOfByte1.length);
      i2 += arrayOfByte1.length;
    } 
    byte b = (byte)(n - 1);
    for (byte b1 = 0; b1 < n; b1++)
      arrayOfByte[i2++] = b; 
    this.encryptCipher.doFinal(arrayOfByte, paramInt1, i2 - paramInt1, arrayOfByte, paramInt1);
    if (this.encryptThenMAC) {
      byte[] arrayOfByte1 = this.writeMac.calculateMac(paramLong, s, this.encryptConnectionID, arrayOfByte, paramInt1, i2 - paramInt1);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, i2, arrayOfByte1.length);
      i2 += arrayOfByte1.length;
    } 
    if (i2 != arrayOfByte.length)
      throw new TlsFatalAlert((short)80); 
    return new TlsEncodeResult(arrayOfByte, 0, arrayOfByte.length, s);
  }
  
  public TlsDecodeResult decodeCiphertext(long paramLong, short paramShort, ProtocolVersion paramProtocolVersion, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    int i = this.decryptCipher.getBlockSize();
    int j = this.readMac.getSize();
    int k = i;
    if (this.encryptThenMAC) {
      k += j;
    } else {
      k = Math.max(k, j + 1);
    } 
    if (this.useExplicitIV)
      k += i; 
    if (paramInt2 < k)
      throw new TlsFatalAlert((short)50); 
    int m = paramInt2;
    if (this.encryptThenMAC)
      m -= j; 
    if (m % i != 0)
      throw new TlsFatalAlert((short)21); 
    if (this.encryptThenMAC) {
      byte[] arrayOfByte = this.readMac.calculateMac(paramLong, paramShort, this.decryptConnectionID, paramArrayOfbyte, paramInt1, paramInt2 - j);
      boolean bool = TlsUtils.constantTimeAreEqual(j, arrayOfByte, 0, paramArrayOfbyte, paramInt1 + paramInt2 - j);
      if (!bool)
        throw new TlsFatalAlert((short)20); 
    } 
    this.decryptCipher.doFinal(paramArrayOfbyte, paramInt1, m, paramArrayOfbyte, paramInt1);
    if (this.useExplicitIV) {
      paramInt1 += i;
      m -= i;
    } 
    int n = checkPaddingConstantTime(paramArrayOfbyte, paramInt1, m, i, this.encryptThenMAC ? 0 : j);
    int i1 = (n == 0) ? 1 : 0;
    int i2 = m - n;
    if (!this.encryptThenMAC) {
      i2 -= j;
      byte[] arrayOfByte = this.readMac.calculateMacConstantTime(paramLong, paramShort, this.decryptConnectionID, paramArrayOfbyte, paramInt1, i2, m - j, this.randomData);
      i1 |= !TlsUtils.constantTimeAreEqual(j, arrayOfByte, 0, paramArrayOfbyte, paramInt1 + i2) ? 1 : 0;
    } 
    if (i1 != 0)
      throw new TlsFatalAlert((short)20); 
    short s = paramShort;
    int i3 = i2;
    if (this.decryptUseInnerPlaintext)
      while (true) {
        if (--i3 < 0)
          throw new TlsFatalAlert((short)10); 
        byte b = paramArrayOfbyte[paramInt1 + i3];
        if (0 != b) {
          s = (short)(b & 0xFF);
          break;
        } 
      }  
    return new TlsDecodeResult(paramArrayOfbyte, paramInt1, i3, s);
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
  
  private int checkPaddingConstantTime(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: iload_2
    //   1: iload_3
    //   2: iadd
    //   3: istore #6
    //   5: aload_1
    //   6: iload #6
    //   8: iconst_1
    //   9: isub
    //   10: baload
    //   11: istore #7
    //   13: iload #7
    //   15: sipush #255
    //   18: iand
    //   19: istore #8
    //   21: iload #8
    //   23: iconst_1
    //   24: iadd
    //   25: istore #9
    //   27: iconst_0
    //   28: istore #10
    //   30: iconst_0
    //   31: istore #11
    //   33: aload_0
    //   34: getfield acceptExtraPadding : Z
    //   37: ifeq -> 46
    //   40: sipush #256
    //   43: goto -> 48
    //   46: iload #4
    //   48: iload_3
    //   49: iload #5
    //   51: isub
    //   52: invokestatic min : (II)I
    //   55: istore #12
    //   57: iload #9
    //   59: iload #12
    //   61: if_icmple -> 70
    //   64: iconst_0
    //   65: istore #9
    //   67: goto -> 112
    //   70: iload #6
    //   72: iload #9
    //   74: isub
    //   75: istore #13
    //   77: iload #11
    //   79: aload_1
    //   80: iload #13
    //   82: iinc #13, 1
    //   85: baload
    //   86: iload #7
    //   88: ixor
    //   89: ior
    //   90: i2b
    //   91: istore #11
    //   93: iload #13
    //   95: iload #6
    //   97: if_icmplt -> 77
    //   100: iload #9
    //   102: istore #10
    //   104: iload #11
    //   106: ifeq -> 112
    //   109: iconst_0
    //   110: istore #9
    //   112: aload_0
    //   113: getfield randomData : [B
    //   116: astore #13
    //   118: iload #10
    //   120: sipush #256
    //   123: if_icmpge -> 146
    //   126: iload #11
    //   128: aload #13
    //   130: iload #10
    //   132: iinc #10, 1
    //   135: baload
    //   136: iload #7
    //   138: ixor
    //   139: ior
    //   140: i2b
    //   141: istore #11
    //   143: goto -> 118
    //   146: aload #13
    //   148: iconst_0
    //   149: dup2
    //   150: baload
    //   151: iload #11
    //   153: ixor
    //   154: i2b
    //   155: bastore
    //   156: iload #9
    //   158: ireturn
  }
  
  private int chooseExtraPadBlocks(int paramInt) {
    byte[] arrayOfByte = this.cryptoParams.getNonceGenerator().generateNonce(4);
    int i = Pack.littleEndianToInt(arrayOfByte, 0);
    int j = Integers.numberOfTrailingZeros(i);
    return Math.min(j, paramInt);
  }
  
  private int getCiphertextLength(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt4;
    if (this.useExplicitIV)
      i += paramInt1; 
    i += paramInt3;
    if (this.encryptThenMAC) {
      i -= i % paramInt1;
      i += paramInt2;
    } else {
      i += paramInt2;
      i -= i % paramInt1;
    } 
    return i;
  }
  
  private int getPlaintextLength(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt3;
    if (this.encryptThenMAC) {
      i -= paramInt2;
      i -= i % paramInt1;
    } else {
      i -= i % paramInt1;
      i -= paramInt2;
    } 
    i--;
    if (this.useExplicitIV)
      i -= paramInt1; 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\TlsBlockCipher.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */