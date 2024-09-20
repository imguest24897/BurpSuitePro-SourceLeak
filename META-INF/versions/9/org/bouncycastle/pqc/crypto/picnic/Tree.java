package META-INF.versions.9.org.bouncycastle.pqc.crypto.picnic;

import java.util.logging.Logger;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.crypto.picnic.Utils;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

class Tree {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.pqc.crypto.picnic.Tree.class.getName());
  
  private static final int MAX_SEED_SIZE_BYTES = 32;
  
  private int depth;
  
  byte[][] nodes;
  
  private int dataSize;
  
  private boolean[] haveNode;
  
  private boolean[] exists;
  
  private int numNodes;
  
  private int numLeaves;
  
  private PicnicEngine engine;
  
  protected byte[][] getLeaves() {
    return this.nodes;
  }
  
  protected int getLeavesOffset() {
    return this.numNodes - this.numLeaves;
  }
  
  public Tree(PicnicEngine paramPicnicEngine, int paramInt1, int paramInt2) {
    this.engine = paramPicnicEngine;
    this.depth = Utils.ceil_log2(paramInt1) + 1;
    this.numNodes = (1 << this.depth) - 1 - (1 << this.depth - 1) - paramInt1;
    this.numLeaves = paramInt1;
    this.dataSize = paramInt2;
    this.nodes = new byte[this.numNodes][paramInt2];
    int i;
    for (i = 0; i < this.numNodes; i++)
      this.nodes[i] = new byte[paramInt2]; 
    this.haveNode = new boolean[this.numNodes];
    this.exists = new boolean[this.numNodes];
    Arrays.fill(this.exists, this.numNodes - this.numLeaves, this.numNodes, true);
    for (i = this.numNodes - this.numLeaves; i > 0; i--) {
      if (exists(2 * i + 1) || exists(2 * i + 2))
        this.exists[i] = true; 
    } 
    this.exists[0] = true;
  }
  
  protected void buildMerkleTree(byte[][] paramArrayOfbyte, byte[] paramArrayOfbyte1) {
    int i = this.numNodes - this.numLeaves;
    int j;
    for (j = 0; j < this.numLeaves; j++) {
      if (paramArrayOfbyte[j] != null) {
        System.arraycopy(paramArrayOfbyte[j], 0, this.nodes[i + j], 0, this.dataSize);
        this.haveNode[i + j] = true;
      } 
    } 
    for (j = this.numNodes; j > 0; j--)
      computeParentHash(j, paramArrayOfbyte1); 
  }
  
  protected int verifyMerkleTree(byte[][] paramArrayOfbyte, byte[] paramArrayOfbyte1) {
    int i = this.numNodes - this.numLeaves;
    int j;
    for (j = 0; j < this.numLeaves; j++) {
      if (paramArrayOfbyte[j] != null) {
        if (this.haveNode[i + j])
          return -1; 
        if (paramArrayOfbyte[j] != null) {
          System.arraycopy(paramArrayOfbyte[j], 0, this.nodes[i + j], 0, this.dataSize);
          this.haveNode[i + j] = true;
        } 
      } 
    } 
    for (j = this.numNodes; j > 0; j--)
      computeParentHash(j, paramArrayOfbyte1); 
    return !this.haveNode[0] ? -1 : 0;
  }
  
  protected int reconstructSeeds(int[] paramArrayOfint, int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    boolean bool = false;
    int i = paramInt2;
    int[] arrayOfInt1 = new int[1];
    arrayOfInt1[0] = 0;
    int[] arrayOfInt2 = getRevealedNodes(paramArrayOfint, paramInt1, arrayOfInt1);
    for (byte b = 0; b < arrayOfInt1[0]; b++) {
      i -= this.engine.seedSizeBytes;
      if (i < 0)
        return -1; 
      System.arraycopy(paramArrayOfbyte1, b * this.engine.seedSizeBytes, this.nodes[arrayOfInt2[b]], 0, this.engine.seedSizeBytes);
      this.haveNode[arrayOfInt2[b]] = true;
    } 
    expandSeeds(paramArrayOfbyte2, paramInt3);
    return bool;
  }
  
  protected byte[] openMerkleTree(int[] paramArrayOfint1, int paramInt, int[] paramArrayOfint2) {
    int[] arrayOfInt1 = new int[1];
    int[] arrayOfInt2 = getRevealedMerkleNodes(paramArrayOfint1, paramInt, arrayOfInt1);
    paramArrayOfint2[0] = arrayOfInt1[0] * this.dataSize;
    byte[] arrayOfByte1 = new byte[paramArrayOfint2[0]];
    byte[] arrayOfByte2 = arrayOfByte1;
    for (byte b = 0; b < arrayOfInt1[0]; b++)
      System.arraycopy(this.nodes[arrayOfInt2[b]], 0, arrayOfByte1, b * this.dataSize, this.dataSize); 
    return arrayOfByte2;
  }
  
  private int[] getRevealedNodes(int[] paramArrayOfint1, int paramInt, int[] paramArrayOfint2) {
    int i = this.depth - 1;
    int[][] arrayOfInt = new int[i][paramInt];
    for (byte b1 = 0; b1 < paramInt; b1++) {
      byte b = 0;
      int j = paramArrayOfint1[b1] + this.numNodes - this.numLeaves;
      arrayOfInt[b][b1] = j;
      b++;
      while ((j = getParent(j)) != 0) {
        arrayOfInt[b][b1] = j;
        b++;
      } 
    } 
    int[] arrayOfInt1 = new int[this.numLeaves];
    byte b2 = 0;
    for (byte b3 = 0; b3 < i; b3++) {
      for (byte b = 0; b < paramInt; b++) {
        if (hasSibling(arrayOfInt[b3][b])) {
          int j = getSibling(arrayOfInt[b3][b]);
          if (!contains(arrayOfInt[b3], paramInt, j)) {
            while (!hasRightChild(j) && !isLeafNode(j))
              j = 2 * j + 1; 
            if (!contains(arrayOfInt1, b2, j)) {
              arrayOfInt1[b2] = j;
              b2++;
            } 
          } 
        } 
      } 
    } 
    paramArrayOfint2[0] = b2;
    return arrayOfInt1;
  }
  
  private int getSibling(int paramInt) {
    if (isLeftChild(paramInt)) {
      if (paramInt + 1 < this.numNodes)
        return paramInt + 1; 
      LOG.fine("getSibling: request for node with not sibling");
      return 0;
    } 
    return paramInt - 1;
  }
  
  private boolean isLeafNode(int paramInt) {
    return (2 * paramInt + 1 >= this.numNodes);
  }
  
  private boolean hasSibling(int paramInt) {
    return !exists(paramInt) ? false : (!(isLeftChild(paramInt) && !exists(paramInt + 1)));
  }
  
  protected int revealSeedsSize(int[] paramArrayOfint, int paramInt) {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 0;
    getRevealedNodes(paramArrayOfint, paramInt, arrayOfInt);
    return arrayOfInt[0] * this.engine.seedSizeBytes;
  }
  
  protected int revealSeeds(int[] paramArrayOfint, int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    int[] arrayOfInt1 = new int[1];
    arrayOfInt1[0] = 0;
    int i = paramInt2;
    int[] arrayOfInt2 = getRevealedNodes(paramArrayOfint, paramInt1, arrayOfInt1);
    for (byte b = 0; b < arrayOfInt1[0]; b++) {
      i -= this.engine.seedSizeBytes;
      if (i < 0) {
        LOG.fine("Insufficient sized buffer provided to revealSeeds");
        return 0;
      } 
      System.arraycopy(this.nodes[arrayOfInt2[b]], 0, paramArrayOfbyte, b * this.engine.seedSizeBytes, this.engine.seedSizeBytes);
    } 
    return paramArrayOfbyte.length - i;
  }
  
  protected int openMerkleTreeSize(int[] paramArrayOfint, int paramInt) {
    int[] arrayOfInt = new int[1];
    getRevealedMerkleNodes(paramArrayOfint, paramInt, arrayOfInt);
    return arrayOfInt[0] * this.engine.digestSizeBytes;
  }
  
  private int[] getRevealedMerkleNodes(int[] paramArrayOfint1, int paramInt, int[] paramArrayOfint2) {
    int i = this.numNodes - this.numLeaves;
    boolean[] arrayOfBoolean = new boolean[this.numNodes];
    int j;
    for (j = 0; j < paramInt; j++)
      arrayOfBoolean[i + paramArrayOfint1[j]] = true; 
    j = getParent(this.numNodes - 1);
    for (int k = j; k > 0; k--) {
      if (exists(k))
        if (exists(2 * k + 2)) {
          if (arrayOfBoolean[2 * k + 1] && arrayOfBoolean[2 * k + 2])
            arrayOfBoolean[k] = true; 
        } else if (arrayOfBoolean[2 * k + 1]) {
          arrayOfBoolean[k] = true;
        }  
    } 
    int[] arrayOfInt = new int[this.numLeaves];
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramInt; b2++) {
      int m = paramArrayOfint1[b2] + i;
      do {
        if (!arrayOfBoolean[getParent(m)]) {
          if (!contains(arrayOfInt, b1, m)) {
            arrayOfInt[b1] = m;
            b1++;
          } 
          break;
        } 
      } while ((m = getParent(m)) != 0);
    } 
    paramArrayOfint2[0] = b1;
    return arrayOfInt;
  }
  
  private boolean contains(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    for (byte b = 0; b < paramInt1; b++) {
      if (paramArrayOfint[b] == paramInt2)
        return true; 
    } 
    return false;
  }
  
  private void computeParentHash(int paramInt, byte[] paramArrayOfbyte) {
    if (!exists(paramInt))
      return; 
    int i = getParent(paramInt);
    if (this.haveNode[i])
      return; 
    if (!this.haveNode[2 * i + 1])
      return; 
    if (exists(2 * i + 2) && !this.haveNode[2 * i + 2])
      return; 
    this.engine.digest.update((byte)3);
    this.engine.digest.update(this.nodes[2 * i + 1], 0, this.engine.digestSizeBytes);
    if (hasRightChild(i))
      this.engine.digest.update(this.nodes[2 * i + 2], 0, this.engine.digestSizeBytes); 
    this.engine.digest.update(paramArrayOfbyte, 0, 32);
    this.engine.digest.update(Pack.intToLittleEndian(i), 0, 2);
    this.engine.digest.doFinal(this.nodes[i], 0, this.engine.digestSizeBytes);
    this.haveNode[i] = true;
  }
  
  protected byte[] getLeaf(int paramInt) {
    int i = this.numNodes - this.numLeaves;
    return this.nodes[i + paramInt];
  }
  
  protected int addMerkleNodes(int[] paramArrayOfint, int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    int i = paramInt2;
    int[] arrayOfInt1 = new int[1];
    arrayOfInt1[0] = 0;
    int[] arrayOfInt2 = getRevealedMerkleNodes(paramArrayOfint, paramInt1, arrayOfInt1);
    for (byte b = 0; b < arrayOfInt1[0]; b++) {
      i -= this.dataSize;
      if (i < 0)
        return -1; 
      System.arraycopy(paramArrayOfbyte, b * this.dataSize, this.nodes[arrayOfInt2[b]], 0, this.dataSize);
      this.haveNode[arrayOfInt2[b]] = true;
    } 
    return (i != 0) ? -1 : 0;
  }
  
  protected void generateSeeds(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    this.nodes[0] = paramArrayOfbyte1;
    this.haveNode[0] = true;
    expandSeeds(paramArrayOfbyte2, paramInt);
  }
  
  private void expandSeeds(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[64];
    int i = getParent(this.numNodes - 1);
    for (byte b = 0; b <= i; b++) {
      if (this.haveNode[b]) {
        hashSeed(arrayOfByte, this.nodes[b], paramArrayOfbyte, (byte)1, paramInt, b);
        if (!this.haveNode[2 * b + 1]) {
          System.arraycopy(arrayOfByte, 0, this.nodes[2 * b + 1], 0, this.engine.seedSizeBytes);
          this.haveNode[2 * b + 1] = true;
        } 
        if (exists(2 * b + 2) && !this.haveNode[2 * b + 2]) {
          System.arraycopy(arrayOfByte, this.engine.seedSizeBytes, this.nodes[2 * b + 2], 0, this.engine.seedSizeBytes);
          this.haveNode[2 * b + 2] = true;
        } 
      } 
    } 
  }
  
  private void hashSeed(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte paramByte, int paramInt1, int paramInt2) {
    this.engine.digest.update(paramByte);
    this.engine.digest.update(paramArrayOfbyte2, 0, this.engine.seedSizeBytes);
    this.engine.digest.update(paramArrayOfbyte3, 0, 32);
    this.engine.digest.update(Pack.shortToLittleEndian((short)(paramInt1 & 0xFFFF)), 0, 2);
    this.engine.digest.update(Pack.shortToLittleEndian((short)(paramInt2 & 0xFFFF)), 0, 2);
    this.engine.digest.doFinal(paramArrayOfbyte1, 0, 2 * this.engine.seedSizeBytes);
  }
  
  private boolean isLeftChild(int paramInt) {
    return (paramInt % 2 == 1);
  }
  
  private boolean hasRightChild(int paramInt) {
    return (2 * paramInt + 2 < this.numNodes && exists(paramInt));
  }
  
  boolean hasLeftChild(org.bouncycastle.pqc.crypto.picnic.Tree paramTree, int paramInt) {
    return (2 * paramInt + 1 < this.numNodes);
  }
  
  private int getParent(int paramInt) {
    return isLeftChild(paramInt) ? ((paramInt - 1) / 2) : ((paramInt - 2) / 2);
  }
  
  private boolean exists(int paramInt) {
    return (paramInt >= this.numNodes) ? false : this.exists[paramInt];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\picnic\Tree.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */