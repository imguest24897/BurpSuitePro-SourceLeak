package org.bouncycastle.pqc.crypto.sphincsplus;

class SK {
  final byte[] seed;
  
  final byte[] prf;
  
  SK(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.seed = paramArrayOfbyte1;
    this.prf = paramArrayOfbyte2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincsplus\SK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */