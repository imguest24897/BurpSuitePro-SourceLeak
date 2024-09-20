package META-INF.versions.9.org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;

public class LMSParameters {
  private final LMSigParameters lmSigParam;
  
  private final LMOtsParameters lmOTSParam;
  
  public LMSParameters(LMSigParameters paramLMSigParameters, LMOtsParameters paramLMOtsParameters) {
    this.lmSigParam = paramLMSigParameters;
    this.lmOTSParam = paramLMOtsParameters;
  }
  
  public LMSigParameters getLMSigParam() {
    return this.lmSigParam;
  }
  
  public LMOtsParameters getLMOTSParam() {
    return this.lmOTSParam;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\lms\LMSParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */