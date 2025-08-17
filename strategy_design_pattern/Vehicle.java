package strategy_design_pattern;

public  class Vehicle {
    Drive driveObj;
    public Vehicle(Drive driveObj) {
        this.driveObj = driveObj;
    }
    public void drive(){
        driveObj.drive();
    }
}
