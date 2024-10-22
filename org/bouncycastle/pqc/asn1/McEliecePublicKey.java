package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

public class McEliecePublicKey extends ASN1Object {
  private final int n;
  
  private final int t;
  
  private final GF2Matrix g;
  
  public McEliecePublicKey(int paramInt1, int paramInt2, GF2Matrix paramGF2Matrix) {
    this.n = paramInt1;
    this.t = paramInt2;
    this.g = new GF2Matrix(paramGF2Matrix);
  }
  
  private McEliecePublicKey(ASN1Sequence paramASN1Sequence) {
    this.n = ((ASN1Integer)paramASN1Sequence.getObjectAt(0)).intValueExact();
    this.t = ((ASN1Integer)paramASN1Sequence.getObjectAt(1)).intValueExact();
    this.g = new GF2Matrix(((ASN1OctetString)paramASN1Sequence.getObjectAt(2)).getOctets());
  }
  
  public int getN() {
    return this.n;
  }
  
  public int getT() {
    return this.t;
  }
  
  public GF2Matrix getG() {
    return new GF2Matrix(this.g);
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)new ASN1Integer(this.n));
    aSN1EncodableVector.add((ASN1Encodable)new ASN1Integer(this.t));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.g.getEncoded()));
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public static McEliecePublicKey getInstance(Object paramObject) {
    return (paramObject instanceof McEliecePublicKey) ? (McEliecePublicKey)paramObject : ((paramObject != null) ? new McEliecePublicKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\asn1\McEliecePublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */