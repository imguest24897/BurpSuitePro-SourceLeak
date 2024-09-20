package org.bouncycastle.pqc.crypto.sphincsplus;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincsplus\IndexedDigest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */