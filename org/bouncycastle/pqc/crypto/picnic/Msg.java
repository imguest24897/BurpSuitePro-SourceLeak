package org.bouncycastle.pqc.crypto.picnic;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\picnic\Msg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */