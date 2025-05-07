/*
 * Copyright 2025 TRAIL6. All Rights Reserved.
 */

package com.trail6.trail6;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Context;
import javax.baja.sys.Flags;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.util.Lexicon;

import javax.baja.ndriver.BNNetwork;
import javax.baja.ndriver.comm.*;
import javax.baja.ndriver.comm.http.*;
import javax.baja.ndriver.datatypes.*;
import javax.baja.ndriver.discover.*;
import javax.baja.ndriver.poll.*;

import com.trail6.trail6.comm.Trail6Listener;
import com.trail6.trail6.comm.BTrail6SerialCommConfig;
import com.trail6.trail6.comm.BTrail6TcpCommConfig;

/**
 * BTrail6Network models a network of devices
 *
 * @author TRAIL6 on 07 May 2025
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
  type = "BTrail6TcpCommConfig",
  defaultValue = "new BTrail6TcpCommConfig()"
)
@NiagaraProperty(
  name = "udpConfig",
  type = "BUdpCommConfig",
  defaultValue = "new BUdpCommConfig()"
)
@NiagaraProperty(
  name = "serialConfig",
  type = "BTrail6SerialCommConfig",
  defaultValue = "new BTrail6SerialCommConfig()"
)
public class BTrail6Network
  extends BNNetwork
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.trail6.trail6.BTrail6Network(3088814459)1.0$ @*/
/* Generated Wed May 07 10:17:22 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

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
  public static final Property tcpConfig = newProperty(0, new BTrail6TcpCommConfig(), null);

  /**
   * Get the {@code tcpConfig} property.
   * @see #tcpConfig
   */
  public BTrail6TcpCommConfig getTcpConfig() { return (BTrail6TcpCommConfig)get(tcpConfig); }

  /**
   * Set the {@code tcpConfig} property.
   * @see #tcpConfig
   */
  public void setTcpConfig(BTrail6TcpCommConfig v) { set(tcpConfig, v, null); }

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
  public static final Property serialConfig = newProperty(0, new BTrail6SerialCommConfig(), null);

  /**
   * Get the {@code serialConfig} property.
   * @see #serialConfig
   */
  public BTrail6SerialCommConfig getSerialConfig() { return (BTrail6SerialCommConfig)get(serialConfig); }

  /**
   * Set the {@code serialConfig} property.
   * @see #serialConfig
   */
  public void setSerialConfig(BTrail6SerialCommConfig v) { set(serialConfig, v, null); }

  //endregion Property "serialConfig"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail6Network.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  @Override
  public void started()
    throws Exception
  {
    super.started();
    getHttpConfig().setDefaultListener(new Trail6Listener(getHttpConfig()));
    getTcpConfig().setDefaultListener(new Trail6Listener(getTcpConfig()));
    getUdpConfig().setDefaultListener(new Trail6Listener(getUdpConfig()));
    getSerialConfig().setDefaultListener(new Trail6Listener(getSerialConfig()));
  }

  /**
   * Specify name for network resources.
   */
  public String getNetworkName()
  {
    return "Trail6Network";
  }

  /**
   * return device folder type
   */
  @Override
  public Type getDeviceFolderType()
  {
    return BTrail6DeviceFolder.TYPE;
  }

  /**
   * return device type
   */
  @Override
  public Type getDeviceType()
  {
    return BTrail6Device.TYPE;
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

  public static Lexicon LEX = Lexicon.make(BTrail6Network.class);
}
