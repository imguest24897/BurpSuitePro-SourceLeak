package org.bouncycastle.pqc.crypto.lms;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\lms\LMSParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */