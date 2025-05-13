/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail14.comm;

import javax.baja.ndriver.comm.ICommListener;
import javax.baja.ndriver.comm.NMessage;
import javax.baja.ndriver.datatypes.BCommConfig;

/**
 * Trail14Listener processes unsolicited messages.
 *
 * @author mithun on 13 May 2025
 */
public class Trail14Listener
  implements ICommListener
{
  /**
   * Constructor
   */
  public Trail14Listener(BCommConfig ccfg)
  {
  }

  /**
   * Customized to process the unsolicited message for this driver.
   *
   * @param nMsg message received from device
   */
  public void receiveMessage(NMessage nMsg)
  {
    // TODO
  }
}
