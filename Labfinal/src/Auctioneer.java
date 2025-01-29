import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
class Auctioneer {
    private List<Bidder> bidders = new ArrayList<>();
    private int highestBid;
    private Bidder highestBidder;


    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
        System.out.println(bidder.getName() + " has registered for the auction.");
    }


    public void removeBidder(Bidder bidder) {
        bidders.remove(bidder);
        System.out.println(bidder.getName() + " has left the auction.");
    }

    private void notifyBidders() {
        for (Bidder bidder : bidders) {
            bidder.updateBid(highestBid);
        }
    }


    public void acceptBid(Bidder bidder, int bidAmount) {
        if (bidAmount > highestBid) {
            highestBid = bidAmount;
            highestBidder = bidder;
            System.out.println("\nNew highest bid: " + bidAmount + " by " + bidder.getName());
            notifyBidders();
        } else {
            System.out.println(bidder.getName() + " bid " + bidAmount + " but it's lower than the highest bid.");
        }
    }


    public String getHighestBidder() {
        return highestBidder != null ? highestBidder.getName() : "No bids yet";
    }


    public int getHighestBid() {
        return highestBid;
    }
}
