/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.re.easymodbus.exceptions;

/**
 *
 * @author Stefan Roßmann
 */
@SuppressWarnings("serial")
public class SerialPortException extends de.re.easymodbus.exceptions.ModbusException
{
  public SerialPortException()
  {
  }

  public SerialPortException( String s )
  {
    super( s );
  }
}


