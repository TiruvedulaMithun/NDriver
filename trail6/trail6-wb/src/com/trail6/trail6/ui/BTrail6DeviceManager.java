/*
 * Copyright 2025 TRAIL6. All Rights Reserved.
 */

package com.trail6.trail6.ui;

import javax.baja.driver.ui.device.DeviceExtsColumn;
import javax.baja.sys.*;
import javax.baja.util.*;
import javax.baja.gx.*;
import javax.baja.ui.*;
import javax.baja.job.*;
import javax.baja.driver.*;
import javax.baja.workbench.mgr.*;
import javax.baja.workbench.mgr.folder.*;
import javax.baja.nre.annotations.*;

import javax.baja.ndriver.ui.device.*;
import com.tridium.util.ArrayUtil;

import com.trail6.trail6.*;
import com.trail6.trail6.learn.*;

/**
 * BTrail6DeviceManager provides the user interface to manage
 * trail6 devices on a single network.
 *
 * @author TRAIL6 on 07 May 2025
 */
@NiagaraType(
    agent = @AgentOn(types = { "trail6:Trail6DeviceExt", "trail6:Trail6DeviceFolder" })
)
public class BTrail6DeviceManager
  extends BNDeviceManager
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.trail6.trail6.ui.BTrail6DeviceManager(4128431385)1.0$ @*/
/* Generated Wed May 07 10:17:22 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail6DeviceManager.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Constructor
////////////////////////////////////////////////////////////////

  public BTrail6DeviceManager()
  {
  }

  /**
   * Gets ancestor network object.
   */
  public BTrail6Network getNetwork()
  {
    BObject owner = getCurrentValue();
    if (owner instanceof BTrail6DeviceFolder)
    {
      return (BTrail6Network) ((BTrail6DeviceFolder) owner).getNetwork();
    }
    else if (owner instanceof BTrail6Network)
    {
      return (BTrail6Network) owner;
    }
    else
    {
      return null;
    }
  }

  public void doLoadValue(BObject obj, Context cx)
  {
    super.doLoadValue(obj,cx);
    // Sets the discovery data from the pan table entries
    updateLearnData();
  }

  /**
   * This method is called by the doLoadValue method and when the learn job completes.
   */
  void updateLearnData()
  {
    BTrail6LearnDevicesJob learnJob = (BTrail6LearnDevicesJob) getLearn().getJob();
    if (learnJob != null)
    {
      getLearn().updateRoots(learnJob.getLearnedDevices().getChildren(BTrail6LearnDeviceEntry.class));
    }
  }

  public BTrail6Device[] getSelectedDevices()
  {
    if (getModel() == null || getModel().getTable() == null)
    {
      return new BTrail6Device[0];
    }
    else
    {
      BComponent[] selection = getModel().getTable().getSelectedComponents();
      BTrail6Device[] devices = new BTrail6Device[0];
      for (int i = 0; i < selection.length; i++)
      {
        if (selection[i].getType().is(BTrail6Device.TYPE))
        {
          devices = ArrayUtil.addOne(devices, (BTrail6Device) selection[i]);
        }
      }
      return devices;
    }
  }

////////////////////////////////////////////////////////////////
// Support
////////////////////////////////////////////////////////////////

  protected MgrModel makeModel()
  {
    return new Model(this);
  }

  protected MgrController makeController()
  {
    return new Controller(this);
  }

  protected MgrLearn makeLearn()
  {
    return new Learn(this);
  }

////////////////////////////////////////////////////////////////
// Model
////////////////////////////////////////////////////////////////

  class Model extends NDeviceModel
  {
    Model(BNDeviceManager manager)
    {
      super(manager);
    }

    protected MgrColumn[] makeColumns()
    {
      return cols;
    }
  }

/////////////////////////////////////////////////////////////
// Learn
//////////////////////////////////////////////////////////////

  /**
   * Override of base learn support object
   */
  class Learn extends MgrLearn
  {
    Learn(BNDeviceManager manager)
    {
      super(manager);
    }

    /**
     * This is method is called to initialize the
     * columns used for the discovery table.
     */
    protected MgrColumn[] makeColumns()
    {
      return new MgrColumn[]{
          //
          // TODO - add discovery column entries
          //
      };
    }

    public BImage getIcon(Object dis)
    {
      return stationIcon;
    }

    public MgrTypeInfo[] toTypes(Object discovery)
    {
      return MgrTypeInfo.makeArray(getNetwork().getDeviceType());
    }

    public void toRow(Object discovery, MgrEditRow row)
    {
      BTrail6LearnDeviceEntry learnEntry = (BTrail6LearnDeviceEntry) discovery;
      //
      // TODO - add code to make changes to row based on discovery object
      //
    }

    /**
     * Allows the core to ask us if a discovered item is equivalent
     * to a given pre-existing item.
     */
    public boolean isExisting(Object dis, BComponent comp)
    {
      BTrail6LearnDeviceEntry learnEntry = (BTrail6LearnDeviceEntry) dis;
      BTrail6Device d = (BTrail6Device) comp;

      //
      // TODO - add code to check if learnEntry is for specified device
      //

      return false;
    }

    /**
     * This callback is automatically invoked when the
     * current job set via {@code setJob()} completes.
     */
    public void jobComplete(BJob job)
    {
      super.jobComplete(job);
      if (job instanceof BTrail6LearnDevicesJob)
      {
        updateLearnData();
      }
    }
  }

////////////////////////////////////////////////////////////////
// Controller
////////////////////////////////////////////////////////////////

  class Controller extends NDeviceController
  {
    Controller(BNDeviceManager mgr)
    {
      super(mgr);
    }
  }

////////////////////////////////////////////////////////////////
// Attributes
////////////////////////////////////////////////////////////////

  static Lexicon lex = Lexicon.make(BTrail6DeviceManager.class);
  static BImage stationIcon = BImage.make("module://icons/x16/device.png");

  // base class columns
  MgrColumn colName         = new MgrColumn.Name();
  MgrColumn colType         = new MgrColumn.Type();
  MgrColumn colDeviceExts   = new DeviceExtsColumn(new BTrail6Device());
  MgrColumn colStatus       = new MgrColumn.Prop(BDevice.status);
  MgrColumn colEnabled      = new MgrColumn.Prop(BDevice.enabled, MgrColumn.EDITABLE | MgrColumn.UNSEEN);
  MgrColumn colHealth       = new MgrColumn.Prop(BDevice.health, 0);

  // Trail6Device specific columns
  // TODO - add custom columns definitions and include in cols[]

  MgrColumn[] cols =
  {
    colName, colType, colDeviceExts,
    colStatus, colEnabled, colHealth,
  };

}
