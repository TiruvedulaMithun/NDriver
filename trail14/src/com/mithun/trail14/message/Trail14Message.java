/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail14.message;

import java.io.*;

import javax.baja.ndriver.comm.*;
import javax.baja.ndriver.datatypes.*;
import javax.baja.ndriver.io.TypedInputStream;

/**
 * Trail14Message is super class for all trail14 messages
 *
 * @author mithun on 13 May 2025
 */
public class Trail14Message
  extends NMessage
{
  // Override for outgoing messages
//  public boolean toOutputStream(OutputStream out)
//    throws Exception
//  {
//    // Use typed stream for more readable code.
//    TypedOutputStream to = new TypedOutputStream();
//
//    to.toOutputStream(out);
//    return false;
//  }

  //   Override for incoming messages
//  public void fromInputStream(InputStream in)
//    throws Exception
//  {
//    // Use typed stream for more readable code.
//    // Note: messageFactory must have created TypedInputStream
//    TypedInputStream ti = (TypedInputStream)in;
//  }

  //   Typical overrides
//  public Object getTag() { return nullTag; }
//  public boolean isResponse() { return false; }
//  public boolean isFragmentable() { return false; }
//  public int getResponseTimeOut() { return 2500; }

//  public String toTraceString()
//  {
//    return "??";
//  }

}
