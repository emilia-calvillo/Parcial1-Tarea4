public class House {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom[] restRoom;
    private BedRoom[] bedRoom;
    private Yard yard;

    public Kitchen getKitchen() {
        return kitchen;
    }
    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }
    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }
    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public RestRoom[] getRestRoom() {
        return restRoom;
    }
    public void setRestRoom(RestRoom[] restRoom) {
        this.restRoom = restRoom;
    }

    public BedRoom[] getBedRoom() {
        return bedRoom;
    }
    public void setBedRoom(BedRoom[] bedRoom) {
        this.bedRoom = bedRoom;
    }

    public Yard getYard() {
        return yard;
    }
    public void setYard(Yard yard) {
        this.yard = yard;
    }

    public void addRoom(RestRoom restRoom){
        //this.RestRoom.add(restRoom);
    }
    public static void addRoom(BedRoom bedRoom){
        //this.BedRoom.add(bedRoom);
    }
}