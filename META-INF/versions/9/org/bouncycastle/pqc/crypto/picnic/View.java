package META-INF.versions.9.org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

class View {
  final int[] inputShare;
  
  final byte[] communicatedBits;
  
  final int[] outputShare;
  
  public View(PicnicEngine paramPicnicEngine) {
    this.inputShare = new int[paramPicnicEngine.stateSizeWords];
    this.communicatedBits = new byte[paramPicnicEngine.andSizeBytes];
    this.outputShare = new int[paramPicnicEngine.stateSizeWords];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\picnic\View.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */