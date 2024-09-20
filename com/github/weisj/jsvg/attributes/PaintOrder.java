/*    */ package com.github.weisj.jsvg.attributes;
/*    */ 
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import com.github.weisj.jsvg.parser.SeparatorMode;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class PaintOrder
/*    */ {
/*    */   @NotNull
/*    */   private final Phase[] phases;
/* 32 */   public static final PaintOrder NORMAL = new PaintOrder(new Phase[] { Phase.FILL, Phase.STROKE, Phase.MARKERS });
/*    */   
/*    */   public enum Phase {
/* 35 */     FILL,
/* 36 */     STROKE,
/* 37 */     MARKERS;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public PaintOrder(@NotNull Phase... phases) {
/* 43 */     this.phases = phases;
/*    */   }
/*    */   @NotNull
/*    */   public Phase[] phases() {
/* 47 */     return this.phases;
/*    */   }
/*    */   @NotNull
/*    */   public static PaintOrder parse(@NotNull AttributeNode attributeNode) {
/* 51 */     String value = attributeNode.getValue("paint-order");
/* 52 */     AttributeParser parser = attributeNode.parser();
/*    */     
/* 54 */     if (value == null || "normal".equals(value)) return NORMAL;
/*    */     
/* 56 */     String[] rawPhases = parser.parseStringList(value, SeparatorMode.COMMA_AND_WHITESPACE);
/* 57 */     Phase[] phases = new Phase[3];
/* 58 */     int length = Math.min(phases.length, rawPhases.length);
/* 59 */     int i = 0;
/* 60 */     while (i < length) {
/* 61 */       phases[i] = parser.<Phase>parseEnum(rawPhases[i], Phase.class);
/* 62 */       if (phases[i] != null) i++; 
/*    */     } 
/* 64 */     while (i < 3) {
/*    */       
/* 66 */       phases[i] = findNextInNormalOrder(phases, i);
/* 67 */       i++;
/*    */     } 
/* 69 */     return new PaintOrder(phases);
/*    */   }
/*    */   @NotNull
/*    */   private static Phase findNextInNormalOrder(@NotNull Phase[] phases, int maxIndex) {
/* 73 */     for (Phase phase : NORMAL.phases()) {
/* 74 */       boolean found = false;
/* 75 */       for (int i = 0; i < maxIndex; i++) {
/* 76 */         if (phases[i] == phase) {
/* 77 */           found = true;
/*    */           break;
/*    */         } 
/*    */       } 
/* 81 */       if (!found) return phase; 
/*    */     } 
/* 83 */     throw new IllegalStateException();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\PaintOrder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */