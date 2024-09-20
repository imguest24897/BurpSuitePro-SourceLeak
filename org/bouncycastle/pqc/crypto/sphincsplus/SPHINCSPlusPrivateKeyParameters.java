package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;

public class SPHINCSPlusPrivateKeyParameters extends SPHINCSPlusKeyParameters {
  final SK sk;
  
  final PK pk;
  
  public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters paramSPHINCSPlusParameters, byte[] paramArrayOfbyte) {
    super(true, paramSPHINCSPlusParameters);
    int i = paramSPHINCSPlusParameters.getN();
    if (paramArrayOfbyte.length != 4 * i)
      throw new IllegalArgumentException("private key encoding does not match parameters"); 
    this.sk = new SK(Arrays.copyOfRange(paramArrayOfbyte, 0, i), Arrays.copyOfRange(paramArrayOfbyte, i, 2 * i));
    this.pk = new PK(Arrays.copyOfRange(paramArrayOfbyte, 2 * i, 3 * i), Arrays.copyOfRange(paramArrayOfbyte, 3 * i, 4 * i));
  }
  
  public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters paramSPHINCSPlusParameters, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    super(true, paramSPHINCSPlusParameters);
    this.sk = new SK(paramArrayOfbyte1, paramArrayOfbyte2);
    this.pk = new PK(paramArrayOfbyte3, paramArrayOfbyte4);
  }
  
  SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters paramSPHINCSPlusParameters, SK paramSK, PK paramPK) {
    super(true, paramSPHINCSPlusParameters);
    this.sk = paramSK;
    this.pk = paramPK;
  }
  
  public byte[] getSeed() {
    return Arrays.clone(this.sk.seed);
  }
  
  public byte[] getPrf() {
    return Arrays.clone(this.sk.prf);
  }
  
  public byte[] getPublicSeed() {
    return Arrays.clone(this.pk.seed);
  }
  
  public byte[] getRoot() {
    return Arrays.clone(this.pk.root);
  }
  
  public byte[] getPublicKey() {
    return Arrays.concatenate(this.pk.seed, this.pk.root);
  }
  
  public byte[] getEncoded() {
    return Arrays.concatenate(new byte[][] { this.sk.seed, this.sk.prf, this.pk.seed, this.pk.root });
  }
  
  public byte[] getEncodedPublicKey() {
    return Arrays.concatenate(this.pk.seed, this.pk.root);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincsplus\SPHINCSPlusPrivateKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */