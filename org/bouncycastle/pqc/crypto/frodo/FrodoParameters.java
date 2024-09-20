package org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.KEMParameters;

public class FrodoParameters implements KEMParameters {
  private static final short[] cdf_table640 = new short[] { 
      4643, 13363, 20579, 25843, 29227, 31145, 32103, 32525, 32689, 32745, 
      32762, 32766, Short.MAX_VALUE };
  
  private static final short[] cdf_table976 = new short[] { 
      5638, 15915, 23689, 28571, 31116, 32217, 32613, 32731, 32760, 32766, 
      Short.MAX_VALUE };
  
  private static final short[] cdf_table1344 = new short[] { 9142, 23462, 30338, 32361, 32725, 32765, Short.MAX_VALUE };
  
  public static final FrodoParameters frodokem640aes = new FrodoParameters("frodokem640aes", 640, 15, 2, cdf_table640, (Xof)new SHAKEDigest(128), new FrodoMatrixGenerator.Aes128MatrixGenerator(640, 32768));
  
  public static final FrodoParameters frodokem640shake = new FrodoParameters("frodokem640shake", 640, 15, 2, cdf_table640, (Xof)new SHAKEDigest(128), new FrodoMatrixGenerator.Shake128MatrixGenerator(640, 32768));
  
  public static final FrodoParameters frodokem976aes = new FrodoParameters("frodokem976aes", 976, 16, 3, cdf_table976, (Xof)new SHAKEDigest(256), new FrodoMatrixGenerator.Aes128MatrixGenerator(976, 65536));
  
  public static final FrodoParameters frodokem976shake = new FrodoParameters("frodokem976shake", 976, 16, 3, cdf_table976, (Xof)new SHAKEDigest(256), new FrodoMatrixGenerator.Shake128MatrixGenerator(976, 65536));
  
  public static final FrodoParameters frodokem1344aes = new FrodoParameters("frodokem1344aes", 1344, 16, 4, cdf_table1344, (Xof)new SHAKEDigest(256), new FrodoMatrixGenerator.Aes128MatrixGenerator(1344, 65536));
  
  public static final FrodoParameters frodokem1344shake = new FrodoParameters("frodokem1344shake", 1344, 16, 4, cdf_table1344, (Xof)new SHAKEDigest(256), new FrodoMatrixGenerator.Shake128MatrixGenerator(1344, 65536));
  
  private final String name;
  
  private final int n;
  
  private final int D;
  
  private final int B;
  
  private final int defaultKeySize;
  
  private final FrodoEngine engine;
  
  private FrodoParameters(String paramString, int paramInt1, int paramInt2, int paramInt3, short[] paramArrayOfshort, Xof paramXof, FrodoMatrixGenerator paramFrodoMatrixGenerator) {
    this.name = paramString;
    this.n = paramInt1;
    this.D = paramInt2;
    this.B = paramInt3;
    this.defaultKeySize = paramInt3 * 8 * 8;
    this.engine = new FrodoEngine(paramInt1, paramInt2, paramInt3, paramArrayOfshort, paramXof, paramFrodoMatrixGenerator);
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getSessionKeySize() {
    return this.defaultKeySize;
  }
  
  FrodoEngine getEngine() {
    return this.engine;
  }
  
  int getN() {
    return this.n;
  }
  
  int getD() {
    return this.D;
  }
  
  int getB() {
    return this.B;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\frodo\FrodoParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */