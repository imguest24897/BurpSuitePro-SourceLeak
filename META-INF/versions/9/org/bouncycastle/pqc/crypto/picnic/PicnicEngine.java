package META-INF.versions.9.org.bouncycastle.pqc.crypto.picnic;

import java.security.SecureRandom;
import java.util.logging.Logger;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.math.raw.Bits;
import org.bouncycastle.pqc.crypto.picnic.KMatricesWithPointer;
import org.bouncycastle.pqc.crypto.picnic.LowmcConstants;
import org.bouncycastle.pqc.crypto.picnic.Msg;
import org.bouncycastle.pqc.crypto.picnic.Signature;
import org.bouncycastle.pqc.crypto.picnic.Signature2;
import org.bouncycastle.pqc.crypto.picnic.Tape;
import org.bouncycastle.pqc.crypto.picnic.Tree;
import org.bouncycastle.pqc.crypto.picnic.Utils;
import org.bouncycastle.pqc.crypto.picnic.View;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

class PicnicEngine {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.pqc.crypto.picnic.PicnicEngine.class.getName());
  
  protected static final int saltSizeBytes = 32;
  
  private static final int MAX_DIGEST_SIZE = 64;
  
  private static final int WORD_SIZE_BITS = 32;
  
  private static final int LOWMC_MAX_STATE_SIZE = 64;
  
  protected static final int LOWMC_MAX_WORDS = 16;
  
  protected static final int LOWMC_MAX_KEY_BITS = 256;
  
  protected static final int LOWMC_MAX_AND_GATES = 1144;
  
  private static final int MAX_AUX_BYTES = 176;
  
  private static final int PICNIC_MAX_LOWMC_BLOCK_SIZE = 32;
  
  private static final int TRANSFORM_FS = 0;
  
  private static final int TRANSFORM_UR = 1;
  
  private static final int TRANSFORM_INVALID = 255;
  
  private final int CRYPTO_SECRETKEYBYTES;
  
  private final int CRYPTO_PUBLICKEYBYTES;
  
  private final int CRYPTO_BYTES;
  
  protected final int numRounds;
  
  protected final int numSboxes;
  
  protected final int stateSizeBits;
  
  protected final int stateSizeBytes;
  
  protected final int stateSizeWords;
  
  protected final int andSizeBytes;
  
  protected final int UnruhGWithoutInputBytes;
  
  protected final int UnruhGWithInputBytes;
  
  protected final int numMPCRounds;
  
  protected final int numOpenedRounds;
  
  protected final int numMPCParties;
  
  protected final int seedSizeBytes;
  
  protected final int digestSizeBytes;
  
  protected final int pqSecurityLevel;
  
  protected final Xof digest;
  
  private final int transform;
  
  private final int parameters;
  
  private int signatureLength;
  
  protected final LowmcConstants lowmcConstants;
  
  public int getSecretKeySize() {
    return this.CRYPTO_SECRETKEYBYTES;
  }
  
  public int getPublicKeySize() {
    return this.CRYPTO_PUBLICKEYBYTES;
  }
  
  public int getSignatureSize(int paramInt) {
    return this.CRYPTO_BYTES + paramInt;
  }
  
  public int getTrueSignatureSize() {
    return this.signatureLength;
  }
  
  PicnicEngine(int paramInt, LowmcConstants paramLowmcConstants) {
    this.lowmcConstants = paramLowmcConstants;
    this.parameters = paramInt;
    switch (this.parameters) {
      case 1:
      case 2:
        this.pqSecurityLevel = 64;
        this.stateSizeBits = 128;
        this.numMPCRounds = 219;
        this.numMPCParties = 3;
        this.numSboxes = 10;
        this.numRounds = 20;
        this.digestSizeBytes = 32;
        this.numOpenedRounds = 0;
        break;
      case 3:
      case 4:
        this.pqSecurityLevel = 96;
        this.stateSizeBits = 192;
        this.numMPCRounds = 329;
        this.numMPCParties = 3;
        this.numSboxes = 10;
        this.numRounds = 30;
        this.digestSizeBytes = 48;
        this.numOpenedRounds = 0;
        break;
      case 5:
      case 6:
        this.pqSecurityLevel = 128;
        this.stateSizeBits = 256;
        this.numMPCRounds = 438;
        this.numMPCParties = 3;
        this.numSboxes = 10;
        this.numRounds = 38;
        this.digestSizeBytes = 64;
        this.numOpenedRounds = 0;
        break;
      case 7:
        this.pqSecurityLevel = 64;
        this.stateSizeBits = 129;
        this.numMPCRounds = 250;
        this.numOpenedRounds = 36;
        this.numMPCParties = 16;
        this.numSboxes = 43;
        this.numRounds = 4;
        this.digestSizeBytes = 32;
        break;
      case 8:
        this.pqSecurityLevel = 96;
        this.stateSizeBits = 192;
        this.numMPCRounds = 419;
        this.numOpenedRounds = 52;
        this.numMPCParties = 16;
        this.numSboxes = 64;
        this.numRounds = 4;
        this.digestSizeBytes = 48;
        break;
      case 9:
        this.pqSecurityLevel = 128;
        this.stateSizeBits = 255;
        this.numMPCRounds = 601;
        this.numOpenedRounds = 68;
        this.numMPCParties = 16;
        this.numSboxes = 85;
        this.numRounds = 4;
        this.digestSizeBytes = 64;
        break;
      case 10:
        this.pqSecurityLevel = 64;
        this.stateSizeBits = 129;
        this.numMPCRounds = 219;
        this.numMPCParties = 3;
        this.numSboxes = 43;
        this.numRounds = 4;
        this.digestSizeBytes = 32;
        this.numOpenedRounds = 0;
        break;
      case 11:
        this.pqSecurityLevel = 96;
        this.stateSizeBits = 192;
        this.numMPCRounds = 329;
        this.numMPCParties = 3;
        this.numSboxes = 64;
        this.numRounds = 4;
        this.digestSizeBytes = 48;
        this.numOpenedRounds = 0;
        break;
      case 12:
        this.pqSecurityLevel = 128;
        this.stateSizeBits = 255;
        this.numMPCRounds = 438;
        this.numMPCParties = 3;
        this.numSboxes = 85;
        this.numRounds = 4;
        this.digestSizeBytes = 64;
        this.numOpenedRounds = 0;
        break;
      default:
        throw new IllegalArgumentException("unknown parameter set " + this.parameters);
    } 
    switch (this.parameters) {
      case 1:
        this.CRYPTO_SECRETKEYBYTES = 49;
        this.CRYPTO_PUBLICKEYBYTES = 33;
        this.CRYPTO_BYTES = 34036;
        break;
      case 2:
        this.CRYPTO_SECRETKEYBYTES = 49;
        this.CRYPTO_PUBLICKEYBYTES = 33;
        this.CRYPTO_BYTES = 53965;
        break;
      case 3:
        this.CRYPTO_SECRETKEYBYTES = 73;
        this.CRYPTO_PUBLICKEYBYTES = 49;
        this.CRYPTO_BYTES = 76784;
        break;
      case 4:
        this.CRYPTO_SECRETKEYBYTES = 73;
        this.CRYPTO_PUBLICKEYBYTES = 49;
        this.CRYPTO_BYTES = 121857;
        break;
      case 5:
        this.CRYPTO_SECRETKEYBYTES = 97;
        this.CRYPTO_PUBLICKEYBYTES = 65;
        this.CRYPTO_BYTES = 132876;
        break;
      case 6:
        this.CRYPTO_SECRETKEYBYTES = 97;
        this.CRYPTO_PUBLICKEYBYTES = 65;
        this.CRYPTO_BYTES = 209526;
        break;
      case 7:
        this.CRYPTO_SECRETKEYBYTES = 52;
        this.CRYPTO_PUBLICKEYBYTES = 35;
        this.CRYPTO_BYTES = 14612;
        break;
      case 8:
        this.CRYPTO_SECRETKEYBYTES = 73;
        this.CRYPTO_PUBLICKEYBYTES = 49;
        this.CRYPTO_BYTES = 35028;
        break;
      case 9:
        this.CRYPTO_SECRETKEYBYTES = 97;
        this.CRYPTO_PUBLICKEYBYTES = 65;
        this.CRYPTO_BYTES = 61028;
        break;
      case 10:
        this.CRYPTO_SECRETKEYBYTES = 52;
        this.CRYPTO_PUBLICKEYBYTES = 35;
        this.CRYPTO_BYTES = 32061;
        break;
      case 11:
        this.CRYPTO_SECRETKEYBYTES = 73;
        this.CRYPTO_PUBLICKEYBYTES = 49;
        this.CRYPTO_BYTES = 71179;
        break;
      case 12:
        this.CRYPTO_SECRETKEYBYTES = 97;
        this.CRYPTO_PUBLICKEYBYTES = 65;
        this.CRYPTO_BYTES = 126286;
        break;
      default:
        this.CRYPTO_SECRETKEYBYTES = -1;
        this.CRYPTO_PUBLICKEYBYTES = -1;
        this.CRYPTO_BYTES = -1;
        break;
    } 
    this.andSizeBytes = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
    this.stateSizeBytes = Utils.numBytes(this.stateSizeBits);
    this.seedSizeBytes = Utils.numBytes(2 * this.pqSecurityLevel);
    this.stateSizeWords = (this.stateSizeBits + 32 - 1) / 32;
    switch (this.parameters) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
        this.transform = 0;
        break;
      case 2:
      case 4:
      case 6:
        this.transform = 1;
        break;
      default:
        this.transform = 255;
        break;
    } 
    if (this.transform == 1) {
      this.UnruhGWithoutInputBytes = this.seedSizeBytes + this.andSizeBytes;
      this.UnruhGWithInputBytes = this.UnruhGWithoutInputBytes + this.stateSizeBytes;
    } else {
      this.UnruhGWithoutInputBytes = 0;
      this.UnruhGWithInputBytes = 0;
    } 
    if (this.stateSizeBits == 128 || this.stateSizeBits == 129) {
      this.digest = (Xof)new SHAKEDigest(128);
    } else {
      this.digest = (Xof)new SHAKEDigest(256);
    } 
  }
  
  public boolean crypto_sign_open(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    int i = Pack.littleEndianToInt(paramArrayOfbyte2, 0);
    byte[] arrayOfByte = Arrays.copyOfRange(paramArrayOfbyte2, 4, 4 + paramArrayOfbyte1.length);
    int j = picnic_verify(paramArrayOfbyte3, arrayOfByte, paramArrayOfbyte2, i);
    if (j == -1)
      return false; 
    System.arraycopy(paramArrayOfbyte2, 4, paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    return true;
  }
  
  private int picnic_verify(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt) {
    int[] arrayOfInt1 = new int[this.stateSizeWords];
    int[] arrayOfInt2 = new int[this.stateSizeWords];
    picnic_read_public_key(arrayOfInt1, arrayOfInt2, paramArrayOfbyte1);
    if (is_picnic3(this.parameters)) {
      Signature2 signature2 = new Signature2(this);
      int j = deserializeSignature2(signature2, paramArrayOfbyte3, paramInt, paramArrayOfbyte2.length + 4);
      if (j != 0) {
        LOG.fine("Error couldn't deserialize signature (2)!");
        return -1;
      } 
      return verify_picnic3(signature2, arrayOfInt1, arrayOfInt2, paramArrayOfbyte2);
    } 
    Signature signature = new Signature(this);
    int i = deserializeSignature(signature, paramArrayOfbyte3, paramInt, paramArrayOfbyte2.length + 4);
    if (i != 0) {
      LOG.fine("Error couldn't deserialize signature!");
      return -1;
    } 
    return verify(signature, arrayOfInt1, arrayOfInt2, paramArrayOfbyte2);
  }
  
  private int verify(Signature paramSignature, int[] paramArrayOfint1, int[] paramArrayOfint2, byte[] paramArrayOfbyte) {
    byte[][][] arrayOfByte1 = new byte[this.numMPCRounds][this.numMPCParties][this.digestSizeBytes];
    byte[][][] arrayOfByte2 = new byte[this.numMPCRounds][3][this.UnruhGWithInputBytes];
    int[][][] arrayOfInt = new int[this.numMPCRounds][3][this.stateSizeBytes];
    Signature.Proof[] arrayOfProof = paramSignature.proofs;
    byte[] arrayOfByte3 = paramSignature.challengeBits;
    byte b = 0;
    byte[] arrayOfByte4 = null;
    byte[] arrayOfByte5 = new byte[Math.max(6 * this.stateSizeBytes, this.stateSizeBytes + this.andSizeBytes)];
    Tape tape = new Tape(this);
    View[] arrayOfView1 = new View[this.numMPCRounds];
    View[] arrayOfView2 = new View[this.numMPCRounds];
    for (byte b1 = 0; b1 < this.numMPCRounds; b1++) {
      arrayOfView1[b1] = new View(this);
      arrayOfView2[b1] = new View(this);
      if (!verifyProof(arrayOfProof[b1], arrayOfView1[b1], arrayOfView2[b1], getChallenge(arrayOfByte3, b1), paramSignature.salt, b1, arrayOfByte5, paramArrayOfint2, tape)) {
        LOG.fine("Invalid signature. Did not verify");
        return -1;
      } 
      int i = getChallenge(arrayOfByte3, b1);
      Commit((arrayOfProof[b1]).seed1, 0, arrayOfView1[b1], arrayOfByte1[b1][i]);
      Commit((arrayOfProof[b1]).seed2, 0, arrayOfView2[b1], arrayOfByte1[b1][(i + 1) % 3]);
      System.arraycopy((arrayOfProof[b1]).view3Commitment, 0, arrayOfByte1[b1][(i + 2) % 3], 0, this.digestSizeBytes);
      if (this.transform == 1) {
        G(i, (arrayOfProof[b1]).seed1, 0, arrayOfView1[b1], arrayOfByte2[b1][i]);
        G((i + 1) % 3, (arrayOfProof[b1]).seed2, 0, arrayOfView2[b1], arrayOfByte2[b1][(i + 1) % 3]);
        int j = (i == 0) ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
        System.arraycopy((arrayOfProof[b1]).view3UnruhG, 0, arrayOfByte2[b1][(i + 2) % 3], 0, j);
      } 
      arrayOfInt[b1][i] = (arrayOfView1[b1]).outputShare;
      arrayOfInt[b1][(i + 1) % 3] = (arrayOfView2[b1]).outputShare;
      int[] arrayOfInt1 = new int[this.stateSizeWords];
      xor_three(arrayOfInt1, (arrayOfView1[b1]).outputShare, (arrayOfView2[b1]).outputShare, paramArrayOfint1);
      arrayOfInt[b1][(i + 2) % 3] = arrayOfInt1;
    } 
    arrayOfByte4 = new byte[Utils.numBytes(2 * this.numMPCRounds)];
    H3(paramArrayOfint1, paramArrayOfint2, arrayOfInt, arrayOfByte1, arrayOfByte4, paramSignature.salt, paramArrayOfbyte, arrayOfByte2);
    if (!subarrayEquals(arrayOfByte3, arrayOfByte4, Utils.numBytes(2 * this.numMPCRounds))) {
      LOG.fine("Invalid signature. Did not verify");
      b = -1;
    } 
    return b;
  }
  
  boolean verifyProof(Signature.Proof paramProof, View paramView1, View paramView2, int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, byte[] paramArrayOfbyte2, int[] paramArrayOfint, Tape paramTape) {
    System.arraycopy(paramProof.communicatedBits, 0, paramView2.communicatedBits, 0, this.andSizeBytes);
    paramTape.pos = 0;
    boolean bool = false;
    switch (paramInt1) {
      case 0:
        bool = createRandomTape(paramProof.seed1, 0, paramArrayOfbyte1, paramInt2, 0, paramArrayOfbyte2, this.stateSizeBytes + this.andSizeBytes);
        Pack.littleEndianToInt(paramArrayOfbyte2, 0, paramView1.inputShare);
        System.arraycopy(paramArrayOfbyte2, this.stateSizeBytes, paramTape.tapes[0], 0, this.andSizeBytes);
        bool = (bool && createRandomTape(paramProof.seed2, 0, paramArrayOfbyte1, paramInt2, 1, paramArrayOfbyte2, this.stateSizeBytes + this.andSizeBytes));
        if (!bool)
          break; 
        Pack.littleEndianToInt(paramArrayOfbyte2, 0, paramView2.inputShare);
        System.arraycopy(paramArrayOfbyte2, this.stateSizeBytes, paramTape.tapes[1], 0, this.andSizeBytes);
        break;
      case 1:
        bool = createRandomTape(paramProof.seed1, 0, paramArrayOfbyte1, paramInt2, 1, paramArrayOfbyte2, this.stateSizeBytes + this.andSizeBytes);
        Pack.littleEndianToInt(paramArrayOfbyte2, 0, paramView1.inputShare);
        System.arraycopy(paramArrayOfbyte2, this.stateSizeBytes, paramTape.tapes[0], 0, this.andSizeBytes);
        bool = (bool && createRandomTape(paramProof.seed2, 0, paramArrayOfbyte1, paramInt2, 2, paramTape.tapes[1], this.andSizeBytes));
        if (!bool)
          break; 
        System.arraycopy(paramProof.inputShare, 0, paramView2.inputShare, 0, this.stateSizeWords);
        break;
      case 2:
        bool = createRandomTape(paramProof.seed1, 0, paramArrayOfbyte1, paramInt2, 2, paramTape.tapes[0], this.andSizeBytes);
        System.arraycopy(paramProof.inputShare, 0, paramView1.inputShare, 0, this.stateSizeWords);
        bool = (bool && createRandomTape(paramProof.seed2, 0, paramArrayOfbyte1, paramInt2, 0, paramArrayOfbyte2, this.stateSizeBytes + this.andSizeBytes));
        if (!bool)
          break; 
        Pack.littleEndianToInt(paramArrayOfbyte2, 0, paramView2.inputShare);
        System.arraycopy(paramArrayOfbyte2, this.stateSizeBytes, paramTape.tapes[1], 0, this.andSizeBytes);
        break;
      default:
        LOG.fine("Invalid Challenge!");
        break;
    } 
    if (!bool) {
      LOG.fine("Failed to generate random tapes, signature verification will fail (but signature may actually be valid)");
      return false;
    } 
    Utils.zeroTrailingBits(paramView1.inputShare, this.stateSizeBits);
    Utils.zeroTrailingBits(paramView2.inputShare, this.stateSizeBits);
    int[] arrayOfInt = Pack.littleEndianToInt(paramArrayOfbyte2, 0, paramArrayOfbyte2.length / 4);
    mpc_LowMC_verify(paramView1, paramView2, paramTape, arrayOfInt, paramArrayOfint, paramInt1);
    return true;
  }
  
  void mpc_LowMC_verify(View paramView1, View paramView2, Tape paramTape, int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt) {
    Arrays.fill(paramArrayOfint1, 0, paramArrayOfint1.length, 0);
    mpc_xor_constant_verify(paramArrayOfint1, paramArrayOfint2, 0, this.stateSizeWords, paramInt);
    KMatricesWithPointer kMatricesWithPointer = this.lowmcConstants.KMatrix(this, 0);
    matrix_mul_offset(paramArrayOfint1, 0, paramView1.inputShare, 0, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
    matrix_mul_offset(paramArrayOfint1, this.stateSizeWords, paramView2.inputShare, 0, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
    mpc_xor(paramArrayOfint1, paramArrayOfint1, 2);
    for (byte b = 1; b <= this.numRounds; b++) {
      kMatricesWithPointer = this.lowmcConstants.KMatrix(this, b);
      matrix_mul_offset(paramArrayOfint1, 0, paramView1.inputShare, 0, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
      matrix_mul_offset(paramArrayOfint1, this.stateSizeWords, paramView2.inputShare, 0, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
      mpc_substitution_verify(paramArrayOfint1, paramTape, paramView1, paramView2);
      kMatricesWithPointer = this.lowmcConstants.LMatrix(this, b - 1);
      mpc_matrix_mul(paramArrayOfint1, 2 * this.stateSizeWords, paramArrayOfint1, 2 * this.stateSizeWords, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer(), 2);
      kMatricesWithPointer = this.lowmcConstants.RConstant(this, b - 1);
      mpc_xor_constant_verify(paramArrayOfint1, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer(), this.stateSizeWords, paramInt);
      mpc_xor(paramArrayOfint1, paramArrayOfint1, 2);
    } 
    System.arraycopy(paramArrayOfint1, 2 * this.stateSizeWords, paramView1.outputShare, 0, this.stateSizeWords);
    System.arraycopy(paramArrayOfint1, 3 * this.stateSizeWords, paramView2.outputShare, 0, this.stateSizeWords);
  }
  
  void mpc_substitution_verify(int[] paramArrayOfint, Tape paramTape, View paramView1, View paramView2) {
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    int[] arrayOfInt3 = new int[2];
    int[] arrayOfInt4 = new int[2];
    int[] arrayOfInt5 = new int[2];
    int[] arrayOfInt6 = new int[2];
    for (byte b = 0; b < this.numSboxes * 3; b += 3) {
      byte b1;
      for (b1 = 0; b1 < 2; b1++) {
        int i = (2 + b1) * this.stateSizeWords * 32;
        arrayOfInt1[b1] = Utils.getBitFromWordArray(paramArrayOfint, i + b + 2);
        arrayOfInt2[b1] = Utils.getBitFromWordArray(paramArrayOfint, i + b + 1);
        arrayOfInt3[b1] = Utils.getBitFromWordArray(paramArrayOfint, i + b);
      } 
      mpc_AND_verify(arrayOfInt1, arrayOfInt2, arrayOfInt4, paramTape, paramView1, paramView2);
      mpc_AND_verify(arrayOfInt2, arrayOfInt3, arrayOfInt5, paramTape, paramView1, paramView2);
      mpc_AND_verify(arrayOfInt3, arrayOfInt1, arrayOfInt6, paramTape, paramView1, paramView2);
      for (b1 = 0; b1 < 2; b1++) {
        int i = (2 + b1) * this.stateSizeWords * 32;
        Utils.setBitInWordArray(paramArrayOfint, i + b + 2, arrayOfInt1[b1] ^ arrayOfInt5[b1]);
        Utils.setBitInWordArray(paramArrayOfint, i + b + 1, arrayOfInt1[b1] ^ arrayOfInt2[b1] ^ arrayOfInt6[b1]);
        Utils.setBitInWordArray(paramArrayOfint, i + b, arrayOfInt1[b1] ^ arrayOfInt2[b1] ^ arrayOfInt3[b1] ^ arrayOfInt4[b1]);
      } 
    } 
  }
  
  void mpc_AND_verify(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, Tape paramTape, View paramView1, View paramView2) {
    byte b1 = Utils.getBit(paramTape.tapes[0], paramTape.pos);
    byte b2 = Utils.getBit(paramTape.tapes[1], paramTape.pos);
    int i = paramArrayOfint1[0];
    int j = paramArrayOfint1[1];
    int k = paramArrayOfint2[0];
    int m = paramArrayOfint2[1];
    paramArrayOfint3[0] = i & m ^ j & k ^ i & k ^ b1 ^ b2;
    Utils.setBit(paramView1.communicatedBits, paramTape.pos, (byte)paramArrayOfint3[0]);
    paramArrayOfint3[1] = Utils.getBit(paramView2.communicatedBits, paramTape.pos);
    paramTape.pos++;
  }
  
  private void mpc_xor_constant_verify(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt1, int paramInt2, int paramInt3) {
    int i = 0;
    if (paramInt3 == 0) {
      i = 2 * this.stateSizeWords;
    } else if (paramInt3 == 2) {
      i = 3 * this.stateSizeWords;
    } else {
      return;
    } 
    for (byte b = 0; b < paramInt2; b++)
      paramArrayOfint1[b + i] = paramArrayOfint1[b + i] ^ paramArrayOfint2[b + paramInt1]; 
  }
  
  private int deserializeSignature(Signature paramSignature, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    Signature.Proof[] arrayOfProof = paramSignature.proofs;
    byte[] arrayOfByte = paramSignature.challengeBits;
    int i = Utils.numBytes(2 * this.numMPCRounds);
    if (paramInt1 < i)
      return -1; 
    int j = countNonZeroChallenges(paramArrayOfbyte, paramInt2);
    if (j < 0)
      return -1; 
    int k = j * this.stateSizeBytes;
    int m = i + 32 + this.numMPCRounds * (2 * this.seedSizeBytes + this.andSizeBytes + this.digestSizeBytes) + k;
    if (this.transform == 1) {
      m += this.UnruhGWithInputBytes * (this.numMPCRounds - j);
      m += this.UnruhGWithoutInputBytes * j;
    } 
    if (paramInt1 != m) {
      LOG.fine("sigBytesLen = " + paramInt1 + ", expected bytesRequired = " + m);
      return -1;
    } 
    System.arraycopy(paramArrayOfbyte, paramInt2, arrayOfByte, 0, i);
    paramInt2 += i;
    System.arraycopy(paramArrayOfbyte, paramInt2, paramSignature.salt, 0, 32);
    paramInt2 += 32;
    for (byte b = 0; b < this.numMPCRounds; b++) {
      int n = getChallenge(arrayOfByte, b);
      System.arraycopy(paramArrayOfbyte, paramInt2, (arrayOfProof[b]).view3Commitment, 0, this.digestSizeBytes);
      paramInt2 += this.digestSizeBytes;
      if (this.transform == 1) {
        int i1 = (n == 0) ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
        System.arraycopy(paramArrayOfbyte, paramInt2, (arrayOfProof[b]).view3UnruhG, 0, i1);
        paramInt2 += i1;
      } 
      System.arraycopy(paramArrayOfbyte, paramInt2, (arrayOfProof[b]).communicatedBits, 0, this.andSizeBytes);
      paramInt2 += this.andSizeBytes;
      System.arraycopy(paramArrayOfbyte, paramInt2, (arrayOfProof[b]).seed1, 0, this.seedSizeBytes);
      paramInt2 += this.seedSizeBytes;
      System.arraycopy(paramArrayOfbyte, paramInt2, (arrayOfProof[b]).seed2, 0, this.seedSizeBytes);
      paramInt2 += this.seedSizeBytes;
      if (n == 1 || n == 2) {
        Pack.littleEndianToInt(paramArrayOfbyte, paramInt2, (arrayOfProof[b]).inputShare, 0, this.stateSizeBytes / 4);
        if (this.stateSizeBits == 129)
          (arrayOfProof[b]).inputShare[this.stateSizeWords - 1] = paramArrayOfbyte[paramInt2 + this.stateSizeBytes - 1] & 0xFF; 
        paramInt2 += this.stateSizeBytes;
        if (!arePaddingBitsZero((arrayOfProof[b]).inputShare, this.stateSizeBits))
          return -1; 
      } 
    } 
    return 0;
  }
  
  private int countNonZeroChallenges(byte[] paramArrayOfbyte, int paramInt) {
    int i = 0;
    int j = 0;
    byte b;
    for (b = 0; b + 16 <= this.numMPCRounds; b += 16) {
      int m = Pack.littleEndianToInt(paramArrayOfbyte, paramInt + (b >>> 2));
      j |= m & m >>> 1;
      i += Integers.bitCount((m ^ m >>> 1) & 0x55555555);
    } 
    int k = (this.numMPCRounds - b) * 2;
    if (k > 0) {
      int m = (k + 7) / 8;
      int n = Pack.littleEndianToInt_Low(paramArrayOfbyte, paramInt + (b >>> 2), m);
      n &= Utils.getTrailingBitsMask(k);
      j |= n & n >>> 1;
      i += Integers.bitCount((n ^ n >>> 1) & 0x55555555);
    } 
    return ((j & 0x55555555) == 0) ? i : -1;
  }
  
  private void picnic_read_public_key(int[] paramArrayOfint1, int[] paramArrayOfint2, byte[] paramArrayOfbyte) {
    byte b = 1;
    int i = 1 + this.stateSizeBytes;
    int j = this.stateSizeBytes / 4;
    Pack.littleEndianToInt(paramArrayOfbyte, b, paramArrayOfint1, 0, j);
    Pack.littleEndianToInt(paramArrayOfbyte, i, paramArrayOfint2, 0, j);
    if (j < this.stateSizeWords) {
      int k = j * 4;
      int m = this.stateSizeBytes - k;
      paramArrayOfint1[j] = Pack.littleEndianToInt_Low(paramArrayOfbyte, b + k, m);
      paramArrayOfint2[j] = Pack.littleEndianToInt_Low(paramArrayOfbyte, i + k, m);
    } 
  }
  
  private int verify_picnic3(Signature2 paramSignature2, int[] paramArrayOfint1, int[] paramArrayOfint2, byte[] paramArrayOfbyte) {
    byte[][][] arrayOfByte = new byte[this.numMPCRounds][this.numMPCParties][this.digestSizeBytes];
    byte[][] arrayOfByte1 = new byte[this.numMPCRounds][this.digestSizeBytes];
    byte[][] arrayOfByte2 = new byte[this.numMPCRounds][this.digestSizeBytes];
    Msg[] arrayOfMsg = new Msg[this.numMPCRounds];
    Tree tree1 = new Tree(this, this.numMPCRounds, this.digestSizeBytes);
    byte[] arrayOfByte3 = new byte[64];
    Tree[] arrayOfTree = new Tree[this.numMPCRounds];
    Tape[] arrayOfTape = new Tape[this.numMPCRounds];
    Tree tree2 = new Tree(this, this.numMPCRounds, this.seedSizeBytes);
    int i = tree2.reconstructSeeds(paramSignature2.challengeC, this.numOpenedRounds, paramSignature2.iSeedInfo, paramSignature2.iSeedInfoLen, paramSignature2.salt, 0);
    if (i != 0)
      return -1; 
    int j;
    for (j = 0; j < this.numMPCRounds; j++) {
      if (!contains(paramSignature2.challengeC, this.numOpenedRounds, j)) {
        arrayOfTree[j] = new Tree(this, this.numMPCParties, this.seedSizeBytes);
        arrayOfTree[j].generateSeeds(tree2.getLeaf(j), paramSignature2.salt, j);
      } else {
        arrayOfTree[j] = new Tree(this, this.numMPCParties, this.seedSizeBytes);
        int m = indexOf(paramSignature2.challengeC, this.numOpenedRounds, j);
        int[] arrayOfInt = new int[1];
        arrayOfInt[0] = paramSignature2.challengeP[m];
        i = arrayOfTree[j].reconstructSeeds(arrayOfInt, 1, (paramSignature2.proofs[j]).seedInfo, (paramSignature2.proofs[j]).seedInfoLen, paramSignature2.salt, j);
        if (i != 0) {
          LOG.fine("Failed to reconstruct seeds for round " + j);
          return -1;
        } 
      } 
    } 
    j = this.numMPCParties - 1;
    byte[] arrayOfByte4 = new byte[176];
    byte b;
    for (b = 0; b < this.numMPCRounds; b++) {
      arrayOfTape[b] = new Tape(this);
      createRandomTapes(arrayOfTape[b], arrayOfTree[b].getLeaves(), arrayOfTree[b].getLeavesOffset(), paramSignature2.salt, b);
      if (!contains(paramSignature2.challengeC, this.numOpenedRounds, b)) {
        arrayOfTape[b].computeAuxTape(null);
        for (byte b1 = 0; b1 < j; b1++)
          commit(arrayOfByte[b][b1], arrayOfTree[b].getLeaf(b1), null, paramSignature2.salt, b, b1); 
        getAuxBits(arrayOfByte4, arrayOfTape[b]);
        commit(arrayOfByte[b][j], arrayOfTree[b].getLeaf(j), arrayOfByte4, paramSignature2.salt, b, j);
      } else {
        int m = paramSignature2.challengeP[indexOf(paramSignature2.challengeC, this.numOpenedRounds, b)];
        for (byte b1 = 0; b1 < j; b1++) {
          if (b1 != m)
            commit(arrayOfByte[b][b1], arrayOfTree[b].getLeaf(b1), null, paramSignature2.salt, b, b1); 
        } 
        if (j != m)
          commit(arrayOfByte[b][j], arrayOfTree[b].getLeaf(j), (paramSignature2.proofs[b]).aux, paramSignature2.salt, b, j); 
        System.arraycopy((paramSignature2.proofs[b]).C, 0, arrayOfByte[b][m], 0, this.digestSizeBytes);
      } 
    } 
    for (b = 0; b < this.numMPCRounds; b++)
      commit_h(arrayOfByte1[b], arrayOfByte[b]); 
    int[] arrayOfInt1 = new int[this.stateSizeBits];
    int k;
    for (k = 0; k < this.numMPCRounds; k++) {
      arrayOfMsg[k] = new Msg(this);
      if (contains(paramSignature2.challengeC, this.numOpenedRounds, k)) {
        int m = paramSignature2.challengeP[indexOf(paramSignature2.challengeC, this.numOpenedRounds, k)];
        if (m != j)
          arrayOfTape[k].setAuxBits((paramSignature2.proofs[k]).aux); 
        System.arraycopy((paramSignature2.proofs[k]).msgs, 0, (arrayOfMsg[k]).msgs[m], 0, this.andSizeBytes);
        Arrays.fill((arrayOfTape[k]).tapes[m], (byte)0);
        (arrayOfMsg[k]).unopened = m;
        byte[] arrayOfByte5 = new byte[this.stateSizeWords * 4];
        System.arraycopy((paramSignature2.proofs[k]).input, 0, arrayOfByte5, 0, (paramSignature2.proofs[k]).input.length);
        int[] arrayOfInt = new int[this.stateSizeWords];
        Pack.littleEndianToInt(arrayOfByte5, 0, arrayOfInt, 0, this.stateSizeWords);
        int n = simulateOnline(arrayOfInt, arrayOfTape[k], arrayOfInt1, arrayOfMsg[k], paramArrayOfint2, paramArrayOfint1);
        if (n != 0) {
          LOG.fine("MPC simulation failed for round " + k + ", signature invalid");
          return -1;
        } 
        commit_v(arrayOfByte2[k], (paramSignature2.proofs[k]).input, arrayOfMsg[k]);
      } else {
        arrayOfByte2[k] = null;
      } 
    } 
    k = this.numMPCRounds - this.numOpenedRounds;
    int[] arrayOfInt2 = getMissingLeavesList(paramSignature2.challengeC);
    i = tree1.addMerkleNodes(arrayOfInt2, k, paramSignature2.cvInfo, paramSignature2.cvInfoLen);
    if (i != 0)
      return -1; 
    i = tree1.verifyMerkleTree(arrayOfByte2, paramSignature2.salt);
    if (i != 0)
      return -1; 
    HCP(arrayOfByte3, null, null, arrayOfByte1, tree1.nodes[0], paramSignature2.salt, paramArrayOfint1, paramArrayOfint2, paramArrayOfbyte);
    if (!subarrayEquals(paramSignature2.challengeHash, arrayOfByte3, this.digestSizeBytes)) {
      LOG.fine("Challenge does not match, signature invalid");
      return -1;
    } 
    return i;
  }
  
  private int deserializeSignature2(Signature2 paramSignature2, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = this.digestSizeBytes + 32;
    if (paramArrayOfbyte.length < i)
      return -1; 
    System.arraycopy(paramArrayOfbyte, paramInt2, paramSignature2.challengeHash, 0, this.digestSizeBytes);
    paramInt2 += this.digestSizeBytes;
    System.arraycopy(paramArrayOfbyte, paramInt2, paramSignature2.salt, 0, 32);
    paramInt2 += 32;
    expandChallengeHash(paramSignature2.challengeHash, paramSignature2.challengeC, paramSignature2.challengeP);
    Tree tree = new Tree(this, this.numMPCRounds, this.seedSizeBytes);
    paramSignature2.iSeedInfoLen = tree.revealSeedsSize(paramSignature2.challengeC, this.numOpenedRounds);
    i += paramSignature2.iSeedInfoLen;
    int j = this.numMPCRounds - this.numOpenedRounds;
    int[] arrayOfInt1 = getMissingLeavesList(paramSignature2.challengeC);
    tree = new Tree(this, this.numMPCRounds, this.digestSizeBytes);
    paramSignature2.cvInfoLen = tree.openMerkleTreeSize(arrayOfInt1, j);
    i += paramSignature2.cvInfoLen;
    int[] arrayOfInt2 = new int[1];
    tree = new Tree(this, this.numMPCParties, this.seedSizeBytes);
    int k = tree.revealSeedsSize(arrayOfInt2, 1);
    byte b;
    for (b = 0; b < this.numMPCRounds; b++) {
      if (contains(paramSignature2.challengeC, this.numOpenedRounds, b)) {
        int m = paramSignature2.challengeP[indexOf(paramSignature2.challengeC, this.numOpenedRounds, b)];
        if (m != this.numMPCParties - 1)
          i += this.andSizeBytes; 
        i += k;
        i += this.stateSizeBytes;
        i += this.andSizeBytes;
        i += this.digestSizeBytes;
      } 
    } 
    if (paramInt1 != i) {
      LOG.fine("sigLen = " + paramInt1 + ", expected bytesRequired = " + i);
      return -1;
    } 
    paramSignature2.iSeedInfo = new byte[paramSignature2.iSeedInfoLen];
    System.arraycopy(paramArrayOfbyte, paramInt2, paramSignature2.iSeedInfo, 0, paramSignature2.iSeedInfoLen);
    paramInt2 += paramSignature2.iSeedInfoLen;
    paramSignature2.cvInfo = new byte[paramSignature2.cvInfoLen];
    System.arraycopy(paramArrayOfbyte, paramInt2, paramSignature2.cvInfo, 0, paramSignature2.cvInfoLen);
    paramInt2 += paramSignature2.cvInfoLen;
    for (b = 0; b < this.numMPCRounds; b++) {
      if (contains(paramSignature2.challengeC, this.numOpenedRounds, b)) {
        paramSignature2.proofs[b] = new Signature2.Proof2(this);
        (paramSignature2.proofs[b]).seedInfoLen = k;
        (paramSignature2.proofs[b]).seedInfo = new byte[(paramSignature2.proofs[b]).seedInfoLen];
        System.arraycopy(paramArrayOfbyte, paramInt2, (paramSignature2.proofs[b]).seedInfo, 0, (paramSignature2.proofs[b]).seedInfoLen);
        paramInt2 += (paramSignature2.proofs[b]).seedInfoLen;
        int m = paramSignature2.challengeP[indexOf(paramSignature2.challengeC, this.numOpenedRounds, b)];
        if (m != this.numMPCParties - 1) {
          System.arraycopy(paramArrayOfbyte, paramInt2, (paramSignature2.proofs[b]).aux, 0, this.andSizeBytes);
          paramInt2 += this.andSizeBytes;
          if (!arePaddingBitsZero((paramSignature2.proofs[b]).aux, 3 * this.numRounds * this.numSboxes)) {
            LOG.fine("failed while deserializing aux bits");
            return -1;
          } 
        } 
        System.arraycopy(paramArrayOfbyte, paramInt2, (paramSignature2.proofs[b]).input, 0, this.stateSizeBytes);
        paramInt2 += this.stateSizeBytes;
        int n = this.andSizeBytes;
        System.arraycopy(paramArrayOfbyte, paramInt2, (paramSignature2.proofs[b]).msgs, 0, n);
        paramInt2 += n;
        int i1 = 3 * this.numRounds * this.numSboxes;
        if (!arePaddingBitsZero((paramSignature2.proofs[b]).msgs, i1)) {
          LOG.fine("failed while deserializing msgs bits");
          return -1;
        } 
        System.arraycopy(paramArrayOfbyte, paramInt2, (paramSignature2.proofs[b]).C, 0, this.digestSizeBytes);
        paramInt2 += this.digestSizeBytes;
      } 
    } 
    return 0;
  }
  
  private boolean arePaddingBitsZero(byte[] paramArrayOfbyte, int paramInt) {
    int i = Utils.numBytes(paramInt);
    for (int j = paramInt; j < i * 8; j++) {
      byte b = Utils.getBit(paramArrayOfbyte, j);
      if (b != 0)
        return false; 
    } 
    return true;
  }
  
  private boolean arePaddingBitsZero(int[] paramArrayOfint, int paramInt) {
    int i = paramInt & 0x1F;
    if (i == 0)
      return true; 
    int j = Utils.getTrailingBitsMask(paramInt);
    return ((paramArrayOfint[paramInt >>> 5] & (j ^ 0xFFFFFFFF)) == 0);
  }
  
  public void crypto_sign(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    boolean bool = picnic_sign(paramArrayOfbyte3, paramArrayOfbyte2, paramArrayOfbyte1);
    if (!bool)
      return; 
    System.arraycopy(paramArrayOfbyte2, 0, paramArrayOfbyte1, 4, paramArrayOfbyte2.length);
  }
  
  private boolean picnic_sign(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    int[] arrayOfInt1 = new int[this.stateSizeWords];
    int[] arrayOfInt2 = new int[this.stateSizeWords];
    int[] arrayOfInt3 = new int[this.stateSizeWords];
    byte b = 1;
    int i = 1 + this.stateSizeBytes;
    int j = 1 + 2 * this.stateSizeBytes;
    int k = this.stateSizeBytes / 4;
    Pack.littleEndianToInt(paramArrayOfbyte1, b, arrayOfInt1, 0, k);
    Pack.littleEndianToInt(paramArrayOfbyte1, i, arrayOfInt2, 0, k);
    Pack.littleEndianToInt(paramArrayOfbyte1, j, arrayOfInt3, 0, k);
    if (k < this.stateSizeWords) {
      int n = k * 4;
      int i1 = this.stateSizeBytes - n;
      arrayOfInt1[k] = Pack.littleEndianToInt_Low(paramArrayOfbyte1, b + n, i1);
      arrayOfInt2[k] = Pack.littleEndianToInt_Low(paramArrayOfbyte1, i + n, i1);
      arrayOfInt3[k] = Pack.littleEndianToInt_Low(paramArrayOfbyte1, j + n, i1);
    } 
    if (!is_picnic3(this.parameters)) {
      Signature signature = new Signature(this);
      int n = sign_picnic1(arrayOfInt1, arrayOfInt2, arrayOfInt3, paramArrayOfbyte2, signature);
      if (n != 0) {
        LOG.fine("Failed to create signature");
        return false;
      } 
      int i1 = serializeSignature(signature, paramArrayOfbyte3, paramArrayOfbyte2.length + 4);
      if (i1 < 0) {
        LOG.fine("Failed to serialize signature");
        return false;
      } 
      this.signatureLength = i1;
      Pack.intToLittleEndian(i1, paramArrayOfbyte3, 0);
      return true;
    } 
    Signature2 signature2 = new Signature2(this);
    boolean bool = sign_picnic3(arrayOfInt1, arrayOfInt2, arrayOfInt3, paramArrayOfbyte2, signature2);
    if (!bool) {
      LOG.fine("Failed to create signature");
      return false;
    } 
    int m = serializeSignature2(signature2, paramArrayOfbyte3, paramArrayOfbyte2.length + 4);
    if (m < 0) {
      LOG.fine("Failed to serialize signature");
      return false;
    } 
    this.signatureLength = m;
    Pack.intToLittleEndian(m, paramArrayOfbyte3, 0);
    return true;
  }
  
  int serializeSignature(Signature paramSignature, byte[] paramArrayOfbyte, int paramInt) {
    Signature.Proof[] arrayOfProof = paramSignature.proofs;
    byte[] arrayOfByte = paramSignature.challengeBits;
    int i = Utils.numBytes(2 * this.numMPCRounds) + 32 + this.numMPCRounds * (2 * this.seedSizeBytes + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes);
    if (this.transform == 1)
      i += this.UnruhGWithoutInputBytes * this.numMPCRounds; 
    if (this.CRYPTO_BYTES < i)
      return -1; 
    int j = paramInt;
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, j, Utils.numBytes(2 * this.numMPCRounds));
    j += Utils.numBytes(2 * this.numMPCRounds);
    System.arraycopy(paramSignature.salt, 0, paramArrayOfbyte, j, 32);
    j += 32;
    for (byte b = 0; b < this.numMPCRounds; b++) {
      int k = getChallenge(arrayOfByte, b);
      System.arraycopy((arrayOfProof[b]).view3Commitment, 0, paramArrayOfbyte, j, this.digestSizeBytes);
      j += this.digestSizeBytes;
      if (this.transform == 1) {
        int m = (k == 0) ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
        System.arraycopy((arrayOfProof[b]).view3UnruhG, 0, paramArrayOfbyte, j, m);
        j += m;
      } 
      System.arraycopy((arrayOfProof[b]).communicatedBits, 0, paramArrayOfbyte, j, this.andSizeBytes);
      j += this.andSizeBytes;
      System.arraycopy((arrayOfProof[b]).seed1, 0, paramArrayOfbyte, j, this.seedSizeBytes);
      j += this.seedSizeBytes;
      System.arraycopy((arrayOfProof[b]).seed2, 0, paramArrayOfbyte, j, this.seedSizeBytes);
      j += this.seedSizeBytes;
      if (k == 1 || k == 2) {
        Pack.intToLittleEndian((arrayOfProof[b]).inputShare, 0, this.stateSizeWords, paramArrayOfbyte, j);
        j += this.stateSizeBytes;
      } 
    } 
    return j - paramInt;
  }
  
  int getChallenge(byte[] paramArrayOfbyte, int paramInt) {
    return Utils.getCrumbAligned(paramArrayOfbyte, paramInt);
  }
  
  private int serializeSignature2(Signature2 paramSignature2, byte[] paramArrayOfbyte, int paramInt) {
    int i = this.digestSizeBytes + 32;
    i += paramSignature2.iSeedInfoLen;
    i += paramSignature2.cvInfoLen;
    int j;
    for (j = 0; j < this.numMPCRounds; j++) {
      if (contains(paramSignature2.challengeC, this.numOpenedRounds, j)) {
        int k = paramSignature2.challengeP[indexOf(paramSignature2.challengeC, this.numOpenedRounds, j)];
        i += (paramSignature2.proofs[j]).seedInfoLen;
        if (k != this.numMPCParties - 1)
          i += this.andSizeBytes; 
        i += this.stateSizeBytes;
        i += this.andSizeBytes;
        i += this.digestSizeBytes;
      } 
    } 
    if (paramArrayOfbyte.length < i)
      return -1; 
    j = paramInt;
    System.arraycopy(paramSignature2.challengeHash, 0, paramArrayOfbyte, j, this.digestSizeBytes);
    j += this.digestSizeBytes;
    System.arraycopy(paramSignature2.salt, 0, paramArrayOfbyte, j, 32);
    j += 32;
    System.arraycopy(paramSignature2.iSeedInfo, 0, paramArrayOfbyte, j, paramSignature2.iSeedInfoLen);
    j += paramSignature2.iSeedInfoLen;
    System.arraycopy(paramSignature2.cvInfo, 0, paramArrayOfbyte, j, paramSignature2.cvInfoLen);
    j += paramSignature2.cvInfoLen;
    for (byte b = 0; b < this.numMPCRounds; b++) {
      if (contains(paramSignature2.challengeC, this.numOpenedRounds, b)) {
        System.arraycopy((paramSignature2.proofs[b]).seedInfo, 0, paramArrayOfbyte, j, (paramSignature2.proofs[b]).seedInfoLen);
        j += (paramSignature2.proofs[b]).seedInfoLen;
        int k = paramSignature2.challengeP[indexOf(paramSignature2.challengeC, this.numOpenedRounds, b)];
        if (k != this.numMPCParties - 1) {
          System.arraycopy((paramSignature2.proofs[b]).aux, 0, paramArrayOfbyte, j, this.andSizeBytes);
          j += this.andSizeBytes;
        } 
        System.arraycopy((paramSignature2.proofs[b]).input, 0, paramArrayOfbyte, j, this.stateSizeBytes);
        j += this.stateSizeBytes;
        System.arraycopy((paramSignature2.proofs[b]).msgs, 0, paramArrayOfbyte, j, this.andSizeBytes);
        j += this.andSizeBytes;
        System.arraycopy((paramSignature2.proofs[b]).C, 0, paramArrayOfbyte, j, this.digestSizeBytes);
        j += this.digestSizeBytes;
      } 
    } 
    return j - paramInt;
  }
  
  private int sign_picnic1(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, byte[] paramArrayOfbyte, Signature paramSignature) {
    View[][] arrayOfView = new View[this.numMPCRounds][3];
    byte[][][] arrayOfByte1 = new byte[this.numMPCRounds][this.numMPCParties][this.digestSizeBytes];
    byte[][][] arrayOfByte2 = new byte[this.numMPCRounds][3][this.UnruhGWithInputBytes];
    byte[] arrayOfByte3 = computeSeeds(paramArrayOfint1, paramArrayOfint2, paramArrayOfint3, paramArrayOfbyte);
    int i = this.numMPCParties * this.seedSizeBytes;
    System.arraycopy(arrayOfByte3, i * this.numMPCRounds, paramSignature.salt, 0, 32);
    Tape tape = new Tape(this);
    byte[] arrayOfByte4 = new byte[Math.max(9 * this.stateSizeBytes, this.stateSizeBytes + this.andSizeBytes)];
    byte b;
    for (b = 0; b < this.numMPCRounds; b++) {
      arrayOfView[b][0] = new View(this);
      arrayOfView[b][1] = new View(this);
      arrayOfView[b][2] = new View(this);
      for (byte b1 = 0; b1 < 2; b1++) {
        boolean bool1 = createRandomTape(arrayOfByte3, i * b + b1 * this.seedSizeBytes, paramSignature.salt, b, b1, arrayOfByte4, this.stateSizeBytes + this.andSizeBytes);
        if (!bool1) {
          LOG.fine("createRandomTape failed");
          return -1;
        } 
        int[] arrayOfInt = (arrayOfView[b][b1]).inputShare;
        Pack.littleEndianToInt(arrayOfByte4, 0, arrayOfInt);
        Utils.zeroTrailingBits(arrayOfInt, this.stateSizeBits);
        System.arraycopy(arrayOfByte4, this.stateSizeBytes, tape.tapes[b1], 0, this.andSizeBytes);
      } 
      boolean bool = createRandomTape(arrayOfByte3, i * b + 2 * this.seedSizeBytes, paramSignature.salt, b, 2, tape.tapes[2], this.andSizeBytes);
      if (!bool) {
        LOG.fine("createRandomTape failed");
        return -1;
      } 
      xor_three((arrayOfView[b][2]).inputShare, paramArrayOfint1, (arrayOfView[b][0]).inputShare, (arrayOfView[b][1]).inputShare);
      tape.pos = 0;
      int[] arrayOfInt1 = Pack.littleEndianToInt(arrayOfByte4, 0, arrayOfByte4.length / 4);
      mpc_LowMC(tape, arrayOfView[b], paramArrayOfint3, arrayOfInt1);
      Pack.intToLittleEndian(arrayOfInt1, arrayOfByte4, 0);
      int[] arrayOfInt2 = new int[16];
      xor_three(arrayOfInt2, (arrayOfView[b][0]).outputShare, (arrayOfView[b][1]).outputShare, (arrayOfView[b][2]).outputShare);
      if (!subarrayEquals(arrayOfInt2, paramArrayOfint2, this.stateSizeWords)) {
        LOG.fine("Simulation failed; output does not match public key (round = " + b + ")");
        return -1;
      } 
      Commit(arrayOfByte3, i * b + 0 * this.seedSizeBytes, arrayOfView[b][0], arrayOfByte1[b][0]);
      Commit(arrayOfByte3, i * b + 1 * this.seedSizeBytes, arrayOfView[b][1], arrayOfByte1[b][1]);
      Commit(arrayOfByte3, i * b + 2 * this.seedSizeBytes, arrayOfView[b][2], arrayOfByte1[b][2]);
      if (this.transform == 1) {
        G(0, arrayOfByte3, i * b + 0 * this.seedSizeBytes, arrayOfView[b][0], arrayOfByte2[b][0]);
        G(1, arrayOfByte3, i * b + 1 * this.seedSizeBytes, arrayOfView[b][1], arrayOfByte2[b][1]);
        G(2, arrayOfByte3, i * b + 2 * this.seedSizeBytes, arrayOfView[b][2], arrayOfByte2[b][2]);
      } 
    } 
    H3(paramArrayOfint2, paramArrayOfint3, arrayOfView, arrayOfByte1, paramSignature.challengeBits, paramSignature.salt, paramArrayOfbyte, arrayOfByte2);
    for (b = 0; b < this.numMPCRounds; b++) {
      Signature.Proof proof = paramSignature.proofs[b];
      prove(proof, getChallenge(paramSignature.challengeBits, b), arrayOfByte3, i * b, arrayOfView[b], arrayOfByte1[b], (this.transform != 1) ? null : arrayOfByte2[b]);
    } 
    return 0;
  }
  
  void prove(Signature.Proof paramProof, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, View[] paramArrayOfView, byte[][] paramArrayOfbyte1, byte[][] paramArrayOfbyte2) {
    if (paramInt1 == 0) {
      System.arraycopy(paramArrayOfbyte, paramInt2 + 0 * this.seedSizeBytes, paramProof.seed1, 0, this.seedSizeBytes);
      System.arraycopy(paramArrayOfbyte, paramInt2 + 1 * this.seedSizeBytes, paramProof.seed2, 0, this.seedSizeBytes);
    } else if (paramInt1 == 1) {
      System.arraycopy(paramArrayOfbyte, paramInt2 + 1 * this.seedSizeBytes, paramProof.seed1, 0, this.seedSizeBytes);
      System.arraycopy(paramArrayOfbyte, paramInt2 + 2 * this.seedSizeBytes, paramProof.seed2, 0, this.seedSizeBytes);
    } else if (paramInt1 == 2) {
      System.arraycopy(paramArrayOfbyte, paramInt2 + 2 * this.seedSizeBytes, paramProof.seed1, 0, this.seedSizeBytes);
      System.arraycopy(paramArrayOfbyte, paramInt2 + 0 * this.seedSizeBytes, paramProof.seed2, 0, this.seedSizeBytes);
    } else {
      LOG.fine("Invalid challenge");
      throw new IllegalArgumentException("challenge");
    } 
    if (paramInt1 == 1 || paramInt1 == 2)
      System.arraycopy((paramArrayOfView[2]).inputShare, 0, paramProof.inputShare, 0, this.stateSizeWords); 
    System.arraycopy((paramArrayOfView[(paramInt1 + 1) % 3]).communicatedBits, 0, paramProof.communicatedBits, 0, this.andSizeBytes);
    System.arraycopy(paramArrayOfbyte1[(paramInt1 + 2) % 3], 0, paramProof.view3Commitment, 0, this.digestSizeBytes);
    if (this.transform == 1) {
      int i = (paramInt1 == 0) ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
      System.arraycopy(paramArrayOfbyte2[(paramInt1 + 2) % 3], 0, paramProof.view3UnruhG, 0, i);
    } 
  }
  
  private void H3(int[] paramArrayOfint1, int[] paramArrayOfint2, View[][] paramArrayOfView, byte[][][] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[][][] paramArrayOfbyte5) {
    this.digest.update((byte)1);
    byte[] arrayOfByte = new byte[this.stateSizeWords * 4];
    for (byte b = 0; b < this.numMPCRounds; b++) {
      for (byte b1 = 0; b1 < 3; b1++) {
        Pack.intToLittleEndian((paramArrayOfView[b][b1]).outputShare, arrayOfByte, 0);
        this.digest.update(arrayOfByte, 0, this.stateSizeBytes);
      } 
    } 
    implH3(paramArrayOfint1, paramArrayOfint2, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, paramArrayOfbyte4, paramArrayOfbyte5);
  }
  
  private void H3(int[] paramArrayOfint1, int[] paramArrayOfint2, int[][][] paramArrayOfint, byte[][][] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[][][] paramArrayOfbyte5) {
    this.digest.update((byte)1);
    byte[] arrayOfByte = new byte[this.stateSizeWords * 4];
    for (byte b = 0; b < this.numMPCRounds; b++) {
      for (byte b1 = 0; b1 < 3; b1++) {
        Pack.intToLittleEndian(paramArrayOfint[b][b1], arrayOfByte, 0);
        this.digest.update(arrayOfByte, 0, this.stateSizeBytes);
      } 
    } 
    implH3(paramArrayOfint1, paramArrayOfint2, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, paramArrayOfbyte4, paramArrayOfbyte5);
  }
  
  private void implH3(int[] paramArrayOfint1, int[] paramArrayOfint2, byte[][][] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[][][] paramArrayOfbyte5) {
    byte[] arrayOfByte = new byte[this.digestSizeBytes];
    paramArrayOfbyte2[Utils.numBytes(this.numMPCRounds * 2) - 1] = 0;
    byte b;
    for (b = 0; b < this.numMPCRounds; b++) {
      for (byte b1 = 0; b1 < 3; b1++)
        this.digest.update(paramArrayOfbyte1[b][b1], 0, this.digestSizeBytes); 
    } 
    if (this.transform == 1)
      for (b = 0; b < this.numMPCRounds; b++) {
        for (byte b1 = 0; b1 < 3; b1++) {
          int i = (b1 == 2) ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
          this.digest.update(paramArrayOfbyte5[b][b1], 0, i);
        } 
      }  
    this.digest.update(Pack.intToLittleEndian(paramArrayOfint1), 0, this.stateSizeBytes);
    this.digest.update(Pack.intToLittleEndian(paramArrayOfint2), 0, this.stateSizeBytes);
    this.digest.update(paramArrayOfbyte3, 0, 32);
    this.digest.update(paramArrayOfbyte4, 0, paramArrayOfbyte4.length);
    this.digest.doFinal(arrayOfByte, 0, this.digestSizeBytes);
    b = 0;
    boolean bool = true;
    while (bool) {
      for (byte b1 = 0; b1 < this.digestSizeBytes; b1++) {
        byte b2 = arrayOfByte[b1];
        for (byte b3 = 0; b3 < 8; b3 += 2) {
          int i = b2 >>> 6 - b3 & 0x3;
          if (i < 3) {
            setChallenge(paramArrayOfbyte2, b, i);
            if (++b == this.numMPCRounds) {
              bool = false;
              break;
            } 
          } 
        } 
        if (!bool)
          break; 
      } 
      if (!bool)
        break; 
      this.digest.update((byte)1);
      this.digest.update(arrayOfByte, 0, this.digestSizeBytes);
      this.digest.doFinal(arrayOfByte, 0, this.digestSizeBytes);
    } 
  }
  
  private void setChallenge(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    Utils.setBit(paramArrayOfbyte, 2 * paramInt1, (byte)(paramInt2 & 0x1));
    Utils.setBit(paramArrayOfbyte, 2 * paramInt1 + 1, (byte)(paramInt2 >>> 1 & 0x1));
  }
  
  private void G(int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, View paramView, byte[] paramArrayOfbyte2) {
    int i = this.seedSizeBytes + this.andSizeBytes;
    this.digest.update((byte)5);
    this.digest.update(paramArrayOfbyte1, paramInt2, this.seedSizeBytes);
    this.digest.doFinal(paramArrayOfbyte2, 0, this.digestSizeBytes);
    this.digest.update(paramArrayOfbyte2, 0, this.digestSizeBytes);
    if (paramInt1 == 2) {
      this.digest.update(Pack.intToLittleEndian(paramView.inputShare), 0, this.stateSizeBytes);
      i += this.stateSizeBytes;
    } 
    this.digest.update(paramView.communicatedBits, 0, this.andSizeBytes);
    this.digest.update(Pack.intToLittleEndian(i), 0, 2);
    this.digest.doFinal(paramArrayOfbyte2, 0, i);
  }
  
  private void mpc_LowMC(Tape paramTape, View[] paramArrayOfView, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    Arrays.fill(paramArrayOfint2, 0, paramArrayOfint2.length, 0);
    mpc_xor_constant(paramArrayOfint2, 3 * this.stateSizeWords, paramArrayOfint1, 0, this.stateSizeWords);
    KMatricesWithPointer kMatricesWithPointer = this.lowmcConstants.KMatrix(this, 0);
    byte b;
    for (b = 0; b < 3; b++)
      matrix_mul_offset(paramArrayOfint2, b * this.stateSizeWords, (paramArrayOfView[b]).inputShare, 0, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer()); 
    mpc_xor(paramArrayOfint2, paramArrayOfint2, 3);
    for (b = 1; b <= this.numRounds; b++) {
      kMatricesWithPointer = this.lowmcConstants.KMatrix(this, b);
      for (byte b1 = 0; b1 < 3; b1++)
        matrix_mul_offset(paramArrayOfint2, b1 * this.stateSizeWords, (paramArrayOfView[b1]).inputShare, 0, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer()); 
      mpc_substitution(paramArrayOfint2, paramTape, paramArrayOfView);
      kMatricesWithPointer = this.lowmcConstants.LMatrix(this, b - 1);
      mpc_matrix_mul(paramArrayOfint2, 3 * this.stateSizeWords, paramArrayOfint2, 3 * this.stateSizeWords, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer(), 3);
      kMatricesWithPointer = this.lowmcConstants.RConstant(this, b - 1);
      mpc_xor_constant(paramArrayOfint2, 3 * this.stateSizeWords, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer(), this.stateSizeWords);
      mpc_xor(paramArrayOfint2, paramArrayOfint2, 3);
    } 
    for (b = 0; b < 3; b++)
      System.arraycopy(paramArrayOfint2, (3 + b) * this.stateSizeWords, (paramArrayOfView[b]).outputShare, 0, this.stateSizeWords); 
  }
  
  private void Commit(byte[] paramArrayOfbyte1, int paramInt, View paramView, byte[] paramArrayOfbyte2) {
    this.digest.update((byte)4);
    this.digest.update(paramArrayOfbyte1, paramInt, this.seedSizeBytes);
    this.digest.doFinal(paramArrayOfbyte2, 0, this.digestSizeBytes);
    this.digest.update((byte)0);
    this.digest.update(paramArrayOfbyte2, 0, this.digestSizeBytes);
    this.digest.update(Pack.intToLittleEndian(paramView.inputShare), 0, this.stateSizeBytes);
    this.digest.update(paramView.communicatedBits, 0, this.andSizeBytes);
    this.digest.update(Pack.intToLittleEndian(paramView.outputShare), 0, this.stateSizeBytes);
    this.digest.doFinal(paramArrayOfbyte2, 0, this.digestSizeBytes);
  }
  
  private void mpc_substitution(int[] paramArrayOfint, Tape paramTape, View[] paramArrayOfView) {
    int[] arrayOfInt1 = new int[3];
    int[] arrayOfInt2 = new int[3];
    int[] arrayOfInt3 = new int[3];
    int[] arrayOfInt4 = new int[3];
    int[] arrayOfInt5 = new int[3];
    int[] arrayOfInt6 = new int[3];
    for (byte b = 0; b < this.numSboxes * 3; b += 3) {
      byte b1;
      for (b1 = 0; b1 < 3; b1++) {
        int i = (3 + b1) * this.stateSizeWords * 32;
        arrayOfInt1[b1] = Utils.getBitFromWordArray(paramArrayOfint, i + b + 2);
        arrayOfInt2[b1] = Utils.getBitFromWordArray(paramArrayOfint, i + b + 1);
        arrayOfInt3[b1] = Utils.getBitFromWordArray(paramArrayOfint, i + b);
      } 
      mpc_AND(arrayOfInt1, arrayOfInt2, arrayOfInt4, paramTape, paramArrayOfView);
      mpc_AND(arrayOfInt2, arrayOfInt3, arrayOfInt5, paramTape, paramArrayOfView);
      mpc_AND(arrayOfInt3, arrayOfInt1, arrayOfInt6, paramTape, paramArrayOfView);
      for (b1 = 0; b1 < 3; b1++) {
        int i = (3 + b1) * this.stateSizeWords * 32;
        Utils.setBitInWordArray(paramArrayOfint, i + b + 2, arrayOfInt1[b1] ^ arrayOfInt5[b1]);
        Utils.setBitInWordArray(paramArrayOfint, i + b + 1, arrayOfInt1[b1] ^ arrayOfInt2[b1] ^ arrayOfInt6[b1]);
        Utils.setBitInWordArray(paramArrayOfint, i + b, arrayOfInt1[b1] ^ arrayOfInt2[b1] ^ arrayOfInt3[b1] ^ arrayOfInt4[b1]);
      } 
    } 
  }
  
  private void mpc_AND(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, Tape paramTape, View[] paramArrayOfView) {
    byte b1 = Utils.getBit(paramTape.tapes[0], paramTape.pos);
    byte b2 = Utils.getBit(paramTape.tapes[1], paramTape.pos);
    byte b3 = Utils.getBit(paramTape.tapes[2], paramTape.pos);
    paramArrayOfint3[0] = paramArrayOfint1[0] & paramArrayOfint2[1] ^ paramArrayOfint1[1] & paramArrayOfint2[0] ^ paramArrayOfint1[0] & paramArrayOfint2[0] ^ b1 ^ b2;
    paramArrayOfint3[1] = paramArrayOfint1[1] & paramArrayOfint2[2] ^ paramArrayOfint1[2] & paramArrayOfint2[1] ^ paramArrayOfint1[1] & paramArrayOfint2[1] ^ b2 ^ b3;
    paramArrayOfint3[2] = paramArrayOfint1[2] & paramArrayOfint2[0] ^ paramArrayOfint1[0] & paramArrayOfint2[2] ^ paramArrayOfint1[2] & paramArrayOfint2[2] ^ b3 ^ b1;
    Utils.setBit((paramArrayOfView[0]).communicatedBits, paramTape.pos, (byte)paramArrayOfint3[0]);
    Utils.setBit((paramArrayOfView[1]).communicatedBits, paramTape.pos, (byte)paramArrayOfint3[1]);
    Utils.setBit((paramArrayOfView[2]).communicatedBits, paramTape.pos, (byte)paramArrayOfint3[2]);
    paramTape.pos++;
  }
  
  private void mpc_xor(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt) {
    byte b = 0;
    int i = this.stateSizeWords * paramInt;
    while (b < i) {
      paramArrayOfint1[paramInt * this.stateSizeWords + b] = paramArrayOfint1[paramInt * this.stateSizeWords + b] ^ paramArrayOfint2[b];
      b++;
    } 
  }
  
  private void mpc_matrix_mul(int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2, int[] paramArrayOfint3, int paramInt3, int paramInt4) {
    for (byte b = 0; b < paramInt4; b++)
      matrix_mul_offset(paramArrayOfint1, paramInt1 + b * this.stateSizeWords, paramArrayOfint2, paramInt2 + b * this.stateSizeWords, paramArrayOfint3, paramInt3); 
  }
  
  private void mpc_xor_constant(int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2, int paramInt3) {
    for (byte b = 0; b < paramInt3; b++)
      paramArrayOfint1[b + paramInt1] = paramArrayOfint1[b + paramInt1] ^ paramArrayOfint2[b + paramInt2]; 
  }
  
  private boolean createRandomTape(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3, byte[] paramArrayOfbyte3, int paramInt4) {
    if (paramInt4 < this.digestSizeBytes)
      return false; 
    this.digest.update((byte)2);
    this.digest.update(paramArrayOfbyte1, paramInt1, this.seedSizeBytes);
    this.digest.doFinal(paramArrayOfbyte3, 0, this.digestSizeBytes);
    this.digest.update(paramArrayOfbyte3, 0, this.digestSizeBytes);
    this.digest.update(paramArrayOfbyte2, 0, 32);
    this.digest.update(Pack.intToLittleEndian(paramInt2), 0, 2);
    this.digest.update(Pack.intToLittleEndian(paramInt3), 0, 2);
    this.digest.update(Pack.intToLittleEndian(paramInt4), 0, 2);
    this.digest.doFinal(paramArrayOfbyte3, 0, paramInt4);
    return true;
  }
  
  private byte[] computeSeeds(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = new byte[this.seedSizeBytes * this.numMPCParties * this.numMPCRounds + 32];
    byte[] arrayOfByte2 = new byte[32];
    updateDigest(paramArrayOfint1, arrayOfByte2);
    this.digest.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    updateDigest(paramArrayOfint2, arrayOfByte2);
    updateDigest(paramArrayOfint3, arrayOfByte2);
    this.digest.update(Pack.intToLittleEndian(this.stateSizeBits), 0, 2);
    this.digest.doFinal(arrayOfByte1, 0, this.seedSizeBytes * this.numMPCParties * this.numMPCRounds + 32);
    return arrayOfByte1;
  }
  
  private boolean sign_picnic3(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, byte[] paramArrayOfbyte, Signature2 paramSignature2) {
    byte[] arrayOfByte1 = new byte[32 + this.seedSizeBytes];
    computeSaltAndRootSeed(arrayOfByte1, paramArrayOfint1, paramArrayOfint2, paramArrayOfint3, paramArrayOfbyte);
    byte[] arrayOfByte2 = Arrays.copyOfRange(arrayOfByte1, 32, arrayOfByte1.length);
    paramSignature2.salt = Arrays.copyOfRange(arrayOfByte1, 0, 32);
    Tree tree1 = new Tree(this, this.numMPCRounds, this.seedSizeBytes);
    tree1.generateSeeds(arrayOfByte2, paramSignature2.salt, 0);
    byte[][] arrayOfByte3 = tree1.getLeaves();
    int i = tree1.getLeavesOffset();
    Tape[] arrayOfTape = new Tape[this.numMPCRounds];
    Tree[] arrayOfTree = new Tree[this.numMPCRounds];
    for (byte b1 = 0; b1 < this.numMPCRounds; b1++) {
      arrayOfTape[b1] = new Tape(this);
      arrayOfTree[b1] = new Tree(this, this.numMPCParties, this.seedSizeBytes);
      arrayOfTree[b1].generateSeeds(arrayOfByte3[b1 + i], paramSignature2.salt, b1);
      createRandomTapes(arrayOfTape[b1], arrayOfTree[b1].getLeaves(), arrayOfTree[b1].getLeavesOffset(), paramSignature2.salt, b1);
    } 
    byte[][] arrayOfByte4 = new byte[this.numMPCRounds][this.stateSizeWords * 4];
    byte[] arrayOfByte5 = new byte[176];
    for (byte b2 = 0; b2 < this.numMPCRounds; b2++)
      arrayOfTape[b2].computeAuxTape(arrayOfByte4[b2]); 
    byte[][][] arrayOfByte = new byte[this.numMPCRounds][this.numMPCParties][this.digestSizeBytes];
    for (byte b3 = 0; b3 < this.numMPCRounds; b3++) {
      int k;
      for (k = 0; k < this.numMPCParties - 1; k++)
        commit(arrayOfByte[b3][k], arrayOfTree[b3].getLeaf(k), null, paramSignature2.salt, b3, k); 
      k = this.numMPCParties - 1;
      getAuxBits(arrayOfByte5, arrayOfTape[b3]);
      commit(arrayOfByte[b3][k], arrayOfTree[b3].getLeaf(k), arrayOfByte5, paramSignature2.salt, b3, k);
    } 
    Msg[] arrayOfMsg = new Msg[this.numMPCRounds];
    int[] arrayOfInt1 = new int[this.stateSizeBits];
    for (byte b4 = 0; b4 < this.numMPCRounds; b4++) {
      arrayOfMsg[b4] = new Msg(this);
      int[] arrayOfInt = Pack.littleEndianToInt(arrayOfByte4[b4], 0, this.stateSizeWords);
      xor_array(arrayOfInt, arrayOfInt, paramArrayOfint1, 0);
      int k = simulateOnline(arrayOfInt, arrayOfTape[b4], arrayOfInt1, arrayOfMsg[b4], paramArrayOfint3, paramArrayOfint2);
      if (k != 0) {
        LOG.fine("MPC simulation failed, aborting signature");
        return false;
      } 
      Pack.intToLittleEndian(arrayOfInt, arrayOfByte4[b4], 0);
    } 
    byte[][] arrayOfByte6 = new byte[this.numMPCRounds][this.digestSizeBytes];
    byte[][] arrayOfByte7 = new byte[this.numMPCRounds][this.digestSizeBytes];
    for (byte b5 = 0; b5 < this.numMPCRounds; b5++) {
      commit_h(arrayOfByte6[b5], arrayOfByte[b5]);
      commit_v(arrayOfByte7[b5], arrayOfByte4[b5], arrayOfMsg[b5]);
    } 
    Tree tree2 = new Tree(this, this.numMPCRounds, this.digestSizeBytes);
    tree2.buildMerkleTree(arrayOfByte7, paramSignature2.salt);
    paramSignature2.challengeC = new int[this.numOpenedRounds];
    paramSignature2.challengeP = new int[this.numOpenedRounds];
    paramSignature2.challengeHash = new byte[this.digestSizeBytes];
    HCP(paramSignature2.challengeHash, paramSignature2.challengeC, paramSignature2.challengeP, arrayOfByte6, tree2.nodes[0], paramSignature2.salt, paramArrayOfint2, paramArrayOfint3, paramArrayOfbyte);
    int j = this.numMPCRounds - this.numOpenedRounds;
    int[] arrayOfInt2 = getMissingLeavesList(paramSignature2.challengeC);
    int[] arrayOfInt3 = new int[1];
    paramSignature2.cvInfo = tree2.openMerkleTree(arrayOfInt2, j, arrayOfInt3);
    paramSignature2.cvInfoLen = arrayOfInt3[0];
    paramSignature2.iSeedInfo = new byte[this.numMPCRounds * this.seedSizeBytes];
    paramSignature2.iSeedInfoLen = tree1.revealSeeds(paramSignature2.challengeC, this.numOpenedRounds, paramSignature2.iSeedInfo, this.numMPCRounds * this.seedSizeBytes);
    paramSignature2.proofs = new Signature2.Proof2[this.numMPCRounds];
    for (byte b6 = 0; b6 < this.numMPCRounds; b6++) {
      if (contains(paramSignature2.challengeC, this.numOpenedRounds, b6)) {
        paramSignature2.proofs[b6] = new Signature2.Proof2(this);
        int k = indexOf(paramSignature2.challengeC, this.numOpenedRounds, b6);
        int[] arrayOfInt = new int[1];
        arrayOfInt[0] = paramSignature2.challengeP[k];
        (paramSignature2.proofs[b6]).seedInfo = new byte[this.numMPCParties * this.seedSizeBytes];
        (paramSignature2.proofs[b6]).seedInfoLen = arrayOfTree[b6].revealSeeds(arrayOfInt, 1, (paramSignature2.proofs[b6]).seedInfo, this.numMPCParties * this.seedSizeBytes);
        int m = this.numMPCParties - 1;
        if (paramSignature2.challengeP[k] != m)
          getAuxBits((paramSignature2.proofs[b6]).aux, arrayOfTape[b6]); 
        System.arraycopy(arrayOfByte4[b6], 0, (paramSignature2.proofs[b6]).input, 0, this.stateSizeBytes);
        System.arraycopy((arrayOfMsg[b6]).msgs[paramSignature2.challengeP[k]], 0, (paramSignature2.proofs[b6]).msgs, 0, this.andSizeBytes);
        System.arraycopy(arrayOfByte[b6][paramSignature2.challengeP[k]], 0, (paramSignature2.proofs[b6]).C, 0, this.digestSizeBytes);
      } 
    } 
    return true;
  }
  
  static int indexOf(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    for (byte b = 0; b < paramInt1; b++) {
      if (paramArrayOfint[b] == paramInt2)
        return b; 
    } 
    return -1;
  }
  
  private int[] getMissingLeavesList(int[] paramArrayOfint) {
    int i = this.numMPCRounds - this.numOpenedRounds;
    int[] arrayOfInt = new int[i];
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.numMPCRounds; b2++) {
      if (!contains(paramArrayOfint, this.numOpenedRounds, b2)) {
        arrayOfInt[b1] = b2;
        b1++;
      } 
    } 
    return arrayOfInt;
  }
  
  private void HCP(byte[] paramArrayOfbyte1, int[] paramArrayOfint1, int[] paramArrayOfint2, byte[][] paramArrayOfbyte, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int[] paramArrayOfint3, int[] paramArrayOfint4, byte[] paramArrayOfbyte4) {
    for (byte b = 0; b < this.numMPCRounds; b++)
      this.digest.update(paramArrayOfbyte[b], 0, this.digestSizeBytes); 
    byte[] arrayOfByte = new byte[32];
    this.digest.update(paramArrayOfbyte2, 0, this.digestSizeBytes);
    this.digest.update(paramArrayOfbyte3, 0, 32);
    updateDigest(paramArrayOfint3, arrayOfByte);
    updateDigest(paramArrayOfint4, arrayOfByte);
    this.digest.update(paramArrayOfbyte4, 0, paramArrayOfbyte4.length);
    this.digest.doFinal(paramArrayOfbyte1, 0, this.digestSizeBytes);
    if (paramArrayOfint1 != null && paramArrayOfint2 != null)
      expandChallengeHash(paramArrayOfbyte1, paramArrayOfint1, paramArrayOfint2); 
  }
  
  static int bitsToChunks(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int[] paramArrayOfint) {
    if (paramInt1 > paramInt2 * 8)
      return 0; 
    int i = paramInt2 * 8 / paramInt1;
    for (byte b = 0; b < i; b++) {
      paramArrayOfint[b] = 0;
      for (byte b1 = 0; b1 < paramInt1; b1++)
        paramArrayOfint[b] = paramArrayOfint[b] + (Utils.getBit(paramArrayOfbyte, b * paramInt1 + b1) << b1); 
    } 
    return i;
  }
  
  static int appendUnique(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    if (paramInt2 == 0) {
      paramArrayOfint[paramInt2] = paramInt1;
      return paramInt2 + 1;
    } 
    for (byte b = 0; b < paramInt2; b++) {
      if (paramArrayOfint[b] == paramInt1)
        return paramInt2; 
    } 
    paramArrayOfint[paramInt2] = paramInt1;
    return paramInt2 + 1;
  }
  
  private void expandChallengeHash(byte[] paramArrayOfbyte, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int i = Utils.ceil_log2(this.numMPCRounds);
    int j = Utils.ceil_log2(this.numMPCParties);
    int[] arrayOfInt = new int[this.digestSizeBytes * 8 / Math.min(i, j)];
    byte[] arrayOfByte = new byte[64];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, this.digestSizeBytes);
    int k = 0;
    while (k < this.numOpenedRounds) {
      int m = bitsToChunks(i, arrayOfByte, this.digestSizeBytes, arrayOfInt);
      for (byte b1 = 0; b1 < m; b1++) {
        if (arrayOfInt[b1] < this.numMPCRounds)
          k = appendUnique(paramArrayOfint1, arrayOfInt[b1], k); 
        if (k == this.numOpenedRounds)
          break; 
      } 
      this.digest.update((byte)1);
      this.digest.update(arrayOfByte, 0, this.digestSizeBytes);
      this.digest.doFinal(arrayOfByte, 0, this.digestSizeBytes);
    } 
    byte b = 0;
    while (b < this.numOpenedRounds) {
      int m = bitsToChunks(j, arrayOfByte, this.digestSizeBytes, arrayOfInt);
      for (byte b1 = 0; b1 < m; b1++) {
        if (arrayOfInt[b1] < this.numMPCParties) {
          paramArrayOfint2[b] = arrayOfInt[b1];
          b++;
        } 
        if (b == this.numOpenedRounds)
          break; 
      } 
      this.digest.update((byte)1);
      this.digest.update(arrayOfByte, 0, this.digestSizeBytes);
      this.digest.doFinal(arrayOfByte, 0, this.digestSizeBytes);
    } 
  }
  
  private void commit_h(byte[] paramArrayOfbyte, byte[][] paramArrayOfbyte1) {
    for (byte b = 0; b < this.numMPCParties; b++)
      this.digest.update(paramArrayOfbyte1[b], 0, this.digestSizeBytes); 
    this.digest.doFinal(paramArrayOfbyte, 0, this.digestSizeBytes);
  }
  
  private void commit_v(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Msg paramMsg) {
    this.digest.update(paramArrayOfbyte2, 0, this.stateSizeBytes);
    for (byte b = 0; b < this.numMPCParties; b++) {
      int i = Utils.numBytes(paramMsg.pos);
      this.digest.update(paramMsg.msgs[b], 0, i);
    } 
    this.digest.doFinal(paramArrayOfbyte1, 0, this.digestSizeBytes);
  }
  
  private int simulateOnline(int[] paramArrayOfint1, Tape paramTape, int[] paramArrayOfint2, Msg paramMsg, int[] paramArrayOfint3, int[] paramArrayOfint4) {
    byte b = 0;
    int[] arrayOfInt1 = new int[16];
    int[] arrayOfInt2 = new int[16];
    KMatricesWithPointer kMatricesWithPointer = this.lowmcConstants.KMatrix(this, 0);
    matrix_mul(arrayOfInt1, paramArrayOfint1, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
    xor_array(arrayOfInt2, arrayOfInt1, paramArrayOfint3, 0);
    for (byte b1 = 1; b1 <= this.numRounds; b1++) {
      tapesToWords(paramArrayOfint2, paramTape);
      mpc_sbox(arrayOfInt2, paramArrayOfint2, paramTape, paramMsg);
      kMatricesWithPointer = this.lowmcConstants.LMatrix(this, b1 - 1);
      matrix_mul(arrayOfInt2, arrayOfInt2, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
      kMatricesWithPointer = this.lowmcConstants.RConstant(this, b1 - 1);
      xor_array(arrayOfInt2, arrayOfInt2, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
      kMatricesWithPointer = this.lowmcConstants.KMatrix(this, b1);
      matrix_mul(arrayOfInt1, paramArrayOfint1, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
      xor_array(arrayOfInt2, arrayOfInt1, arrayOfInt2, 0);
    } 
    if (!subarrayEquals(arrayOfInt2, paramArrayOfint4, this.stateSizeWords))
      b = -1; 
    return b;
  }
  
  private void createRandomTapes(Tape paramTape, byte[][] paramArrayOfbyte, int paramInt1, byte[] paramArrayOfbyte1, int paramInt2) {
    int i = 2 * this.andSizeBytes;
    for (byte b = 0; b < this.numMPCParties; b++) {
      this.digest.update(paramArrayOfbyte[b + paramInt1], 0, this.seedSizeBytes);
      this.digest.update(paramArrayOfbyte1, 0, 32);
      this.digest.update(Pack.intToLittleEndian(paramInt2), 0, 2);
      this.digest.update(Pack.intToLittleEndian(b), 0, 2);
      this.digest.doFinal(paramTape.tapes[b], 0, i);
    } 
  }
  
  private static boolean subarrayEquals(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    if (paramArrayOfbyte1.length < paramInt || paramArrayOfbyte2.length < paramInt)
      return false; 
    for (byte b = 0; b < paramInt; b++) {
      if (paramArrayOfbyte1[b] != paramArrayOfbyte2[b])
        return false; 
    } 
    return true;
  }
  
  private static boolean subarrayEquals(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt) {
    if (paramArrayOfint1.length < paramInt || paramArrayOfint2.length < paramInt)
      return false; 
    for (byte b = 0; b < paramInt; b++) {
      if (paramArrayOfint1[b] != paramArrayOfint2[b])
        return false; 
    } 
    return true;
  }
  
  static int extend(int paramInt) {
    return paramInt - 1 ^ 0xFFFFFFFF;
  }
  
  private void wordToMsgs(int paramInt, Msg paramMsg) {
    for (byte b = 0; b < this.numMPCParties; b++) {
      int i = Utils.getBit(paramInt, b);
      Utils.setBit(paramMsg.msgs[b], paramMsg.pos, (byte)i);
    } 
    paramMsg.pos++;
  }
  
  private int mpc_AND(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Tape paramTape, Msg paramMsg) {
    int i = paramTape.tapesToWord();
    int j = extend(paramInt1) & paramInt4 ^ extend(paramInt2) & paramInt3 ^ i;
    if (paramMsg.unopened >= 0) {
      byte b = Utils.getBit(paramMsg.msgs[paramMsg.unopened], paramMsg.pos);
      j = Utils.setBit(j, paramMsg.unopened, b);
    } 
    wordToMsgs(j, paramMsg);
    return Utils.parity16(j) ^ paramInt1 & paramInt2;
  }
  
  private void mpc_sbox(int[] paramArrayOfint1, int[] paramArrayOfint2, Tape paramTape, Msg paramMsg) {
    for (byte b = 0; b < this.numSboxes * 3; b += 3) {
      int i = Utils.getBitFromWordArray(paramArrayOfint1, b + 2);
      int j = paramArrayOfint2[b + 2];
      int k = Utils.getBitFromWordArray(paramArrayOfint1, b + 1);
      int m = paramArrayOfint2[b + 1];
      int n = Utils.getBitFromWordArray(paramArrayOfint1, b);
      int i1 = paramArrayOfint2[b];
      int i2 = mpc_AND(i, k, j, m, paramTape, paramMsg);
      int i3 = mpc_AND(k, n, m, i1, paramTape, paramMsg);
      int i4 = mpc_AND(n, i, i1, j, paramTape, paramMsg);
      int i5 = i ^ i3;
      int i6 = i ^ k ^ i4;
      int i7 = i ^ k ^ n ^ i2;
      Utils.setBitInWordArray(paramArrayOfint1, b + 2, i5);
      Utils.setBitInWordArray(paramArrayOfint1, b + 1, i6);
      Utils.setBitInWordArray(paramArrayOfint1, b, i7);
    } 
  }
  
  protected void aux_mpc_sbox(int[] paramArrayOfint1, int[] paramArrayOfint2, Tape paramTape) {
    for (byte b = 0; b < this.numSboxes * 3; b += 3) {
      int i = Utils.getBitFromWordArray(paramArrayOfint1, b + 2);
      int j = Utils.getBitFromWordArray(paramArrayOfint1, b + 1);
      int k = Utils.getBitFromWordArray(paramArrayOfint1, b);
      int m = Utils.getBitFromWordArray(paramArrayOfint2, b + 2);
      int n = Utils.getBitFromWordArray(paramArrayOfint2, b + 1);
      int i1 = Utils.getBitFromWordArray(paramArrayOfint2, b);
      int i2 = i1 ^ i ^ j ^ k;
      int i3 = m ^ i;
      int i4 = n ^ i ^ j;
      aux_mpc_AND(i, j, i2, paramTape);
      aux_mpc_AND(j, k, i3, paramTape);
      aux_mpc_AND(k, i, i4, paramTape);
    } 
  }
  
  private void aux_mpc_AND(int paramInt1, int paramInt2, int paramInt3, Tape paramTape) {
    int i = this.numMPCParties - 1;
    int j = paramTape.tapesToWord();
    j = Utils.parity16(j) ^ Utils.getBit(paramTape.tapes[i], paramTape.pos - 1);
    int k = paramInt1 & paramInt2 ^ j ^ paramInt3;
    Utils.setBit(paramTape.tapes[i], paramTape.pos - 1, (byte)(k & 0xFF));
  }
  
  private boolean contains(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    for (byte b = 0; b < paramInt1; b++) {
      if (paramArrayOfint[b] == paramInt2)
        return true; 
    } 
    return false;
  }
  
  private void tapesToWords(int[] paramArrayOfint, Tape paramTape) {
    for (byte b = 0; b < this.stateSizeBits; b++)
      paramArrayOfint[b] = paramTape.tapesToWord(); 
  }
  
  private void getAuxBits(byte[] paramArrayOfbyte, Tape paramTape) {
    byte[] arrayOfByte = paramTape.tapes[this.numMPCParties - 1];
    int i = this.stateSizeBits;
    byte b1 = 0;
    int j = 0;
    for (byte b2 = 0; b2 < this.numRounds; b2++) {
      j += i;
      for (byte b = 0; b < i; b++)
        Utils.setBit(paramArrayOfbyte, b1++, Utils.getBit(arrayOfByte, j++)); 
    } 
  }
  
  private void commit(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, int paramInt1, int paramInt2) {
    this.digest.update(paramArrayOfbyte2, 0, this.seedSizeBytes);
    if (paramArrayOfbyte3 != null)
      this.digest.update(paramArrayOfbyte3, 0, this.andSizeBytes); 
    this.digest.update(paramArrayOfbyte4, 0, 32);
    this.digest.update(Pack.intToLittleEndian(paramInt1), 0, 2);
    this.digest.update(Pack.intToLittleEndian(paramInt2), 0, 2);
    this.digest.doFinal(paramArrayOfbyte1, 0, this.digestSizeBytes);
  }
  
  private void computeSaltAndRootSeed(byte[] paramArrayOfbyte1, int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte = new byte[32];
    updateDigest(paramArrayOfint1, arrayOfByte);
    this.digest.update(paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
    updateDigest(paramArrayOfint2, arrayOfByte);
    updateDigest(paramArrayOfint3, arrayOfByte);
    Pack.shortToLittleEndian((short)this.stateSizeBits, arrayOfByte, 0);
    this.digest.update(arrayOfByte, 0, 2);
    this.digest.doFinal(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
  }
  
  private void updateDigest(int[] paramArrayOfint, byte[] paramArrayOfbyte) {
    Pack.intToLittleEndian(paramArrayOfint, paramArrayOfbyte, 0);
    this.digest.update(paramArrayOfbyte, 0, this.stateSizeBytes);
  }
  
  static boolean is_picnic3(int paramInt) {
    return (paramInt == 7 || paramInt == 8 || paramInt == 9);
  }
  
  public void crypto_sign_keypair(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, SecureRandom paramSecureRandom) {
    byte[] arrayOfByte1 = new byte[this.stateSizeWords * 4];
    byte[] arrayOfByte2 = new byte[this.stateSizeWords * 4];
    byte[] arrayOfByte3 = new byte[this.stateSizeWords * 4];
    picnic_keygen(arrayOfByte1, arrayOfByte2, arrayOfByte3, paramSecureRandom);
    picnic_write_public_key(arrayOfByte2, arrayOfByte1, paramArrayOfbyte1);
    picnic_write_private_key(arrayOfByte3, arrayOfByte2, arrayOfByte1, paramArrayOfbyte2);
  }
  
  private int picnic_write_private_key(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    int i = 1 + 3 * this.stateSizeBytes;
    if (paramArrayOfbyte4.length < i) {
      LOG.fine("Failed writing private key!");
      return -1;
    } 
    paramArrayOfbyte4[0] = (byte)this.parameters;
    System.arraycopy(paramArrayOfbyte1, 0, paramArrayOfbyte4, 1, this.stateSizeBytes);
    System.arraycopy(paramArrayOfbyte2, 0, paramArrayOfbyte4, 1 + this.stateSizeBytes, this.stateSizeBytes);
    System.arraycopy(paramArrayOfbyte3, 0, paramArrayOfbyte4, 1 + 2 * this.stateSizeBytes, this.stateSizeBytes);
    return i;
  }
  
  private int picnic_write_public_key(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    int i = 1 + 2 * this.stateSizeBytes;
    if (paramArrayOfbyte3.length < i) {
      LOG.fine("Failed writing public key!");
      return -1;
    } 
    paramArrayOfbyte3[0] = (byte)this.parameters;
    System.arraycopy(paramArrayOfbyte1, 0, paramArrayOfbyte3, 1, this.stateSizeBytes);
    System.arraycopy(paramArrayOfbyte2, 0, paramArrayOfbyte3, 1 + this.stateSizeBytes, this.stateSizeBytes);
    return i;
  }
  
  private void picnic_keygen(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, SecureRandom paramSecureRandom) {
    int[] arrayOfInt1 = new int[paramArrayOfbyte3.length / 4];
    int[] arrayOfInt2 = new int[paramArrayOfbyte1.length / 4];
    int[] arrayOfInt3 = new int[paramArrayOfbyte2.length / 4];
    paramSecureRandom.nextBytes(paramArrayOfbyte3);
    Pack.littleEndianToInt(paramArrayOfbyte3, 0, arrayOfInt1);
    Utils.zeroTrailingBits(arrayOfInt1, this.stateSizeBits);
    paramSecureRandom.nextBytes(paramArrayOfbyte1);
    Pack.littleEndianToInt(paramArrayOfbyte1, 0, arrayOfInt2);
    Utils.zeroTrailingBits(arrayOfInt2, this.stateSizeBits);
    LowMCEnc(arrayOfInt2, arrayOfInt3, arrayOfInt1);
    Pack.intToLittleEndian(arrayOfInt1, paramArrayOfbyte3, 0);
    Pack.intToLittleEndian(arrayOfInt2, paramArrayOfbyte1, 0);
    Pack.intToLittleEndian(arrayOfInt3, paramArrayOfbyte2, 0);
  }
  
  private void LowMCEnc(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3) {
    int[] arrayOfInt = new int[16];
    if (paramArrayOfint1 != paramArrayOfint2)
      System.arraycopy(paramArrayOfint1, 0, paramArrayOfint2, 0, this.stateSizeWords); 
    KMatricesWithPointer kMatricesWithPointer = this.lowmcConstants.KMatrix(this, 0);
    matrix_mul(arrayOfInt, paramArrayOfint3, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
    xor_array(paramArrayOfint2, paramArrayOfint2, arrayOfInt, 0);
    for (byte b = 1; b <= this.numRounds; b++) {
      kMatricesWithPointer = this.lowmcConstants.KMatrix(this, b);
      matrix_mul(arrayOfInt, paramArrayOfint3, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
      substitution(paramArrayOfint2);
      kMatricesWithPointer = this.lowmcConstants.LMatrix(this, b - 1);
      matrix_mul(paramArrayOfint2, paramArrayOfint2, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
      kMatricesWithPointer = this.lowmcConstants.RConstant(this, b - 1);
      xor_array(paramArrayOfint2, paramArrayOfint2, kMatricesWithPointer.getData(), kMatricesWithPointer.getMatrixPointer());
      xor_array(paramArrayOfint2, paramArrayOfint2, arrayOfInt, 0);
    } 
  }
  
  private void substitution(int[] paramArrayOfint) {
    for (byte b = 0; b < this.numSboxes * 3; b += 3) {
      int i = Utils.getBitFromWordArray(paramArrayOfint, b + 2);
      int j = Utils.getBitFromWordArray(paramArrayOfint, b + 1);
      int k = Utils.getBitFromWordArray(paramArrayOfint, b);
      Utils.setBitInWordArray(paramArrayOfint, b + 2, i ^ j & k);
      Utils.setBitInWordArray(paramArrayOfint, b + 1, i ^ j ^ i & k);
      Utils.setBitInWordArray(paramArrayOfint, b, i ^ j ^ k ^ i & j);
    } 
  }
  
  private void xor_three(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int[] paramArrayOfint4) {
    for (byte b = 0; b < this.stateSizeWords; b++)
      paramArrayOfint1[b] = paramArrayOfint2[b] ^ paramArrayOfint3[b] ^ paramArrayOfint4[b]; 
  }
  
  protected void xor_array(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int paramInt) {
    for (byte b = 0; b < this.stateSizeWords; b++)
      paramArrayOfint1[b] = paramArrayOfint2[b] ^ paramArrayOfint3[b + paramInt]; 
  }
  
  protected void matrix_mul(int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int paramInt) {
    matrix_mul_offset(paramArrayOfint1, 0, paramArrayOfint2, 0, paramArrayOfint3, paramInt);
  }
  
  protected void matrix_mul_offset(int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2, int[] paramArrayOfint3, int paramInt3) {
    int[] arrayOfInt = new int[16];
    arrayOfInt[this.stateSizeWords - 1] = 0;
    int i = this.stateSizeBits / 32;
    int j = this.stateSizeWords * 32 - this.stateSizeBits;
    int k = -1 >>> j;
    k = Bits.bitPermuteStepSimple(k, 1431655765, 1);
    k = Bits.bitPermuteStepSimple(k, 858993459, 2);
    k = Bits.bitPermuteStepSimple(k, 252645135, 4);
    for (byte b = 0; b < this.stateSizeBits; b++) {
      int m = 0;
      int n;
      for (n = 0; n < i; n++) {
        int i1 = b * this.stateSizeWords + n;
        m ^= paramArrayOfint2[paramInt2 + n] & paramArrayOfint3[paramInt3 + i1];
      } 
      if (j > 0) {
        n = b * this.stateSizeWords + i;
        m ^= paramArrayOfint2[paramInt2 + i] & paramArrayOfint3[paramInt3 + n] & k;
      } 
      Utils.setBit(arrayOfInt, b, Utils.parity32(m));
    } 
    System.arraycopy(arrayOfInt, 0, paramArrayOfint1, paramInt1, this.stateSizeWords);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\picnic\PicnicEngine.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */