package META-INF.versions.9.org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.pqc.crypto.rainbow.RainbowKeyComputation;
import org.bouncycastle.pqc.crypto.rainbow.RainbowKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowUtil;
import org.bouncycastle.pqc.crypto.rainbow.Version;
import org.bouncycastle.util.Arrays;

public class RainbowPrivateKeyParameters extends RainbowKeyParameters {
  final byte[] sk_seed;
  
  final short[][] s1;
  
  final short[][] t1;
  
  final short[][] t3;
  
  final short[][] t4;
  
  final short[][][] l1_F1;
  
  final short[][][] l1_F2;
  
  final short[][][] l2_F1;
  
  final short[][][] l2_F2;
  
  final short[][][] l2_F3;
  
  final short[][][] l2_F5;
  
  final short[][][] l2_F6;
  
  private final byte[] pk_seed;
  
  private byte[] pk_encoded;
  
  RainbowPrivateKeyParameters(RainbowParameters paramRainbowParameters, byte[] paramArrayOfbyte1, short[][] paramArrayOfshort1, short[][] paramArrayOfshort2, short[][] paramArrayOfshort3, short[][] paramArrayOfshort4, short[][][] paramArrayOfshort5, short[][][] paramArrayOfshort6, short[][][] paramArrayOfshort7, short[][][] paramArrayOfshort8, short[][][] paramArrayOfshort9, short[][][] paramArrayOfshort10, short[][][] paramArrayOfshort11, byte[] paramArrayOfbyte2) {
    super(true, paramRainbowParameters);
    this.pk_seed = null;
    this.pk_encoded = paramArrayOfbyte2;
    this.sk_seed = (byte[])paramArrayOfbyte1.clone();
    this.s1 = RainbowUtil.cloneArray(paramArrayOfshort1);
    this.t1 = RainbowUtil.cloneArray(paramArrayOfshort2);
    this.t3 = RainbowUtil.cloneArray(paramArrayOfshort3);
    this.t4 = RainbowUtil.cloneArray(paramArrayOfshort4);
    this.l1_F1 = RainbowUtil.cloneArray(paramArrayOfshort5);
    this.l1_F2 = RainbowUtil.cloneArray(paramArrayOfshort6);
    this.l2_F1 = RainbowUtil.cloneArray(paramArrayOfshort7);
    this.l2_F2 = RainbowUtil.cloneArray(paramArrayOfshort8);
    this.l2_F3 = RainbowUtil.cloneArray(paramArrayOfshort9);
    this.l2_F5 = RainbowUtil.cloneArray(paramArrayOfshort10);
    this.l2_F6 = RainbowUtil.cloneArray(paramArrayOfshort11);
  }
  
  RainbowPrivateKeyParameters(RainbowParameters paramRainbowParameters, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    super(true, paramRainbowParameters);
    org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters rainbowPrivateKeyParameters = (new RainbowKeyComputation(paramRainbowParameters, paramArrayOfbyte1, paramArrayOfbyte2)).generatePrivateKey();
    this.pk_seed = paramArrayOfbyte1;
    this.pk_encoded = paramArrayOfbyte3;
    this.sk_seed = paramArrayOfbyte2;
    this.s1 = rainbowPrivateKeyParameters.s1;
    this.t1 = rainbowPrivateKeyParameters.t1;
    this.t3 = rainbowPrivateKeyParameters.t3;
    this.t4 = rainbowPrivateKeyParameters.t4;
    this.l1_F1 = rainbowPrivateKeyParameters.l1_F1;
    this.l1_F2 = rainbowPrivateKeyParameters.l1_F2;
    this.l2_F1 = rainbowPrivateKeyParameters.l2_F1;
    this.l2_F2 = rainbowPrivateKeyParameters.l2_F2;
    this.l2_F3 = rainbowPrivateKeyParameters.l2_F3;
    this.l2_F5 = rainbowPrivateKeyParameters.l2_F5;
    this.l2_F6 = rainbowPrivateKeyParameters.l2_F6;
  }
  
  public RainbowPrivateKeyParameters(RainbowParameters paramRainbowParameters, byte[] paramArrayOfbyte) {
    super(true, paramRainbowParameters);
    if (paramRainbowParameters.getVersion() == Version.COMPRESSED) {
      this.pk_seed = Arrays.copyOfRange(paramArrayOfbyte, 0, paramRainbowParameters.getLen_pkseed());
      this.sk_seed = Arrays.copyOfRange(paramArrayOfbyte, paramRainbowParameters.getLen_pkseed(), paramRainbowParameters.getLen_pkseed() + paramRainbowParameters.getLen_skseed());
      org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters rainbowPrivateKeyParameters = (new RainbowKeyComputation(paramRainbowParameters, this.pk_seed, this.sk_seed)).generatePrivateKey();
      this.pk_encoded = rainbowPrivateKeyParameters.pk_encoded;
      this.s1 = rainbowPrivateKeyParameters.s1;
      this.t1 = rainbowPrivateKeyParameters.t1;
      this.t3 = rainbowPrivateKeyParameters.t3;
      this.t4 = rainbowPrivateKeyParameters.t4;
      this.l1_F1 = rainbowPrivateKeyParameters.l1_F1;
      this.l1_F2 = rainbowPrivateKeyParameters.l1_F2;
      this.l2_F1 = rainbowPrivateKeyParameters.l2_F1;
      this.l2_F2 = rainbowPrivateKeyParameters.l2_F2;
      this.l2_F3 = rainbowPrivateKeyParameters.l2_F3;
      this.l2_F5 = rainbowPrivateKeyParameters.l2_F5;
      this.l2_F6 = rainbowPrivateKeyParameters.l2_F6;
    } else {
      int i = paramRainbowParameters.getV1();
      int j = paramRainbowParameters.getO1();
      int k = paramRainbowParameters.getO2();
      this.s1 = new short[j][k];
      this.t1 = new short[i][j];
      this.t4 = new short[i][k];
      this.t3 = new short[j][k];
      this.l1_F1 = new short[j][i][i];
      this.l1_F2 = new short[j][i][j];
      this.l2_F1 = new short[k][i][i];
      this.l2_F2 = new short[k][i][j];
      this.l2_F3 = new short[k][i][k];
      this.l2_F5 = new short[k][j][j];
      this.l2_F6 = new short[k][j][k];
      int m = 0;
      this.pk_seed = null;
      this.sk_seed = Arrays.copyOfRange(paramArrayOfbyte, m, paramRainbowParameters.getLen_skseed());
      m += this.sk_seed.length;
      m += RainbowUtil.loadEncoded(this.s1, paramArrayOfbyte, m);
      m += RainbowUtil.loadEncoded(this.t1, paramArrayOfbyte, m);
      m += RainbowUtil.loadEncoded(this.t4, paramArrayOfbyte, m);
      m += RainbowUtil.loadEncoded(this.t3, paramArrayOfbyte, m);
      m += RainbowUtil.loadEncoded(this.l1_F1, paramArrayOfbyte, m, true);
      m += RainbowUtil.loadEncoded(this.l1_F2, paramArrayOfbyte, m, false);
      m += RainbowUtil.loadEncoded(this.l2_F1, paramArrayOfbyte, m, true);
      m += RainbowUtil.loadEncoded(this.l2_F2, paramArrayOfbyte, m, false);
      m += RainbowUtil.loadEncoded(this.l2_F3, paramArrayOfbyte, m, false);
      m += RainbowUtil.loadEncoded(this.l2_F5, paramArrayOfbyte, m, true);
      m += RainbowUtil.loadEncoded(this.l2_F6, paramArrayOfbyte, m, false);
      this.pk_encoded = Arrays.copyOfRange(paramArrayOfbyte, m, paramArrayOfbyte.length);
    } 
  }
  
  byte[] getSk_seed() {
    return Arrays.clone(this.sk_seed);
  }
  
  short[][] getS1() {
    return RainbowUtil.cloneArray(this.s1);
  }
  
  short[][] getT1() {
    return RainbowUtil.cloneArray(this.t1);
  }
  
  short[][] getT4() {
    return RainbowUtil.cloneArray(this.t4);
  }
  
  short[][] getT3() {
    return RainbowUtil.cloneArray(this.t3);
  }
  
  short[][][] getL1_F1() {
    return RainbowUtil.cloneArray(this.l1_F1);
  }
  
  short[][][] getL1_F2() {
    return RainbowUtil.cloneArray(this.l1_F2);
  }
  
  short[][][] getL2_F1() {
    return RainbowUtil.cloneArray(this.l2_F1);
  }
  
  short[][][] getL2_F2() {
    return RainbowUtil.cloneArray(this.l2_F2);
  }
  
  short[][][] getL2_F3() {
    return RainbowUtil.cloneArray(this.l2_F3);
  }
  
  short[][][] getL2_F5() {
    return RainbowUtil.cloneArray(this.l2_F5);
  }
  
  short[][][] getL2_F6() {
    return RainbowUtil.cloneArray(this.l2_F6);
  }
  
  public byte[] getPrivateKey() {
    if (getParameters().getVersion() == Version.COMPRESSED)
      return Arrays.concatenate(this.pk_seed, this.sk_seed); 
    null = this.sk_seed;
    null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.s1));
    null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.t1));
    null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.t4));
    null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.t3));
    null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.l1_F1, true));
    null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.l1_F2, false));
    null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.l2_F1, true));
    null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.l2_F2, false));
    null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.l2_F3, false));
    null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.l2_F5, true));
    return Arrays.concatenate(null, RainbowUtil.getEncoded(this.l2_F6, false));
  }
  
  public byte[] getEncoded() {
    return (getParameters().getVersion() == Version.COMPRESSED) ? Arrays.concatenate(this.pk_seed, this.sk_seed) : Arrays.concatenate(getPrivateKey(), this.pk_encoded);
  }
  
  public byte[] getPublicKey() {
    return this.pk_encoded;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\rainbow\RainbowPrivateKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */