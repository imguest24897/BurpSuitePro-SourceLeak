/*     */ package com.github.weisj.jsvg.parser;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class CharacterDataParser
/*     */ {
/*     */   private static final boolean DEBUG = false;
/*     */   
/*     */   private enum State
/*     */   {
/*  28 */     SEGMENT_START(false),
/*  29 */     SEGMENT_BREAK(true),
/*  30 */     WHITESPACE_AFTER_CHAR(true),
/*  31 */     WHITESPACE_AFTER_SEGMENT_BREAK(true),
/*  32 */     CHARACTER(false);
/*     */     
/*     */     private final boolean isVisualSpace;
/*     */     
/*     */     State(boolean isVisualSpace) {
/*  37 */       this.isVisualSpace = isVisualSpace;
/*     */     }
/*     */   }
/*     */   
/*  41 */   private State state = State.SEGMENT_START;
/*  42 */   private StringBuilder buffer = new StringBuilder();
/*     */   
/*     */   private char[] data;
/*     */   private int begin;
/*     */   private int end;
/*     */   
/*     */   public void append(char[] ch, int offset, int length) {
/*  49 */     if (length == 0) {
/*     */       return;
/*     */     }
/*     */     
/*  53 */     this.data = ch;
/*  54 */     this.begin = offset;
/*  55 */     this.end = offset + length;
/*     */     
/*  57 */     if (isSegmentBreak(this.data[this.begin])) {
/*  58 */       int i = trimLeadingWhiteSpace();
/*  59 */       if (this.state == State.SEGMENT_BREAK) i++; 
/*  60 */       if (this.begin > offset && i > 1) {
/*  61 */         this.begin--;
/*  62 */         this.data[this.begin] = ' ';
/*  63 */         if (this.state == State.CHARACTER || this.state == State.SEGMENT_BREAK) {
/*  64 */           this.state = State.WHITESPACE_AFTER_CHAR;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  69 */     int segmentBreaks = trimTrailingWhiteSpace();
/*  70 */     if (this.end < offset + length) {
/*  71 */       this.data[this.end] = (segmentBreaks > 0) ? '\n' : ' ';
/*  72 */       this.end++;
/*     */     } 
/*  74 */     if (this.begin >= this.end) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  79 */     this.buffer.ensureCapacity(this.buffer.length() + this.end - this.begin);
/*  80 */     appendData();
/*     */   }
/*     */   
/*     */   private void appendData() {
/*  84 */     int initialOffset = this.begin;
/*  85 */     while (this.begin < this.end) {
/*  86 */       char c = this.data[this.begin];
/*  87 */       boolean segmentBreak = isSegmentBreak(c);
/*  88 */       boolean whiteSpace = isWhitespace(c);
/*  89 */       if (!segmentBreak && !whiteSpace) {
/*  90 */         if (this.state == State.WHITESPACE_AFTER_CHAR || (this.state
/*  91 */           .isVisualSpace && this.begin > initialOffset)) {
/*  92 */           this.buffer.append(' ');
/*     */         }
/*  94 */         this.state = State.CHARACTER;
/*  95 */         this.buffer.append(c);
/*  96 */       } else if (whiteSpace) {
/*  97 */         switch (this.state) {
/*     */           case CHARACTER:
/*     */           case WHITESPACE_AFTER_CHAR:
/* 100 */             this.state = State.WHITESPACE_AFTER_CHAR;
/*     */             break;
/*     */           case SEGMENT_BREAK:
/*     */           case WHITESPACE_AFTER_SEGMENT_BREAK:
/* 104 */             this.state = State.WHITESPACE_AFTER_SEGMENT_BREAK;
/*     */             break;
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       } else {
/* 113 */         this.state = State.SEGMENT_BREAK;
/*     */       } 
/* 115 */       this.begin++;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean canFlush(boolean dueToSegmentBreak) {
/* 120 */     if (this.state == State.SEGMENT_START) return false; 
/* 121 */     return (dueToSegmentBreak || this.buffer.length() > 0);
/*     */   }
/*     */   
/*     */   public char[] flush(boolean dueToSegmentBreak) {
/* 125 */     if (dueToSegmentBreak && this.state != State.CHARACTER)
/*     */     {
/* 127 */       this.buffer.append(' ');
/*     */     }
/* 129 */     if (dueToSegmentBreak) this.state = State.SEGMENT_BREAK; 
/* 130 */     char[] ch = new char[this.buffer.length()];
/* 131 */     this.buffer.getChars(0, ch.length, ch, 0);
/*     */ 
/*     */ 
/*     */     
/* 135 */     this.buffer = new StringBuilder();
/* 136 */     return ch;
/*     */   }
/*     */   
/*     */   private int trimLeadingWhiteSpace() {
/* 140 */     int segmentBreakCount = 0;
/* 141 */     while (this.begin < this.end) {
/* 142 */       if (isSegmentBreak(this.data[this.begin])) {
/* 143 */         segmentBreakCount++;
/* 144 */         this.begin++; continue;
/* 145 */       }  if (isWhitespace(this.data[this.begin])) {
/* 146 */         this.begin++;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 151 */     return segmentBreakCount;
/*     */   }
/*     */   
/*     */   private int trimTrailingWhiteSpace() {
/* 155 */     int segmentBreakCount = 0;
/* 156 */     while (this.begin < this.end) {
/* 157 */       if (isSegmentBreak(this.data[this.end - 1])) {
/* 158 */         segmentBreakCount++;
/* 159 */         this.end--; continue;
/* 160 */       }  if (isWhitespace(this.data[this.end - 1])) {
/* 161 */         this.end--;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 166 */     return segmentBreakCount;
/*     */   }
/*     */   
/*     */   private static boolean isSegmentBreak(char c) {
/* 170 */     return (c == '\n' || c == '\r');
/*     */   }
/*     */   
/*     */   private static boolean isWhitespace(char c) {
/* 174 */     return (c == ' ' || c == '\t');
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\CharacterDataParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */