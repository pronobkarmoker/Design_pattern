// Concrete Observer
class ConcreteBidder implements Bidder {
    private String name;
    private int currentBid;

    public ConcreteBidder(String name) {
        this.name = name;
    }

    @Override
    public void updateBid(int newBid) {
        System.out.println(name + " has been notified of the new highest bid: " + newBid);
    }

    @Override
    public String getName() {
        return name;
    }
}
