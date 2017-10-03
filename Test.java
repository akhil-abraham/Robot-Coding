package org.firstinspires.ftc.teamcode;

@TeleOp(name = "Test" group = "Tests")
@Disabled

public class Test extends LinearOpMode {

  private ElapsedTime runtime = new ElapsedTime();

  @Override
  public void runOpMode () throws Interrupted Exception {
    telemetry.addData("Status", "Initialized");
    telemetry.update();
    
    waitForStart();
    runtime.reset();
    
    while (opModeIsActive()) {
      telemetry.addData("Status", "Runtime: ");
    }
  }
}
