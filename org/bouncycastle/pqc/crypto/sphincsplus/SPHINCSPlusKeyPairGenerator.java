package org.bouncycastle.pqc.crypto.sphincsplus;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class SPHINCSPlusKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private SecureRandom random;
  
  private SPHINCSPlusParameters parameters;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.random = paramKeyGenerationParameters.getRandom();
    this.parameters = ((SPHINCSPlusKeyGenerationParameters)paramKeyGenerationParameters).getParameters();
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    byte[] arrayOfByte;
    SK sK;
    SPHINCSPlusEngine sPHINCSPlusEngine = this.parameters.getEngine();
    if (sPHINCSPlusEngine instanceof SPHINCSPlusEngine.HarakaSEngine) {
      byte[] arrayOfByte1 = sec_rand(sPHINCSPlusEngine.N * 3);
      byte[] arrayOfByte2 = new byte[sPHINCSPlusEngine.N];
      byte[] arrayOfByte3 = new byte[sPHINCSPlusEngine.N];
      arrayOfByte = new byte[sPHINCSPlusEngine.N];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, sPHINCSPlusEngine.N);
      System.arraycopy(arrayOfByte1, sPHINCSPlusEngine.N, arrayOfByte3, 0, sPHINCSPlusEngine.N);
      System.arraycopy(arrayOfByte1, sPHINCSPlusEngine.N << 1, arrayOfByte, 0, sPHINCSPlusEngine.N);
      sK = new SK(arrayOfByte2, arrayOfByte3);
    } else {
      sK = new SK(sec_rand(sPHINCSPlusEngine.N), sec_rand(sPHINCSPlusEngine.N));
      arrayOfByte = sec_rand(sPHINCSPlusEngine.N);
    } 
    sPHINCSPlusEngine.init(arrayOfByte);
    PK pK = new PK(arrayOfByte, (new HT(sPHINCSPlusEngine, sK.seed, arrayOfByte)).htPubKey);
    return new AsymmetricCipherKeyPair(new SPHINCSPlusPublicKeyParameters(this.parameters, pK), new SPHINCSPlusPrivateKeyParameters(this.parameters, sK, pK));
  }
  
  private byte[] sec_rand(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    this.random.nextBytes(arrayOfByte);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincsplus\SPHINCSPlusKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */