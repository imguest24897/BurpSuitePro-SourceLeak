package com.install4j.api.update;

import java.io.Serializable;

public interface UpdateDescriptor extends Serializable {
  UpdateDescriptorEntry[] getEntries();
  
  UpdateDescriptorEntry getPossibleUpdateEntry();
  
  String getBaseUrl();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\ap\\update\UpdateDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */