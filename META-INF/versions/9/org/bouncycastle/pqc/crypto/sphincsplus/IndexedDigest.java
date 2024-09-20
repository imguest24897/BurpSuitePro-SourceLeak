package META-INF.versions.9.org.bouncycastle.pqc.crypto.sphincsplus;

class IndexedDigest {
  final long idx_tree;
  
  final int idx_leaf;
  
  final byte[] digest;
  
  IndexedDigest(long paramLong, int paramInt, byte[] paramArrayOfbyte) {
    this.idx_tree = paramLong;
    this.idx_leaf = paramInt;
    this.digest = paramArrayOfbyte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\sphincsplus\IndexedDigest.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */