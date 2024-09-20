package META-INF.versions.9.org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.pqc.crypto.sphincsplus.ADRS;
import org.bouncycastle.pqc.crypto.sphincsplus.IndexedDigest;

abstract class SPHINCSPlusEngine {
  @Deprecated
  final boolean robust;
  
  final int N;
  
  final int WOTS_W;
  
  final int WOTS_LOGW;
  
  final int WOTS_LEN;
  
  final int WOTS_LEN1;
  
  final int WOTS_LEN2;
  
  final int D;
  
  final int A;
  
  final int K;
  
  final int H;
  
  final int H_PRIME;
  
  final int T;
  
  public SPHINCSPlusEngine(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.N = paramInt1;
    if (paramInt2 == 16) {
      this.WOTS_LOGW = 4;
      this.WOTS_LEN1 = 8 * this.N / this.WOTS_LOGW;
      if (this.N <= 8) {
        this.WOTS_LEN2 = 2;
      } else if (this.N <= 136) {
        this.WOTS_LEN2 = 3;
      } else if (this.N <= 256) {
        this.WOTS_LEN2 = 4;
      } else {
        throw new IllegalArgumentException("cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}");
      } 
    } else if (paramInt2 == 256) {
      this.WOTS_LOGW = 8;
      this.WOTS_LEN1 = 8 * this.N / this.WOTS_LOGW;
      if (this.N <= 1) {
        this.WOTS_LEN2 = 1;
      } else if (this.N <= 256) {
        this.WOTS_LEN2 = 2;
      } else {
        throw new IllegalArgumentException("cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}");
      } 
    } else {
      throw new IllegalArgumentException("wots_w assumed 16 or 256");
    } 
    this.WOTS_W = paramInt2;
    this.WOTS_LEN = this.WOTS_LEN1 + this.WOTS_LEN2;
    this.robust = paramBoolean;
    this.D = paramInt3;
    this.A = paramInt4;
    this.K = paramInt5;
    this.H = paramInt6;
    this.H_PRIME = paramInt6 / paramInt3;
    this.T = 1 << paramInt4;
  }
  
  abstract void init(byte[] paramArrayOfbyte);
  
  abstract byte[] F(byte[] paramArrayOfbyte1, ADRS paramADRS, byte[] paramArrayOfbyte2);
  
  abstract byte[] H(byte[] paramArrayOfbyte1, ADRS paramADRS, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3);
  
  abstract IndexedDigest H_msg(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4);
  
  abstract byte[] T_l(byte[] paramArrayOfbyte1, ADRS paramADRS, byte[] paramArrayOfbyte2);
  
  abstract byte[] PRF(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, ADRS paramADRS);
  
  abstract byte[] PRF_msg(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\sphincsplus\SPHINCSPlusEngine.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */