package com.sp.beans;

public class TravelAgent {

	
	// 0 - parameter constructor
		public TravelAgent() {
			System.out.println("TravelAgent.TravelAgent(): 0-param constructor");
		}

	
	TourPlan tp3;
	//getter method
//		public TourPlan getTp() {
//			return tp;
//		}

	// setter method for doing setter injection
		public void setTp3(TourPlan tp3) {
			this.tp3= tp3;
		}

	

	// 1 -param constructor to do constructor injection
	public TravelAgent(TourPlan tp) {
		this.tp3 = tp3;
	}

	

	// toString( )
		@Override
	public String toString() {
		return "TravelAgent [tp3=" + tp3 + "]";
	}

}
