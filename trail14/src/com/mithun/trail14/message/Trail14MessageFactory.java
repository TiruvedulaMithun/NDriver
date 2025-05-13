/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail14.message;

import javax.baja.ndriver.comm.IMessageFactory;
import javax.baja.ndriver.comm.LinkMessage;
import javax.baja.ndriver.comm.NMessage;

/**
 * Trail14MessageFactory implementation of IMessageFactory.
 *
 * @author mithun on 13 May 2025
 */
public class Trail14MessageFactory
  implements IMessageFactory
{
  public Trail14MessageFactory()
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
