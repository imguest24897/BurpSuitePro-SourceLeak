package org.bouncycastle.oer.its.etsi102941;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class SequenceOfCtlCommand extends ASN1Object {
  private final List<CtlCommand> ctlCommands;
  
  public SequenceOfCtlCommand(List<CtlCommand> paramList) {
    this.ctlCommands = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfCtlCommand(ASN1Sequence paramASN1Sequence) {
    ArrayList<CtlCommand> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(CtlCommand.getInstance(iterator.next())); 
    this.ctlCommands = Collections.unmodifiableList(arrayList);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static SequenceOfCtlCommand getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfCtlCommand) ? (SequenceOfCtlCommand)paramObject : ((paramObject != null) ? new SequenceOfCtlCommand(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public List<CtlCommand> getCtlCommands() {
    return this.ctlCommands;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(this.ctlCommands.<ASN1Encodable>toArray(new ASN1Encodable[0]));
  }
  
  public static class Builder {
    private final List<CtlCommand> items = new ArrayList<>();
    
    public Builder addHashId8(CtlCommand... param1VarArgs) {
      this.items.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    public SequenceOfCtlCommand build() {
      return new SequenceOfCtlCommand(this.items);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\SequenceOfCtlCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */