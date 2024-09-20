package org.bouncycastle.tls;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.util.Integers;

class DeferredHash implements TlsHandshakeHash {
  protected static final int BUFFERING_HASH_LIMIT = 4;
  
  protected TlsContext context;
  
  private DigestInputBuffer buf;
  
  private Hashtable hashes;
  
  private boolean forceBuffering;
  
  private boolean sealed;
  
  DeferredHash(TlsContext paramTlsContext) {
    this.context = paramTlsContext;
    this.buf = new DigestInputBuffer();
    this.hashes = new Hashtable<>();
    this.forceBuffering = false;
    this.sealed = false;
  }
  
  public void copyBufferTo(OutputStream paramOutputStream) throws IOException {
    if (this.buf == null)
      throw new IllegalStateException("Not buffering"); 
    this.buf.copyInputTo(paramOutputStream);
  }
  
  public void forceBuffering() {
    if (this.sealed)
      throw new IllegalStateException("Too late to force buffering"); 
    this.forceBuffering = true;
  }
  
  public void notifyPRFDetermined() {
    SecurityParameters securityParameters = this.context.getSecurityParametersHandshake();
    switch (securityParameters.getPRFAlgorithm()) {
      case 0:
      case 1:
        checkTrackingHash(1);
        checkTrackingHash(2);
        return;
    } 
    checkTrackingHash(securityParameters.getPRFCryptoHashAlgorithm());
  }
  
  public void trackHashAlgorithm(int paramInt) {
    if (this.sealed)
      throw new IllegalStateException("Too late to track more hash algorithms"); 
    checkTrackingHash(paramInt);
  }
  
  public void sealHashAlgorithms() {
    if (this.sealed)
      throw new IllegalStateException("Already sealed"); 
    this.sealed = true;
    checkStopBuffering();
  }
  
  public void stopTracking() {
    SecurityParameters securityParameters = this.context.getSecurityParametersHandshake();
    Hashtable<Object, Object> hashtable = new Hashtable<>();
    switch (securityParameters.getPRFAlgorithm()) {
      case 0:
      case 1:
        cloneHash(hashtable, 1);
        cloneHash(hashtable, 2);
        break;
      default:
        cloneHash(hashtable, securityParameters.getPRFCryptoHashAlgorithm());
        break;
    } 
    this.buf = null;
    this.hashes = hashtable;
    this.forceBuffering = false;
    this.sealed = true;
  }
  
  public TlsHash forkPRFHash() {
    CombinedHash combinedHash;
    TlsHash tlsHash1;
    TlsHash tlsHash2;
    TlsHash tlsHash3;
    checkStopBuffering();
    SecurityParameters securityParameters = this.context.getSecurityParametersHandshake();
    switch (securityParameters.getPRFAlgorithm()) {
      case 0:
      case 1:
        tlsHash2 = cloneHash(1);
        tlsHash3 = cloneHash(2);
        combinedHash = new CombinedHash(this.context, tlsHash2, tlsHash3);
        break;
      default:
        tlsHash1 = cloneHash(securityParameters.getPRFCryptoHashAlgorithm());
        break;
    } 
    if (this.buf != null)
      this.buf.updateDigest(tlsHash1); 
    return tlsHash1;
  }
  
  public byte[] getFinalHash(int paramInt) {
    TlsHash tlsHash = (TlsHash)this.hashes.get(box(paramInt));
    if (tlsHash == null)
      throw new IllegalStateException("CryptoHashAlgorithm." + paramInt + " is not being tracked"); 
    checkStopBuffering();
    tlsHash = tlsHash.cloneHash();
    if (this.buf != null)
      this.buf.updateDigest(tlsHash); 
    return tlsHash.calculateHash();
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.buf != null) {
      this.buf.write(paramArrayOfbyte, paramInt1, paramInt2);
      return;
    } 
    Enumeration<TlsHash> enumeration = this.hashes.elements();
    while (enumeration.hasMoreElements()) {
      TlsHash tlsHash = enumeration.nextElement();
      tlsHash.update(paramArrayOfbyte, paramInt1, paramInt2);
    } 
  }
  
  public byte[] calculateHash() {
    throw new IllegalStateException("Use 'forkPRFHash' to get a definite hash");
  }
  
  public TlsHash cloneHash() {
    throw new IllegalStateException("attempt to clone a DeferredHash");
  }
  
  public void reset() {
    if (this.buf != null) {
      this.buf.reset();
      return;
    } 
    Enumeration<TlsHash> enumeration = this.hashes.elements();
    while (enumeration.hasMoreElements()) {
      TlsHash tlsHash = enumeration.nextElement();
      tlsHash.reset();
    } 
  }
  
  protected Integer box(int paramInt) {
    return Integers.valueOf(paramInt);
  }
  
  protected void checkStopBuffering() {
    if (!this.forceBuffering && this.sealed && this.buf != null && this.hashes.size() <= 4) {
      Enumeration<TlsHash> enumeration = this.hashes.elements();
      while (enumeration.hasMoreElements()) {
        TlsHash tlsHash = enumeration.nextElement();
        this.buf.updateDigest(tlsHash);
      } 
      this.buf = null;
    } 
  }
  
  protected void checkTrackingHash(int paramInt) {
    checkTrackingHash(box(paramInt));
  }
  
  protected void checkTrackingHash(Integer paramInteger) {
    if (!this.hashes.containsKey(paramInteger)) {
      TlsHash tlsHash = this.context.getCrypto().createHash(paramInteger.intValue());
      this.hashes.put(paramInteger, tlsHash);
    } 
  }
  
  protected TlsHash cloneHash(int paramInt) {
    return cloneHash(box(paramInt));
  }
  
  protected TlsHash cloneHash(Integer paramInteger) {
    return ((TlsHash)this.hashes.get(paramInteger)).cloneHash();
  }
  
  protected void cloneHash(Hashtable paramHashtable, int paramInt) {
    cloneHash(paramHashtable, box(paramInt));
  }
  
  protected void cloneHash(Hashtable<Integer, TlsHash> paramHashtable, Integer paramInteger) {
    TlsHash tlsHash = cloneHash(paramInteger);
    if (this.buf != null)
      this.buf.updateDigest(tlsHash); 
    paramHashtable.put(paramInteger, tlsHash);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DeferredHash.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */