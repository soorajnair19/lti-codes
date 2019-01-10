package com.hibernatedao.demo;

import java.util.List;


public interface BidI {
public void addBid(Bidder b);
public void delBid(Bidder b);
public void updateBid(Bidder b);
public List <Bidder > listAllBidder();

public Bidder listBidderById(int bidid);	
}
