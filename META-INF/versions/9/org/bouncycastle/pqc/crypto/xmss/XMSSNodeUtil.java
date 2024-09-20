package META-INF.versions.9.org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.HashTreeAddress;
import org.bouncycastle.pqc.crypto.xmss.LTreeAddress;
import org.bouncycastle.pqc.crypto.xmss.WOTSPlus;
import org.bouncycastle.pqc.crypto.xmss.WOTSPlusPublicKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSAddress;
import org.bouncycastle.pqc.crypto.xmss.XMSSNode;

class XMSSNodeUtil {
  static XMSSNode lTree(WOTSPlus paramWOTSPlus, WOTSPlusPublicKeyParameters paramWOTSPlusPublicKeyParameters, LTreeAddress paramLTreeAddress) {
    if (paramWOTSPlusPublicKeyParameters == null)
      throw new NullPointerException("publicKey == null"); 
    if (paramLTreeAddress == null)
      throw new NullPointerException("address == null"); 
    int i = paramWOTSPlus.getParams().getLen();
    byte[][] arrayOfByte = paramWOTSPlusPublicKeyParameters.toByteArray();
    XMSSNode[] arrayOfXMSSNode = new XMSSNode[arrayOfByte.length];
    byte b;
    for (b = 0; b < arrayOfByte.length; b++)
      arrayOfXMSSNode[b] = new XMSSNode(0, arrayOfByte[b]); 
    for (paramLTreeAddress = (LTreeAddress)((LTreeAddress.Builder)((LTreeAddress.Builder)((LTreeAddress.Builder)(new LTreeAddress.Builder()).withLayerAddress(paramLTreeAddress.getLayerAddress())).withTreeAddress(paramLTreeAddress.getTreeAddress())).withLTreeAddress(paramLTreeAddress.getLTreeAddress()).withTreeHeight(0).withTreeIndex(paramLTreeAddress.getTreeIndex()).withKeyAndMask(paramLTreeAddress.getKeyAndMask())).build(); i > 1; paramLTreeAddress = (LTreeAddress)((LTreeAddress.Builder)((LTreeAddress.Builder)((LTreeAddress.Builder)(new LTreeAddress.Builder()).withLayerAddress(paramLTreeAddress.getLayerAddress())).withTreeAddress(paramLTreeAddress.getTreeAddress())).withLTreeAddress(paramLTreeAddress.getLTreeAddress()).withTreeHeight(paramLTreeAddress.getTreeHeight() + 1).withTreeIndex(paramLTreeAddress.getTreeIndex()).withKeyAndMask(paramLTreeAddress.getKeyAndMask())).build()) {
      for (b = 0; b < (int)Math.floor((i / 2)); b++) {
        paramLTreeAddress = (LTreeAddress)((LTreeAddress.Builder)((LTreeAddress.Builder)((LTreeAddress.Builder)(new LTreeAddress.Builder()).withLayerAddress(paramLTreeAddress.getLayerAddress())).withTreeAddress(paramLTreeAddress.getTreeAddress())).withLTreeAddress(paramLTreeAddress.getLTreeAddress()).withTreeHeight(paramLTreeAddress.getTreeHeight()).withTreeIndex(b).withKeyAndMask(paramLTreeAddress.getKeyAndMask())).build();
        arrayOfXMSSNode[b] = randomizeHash(paramWOTSPlus, arrayOfXMSSNode[2 * b], arrayOfXMSSNode[2 * b + 1], (XMSSAddress)paramLTreeAddress);
      } 
      if (i % 2 == 1)
        arrayOfXMSSNode[(int)Math.floor((i / 2))] = arrayOfXMSSNode[i - 1]; 
      i = (int)Math.ceil(i / 2.0D);
    } 
    return arrayOfXMSSNode[0];
  }
  
  static XMSSNode randomizeHash(WOTSPlus paramWOTSPlus, XMSSNode paramXMSSNode1, XMSSNode paramXMSSNode2, XMSSAddress paramXMSSAddress) {
    LTreeAddress lTreeAddress3;
    HashTreeAddress hashTreeAddress3;
    LTreeAddress lTreeAddress2;
    HashTreeAddress hashTreeAddress2;
    LTreeAddress lTreeAddress1;
    HashTreeAddress hashTreeAddress1;
    if (paramXMSSNode1 == null)
      throw new NullPointerException("left == null"); 
    if (paramXMSSNode2 == null)
      throw new NullPointerException("right == null"); 
    if (paramXMSSNode1.getHeight() != paramXMSSNode2.getHeight())
      throw new IllegalStateException("height of both nodes must be equal"); 
    if (paramXMSSAddress == null)
      throw new NullPointerException("address == null"); 
    byte[] arrayOfByte1 = paramWOTSPlus.getPublicSeed();
    if (paramXMSSAddress instanceof LTreeAddress) {
      LTreeAddress lTreeAddress = (LTreeAddress)paramXMSSAddress;
      lTreeAddress3 = (LTreeAddress)((LTreeAddress.Builder)((LTreeAddress.Builder)((LTreeAddress.Builder)(new LTreeAddress.Builder()).withLayerAddress(lTreeAddress.getLayerAddress())).withTreeAddress(lTreeAddress.getTreeAddress())).withLTreeAddress(lTreeAddress.getLTreeAddress()).withTreeHeight(lTreeAddress.getTreeHeight()).withTreeIndex(lTreeAddress.getTreeIndex()).withKeyAndMask(0)).build();
    } else if (lTreeAddress3 instanceof HashTreeAddress) {
      HashTreeAddress hashTreeAddress = (HashTreeAddress)lTreeAddress3;
      hashTreeAddress3 = (HashTreeAddress)((HashTreeAddress.Builder)((HashTreeAddress.Builder)((HashTreeAddress.Builder)(new HashTreeAddress.Builder()).withLayerAddress(hashTreeAddress.getLayerAddress())).withTreeAddress(hashTreeAddress.getTreeAddress())).withTreeHeight(hashTreeAddress.getTreeHeight()).withTreeIndex(hashTreeAddress.getTreeIndex()).withKeyAndMask(0)).build();
    } 
    byte[] arrayOfByte2 = paramWOTSPlus.getKhf().PRF(arrayOfByte1, hashTreeAddress3.toByteArray());
    if (hashTreeAddress3 instanceof LTreeAddress) {
      LTreeAddress lTreeAddress = (LTreeAddress)hashTreeAddress3;
      lTreeAddress2 = (LTreeAddress)((LTreeAddress.Builder)((LTreeAddress.Builder)((LTreeAddress.Builder)(new LTreeAddress.Builder()).withLayerAddress(lTreeAddress.getLayerAddress())).withTreeAddress(lTreeAddress.getTreeAddress())).withLTreeAddress(lTreeAddress.getLTreeAddress()).withTreeHeight(lTreeAddress.getTreeHeight()).withTreeIndex(lTreeAddress.getTreeIndex()).withKeyAndMask(1)).build();
    } else if (lTreeAddress2 instanceof HashTreeAddress) {
      HashTreeAddress hashTreeAddress = (HashTreeAddress)lTreeAddress2;
      hashTreeAddress2 = (HashTreeAddress)((HashTreeAddress.Builder)((HashTreeAddress.Builder)((HashTreeAddress.Builder)(new HashTreeAddress.Builder()).withLayerAddress(hashTreeAddress.getLayerAddress())).withTreeAddress(hashTreeAddress.getTreeAddress())).withTreeHeight(hashTreeAddress.getTreeHeight()).withTreeIndex(hashTreeAddress.getTreeIndex()).withKeyAndMask(1)).build();
    } 
    byte[] arrayOfByte3 = paramWOTSPlus.getKhf().PRF(arrayOfByte1, hashTreeAddress2.toByteArray());
    if (hashTreeAddress2 instanceof LTreeAddress) {
      LTreeAddress lTreeAddress = (LTreeAddress)hashTreeAddress2;
      lTreeAddress1 = (LTreeAddress)((LTreeAddress.Builder)((LTreeAddress.Builder)((LTreeAddress.Builder)(new LTreeAddress.Builder()).withLayerAddress(lTreeAddress.getLayerAddress())).withTreeAddress(lTreeAddress.getTreeAddress())).withLTreeAddress(lTreeAddress.getLTreeAddress()).withTreeHeight(lTreeAddress.getTreeHeight()).withTreeIndex(lTreeAddress.getTreeIndex()).withKeyAndMask(2)).build();
    } else if (lTreeAddress1 instanceof HashTreeAddress) {
      HashTreeAddress hashTreeAddress = (HashTreeAddress)lTreeAddress1;
      hashTreeAddress1 = (HashTreeAddress)((HashTreeAddress.Builder)((HashTreeAddress.Builder)((HashTreeAddress.Builder)(new HashTreeAddress.Builder()).withLayerAddress(hashTreeAddress.getLayerAddress())).withTreeAddress(hashTreeAddress.getTreeAddress())).withTreeHeight(hashTreeAddress.getTreeHeight()).withTreeIndex(hashTreeAddress.getTreeIndex()).withKeyAndMask(2)).build();
    } 
    byte[] arrayOfByte4 = paramWOTSPlus.getKhf().PRF(arrayOfByte1, hashTreeAddress1.toByteArray());
    int i = paramWOTSPlus.getParams().getTreeDigestSize();
    byte[] arrayOfByte5 = new byte[2 * i];
    byte b;
    for (b = 0; b < i; b++)
      arrayOfByte5[b] = (byte)(paramXMSSNode1.getValue()[b] ^ arrayOfByte3[b]); 
    for (b = 0; b < i; b++)
      arrayOfByte5[b + i] = (byte)(paramXMSSNode2.getValue()[b] ^ arrayOfByte4[b]); 
    byte[] arrayOfByte6 = paramWOTSPlus.getKhf().H(arrayOfByte2, arrayOfByte5);
    return new XMSSNode(paramXMSSNode1.getHeight(), arrayOfByte6);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\xmss\XMSSNodeUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */