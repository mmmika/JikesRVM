/*
 *  This file is part of the Jikes RVM project (http://jikesrvm.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License. You
 *  may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  See the COPYRIGHT.txt file distributed with this work for information
 *  regarding copyright ownership.
 */
package org.jikesrvm.compilers.opt.runtimesupport.ia32;

import static org.jikesrvm.ia32.RegisterConstants.NUM_GPRS;

/**
 * This interface holds constants for the Opt GC map code specific to IA32
 */
public final class OptGCMapIteratorConstants {

  // NOTE: The following two constants seem to imply that registers
  //       that can hold references are contiguous.  This is not true,
  //       in general, however, for the GC map code we only need to make
  //       sure that all such registers are included in the range defined
  //       below these contants.

  /*
   * The index of the first nonvolatile register that may hold a reference,
   */
  public static final int FIRST_GCMAP_REG = 0;

  /*
   * the index of last register that may hold a reference
   */
  public static final int LAST_GCMAP_REG = NUM_GPRS - 1;

  private OptGCMapIteratorConstants() {
    // prevent instantiation
  }

}
