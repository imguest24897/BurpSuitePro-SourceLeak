package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.util.Arrays;

public class DilithiumPrivateKeyParameters extends DilithiumKeyParameters {
  final byte[] rho;
  
  final byte[] k;
  
  final byte[] tr;
  
  final byte[] s1;
  
  final byte[] s2;
  
  final byte[] t0;
  
  private final byte[] t1;
  
  public DilithiumPrivateKeyParameters(DilithiumParameters paramDilithiumParameters, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5, byte[] paramArrayOfbyte6, byte[] paramArrayOfbyte7) {
    super(true, paramDilithiumParameters);
    this.rho = Arrays.clone(paramArrayOfbyte1);
    this.k = Arrays.clone(paramArrayOfbyte2);
    this.tr = Arrays.clone(paramArrayOfbyte3);
    this.s1 = Arrays.clone(paramArrayOfbyte4);
    this.s2 = Arrays.clone(paramArrayOfbyte5);
    this.t0 = Arrays.clone(paramArrayOfbyte6);
    this.t1 = Arrays.clone(paramArrayOfbyte7);
  }
  
  public DilithiumPrivateKeyParameters(DilithiumParameters paramDilithiumParameters, byte[] paramArrayOfbyte, DilithiumPublicKeyParameters paramDilithiumPublicKeyParameters) {
    super(true, paramDilithiumParameters);
    DilithiumEngine dilithiumEngine = paramDilithiumParameters.getEngine(null);
    int i = 0;
    this.rho = Arrays.copyOfRange(paramArrayOfbyte, 0, 32);
    i += true;
    this.k = Arrays.copyOfRange(paramArrayOfbyte, i, i + 32);
    i += 32;
    this.tr = Arrays.copyOfRange(paramArrayOfbyte, i, i + 64);
    i += 64;
    int j = dilithiumEngine.getDilithiumL() * dilithiumEngine.getDilithiumPolyEtaPackedBytes();
    this.s1 = Arrays.copyOfRange(paramArrayOfbyte, i, i + j);
    i += j;
    j = dilithiumEngine.getDilithiumK() * dilithiumEngine.getDilithiumPolyEtaPackedBytes();
    this.s2 = Arrays.copyOfRange(paramArrayOfbyte, i, i + j);
    i += j;
    j = dilithiumEngine.getDilithiumK() * 416;
    this.t0 = Arrays.copyOfRange(paramArrayOfbyte, i, i + j);
    i += j;
    if (paramDilithiumPublicKeyParameters != null) {
      this.t1 = paramDilithiumPublicKeyParameters.getT1();
    } else {
      this.t1 = null;
    } 
  }
  
  public byte[] getEncoded() {
    return Arrays.concatenate(new byte[][] { this.rho, this.k, this.tr, this.s1, this.s2, this.t0 });
  }
  
  public byte[] getK() {
    return Arrays.clone(this.k);
  }
  
  public byte[] getPrivateKey() {
    return getEncoded();
  }
  
  public byte[] getPublicKey() {
    return DilithiumPublicKeyParameters.getEncoded(this.rho, this.t1);
  }
  
  public DilithiumPublicKeyParameters getPublicKeyParameters() {
    return new DilithiumPublicKeyParameters(getParameters(), this.rho, this.t1);
  }
  
  public byte[] getRho() {
    return Arrays.clone(this.rho);
  }
  
  public byte[] getS1() {
    return Arrays.clone(this.s1);
  }
  
  public byte[] getS2() {
    return Arrays.clone(this.s2);
  }
  
  public byte[] getT0() {
    return Arrays.clone(this.t0);
  }
  
  public byte[] getT1() {
    return Arrays.clone(this.t1);
  }
  
  public byte[] getTr() {
    return Arrays.clone(this.tr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\dilithium\DilithiumPrivateKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */