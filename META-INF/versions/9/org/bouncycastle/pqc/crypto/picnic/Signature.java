package META-INF.versions.9.org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.crypto.picnic.Utils;

class Signature {
  final byte[] challengeBits;
  
  final byte[] salt = new byte[32];
  
  final Proof[] proofs;
  
  Signature(PicnicEngine paramPicnicEngine) {
    this.challengeBits = new byte[Utils.numBytes(paramPicnicEngine.numMPCRounds * 2)];
    this.proofs = new Proof[paramPicnicEngine.numMPCRounds];
    for (byte b = 0; b < this.proofs.length; b++)
      this.proofs[b] = new Proof(paramPicnicEngine); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\picnic\Signature.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */