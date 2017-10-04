package org.firstinspires.ftc.teamcode;

@TeleOp(name = "Test" group = "Tests")
@Disabled

public class Test extends LinearOpMode {

  private ElapsedTime runtime = new ElapsedTime();

  @Override
  public void runOpMode () throws Interrupted Exception {
    telemetry.addData("Status", "Initialized");
    telemetry.update();
    
    //wait for player to click start
    waitForStart();
    
    //resets stopwatch
    runtime.reset();
    
    //runs until stop is clicked
    while (opModeIsActive()) {
      telemetry.addData("Status", "Run Time: " + runtime.toString());
      telemetry.update();
      
      idle();
    }
  }
}
