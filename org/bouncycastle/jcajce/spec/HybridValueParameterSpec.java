package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;
import org.bouncycastle.util.Arrays;

public class HybridValueParameterSpec implements AlgorithmParameterSpec, Destroyable {
  private final AtomicBoolean hasBeenDestroyed = new AtomicBoolean(false);
  
  private final boolean doPrepend;
  
  private volatile byte[] t;
  
  private volatile AlgorithmParameterSpec baseSpec;
  
  public HybridValueParameterSpec(byte[] paramArrayOfbyte, AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    this(paramArrayOfbyte, false, paramAlgorithmParameterSpec);
  }
  
  public HybridValueParameterSpec(byte[] paramArrayOfbyte, boolean paramBoolean, AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    this.t = paramArrayOfbyte;
    this.baseSpec = paramAlgorithmParameterSpec;
    this.doPrepend = paramBoolean;
  }
  
  public boolean isPrependedT() {
    return this.doPrepend;
  }
  
  public byte[] getT() {
    byte[] arrayOfByte = this.t;
    checkDestroyed();
    return arrayOfByte;
  }
  
  public AlgorithmParameterSpec getBaseParameterSpec() {
    AlgorithmParameterSpec algorithmParameterSpec = this.baseSpec;
    checkDestroyed();
    return algorithmParameterSpec;
  }
  
  public boolean isDestroyed() {
    return this.hasBeenDestroyed.get();
  }
  
  public void destroy() {
    if (!this.hasBeenDestroyed.getAndSet(true)) {
      Arrays.clear(this.t);
      this.t = null;
      this.baseSpec = null;
    } 
  }
  
  private void checkDestroyed() {
    if (isDestroyed())
      throw new IllegalStateException("spec has been destroyed"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\spec\HybridValueParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */