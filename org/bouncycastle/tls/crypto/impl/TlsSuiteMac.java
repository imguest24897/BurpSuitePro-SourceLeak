package org.bouncycastle.tls.crypto.impl;

public interface TlsSuiteMac {
  int getSize();
  
  byte[] calculateMac(long paramLong, short paramShort, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2);
  
  byte[] calculateMacConstantTime(long paramLong, short paramShort, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte3);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\TlsSuiteMac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */