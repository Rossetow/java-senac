class ParkingSystem {

    private int bigSlot;
    private int mediumSlot;
    private int smallSlot;

    public ParkingSystem(int big, int medium, int small) {
        this.bigSlot = big;
        this.mediumSlot = medium;
        this.smallSlot = small;
    }
    
    public boolean addCar(int carType) {
        switch (carType){
            case 1: 
                if(this.bigSlot>0){
                    this.bigSlot -=1;
                    return true;
                }
                return false;

            case 2: 
                if(this.mediumSlot>0){
                    this.mediumSlot -=1;
                    return true;
                }
                return false;
            
            case 3: 
                if(this.smallSlot >0){
                    this.smallSlot -=1;
                    return true;
                }
                return false;
        }

        return false;
    }
}