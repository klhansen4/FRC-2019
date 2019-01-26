/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
//  drive system constants
  public static int frontLeftMotor = 1;
  public static int frontRightMotor = 2;
  public static int rearLeftMotor = 3;
  public static int rearRightMotor = 4;
  public static int middleLeftMotor = 5;
  public static int middleRightMotor = 6;
 
  public static int chassisSRXMagEncoderLeft = 1;
  public static int chassisSRXMagEncoderRight = 2;

  public static int driverControllerAxisFrontAndBack = 1;
  public static int driverControllerAxisLeftAndRight = 4;

  public static int driverController = 0;
  public static int operatorController = 1;

  public static int usbCamera = 1;
  // Climb Jack System Constants
  public static int climbJack_talon = 7;
  public static int ClimbJackFullyRetracted = 0;
  public static int climbJackMaxExtend = 100000000; //not really lol TODO: figure out what  this number is
  public static int climbJackJogRetractedLimit = 0;
  public static int climbJackJogExtendedLimit = 100000000; //not really lol TODO: figure out what  this number is
  public static int climbJackJogExtendButton = 5;
  public static int climbJackJogRetractButton = 6;
  public static int climbJackFullyExtendButton = 7; //TODO: find out real button numbers 
  public static int climbJackFullyRetractButton =  8; //TODO: find out real button numbers
  public static int climbJackLimitSwitchExtendInput = 1;
  public static int climbJackLimitSwitchRetractInput = 2;
  public static double climbJackSpeed = 10.0;
  public static int climbJackRate = 200;
  public static int climbJackIsExtendedThreshold = 6000;



}