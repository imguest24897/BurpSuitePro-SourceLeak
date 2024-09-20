package com.github.weisj.jsvg.parser;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FunctionalInterface
public interface ResourceLoader {
  @Nullable
  UIFuture<BufferedImage> loadImage(@NotNull URI paramURI) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\ResourceLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */