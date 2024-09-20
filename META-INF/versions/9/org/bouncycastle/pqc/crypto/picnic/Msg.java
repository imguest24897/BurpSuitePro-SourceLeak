package META-INF.versions.9.org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

class Msg {
  byte[][] msgs;
  
  int pos;
  
  int unopened;
  
  public Msg(PicnicEngine paramPicnicEngine) {
    this.msgs = new byte[paramPicnicEngine.numMPCParties][paramPicnicEngine.andSizeBytes];
    this.pos = 0;
    this.unopened = -1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\picnic\Msg.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */