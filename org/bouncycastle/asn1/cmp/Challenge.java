package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;

public class Challenge extends ASN1Object {
  private final AlgorithmIdentifier owf;
  
  private final ASN1OctetString witness;
  
  private final ASN1OctetString challenge;
  
  private Challenge(ASN1Sequence paramASN1Sequence) {
    byte b = 0;
    if (paramASN1Sequence.size() == 3) {
      this.owf = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(b++));
    } else {
      this.owf = null;
    } 
    this.witness = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(b++));
    this.challenge = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(b));
  }
  
  public Challenge(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this(null, paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public Challenge(AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.owf = paramAlgorithmIdentifier;
    this.witness = (ASN1OctetString)new DEROctetString(paramArrayOfbyte1);
    this.challenge = (ASN1OctetString)new DEROctetString(paramArrayOfbyte2);
  }
  
  public static Challenge getInstance(Object paramObject) {
    return (paramObject instanceof Challenge) ? (Challenge)paramObject : ((paramObject != null) ? new Challenge(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public AlgorithmIdentifier getOwf() {
    return this.owf;
  }
  
  public byte[] getWitness() {
    return this.witness.getOctets();
  }
  
  public byte[] getChallenge() {
    return this.challenge.getOctets();
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    addOptional(aSN1EncodableVector, (ASN1Encodable)this.owf);
    aSN1EncodableVector.add((ASN1Encodable)this.witness);
    aSN1EncodableVector.add((ASN1Encodable)this.challenge);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  private void addOptional(ASN1EncodableVector paramASN1EncodableVector, ASN1Encodable paramASN1Encodable) {
    if (paramASN1Encodable != null)
      paramASN1EncodableVector.add(paramASN1Encodable); 
  }
  
  public static class Rand extends ASN1Object {
    private final ASN1Integer _int;
    
    private final GeneralName sender;
    
    public Rand(ASN1Integer param1ASN1Integer, GeneralName param1GeneralName) {
      this._int = param1ASN1Integer;
      this.sender = param1GeneralName;
    }
    
    public Rand(ASN1Sequence param1ASN1Sequence) {
      if (param1ASN1Sequence.size() != 2)
        throw new IllegalArgumentException("expected sequence size of 2"); 
      this._int = ASN1Integer.getInstance(param1ASN1Sequence.getObjectAt(0));
      this.sender = GeneralName.getInstance(param1ASN1Sequence.getObjectAt(1));
    }
    
    public static Rand getInstance(Object param1Object) {
      return (param1Object instanceof Rand) ? (Rand)param1Object : ((param1Object != null) ? new Rand(ASN1Sequence.getInstance(param1Object)) : null);
    }
    
    public ASN1Integer getInt() {
      return this._int;
    }
    
    public GeneralName getSender() {
      return this.sender;
    }
    
    public ASN1Primitive toASN1Primitive() {
      return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this._int, (ASN1Encodable)this.sender });
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\Challenge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */