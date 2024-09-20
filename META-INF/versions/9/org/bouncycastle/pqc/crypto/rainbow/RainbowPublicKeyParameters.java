package META-INF.versions.9.org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.pqc.crypto.rainbow.RainbowKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowUtil;
import org.bouncycastle.pqc.crypto.rainbow.Version;
import org.bouncycastle.util.Arrays;

public class RainbowPublicKeyParameters extends RainbowKeyParameters {
  short[][][] pk;
  
  byte[] pk_seed;
  
  short[][][] l1_Q3;
  
  short[][][] l1_Q5;
  
  short[][][] l1_Q6;
  
  short[][][] l1_Q9;
  
  short[][][] l2_Q9;
  
  RainbowPublicKeyParameters(RainbowParameters paramRainbowParameters, short[][][] paramArrayOfshort1, short[][][] paramArrayOfshort2, short[][][] paramArrayOfshort3, short[][][] paramArrayOfshort4, short[][][] paramArrayOfshort5, short[][][] paramArrayOfshort6, short[][][] paramArrayOfshort7, short[][][] paramArrayOfshort8, short[][][] paramArrayOfshort9, short[][][] paramArrayOfshort10, short[][][] paramArrayOfshort11, short[][][] paramArrayOfshort12) {
    super(false, paramRainbowParameters);
    int i = paramRainbowParameters.getV1();
    int j = paramRainbowParameters.getO1();
    int k = paramRainbowParameters.getO2();
    this.pk = new short[paramRainbowParameters.getM()][paramRainbowParameters.getN()][paramRainbowParameters.getN()];
    byte b;
    for (b = 0; b < j; b++) {
      byte b1;
      for (b1 = 0; b1 < i; b1++) {
        System.arraycopy(paramArrayOfshort1[b][b1], 0, this.pk[b][b1], 0, i);
        System.arraycopy(paramArrayOfshort2[b][b1], 0, this.pk[b][b1], i, j);
        System.arraycopy(paramArrayOfshort3[b][b1], 0, this.pk[b][b1], i + j, k);
      } 
      for (b1 = 0; b1 < j; b1++) {
        System.arraycopy(paramArrayOfshort4[b][b1], 0, this.pk[b][b1 + i], i, j);
        System.arraycopy(paramArrayOfshort5[b][b1], 0, this.pk[b][b1 + i], i + j, k);
      } 
      for (b1 = 0; b1 < k; b1++)
        System.arraycopy(paramArrayOfshort6[b][b1], 0, this.pk[b][b1 + i + j], i + j, k); 
    } 
    for (b = 0; b < k; b++) {
      byte b1;
      for (b1 = 0; b1 < i; b1++) {
        System.arraycopy(paramArrayOfshort7[b][b1], 0, this.pk[b + j][b1], 0, i);
        System.arraycopy(paramArrayOfshort8[b][b1], 0, this.pk[b + j][b1], i, j);
        System.arraycopy(paramArrayOfshort9[b][b1], 0, this.pk[b + j][b1], i + j, k);
      } 
      for (b1 = 0; b1 < j; b1++) {
        System.arraycopy(paramArrayOfshort10[b][b1], 0, this.pk[b + j][b1 + i], i, j);
        System.arraycopy(paramArrayOfshort11[b][b1], 0, this.pk[b + j][b1 + i], i + j, k);
      } 
      for (b1 = 0; b1 < k; b1++)
        System.arraycopy(paramArrayOfshort12[b][b1], 0, this.pk[b + j][b1 + i + j], i + j, k); 
    } 
  }
  
  RainbowPublicKeyParameters(RainbowParameters paramRainbowParameters, byte[] paramArrayOfbyte, short[][][] paramArrayOfshort1, short[][][] paramArrayOfshort2, short[][][] paramArrayOfshort3, short[][][] paramArrayOfshort4, short[][][] paramArrayOfshort5) {
    super(false, paramRainbowParameters);
    this.pk_seed = (byte[])paramArrayOfbyte.clone();
    this.l1_Q3 = RainbowUtil.cloneArray(paramArrayOfshort1);
    this.l1_Q5 = RainbowUtil.cloneArray(paramArrayOfshort2);
    this.l1_Q6 = RainbowUtil.cloneArray(paramArrayOfshort3);
    this.l1_Q9 = RainbowUtil.cloneArray(paramArrayOfshort4);
    this.l2_Q9 = RainbowUtil.cloneArray(paramArrayOfshort5);
  }
  
  public RainbowPublicKeyParameters(RainbowParameters paramRainbowParameters, byte[] paramArrayOfbyte) {
    super(false, paramRainbowParameters);
    int i = paramRainbowParameters.getM();
    int j = paramRainbowParameters.getN();
    if (getParameters().getVersion() == Version.CLASSIC) {
      this.pk = new short[i][j][j];
      byte b1 = 0;
      for (byte b2 = 0; b2 < j; b2++) {
        for (byte b = 0; b < j; b++) {
          for (byte b3 = 0; b3 < i; b3++) {
            if (b2 > b) {
              this.pk[b3][b2][b] = 0;
            } else {
              this.pk[b3][b2][b] = (short)(paramArrayOfbyte[b1] & 0xFF);
              b1++;
            } 
          } 
        } 
      } 
    } else {
      this.pk_seed = Arrays.copyOfRange(paramArrayOfbyte, 0, paramRainbowParameters.getLen_pkseed());
      this.l1_Q3 = new short[paramRainbowParameters.getO1()][paramRainbowParameters.getV1()][paramRainbowParameters.getO2()];
      this.l1_Q5 = new short[paramRainbowParameters.getO1()][paramRainbowParameters.getO1()][paramRainbowParameters.getO1()];
      this.l1_Q6 = new short[paramRainbowParameters.getO1()][paramRainbowParameters.getO1()][paramRainbowParameters.getO2()];
      this.l1_Q9 = new short[paramRainbowParameters.getO1()][paramRainbowParameters.getO2()][paramRainbowParameters.getO2()];
      this.l2_Q9 = new short[paramRainbowParameters.getO2()][paramRainbowParameters.getO2()][paramRainbowParameters.getO2()];
      int k = paramRainbowParameters.getLen_pkseed();
      k += RainbowUtil.loadEncoded(this.l1_Q3, paramArrayOfbyte, k, false);
      k += RainbowUtil.loadEncoded(this.l1_Q5, paramArrayOfbyte, k, true);
      k += RainbowUtil.loadEncoded(this.l1_Q6, paramArrayOfbyte, k, false);
      k += RainbowUtil.loadEncoded(this.l1_Q9, paramArrayOfbyte, k, true);
      k += RainbowUtil.loadEncoded(this.l2_Q9, paramArrayOfbyte, k, true);
      if (k != paramArrayOfbyte.length)
        throw new IllegalArgumentException("unparsed data in key encoding"); 
    } 
  }
  
  public short[][][] getPk() {
    return RainbowUtil.cloneArray(this.pk);
  }
  
  public byte[] getEncoded() {
    if (getParameters().getVersion() != Version.CLASSIC) {
      null = this.pk_seed;
      null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.l1_Q3, false));
      null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.l1_Q5, true));
      null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.l1_Q6, false));
      null = Arrays.concatenate(null, RainbowUtil.getEncoded(this.l1_Q9, true));
      return Arrays.concatenate(null, RainbowUtil.getEncoded(this.l2_Q9, true));
    } 
    return RainbowUtil.getEncoded(this.pk, true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\rainbow\RainbowPublicKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */