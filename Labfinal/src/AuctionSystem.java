
public class AuctionSystem {
    public static void main(String[] args) {

        Auctioneer auctioneer = new Auctioneer();


        Bidder bidder1 = new ConcreteBidder("KAKA ABIR");
        Bidder bidder2 = new ConcreteBidder("BABA SAZID");
        Bidder bidder3 = new ConcreteBidder("JETHU HASIN");


        auctioneer.registerBidder(bidder1);
        auctioneer.registerBidder(bidder2);
        auctioneer.registerBidder(bidder3);

        System.out.println("\nAuction begins!");


        auctioneer.acceptBid(bidder1, 100);
        auctioneer.acceptBid(bidder2, 150);
        auctioneer.acceptBid(bidder3, 200);
        auctioneer.acceptBid(bidder1, 250);
        auctioneer.acceptBid(bidder2, 180);

        System.out.println("\nFinal highest bid: " + auctioneer.getHighestBid() + " by " + auctioneer.getHighestBidder());
    }
}
