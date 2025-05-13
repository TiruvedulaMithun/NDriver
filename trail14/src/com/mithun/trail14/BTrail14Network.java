/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail14;


import javax.baja.ndriver.BNNetwork;
import javax.baja.ndriver.comm.*;
import javax.baja.ndriver.comm.http.*;
import javax.baja.ndriver.datatypes.*;
import javax.baja.ndriver.discover.*;
import javax.baja.ndriver.poll.*;
import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Context;
import javax.baja.sys.Flags;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.util.Lexicon;

import com.mithun.trail14.comm.Trail14Listener;
import com.mithun.trail14.comm.BTrail14SerialCommConfig;
import com.mithun.trail14.comm.BTrail14TcpCommConfig;

/**
 * BTrail14Network models a network of devices
 *
 * @author mithun on 13 May 2025
 */
@NiagaraType
@NiagaraProperty(
  name = "pollScheduler",
  type = "BNPollScheduler",
  defaultValue = "new BNPollScheduler()"
)
@NiagaraProperty(
  name = "httpConfig",
  type = "BHttpCommConfig",
  defaultValue = "new BHttpCommConfig()"
)
@NiagaraProperty(
  name = "tcpConfig",
  type = "BTrail14TcpCommConfig",
  defaultValue = "new BTrail14TcpCommConfig()"
)
@NiagaraProperty(
  name = "udpConfig",
  type = "BUdpCommConfig",
  defaultValue = "new BUdpCommConfig()"
)
@NiagaraProperty(
  name = "serialConfig",
  type = "BTrail14SerialCommConfig",
  defaultValue = "new BTrail14SerialCommConfig()"
)
public class BTrail14Network
  extends BNNetwork
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail14.BTrail14Network(3494154172)1.0$ @*/
/* Generated Tue May 13 05:53:17 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Property "pollScheduler"

  /**
   * Slot for the {@code pollScheduler} property.
   * @see #getPollScheduler
   * @see #setPollScheduler
   */
  public static final Property pollScheduler = newProperty(0, new BNPollScheduler(), null);

  /**
   * Get the {@code pollScheduler} property.
   * @see #pollScheduler
   */
  public BNPollScheduler getPollScheduler() { return (BNPollScheduler)get(pollScheduler); }

  /**
   * Set the {@code pollScheduler} property.
   * @see #pollScheduler
   */
  public void setPollScheduler(BNPollScheduler v) { set(pollScheduler, v, null); }

  //endregion Property "pollScheduler"

  //region Property "httpConfig"

  /**
   * Slot for the {@code httpConfig} property.
   * @see #getHttpConfig
   * @see #setHttpConfig
   */
  public static final Property httpConfig = newProperty(0, new BHttpCommConfig(), null);

  /**
   * Get the {@code httpConfig} property.
   * @see #httpConfig
   */
  public BHttpCommConfig getHttpConfig() { return (BHttpCommConfig)get(httpConfig); }

  /**
   * Set the {@code httpConfig} property.
   * @see #httpConfig
   */
  public void setHttpConfig(BHttpCommConfig v) { set(httpConfig, v, null); }

  //endregion Property "httpConfig"

  //region Property "tcpConfig"

  /**
   * Slot for the {@code tcpConfig} property.
   * @see #getTcpConfig
   * @see #setTcpConfig
   */
  public static final Property tcpConfig = newProperty(0, new BTrail14TcpCommConfig(), null);

  /**
   * Get the {@code tcpConfig} property.
   * @see #tcpConfig
   */
  public BTrail14TcpCommConfig getTcpConfig() { return (BTrail14TcpCommConfig)get(tcpConfig); }

  /**
   * Set the {@code tcpConfig} property.
   * @see #tcpConfig
   */
  public void setTcpConfig(BTrail14TcpCommConfig v) { set(tcpConfig, v, null); }

  //endregion Property "tcpConfig"

  //region Property "udpConfig"

  /**
   * Slot for the {@code udpConfig} property.
   * @see #getUdpConfig
   * @see #setUdpConfig
   */
  public static final Property udpConfig = newProperty(0, new BUdpCommConfig(), null);

  /**
   * Get the {@code udpConfig} property.
   * @see #udpConfig
   */
  public BUdpCommConfig getUdpConfig() { return (BUdpCommConfig)get(udpConfig); }

  /**
   * Set the {@code udpConfig} property.
   * @see #udpConfig
   */
  public void setUdpConfig(BUdpCommConfig v) { set(udpConfig, v, null); }

  //endregion Property "udpConfig"

  //region Property "serialConfig"

  /**
   * Slot for the {@code serialConfig} property.
   * @see #getSerialConfig
   * @see #setSerialConfig
   */
  public static final Property serialConfig = newProperty(0, new BTrail14SerialCommConfig(), null);

  /**
   * Get the {@code serialConfig} property.
   * @see #serialConfig
   */
  public BTrail14SerialCommConfig getSerialConfig() { return (BTrail14SerialCommConfig)get(serialConfig); }

  /**
   * Set the {@code serialConfig} property.
   * @see #serialConfig
   */
  public void setSerialConfig(BTrail14SerialCommConfig v) { set(serialConfig, v, null); }

  //endregion Property "serialConfig"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail14Network.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  @Override
  public void started()
    throws Exception
  {
    super.started();
    getHttpConfig().setDefaultListener(new Trail14Listener(getHttpConfig()));
    getTcpConfig().setDefaultListener(new Trail14Listener(getTcpConfig()));
    getUdpConfig().setDefaultListener(new Trail14Listener(getUdpConfig()));
    getSerialConfig().setDefaultListener(new Trail14Listener(getSerialConfig()));
  }

  /**
   * Specify name for network resources.
   */
  public String getNetworkName()
  {
    return "Trail14Network";
  }

  /**
   * return device folder type
   */
  @Override
  public Type getDeviceFolderType()
  {
    return BTrail14DeviceFolder.TYPE;
  }

  /**
   * return device type
   */
  @Override
  public Type getDeviceType()
  {
    return BTrail14Device.TYPE;
  }

  /* TODO - Add license check if needed
  @Override
  public final Feature getLicenseFeature()
  {
    return Sys.getLicenseManager().getFeature("?? vendor", "?? feature");
  }
  */

  @Override
  public void changed(Property p, Context cx)
  {
    super.changed(p, cx);
    if (!isRunning())
    {
      return;
    }

    if (p == status)
    {
      // Give any comms opportunity to respond to status changes
      getHttpConfig().statusUpdate();
      getTcpConfig().statusUpdate();
      getUdpConfig().statusUpdate();
      getSerialConfig().statusUpdate();
    }
  }
////////////////////////////////////////////////////////////////
//Utilities
////////////////////////////////////////////////////////////////

  /**
   * Access the http comm stack
   */
  public HttpComm hcomm()
  {
    return (HttpComm) getHttpConfig().comm();
  }

  /**
   * Access the tcp comm stack
   */
  public NComm tcomm()
  {
    return (NComm) getTcpConfig().comm();
  }

  /**
   * Access the udp comm stack
   */
  public NComm ucomm()
  {
    return (NComm) getUdpConfig().comm();
  }

  /**
   * Access the serial comm stack
   */
  public NComm scomm()
  {
    return (NComm) getSerialConfig().comm();
  }

  public static Lexicon LEX = Lexicon.make(BTrail14Network.class);
}
