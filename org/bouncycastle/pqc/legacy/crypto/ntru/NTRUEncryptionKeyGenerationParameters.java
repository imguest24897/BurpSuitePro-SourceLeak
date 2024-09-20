package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Arrays;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.util.DigestFactory;

public class NTRUEncryptionKeyGenerationParameters extends KeyGenerationParameters implements Cloneable {
  public static final NTRUEncryptionKeyGenerationParameters EES1087EP2 = new NTRUEncryptionKeyGenerationParameters(1087, 2048, 120, 120, 256, 13, 25, 14, true, new byte[] { 0, 6, 3 }, true, false, (Digest)new SHA512Digest());
  
  public static final NTRUEncryptionKeyGenerationParameters EES1171EP1 = new NTRUEncryptionKeyGenerationParameters(1171, 2048, 106, 106, 256, 13, 20, 15, true, new byte[] { 0, 6, 4 }, true, false, (Digest)new SHA512Digest());
  
  public static final NTRUEncryptionKeyGenerationParameters EES1499EP1 = new NTRUEncryptionKeyGenerationParameters(1499, 2048, 79, 79, 256, 13, 17, 19, true, new byte[] { 0, 6, 5 }, true, false, (Digest)new SHA512Digest());
  
  public static final NTRUEncryptionKeyGenerationParameters APR2011_439 = new NTRUEncryptionKeyGenerationParameters(439, 2048, 146, 130, 128, 9, 32, 9, true, new byte[] { 0, 7, 101 }, true, false, (Digest)new SHA256Digest());
  
  public static final NTRUEncryptionKeyGenerationParameters APR2011_439_FAST = new NTRUEncryptionKeyGenerationParameters(439, 2048, 9, 8, 5, 130, 128, 9, 32, 9, true, new byte[] { 0, 7, 101 }, true, true, (Digest)new SHA256Digest());
  
  public static final NTRUEncryptionKeyGenerationParameters APR2011_743 = new NTRUEncryptionKeyGenerationParameters(743, 2048, 248, 220, 256, 10, 27, 14, true, new byte[] { 0, 7, 105 }, false, false, (Digest)new SHA512Digest());
  
  public static final NTRUEncryptionKeyGenerationParameters APR2011_743_FAST = new NTRUEncryptionKeyGenerationParameters(743, 2048, 11, 11, 15, 220, 256, 10, 27, 14, true, new byte[] { 0, 7, 105 }, false, true, (Digest)new SHA512Digest());
  
  public int N;
  
  public int q;
  
  public int df;
  
  public int df1;
  
  public int df2;
  
  public int df3;
  
  public int dr;
  
  public int dr1;
  
  public int dr2;
  
  public int dr3;
  
  public int dg;
  
  int llen;
  
  public int maxMsgLenBytes;
  
  public int db;
  
  public int bufferLenBits;
  
  int bufferLenTrits;
  
  public int dm0;
  
  public int pkLen;
  
  public int c;
  
  public int minCallsR;
  
  public int minCallsMask;
  
  public boolean hashSeed;
  
  public byte[] oid;
  
  public boolean sparse;
  
  public boolean fastFp;
  
  public int polyType;
  
  public Digest hashAlg;
  
  public NTRUEncryptionKeyGenerationParameters(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean1, byte[] paramArrayOfbyte, boolean paramBoolean2, boolean paramBoolean3, Digest paramDigest, SecureRandom paramSecureRandom) {
    super((null != paramSecureRandom) ? paramSecureRandom : CryptoServicesRegistrar.getSecureRandom(), paramInt5);
    this.N = paramInt1;
    this.q = paramInt2;
    this.df = paramInt3;
    this.db = paramInt5;
    this.dm0 = paramInt4;
    this.c = paramInt6;
    this.minCallsR = paramInt7;
    this.minCallsMask = paramInt8;
    this.hashSeed = paramBoolean1;
    this.oid = paramArrayOfbyte;
    this.sparse = paramBoolean2;
    this.fastFp = paramBoolean3;
    this.polyType = 0;
    this.hashAlg = paramDigest;
    init();
  }
  
  public NTRUEncryptionKeyGenerationParameters(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean1, byte[] paramArrayOfbyte, boolean paramBoolean2, boolean paramBoolean3, Digest paramDigest) {
    this(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean1, paramArrayOfbyte, paramBoolean2, paramBoolean3, paramDigest, null);
  }
  
  public NTRUEncryptionKeyGenerationParameters(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, boolean paramBoolean1, byte[] paramArrayOfbyte, boolean paramBoolean2, boolean paramBoolean3, Digest paramDigest, SecureRandom paramSecureRandom) {
    super((null != paramSecureRandom) ? paramSecureRandom : CryptoServicesRegistrar.getSecureRandom(), paramInt7);
    this.N = paramInt1;
    this.q = paramInt2;
    this.df1 = paramInt3;
    this.df2 = paramInt4;
    this.df3 = paramInt5;
    this.db = paramInt7;
    this.dm0 = paramInt6;
    this.c = paramInt8;
    this.minCallsR = paramInt9;
    this.minCallsMask = paramInt10;
    this.hashSeed = paramBoolean1;
    this.oid = paramArrayOfbyte;
    this.sparse = paramBoolean2;
    this.fastFp = paramBoolean3;
    this.polyType = 1;
    this.hashAlg = paramDigest;
    init();
  }
  
  public NTRUEncryptionKeyGenerationParameters(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, boolean paramBoolean1, byte[] paramArrayOfbyte, boolean paramBoolean2, boolean paramBoolean3, Digest paramDigest) {
    this(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramBoolean1, paramArrayOfbyte, paramBoolean2, paramBoolean3, paramDigest, null);
  }
  
  private void init() {
    this.dr = this.df;
    this.dr1 = this.df1;
    this.dr2 = this.df2;
    this.dr3 = this.df3;
    this.dg = this.N / 3;
    this.llen = 1;
    this.maxMsgLenBytes = this.N * 3 / 2 / 8 - this.llen - this.db / 8 - 1;
    this.bufferLenBits = (this.N * 3 / 2 + 7) / 8 * 8 + 1;
    this.bufferLenTrits = this.N - 1;
    this.pkLen = this.db;
  }
  
  public NTRUEncryptionKeyGenerationParameters(InputStream paramInputStream) throws IOException {
    super(CryptoServicesRegistrar.getSecureRandom(), -1);
    DataInputStream dataInputStream = new DataInputStream(paramInputStream);
    this.N = dataInputStream.readInt();
    this.q = dataInputStream.readInt();
    this.df = dataInputStream.readInt();
    this.df1 = dataInputStream.readInt();
    this.df2 = dataInputStream.readInt();
    this.df3 = dataInputStream.readInt();
    this.db = dataInputStream.readInt();
    this.dm0 = dataInputStream.readInt();
    this.c = dataInputStream.readInt();
    this.minCallsR = dataInputStream.readInt();
    this.minCallsMask = dataInputStream.readInt();
    this.hashSeed = dataInputStream.readBoolean();
    this.oid = new byte[3];
    dataInputStream.readFully(this.oid);
    this.sparse = dataInputStream.readBoolean();
    this.fastFp = dataInputStream.readBoolean();
    this.polyType = dataInputStream.read();
    String str = dataInputStream.readUTF();
    if ("SHA-512".equals(str)) {
      this.hashAlg = (Digest)new SHA512Digest();
    } else if ("SHA-256".equals(str)) {
      this.hashAlg = (Digest)new SHA256Digest();
    } 
    init();
  }
  
  public NTRUEncryptionParameters getEncryptionParameters() {
    return (this.polyType == 0) ? new NTRUEncryptionParameters(this.N, this.q, this.df, this.dm0, this.db, this.c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, DigestFactory.cloneDigest(this.hashAlg)) : new NTRUEncryptionParameters(this.N, this.q, this.df1, this.df2, this.df3, this.dm0, this.db, this.c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, DigestFactory.cloneDigest(this.hashAlg));
  }
  
  public NTRUEncryptionKeyGenerationParameters clone() {
    return (this.polyType == 0) ? new NTRUEncryptionKeyGenerationParameters(this.N, this.q, this.df, this.dm0, this.db, this.c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, DigestFactory.cloneDigest(this.hashAlg)) : new NTRUEncryptionKeyGenerationParameters(this.N, this.q, this.df1, this.df2, this.df3, this.dm0, this.db, this.c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, DigestFactory.cloneDigest(this.hashAlg));
  }
  
  public int getMaxMessageLength() {
    return this.maxMsgLenBytes;
  }
  
  public void writeTo(OutputStream paramOutputStream) throws IOException {
    DataOutputStream dataOutputStream = new DataOutputStream(paramOutputStream);
    dataOutputStream.writeInt(this.N);
    dataOutputStream.writeInt(this.q);
    dataOutputStream.writeInt(this.df);
    dataOutputStream.writeInt(this.df1);
    dataOutputStream.writeInt(this.df2);
    dataOutputStream.writeInt(this.df3);
    dataOutputStream.writeInt(this.db);
    dataOutputStream.writeInt(this.dm0);
    dataOutputStream.writeInt(this.c);
    dataOutputStream.writeInt(this.minCallsR);
    dataOutputStream.writeInt(this.minCallsMask);
    dataOutputStream.writeBoolean(this.hashSeed);
    dataOutputStream.write(this.oid);
    dataOutputStream.writeBoolean(this.sparse);
    dataOutputStream.writeBoolean(this.fastFp);
    dataOutputStream.write(this.polyType);
    dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
  }
  
  public int hashCode() {
    null = 1;
    null = 31 * null + this.N;
    null = 31 * null + this.bufferLenBits;
    null = 31 * null + this.bufferLenTrits;
    null = 31 * null + this.c;
    null = 31 * null + this.db;
    null = 31 * null + this.df;
    null = 31 * null + this.df1;
    null = 31 * null + this.df2;
    null = 31 * null + this.df3;
    null = 31 * null + this.dg;
    null = 31 * null + this.dm0;
    null = 31 * null + this.dr;
    null = 31 * null + this.dr1;
    null = 31 * null + this.dr2;
    null = 31 * null + this.dr3;
    null = 31 * null + (this.fastFp ? 1231 : 1237);
    null = 31 * null + ((this.hashAlg == null) ? 0 : this.hashAlg.getAlgorithmName().hashCode());
    null = 31 * null + (this.hashSeed ? 1231 : 1237);
    null = 31 * null + this.llen;
    null = 31 * null + this.maxMsgLenBytes;
    null = 31 * null + this.minCallsMask;
    null = 31 * null + this.minCallsR;
    null = 31 * null + Arrays.hashCode(this.oid);
    null = 31 * null + this.pkLen;
    null = 31 * null + this.polyType;
    null = 31 * null + this.q;
    return 31 * null + (this.sparse ? 1231 : 1237);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    NTRUEncryptionKeyGenerationParameters nTRUEncryptionKeyGenerationParameters = (NTRUEncryptionKeyGenerationParameters)paramObject;
    if (this.N != nTRUEncryptionKeyGenerationParameters.N)
      return false; 
    if (this.bufferLenBits != nTRUEncryptionKeyGenerationParameters.bufferLenBits)
      return false; 
    if (this.bufferLenTrits != nTRUEncryptionKeyGenerationParameters.bufferLenTrits)
      return false; 
    if (this.c != nTRUEncryptionKeyGenerationParameters.c)
      return false; 
    if (this.db != nTRUEncryptionKeyGenerationParameters.db)
      return false; 
    if (this.df != nTRUEncryptionKeyGenerationParameters.df)
      return false; 
    if (this.df1 != nTRUEncryptionKeyGenerationParameters.df1)
      return false; 
    if (this.df2 != nTRUEncryptionKeyGenerationParameters.df2)
      return false; 
    if (this.df3 != nTRUEncryptionKeyGenerationParameters.df3)
      return false; 
    if (this.dg != nTRUEncryptionKeyGenerationParameters.dg)
      return false; 
    if (this.dm0 != nTRUEncryptionKeyGenerationParameters.dm0)
      return false; 
    if (this.dr != nTRUEncryptionKeyGenerationParameters.dr)
      return false; 
    if (this.dr1 != nTRUEncryptionKeyGenerationParameters.dr1)
      return false; 
    if (this.dr2 != nTRUEncryptionKeyGenerationParameters.dr2)
      return false; 
    if (this.dr3 != nTRUEncryptionKeyGenerationParameters.dr3)
      return false; 
    if (this.fastFp != nTRUEncryptionKeyGenerationParameters.fastFp)
      return false; 
    if (this.hashAlg == null) {
      if (nTRUEncryptionKeyGenerationParameters.hashAlg != null)
        return false; 
    } else if (!this.hashAlg.getAlgorithmName().equals(nTRUEncryptionKeyGenerationParameters.hashAlg.getAlgorithmName())) {
      return false;
    } 
    return (this.hashSeed != nTRUEncryptionKeyGenerationParameters.hashSeed) ? false : ((this.llen != nTRUEncryptionKeyGenerationParameters.llen) ? false : ((this.maxMsgLenBytes != nTRUEncryptionKeyGenerationParameters.maxMsgLenBytes) ? false : ((this.minCallsMask != nTRUEncryptionKeyGenerationParameters.minCallsMask) ? false : ((this.minCallsR != nTRUEncryptionKeyGenerationParameters.minCallsR) ? false : (!Arrays.equals(this.oid, nTRUEncryptionKeyGenerationParameters.oid) ? false : ((this.pkLen != nTRUEncryptionKeyGenerationParameters.pkLen) ? false : ((this.polyType != nTRUEncryptionKeyGenerationParameters.polyType) ? false : ((this.q != nTRUEncryptionKeyGenerationParameters.q) ? false : (!(this.sparse != nTRUEncryptionKeyGenerationParameters.sparse))))))))));
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("EncryptionParameters(N=" + this.N + " q=" + this.q);
    if (this.polyType == 0) {
      stringBuilder.append(" polyType=SIMPLE df=" + this.df);
    } else {
      stringBuilder.append(" polyType=PRODUCT df1=" + this.df1 + " df2=" + this.df2 + " df3=" + this.df3);
    } 
    stringBuilder.append(" dm0=" + this.dm0 + " db=" + this.db + " c=" + this.c + " minCallsR=" + this.minCallsR + " minCallsMask=" + this.minCallsMask + " hashSeed=" + this.hashSeed + " hashAlg=" + this.hashAlg + " oid=" + Arrays.toString(this.oid) + " sparse=" + this.sparse + ")");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\NTRUEncryptionKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */