package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.util.ElapsedTime;

@Autonomous(name = "Square" group = "Tests")
//@Disabled

public class Square extends LinearOpMode {

  private ElapsedTime runtime = new ElapsedTime();
  
  DcMotor leftMotor;
  DcMotor rightMotor;
  
  double power = 0.5;

  @Override
  public void runOpMode () throws Interrupted Exception {
    telemetry.addData("Status", "Initialized");
    telemetry.update();
    
    leftMotor = hardwareMap.dcMotor.get("Left_Motor");
    rightMotor = hardwareMap.dcMotor.get("Right_Motor");
    
    leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    
    //wait for player to click start
    waitForStart();
    
    //resets stopwatch
    runtime.reset();
    
    for (int i = 0; i < 4; i++) {
      leftMotor.setPower(power);
      rightMotor.setPower(power);
      sleep(2000);
      leftMotor.setPower(0.0);
      rightMotor.setPower(power);
      sleep(4000);
    }
    
    leftMotor.setPower(0.0);
    rightMotor.setPower(0.0);
    
    //runs until stop is clicked
    /*while (opModeIsActive()) {
      telemetry.addData("Status", "Run Time: " + runtime.toString());
      telemetry.update();
      
      idle();
    }*/
  }
}
