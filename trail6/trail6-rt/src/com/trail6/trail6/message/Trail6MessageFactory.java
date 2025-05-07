/*
 * Copyright 2025 TRAIL6. All Rights Reserved.
 */

package com.trail6.trail6.message;

import javax.baja.ndriver.comm.IMessageFactory;
import javax.baja.ndriver.comm.LinkMessage;
import javax.baja.ndriver.comm.NMessage;

/**
 * Trail6MessageFactory implementation of IMessageFactory.
 *
 * @author TRAIL6 on 07 May 2025
 */
public class Trail6MessageFactory
  implements IMessageFactory
{
  public Trail6MessageFactory()
  {
  }

  public NMessage makeMessage(LinkMessage lm)
    throws Exception
  {
    //
    // TODO - convert linkMessage driver specific NMessage
    return null;
  }
}
