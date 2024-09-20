package META-INF.versions.9.org.bouncycastle.pqc.crypto.crystals.kyber;

abstract class Symmetric {
  final int xofBlockBytes;
  
  abstract void hash_h(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt);
  
  abstract void hash_g(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2);
  
  abstract void xofAbsorb(byte[] paramArrayOfbyte, byte paramByte1, byte paramByte2);
  
  abstract void xofSqueezeBlocks(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  abstract void prf(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte paramByte);
  
  abstract void kdf(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2);
  
  Symmetric(int paramInt) {
    this.xofBlockBytes = paramInt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\crystals\kyber\Symmetric.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */