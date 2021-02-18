import java.util.*;

class TestTollBooth {
    public static void main(String [] args) {
        TollBooth booth = new TollBooth();
        Truck truck1 = new Truck(5, 12500);
        Truck truck2 = new Truck(2, 5000);
        Truck truck3 = new Truck(6, 17000);

        //collecting tolls
        booth.calculateToll(truck1);
        booth.displayData();
        booth.calculateToll(truck2);
        booth.displayData();

        //collecting receipts
        booth.ReceiptCollection();

        //another truck
        booth.calculateToll(truck2);
        booth.displayData();
    }
}


class TollBooth {
	int receiptsSinceCollection;
    int trucksSinceCollection;
    TollBooth() {
        trucksSinceCollection = 0;        
        receiptsSinceCollection = 0;
    }
    void calculateToll(Truck truck) {
        int axles = truck.getAxles();
        int totalWeight = truck.getTotalWeight();
        int tollDue = 5*axles + 10*(totalWeight/1000);  // Toll calculation
        System.out.println("Truck arrival - axles: "+axles+" total weight: "+totalWeight+" Toll due: "+tollDue);
        trucksSinceCollection = trucksSinceCollection + 1;
        receiptsSinceCollection = receiptsSinceCollection + tollDue;
    }
    void ReceiptCollection() {
        System.out.println("*** Collecting receipts ***");
        displayData();
        trucksSinceCollection = 0;      // Clear out totals
        receiptsSinceCollection = 0;
    }
    void displayData() {
        System.out.println("Totals since last collection - Receipts: "+receiptsSinceCollection+" Trucks: "+trucksSinceCollection);
    }
}

class Truck {
	int axles;
	int totalWeight;
    Truck(int axles, int totalWeight) {
        this.axles = axles;
        this.totalWeight = totalWeight;
    }
    int getAxles() 
    {	
    	return axles;
    
    }
    int getTotalWeight() 
    {
    	return totalWeight;
    }
 
}


