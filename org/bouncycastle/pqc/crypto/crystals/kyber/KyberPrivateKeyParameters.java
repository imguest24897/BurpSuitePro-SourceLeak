package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.util.Arrays;

public class KyberPrivateKeyParameters extends KyberKeyParameters {
  final byte[] s;
  
  final byte[] hpk;
  
  final byte[] nonce;
  
  final byte[] t;
  
  final byte[] rho;
  
  public KyberPrivateKeyParameters(KyberParameters paramKyberParameters, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5) {
    super(true, paramKyberParameters);
    this.s = Arrays.clone(paramArrayOfbyte1);
    this.hpk = Arrays.clone(paramArrayOfbyte2);
    this.nonce = Arrays.clone(paramArrayOfbyte3);
    this.t = Arrays.clone(paramArrayOfbyte4);
    this.rho = Arrays.clone(paramArrayOfbyte5);
  }
  
  public KyberPrivateKeyParameters(KyberParameters paramKyberParameters, byte[] paramArrayOfbyte) {
    super(true, paramKyberParameters);
    KyberEngine kyberEngine = paramKyberParameters.getEngine();
    int i = 0;
    this.s = Arrays.copyOfRange(paramArrayOfbyte, 0, kyberEngine.getKyberIndCpaSecretKeyBytes());
    i += kyberEngine.getKyberIndCpaSecretKeyBytes();
    this.t = Arrays.copyOfRange(paramArrayOfbyte, i, i + kyberEngine.getKyberIndCpaPublicKeyBytes() - 32);
    i += kyberEngine.getKyberIndCpaPublicKeyBytes() - 32;
    this.rho = Arrays.copyOfRange(paramArrayOfbyte, i, i + 32);
    i += 32;
    this.hpk = Arrays.copyOfRange(paramArrayOfbyte, i, i + 32);
    i += 32;
    this.nonce = Arrays.copyOfRange(paramArrayOfbyte, i, i + 32);
  }
  
  public byte[] getEncoded() {
    return Arrays.concatenate(new byte[][] { this.s, this.t, this.rho, this.hpk, this.nonce });
  }
  
  public byte[] getHPK() {
    return Arrays.clone(this.hpk);
  }
  
  public byte[] getNonce() {
    return Arrays.clone(this.nonce);
  }
  
  public byte[] getPrivateKey() {
    return getEncoded();
  }
  
  public byte[] getPublicKey() {
    return KyberPublicKeyParameters.getEncoded(this.t, this.rho);
  }
  
  public KyberPublicKeyParameters getPublicKeyParameters() {
    return new KyberPublicKeyParameters(getParameters(), this.t, this.rho);
  }
  
  public byte[] getRho() {
    return Arrays.clone(this.rho);
  }
  
  public byte[] getS() {
    return Arrays.clone(this.s);
  }
  
  public byte[] getT() {
    return Arrays.clone(this.t);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\kyber\KyberPrivateKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */