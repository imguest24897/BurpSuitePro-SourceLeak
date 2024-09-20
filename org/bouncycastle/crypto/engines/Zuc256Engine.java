package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Memoable;

public final class Zuc256Engine extends Zuc256CoreEngine {
  public Zuc256Engine() {}
  
  public Zuc256Engine(int paramInt) {
    super(paramInt);
  }
  
  private Zuc256Engine(Zuc256Engine paramZuc256Engine) {
    super(paramZuc256Engine);
  }
  
  public Memoable copy() {
    return new Zuc256Engine(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\Zuc256Engine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */