public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }
    
    @Override
    public String sing() {
        return "Screech!";
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println(getName() + " takes off in the sky. %n");
        }
    }

    @Override
    public void glide() {
        if (this.flying && this.altitude != 0) {
            System.out.println("glides into the air. %n");
        }
    }

        /**
     * fly downward
     * @param meters altitude increase
     * @return altitude
     */
    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.printf(this.getName() + " flys downward, altitude : " + this.altitude +"%n");
        }
        return this.altitude;
    }

    /**
     * fly upward
     * @param meters altitude decrease
     * @return altitude
     */
    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf(getName() + " flies upward, altitude : " + this.altitude +"%n");
        }
        return this.altitude;
    }

    /**
     * land on the flour, must be not to height
     */
    @Override
    public void land() {
        if (this.flying && this.altitude == 0) {
            System.out.printf(this.getName() + " lands on the ground. %n");
        } else {
            System.out.printf(this.getName() + " is too high, it can't land %n");
        }
    }
}
