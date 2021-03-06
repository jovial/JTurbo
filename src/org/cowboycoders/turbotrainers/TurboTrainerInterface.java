/*
*    Copyright (c) 2013, Will Szumski
*    Copyright (c) 2013, Doug Szumski
*
*    This file is part of Cyclismo.
*
*    Cyclismo is free software: you can redistribute it and/or modify
*    it under the terms of the GNU General Public License as published by
*    the Free Software Foundation, either version 3 of the License, or
*    (at your option) any later version.
*
*    Cyclismo is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU General Public License for more details.
*
*    You should have received a copy of the GNU General Public License
*    along with Cyclismo.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.cowboycoders.turbotrainers;

import java.util.concurrent.TimeoutException;

public interface TurboTrainerInterface {

  public abstract void registerDataListener(TurboTrainerDataListener listener);

  public abstract void unregisterDataListener(TurboTrainerDataListener listener);

  public abstract boolean supportsSpeed();

  public abstract boolean supportsPower();

  public abstract boolean supportsCadence();

  public abstract boolean supportsHeartRate();

  public abstract void setSlope(double gradient);
  
  public abstract double getSlope();

  public abstract void start() throws TurboCommunicationException, InterruptedException, TimeoutException;

  public abstract void stop() throws InterruptedException, TimeoutException;
  
  //void registerExceptionHandler(ExceptionHandler handler);
  
  //void unregisterExceptionHandler(ExceptionHandler handler);

}