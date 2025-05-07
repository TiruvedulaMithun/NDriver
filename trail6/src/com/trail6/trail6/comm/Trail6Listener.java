/*
 * Copyright 2025 TRAIL6. All Rights Reserved.
 */

package com.trail6.trail6.comm;

import javax.baja.ndriver.comm.ICommListener;
import javax.baja.ndriver.comm.NMessage;
import javax.baja.ndriver.datatypes.BCommConfig;

/**
 * Trail6Listener processes unsolicited messages.
 *
 * @author TRAIL6 on 07 May 2025
 */
public class Trail6Listener
  implements ICommListener
{
  /**
   * Constructor
   */
  public Trail6Listener(BCommConfig ccfg)
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
