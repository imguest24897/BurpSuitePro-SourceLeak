package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.crypto.KEMParameters;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPS2048509;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPS2048677;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPS40961229;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPS4096821;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSS1373;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSS701;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;

public class NTRUParameters implements KEMParameters {
  public static final NTRUParameters ntruhps2048509 = new NTRUParameters("ntruhps2048509", (NTRUParameterSet)new NTRUHPS2048509());
  
  public static final NTRUParameters ntruhps2048677 = new NTRUParameters("ntruhps2048677", (NTRUParameterSet)new NTRUHPS2048677());
  
  public static final NTRUParameters ntruhps4096821 = new NTRUParameters("ntruhps4096821", (NTRUParameterSet)new NTRUHPS4096821());
  
  public static final NTRUParameters ntruhps40961229 = new NTRUParameters("ntruhps40961229", (NTRUParameterSet)new NTRUHPS40961229());
  
  public static final NTRUParameters ntruhrss701 = new NTRUParameters("ntruhrss701", (NTRUParameterSet)new NTRUHRSS701());
  
  public static final NTRUParameters ntruhrss1373 = new NTRUParameters("ntruhrss1373", (NTRUParameterSet)new NTRUHRSS1373());
  
  private final String name;
  
  final NTRUParameterSet parameterSet;
  
  private NTRUParameters(String paramString, NTRUParameterSet paramNTRUParameterSet) {
    this.name = paramString;
    this.parameterSet = paramNTRUParameterSet;
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getSessionKeySize() {
    return this.parameterSet.sharedKeyBytes() * 8;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntru\NTRUParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */