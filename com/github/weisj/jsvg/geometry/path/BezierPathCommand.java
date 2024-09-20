package com.github.weisj.jsvg.geometry.path;

import com.github.weisj.jsvg.geometry.mesh.Bezier;
import java.awt.geom.Point2D;
import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface BezierPathCommand {
  @NotNull
  Bezier createBezier(@NotNull Point2D.Float paramFloat);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\BezierPathCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */