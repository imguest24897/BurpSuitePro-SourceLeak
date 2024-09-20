package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;

interface CMSReadable {
  InputStream getInputStream() throws IOException, CMSException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSReadable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */