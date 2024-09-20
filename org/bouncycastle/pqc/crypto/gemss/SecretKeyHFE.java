package org.bouncycastle.pqc.crypto.gemss;

class SecretKeyHFE {
  complete_sparse_monic_gf2nx F_struct = new complete_sparse_monic_gf2nx();
  
  public Pointer F_HFEv;
  
  public Pointer S;
  
  public Pointer T;
  
  public Pointer sk_uncomp;
  
  public SecretKeyHFE(GeMSSEngine paramGeMSSEngine) {
    this.F_struct.L = new int[paramGeMSSEngine.NB_COEFS_HFEPOLY];
  }
  
  static class complete_sparse_monic_gf2nx {
    public Pointer poly;
    
    public int[] L;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\gemss\SecretKeyHFE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */