package com.fasterxml.Zb;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;

class Zo implements Externalizable {
  private String Zn;
  
  public Zo() {}
  
  Zo(String paramString) {
    this.Zn = paramString;
  }
  
  public void writeExternal(ObjectOutput paramObjectOutput) throws IOException {
    paramObjectOutput.writeUTF(this.Zn);
  }
  
  public void readExternal(ObjectInput paramObjectInput) throws IOException, ClassNotFoundException {
    this.Zn = paramObjectInput.readUTF();
  }
  
  private Object readResolve() throws ObjectStreamException {
    return Zs.Zl(this.Zn);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */