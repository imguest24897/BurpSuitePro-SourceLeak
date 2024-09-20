package org.bouncycastle.pqc.crypto.picnic;

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
  
  public static class Proof {
    final byte[] seed1;
    
    final byte[] seed2;
    
    final int[] inputShare;
    
    final byte[] communicatedBits;
    
    final byte[] view3Commitment;
    
    final byte[] view3UnruhG;
    
    Proof(PicnicEngine param1PicnicEngine) {
      this.seed1 = new byte[param1PicnicEngine.seedSizeBytes];
      this.seed2 = new byte[param1PicnicEngine.seedSizeBytes];
      this.inputShare = new int[param1PicnicEngine.stateSizeWords];
      this.communicatedBits = new byte[param1PicnicEngine.andSizeBytes];
      this.view3Commitment = new byte[param1PicnicEngine.digestSizeBytes];
      if (param1PicnicEngine.UnruhGWithInputBytes > 0) {
        this.view3UnruhG = new byte[param1PicnicEngine.UnruhGWithInputBytes];
      } else {
        this.view3UnruhG = null;
      } 
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\picnic\Signature.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */