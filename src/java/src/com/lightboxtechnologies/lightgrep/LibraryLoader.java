package com.lightboxtechnologies.lightgrep;

class LibraryLoader {
  static public void init() {
    System.loadLibrary("jlightgrep");
   
    // Initializiation on the libjlightgrep side.
    Handle.init();
    ProgramHandle.init();
    ContextHandle.init();
    PatternInfo.init();

    KeyOptions.init();
    ProgramOptions.init();
  }
}
