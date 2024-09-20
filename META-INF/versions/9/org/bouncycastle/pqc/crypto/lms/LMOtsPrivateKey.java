package META-INF.versions.9.org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.lms.DigestUtil;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSContext;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import org.bouncycastle.pqc.crypto.lms.LmsUtils;
import org.bouncycastle.pqc.crypto.lms.SeedDerive;

class LMOtsPrivateKey {
  private final LMOtsParameters parameter;
  
  private final byte[] I;
  
  private final int q;
  
  private final byte[] masterSecret;
  
  LMOtsPrivateKey(LMOtsParameters paramLMOtsParameters, byte[] paramArrayOfbyte1, int paramInt, byte[] paramArrayOfbyte2) {
    this.parameter = paramLMOtsParameters;
    this.I = paramArrayOfbyte1;
    this.q = paramInt;
    this.masterSecret = paramArrayOfbyte2;
  }
  
  LMSContext getSignatureContext(LMSigParameters paramLMSigParameters, byte[][] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[this.parameter.getN()];
    SeedDerive seedDerive = getDerivationFunction();
    seedDerive.setJ(-3);
    seedDerive.deriveSeed(arrayOfByte, false);
    Digest digest = DigestUtil.getDigest(this.parameter);
    LmsUtils.byteArray(getI(), digest);
    LmsUtils.u32str(getQ(), digest);
    LmsUtils.u16str((short)-32383, digest);
    LmsUtils.byteArray(arrayOfByte, digest);
    return new LMSContext(this, paramLMSigParameters, digest, arrayOfByte, paramArrayOfbyte);
  }
  
  SeedDerive getDerivationFunction() {
    SeedDerive seedDerive = new SeedDerive(this.I, this.masterSecret, DigestUtil.getDigest(this.parameter));
    seedDerive.setQ(this.q);
    return seedDerive;
  }
  
  public LMOtsParameters getParameter() {
    return this.parameter;
  }
  
  public byte[] getI() {
    return this.I;
  }
  
  public int getQ() {
    return this.q;
  }
  
  public byte[] getMasterSecret() {
    return this.masterSecret;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\lms\LMOtsPrivateKey.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */