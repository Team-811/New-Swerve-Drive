package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.Constants;

public class Limelight extends TimedRobot{
    private static PIDController PID = new PIDController(Constants.OperatorConstants.AimPID[0], Constants.OperatorConstants.AimPID[1], Constants.OperatorConstants.AimPID[2]);


    static NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    static NetworkTableEntry tx = table.getEntry("tx");
    static NetworkTableEntry ty = table.getEntry("ty");
    static NetworkTableEntry ta = table.getEntry("ta");
    static NetworkTableEntry tv = table.getEntry("tv");
    static Boolean smartVariabke = false;

    static double x = tx.getDouble(0.0);
    static double y = ty.getDouble(0.0);
    static double area = ta.getDouble(0.0);
    static double inVision = tv.getDouble(0.0);

    public static double getX() {
        tx = table.getEntry("tx");
        x = tx.getDouble(0.0);
        return x;
    }

    public static double getY() {
        ty = table.getEntry("ty");
        y = ty.getDouble(0.0);
        return y;
    }

    public static double getA() {
        ta = table.getEntry("ta");
        area = ta.getDouble(0.0);
        return area;
    }

    public static double getV() {
        tv = table.getEntry("tv");
        inVision = tv.getDouble(0.0);
        return inVision;
    }

    /**
     * 
     * @return a calculates meters per second for the robot to rotate in order to aim at an april tag
     */
    public static double aim(){
        return PID.calculate(getX(), 0);
    }

    public static void Off() {
        NetworkTableInstance.getDefault().getTable("limelight").getEntry("ledMode").setNumber(1);
    }

    public static void On() {
        NetworkTableInstance.getDefault().getTable("limelight").getEntry("ledMode").setNumber(3);
    }

    public static void Morse() {
        if(!smartVariabke){
        smartVariabke = true;
        On();
        try {Thread.sleep(600);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(600);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(600);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(600);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(600);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(600);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(600);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(600);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(600);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(600);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(600);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(600);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        On();
        try {Thread.sleep(600);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
        Off();
        }
    }
    
}
