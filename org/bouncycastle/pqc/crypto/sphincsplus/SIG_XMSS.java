package org.bouncycastle.pqc.crypto.sphincsplus;

class SIG_XMSS {
  final byte[] sig;
  
  final byte[][] auth;
  
  public SIG_XMSS(byte[] paramArrayOfbyte, byte[][] paramArrayOfbyte1) {
    this.sig = paramArrayOfbyte;
    this.auth = paramArrayOfbyte1;
  }
  
  public byte[] getWOTSSig() {
    return this.sig;
  }
  
  public byte[][] getXMSSAUTH() {
    return this.auth;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincsplus\SIG_XMSS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */