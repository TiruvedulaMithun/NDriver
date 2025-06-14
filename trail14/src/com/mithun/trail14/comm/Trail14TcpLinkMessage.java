/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail14.comm;

import java.io.InputStream;

import javax.baja.ndriver.comm.LinkMessage;

/**
 * Trail14TcpLinkMessage streams data to and from a byte array representation.
 *
 * @author mithun on 13 May 2025
 */
public class Trail14TcpLinkMessage
  extends LinkMessage
{
  public Trail14TcpLinkMessage(int maxLen)
  {
    super(maxLen);
  }

  /**
   * Get byte data from inputStream.
   * @return true if complete message received
   */
  public boolean receive(InputStream in)
    throws Exception
  {
    //
    // TODO add code to detect beginning and end of message in serial stream.
    //
    // read characters from stream
    // after start byte detected write following bytes to buffer[] until
    //  end of message
    return false;
  }

////////////////////////////////////////////////////////////////
// Handle outgoing messages
////////////////////////////////////////////////////////////////

// TODO customize handling of outgoing messages if needed
//  /** Translate data from app message to link message representation */
//  public boolean setMessage(NMessage msg)
//    throws Exception
//  {
//
//  }
}
