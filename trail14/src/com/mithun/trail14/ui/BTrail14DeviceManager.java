/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail14.ui;

import java.util.ArrayList;

import javax.baja.sys.*;
import javax.baja.util.*;
import javax.baja.gx.*;
import javax.baja.ui.*;
import javax.baja.job.*;
import javax.baja.driver.*;
import javax.baja.workbench.mgr.*;
import javax.baja.workbench.mgr.folder.*;
import javax.baja.ndriver.ui.device.*;
import javax.baja.driver.ui.device.DeviceExtsColumn;
import javax.baja.nre.annotations.*;


import com.tridium.util.ArrayUtil;

import com.mithun.trail14.*;
import com.mithun.trail14.learn.*;

/**
 * BTrail14DeviceManager provides the user interface to manage
 * trail14 devices on a single network.
 *
 * @author mithun on 13 May 2025
 */
@NiagaraType(
    agent = @AgentOn(types = { "trail14:Trail14DeviceExt", "trail14:Trail14DeviceFolder" })
)
public class BTrail14DeviceManager
  extends BNDeviceManager
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail14.ui.BTrail14DeviceManager(3376313597)1.0$ @*/
/* Generated Tue May 13 05:53:18 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail14DeviceManager.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Constructor
////////////////////////////////////////////////////////////////

  public BTrail14DeviceManager()
  {
  }

  /**
   * Gets ancestor network object.
   */
  public BTrail14Network getNetwork()
  {
    BObject owner = getCurrentValue();
    if (owner instanceof BTrail14DeviceFolder)
    {
      return (BTrail14Network) ((BTrail14DeviceFolder) owner).getNetwork();
    }
    else if (owner instanceof BTrail14Network)
    {
      return (BTrail14Network) owner;
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
    BTrail14LearnDevicesJob learnJob = (BTrail14LearnDevicesJob) getLearn().getJob();
    if (learnJob != null)
    {
      getLearn().updateRoots(learnJob.getLearnedDevices().getChildren(BTrail14LearnDeviceEntry.class));
    }
  }

  public BTrail14Device[] getSelectedDevices()
  {
    if (getModel() == null || getModel().getTable() == null)
    {
      return new BTrail14Device[0];
    }
    else
    {
      BComponent[] selection = getModel().getTable().getSelectedComponents();
      ArrayList<BTrail14Device> devicesList = new ArrayList<>();
      for (int i = 0; i < selection.length; i++) {
        if (selection[i].getType().is(BTrail14Device.TYPE)) {
          devicesList.add((BTrail14Device) selection[i]);
        }
      }
      BTrail14Device[] devices = new BTrail14Device[devicesList.size()];
      devices = devicesList.toArray(devices);
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
      BTrail14LearnDeviceEntry learnEntry = (BTrail14LearnDeviceEntry) discovery;
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
      BTrail14LearnDeviceEntry learnEntry = (BTrail14LearnDeviceEntry) dis;
      BTrail14Device d = (BTrail14Device) comp;

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
      if (job instanceof BTrail14LearnDevicesJob)
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

  static Lexicon lex = Lexicon.make(BTrail14DeviceManager.class);
  static BImage stationIcon = BImage.make("module://icons/x16/device.png");

  // base class columns
  MgrColumn colName         = new MgrColumn.Name();
  MgrColumn colType         = new MgrColumn.Type();
  MgrColumn colDeviceExts   = new DeviceExtsColumn(new BTrail14Device());
  MgrColumn colStatus       = new MgrColumn.Prop(BDevice.status);
  MgrColumn colEnabled      = new MgrColumn.Prop(BDevice.enabled, MgrColumn.EDITABLE | MgrColumn.UNSEEN);
  MgrColumn colHealth       = new MgrColumn.Prop(BDevice.health, 0);

  // Trail14Device specific columns
  // TODO - add custom columns definitions and include in cols[]

  MgrColumn[] cols =
  {
    colName, colType, colDeviceExts,
    colStatus, colEnabled, colHealth,
  };

}
