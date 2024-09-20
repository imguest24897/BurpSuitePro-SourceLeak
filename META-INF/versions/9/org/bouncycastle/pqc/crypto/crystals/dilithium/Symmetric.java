package META-INF.versions.9.org.bouncycastle.pqc.crypto.crystals.dilithium;

abstract class Symmetric {
  final int stream128BlockBytes;
  
  final int stream256BlockBytes;
  
  Symmetric(int paramInt1, int paramInt2) {
    this.stream128BlockBytes = paramInt1;
    this.stream256BlockBytes = paramInt2;
  }
  
  abstract void stream128init(byte[] paramArrayOfbyte, short paramShort);
  
  abstract void stream256init(byte[] paramArrayOfbyte, short paramShort);
  
  abstract void stream128squeezeBlocks(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  abstract void stream256squeezeBlocks(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\crystals\dilithium\Symmetric.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */