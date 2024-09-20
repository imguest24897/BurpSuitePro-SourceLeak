package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.params.SkeinParameters;
import org.bouncycastle.util.Memoable;

public class SkeinDigest implements ExtendedDigest, Memoable {
  public static final int SKEIN_256 = 256;
  
  public static final int SKEIN_512 = 512;
  
  public static final int SKEIN_1024 = 1024;
  
  private final CryptoServicePurpose purpose;
  
  private SkeinEngine engine;
  
  public SkeinDigest(int paramInt1, int paramInt2) {
    this(paramInt1, paramInt2, CryptoServicePurpose.ANY);
  }
  
  public SkeinDigest(int paramInt1, int paramInt2, CryptoServicePurpose paramCryptoServicePurpose) {
    this.engine = new SkeinEngine(paramInt1, paramInt2);
    this.purpose = paramCryptoServicePurpose;
    init(null);
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties((Digest)this, getDigestSize() * 4, paramCryptoServicePurpose));
  }
  
  public SkeinDigest(SkeinDigest paramSkeinDigest) {
    this.engine = new SkeinEngine(paramSkeinDigest.engine);
    this.purpose = paramSkeinDigest.purpose;
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties((Digest)this, paramSkeinDigest.getDigestSize() * 4, this.purpose));
  }
  
  public void reset(Memoable paramMemoable) {
    SkeinDigest skeinDigest = (SkeinDigest)paramMemoable;
    this.engine.reset(skeinDigest.engine);
  }
  
  public Memoable copy() {
    return new SkeinDigest(this);
  }
  
  public String getAlgorithmName() {
    return "Skein-" + (this.engine.getBlockSize() * 8) + "-" + (this.engine.getOutputSize() * 8);
  }
  
  public int getDigestSize() {
    return this.engine.getOutputSize();
  }
  
  public int getByteLength() {
    return this.engine.getBlockSize();
  }
  
  public void init(SkeinParameters paramSkeinParameters) {
    this.engine.init(paramSkeinParameters);
  }
  
  public void reset() {
    this.engine.reset();
  }
  
  public void update(byte paramByte) {
    this.engine.update(paramByte);
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.engine.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    return this.engine.doFinal(paramArrayOfbyte, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\SkeinDigest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */